/*
 * Decompiled with CFR 0.152.
 */
public class fgj
extends fim {
    fgj(few $$0, double $$1, double $$2, double $$3, dcb $$4) {
        super($$0, $$1, $$2, $$3);
        this.a(enn.N().am().a().a($$4));
        this.u = 0.0f;
        this.t = 80;
        this.n = false;
    }

    @Override
    public fhq b() {
        return fhq.a;
    }

    @Override
    public float b(float $$0) {
        return 0.5f;
    }

    public static class a
    implements fhp<in> {
        public fhm a(in $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            return new fgj($$1, $$2, $$3, $$4, $$0.c());
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((in)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

