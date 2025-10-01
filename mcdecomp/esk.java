/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class esk
extends esd {
    private final b c;
    private final List<a> d = new ArrayList<a>();
    private final esj e = esj.i();

    public esk(int $$0, int $$1, b $$2) {
        this(0, 0, $$0, $$1, $$2);
    }

    public esk(int $$0, int $$1, int $$2, int $$3, b $$4) {
        super($$0, $$1, $$2, $$3);
        this.c = $$4;
    }

    @Override
    public void c() {
        super.c();
        if (this.d.isEmpty()) {
            return;
        }
        int $$0 = 0;
        int $$1 = this.c.b(this);
        for (a $$2 : this.d) {
            $$0 += this.c.a($$2);
            $$1 = Math.max($$1, this.c.b($$2));
        }
        int $$3 = this.c.a(this) - $$0;
        int $$4 = this.c.c(this);
        Iterator<a> $$5 = this.d.iterator();
        a $$6 = $$5.next();
        this.c.a($$6, $$4);
        $$4 += this.c.a($$6);
        if (this.d.size() >= 2) {
            c $$7 = new c($$3, this.d.size() - 1);
            while ($$7.hasNext()) {
                a $$8 = $$5.next();
                this.c.a($$8, $$4 += $$7.nextInt());
                $$4 += this.c.a($$8);
            }
        }
        int $$9 = this.c.d(this);
        for (a $$10 : this.d) {
            this.c.a($$10, $$9, $$1);
        }
        switch (this.c) {
            case a: {
                this.b = $$1;
                break;
            }
            case b: {
                this.a = $$1;
            }
        }
    }

    @Override
    public void b(Consumer<esi> $$0) {
        this.d.forEach($$1 -> $$0.accept($$1.a));
    }

    public esj a() {
        return this.e.g();
    }

    public esj b() {
        return this.e;
    }

    public <T extends esi> T a(T $$0) {
        return this.a($$0, this.a());
    }

    public <T extends esi> T a(T $$0, esj $$1) {
        this.d.add(new a($$0, $$1));
        return $$0;
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

        int a(esi $$0) {
            return switch (this) {
                default -> throw new IncompatibleClassChangeError();
                case a -> $$0.k();
                case b -> $$0.h();
            };
        }

        int a(a $$0) {
            return switch (this) {
                default -> throw new IncompatibleClassChangeError();
                case a -> $$0.b();
                case b -> $$0.a();
            };
        }

        int b(esi $$0) {
            return switch (this) {
                default -> throw new IncompatibleClassChangeError();
                case a -> $$0.h();
                case b -> $$0.k();
            };
        }

        int b(a $$0) {
            return switch (this) {
                default -> throw new IncompatibleClassChangeError();
                case a -> $$0.a();
                case b -> $$0.b();
            };
        }

        void a(a $$0, int $$1) {
            switch (this) {
                case a: {
                    $$0.a($$1, $$0.b());
                    break;
                }
                case b: {
                    $$0.b($$1, $$0.a());
                }
            }
        }

        void a(a $$0, int $$1, int $$2) {
            switch (this) {
                case a: {
                    $$0.b($$1, $$2);
                    break;
                }
                case b: {
                    $$0.a($$1, $$2);
                }
            }
        }

        int c(esi $$0) {
            return switch (this) {
                default -> throw new IncompatibleClassChangeError();
                case a -> $$0.p();
                case b -> $$0.r();
            };
        }

        int d(esi $$0) {
            return switch (this) {
                default -> throw new IncompatibleClassChangeError();
                case a -> $$0.r();
                case b -> $$0.p();
            };
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b};
        }

        static {
            c = esk$b.a();
        }
    }

    static class a
    extends esd.a {
        protected a(esi $$0, esj $$1) {
            super($$0, $$1);
        }
    }
}

