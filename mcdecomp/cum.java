/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  javax.annotation.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import javax.annotation.Nullable;

public class cum {
    public static final e[] a = new e[]{e.a, e.b, e.c};
    private final b b;

    public cum(cul $$0) {
        this(new a($$0));
    }

    public cum(b $$0) {
        this.b = $$0;
    }

    public boolean a(dcb $$0, cls $$1, gu $$2, ha $$3) {
        return ha.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, (ha)$$4, this.b::a).isPresent());
    }

    public Optional<c> a(dcb $$0, cmn $$12, gu $$2, apf $$3) {
        return ha.a($$3).stream().filter($$1 -> this.b.b($$0, (ha)$$1)).map($$4 -> this.a($$0, $$12, $$2, (ha)$$4, $$3, false)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
    }

    public long a(dcb $$0, cmn $$12, gu $$2, boolean $$3) {
        return ha.a().filter($$1 -> this.b.b($$0, (ha)$$1)).map($$4 -> this.a($$0, $$12, $$2, (ha)$$4, $$3)).reduce(0L, Long::sum);
    }

    public Optional<c> a(dcb $$0, cmn $$1, gu $$2, ha $$3, apf $$4, boolean $$52) {
        return ha.a($$4).stream().map($$5 -> this.a($$0, $$1, $$2, $$3, (ha)$$5, $$52)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
    }

    private long a(dcb $$0, cmn $$1, gu $$2, ha $$3, boolean $$4) {
        return ha.a().map($$5 -> this.a($$0, $$1, $$2, $$3, (ha)$$5, $$4)).filter(Optional::isPresent).count();
    }

    @VisibleForTesting
    public Optional<c> a(dcb $$0, cmn $$1, gu $$22, ha $$3, ha $$4, boolean $$5) {
        return this.a($$0, (cls)$$1, $$22, $$3, $$4, this.b::a).flatMap($$2 -> this.a($$1, (c)$$2, $$5));
    }

    public Optional<c> a(dcb $$0, cls $$1, gu $$2, ha $$3, ha $$4, d $$5) {
        if ($$4.o() == $$3.o()) {
            return Optional.empty();
        }
        if (!(this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4))) {
            return Optional.empty();
        }
        for (e $$6 : this.b.a()) {
            c $$7 = $$6.a($$2, $$4, $$3);
            if (!$$5.test($$1, $$2, $$7)) continue;
            return Optional.of($$7);
        }
        return Optional.empty();
    }

    public Optional<c> a(cmn $$0, c $$1, boolean $$2) {
        dcb $$3 = $$0.a_($$1.a());
        if (this.b.a($$0, $$1, $$3, $$2)) {
            return Optional.of($$1);
        }
        return Optional.empty();
    }

    public static class a
    implements b {
        protected cul a;

        public a(cul $$0) {
            this.a = $$0;
        }

        @Override
        @Nullable
        public dcb a(dcb $$0, cls $$1, gu $$2, ha $$3) {
            return this.a.c($$0, $$1, $$2, $$3);
        }

        protected boolean a(cls $$0, gu $$1, gu $$2, ha $$3, dcb $$4) {
            return $$4.i() || $$4.a(this.a) || $$4.a(cpo.G) && $$4.u().b();
        }

        @Override
        public boolean a(cls $$0, gu $$1, c $$2) {
            dcb $$3 = $$0.a_($$2.a());
            return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
        }
    }

    public static interface b {
        @Nullable
        public dcb a(dcb var1, cls var2, gu var3, ha var4);

        public boolean a(cls var1, gu var2, c var3);

        default public e[] a() {
            return a;
        }

        default public boolean a(dcb $$0, ha $$1) {
            return cul.a($$0, $$1);
        }

        default public boolean a(dcb $$0) {
            return false;
        }

        default public boolean b(dcb $$0, ha $$1) {
            return this.a($$0) || this.a($$0, $$1);
        }

        default public boolean a(cmn $$0, c $$1, dcb $$2, boolean $$3) {
            dcb $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
            if ($$4 != null) {
                if ($$3) {
                    $$0.x($$1.a()).e($$1.a());
                }
                return $$0.a($$1.a(), $$4, 2);
            }
            return false;
        }
    }

    @FunctionalInterface
    public static interface d {
        public boolean test(cls var1, gu var2, c var3);
    }

    /*
     * Uses 'sealed' constructs - enablewith --sealed true
     */
    public static abstract class e
    extends Enum<e> {
        public static final /* enum */ e a = new e(){

            @Override
            public c a(gu $$0, ha $$1, ha $$2) {
                return new c($$0, $$1);
            }
        };
        public static final /* enum */ e b = new e(){

            @Override
            public c a(gu $$0, ha $$1, ha $$2) {
                return new c($$0.a($$1), $$2);
            }
        };
        public static final /* enum */ e c = new e(){

            @Override
            public c a(gu $$0, ha $$1, ha $$2) {
                return new c($$0.a($$1).a($$2), $$1.g());
            }
        };
        private static final /* synthetic */ e[] d;

        public static e[] values() {
            return (e[])d.clone();
        }

        public static e valueOf(String $$0) {
            return Enum.valueOf(e.class, $$0);
        }

        public abstract c a(gu var1, ha var2, ha var3);

        private static /* synthetic */ e[] a() {
            return new e[]{a, b, c};
        }

        static {
            d = e.a();
        }
    }

    public record c(gu a, ha b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "pos;face", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "pos;face", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "pos;face", "a", "b"}, this, $$0);
        }
    }
}

