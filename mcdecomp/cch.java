/*
 * Decompiled with CFR 0.152.
 */
public class cch
extends cbf {
    private static final int o = 1;
    private static final int p = 1;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 3;
    public static final int n = 100;
    private final bdq q;
    private final cbp r;

    public cch(int $$0) {
        this($$0, new bee(1), new ccw(1));
    }

    public cch(int $$0, bdq $$1, cbp $$2) {
        super(cck.q, $$0);
        cch.a($$1, 1);
        cch.a($$2, 1);
        this.q = $$1;
        this.r = $$2;
        this.a(new ccx($$1, 0, 0, 0){

            @Override
            public void d() {
                super.d();
                cch.this.a(this.d);
            }
        });
        this.a($$2);
    }

    @Override
    public boolean b(byo $$0, int $$1) {
        if ($$1 >= 100) {
            int $$2 = $$1 - 100;
            this.a(0, $$2);
            return true;
        }
        switch ($$1) {
            case 2: {
                int $$3 = this.r.a(0);
                this.a(0, $$3 + 1);
                return true;
            }
            case 1: {
                int $$4 = this.r.a(0);
                this.a(0, $$4 - 1);
                return true;
            }
            case 3: {
                if (!$$0.fZ()) {
                    return false;
                }
                cfz $$5 = this.q.b(0);
                this.q.e();
                if (!$$0.fN().e($$5)) {
                    $$0.a($$5, false);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public cfz a(byo $$0, int $$1) {
        return cfz.b;
    }

    @Override
    public void a(int $$0, int $$1) {
        super.a($$0, $$1);
        this.d();
    }

    @Override
    public boolean a(byo $$0) {
        return this.q.a($$0);
    }

    public cfz l() {
        return this.q.a(0);
    }

    public int m() {
        return this.r.a(0);
    }
}

