/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JComponent;
import javax.swing.Timer;
import net.minecraft.server.MinecraftServer;

public class ahm
extends JComponent {
    private static final DecimalFormat a = ac.a(new DecimalFormat("########0.000"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));
    private final int[] b = new int[256];
    private int c;
    private final String[] d = new String[11];
    private final MinecraftServer e;
    private final Timer f;

    public ahm(MinecraftServer $$02) {
        this.e = $$02;
        this.setPreferredSize(new Dimension(456, 246));
        this.setMinimumSize(new Dimension(456, 246));
        this.setMaximumSize(new Dimension(456, 246));
        this.f = new Timer(500, $$0 -> this.b());
        this.f.start();
        this.setBackground(Color.BLACK);
    }

    private void b() {
        long $$0 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        this.d[0] = "Memory use: " + $$0 / 1024L / 1024L + " mb (" + Runtime.getRuntime().freeMemory() * 100L / Runtime.getRuntime().maxMemory() + "% free)";
        this.d[1] = "Avg tick: " + a.format(this.a(this.e.k) * 1.0E-6) + " ms";
        this.b[this.c++ & 0xFF] = (int)($$0 * 100L / Runtime.getRuntime().maxMemory());
        this.repaint();
    }

    private double a(long[] $$0) {
        long $$1 = 0L;
        for (long $$2 : $$0) {
            $$1 += $$2;
        }
        return (double)$$1 / (double)$$0.length;
    }

    @Override
    public void paint(Graphics $$0) {
        $$0.setColor(new Color(0xFFFFFF));
        $$0.fillRect(0, 0, 456, 246);
        for (int $$1 = 0; $$1 < 256; ++$$1) {
            int $$2 = this.b[$$1 + this.c & 0xFF];
            $$0.setColor(new Color($$2 + 28 << 16));
            $$0.fillRect($$1, 100 - $$2, 1, $$2);
        }
        $$0.setColor(Color.BLACK);
        for (int $$3 = 0; $$3 < this.d.length; ++$$3) {
            String $$4 = this.d[$$3];
            if ($$4 == null) continue;
            $$0.drawString($$4, 32, 116 + $$3 * 16);
        }
    }

    public void a() {
        this.f.stop();
    }
}

