/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Arrays;
import javax.annotation.Nullable;

public class ded {
    public static final int a = 16;
    public static final int b = 128;
    public static final int c = 2048;
    private static final int e = 4;
    @Nullable
    protected byte[] d;
    private int f;

    public ded() {
        this(0);
    }

    public ded(int $$0) {
        this.f = $$0;
    }

    public ded(byte[] $$0) {
        this.d = $$0;
        this.f = 0;
        if ($$0.length != 2048) {
            throw ac.b(new IllegalArgumentException("DataLayer should be 2048 bytes not: " + $$0.length));
        }
    }

    public int a(int $$0, int $$1, int $$2) {
        return this.d(ded.b($$0, $$1, $$2));
    }

    public void a(int $$0, int $$1, int $$2, int $$3) {
        this.a(ded.b($$0, $$1, $$2), $$3);
    }

    private static int b(int $$0, int $$1, int $$2) {
        return $$1 << 8 | $$2 << 4 | $$0;
    }

    private int d(int $$0) {
        if (this.d == null) {
            return this.f;
        }
        int $$1 = ded.f($$0);
        int $$2 = ded.e($$0);
        return this.d[$$1] >> 4 * $$2 & 0xF;
    }

    private void a(int $$0, int $$1) {
        byte[] $$2 = this.a();
        int $$3 = ded.f($$0);
        int $$4 = ded.e($$0);
        int $$5 = ~(15 << 4 * $$4);
        int $$6 = ($$1 & 0xF) << 4 * $$4;
        $$2[$$3] = (byte)($$2[$$3] & $$5 | $$6);
    }

    private static int e(int $$0) {
        return $$0 & 1;
    }

    private static int f(int $$0) {
        return $$0 >> 1;
    }

    public void a(int $$0) {
        this.f = $$0;
        this.d = null;
    }

    private static byte g(int $$0) {
        byte $$1 = (byte)$$0;
        for (int $$2 = 4; $$2 < 8; $$2 += 4) {
            $$1 = (byte)($$1 | $$0 << $$2);
        }
        return $$1;
    }

    public byte[] a() {
        if (this.d == null) {
            this.d = new byte[2048];
            if (this.f != 0) {
                Arrays.fill(this.d, ded.g(this.f));
            }
        }
        return this.d;
    }

    public ded b() {
        if (this.d == null) {
            return new ded(this.f);
        }
        return new ded((byte[])this.d.clone());
    }

    public String toString() {
        StringBuilder $$0 = new StringBuilder();
        for (int $$1 = 0; $$1 < 4096; ++$$1) {
            $$0.append(Integer.toHexString(this.d($$1)));
            if (($$1 & 0xF) == 15) {
                $$0.append("\n");
            }
            if (($$1 & 0xFF) != 255) continue;
            $$0.append("\n");
        }
        return $$0.toString();
    }

    @aqa
    public String b(int $$0) {
        StringBuilder $$1 = new StringBuilder();
        for (int $$2 = 0; $$2 < 256; ++$$2) {
            $$1.append(Integer.toHexString(this.d($$2)));
            if (($$2 & 0xF) != 15) continue;
            $$1.append("\n");
        }
        return $$1.toString();
    }

    public boolean c() {
        return this.d == null;
    }

    public boolean c(int $$0) {
        return this.d == null && this.f == $$0;
    }

    public boolean d() {
        return this.d == null && this.f == 0;
    }
}

