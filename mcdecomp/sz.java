/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.StringUtils
 */
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class sz {
    public static final Codec<sz> a = apr.a(a::values).dispatch(sz::c, a::a);
    public static final sz b = new sz(new BitSet(0), sz$a.b);
    public static final sz c = new sz(new BitSet(0), sz$a.a);
    public static final ts d = ts.a.a(n.i).a(new tb(tb.a.a, sw.c("chat.filtered")));
    static final Codec<sz> e = Codec.unit((Object)c);
    static final Codec<sz> f = Codec.unit((Object)b);
    static final Codec<sz> g = aoi.r.xmap(sz::new, sz::d);
    private static final char h = '#';
    private final BitSet i;
    private final a j;

    private sz(BitSet $$0, a $$1) {
        this.i = $$0;
        this.j = $$1;
    }

    private sz(BitSet $$0) {
        this.i = $$0;
        this.j = sz$a.c;
    }

    public sz(int $$0) {
        this(new BitSet($$0), sz$a.c);
    }

    private a c() {
        return this.j;
    }

    private BitSet d() {
        return this.i;
    }

    public static sz a(sf $$0) {
        a $$1 = $$0.b(a.class);
        return switch ($$1) {
            default -> throw new IncompatibleClassChangeError();
            case sz$a.a -> c;
            case sz$a.b -> b;
            case sz$a.c -> new sz($$0.y(), sz$a.c);
        };
    }

    public static void a(sf $$0, sz $$1) {
        $$0.a($$1.j);
        if ($$1.j == sz$a.c) {
            $$0.a($$1.i);
        }
    }

    public void a(int $$0) {
        this.i.set($$0);
    }

    @Nullable
    public String a(String $$0) {
        return switch (this.j) {
            default -> throw new IncompatibleClassChangeError();
            case sz$a.b -> null;
            case sz$a.a -> $$0;
            case sz$a.c -> {
                char[] $$1 = $$0.toCharArray();
                for (int $$2 = 0; $$2 < $$1.length && $$2 < this.i.length(); ++$$2) {
                    if (!this.i.get($$2)) continue;
                    $$1[$$2] = 35;
                }
                yield new String($$1);
            }
        };
    }

    @Nullable
    public sw b(String $$0) {
        return switch (this.j) {
            default -> throw new IncompatibleClassChangeError();
            case sz$a.b -> null;
            case sz$a.a -> sw.b($$0);
            case sz$a.c -> {
                tj $$1 = sw.h();
                int $$2 = 0;
                boolean $$3 = this.i.get(0);
                while (true) {
                    int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
                    int v1 = $$4 = $$4 < 0 ? $$0.length() : $$4;
                    if ($$4 == $$2) break;
                    if ($$3) {
                        $$1.b(sw.b(StringUtils.repeat((char)'#', (int)($$4 - $$2))).c(d));
                    } else {
                        $$1.f($$0.substring($$2, $$4));
                    }
                    $$3 = !$$3;
                    $$2 = $$4;
                }
                yield $$1;
            }
        };
    }

    public boolean a() {
        return this.j == sz$a.a;
    }

    public boolean b() {
        return this.j == sz$a.b;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        sz $$1 = (sz)$$0;
        return this.i.equals($$1.i) && this.j == $$1.j;
    }

    public int hashCode() {
        int $$0 = this.i.hashCode();
        $$0 = 31 * $$0 + this.j.hashCode();
        return $$0;
    }

    static final class a
    extends Enum<a>
    implements apr {
        public static final /* enum */ a a = new a("pass_through", () -> e);
        public static final /* enum */ a b = new a("fully_filtered", () -> f);
        public static final /* enum */ a c = new a("partially_filtered", () -> g);
        private final String d;
        private final Supplier<Codec<sz>> e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, Supplier<Codec<sz>> $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        @Override
        public String c() {
            return this.d;
        }

        private Codec<sz> a() {
            return this.e.get();
        }

        private static /* synthetic */ a[] f() {
            return new a[]{a, b, c};
        }

        static {
            f = sz$a.f();
        }
    }
}

