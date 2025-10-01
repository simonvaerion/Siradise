/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class cui
extends Enum<cui>
implements apr {
    public static final /* enum */ cui a = new cui("none", h.a);
    public static final /* enum */ cui b = new cui("left_right", h.B);
    public static final /* enum */ cui c = new cui("front_back", h.z);
    public static final Codec<cui> d;
    private final String e;
    private final sw f;
    private final h g;
    private static final /* synthetic */ cui[] h;

    public static cui[] values() {
        return (cui[])h.clone();
    }

    public static cui valueOf(String $$0) {
        return Enum.valueOf(cui.class, $$0);
    }

    private cui(String $$0, h $$1) {
        this.e = $$0;
        this.f = sw.c("mirror." + $$0);
        this.g = $$1;
    }

    public int a(int $$0, int $$1) {
        int $$2 = $$1 / 2;
        int $$3 = $$0 > $$2 ? $$0 - $$1 : $$0;
        switch (this) {
            case c: {
                return ($$1 - $$3) % $$1;
            }
            case b: {
                return ($$2 - $$3 + $$1) % $$1;
            }
        }
        return $$0;
    }

    public cvz a(ha $$0) {
        ha.a $$1 = $$0.o();
        return this == b && $$1 == ha.a.c || this == c && $$1 == ha.a.a ? cvz.c : cvz.a;
    }

    public ha b(ha $$0) {
        if (this == c && $$0.o() == ha.a.a) {
            return $$0.g();
        }
        if (this == b && $$0.o() == ha.a.c) {
            return $$0.g();
        }
        return $$0;
    }

    public h a() {
        return this.g;
    }

    public sw b() {
        return this.f;
    }

    @Override
    public String c() {
        return this.e;
    }

    private static /* synthetic */ cui[] d() {
        return new cui[]{a, b, c};
    }

    static {
        h = cui.d();
        d = apr.a(cui::values);
    }
}

