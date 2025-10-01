/*
 * Decompiled with CFR 0.152.
 */
public class fgu
extends fgv<ip> {
    protected fgu(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ip $$7, fih $$8) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
    }

    public static class a
    implements fhp<ip> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(ip $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            return new fgu($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0, this.a);
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((ip)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

