/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Either
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dec {
    public static final int a = 8;
    private static final EnumSet<dhk.a> o = EnumSet.of(dhk.a.c, dhk.a.a);
    public static final EnumSet<dhk.a> b = EnumSet.of(dhk.a.d, dhk.a.b, dhk.a.e, dhk.a.f);
    private static final c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left((Object)$$5));
    public static final dec c = dec.a("empty", null, -1, o, dec$a.a, (dec $$0, aif $$1, ddy $$2, List<ddx> $$3, ddx $$4) -> {});
    public static final dec d = dec.a("structure_starts", c, 0, false, o, dec$a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
        if ($$2.n().aU().A().c()) {
            $$3.a($$2.B_(), $$2.k().h(), $$2.a(), $$8, $$4);
        }
        $$2.a($$8);
        return CompletableFuture.completedFuture(Either.left((Object)$$8));
    }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
        $$1.a($$5);
        return CompletableFuture.completedFuture(Either.left((Object)$$5));
    });
    public static final dec e = dec.a("structure_references", d, 8, o, dec$a.a, (dec $$0, aif $$1, ddy $$2, List<ddx> $$3, ddx $$4) -> {
        aim $$5 = new aim($$1, $$3, $$0, -1);
        $$2.a((cng)$$5, $$1.a().a($$5), $$4);
    });
    public static final dec f = dec.a("biomes", e, 8, o, dec$a.a, (dec $$02, Executor $$1, aif $$2, ddy $$3, dvu $$4, aii $$5, Function<ddx, CompletableFuture<Either<ddx, ahp.a>>> $$6, List<ddx> $$7, ddx $$8) -> {
        aim $$9 = new aim($$2, $$7, $$02, -1);
        return $$3.a($$1, $$2.k().i(), dim.a($$9), $$2.a().a($$9), $$8).thenApply($$0 -> Either.left((Object)$$0));
    });
    public static final dec g = dec.a("noise", f, 8, o, dec$a.a, (dec $$02, Executor $$1, aif $$2, ddy $$3, dvu $$4, aii $$5, Function<ddx, CompletableFuture<Either<ddx, ahp.a>>> $$6, List<ddx> $$7, ddx $$8) -> {
        aim $$9 = new aim($$2, $$7, $$02, 0);
        return $$3.a($$1, dim.a($$9), $$2.k().i(), $$2.a().a($$9), $$8).thenApply($$0 -> {
            des $$1;
            dgy $$2;
            if ($$0 instanceof des && ($$2 = ($$1 = (des)$$0).x()) != null) {
                dgy.a($$1);
                if ($$2.b()) {
                    $$2.b((des)((Object)$$1));
                }
            }
            return Either.left((Object)$$0);
        });
    });
    public static final dec h = dec.a("surface", g, 8, o, dec$a.a, (dec $$0, aif $$1, ddy $$2, List<ddx> $$3, ddx $$4) -> {
        aim $$5 = new aim($$1, $$3, $$0, 0);
        $$2.a($$5, $$1.a().a($$5), $$1.k().i(), $$4);
    });
    public static final dec i = dec.a("carvers", h, 8, b, dec$a.a, (dec $$0, aif $$1, ddy $$2, List<ddx> $$3, ddx $$4) -> {
        aim $$5 = new aim($$1, $$3, $$0, 0);
        if ($$4 instanceof des) {
            des $$6 = (des)$$4;
            dim.a((cng)$$5, $$6);
        }
        $$2.a($$5, $$1.A(), $$1.k().i(), $$1.z_(), $$1.a().a($$5), $$4, dhg.a.a);
    });
    public static final dec j = dec.a("features", i, 8, b, dec$a.a, (dec $$0, aif $$1, ddy $$2, List<ddx> $$3, ddx $$4) -> {
        dhk.a($$4, EnumSet.of(dhk.a.e, dhk.a.f, dhk.a.d, dhk.a.b));
        aim $$5 = new aim($$1, $$3, $$0, 1);
        $$2.a((cng)$$5, $$4, $$1.a().a($$5));
        dim.a($$5, $$4);
    });
    public static final dec k = dec.a("initialize_light", j, 0, false, b, dec$a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> dec.a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> dec.a($$3, $$5));
    public static final dec l = dec.a("light", k, 1, true, b, dec$a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> dec.b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> dec.b($$3, $$5));
    public static final dec m = dec.a("spawn", l, 0, b, dec$a.a, (dec $$0, aif $$1, ddy $$2, List<ddx> $$3, ddx $$4) -> {
        if (!$$4.y()) {
            $$2.a(new aim($$1, $$3, $$0, -1));
        }
    });
    public static final dec n = dec.a("full", m, 0, false, b, dec$a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> (CompletableFuture)$$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> (CompletableFuture)$$4.apply($$5));
    private static final List<dec> q = ImmutableList.of((Object)n, (Object)k, (Object)i, (Object)f, (Object)d, (Object)d, (Object)d, (Object)d, (Object)d, (Object)d, (Object)d, (Object)d, (Object[])new dec[0]);
    private static final IntList r = (IntList)ac.a(new IntArrayList(dec.a().size()), (T $$0) -> {
        int $$1 = 0;
        for (int $$2 = dec.a().size() - 1; $$2 >= 0; --$$2) {
            while ($$1 + 1 < q.size() && $$2 <= q.get($$1 + 1).c()) {
                ++$$1;
            }
            $$0.add(0, $$1);
        }
    });
    private final int s;
    private final dec t;
    private final b u;
    private final c v;
    private final int w;
    private final boolean x;
    private final a y;
    private final EnumSet<dhk.a> z;

    private static CompletableFuture<Either<ddx, ahp.a>> a(aii $$0, ddx $$1) {
        $$1.A();
        ((des)$$1).a($$0);
        boolean $$2 = dec.a($$1);
        return $$0.a($$1, $$2).thenApply(Either::left);
    }

    private static CompletableFuture<Either<ddx, ahp.a>> b(aii $$0, ddx $$1) {
        boolean $$2 = dec.a($$1);
        return $$0.b($$1, $$2).thenApply(Either::left);
    }

    private static dec a(String $$0, @Nullable dec $$1, int $$2, EnumSet<dhk.a> $$3, a $$4, d $$5) {
        return dec.a($$0, $$1, $$2, $$3, $$4, (b)$$5);
    }

    private static dec a(String $$0, @Nullable dec $$1, int $$2, EnumSet<dhk.a> $$3, a $$4, b $$5) {
        return dec.a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
    }

    private static dec a(String $$0, @Nullable dec $$1, int $$2, boolean $$3, EnumSet<dhk.a> $$4, a $$5, b $$6, c $$7) {
        return hr.a(jb.o, $$0, new dec($$1, $$2, $$3, $$4, $$5, $$6, $$7));
    }

    public static List<dec> a() {
        dec $$1;
        ArrayList $$0 = Lists.newArrayList();
        for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
            $$0.add($$1);
        }
        $$0.add($$1);
        Collections.reverse($$0);
        return $$0;
    }

    private static boolean a(ddx $$0) {
        return $$0.j().b(l) && $$0.v();
    }

    public static dec a(int $$0) {
        if ($$0 >= q.size()) {
            return c;
        }
        if ($$0 < 0) {
            return n;
        }
        return q.get($$0);
    }

    public static int b() {
        return q.size();
    }

    public static int a(dec $$0) {
        return r.getInt($$0.c());
    }

    dec(@Nullable dec $$0, int $$1, boolean $$2, EnumSet<dhk.a> $$3, a $$4, b $$5, c $$6) {
        this.t = $$0 == null ? this : $$0;
        this.u = $$5;
        this.v = $$6;
        this.w = $$1;
        this.x = $$2;
        this.y = $$4;
        this.z = $$3;
        this.s = $$0 == null ? 0 : $$0.c() + 1;
    }

    public int c() {
        return this.s;
    }

    public dec d() {
        return this.t;
    }

    public CompletableFuture<Either<ddx, ahp.a>> a(Executor $$0, aif $$12, ddy $$2, dvu $$3, aii $$4, Function<ddx, CompletableFuture<Either<ddx, ahp.a>>> $$5, List<ddx> $$6) {
        ddx $$7 = $$6.get($$6.size() / 2);
        baw $$8 = bat.e.a($$7.f(), $$12.ac(), this.toString());
        return this.u.doWork(this, $$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1 -> {
            $$1.ifLeft($$0 -> {
                des $$1;
                if ($$0 instanceof des && !($$1 = (des)$$0).j().b(this)) {
                    $$1.a(this);
                }
            });
            if ($$8 != null) {
                $$8.finish();
            }
            return $$1;
        });
    }

    public CompletableFuture<Either<ddx, ahp.a>> a(aif $$0, dvu $$1, aii $$2, Function<ddx, CompletableFuture<Either<ddx, ahp.a>>> $$3, ddx $$4) {
        return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
    }

    public int e() {
        return this.w;
    }

    public boolean f() {
        return this.x;
    }

    public a g() {
        return this.y;
    }

    public static dec a(String $$0) {
        return jb.o.a(acq.a($$0));
    }

    public EnumSet<dhk.a> h() {
        return this.z;
    }

    public boolean b(dec $$0) {
        return this.c() >= $$0.c();
    }

    public String toString() {
        return jb.o.b(this).toString();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = dec$a.a();
        }
    }

    static interface b {
        public CompletableFuture<Either<ddx, ahp.a>> doWork(dec var1, Executor var2, aif var3, ddy var4, dvu var5, aii var6, Function<ddx, CompletableFuture<Either<ddx, ahp.a>>> var7, List<ddx> var8, ddx var9);
    }

    static interface c {
        public CompletableFuture<Either<ddx, ahp.a>> doWork(dec var1, aif var2, dvu var3, aii var4, Function<ddx, CompletableFuture<Either<ddx, ahp.a>>> var5, ddx var6);
    }

    static interface d
    extends b {
        @Override
        default public CompletableFuture<Either<ddx, ahp.a>> doWork(dec $$0, Executor $$1, aif $$2, ddy $$3, dvu $$4, aii $$5, Function<ddx, CompletableFuture<Either<ddx, ahp.a>>> $$6, List<ddx> $$7, ddx $$8) {
            this.doWork($$0, $$2, $$3, $$7, $$8);
            return CompletableFuture.completedFuture(Either.left((Object)$$8));
        }

        public void doWork(dec var1, aif var2, ddy var3, List<ddx> var4, ddx var5);
    }
}

