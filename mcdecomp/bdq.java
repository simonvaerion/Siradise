/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;
import java.util.function.Predicate;

public interface bdq
extends bdo {
    public static final int m_ = 64;
    public static final int n_ = 8;

    public int b();

    public boolean ab_();

    public cfz a(int var1);

    public cfz a(int var1, int var2);

    public cfz b(int var1);

    public void a(int var1, cfz var2);

    default public int ac_() {
        return 64;
    }

    public void e();

    public boolean a(byo var1);

    default public void d_(byo $$0) {
    }

    default public void c(byo $$0) {
    }

    default public boolean b(int $$0, cfz $$1) {
        return true;
    }

    default public boolean a(bdq $$0, int $$1, cfz $$2) {
        return true;
    }

    default public int a_(cfu $$0) {
        int $$1 = 0;
        for (int $$2 = 0; $$2 < this.b(); ++$$2) {
            cfz $$3 = this.a($$2);
            if (!$$3.d().equals($$0)) continue;
            $$1 += $$3.L();
        }
        return $$1;
    }

    default public boolean a(Set<cfu> $$0) {
        return this.a_((cfz $$1) -> !$$1.b() && $$0.contains($$1.d()));
    }

    default public boolean a_(Predicate<cfz> $$0) {
        for (int $$1 = 0; $$1 < this.b(); ++$$1) {
            cfz $$2 = this.a($$1);
            if (!$$0.test($$2)) continue;
            return true;
        }
        return false;
    }

    public static boolean a(czn $$0, byo $$1) {
        return bdq.a($$0, $$1, 8);
    }

    public static boolean a(czn $$0, byo $$1, int $$2) {
        cmm $$3 = $$0.k();
        gu $$4 = $$0.p();
        if ($$3 == null) {
            return false;
        }
        if ($$3.c_($$4) != $$0) {
            return false;
        }
        return $$1.i((double)$$4.u() + 0.5, (double)$$4.v() + 0.5, (double)$$4.w() + 0.5) <= (double)($$2 * $$2);
    }
}

