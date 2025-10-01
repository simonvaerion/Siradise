/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  javax.annotation.Nullable
 *  org.joml.Matrix4f
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 */
import com.google.common.collect.Iterators;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector4f;

public final class ha
extends Enum<ha>
implements apr {
    public static final /* enum */ ha a = new ha(0, 1, -1, "down", ha$b.b, ha$a.b, new hz(0, -1, 0));
    public static final /* enum */ ha b = new ha(1, 0, -1, "up", ha$b.a, ha$a.b, new hz(0, 1, 0));
    public static final /* enum */ ha c = new ha(2, 3, 2, "north", ha$b.b, ha$a.c, new hz(0, 0, -1));
    public static final /* enum */ ha d = new ha(3, 2, 0, "south", ha$b.a, ha$a.c, new hz(0, 0, 1));
    public static final /* enum */ ha e = new ha(4, 5, 1, "west", ha$b.b, ha$a.a, new hz(-1, 0, 0));
    public static final /* enum */ ha f = new ha(5, 4, 3, "east", ha$b.a, ha$a.a, new hz(1, 0, 0));
    public static final apr.a<ha> g;
    public static final Codec<ha> h;
    private final int i;
    private final int j;
    private final int k;
    private final String l;
    private final a m;
    private final b n;
    private final hz o;
    private static final ha[] p;
    private static final ha[] q;
    private static final ha[] r;
    private static final /* synthetic */ ha[] s;

    public static ha[] values() {
        return (ha[])s.clone();
    }

    public static ha valueOf(String $$0) {
        return Enum.valueOf(ha.class, $$0);
    }

    private ha(int $$0, int $$1, int $$2, String $$3, b $$4, a $$5, hz $$6) {
        this.i = $$0;
        this.k = $$2;
        this.j = $$1;
        this.l = $$3;
        this.m = $$5;
        this.n = $$4;
        this.o = $$6;
    }

    public static ha[] a(bfj $$0) {
        ha $$17;
        float $$1 = $$0.g(1.0f) * ((float)Math.PI / 180);
        float $$2 = -$$0.h(1.0f) * ((float)Math.PI / 180);
        float $$3 = apa.a($$1);
        float $$4 = apa.b($$1);
        float $$5 = apa.a($$2);
        float $$6 = apa.b($$2);
        boolean $$7 = $$5 > 0.0f;
        boolean $$8 = $$3 < 0.0f;
        boolean $$9 = $$6 > 0.0f;
        float $$10 = $$7 ? $$5 : -$$5;
        float $$11 = $$8 ? -$$3 : $$3;
        float $$12 = $$9 ? $$6 : -$$6;
        float $$13 = $$10 * $$4;
        float $$14 = $$12 * $$4;
        ha $$15 = $$7 ? f : e;
        ha $$16 = $$8 ? b : a;
        ha ha2 = $$17 = $$9 ? d : c;
        if ($$10 > $$12) {
            if ($$11 > $$13) {
                return ha.a($$16, $$15, $$17);
            }
            if ($$14 > $$11) {
                return ha.a($$15, $$17, $$16);
            }
            return ha.a($$15, $$16, $$17);
        }
        if ($$11 > $$14) {
            return ha.a($$16, $$17, $$15);
        }
        if ($$13 > $$11) {
            return ha.a($$17, $$15, $$16);
        }
        return ha.a($$17, $$16, $$15);
    }

    private static ha[] a(ha $$0, ha $$1, ha $$2) {
        return new ha[]{$$0, $$1, $$2, $$2.g(), $$1.g(), $$0.g()};
    }

    public static ha a(Matrix4f $$0, ha $$1) {
        hz $$2 = $$1.q();
        Vector4f $$3 = $$0.transform(new Vector4f((float)$$2.u(), (float)$$2.v(), (float)$$2.w(), 0.0f));
        return ha.a($$3.x(), $$3.y(), $$3.z());
    }

    public static Collection<ha> a(apf $$0) {
        return ac.b(ha.values(), $$0);
    }

    public static Stream<ha> a() {
        return Stream.of(p);
    }

    public Quaternionf b() {
        return switch (this) {
            default -> throw new IncompatibleClassChangeError();
            case a -> new Quaternionf().rotationX((float)Math.PI);
            case b -> new Quaternionf();
            case c -> new Quaternionf().rotationXYZ(1.5707964f, 0.0f, (float)Math.PI);
            case d -> new Quaternionf().rotationX(1.5707964f);
            case e -> new Quaternionf().rotationXYZ(1.5707964f, 0.0f, 1.5707964f);
            case f -> new Quaternionf().rotationXYZ(1.5707964f, 0.0f, -1.5707964f);
        };
    }

    public int d() {
        return this.i;
    }

    public int e() {
        return this.k;
    }

    public b f() {
        return this.n;
    }

    public static ha a(bfj $$0, a $$1) {
        return switch ($$1) {
            default -> throw new IncompatibleClassChangeError();
            case ha$a.a -> {
                if (f.a($$0.h(1.0f))) {
                    yield f;
                }
                yield e;
            }
            case ha$a.c -> {
                if (d.a($$0.h(1.0f))) {
                    yield d;
                }
                yield c;
            }
            case ha$a.b -> $$0.g(1.0f) < 0.0f ? b : a;
        };
    }

    public ha g() {
        return ha.a(this.j);
    }

    public ha a(a $$0) {
        return switch ($$0) {
            default -> throw new IncompatibleClassChangeError();
            case ha$a.a -> {
                if (this == e || this == f) {
                    yield this;
                }
                yield this.r();
            }
            case ha$a.b -> {
                if (this == b || this == a) {
                    yield this;
                }
                yield this.h();
            }
            case ha$a.c -> this == c || this == d ? this : this.t();
        };
    }

    public ha b(a $$0) {
        return switch ($$0) {
            default -> throw new IncompatibleClassChangeError();
            case ha$a.a -> {
                if (this == e || this == f) {
                    yield this;
                }
                yield this.s();
            }
            case ha$a.b -> {
                if (this == b || this == a) {
                    yield this;
                }
                yield this.i();
            }
            case ha$a.c -> this == c || this == d ? this : this.u();
        };
    }

    public ha h() {
        return switch (this) {
            case c -> f;
            case f -> d;
            case d -> e;
            case e -> c;
            default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
        };
    }

    private ha r() {
        return switch (this) {
            case b -> c;
            case c -> a;
            case a -> d;
            case d -> b;
            default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
        };
    }

    private ha s() {
        return switch (this) {
            case b -> d;
            case d -> a;
            case a -> c;
            case c -> b;
            default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
        };
    }

    private ha t() {
        return switch (this) {
            case b -> f;
            case f -> a;
            case a -> e;
            case e -> b;
            default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
        };
    }

    private ha u() {
        return switch (this) {
            case b -> e;
            case e -> a;
            case a -> f;
            case f -> b;
            default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
        };
    }

    public ha i() {
        return switch (this) {
            case c -> e;
            case f -> c;
            case d -> f;
            case e -> d;
            default -> throw new IllegalStateException("Unable to get CCW facing of " + this);
        };
    }

    public int j() {
        return this.o.u();
    }

    public int k() {
        return this.o.v();
    }

    public int l() {
        return this.o.w();
    }

    public Vector3f m() {
        return new Vector3f((float)this.j(), (float)this.k(), (float)this.l());
    }

    public String n() {
        return this.l;
    }

    public a o() {
        return this.m;
    }

    @Nullable
    public static ha a(@Nullable String $$0) {
        return g.a($$0);
    }

    public static ha a(int $$0) {
        return q[apa.a($$0 % q.length)];
    }

    public static ha b(int $$0) {
        return r[apa.a($$0 % r.length)];
    }

    @Nullable
    public static ha a(int $$0, int $$1, int $$2) {
        if ($$0 == 0) {
            if ($$1 == 0) {
                if ($$2 > 0) {
                    return d;
                }
                if ($$2 < 0) {
                    return c;
                }
            } else if ($$2 == 0) {
                if ($$1 > 0) {
                    return b;
                }
                return a;
            }
        } else if ($$1 == 0 && $$2 == 0) {
            if ($$0 > 0) {
                return f;
            }
            return e;
        }
        return null;
    }

    public static ha a(double $$0) {
        return ha.b(apa.a($$0 / 90.0 + 0.5) & 3);
    }

    public static ha a(a $$0, b $$1) {
        return switch ($$0) {
            default -> throw new IncompatibleClassChangeError();
            case ha$a.a -> {
                if ($$1 == ha$b.a) {
                    yield f;
                }
                yield e;
            }
            case ha$a.b -> {
                if ($$1 == ha$b.a) {
                    yield b;
                }
                yield a;
            }
            case ha$a.c -> $$1 == ha$b.a ? d : c;
        };
    }

    public float p() {
        return (this.k & 3) * 90;
    }

    public static ha b(apf $$0) {
        return ac.a(p, $$0);
    }

    public static ha a(double $$0, double $$1, double $$2) {
        return ha.a((float)$$0, (float)$$1, (float)$$2);
    }

    public static ha a(float $$0, float $$1, float $$2) {
        ha $$3 = c;
        float $$4 = Float.MIN_VALUE;
        for (ha $$5 : p) {
            float $$6 = $$0 * (float)$$5.o.u() + $$1 * (float)$$5.o.v() + $$2 * (float)$$5.o.w();
            if (!($$6 > $$4)) continue;
            $$4 = $$6;
            $$3 = $$5;
        }
        return $$3;
    }

    public String toString() {
        return this.l;
    }

    @Override
    public String c() {
        return this.l;
    }

    private static DataResult<ha> a(ha $$0) {
        return $$0.o().b() ? DataResult.success((Object)$$0) : DataResult.error(() -> "Expected a vertical direction");
    }

    public static ha a(b $$0, a $$1) {
        for (ha $$2 : p) {
            if ($$2.f() != $$0 || $$2.o() != $$1) continue;
            return $$2;
        }
        throw new IllegalArgumentException("No such direction: " + $$0 + " " + $$1);
    }

    public hz q() {
        return this.o;
    }

    public boolean a(float $$0) {
        float $$1 = $$0 * ((float)Math.PI / 180);
        float $$2 = -apa.a($$1);
        float $$3 = apa.b($$1);
        return (float)this.o.u() * $$2 + (float)this.o.w() * $$3 > 0.0f;
    }

    private static /* synthetic */ ha[] w() {
        return new ha[]{a, b, c, d, e, f};
    }

    static {
        s = ha.w();
        g = apr.a(ha::values);
        h = aoi.a(g, ha::a);
        p = ha.values();
        q = (ha[])Arrays.stream(p).sorted(Comparator.comparingInt($$0 -> $$0.i)).toArray(ha[]::new);
        r = (ha[])Arrays.stream(p).filter($$0 -> $$0.o().d()).sorted(Comparator.comparingInt($$0 -> $$0.k)).toArray(ha[]::new);
    }

    /*
     * Uses 'sealed' constructs - enablewith --sealed true
     */
    public static abstract class a
    extends Enum<a>
    implements apr,
    Predicate<ha> {
        public static final /* enum */ a a = new a("x"){

            @Override
            public int a(int $$0, int $$1, int $$2) {
                return $$0;
            }

            @Override
            public double a(double $$0, double $$1, double $$2) {
                return $$0;
            }

            @Override
            public /* synthetic */ boolean test(@Nullable Object object) {
                return super.a((ha)object);
            }
        };
        public static final /* enum */ a b = new a("y"){

            @Override
            public int a(int $$0, int $$1, int $$2) {
                return $$1;
            }

            @Override
            public double a(double $$0, double $$1, double $$2) {
                return $$1;
            }

            @Override
            public /* synthetic */ boolean test(@Nullable Object object) {
                return super.a((ha)object);
            }
        };
        public static final /* enum */ a c = new a("z"){

            @Override
            public int a(int $$0, int $$1, int $$2) {
                return $$2;
            }

            @Override
            public double a(double $$0, double $$1, double $$2) {
                return $$2;
            }

            @Override
            public /* synthetic */ boolean test(@Nullable Object object) {
                return super.a((ha)object);
            }
        };
        public static final a[] d;
        public static final apr.a<a> e;
        private final String f;
        private static final /* synthetic */ a[] g;

        public static a[] values() {
            return (a[])g.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        a(String $$0) {
            this.f = $$0;
        }

        @Nullable
        public static a a(String $$0) {
            return e.a($$0);
        }

        public String a() {
            return this.f;
        }

        public boolean b() {
            return this == b;
        }

        public boolean d() {
            return this == a || this == c;
        }

        public String toString() {
            return this.f;
        }

        public static a a(apf $$0) {
            return ac.a(d, $$0);
        }

        public boolean a(@Nullable ha $$0) {
            return $$0 != null && $$0.o() == this;
        }

        public c e() {
            return switch (this) {
                default -> throw new IncompatibleClassChangeError();
                case a, c -> ha$c.a;
                case b -> ha$c.b;
            };
        }

        @Override
        public String c() {
            return this.f;
        }

        public abstract int a(int var1, int var2, int var3);

        public abstract double a(double var1, double var3, double var5);

        @Override
        public /* synthetic */ boolean test(@Nullable Object object) {
            return this.a((ha)object);
        }

        private static /* synthetic */ a[] f() {
            return new a[]{a, b, c};
        }

        static {
            g = ha$a.f();
            d = ha$a.values();
            e = apr.a(a::values);
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(1, "Towards positive");
        public static final /* enum */ b b = new b(-1, "Towards negative");
        private final int c;
        private final String d;
        private static final /* synthetic */ b[] e;

        public static b[] values() {
            return (b[])e.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(int $$0, String $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        public int a() {
            return this.c;
        }

        public String b() {
            return this.d;
        }

        public String toString() {
            return this.d;
        }

        public b c() {
            return this == a ? b : a;
        }

        private static /* synthetic */ b[] d() {
            return new b[]{a, b};
        }

        static {
            e = ha$b.d();
        }
    }

    public static final class c
    extends Enum<c>
    implements Iterable<ha>,
    Predicate<ha> {
        public static final /* enum */ c a = new c(new ha[]{c, f, d, e}, new a[]{ha$a.a, ha$a.c});
        public static final /* enum */ c b = new c(new ha[]{b, a}, new a[]{ha$a.b});
        private final ha[] c;
        private final a[] d;
        private static final /* synthetic */ c[] e;

        public static c[] values() {
            return (c[])e.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private c(ha[] $$0, a[] $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        public ha a(apf $$0) {
            return ac.a(this.c, $$0);
        }

        public a b(apf $$0) {
            return ac.a(this.d, $$0);
        }

        public boolean a(@Nullable ha $$0) {
            return $$0 != null && $$0.o().e() == this;
        }

        @Override
        public Iterator<ha> iterator() {
            return Iterators.forArray((Object[])this.c);
        }

        public Stream<ha> a() {
            return Arrays.stream(this.c);
        }

        public List<ha> c(apf $$0) {
            return ac.b(this.c, $$0);
        }

        @Override
        public /* synthetic */ boolean test(@Nullable Object object) {
            return this.a((ha)object);
        }

        private static /* synthetic */ c[] b() {
            return new c[]{a, b};
        }

        static {
            e = ha$c.b();
        }
    }
}

