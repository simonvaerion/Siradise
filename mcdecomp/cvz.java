/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;

public final class cvz
extends Enum<cvz>
implements apr {
    public static final /* enum */ cvz a = new cvz("none", h.a);
    public static final /* enum */ cvz b = new cvz("clockwise_90", h.u);
    public static final /* enum */ cvz c = new cvz("180", h.c);
    public static final /* enum */ cvz d = new cvz("counterclockwise_90", h.v);
    public static final Codec<cvz> e;
    private final String f;
    private final h g;
    private static final /* synthetic */ cvz[] h;

    public static cvz[] values() {
        return (cvz[])h.clone();
    }

    public static cvz valueOf(String $$0) {
        return Enum.valueOf(cvz.class, $$0);
    }

    private cvz(String $$0, h $$1) {
        this.f = $$0;
        this.g = $$1;
    }

    public cvz a(cvz $$0) {
        switch ($$0) {
            case c: {
                switch (this) {
                    case a: {
                        return c;
                    }
                    case b: {
                        return d;
                    }
                    case c: {
                        return a;
                    }
                    case d: {
                        return b;
                    }
                }
            }
            case d: {
                switch (this) {
                    case a: {
                        return d;
                    }
                    case b: {
                        return a;
                    }
                    case c: {
                        return b;
                    }
                    case d: {
                        return c;
                    }
                }
            }
            case b: {
                switch (this) {
                    case a: {
                        return b;
                    }
                    case b: {
                        return c;
                    }
                    case c: {
                        return d;
                    }
                    case d: {
                        return a;
                    }
                }
            }
        }
        return this;
    }

    public h a() {
        return this.g;
    }

    public ha a(ha $$0) {
        if ($$0.o() == ha.a.b) {
            return $$0;
        }
        switch (this) {
            case c: {
                return $$0.g();
            }
            case d: {
                return $$0.i();
            }
            case b: {
                return $$0.h();
            }
        }
        return $$0;
    }

    public int a(int $$0, int $$1) {
        switch (this) {
            case c: {
                return ($$0 + $$1 / 2) % $$1;
            }
            case d: {
                return ($$0 + $$1 * 3 / 4) % $$1;
            }
            case b: {
                return ($$0 + $$1 / 4) % $$1;
            }
        }
        return $$0;
    }

    public static cvz a(apf $$0) {
        return ac.a(cvz.values(), $$0);
    }

    public static List<cvz> b(apf $$0) {
        return ac.b(cvz.values(), $$0);
    }

    @Override
    public String c() {
        return this.f;
    }

    private static /* synthetic */ cvz[] b() {
        return new cvz[]{a, b, c, d};
    }

    static {
        h = cvz.b();
        e = apr.a(cvz::values);
    }
}

