/*
 * Decompiled with CFR 0.152.
 */
public class ebz
extends ecb {
    ebz(eck[] $$0) {
        super($$0, ecm.b($$0));
    }

    @Override
    public ecl b() {
        return ecm.b;
    }

    public static a a(eck.a ... $$0) {
        return new a($$0);
    }

    public static class a
    extends ecb.a {
        public a(eck.a ... $$0) {
            super($$0);
        }

        @Override
        public a or(eck.a $$0) {
            this.a($$0);
            return this;
        }

        @Override
        protected eck a(eck[] $$0) {
            return new ebz($$0);
        }
    }

    public static class b
    extends ecb.b<ebz> {
        protected ebz a(eck[] $$0) {
            return new ebz($$0);
        }

        @Override
        protected /* synthetic */ ecb b(eck[] eckArray) {
            return this.a(eckArray);
        }
    }
}

