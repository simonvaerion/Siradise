/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntComparator
 */
import it.unimi.dsi.fastutil.ints.IntComparator;

public final class esx
extends Enum<esx> {
    public static final /* enum */ esx a = new esx();
    public static final /* enum */ esx b = new esx();
    public static final /* enum */ esx c = new esx();
    public static final /* enum */ esx d = new esx();
    private final IntComparator e = ($$0, $$1) -> $$0 == $$1 ? 0 : (this.b($$0, $$1) ? -1 : 1);
    private static final /* synthetic */ esx[] f;

    public static esx[] values() {
        return (esx[])f.clone();
    }

    public static esx valueOf(String $$0) {
        return Enum.valueOf(esx.class, $$0);
    }

    public esw a() {
        return switch (this) {
            default -> throw new IncompatibleClassChangeError();
            case a, b -> esw.b;
            case c, d -> esw.a;
        };
    }

    public esx b() {
        return switch (this) {
            default -> throw new IncompatibleClassChangeError();
            case a -> b;
            case b -> a;
            case c -> d;
            case d -> c;
        };
    }

    public boolean c() {
        return switch (this) {
            default -> throw new IncompatibleClassChangeError();
            case a, c -> false;
            case b, d -> true;
        };
    }

    public boolean a(int $$0, int $$1) {
        if (this.c()) {
            return $$0 > $$1;
        }
        return $$1 > $$0;
    }

    public boolean b(int $$0, int $$1) {
        if (this.c()) {
            return $$0 < $$1;
        }
        return $$1 < $$0;
    }

    public IntComparator d() {
        return this.e;
    }

    private static /* synthetic */ esx[] e() {
        return new esx[]{a, b, c, d};
    }

    static {
        f = esx.e();
    }
}

