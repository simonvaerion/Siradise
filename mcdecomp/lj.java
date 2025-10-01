/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 */
import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class lj {
    public static final a a = lj.a(lh::a, lg.c);
    public static final a b = lj.a(lh::a, lg.d);
    public static final a c = lj.a(lh::k, lg.i);
    public static final a d = lj.a(lh::k, lg.j);
    public static final a e = lj.a(lh::q, lg.m);
    public static final a f = lj.a(lh::l, lg.l);
    public static final a g = lj.a(lh::B, lg.n);
    public static final a h = lj.a(lh::A, lg.o);
    public static final a i = lj.a(lh::f, lg.au);
    public static final a j = lj.a(lh::g, lg.av);
    public static final a k = lj.a(lh::g, lg.aw);
    public static final a l = lj.a(lh::g, lg.ax);
    public static final a m = lj.a(lh::g, lg.ay);
    public static final a n = lj.a(lh::i, lg.aB);
    public static final a o = lj.a(lh::j, lg.az);
    public static final a p = lj.a(lh::u, lg.Y);
    public static final a q = lj.a(lh::D, lg.aQ);
    public static final a r = lj.a(lh::a, lg.ab);
    public static final a s = lj.a(lh::x, lg.bb);
    public static final a t = lj.a(lh::x, lg.bc);
    public static final a u = lj.a(lh::b, lg.bi);
    public static final a v = lj.a(lh::n, lg.i);
    public static final a w = lj.a(lh::n, lg.j);
    public static final a x = lj.a(lh::r, lg.m);
    public static final a y = lj.a(lh::s, lg.i);
    private final lh z;
    private final lf A;

    private lj(lh $$0, lf $$1) {
        this.z = $$0;
        this.A = $$1;
    }

    public lf a() {
        return this.A;
    }

    public lh b() {
        return this.z;
    }

    public lj a(Consumer<lh> $$0) {
        $$0.accept(this.z);
        return this;
    }

    public acq a(cpn $$0, BiConsumer<acq, Supplier<JsonElement>> $$1) {
        return this.A.a($$0, this.z, $$1);
    }

    public acq a(cpn $$0, String $$1, BiConsumer<acq, Supplier<JsonElement>> $$2) {
        return this.A.a($$0, $$1, this.z, $$2);
    }

    private static a a(Function<cpn, lh> $$0, lf $$1) {
        return $$2 -> new lj((lh)$$0.apply($$2), $$1);
    }

    public static lj a(acq $$0) {
        return new lj(lh.b($$0), lg.c);
    }

    @FunctionalInterface
    public static interface a {
        public lj get(cpn var1);

        default public acq create(cpn $$0, BiConsumer<acq, Supplier<JsonElement>> $$1) {
            return this.get($$0).a($$0, $$1);
        }

        default public acq createWithSuffix(cpn $$0, String $$1, BiConsumer<acq, Supplier<JsonElement>> $$2) {
            return this.get($$0).a($$0, $$1, $$2);
        }

        default public a updateTexture(Consumer<lh> $$0) {
            return $$1 -> this.get($$1).a($$0);
        }
    }
}

