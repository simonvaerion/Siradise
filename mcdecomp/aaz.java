/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.VisibleForTesting
 */
import org.jetbrains.annotations.VisibleForTesting;

public class aaz {
    private static final double a = 4096.0;
    private eei b = eei.b;

    @VisibleForTesting
    static long a(double $$0) {
        return Math.round($$0 * 4096.0);
    }

    @VisibleForTesting
    static double a(long $$0) {
        return (double)$$0 / 4096.0;
    }

    public eei a(long $$0, long $$1, long $$2) {
        if ($$0 == 0L && $$1 == 0L && $$2 == 0L) {
            return this.b;
        }
        double $$3 = $$0 == 0L ? this.b.c : aaz.a(aaz.a(this.b.c) + $$0);
        double $$4 = $$1 == 0L ? this.b.d : aaz.a(aaz.a(this.b.d) + $$1);
        double $$5 = $$2 == 0L ? this.b.e : aaz.a(aaz.a(this.b.e) + $$2);
        return new eei($$3, $$4, $$5);
    }

    public long a(eei $$0) {
        return aaz.a($$0.c) - aaz.a(this.b.c);
    }

    public long b(eei $$0) {
        return aaz.a($$0.d) - aaz.a(this.b.d);
    }

    public long c(eei $$0) {
        return aaz.a($$0.e) - aaz.a(this.b.e);
    }

    public eei d(eei $$0) {
        return $$0.d(this.b);
    }

    public void e(eei $$0) {
        this.b = $$0;
    }
}

