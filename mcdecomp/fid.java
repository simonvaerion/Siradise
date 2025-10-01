/*
 * Decompiled with CFR 0.152.
 */
public class fid
extends fhu {
    private final fih b;
    protected boolean a;

    fid(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fih $$7) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        this.b = $$7;
        this.d(1.5f);
        this.b($$7);
    }

    @Override
    public int a(float $$0) {
        if (this.a) {
            return 240;
        }
        return super.a($$0);
    }

    @Override
    public fhq b() {
        return fhq.c;
    }

    @Override
    public void a() {
        super.a();
        this.b(this.b);
    }

    public static class a
    implements fhp<iy> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fid $$8 = new fid($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
            $$8.e(1.0f);
            $$8.a = true;
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }

    public static class b
    implements fhp<iy> {
        private final fih a;

        public b(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fid $$8 = new fid($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
            $$8.e(1.0f);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

