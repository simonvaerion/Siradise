/*
 * Decompiled with CFR 0.152.
 */
public interface dm {
    public <T> hg<T> a(acp<? extends hr<T>> var1);

    public static dm a(final hg.b $$0, final caw $$1) {
        return new dm(){

            @Override
            public <T> hg<T> a(acp<? extends hr<T>> $$02) {
                return $$0.b($$02).a($$1);
            }
        };
    }

    public static a a(final hs $$0, final caw $$1) {
        return new a(){
            b c = b.b;

            @Override
            public void a(b $$02) {
                this.c = $$02;
            }

            @Override
            public <T> hg<T> a(acp<? extends hr<T>> $$02) {
                hr $$12 = $$0.d($$02);
                final hg.c $$2 = $$12.p();
                final hg.c $$3 = $$12.u();
                hg.c.a $$4 = new hg.c.a<T>(){

                    @Override
                    protected hg.c<T> a() {
                        return switch (c) {
                            default -> throw new IncompatibleClassChangeError();
                            case b.b -> $$2;
                            case b.a -> $$3;
                        };
                    }
                };
                return $$4.a($$1);
            }
        };
    }

    public static interface a
    extends dm {
        public void a(b var1);
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        private static final /* synthetic */ b[] c;

        public static b[] values() {
            return (b[])c.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b};
        }

        static {
            c = dm$b.a();
        }
    }
}

