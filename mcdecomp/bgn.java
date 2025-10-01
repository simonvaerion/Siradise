/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;
import java.util.Set;

public final class bgn
extends Enum<bgn> {
    public static final /* enum */ bgn a = new bgn(0);
    public static final /* enum */ bgn b = new bgn(1);
    public static final /* enum */ bgn c = new bgn(2);
    public static final /* enum */ bgn d = new bgn(3);
    public static final /* enum */ bgn e = new bgn(4);
    public static final Set<bgn> f;
    public static final Set<bgn> g;
    private final int h;
    private static final /* synthetic */ bgn[] i;

    public static bgn[] values() {
        return (bgn[])i.clone();
    }

    public static bgn valueOf(String $$0) {
        return Enum.valueOf(bgn.class, $$0);
    }

    private bgn(int $$0) {
        this.h = $$0;
    }

    private int a() {
        return 1 << this.h;
    }

    private boolean b(int $$0) {
        return ($$0 & this.a()) == this.a();
    }

    public static Set<bgn> a(int $$0) {
        EnumSet<bgn> $$1 = EnumSet.noneOf(bgn.class);
        for (bgn $$2 : bgn.values()) {
            if (!$$2.b($$0)) continue;
            $$1.add($$2);
        }
        return $$1;
    }

    public static int a(Set<bgn> $$0) {
        int $$1 = 0;
        for (bgn $$2 : $$0) {
            $$1 |= $$2.a();
        }
        return $$1;
    }

    private static /* synthetic */ bgn[] b() {
        return new bgn[]{a, b, c, d, e};
    }

    static {
        i = bgn.b();
        f = Set.of(bgn.values());
        g = Set.of(e, d);
    }
}

