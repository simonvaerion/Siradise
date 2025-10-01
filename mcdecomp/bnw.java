/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class bnw<T extends bwc & bvp>
extends bmv {
    public static final bdi a = apw.a(1, 2);
    private final T b;
    private a c = bnw$a.a;
    private final double d;
    private final float e;
    private int f;
    private int g;
    private int h;

    public bnw(T $$0, double $$1, float $$2) {
        this.b = $$0;
        this.d = $$1;
        this.e = $$2 * $$2;
        this.a(EnumSet.of(bmv.a.a, bmv.a.b));
    }

    @Override
    public boolean a() {
        return this.i() && this.h();
    }

    private boolean h() {
        return ((bfz)this.b).b(cgc.uZ);
    }

    @Override
    public boolean b() {
        return this.i() && (this.a() || !((bgb)this.b).J().l()) && this.h();
    }

    private boolean i() {
        return ((bgb)this.b).j() != null && ((bgb)this.b).j().bs();
    }

    @Override
    public void d() {
        super.d();
        ((bgb)this.b).v(false);
        ((bgb)this.b).h((bfz)null);
        this.f = 0;
        if (((bfz)this.b).fi()) {
            ((bfz)this.b).fo();
            ((bvp)this.b).b(false);
            ceh.a(((bfz)this.b).fk(), false);
        }
    }

    @Override
    public boolean K_() {
        return true;
    }

    @Override
    public void e() {
        boolean $$4;
        boolean $$2;
        bfz $$0 = ((bgb)this.b).j();
        if ($$0 == null) {
            return;
        }
        boolean $$1 = ((bgb)this.b).K().a($$0);
        boolean bl2 = $$2 = this.f > 0;
        if ($$1 != $$2) {
            this.f = 0;
        }
        this.f = $$1 ? ++this.f : --this.f;
        double $$3 = ((bfj)this.b).f($$0);
        boolean bl3 = $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
        if ($$4) {
            --this.h;
            if (this.h <= 0) {
                ((bgb)this.b).J().a((bfj)$$0, this.k() ? this.d : this.d * 0.5);
                this.h = a.a(((bfz)this.b).ec());
            }
        } else {
            this.h = 0;
            ((bgb)this.b).J().n();
        }
        ((bgb)this.b).E().a($$0, 30.0f, 30.0f);
        if (this.c == bnw$a.a) {
            if (!$$4) {
                ((bfz)this.b).c(bzh.a(this.b, cgc.uZ));
                this.c = bnw$a.b;
                ((bvp)this.b).b(true);
            }
        } else if (this.c == bnw$a.b) {
            cfz $$6;
            int $$5;
            if (!((bfz)this.b).fi()) {
                this.c = bnw$a.a;
            }
            if (($$5 = ((bfz)this.b).fm()) >= ceh.k($$6 = ((bfz)this.b).fk())) {
                ((bfz)this.b).fn();
                this.c = bnw$a.c;
                this.g = 20 + ((bfz)this.b).ec().a(20);
                ((bvp)this.b).b(false);
            }
        } else if (this.c == bnw$a.c) {
            --this.g;
            if (this.g == 0) {
                this.c = bnw$a.d;
            }
        } else if (this.c == bnw$a.d && $$1) {
            ((bwg)this.b).a($$0, 1.0f);
            cfz $$7 = ((bfz)this.b).b(bzh.a(this.b, cgc.uZ));
            ceh.a($$7, false);
            this.c = bnw$a.a;
        }
    }

    private boolean k() {
        return this.c == bnw$a.a;
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            e = bnw$a.a();
        }
    }
}

