/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.io.IOException;

public interface rk {
    public static final int d = 8;
    public static final int e = 12;
    public static final int f = 4;
    public static final int g = 28;
    public static final byte h = 0;
    public static final byte i = 1;
    public static final byte j = 2;
    public static final byte k = 3;
    public static final byte l = 4;
    public static final byte m = 5;
    public static final byte n = 6;
    public static final byte o = 7;
    public static final byte p = 8;
    public static final byte q = 9;
    public static final byte r = 10;
    public static final byte s = 11;
    public static final byte t = 12;
    public static final byte u = 99;
    public static final int v = 512;

    public void a(DataOutput var1) throws IOException;

    public String toString();

    public byte b();

    public rm<?> c();

    public rk d();

    public int a();

    default public String m_() {
        return new rj().a(this);
    }

    public void a(ro var1);

    public rh.b a(rh var1);

    default public void b(rh $$0) {
        rh.b $$1 = $$0.b(this.c());
        if ($$1 == rh.b.a) {
            this.a($$0);
        }
    }
}

