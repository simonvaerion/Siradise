/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import javax.swing.JList;
import net.minecraft.server.MinecraftServer;

public class ahl
extends JList<String> {
    private final MinecraftServer a;
    private int b;

    public ahl(MinecraftServer $$0) {
        this.a = $$0;
        $$0.b(this::a);
    }

    public void a() {
        if (this.b++ % 20 == 0) {
            Vector<String> $$0 = new Vector<String>();
            for (int $$1 = 0; $$1 < this.a.ac().t().size(); ++$$1) {
                $$0.add(this.a.ac().t().get($$1).fM().getName());
            }
            this.setListData($$0);
        }
    }
}

