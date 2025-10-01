/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonElement
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class kq {
    final Consumer<kt> b;
    final BiConsumer<acq, Supplier<JsonElement>> c;
    private final Consumer<cfu> d;
    final List<cpn> e = ImmutableList.of((Object)cpo.ez, (Object)cpo.eF, (Object)cpo.hY);
    final Map<cpn, c> f = ImmutableMap.builder().put((Object)cpo.b, kq::a).put((Object)cpo.rI, kq::c).put((Object)cpo.eN, kq::b).build();
    final Map<cpn, lj> g = ImmutableMap.builder().put((Object)cpo.aV, (Object)lj.x.get(cpo.aV)).put((Object)cpo.jp, (Object)lj.x.get(cpo.jp)).put((Object)cpo.jS, (Object)lj.a(lh.a(cpo.aV, "_top"))).put((Object)cpo.jU, (Object)lj.a(lh.a(cpo.jp, "_top"))).put((Object)cpo.aX, (Object)lj.c.get(cpo.aV).a((lh $$0) -> $$0.a(li.i, lh.G(cpo.aX)))).put((Object)cpo.jr, (Object)lj.c.get(cpo.jp).a((lh $$0) -> $$0.a(li.i, lh.G(cpo.jr)))).put((Object)cpo.hd, (Object)lj.c.get(cpo.hd)).put((Object)cpo.jT, (Object)lj.a(lh.a(cpo.hd, "_bottom"))).put((Object)cpo.pr, (Object)lj.y.get(cpo.pr)).put((Object)cpo.rI, (Object)lj.y.get(cpo.rI)).put((Object)cpo.he, (Object)lj.c.get(cpo.he).a((lh $$0) -> $$0.a(li.i, lh.G(cpo.he)))).put((Object)cpo.aW, (Object)lj.c.get(cpo.aW).a((lh $$0) -> {
        $$0.a(li.d, lh.a(cpo.aV, "_top"));
        $$0.a(li.i, lh.G(cpo.aW));
    })).put((Object)cpo.jq, (Object)lj.c.get(cpo.jq).a((lh $$0) -> {
        $$0.a(li.d, lh.a(cpo.jp, "_top"));
        $$0.a(li.i, lh.G(cpo.jq));
    })).build();
    static final Map<jf.b, BiConsumer<b, cpn>> h = ImmutableMap.builder().put((Object)jf.b.a, b::a).put((Object)jf.b.e, b::l).put((Object)jf.b.b, b::k).put((Object)jf.b.c, b::k).put((Object)jf.b.f, b::c).put((Object)jf.b.g, b::d).put((Object)jf.b.h, b::e).put((Object)jf.b.i, b::f).put((Object)jf.b.k, b::h).put((Object)jf.b.l, b::i).put((Object)jf.b.m, b::j).put((Object)jf.b.n, b::g).put((Object)jf.b.p, b::m).put((Object)jf.b.q, b::b).build();
    public static final List<Pair<dcs, Function<acq, kz>>> a = List.of(Pair.of((Object)dcr.L, $$0 -> kz.a().a(la.c, $$0)), Pair.of((Object)dcr.M, $$0 -> kz.a().a(la.c, $$0).a(la.b, la.a.b).a(la.d, true)), Pair.of((Object)dcr.N, $$0 -> kz.a().a(la.c, $$0).a(la.b, la.a.c).a(la.d, true)), Pair.of((Object)dcr.O, $$0 -> kz.a().a(la.c, $$0).a(la.b, la.a.d).a(la.d, true)), Pair.of((Object)dcr.J, $$0 -> kz.a().a(la.c, $$0).a(la.a, la.a.d).a(la.d, true)), Pair.of((Object)dcr.K, $$0 -> kz.a().a(la.c, $$0).a(la.a, la.a.b).a(la.d, true)));
    private static final Map<d, acq> i = new HashMap<d, acq>();

    private static kt a(cpn $$0, acq $$1, lh $$2, BiConsumer<acq, Supplier<JsonElement>> $$3) {
        acq $$4 = lg.d.a($$0, $$2, $$3);
        return kq.a($$0, $$1, $$4);
    }

    private static kt b(cpn $$0, acq $$1, lh $$2, BiConsumer<acq, Supplier<JsonElement>> $$3) {
        acq $$4 = lg.e.a($$0, $$2, $$3);
        return kq.c($$0, $$4);
    }

    private static kt c(cpn $$0, acq $$1, lh $$2, BiConsumer<acq, Supplier<JsonElement>> $$3) {
        acq $$4 = lg.k.a($$0, $$2, $$3);
        return kq.a($$0, $$1, $$4).a(kq.f());
    }

    public kq(Consumer<kt> $$02, BiConsumer<acq, Supplier<JsonElement>> $$1, Consumer<cfu> $$2) {
        this.b = $$02;
        this.c = $$1;
        this.d = $$2;
    }

    void c(cpn $$0) {
        this.d.accept($$0.k());
    }

    void a(cpn $$0, acq $$1) {
        this.c.accept(le.a($$0.k()), new ld($$1));
    }

    private void a(cfu $$0, acq $$1) {
        this.c.accept(le.a($$0), new ld($$1));
    }

    void a(cfu $$0) {
        lg.bv.a(le.a($$0), lh.b($$0), this.c);
    }

    private void d(cpn $$0) {
        cfu $$1 = $$0.k();
        if ($$1 != cgc.a) {
            lg.bv.a(le.a($$1), lh.F($$0), this.c);
        }
    }

    private void a(cpn $$0, String $$1) {
        cfu $$2 = $$0.k();
        lg.bv.a(le.a($$2), lh.k(lh.a($$0, $$1)), this.c);
    }

    private static kx b() {
        return kx.a(dcr.R).a(ha.f, kz.a().a(la.b, la.a.b)).a(ha.d, kz.a().a(la.b, la.a.c)).a(ha.e, kz.a().a(la.b, la.a.d)).a(ha.c, kz.a());
    }

    private static kx c() {
        return kx.a(dcr.R).a(ha.d, kz.a()).a(ha.e, kz.a().a(la.b, la.a.b)).a(ha.c, kz.a().a(la.b, la.a.c)).a(ha.f, kz.a().a(la.b, la.a.d));
    }

    private static kx d() {
        return kx.a(dcr.R).a(ha.f, kz.a()).a(ha.d, kz.a().a(la.b, la.a.b)).a(ha.e, kz.a().a(la.b, la.a.c)).a(ha.c, kz.a().a(la.b, la.a.d));
    }

    private static kx e() {
        return kx.a(dcr.P).a(ha.a, kz.a().a(la.a, la.a.b)).a(ha.b, kz.a().a(la.a, la.a.d)).a(ha.c, kz.a()).a(ha.d, kz.a().a(la.b, la.a.c)).a(ha.e, kz.a().a(la.b, la.a.d)).a(ha.f, kz.a().a(la.b, la.a.b));
    }

    private static kw b(cpn $$0, acq $$1) {
        return kw.a($$0, kq.a($$1));
    }

    private static kz[] a(acq $$0) {
        return new kz[]{kz.a().a(la.c, $$0), kz.a().a(la.c, $$0).a(la.b, la.a.b), kz.a().a(la.c, $$0).a(la.b, la.a.c), kz.a().a(la.c, $$0).a(la.b, la.a.d)};
    }

    private static kw a(cpn $$0, acq $$1, acq $$2) {
        return kw.a($$0, kz.a().a(la.c, $$1), kz.a().a(la.c, $$2), kz.a().a(la.c, $$1).a(la.b, la.a.c), kz.a().a(la.c, $$2).a(la.b, la.a.c));
    }

    private static kx a(dcs $$0, acq $$1, acq $$2) {
        return kx.a($$0).a((Boolean)true, kz.a().a(la.c, $$1)).a((Boolean)false, kz.a().a(la.c, $$2));
    }

    private void e(cpn $$0) {
        acq $$1 = lj.a.create($$0, this.c);
        acq $$2 = lj.b.create($$0, this.c);
        this.b.accept(kq.a($$0, $$1, $$2));
    }

    private void f(cpn $$0) {
        acq $$1 = lj.a.create($$0, this.c);
        this.b.accept(kq.b($$0, $$1));
    }

    private void g(cpn $$0) {
        this.b.accept(kw.a($$0).a(kx.a(dcr.bv).a((T1 $$1) -> {
            String $$2 = "_" + $$1;
            acq $$3 = lh.a($$0, $$2);
            return kz.a().a(la.c, lg.c.a($$0, $$2, new lh().a(li.a, $$3), this.c));
        })));
        this.a($$0, lh.a($$0, "_0"));
    }

    static kt b(cpn $$0, acq $$1, acq $$2) {
        return kw.a($$0).a(kx.a(dcr.w).a((Boolean)false, kz.a().a(la.c, $$1)).a((Boolean)true, kz.a().a(la.c, $$2))).a(kx.a(dcr.U, dcr.R).a(dcm.a, ha.f, kz.a().a(la.b, la.a.b)).a(dcm.a, ha.e, kz.a().a(la.b, la.a.d)).a(dcm.a, ha.d, kz.a().a(la.b, la.a.c)).a(dcm.a, ha.c, kz.a()).a(dcm.b, ha.f, kz.a().a(la.b, la.a.b).a(la.a, la.a.b).a(la.d, true)).a(dcm.b, ha.e, kz.a().a(la.b, la.a.d).a(la.a, la.a.b).a(la.d, true)).a(dcm.b, ha.d, kz.a().a(la.b, la.a.c).a(la.a, la.a.b).a(la.d, true)).a(dcm.b, ha.c, kz.a().a(la.a, la.a.b).a(la.d, true)).a(dcm.c, ha.f, kz.a().a(la.b, la.a.d).a(la.a, la.a.c)).a(dcm.c, ha.e, kz.a().a(la.b, la.a.b).a(la.a, la.a.c)).a(dcm.c, ha.d, kz.a().a(la.a, la.a.c)).a(dcm.c, ha.c, kz.a().a(la.b, la.a.c).a(la.a, la.a.c)));
    }

    private static kx.d<ha, dcx, dcw, Boolean> a(kx.d<ha, dcx, dcw, Boolean> $$0, dcx $$1, acq $$2, acq $$3, acq $$4, acq $$5) {
        return $$0.a(ha.f, $$1, dcw.a, (Boolean)false, kz.a().a(la.c, $$2)).a(ha.d, $$1, dcw.a, (Boolean)false, kz.a().a(la.c, $$2).a(la.b, la.a.b)).a(ha.e, $$1, dcw.a, (Boolean)false, kz.a().a(la.c, $$2).a(la.b, la.a.c)).a(ha.c, $$1, dcw.a, (Boolean)false, kz.a().a(la.c, $$2).a(la.b, la.a.d)).a(ha.f, $$1, dcw.b, (Boolean)false, kz.a().a(la.c, $$4)).a(ha.d, $$1, dcw.b, (Boolean)false, kz.a().a(la.c, $$4).a(la.b, la.a.b)).a(ha.e, $$1, dcw.b, (Boolean)false, kz.a().a(la.c, $$4).a(la.b, la.a.c)).a(ha.c, $$1, dcw.b, (Boolean)false, kz.a().a(la.c, $$4).a(la.b, la.a.d)).a(ha.f, $$1, dcw.a, (Boolean)true, kz.a().a(la.c, $$3).a(la.b, la.a.b)).a(ha.d, $$1, dcw.a, (Boolean)true, kz.a().a(la.c, $$3).a(la.b, la.a.c)).a(ha.e, $$1, dcw.a, (Boolean)true, kz.a().a(la.c, $$3).a(la.b, la.a.d)).a(ha.c, $$1, dcw.a, (Boolean)true, kz.a().a(la.c, $$3)).a(ha.f, $$1, dcw.b, (Boolean)true, kz.a().a(la.c, $$5).a(la.b, la.a.d)).a(ha.d, $$1, dcw.b, (Boolean)true, kz.a().a(la.c, $$5)).a(ha.e, $$1, dcw.b, (Boolean)true, kz.a().a(la.c, $$5).a(la.b, la.a.b)).a(ha.c, $$1, dcw.b, (Boolean)true, kz.a().a(la.c, $$5).a(la.b, la.a.c));
    }

    private static kt a(cpn $$0, acq $$1, acq $$2, acq $$3, acq $$4, acq $$5, acq $$6, acq $$7, acq $$8) {
        return kw.a($$0).a(kq.a(kq.a(kx.a(dcr.R, dcr.ae, dcr.be, dcr.u), dcx.b, $$1, $$2, $$3, $$4), dcx.a, $$5, $$6, $$7, $$8));
    }

    static kt a(cpn $$0, acq $$1, acq $$2, acq $$3, acq $$4, acq $$5) {
        return kv.a($$0).a(kz.a().a(la.c, $$1)).a((ku)ku.a().a(dcr.L, true), kz.a().a(la.c, $$2).a(la.d, false)).a((ku)ku.a().a(dcr.M, true), kz.a().a(la.c, $$3).a(la.d, false)).a((ku)ku.a().a(dcr.N, true), kz.a().a(la.c, $$4).a(la.d, false)).a((ku)ku.a().a(dcr.O, true), kz.a().a(la.c, $$5).a(la.d, false));
    }

    static kt c(cpn $$0, acq $$1, acq $$2) {
        return kv.a($$0).a(kz.a().a(la.c, $$1)).a((ku)ku.a().a(dcr.L, true), kz.a().a(la.c, $$2).a(la.d, true)).a((ku)ku.a().a(dcr.M, true), kz.a().a(la.c, $$2).a(la.b, la.a.b).a(la.d, true)).a((ku)ku.a().a(dcr.N, true), kz.a().a(la.c, $$2).a(la.b, la.a.c).a(la.d, true)).a((ku)ku.a().a(dcr.O, true), kz.a().a(la.c, $$2).a(la.b, la.a.d).a(la.d, true));
    }

    static kt a(cpn $$0, acq $$1, acq $$2, acq $$3) {
        return kv.a($$0).a((ku)ku.a().a(dcr.J, true), kz.a().a(la.c, $$1)).a((ku)ku.a().a(dcr.X, ddn.b), kz.a().a(la.c, $$2).a(la.d, true)).a((ku)ku.a().a(dcr.W, ddn.b), kz.a().a(la.c, $$2).a(la.b, la.a.b).a(la.d, true)).a((ku)ku.a().a(dcr.Y, ddn.b), kz.a().a(la.c, $$2).a(la.b, la.a.c).a(la.d, true)).a((ku)ku.a().a(dcr.Z, ddn.b), kz.a().a(la.c, $$2).a(la.b, la.a.d).a(la.d, true)).a((ku)ku.a().a(dcr.X, ddn.c), kz.a().a(la.c, $$3).a(la.d, true)).a((ku)ku.a().a(dcr.W, ddn.c), kz.a().a(la.c, $$3).a(la.b, la.a.b).a(la.d, true)).a((ku)ku.a().a(dcr.Y, ddn.c), kz.a().a(la.c, $$3).a(la.b, la.a.c).a(la.d, true)).a((ku)ku.a().a(dcr.Z, ddn.c), kz.a().a(la.c, $$3).a(la.b, la.a.d).a(la.d, true));
    }

    static kt a(cpn $$0, acq $$1, acq $$2, acq $$3, acq $$4, boolean $$5) {
        return kw.a($$0, kz.a().a(la.d, $$5)).a(kq.c()).a(kx.a(dcr.q, dcr.u).a((Boolean)false, (Boolean)false, kz.a().a(la.c, $$2)).a((Boolean)true, (Boolean)false, kz.a().a(la.c, $$4)).a((Boolean)false, (Boolean)true, kz.a().a(la.c, $$1)).a((Boolean)true, (Boolean)true, kz.a().a(la.c, $$3)));
    }

    static kt b(cpn $$0, acq $$1, acq $$2, acq $$3) {
        return kw.a($$0).a(kx.a(dcr.R, dcr.af, dcr.bi).a(ha.f, dda.b, ddk.a, kz.a().a(la.c, $$2)).a(ha.e, dda.b, ddk.a, kz.a().a(la.c, $$2).a(la.b, la.a.c).a(la.d, true)).a(ha.d, dda.b, ddk.a, kz.a().a(la.c, $$2).a(la.b, la.a.b).a(la.d, true)).a(ha.c, dda.b, ddk.a, kz.a().a(la.c, $$2).a(la.b, la.a.d).a(la.d, true)).a(ha.f, dda.b, ddk.e, kz.a().a(la.c, $$3)).a(ha.e, dda.b, ddk.e, kz.a().a(la.c, $$3).a(la.b, la.a.c).a(la.d, true)).a(ha.d, dda.b, ddk.e, kz.a().a(la.c, $$3).a(la.b, la.a.b).a(la.d, true)).a(ha.c, dda.b, ddk.e, kz.a().a(la.c, $$3).a(la.b, la.a.d).a(la.d, true)).a(ha.f, dda.b, ddk.d, kz.a().a(la.c, $$3).a(la.b, la.a.d).a(la.d, true)).a(ha.e, dda.b, ddk.d, kz.a().a(la.c, $$3).a(la.b, la.a.b).a(la.d, true)).a(ha.d, dda.b, ddk.d, kz.a().a(la.c, $$3)).a(ha.c, dda.b, ddk.d, kz.a().a(la.c, $$3).a(la.b, la.a.c).a(la.d, true)).a(ha.f, dda.b, ddk.c, kz.a().a(la.c, $$1)).a(ha.e, dda.b, ddk.c, kz.a().a(la.c, $$1).a(la.b, la.a.c).a(la.d, true)).a(ha.d, dda.b, ddk.c, kz.a().a(la.c, $$1).a(la.b, la.a.b).a(la.d, true)).a(ha.c, dda.b, ddk.c, kz.a().a(la.c, $$1).a(la.b, la.a.d).a(la.d, true)).a(ha.f, dda.b, ddk.b, kz.a().a(la.c, $$1).a(la.b, la.a.d).a(la.d, true)).a(ha.e, dda.b, ddk.b, kz.a().a(la.c, $$1).a(la.b, la.a.b).a(la.d, true)).a(ha.d, dda.b, ddk.b, kz.a().a(la.c, $$1)).a(ha.c, dda.b, ddk.b, kz.a().a(la.c, $$1).a(la.b, la.a.c).a(la.d, true)).a(ha.f, dda.a, ddk.a, kz.a().a(la.c, $$2).a(la.a, la.a.c).a(la.d, true)).a(ha.e, dda.a, ddk.a, kz.a().a(la.c, $$2).a(la.a, la.a.c).a(la.b, la.a.c).a(la.d, true)).a(ha.d, dda.a, ddk.a, kz.a().a(la.c, $$2).a(la.a, la.a.c).a(la.b, la.a.b).a(la.d, true)).a(ha.c, dda.a, ddk.a, kz.a().a(la.c, $$2).a(la.a, la.a.c).a(la.b, la.a.d).a(la.d, true)).a(ha.f, dda.a, ddk.e, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.b).a(la.d, true)).a(ha.e, dda.a, ddk.e, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.d).a(la.d, true)).a(ha.d, dda.a, ddk.e, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.c).a(la.d, true)).a(ha.c, dda.a, ddk.e, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.d, true)).a(ha.f, dda.a, ddk.d, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.d, true)).a(ha.e, dda.a, ddk.d, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.c).a(la.d, true)).a(ha.d, dda.a, ddk.d, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.b).a(la.d, true)).a(ha.c, dda.a, ddk.d, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.d).a(la.d, true)).a(ha.f, dda.a, ddk.c, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.b, la.a.b).a(la.d, true)).a(ha.e, dda.a, ddk.c, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.b, la.a.d).a(la.d, true)).a(ha.d, dda.a, ddk.c, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.b, la.a.c).a(la.d, true)).a(ha.c, dda.a, ddk.c, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.d, true)).a(ha.f, dda.a, ddk.b, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.d, true)).a(ha.e, dda.a, ddk.b, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.b, la.a.c).a(la.d, true)).a(ha.d, dda.a, ddk.b, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.b, la.a.b).a(la.d, true)).a(ha.c, dda.a, ddk.b, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.b, la.a.d).a(la.d, true)));
    }

    private static kt c(cpn $$0, acq $$1, acq $$2, acq $$3) {
        return kw.a($$0).a(kx.a(dcr.R, dcr.af, dcr.u).a(ha.c, dda.b, (Boolean)false, kz.a().a(la.c, $$2)).a(ha.d, dda.b, (Boolean)false, kz.a().a(la.c, $$2).a(la.b, la.a.c)).a(ha.f, dda.b, (Boolean)false, kz.a().a(la.c, $$2).a(la.b, la.a.b)).a(ha.e, dda.b, (Boolean)false, kz.a().a(la.c, $$2).a(la.b, la.a.d)).a(ha.c, dda.a, (Boolean)false, kz.a().a(la.c, $$1)).a(ha.d, dda.a, (Boolean)false, kz.a().a(la.c, $$1).a(la.b, la.a.c)).a(ha.f, dda.a, (Boolean)false, kz.a().a(la.c, $$1).a(la.b, la.a.b)).a(ha.e, dda.a, (Boolean)false, kz.a().a(la.c, $$1).a(la.b, la.a.d)).a(ha.c, dda.b, (Boolean)true, kz.a().a(la.c, $$3)).a(ha.d, dda.b, (Boolean)true, kz.a().a(la.c, $$3).a(la.b, la.a.c)).a(ha.f, dda.b, (Boolean)true, kz.a().a(la.c, $$3).a(la.b, la.a.b)).a(ha.e, dda.b, (Boolean)true, kz.a().a(la.c, $$3).a(la.b, la.a.d)).a(ha.c, dda.a, (Boolean)true, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.c)).a(ha.d, dda.a, (Boolean)true, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.a)).a(ha.f, dda.a, (Boolean)true, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.d)).a(ha.e, dda.a, (Boolean)true, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.b)));
    }

    private static kt d(cpn $$0, acq $$1, acq $$2, acq $$3) {
        return kw.a($$0).a(kx.a(dcr.R, dcr.af, dcr.u).a(ha.c, dda.b, (Boolean)false, kz.a().a(la.c, $$2)).a(ha.d, dda.b, (Boolean)false, kz.a().a(la.c, $$2)).a(ha.f, dda.b, (Boolean)false, kz.a().a(la.c, $$2)).a(ha.e, dda.b, (Boolean)false, kz.a().a(la.c, $$2)).a(ha.c, dda.a, (Boolean)false, kz.a().a(la.c, $$1)).a(ha.d, dda.a, (Boolean)false, kz.a().a(la.c, $$1)).a(ha.f, dda.a, (Boolean)false, kz.a().a(la.c, $$1)).a(ha.e, dda.a, (Boolean)false, kz.a().a(la.c, $$1)).a(ha.c, dda.b, (Boolean)true, kz.a().a(la.c, $$3)).a(ha.d, dda.b, (Boolean)true, kz.a().a(la.c, $$3).a(la.b, la.a.c)).a(ha.f, dda.b, (Boolean)true, kz.a().a(la.c, $$3).a(la.b, la.a.b)).a(ha.e, dda.b, (Boolean)true, kz.a().a(la.c, $$3).a(la.b, la.a.d)).a(ha.c, dda.a, (Boolean)true, kz.a().a(la.c, $$3)).a(ha.d, dda.a, (Boolean)true, kz.a().a(la.c, $$3).a(la.b, la.a.c)).a(ha.f, dda.a, (Boolean)true, kz.a().a(la.c, $$3).a(la.b, la.a.b)).a(ha.e, dda.a, (Boolean)true, kz.a().a(la.c, $$3).a(la.b, la.a.d)));
    }

    static kw c(cpn $$0, acq $$1) {
        return kw.a($$0, kz.a().a(la.c, $$1));
    }

    private static kx f() {
        return kx.a(dcr.I).a(ha.a.b, kz.a()).a(ha.a.c, kz.a().a(la.a, la.a.b)).a(ha.a.a, kz.a().a(la.a, la.a.b).a(la.b, la.a.b));
    }

    static kt a(cpn $$0, lh $$1, BiConsumer<acq, Supplier<JsonElement>> $$2) {
        acq $$3 = lg.f.a($$0, $$1, $$2);
        acq $$4 = lg.g.a($$0, $$1, $$2);
        acq $$5 = lg.h.a($$0, $$1, $$2);
        acq $$6 = lg.i.a($$0, $$1, $$2);
        return kw.a($$0, kz.a().a(la.c, $$6)).a(kx.a(dcr.I).a(ha.a.a, kz.a().a(la.c, $$3)).a(ha.a.b, kz.a().a(la.c, $$4)).a(ha.a.c, kz.a().a(la.c, $$5)));
    }

    static kt d(cpn $$0, acq $$1) {
        return kw.a($$0, kz.a().a(la.c, $$1)).a(kq.f());
    }

    private void e(cpn $$0, acq $$1) {
        this.b.accept(kq.d($$0, $$1));
    }

    public void a(cpn $$0, lj.a $$1) {
        acq $$2 = $$1.create($$0, this.c);
        this.b.accept(kq.d($$0, $$2));
    }

    private void c(cpn $$0, lj.a $$1) {
        acq $$2 = $$1.create($$0, this.c);
        this.b.accept(kw.a($$0, kz.a().a(la.c, $$2)).a(kq.b()));
    }

    static kt d(cpn $$0, acq $$1, acq $$2) {
        return kw.a($$0).a(kx.a(dcr.I).a(ha.a.b, kz.a().a(la.c, $$1)).a(ha.a.c, kz.a().a(la.c, $$2).a(la.a, la.a.b)).a(ha.a.a, kz.a().a(la.c, $$2).a(la.a, la.a.b).a(la.b, la.a.b)));
    }

    private void a(cpn $$0, lj.a $$1, lj.a $$2) {
        acq $$3 = $$1.create($$0, this.c);
        acq $$4 = $$2.create($$0, this.c);
        this.b.accept(kq.d($$0, $$3, $$4));
    }

    private acq a(cpn $$0, String $$1, lf $$2, Function<acq, lh> $$3) {
        return $$2.a($$0, $$1, $$3.apply(lh.a($$0, $$1)), this.c);
    }

    static kt e(cpn $$0, acq $$1, acq $$2) {
        return kw.a($$0).a(kq.a(dcr.w, $$2, $$1));
    }

    static kt e(cpn $$0, acq $$1, acq $$2, acq $$3) {
        return kw.a($$0).a(kx.a(dcr.bh).a(ddj.b, kz.a().a(la.c, $$1)).a(ddj.a, kz.a().a(la.c, $$2)).a(ddj.c, kz.a().a(la.c, $$3)));
    }

    public void a(cpn $$0) {
        this.b($$0, lj.a);
    }

    public void b(cpn $$0, lj.a $$1) {
        this.b.accept(kq.c($$0, $$1.create($$0, this.c)));
    }

    private void a(cpn $$0, lh $$1, lf $$2) {
        acq $$3 = $$2.a($$0, $$1, this.c);
        this.b.accept(kq.c($$0, $$3));
    }

    private b h(cpn $$0) {
        lj $$1 = this.g.getOrDefault($$0, lj.a.get($$0));
        return new b($$1.b()).a($$0, $$1.a());
    }

    public void a(cpn $$0, cpn $$1, cpn $$2) {
        lh $$3 = lh.u($$0);
        acq $$4 = lg.Y.a($$1, $$3, this.c);
        this.b.accept(kq.c($$1, $$4));
        this.b.accept(kq.c($$2, $$4));
        this.a($$1.k());
        this.c($$2);
    }

    void i(cpn $$0) {
        lh $$1 = lh.t($$0);
        acq $$2 = lg.t.a($$0, $$1, this.c);
        acq $$3 = lg.u.a($$0, $$1, this.c);
        acq $$4 = lg.v.a($$0, $$1, this.c);
        acq $$5 = lg.w.a($$0, $$1, this.c);
        acq $$6 = lg.x.a($$0, $$1, this.c);
        acq $$7 = lg.y.a($$0, $$1, this.c);
        acq $$8 = lg.z.a($$0, $$1, this.c);
        acq $$9 = lg.A.a($$0, $$1, this.c);
        this.a($$0.k());
        this.b.accept(kq.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
    }

    void j(cpn $$0) {
        lh $$1 = lh.b($$0);
        acq $$2 = lg.ai.a($$0, $$1, this.c);
        acq $$3 = lg.aj.a($$0, $$1, this.c);
        acq $$4 = lg.ak.a($$0, $$1, this.c);
        this.b.accept(kq.c($$0, $$2, $$3, $$4));
        this.a($$0, $$3);
    }

    void k(cpn $$0) {
        lh $$1 = lh.b($$0);
        acq $$2 = lg.af.a($$0, $$1, this.c);
        acq $$3 = lg.ag.a($$0, $$1, this.c);
        acq $$4 = lg.ah.a($$0, $$1, this.c);
        this.b.accept(kq.d($$0, $$2, $$3, $$4));
        this.a($$0, $$3);
    }

    private void g() {
        this.c(cpo.rC);
        acq $$0 = le.a(cpo.rC);
        acq $$1 = le.a(cpo.rC, "_partial_tilt");
        acq $$2 = le.a(cpo.rC, "_full_tilt");
        this.b.accept(kw.a(cpo.rC).a(kq.b()).a(kx.a(dcr.bl).a(ddm.a, kz.a().a(la.c, $$0)).a(ddm.b, kz.a().a(la.c, $$0)).a(ddm.c, kz.a().a(la.c, $$1)).a(ddm.d, kz.a().a(la.c, $$2))));
    }

    private f l(cpn $$0) {
        return new f(lh.n($$0));
    }

    private void m(cpn $$0) {
        this.a($$0, $$0);
    }

    private void a(cpn $$0, cpn $$1) {
        this.b.accept(kq.c($$0, le.a($$1)));
    }

    private void a(cpn $$0, e $$1) {
        this.d($$0);
        this.b($$0, $$1);
    }

    private void a(cpn $$0, e $$1, lh $$2) {
        this.d($$0);
        this.b($$0, $$1, $$2);
    }

    private void b(cpn $$0, e $$1) {
        lh $$2 = lh.c($$0);
        this.b($$0, $$1, $$2);
    }

    private void b(cpn $$0, e $$1, lh $$2) {
        acq $$3 = $$1.a().a($$0, $$2, this.c);
        this.b.accept(kq.c($$0, $$3));
    }

    private void a(cpn $$0, e $$1, dde<Integer> $$2, int ... $$32) {
        if ($$2.a().size() != $$32.length) {
            throw new IllegalArgumentException("missing values for property: " + $$2);
        }
        kx $$4 = kx.a($$2).a((T1 $$3) -> {
            String $$4 = "_stage" + $$32[$$3];
            lh $$5 = lh.c(lh.a($$0, $$4));
            acq $$6 = $$1.a().a($$0, $$4, $$5, this.c);
            return kz.a().a(la.c, $$6);
        });
        this.a($$0.k());
        this.b.accept(kw.a($$0).a($$4));
    }

    private void a(cpn $$0, cpn $$1, e $$2) {
        this.a($$0, $$2);
        lh $$3 = lh.d($$0);
        acq $$4 = $$2.b().a($$1, $$3, this.c);
        this.b.accept(kq.c($$1, $$4));
    }

    private void b(cpn $$0, cpn $$1) {
        lj $$2 = lj.o.get($$0);
        acq $$3 = $$2.a($$0, this.c);
        this.b.accept(kq.c($$0, $$3));
        acq $$4 = lg.aA.a($$1, $$2.b(), this.c);
        this.b.accept(kw.a($$1, kz.a().a(la.c, $$4)).a(kq.b()));
        this.d($$0);
    }

    private void c(cpn $$0, cpn $$1) {
        this.a($$0.k());
        lh $$22 = lh.h($$0);
        lh $$3 = lh.a($$0, $$1);
        acq $$4 = lg.aS.a($$1, $$3, this.c);
        this.b.accept(kw.a($$1, kz.a().a(la.c, $$4)).a(kx.a(dcr.R).a(ha.e, kz.a()).a(ha.d, kz.a().a(la.b, la.a.d)).a(ha.c, kz.a().a(la.b, la.a.b)).a(ha.f, kz.a().a(la.b, la.a.c))));
        this.b.accept(kw.a($$0).a(kx.a(dcr.av).a((T1 $$2) -> kz.a().a(la.c, lg.aR[$$2].a($$0, $$22, this.c)))));
    }

    private void h() {
        cpn $$0 = cpo.kC;
        this.a($$0.k());
        acq $$1 = le.a($$0, "_top");
        acq $$2 = le.a($$0, "_bottom");
        this.f($$0, $$1, $$2);
    }

    private void i() {
        cpn $$0 = cpo.kB;
        this.a($$0.k());
        kx $$12 = kx.a(cva.b, dcr.ae).a((T1 $$1, T2 $$2) -> switch ($$2) {
            default -> throw new IncompatibleClassChangeError();
            case dcx.a -> kz.a().a(la.c, le.a($$0, "_top_stage_" + $$1));
            case dcx.b -> kz.a().a(la.c, le.a($$0, "_bottom_stage_" + $$1));
        });
        this.b.accept(kw.a($$0).a($$12));
    }

    private void a(cpn $$0, cpn $$1, cpn $$2, cpn $$3, cpn $$4, cpn $$5, cpn $$6, cpn $$7) {
        this.a($$0, kq$e.b);
        this.a($$1, kq$e.b);
        this.a($$2);
        this.a($$3);
        this.b($$4, $$6);
        this.b($$5, $$7);
    }

    private void c(cpn $$0, e $$1) {
        this.a($$0, "_top");
        acq $$2 = this.a($$0, "_top", $$1.a(), lh::c);
        acq $$3 = this.a($$0, "_bottom", $$1.a(), lh::c);
        this.f($$0, $$2, $$3);
    }

    private void j() {
        this.a(cpo.iD, "_front");
        acq $$0 = le.a(cpo.iD, "_top");
        acq $$1 = this.a(cpo.iD, "_bottom", kq$e.b.a(), lh::c);
        this.f(cpo.iD, $$0, $$1);
    }

    private void k() {
        acq $$0 = this.a(cpo.bx, "_top", lg.bi, lh::a);
        acq $$1 = this.a(cpo.bx, "_bottom", lg.bi, lh::a);
        this.f(cpo.bx, $$0, $$1);
    }

    private void l() {
        this.c(cpo.rE);
        acq $$0 = le.a(cpo.rE, "_top");
        acq $$1 = le.a(cpo.rE, "_bottom");
        this.b.accept(kw.a(cpo.rE).a(kq.b()).a(kx.a(dcr.ae).a(dcx.b, kz.a().a(la.c, $$1)).a(dcx.a, kz.a().a(la.c, $$0))));
    }

    private void f(cpn $$0, acq $$1, acq $$2) {
        this.b.accept(kw.a($$0).a(kx.a(dcr.ae).a(dcx.b, kz.a().a(la.c, $$2)).a(dcx.a, kz.a().a(la.c, $$1))));
    }

    private void n(cpn $$0) {
        lh $$1 = lh.e($$0);
        lh $$2 = lh.e(lh.a($$0, "_corner"));
        acq $$3 = lg.aq.a($$0, $$1, this.c);
        acq $$4 = lg.ar.a($$0, $$2, this.c);
        acq $$5 = lg.as.a($$0, $$1, this.c);
        acq $$6 = lg.at.a($$0, $$1, this.c);
        this.d($$0);
        this.b.accept(kw.a($$0).a(kx.a(dcr.ag).a(ddf.a, kz.a().a(la.c, $$3)).a(ddf.b, kz.a().a(la.c, $$3).a(la.b, la.a.b)).a(ddf.c, kz.a().a(la.c, $$5).a(la.b, la.a.b)).a(ddf.d, kz.a().a(la.c, $$6).a(la.b, la.a.b)).a(ddf.e, kz.a().a(la.c, $$5)).a(ddf.f, kz.a().a(la.c, $$6)).a(ddf.g, kz.a().a(la.c, $$4)).a(ddf.h, kz.a().a(la.c, $$4).a(la.b, la.a.b)).a(ddf.i, kz.a().a(la.c, $$4).a(la.b, la.a.c)).a(ddf.j, kz.a().a(la.c, $$4).a(la.b, la.a.d))));
    }

    private void o(cpn $$0) {
        acq $$1 = this.a($$0, "", lg.aq, lh::e);
        acq $$2 = this.a($$0, "", lg.as, lh::e);
        acq $$3 = this.a($$0, "", lg.at, lh::e);
        acq $$4 = this.a($$0, "_on", lg.aq, lh::e);
        acq $$5 = this.a($$0, "_on", lg.as, lh::e);
        acq $$62 = this.a($$0, "_on", lg.at, lh::e);
        kx $$72 = kx.a(dcr.w, dcr.ah).a((T1 $$6, T2 $$7) -> {
            switch ($$7) {
                case a: {
                    return kz.a().a(la.c, $$6 != false ? $$4 : $$1);
                }
                case b: {
                    return kz.a().a(la.c, $$6 != false ? $$4 : $$1).a(la.b, la.a.b);
                }
                case c: {
                    return kz.a().a(la.c, $$6 != false ? $$5 : $$2).a(la.b, la.a.b);
                }
                case d: {
                    return kz.a().a(la.c, $$6 != false ? $$62 : $$3).a(la.b, la.a.b);
                }
                case e: {
                    return kz.a().a(la.c, $$6 != false ? $$5 : $$2);
                }
                case f: {
                    return kz.a().a(la.c, $$6 != false ? $$62 : $$3);
                }
            }
            throw new UnsupportedOperationException("Fix you generator!");
        });
        this.d($$0);
        this.b.accept(kw.a($$0).a($$72));
    }

    private a a(acq $$0, cpn $$1) {
        return new a($$0, $$1);
    }

    private a d(cpn $$0, cpn $$1) {
        return new a(le.a($$0), $$1);
    }

    private void a(cpn $$0, cfu $$1) {
        acq $$2 = lg.Y.a($$0, lh.a($$1), this.c);
        this.b.accept(kq.c($$0, $$2));
    }

    private void f(cpn $$0, acq $$1) {
        acq $$2 = lg.Y.a($$0, lh.h($$1), this.c);
        this.b.accept(kq.c($$0, $$2));
    }

    private void e(cpn $$0, cpn $$1) {
        this.a($$0);
        acq $$2 = lj.i.get($$0).a($$1, this.c);
        this.b.accept(kq.c($$1, $$2));
    }

    private void p(cpn $$0) {
        this.a($$0.k());
        acq $$1 = lj.j.create($$0, this.c);
        acq $$2 = lj.k.create($$0, this.c);
        acq $$3 = lj.l.create($$0, this.c);
        acq $$4 = lj.m.create($$0, this.c);
        this.b.accept(kv.a($$0).a((ku)ku.a().a(dcr.S, Integer.valueOf(1), new Integer[]{2, 3, 4}).a(dcr.R, ha.c), kz.a().a(la.c, $$1)).a((ku)ku.a().a(dcr.S, Integer.valueOf(1), new Integer[]{2, 3, 4}).a(dcr.R, ha.f), kz.a().a(la.c, $$1).a(la.b, la.a.b)).a((ku)ku.a().a(dcr.S, Integer.valueOf(1), new Integer[]{2, 3, 4}).a(dcr.R, ha.d), kz.a().a(la.c, $$1).a(la.b, la.a.c)).a((ku)ku.a().a(dcr.S, Integer.valueOf(1), new Integer[]{2, 3, 4}).a(dcr.R, ha.e), kz.a().a(la.c, $$1).a(la.b, la.a.d)).a((ku)ku.a().a(dcr.S, Integer.valueOf(2), new Integer[]{3, 4}).a(dcr.R, ha.c), kz.a().a(la.c, $$2)).a((ku)ku.a().a(dcr.S, Integer.valueOf(2), new Integer[]{3, 4}).a(dcr.R, ha.f), kz.a().a(la.c, $$2).a(la.b, la.a.b)).a((ku)ku.a().a(dcr.S, Integer.valueOf(2), new Integer[]{3, 4}).a(dcr.R, ha.d), kz.a().a(la.c, $$2).a(la.b, la.a.c)).a((ku)ku.a().a(dcr.S, Integer.valueOf(2), new Integer[]{3, 4}).a(dcr.R, ha.e), kz.a().a(la.c, $$2).a(la.b, la.a.d)).a((ku)ku.a().a(dcr.S, Integer.valueOf(3), new Integer[]{4}).a(dcr.R, ha.c), kz.a().a(la.c, $$3)).a((ku)ku.a().a(dcr.S, Integer.valueOf(3), new Integer[]{4}).a(dcr.R, ha.f), kz.a().a(la.c, $$3).a(la.b, la.a.b)).a((ku)ku.a().a(dcr.S, Integer.valueOf(3), new Integer[]{4}).a(dcr.R, ha.d), kz.a().a(la.c, $$3).a(la.b, la.a.c)).a((ku)ku.a().a(dcr.S, Integer.valueOf(3), new Integer[]{4}).a(dcr.R, ha.e), kz.a().a(la.c, $$3).a(la.b, la.a.d)).a((ku)ku.a().a(dcr.S, 4).a(dcr.R, ha.c), kz.a().a(la.c, $$4)).a((ku)ku.a().a(dcr.S, 4).a(dcr.R, ha.f), kz.a().a(la.c, $$4).a(la.b, la.a.b)).a((ku)ku.a().a(dcr.S, 4).a(dcr.R, ha.d), kz.a().a(la.c, $$4).a(la.b, la.a.c)).a((ku)ku.a().a(dcr.S, 4).a(dcr.R, ha.e), kz.a().a(la.c, $$4).a(la.b, la.a.d)));
    }

    private void a(lj.a $$0, cpn ... $$1) {
        for (cpn $$2 : $$1) {
            acq $$3 = $$0.create($$2, this.c);
            this.b.accept(kq.b($$2, $$3));
        }
    }

    private void b(lj.a $$0, cpn ... $$1) {
        for (cpn $$2 : $$1) {
            acq $$3 = $$0.create($$2, this.c);
            this.b.accept(kw.a($$2, kz.a().a(la.c, $$3)).a(kq.c()));
        }
    }

    private void f(cpn $$0, cpn $$1) {
        this.a($$0);
        lh $$2 = lh.b($$0, $$1);
        acq $$3 = lg.aG.a($$1, $$2, this.c);
        acq $$4 = lg.aH.a($$1, $$2, this.c);
        acq $$5 = lg.aI.a($$1, $$2, this.c);
        acq $$6 = lg.aE.a($$1, $$2, this.c);
        acq $$7 = lg.aF.a($$1, $$2, this.c);
        cfu $$8 = $$1.k();
        lg.bv.a(le.a($$8), lh.F($$0), this.c);
        this.b.accept(kv.a($$1).a(kz.a().a(la.c, $$3)).a((ku)ku.a().a(dcr.L, true), kz.a().a(la.c, $$4)).a((ku)ku.a().a(dcr.M, true), kz.a().a(la.c, $$4).a(la.b, la.a.b)).a((ku)ku.a().a(dcr.N, true), kz.a().a(la.c, $$5)).a((ku)ku.a().a(dcr.O, true), kz.a().a(la.c, $$5).a(la.b, la.a.b)).a((ku)ku.a().a(dcr.L, false), kz.a().a(la.c, $$6)).a((ku)ku.a().a(dcr.M, false), kz.a().a(la.c, $$7)).a((ku)ku.a().a(dcr.N, false), kz.a().a(la.c, $$7).a(la.b, la.a.b)).a((ku)ku.a().a(dcr.O, false), kz.a().a(la.c, $$6).a(la.b, la.a.d)));
    }

    private void q(cpn $$0) {
        lh $$12 = lh.z($$0);
        acq $$2 = lg.aJ.a($$0, $$12, this.c);
        acq $$3 = this.a($$0, "_conditional", lg.aJ, (acq $$1) -> $$12.c(li.i, (acq)$$1));
        this.b.accept(kw.a($$0).a(kq.a(dcr.c, $$3, $$2)).a(kq.e()));
    }

    private void r(cpn $$0) {
        acq $$1 = lj.q.create($$0, this.c);
        this.b.accept(kq.c($$0, $$1).a(kq.c()));
    }

    private List<kz> a(int $$0) {
        String $$12 = "_age" + $$0;
        return IntStream.range(1, 5).mapToObj($$1 -> kz.a().a(la.c, le.a(cpo.mZ, $$1 + $$12))).collect(Collectors.toList());
    }

    private void m() {
        this.c(cpo.mZ);
        this.b.accept(kv.a(cpo.mZ).a((ku)ku.a().a(dcr.aq, 0), this.a(0)).a((ku)ku.a().a(dcr.aq, 1), this.a(1)).a((ku)ku.a().a(dcr.bk, dcn.b), kz.a().a(la.c, le.a(cpo.mZ, "_small_leaves"))).a((ku)ku.a().a(dcr.bk, dcn.c), kz.a().a(la.c, le.a(cpo.mZ, "_large_leaves"))));
    }

    private kx n() {
        return kx.a(dcr.P).a(ha.a, kz.a().a(la.a, la.a.c)).a(ha.b, kz.a()).a(ha.c, kz.a().a(la.a, la.a.b)).a(ha.d, kz.a().a(la.a, la.a.b).a(la.b, la.a.c)).a(ha.e, kz.a().a(la.a, la.a.b).a(la.b, la.a.d)).a(ha.f, kz.a().a(la.a, la.a.b).a(la.b, la.a.b));
    }

    private void o() {
        acq $$0 = lh.a(cpo.nU, "_top_open");
        this.b.accept(kw.a(cpo.nU).a(this.n()).a(kx.a(dcr.u).a((Boolean)false, kz.a().a(la.c, lj.e.create(cpo.nU, this.c))).a((Boolean)true, kz.a().a(la.c, lj.e.get(cpo.nU).a((lh $$1) -> $$1.a(li.f, $$0)).a(cpo.nU, "_open", this.c)))));
    }

    private static <T extends Comparable<T>> kx a(dde<T> $$0, T $$1, acq $$2, acq $$32) {
        kz $$4 = kz.a().a(la.c, $$2);
        kz $$5 = kz.a().a(la.c, $$32);
        return kx.a($$0).a((T1 $$3) -> {
            boolean $$4 = $$3.compareTo($$1) >= 0;
            return $$4 ? $$4 : $$5;
        });
    }

    private void a(cpn $$0, Function<cpn, lh> $$1) {
        lh $$2 = $$1.apply($$0).b(li.i, li.c);
        lh $$3 = $$2.c(li.g, lh.a($$0, "_front_honey"));
        acq $$4 = lg.o.a($$0, $$2, this.c);
        acq $$5 = lg.o.a($$0, "_honey", $$3, this.c);
        this.b.accept(kw.a($$0).a(kq.b()).a(kq.a(dcr.aN, 5, $$5, $$4)));
    }

    private void a(cpn $$0, dde<Integer> $$1, int ... $$2) {
        if ($$1.a().size() != $$2.length) {
            throw new IllegalArgumentException();
        }
        Int2ObjectOpenHashMap $$3 = new Int2ObjectOpenHashMap();
        kx $$4 = kx.a($$1).a(arg_0 -> this.a($$2, (Int2ObjectMap)$$3, $$0, arg_0));
        this.a($$0.k());
        this.b.accept(kw.a($$0).a($$4));
    }

    private void p() {
        acq $$0 = le.a(cpo.od, "_floor");
        acq $$1 = le.a(cpo.od, "_ceiling");
        acq $$2 = le.a(cpo.od, "_wall");
        acq $$3 = le.a(cpo.od, "_between_walls");
        this.a(cgc.vs);
        this.b.accept(kw.a(cpo.od).a(kx.a(dcr.R, dcr.V).a(ha.c, dcp.a, kz.a().a(la.c, $$0)).a(ha.d, dcp.a, kz.a().a(la.c, $$0).a(la.b, la.a.c)).a(ha.f, dcp.a, kz.a().a(la.c, $$0).a(la.b, la.a.b)).a(ha.e, dcp.a, kz.a().a(la.c, $$0).a(la.b, la.a.d)).a(ha.c, dcp.b, kz.a().a(la.c, $$1)).a(ha.d, dcp.b, kz.a().a(la.c, $$1).a(la.b, la.a.c)).a(ha.f, dcp.b, kz.a().a(la.c, $$1).a(la.b, la.a.b)).a(ha.e, dcp.b, kz.a().a(la.c, $$1).a(la.b, la.a.d)).a(ha.c, dcp.c, kz.a().a(la.c, $$2).a(la.b, la.a.d)).a(ha.d, dcp.c, kz.a().a(la.c, $$2).a(la.b, la.a.b)).a(ha.f, dcp.c, kz.a().a(la.c, $$2)).a(ha.e, dcp.c, kz.a().a(la.c, $$2).a(la.b, la.a.c)).a(ha.d, dcp.d, kz.a().a(la.c, $$3).a(la.b, la.a.b)).a(ha.c, dcp.d, kz.a().a(la.c, $$3).a(la.b, la.a.d)).a(ha.f, dcp.d, kz.a().a(la.c, $$3)).a(ha.e, dcp.d, kz.a().a(la.c, $$3).a(la.b, la.a.c))));
    }

    private void q() {
        this.b.accept(kw.a(cpo.nZ, kz.a().a(la.c, le.a(cpo.nZ))).a(kx.a(dcr.U, dcr.R).a(dcm.a, ha.c, kz.a()).a(dcm.a, ha.f, kz.a().a(la.b, la.a.b)).a(dcm.a, ha.d, kz.a().a(la.b, la.a.c)).a(dcm.a, ha.e, kz.a().a(la.b, la.a.d)).a(dcm.b, ha.c, kz.a().a(la.a, la.a.b)).a(dcm.b, ha.f, kz.a().a(la.a, la.a.b).a(la.b, la.a.b)).a(dcm.b, ha.d, kz.a().a(la.a, la.a.b).a(la.b, la.a.c)).a(dcm.b, ha.e, kz.a().a(la.a, la.a.b).a(la.b, la.a.d)).a(dcm.c, ha.d, kz.a().a(la.a, la.a.c)).a(dcm.c, ha.e, kz.a().a(la.a, la.a.c).a(la.b, la.a.b)).a(dcm.c, ha.c, kz.a().a(la.a, la.a.c).a(la.b, la.a.c)).a(dcm.c, ha.f, kz.a().a(la.a, la.a.c).a(la.b, la.a.d))));
    }

    private void d(cpn $$0, lj.a $$12) {
        acq $$2 = $$12.create($$0, this.c);
        acq $$3 = lh.a($$0, "_front_on");
        acq $$4 = $$12.get($$0).a((lh $$1) -> $$1.a(li.g, $$3)).a($$0, "_on", this.c);
        this.b.accept(kw.a($$0).a(kq.a(dcr.r, $$4, $$2)).a(kq.b()));
    }

    private void a(cpn ... $$0) {
        acq $$1 = le.a("campfire_off");
        for (cpn $$2 : $$0) {
            acq $$3 = lg.ba.a($$2, lh.E($$2), this.c);
            this.a($$2.k());
            this.b.accept(kw.a($$2).a(kq.a(dcr.r, $$3, $$1)).a(kq.c()));
        }
    }

    private void s(cpn $$0) {
        acq $$1 = lg.br.a($$0, lh.l($$0), this.c);
        this.b.accept(kq.c($$0, $$1));
    }

    private void t(cpn $$0) {
        acq $$2;
        if ($$0 == cpo.si) {
            acq $$1 = lg.bt.a($$0, lh.m($$0), this.c);
        } else {
            $$2 = lg.bs.a($$0, lh.m($$0), this.c);
        }
        this.b.accept(kq.c($$0, $$2));
    }

    private void r() {
        lh $$0 = lh.a(lh.G(cpo.cl), lh.G(cpo.n));
        acq $$1 = lg.i.a(cpo.cl, $$0, this.c);
        this.b.accept(kq.c(cpo.cl, $$1));
    }

    private void s() {
        this.a(cgc.ll);
        this.b.accept(kv.a(cpo.cw).a(ku.b(ku.a().a(dcr.ab, ddg.c).a(dcr.aa, ddg.c).a(dcr.ac, ddg.c).a(dcr.ad, ddg.c), ku.a().a(dcr.ab, (Comparable)((Object)ddg.b), (Comparable[])new ddg[]{ddg.a}).a(dcr.aa, (Comparable)((Object)ddg.b), (Comparable[])new ddg[]{ddg.a}), ku.a().a(dcr.aa, (Comparable)((Object)ddg.b), (Comparable[])new ddg[]{ddg.a}).a(dcr.ac, (Comparable)((Object)ddg.b), (Comparable[])new ddg[]{ddg.a}), ku.a().a(dcr.ac, (Comparable)((Object)ddg.b), (Comparable[])new ddg[]{ddg.a}).a(dcr.ad, (Comparable)((Object)ddg.b), (Comparable[])new ddg[]{ddg.a}), ku.a().a(dcr.ad, (Comparable)((Object)ddg.b), (Comparable[])new ddg[]{ddg.a}).a(dcr.ab, (Comparable)((Object)ddg.b), (Comparable[])new ddg[]{ddg.a})), kz.a().a(la.c, le.a("redstone_dust_dot"))).a((ku)ku.a().a(dcr.ab, (Comparable)((Object)ddg.b), (Comparable[])new ddg[]{ddg.a}), kz.a().a(la.c, le.a("redstone_dust_side0"))).a((ku)ku.a().a(dcr.ac, (Comparable)((Object)ddg.b), (Comparable[])new ddg[]{ddg.a}), kz.a().a(la.c, le.a("redstone_dust_side_alt0"))).a((ku)ku.a().a(dcr.aa, (Comparable)((Object)ddg.b), (Comparable[])new ddg[]{ddg.a}), kz.a().a(la.c, le.a("redstone_dust_side_alt1")).a(la.b, la.a.d)).a((ku)ku.a().a(dcr.ad, (Comparable)((Object)ddg.b), (Comparable[])new ddg[]{ddg.a}), kz.a().a(la.c, le.a("redstone_dust_side1")).a(la.b, la.a.d)).a((ku)ku.a().a(dcr.ab, ddg.a), kz.a().a(la.c, le.a("redstone_dust_up"))).a((ku)ku.a().a(dcr.aa, ddg.a), kz.a().a(la.c, le.a("redstone_dust_up")).a(la.b, la.a.b)).a((ku)ku.a().a(dcr.ac, ddg.a), kz.a().a(la.c, le.a("redstone_dust_up")).a(la.b, la.a.c)).a((ku)ku.a().a(dcr.ad, ddg.a), kz.a().a(la.c, le.a("redstone_dust_up")).a(la.b, la.a.d)));
    }

    private void t() {
        this.a(cgc.lp);
        this.b.accept(kw.a(cpo.gY).a(kq.c()).a(kx.a(dcr.bd, dcr.w).a(dcu.a, (Boolean)false, kz.a().a(la.c, le.a(cpo.gY))).a(dcu.a, (Boolean)true, kz.a().a(la.c, le.a(cpo.gY, "_on"))).a(dcu.b, (Boolean)false, kz.a().a(la.c, le.a(cpo.gY, "_subtract"))).a(dcu.b, (Boolean)true, kz.a().a(la.c, le.a(cpo.gY, "_on_subtract")))));
    }

    private void u() {
        lh $$0 = lh.a(cpo.jR);
        lh $$1 = lh.a(lh.a(cpo.jE, "_side"), $$0.a(li.f));
        acq $$2 = lg.Z.a(cpo.jE, $$1, this.c);
        acq $$3 = lg.aa.a(cpo.jE, $$1, this.c);
        acq $$4 = lg.i.b(cpo.jE, "_double", $$1, this.c);
        this.b.accept(kq.e(cpo.jE, $$2, $$3, $$4));
        this.b.accept(kq.c(cpo.jR, lg.c.a(cpo.jR, $$0, this.c)));
    }

    private void v() {
        this.a(cgc.rB);
        this.b.accept(kv.a(cpo.fs).a(kz.a().a(la.c, lh.G(cpo.fs))).a((ku)ku.a().a(dcr.k, true), kz.a().a(la.c, lh.a(cpo.fs, "_bottle0"))).a((ku)ku.a().a(dcr.l, true), kz.a().a(la.c, lh.a(cpo.fs, "_bottle1"))).a((ku)ku.a().a(dcr.m, true), kz.a().a(la.c, lh.a(cpo.fs, "_bottle2"))).a((ku)ku.a().a(dcr.k, false), kz.a().a(la.c, lh.a(cpo.fs, "_empty0"))).a((ku)ku.a().a(dcr.l, false), kz.a().a(la.c, lh.a(cpo.fs, "_empty1"))).a((ku)ku.a().a(dcr.m, false), kz.a().a(la.c, lh.a(cpo.fs, "_empty2"))));
    }

    private void u(cpn $$0) {
        acq $$1 = lg.bn.a($$0, lh.b($$0), this.c);
        acq $$2 = le.a("mushroom_block_inside");
        this.b.accept(kv.a($$0).a((ku)ku.a().a(dcr.L, true), kz.a().a(la.c, $$1)).a((ku)ku.a().a(dcr.M, true), kz.a().a(la.c, $$1).a(la.b, la.a.b).a(la.d, true)).a((ku)ku.a().a(dcr.N, true), kz.a().a(la.c, $$1).a(la.b, la.a.c).a(la.d, true)).a((ku)ku.a().a(dcr.O, true), kz.a().a(la.c, $$1).a(la.b, la.a.d).a(la.d, true)).a((ku)ku.a().a(dcr.J, true), kz.a().a(la.c, $$1).a(la.a, la.a.d).a(la.d, true)).a((ku)ku.a().a(dcr.K, true), kz.a().a(la.c, $$1).a(la.a, la.a.b).a(la.d, true)).a((ku)ku.a().a(dcr.L, false), kz.a().a(la.c, $$2)).a((ku)ku.a().a(dcr.M, false), kz.a().a(la.c, $$2).a(la.b, la.a.b).a(la.d, false)).a((ku)ku.a().a(dcr.N, false), kz.a().a(la.c, $$2).a(la.b, la.a.c).a(la.d, false)).a((ku)ku.a().a(dcr.O, false), kz.a().a(la.c, $$2).a(la.b, la.a.d).a(la.d, false)).a((ku)ku.a().a(dcr.J, false), kz.a().a(la.c, $$2).a(la.a, la.a.d).a(la.d, false)).a((ku)ku.a().a(dcr.K, false), kz.a().a(la.c, $$2).a(la.a, la.a.b).a(la.d, false)));
        this.a($$0, lj.a.createWithSuffix($$0, "_inventory", this.c));
    }

    private void w() {
        this.a(cgc.qN);
        this.b.accept(kw.a(cpo.eh).a(kx.a(dcr.ay).a((Integer)0, kz.a().a(la.c, le.a(cpo.eh))).a((Integer)1, kz.a().a(la.c, le.a(cpo.eh, "_slice1"))).a((Integer)2, kz.a().a(la.c, le.a(cpo.eh, "_slice2"))).a((Integer)3, kz.a().a(la.c, le.a(cpo.eh, "_slice3"))).a((Integer)4, kz.a().a(la.c, le.a(cpo.eh, "_slice4"))).a((Integer)5, kz.a().a(la.c, le.a(cpo.eh, "_slice5"))).a((Integer)6, kz.a().a(la.c, le.a(cpo.eh, "_slice6")))));
    }

    private void x() {
        lh $$0 = new lh().a(li.c, lh.a(cpo.nX, "_side3")).a(li.o, lh.G(cpo.t)).a(li.n, lh.a(cpo.nX, "_top")).a(li.j, lh.a(cpo.nX, "_side3")).a(li.l, lh.a(cpo.nX, "_side3")).a(li.k, lh.a(cpo.nX, "_side1")).a(li.m, lh.a(cpo.nX, "_side2"));
        this.b.accept(kq.c(cpo.nX, lg.a.a(cpo.nX, $$0, this.c)));
    }

    private void y() {
        lh $$0 = new lh().a(li.c, lh.a(cpo.ob, "_front")).a(li.o, lh.a(cpo.ob, "_bottom")).a(li.n, lh.a(cpo.ob, "_top")).a(li.j, lh.a(cpo.ob, "_front")).a(li.k, lh.a(cpo.ob, "_front")).a(li.l, lh.a(cpo.ob, "_side")).a(li.m, lh.a(cpo.ob, "_side"));
        this.b.accept(kq.c(cpo.ob, lg.a.a(cpo.ob, $$0, this.c)));
    }

    private void a(cpn $$0, cpn $$1, BiFunction<cpn, cpn, lh> $$2) {
        lh $$3 = $$2.apply($$0, $$1);
        this.b.accept(kq.c($$0, lg.a.a($$0, $$3, this.c)));
    }

    public void b(cpn $$0) {
        lh $$1 = new lh().a(li.c, lh.a($$0, "_particle")).a(li.o, lh.a($$0, "_down")).a(li.n, lh.a($$0, "_up")).a(li.j, lh.a($$0, "_north")).a(li.k, lh.a($$0, "_south")).a(li.l, lh.a($$0, "_east")).a(li.m, lh.a($$0, "_west"));
        this.b.accept(kq.c($$0, lg.a.a($$0, $$1, this.c)));
    }

    private void z() {
        lh $$0 = lh.k(cpo.dV);
        this.b.accept(kq.c(cpo.dV, le.a(cpo.dV)));
        this.a(cpo.ef, $$0);
        this.a(cpo.eg, $$0);
    }

    private void a(cpn $$0, lh $$1) {
        acq $$2 = lg.n.a($$0, $$1.c(li.g, lh.G($$0)), this.c);
        this.b.accept(kw.a($$0, kz.a().a(la.c, $$2)).a(kq.b()));
    }

    private void A() {
        this.a(cgc.rC);
        this.m(cpo.ft);
        this.b.accept(kq.c(cpo.fv, lg.bq.a(cpo.fv, lh.j(lh.a(cpo.H, "_still")), this.c)));
        this.b.accept(kw.a(cpo.fu).a(kx.a(ctt.e).a((Integer)1, kz.a().a(la.c, lg.bo.a(cpo.fu, "_level1", lh.j(lh.a(cpo.G, "_still")), this.c))).a((Integer)2, kz.a().a(la.c, lg.bp.a(cpo.fu, "_level2", lh.j(lh.a(cpo.G, "_still")), this.c))).a((Integer)3, kz.a().a(la.c, lg.bq.a(cpo.fu, "_full", lh.j(lh.a(cpo.G, "_still")), this.c)))));
        this.b.accept(kw.a(cpo.fw).a(kx.a(ctt.e).a((Integer)1, kz.a().a(la.c, lg.bo.a(cpo.fw, "_level1", lh.j(lh.G(cpo.qC)), this.c))).a((Integer)2, kz.a().a(la.c, lg.bp.a(cpo.fw, "_level2", lh.j(lh.G(cpo.qC)), this.c))).a((Integer)3, kz.a().a(la.c, lg.bq.a(cpo.fw, "_full", lh.j(lh.G(cpo.qC)), this.c)))));
    }

    private void B() {
        lh $$0 = lh.b(cpo.kv);
        acq $$12 = lg.aC.a(cpo.kv, $$0, this.c);
        acq $$2 = this.a(cpo.kv, "_dead", lg.aC, (acq $$1) -> $$0.c(li.b, (acq)$$1));
        this.b.accept(kw.a(cpo.kv).a(kq.a(dcr.au, 5, $$2, $$12)));
    }

    private void v(cpn $$0) {
        lh $$1 = new lh().a(li.f, lh.a(cpo.cD, "_top")).a(li.i, lh.a(cpo.cD, "_side")).a(li.g, lh.a($$0, "_front"));
        lh $$2 = new lh().a(li.i, lh.a(cpo.cD, "_top")).a(li.g, lh.a($$0, "_front_vertical"));
        acq $$3 = lg.n.a($$0, $$1, this.c);
        acq $$4 = lg.p.a($$0, $$2, this.c);
        this.b.accept(kw.a($$0).a(kx.a(dcr.P).a(ha.a, kz.a().a(la.c, $$4).a(la.a, la.a.c)).a(ha.b, kz.a().a(la.c, $$4)).a(ha.c, kz.a().a(la.c, $$3)).a(ha.f, kz.a().a(la.c, $$3).a(la.b, la.a.b)).a(ha.d, kz.a().a(la.c, $$3).a(la.b, la.a.c)).a(ha.e, kz.a().a(la.c, $$3).a(la.b, la.a.d))));
    }

    private void C() {
        acq $$0 = le.a(cpo.fy);
        acq $$1 = le.a(cpo.fy, "_filled");
        this.b.accept(kw.a(cpo.fy).a(kx.a(dcr.h).a((Boolean)false, kz.a().a(la.c, $$0)).a((Boolean)true, kz.a().a(la.c, $$1))).a(kq.c()));
    }

    private void D() {
        acq $$0 = le.a(cpo.ku, "_side");
        acq $$1 = le.a(cpo.ku, "_noside");
        acq $$2 = le.a(cpo.ku, "_noside1");
        acq $$3 = le.a(cpo.ku, "_noside2");
        acq $$4 = le.a(cpo.ku, "_noside3");
        this.b.accept(kv.a(cpo.ku).a((ku)ku.a().a(dcr.L, true), kz.a().a(la.c, $$0)).a((ku)ku.a().a(dcr.M, true), kz.a().a(la.c, $$0).a(la.b, la.a.b).a(la.d, true)).a((ku)ku.a().a(dcr.N, true), kz.a().a(la.c, $$0).a(la.b, la.a.c).a(la.d, true)).a((ku)ku.a().a(dcr.O, true), kz.a().a(la.c, $$0).a(la.b, la.a.d).a(la.d, true)).a((ku)ku.a().a(dcr.J, true), kz.a().a(la.c, $$0).a(la.a, la.a.d).a(la.d, true)).a((ku)ku.a().a(dcr.K, true), kz.a().a(la.c, $$0).a(la.a, la.a.b).a(la.d, true)).a((ku)ku.a().a(dcr.L, false), kz.a().a(la.c, $$1).a(la.e, 2), kz.a().a(la.c, $$2), kz.a().a(la.c, $$3), kz.a().a(la.c, $$4)).a((ku)ku.a().a(dcr.M, false), kz.a().a(la.c, $$2).a(la.b, la.a.b).a(la.d, true), kz.a().a(la.c, $$3).a(la.b, la.a.b).a(la.d, true), kz.a().a(la.c, $$4).a(la.b, la.a.b).a(la.d, true), kz.a().a(la.c, $$1).a(la.e, 2).a(la.b, la.a.b).a(la.d, true)).a((ku)ku.a().a(dcr.N, false), kz.a().a(la.c, $$3).a(la.b, la.a.c).a(la.d, true), kz.a().a(la.c, $$4).a(la.b, la.a.c).a(la.d, true), kz.a().a(la.c, $$1).a(la.e, 2).a(la.b, la.a.c).a(la.d, true), kz.a().a(la.c, $$2).a(la.b, la.a.c).a(la.d, true)).a((ku)ku.a().a(dcr.O, false), kz.a().a(la.c, $$4).a(la.b, la.a.d).a(la.d, true), kz.a().a(la.c, $$1).a(la.e, 2).a(la.b, la.a.d).a(la.d, true), kz.a().a(la.c, $$2).a(la.b, la.a.d).a(la.d, true), kz.a().a(la.c, $$3).a(la.b, la.a.d).a(la.d, true)).a((ku)ku.a().a(dcr.J, false), kz.a().a(la.c, $$1).a(la.e, 2).a(la.a, la.a.d).a(la.d, true), kz.a().a(la.c, $$4).a(la.a, la.a.d).a(la.d, true), kz.a().a(la.c, $$2).a(la.a, la.a.d).a(la.d, true), kz.a().a(la.c, $$3).a(la.a, la.a.d).a(la.d, true)).a((ku)ku.a().a(dcr.K, false), kz.a().a(la.c, $$4).a(la.a, la.a.b).a(la.d, true), kz.a().a(la.c, $$3).a(la.a, la.a.b).a(la.d, true), kz.a().a(la.c, $$2).a(la.a, la.a.b).a(la.d, true), kz.a().a(la.c, $$1).a(la.e, 2).a(la.a, la.a.b).a(la.d, true)));
    }

    private void E() {
        this.b.accept(kv.a(cpo.pc).a(kz.a().a(la.c, lh.G(cpo.pc))).a((ku)ku.a().a(dcr.aL, 1), kz.a().a(la.c, lh.a(cpo.pc, "_contents1"))).a((ku)ku.a().a(dcr.aL, 2), kz.a().a(la.c, lh.a(cpo.pc, "_contents2"))).a((ku)ku.a().a(dcr.aL, 3), kz.a().a(la.c, lh.a(cpo.pc, "_contents3"))).a((ku)ku.a().a(dcr.aL, 4), kz.a().a(la.c, lh.a(cpo.pc, "_contents4"))).a((ku)ku.a().a(dcr.aL, 5), kz.a().a(la.c, lh.a(cpo.pc, "_contents5"))).a((ku)ku.a().a(dcr.aL, 6), kz.a().a(la.c, lh.a(cpo.pc, "_contents6"))).a((ku)ku.a().a(dcr.aL, 7), kz.a().a(la.c, lh.a(cpo.pc, "_contents7"))).a((ku)ku.a().a(dcr.aL, 8), kz.a().a(la.c, lh.a(cpo.pc, "_contents_ready"))));
    }

    private void w(cpn $$0) {
        this.c($$0);
        this.b.accept(kw.a($$0, kz.a().a(la.c, lg.am.a($$0, lh.c($$0), this.c))).a(this.n()));
    }

    private void F() {
        this.w(cpo.qy);
        this.w(cpo.qx);
        this.w(cpo.qw);
        this.w(cpo.qv);
    }

    private void G() {
        this.c(cpo.rs);
        kx.b<ha, dcy> $$0 = kx.a(dcr.bm, dcr.bn);
        for (dcy $$1 : dcy.values()) {
            $$0.a(ha.b, $$1, this.a(ha.b, $$1));
        }
        for (dcy $$2 : dcy.values()) {
            $$0.a(ha.a, $$2, this.a(ha.a, $$2));
        }
        this.b.accept(kw.a(cpo.rs).a($$0));
    }

    private kz a(ha $$0, dcy $$1) {
        String $$2 = "_" + $$0.c() + "_" + $$1.c();
        lh $$3 = lh.c(lh.a(cpo.rs, $$2));
        return kz.a().a(la.c, lg.al.a(cpo.rs, $$2, $$3, this.c));
    }

    private void x(cpn $$0) {
        lh $$1 = new lh().a(li.e, lh.G(cpo.dW)).a(li.f, lh.G($$0)).a(li.i, lh.a($$0, "_side"));
        this.b.accept(kq.c($$0, lg.m.a($$0, $$1, this.c)));
    }

    private void H() {
        acq $$0 = lh.a(cpo.gZ, "_side");
        lh $$1 = new lh().a(li.f, lh.a(cpo.gZ, "_top")).a(li.i, $$0);
        lh $$2 = new lh().a(li.f, lh.a(cpo.gZ, "_inverted_top")).a(li.i, $$0);
        this.b.accept(kw.a(cpo.gZ).a(kx.a(dcr.p).a((Boolean)false, kz.a().a(la.c, lg.aD.a(cpo.gZ, $$1, this.c))).a((Boolean)true, kz.a().a(la.c, lg.aD.a(le.a(cpo.gZ, "_inverted"), $$2, this.c)))));
    }

    private void y(cpn $$0) {
        this.b.accept(kw.a($$0, kz.a().a(la.c, le.a($$0))).a(this.n()));
    }

    private void I() {
        cpn $$0 = cpo.rr;
        acq $$1 = le.a($$0, "_on");
        acq $$2 = le.a($$0);
        this.b.accept(kw.a($$0, kz.a().a(la.c, le.a($$0))).a(this.n()).a(kq.a(dcr.w, $$1, $$2)));
    }

    private void J() {
        lh $$0 = new lh().a(li.B, lh.G(cpo.j)).a(li.f, lh.G(cpo.cC));
        lh $$1 = new lh().a(li.B, lh.G(cpo.j)).a(li.f, lh.a(cpo.cC, "_moist"));
        acq $$2 = lg.aU.a(cpo.cC, $$0, this.c);
        acq $$3 = lg.aU.a(lh.a(cpo.cC, "_moist"), $$1, this.c);
        this.b.accept(kw.a(cpo.cC).a(kq.a(dcr.aQ, 7, $$3, $$2)));
    }

    private List<acq> z(cpn $$0) {
        acq $$1 = lg.aV.a(le.a($$0, "_floor0"), lh.v($$0), this.c);
        acq $$2 = lg.aV.a(le.a($$0, "_floor1"), lh.w($$0), this.c);
        return ImmutableList.of((Object)$$1, (Object)$$2);
    }

    private List<acq> A(cpn $$0) {
        acq $$1 = lg.aW.a(le.a($$0, "_side0"), lh.v($$0), this.c);
        acq $$2 = lg.aW.a(le.a($$0, "_side1"), lh.w($$0), this.c);
        acq $$3 = lg.aX.a(le.a($$0, "_side_alt0"), lh.v($$0), this.c);
        acq $$4 = lg.aX.a(le.a($$0, "_side_alt1"), lh.w($$0), this.c);
        return ImmutableList.of((Object)$$1, (Object)$$2, (Object)$$3, (Object)$$4);
    }

    private List<acq> B(cpn $$0) {
        acq $$1 = lg.aY.a(le.a($$0, "_up0"), lh.v($$0), this.c);
        acq $$2 = lg.aY.a(le.a($$0, "_up1"), lh.w($$0), this.c);
        acq $$3 = lg.aZ.a(le.a($$0, "_up_alt0"), lh.v($$0), this.c);
        acq $$4 = lg.aZ.a(le.a($$0, "_up_alt1"), lh.w($$0), this.c);
        return ImmutableList.of((Object)$$1, (Object)$$2, (Object)$$3, (Object)$$4);
    }

    private static List<kz> a(List<acq> $$02, UnaryOperator<kz> $$1) {
        return $$02.stream().map($$0 -> kz.a().a(la.c, $$0)).map($$1).collect(Collectors.toList());
    }

    private void K() {
        ku.c $$02 = ku.a().a(dcr.L, false).a(dcr.M, false).a(dcr.N, false).a(dcr.O, false).a(dcr.J, false);
        List<acq> $$1 = this.z(cpo.cr);
        List<acq> $$2 = this.A(cpo.cr);
        List<acq> $$3 = this.B(cpo.cr);
        this.b.accept(kv.a(cpo.cr).a((ku)$$02, kq.a($$1, $$0 -> $$0)).a(ku.b(ku.a().a(dcr.L, true), $$02), kq.a($$2, $$0 -> $$0)).a(ku.b(ku.a().a(dcr.M, true), $$02), kq.a($$2, $$0 -> $$0.a(la.b, la.a.b))).a(ku.b(ku.a().a(dcr.N, true), $$02), kq.a($$2, $$0 -> $$0.a(la.b, la.a.c))).a(ku.b(ku.a().a(dcr.O, true), $$02), kq.a($$2, $$0 -> $$0.a(la.b, la.a.d))).a((ku)ku.a().a(dcr.J, true), kq.a($$3, $$0 -> $$0)));
    }

    private void L() {
        List<acq> $$02 = this.z(cpo.cs);
        List<acq> $$1 = this.A(cpo.cs);
        this.b.accept(kv.a(cpo.cs).a(kq.a($$02, $$0 -> $$0)).a(kq.a($$1, $$0 -> $$0)).a(kq.a($$1, $$0 -> $$0.a(la.b, la.a.b))).a(kq.a($$1, $$0 -> $$0.a(la.b, la.a.c))).a(kq.a($$1, $$0 -> $$0.a(la.b, la.a.d))));
    }

    private void C(cpn $$0) {
        acq $$1 = lj.s.create($$0, this.c);
        acq $$2 = lj.t.create($$0, this.c);
        this.a($$0.k());
        this.b.accept(kw.a($$0).a(kq.a(dcr.j, $$2, $$1)));
    }

    private void M() {
        lh $$0 = lh.a(lh.a(cpo.ad, "_side"), lh.a(cpo.ad, "_top"));
        acq $$1 = lg.i.a(cpo.ad, $$0, this.c);
        this.b.accept(kq.d(cpo.ad, $$1));
    }

    private void N() {
        this.a(cgc.Q);
        cpn $$0 = cpo.E;
        kx.b<Boolean, Integer> $$1 = kx.a(cuf.c, cuf.a);
        acq $$2 = le.a($$0);
        for (int $$3 = 0; $$3 <= 4; ++$$3) {
            acq $$4 = le.a($$0, "_hanging_" + $$3);
            $$1.a((Boolean)true, (Integer)$$3, kz.a().a(la.c, $$4));
            $$1.a((Boolean)false, (Integer)$$3, kz.a().a(la.c, $$2));
        }
        this.b.accept(kw.a(cpo.E).a($$1));
    }

    private void O() {
        this.b.accept(kw.a(cpo.kI).a(kx.a(dcr.as).a((Integer)0, kz.a().a(la.c, this.a(cpo.kI, "_0", lg.c, lh::b))).a((Integer)1, kz.a().a(la.c, this.a(cpo.kI, "_1", lg.c, lh::b))).a((Integer)2, kz.a().a(la.c, this.a(cpo.kI, "_2", lg.c, lh::b))).a((Integer)3, kz.a().a(la.c, this.a(cpo.kI, "_3", lg.c, lh::b)))));
    }

    private void P() {
        acq $$0 = lh.G(cpo.j);
        lh $$12 = new lh().a(li.e, $$0).b(li.e, li.c).a(li.f, lh.a(cpo.i, "_top")).a(li.i, lh.a(cpo.i, "_snow"));
        kz $$2 = kz.a().a(la.c, lg.m.a(cpo.i, "_snow", $$12, this.c));
        this.a(cpo.i, le.a(cpo.i), $$2);
        acq $$3 = lj.e.get(cpo.fl).a((lh $$1) -> $$1.a(li.e, $$0)).a(cpo.fl, this.c);
        this.a(cpo.fl, $$3, $$2);
        acq $$4 = lj.e.get(cpo.l).a((lh $$1) -> $$1.a(li.e, $$0)).a(cpo.l, this.c);
        this.a(cpo.l, $$4, $$2);
    }

    private void a(cpn $$0, acq $$1, kz $$2) {
        List<kz> $$3 = Arrays.asList(kq.a($$1));
        this.b.accept(kw.a($$0).a(kx.a(dcr.z).a((Boolean)true, $$2).a((Boolean)false, $$3)));
    }

    private void Q() {
        this.a(cgc.qt);
        this.b.accept(kw.a(cpo.fC).a(kx.a(dcr.ar).a((Integer)0, kz.a().a(la.c, le.a(cpo.fC, "_stage0"))).a((Integer)1, kz.a().a(la.c, le.a(cpo.fC, "_stage1"))).a((Integer)2, kz.a().a(la.c, le.a(cpo.fC, "_stage2")))).a(kq.c()));
    }

    private void R() {
        this.b.accept(kq.b(cpo.kE, le.a(cpo.kE)));
    }

    private void g(cpn $$0, cpn $$1) {
        lh $$2 = lh.b($$1);
        acq $$3 = lg.W.a($$0, $$2, this.c);
        acq $$4 = lg.X.a($$0, $$2, this.c);
        this.b.accept(kw.a($$0).a(kq.a(dcr.aT, 1, $$4, $$3)));
    }

    private void S() {
        acq $$0 = le.a(cpo.hc);
        acq $$1 = le.a(cpo.hc, "_side");
        this.a(cgc.lv);
        this.b.accept(kw.a(cpo.hc).a(kx.a(dcr.Q).a(ha.a, kz.a().a(la.c, $$0)).a(ha.c, kz.a().a(la.c, $$1)).a(ha.f, kz.a().a(la.c, $$1).a(la.b, la.a.b)).a(ha.d, kz.a().a(la.c, $$1).a(la.b, la.a.c)).a(ha.e, kz.a().a(la.c, $$1).a(la.b, la.a.d))));
    }

    private void h(cpn $$0, cpn $$1) {
        acq $$2 = le.a($$0);
        this.b.accept(kw.a($$1, kz.a().a(la.c, $$2)));
        this.a($$1, $$2);
    }

    private void T() {
        acq $$0 = le.a(cpo.eX, "_post_ends");
        acq $$1 = le.a(cpo.eX, "_post");
        acq $$2 = le.a(cpo.eX, "_cap");
        acq $$3 = le.a(cpo.eX, "_cap_alt");
        acq $$4 = le.a(cpo.eX, "_side");
        acq $$5 = le.a(cpo.eX, "_side_alt");
        this.b.accept(kv.a(cpo.eX).a(kz.a().a(la.c, $$0)).a((ku)ku.a().a(dcr.L, false).a(dcr.M, false).a(dcr.N, false).a(dcr.O, false), kz.a().a(la.c, $$1)).a((ku)ku.a().a(dcr.L, true).a(dcr.M, false).a(dcr.N, false).a(dcr.O, false), kz.a().a(la.c, $$2)).a((ku)ku.a().a(dcr.L, false).a(dcr.M, true).a(dcr.N, false).a(dcr.O, false), kz.a().a(la.c, $$2).a(la.b, la.a.b)).a((ku)ku.a().a(dcr.L, false).a(dcr.M, false).a(dcr.N, true).a(dcr.O, false), kz.a().a(la.c, $$3)).a((ku)ku.a().a(dcr.L, false).a(dcr.M, false).a(dcr.N, false).a(dcr.O, true), kz.a().a(la.c, $$3).a(la.b, la.a.b)).a((ku)ku.a().a(dcr.L, true), kz.a().a(la.c, $$4)).a((ku)ku.a().a(dcr.M, true), kz.a().a(la.c, $$4).a(la.b, la.a.b)).a((ku)ku.a().a(dcr.N, true), kz.a().a(la.c, $$5)).a((ku)ku.a().a(dcr.O, true), kz.a().a(la.c, $$5).a(la.b, la.a.b)));
        this.d(cpo.eX);
    }

    private void D(cpn $$0) {
        this.b.accept(kw.a($$0, kz.a().a(la.c, le.a($$0))).a(kq.b()));
    }

    private void U() {
        acq $$0 = le.a(cpo.dw);
        acq $$1 = le.a(cpo.dw, "_on");
        this.d(cpo.dw);
        this.b.accept(kw.a(cpo.dw).a(kq.a(dcr.w, $$0, $$1)).a(kx.a(dcr.U, dcr.R).a(dcm.c, ha.c, kz.a().a(la.a, la.a.c).a(la.b, la.a.c)).a(dcm.c, ha.f, kz.a().a(la.a, la.a.c).a(la.b, la.a.d)).a(dcm.c, ha.d, kz.a().a(la.a, la.a.c)).a(dcm.c, ha.e, kz.a().a(la.a, la.a.c).a(la.b, la.a.b)).a(dcm.a, ha.c, kz.a()).a(dcm.a, ha.f, kz.a().a(la.b, la.a.b)).a(dcm.a, ha.d, kz.a().a(la.b, la.a.c)).a(dcm.a, ha.e, kz.a().a(la.b, la.a.d)).a(dcm.b, ha.c, kz.a().a(la.a, la.a.b)).a(dcm.b, ha.f, kz.a().a(la.a, la.a.b).a(la.b, la.a.b)).a(dcm.b, ha.d, kz.a().a(la.a, la.a.b).a(la.b, la.a.c)).a(dcm.b, ha.e, kz.a().a(la.a, la.a.b).a(la.b, la.a.d))));
    }

    private void V() {
        this.d(cpo.fm);
        this.b.accept(kq.b(cpo.fm, le.a(cpo.fm)));
    }

    private void W() {
        this.d(cpo.sm);
        this.b.accept(kq.c(cpo.sm, le.a(cpo.sm)));
    }

    private void X() {
        this.b.accept(kw.a(cpo.ee).a(kx.a(dcr.H).a(ha.a.a, kz.a().a(la.c, le.a(cpo.ee, "_ns"))).a(ha.a.c, kz.a().a(la.c, le.a(cpo.ee, "_ew")))));
    }

    private void Y() {
        acq $$0 = lj.a.create(cpo.dW, this.c);
        this.b.accept(kw.a(cpo.dW, kz.a().a(la.c, $$0), kz.a().a(la.c, $$0).a(la.a, la.a.b), kz.a().a(la.c, $$0).a(la.a, la.a.c), kz.a().a(la.c, $$0).a(la.a, la.a.d), kz.a().a(la.c, $$0).a(la.b, la.a.b), kz.a().a(la.c, $$0).a(la.b, la.a.b).a(la.a, la.a.b), kz.a().a(la.c, $$0).a(la.b, la.a.b).a(la.a, la.a.c), kz.a().a(la.c, $$0).a(la.b, la.a.b).a(la.a, la.a.d), kz.a().a(la.c, $$0).a(la.b, la.a.c), kz.a().a(la.c, $$0).a(la.b, la.a.c).a(la.a, la.a.b), kz.a().a(la.c, $$0).a(la.b, la.a.c).a(la.a, la.a.c), kz.a().a(la.c, $$0).a(la.b, la.a.c).a(la.a, la.a.d), kz.a().a(la.c, $$0).a(la.b, la.a.d), kz.a().a(la.c, $$0).a(la.b, la.a.d).a(la.a, la.a.b), kz.a().a(la.c, $$0).a(la.b, la.a.d).a(la.a, la.a.c), kz.a().a(la.c, $$0).a(la.b, la.a.d).a(la.a, la.a.d)));
    }

    private void Z() {
        acq $$0 = le.a(cpo.kO);
        acq $$1 = le.a(cpo.kO, "_on");
        this.b.accept(kw.a(cpo.kO).a(kq.a(dcr.w, $$1, $$0)).a(kq.e()));
    }

    private void aa() {
        lh $$0 = new lh().a(li.e, lh.a(cpo.by, "_bottom")).a(li.i, lh.a(cpo.by, "_side"));
        acq $$1 = lh.a(cpo.by, "_top_sticky");
        acq $$2 = lh.a(cpo.by, "_top");
        lh $$3 = $$0.c(li.E, $$1);
        lh $$4 = $$0.c(li.E, $$2);
        acq $$5 = le.a(cpo.by, "_base");
        this.a(cpo.by, $$5, $$4);
        this.a(cpo.br, $$5, $$3);
        acq $$6 = lg.m.a(cpo.by, "_inventory", $$0.c(li.f, $$2), this.c);
        acq $$7 = lg.m.a(cpo.br, "_inventory", $$0.c(li.f, $$1), this.c);
        this.a(cpo.by, $$6);
        this.a(cpo.br, $$7);
    }

    private void a(cpn $$0, acq $$1, lh $$2) {
        acq $$3 = lg.bf.a($$0, $$2, this.c);
        this.b.accept(kw.a($$0).a(kq.a(dcr.g, $$1, $$3)).a(kq.e()));
    }

    private void ab() {
        lh $$0 = new lh().a(li.F, lh.a(cpo.by, "_top")).a(li.i, lh.a(cpo.by, "_side"));
        lh $$1 = $$0.c(li.E, lh.a(cpo.by, "_top_sticky"));
        lh $$2 = $$0.c(li.E, lh.a(cpo.by, "_top"));
        this.b.accept(kw.a(cpo.bz).a(kx.a(dcr.x, dcr.bg).a((Boolean)false, ddd.a, kz.a().a(la.c, lg.bg.a(cpo.by, "_head", $$2, this.c))).a((Boolean)false, ddd.b, kz.a().a(la.c, lg.bg.a(cpo.by, "_head_sticky", $$1, this.c))).a((Boolean)true, ddd.a, kz.a().a(la.c, lg.bh.a(cpo.by, "_head_short", $$2, this.c))).a((Boolean)true, ddd.b, kz.a().a(la.c, lg.bh.a(cpo.by, "_head_short_sticky", $$1, this.c)))).a(kq.e()));
    }

    private void ac() {
        acq $$0 = le.a(cpo.qD, "_inactive");
        acq $$1 = le.a(cpo.qD, "_active");
        this.a(cpo.qD, $$0);
        this.b.accept(kw.a(cpo.qD).a(kx.a(dcr.bo).a((T1 $$2) -> kz.a().a(la.c, $$2 == ddi.b || $$2 == ddi.c ? $$1 : $$0))));
    }

    private void ad() {
        acq $$0 = le.a(cpo.qE, "_inactive");
        acq $$1 = le.a(cpo.qE, "_active");
        this.a(cpo.qE, $$0);
        this.b.accept(kw.a(cpo.qE).a(kx.a(dcr.bo).a((T1 $$2) -> kz.a().a(la.c, $$2 == ddi.b || $$2 == ddi.c ? $$1 : $$0))).a(kq.b()));
    }

    private void ae() {
        acq $$0 = lg.bK.a(cpo.qI, lh.a(false), this.c);
        acq $$1 = lg.bK.a(cpo.qI, "_can_summon", lh.a(true), this.c);
        this.a(cpo.qI, $$0);
        this.b.accept(kw.a(cpo.qI).a(kq.a(dcr.G, $$1, $$0)));
    }

    private void af() {
        acq $$0 = le.a(cpo.nS, "_stable");
        acq $$1 = le.a(cpo.nS, "_unstable");
        this.a(cpo.nS, $$0);
        this.b.accept(kw.a(cpo.nS).a(kq.a(dcr.b, $$1, $$0)));
    }

    private void ag() {
        acq $$0 = this.a(cpo.ru, "", lg.am, lh::c);
        acq $$1 = this.a(cpo.ru, "_lit", lg.am, lh::c);
        this.b.accept(kw.a(cpo.ru).a(kq.a(dcr.D, $$1, $$0)));
        acq $$2 = this.a(cpo.rv, "", lg.am, lh::c);
        acq $$3 = this.a(cpo.rv, "_lit", lg.am, lh::c);
        this.b.accept(kw.a(cpo.rv).a(kq.a(dcr.D, $$3, $$2)));
    }

    private void ah() {
        acq $$0 = lj.a.create(cpo.fB, this.c);
        acq $$1 = this.a(cpo.fB, "_on", lg.c, lh::b);
        this.b.accept(kw.a(cpo.fB).a(kq.a(dcr.r, $$1, $$0)));
    }

    private void i(cpn $$0, cpn $$1) {
        lh $$2 = lh.y($$0);
        this.b.accept(kq.c($$0, lg.bd.a($$0, $$2, this.c)));
        this.b.accept(kw.a($$1, kz.a().a(la.c, lg.be.a($$1, $$2, this.c))).a(kq.d()));
        this.d($$0);
        this.c($$1);
    }

    private void ai() {
        lh $$0 = lh.y(cpo.dK);
        lh $$1 = lh.i(lh.a(cpo.dK, "_off"));
        acq $$2 = lg.bd.a(cpo.dK, $$0, this.c);
        acq $$3 = lg.bd.a(cpo.dK, "_off", $$1, this.c);
        this.b.accept(kw.a(cpo.dK).a(kq.a(dcr.r, $$2, $$3)));
        acq $$4 = lg.be.a(cpo.dL, $$0, this.c);
        acq $$5 = lg.be.a(cpo.dL, "_off", $$1, this.c);
        this.b.accept(kw.a(cpo.dL).a(kq.a(dcr.r, $$4, $$5)).a(kq.d()));
        this.d(cpo.dK);
        this.c(cpo.dL);
    }

    private void aj() {
        this.a(cgc.lo);
        this.b.accept(kw.a(cpo.ei).a(kx.a(dcr.aA, dcr.s, dcr.w).a((T1 $$0, T2 $$1, T3 $$2) -> {
            StringBuilder $$3 = new StringBuilder();
            $$3.append('_').append($$0).append("tick");
            if ($$2.booleanValue()) {
                $$3.append("_on");
            }
            if ($$1.booleanValue()) {
                $$3.append("_locked");
            }
            return kz.a().a(la.c, lh.a(cpo.ei, $$3.toString()));
        })).a(kq.c()));
    }

    private void ak() {
        this.a(cgc.cx);
        this.b.accept(kw.a(cpo.mV).a(kx.a(dcr.aS, dcr.C).a((Integer)1, (Boolean)false, Arrays.asList(kq.a(le.a("dead_sea_pickle")))).a((Integer)2, (Boolean)false, Arrays.asList(kq.a(le.a("two_dead_sea_pickles")))).a((Integer)3, (Boolean)false, Arrays.asList(kq.a(le.a("three_dead_sea_pickles")))).a((Integer)4, (Boolean)false, Arrays.asList(kq.a(le.a("four_dead_sea_pickles")))).a((Integer)1, (Boolean)true, Arrays.asList(kq.a(le.a("sea_pickle")))).a((Integer)2, (Boolean)true, Arrays.asList(kq.a(le.a("two_sea_pickles")))).a((Integer)3, (Boolean)true, Arrays.asList(kq.a(le.a("three_sea_pickles")))).a((Integer)4, (Boolean)true, Arrays.asList(kq.a(le.a("four_sea_pickles"))))));
    }

    private void al() {
        lh $$0 = lh.a(cpo.dN);
        acq $$12 = lg.c.a(cpo.dP, $$0, this.c);
        this.b.accept(kw.a(cpo.dN).a(kx.a(dcr.aF).a((T1 $$1) -> kz.a().a(la.c, $$1 < 8 ? le.a(cpo.dN, "_height" + $$1 * 2) : $$12))));
        this.a(cpo.dN, le.a(cpo.dN, "_height2"));
        this.b.accept(kq.c(cpo.dP, $$12));
    }

    private void am() {
        this.b.accept(kw.a(cpo.oc, kz.a().a(la.c, le.a(cpo.oc))).a(kq.b()));
    }

    private void an() {
        acq $$02 = lj.a.create(cpo.pa, this.c);
        this.a(cpo.pa, $$02);
        this.b.accept(kw.a(cpo.pa).a(kx.a(dcr.bj).a((T1 $$0) -> kz.a().a(la.c, this.a(cpo.pa, "_" + $$0.c(), lg.c, lh::b)))));
    }

    private void ao() {
        this.a(cgc.vv);
        this.b.accept(kw.a(cpo.oi).a(kx.a(dcr.as).a((T1 $$0) -> kz.a().a(la.c, this.a(cpo.oi, "_stage" + $$0, lg.am, lh::c)))));
    }

    private void ap() {
        this.a(cgc.oE);
        this.b.accept(kw.a(cpo.fI).a(kx.a(dcr.a, dcr.M, dcr.L, dcr.N, dcr.O).a((Boolean)false, (Boolean)false, (Boolean)false, (Boolean)false, (Boolean)false, kz.a().a(la.c, le.a(cpo.fI, "_ns"))).a((Boolean)false, (Boolean)true, (Boolean)false, (Boolean)false, (Boolean)false, kz.a().a(la.c, le.a(cpo.fI, "_n")).a(la.b, la.a.b)).a((Boolean)false, (Boolean)false, (Boolean)true, (Boolean)false, (Boolean)false, kz.a().a(la.c, le.a(cpo.fI, "_n"))).a((Boolean)false, (Boolean)false, (Boolean)false, (Boolean)true, (Boolean)false, kz.a().a(la.c, le.a(cpo.fI, "_n")).a(la.b, la.a.c)).a((Boolean)false, (Boolean)false, (Boolean)false, (Boolean)false, (Boolean)true, kz.a().a(la.c, le.a(cpo.fI, "_n")).a(la.b, la.a.d)).a((Boolean)false, (Boolean)true, (Boolean)true, (Boolean)false, (Boolean)false, kz.a().a(la.c, le.a(cpo.fI, "_ne"))).a((Boolean)false, (Boolean)true, (Boolean)false, (Boolean)true, (Boolean)false, kz.a().a(la.c, le.a(cpo.fI, "_ne")).a(la.b, la.a.b)).a((Boolean)false, (Boolean)false, (Boolean)false, (Boolean)true, (Boolean)true, kz.a().a(la.c, le.a(cpo.fI, "_ne")).a(la.b, la.a.c)).a((Boolean)false, (Boolean)false, (Boolean)true, (Boolean)false, (Boolean)true, kz.a().a(la.c, le.a(cpo.fI, "_ne")).a(la.b, la.a.d)).a((Boolean)false, (Boolean)false, (Boolean)true, (Boolean)true, (Boolean)false, kz.a().a(la.c, le.a(cpo.fI, "_ns"))).a((Boolean)false, (Boolean)true, (Boolean)false, (Boolean)false, (Boolean)true, kz.a().a(la.c, le.a(cpo.fI, "_ns")).a(la.b, la.a.b)).a((Boolean)false, (Boolean)true, (Boolean)true, (Boolean)true, (Boolean)false, kz.a().a(la.c, le.a(cpo.fI, "_nse"))).a((Boolean)false, (Boolean)true, (Boolean)false, (Boolean)true, (Boolean)true, kz.a().a(la.c, le.a(cpo.fI, "_nse")).a(la.b, la.a.b)).a((Boolean)false, (Boolean)false, (Boolean)true, (Boolean)true, (Boolean)true, kz.a().a(la.c, le.a(cpo.fI, "_nse")).a(la.b, la.a.c)).a((Boolean)false, (Boolean)true, (Boolean)true, (Boolean)false, (Boolean)true, kz.a().a(la.c, le.a(cpo.fI, "_nse")).a(la.b, la.a.d)).a((Boolean)false, (Boolean)true, (Boolean)true, (Boolean)true, (Boolean)true, kz.a().a(la.c, le.a(cpo.fI, "_nsew"))).a((Boolean)true, (Boolean)false, (Boolean)false, (Boolean)false, (Boolean)false, kz.a().a(la.c, le.a(cpo.fI, "_attached_ns"))).a((Boolean)true, (Boolean)false, (Boolean)true, (Boolean)false, (Boolean)false, kz.a().a(la.c, le.a(cpo.fI, "_attached_n"))).a((Boolean)true, (Boolean)false, (Boolean)false, (Boolean)true, (Boolean)false, kz.a().a(la.c, le.a(cpo.fI, "_attached_n")).a(la.b, la.a.c)).a((Boolean)true, (Boolean)true, (Boolean)false, (Boolean)false, (Boolean)false, kz.a().a(la.c, le.a(cpo.fI, "_attached_n")).a(la.b, la.a.b)).a((Boolean)true, (Boolean)false, (Boolean)false, (Boolean)false, (Boolean)true, kz.a().a(la.c, le.a(cpo.fI, "_attached_n")).a(la.b, la.a.d)).a((Boolean)true, (Boolean)true, (Boolean)true, (Boolean)false, (Boolean)false, kz.a().a(la.c, le.a(cpo.fI, "_attached_ne"))).a((Boolean)true, (Boolean)true, (Boolean)false, (Boolean)true, (Boolean)false, kz.a().a(la.c, le.a(cpo.fI, "_attached_ne")).a(la.b, la.a.b)).a((Boolean)true, (Boolean)false, (Boolean)false, (Boolean)true, (Boolean)true, kz.a().a(la.c, le.a(cpo.fI, "_attached_ne")).a(la.b, la.a.c)).a((Boolean)true, (Boolean)false, (Boolean)true, (Boolean)false, (Boolean)true, kz.a().a(la.c, le.a(cpo.fI, "_attached_ne")).a(la.b, la.a.d)).a((Boolean)true, (Boolean)false, (Boolean)true, (Boolean)true, (Boolean)false, kz.a().a(la.c, le.a(cpo.fI, "_attached_ns"))).a((Boolean)true, (Boolean)true, (Boolean)false, (Boolean)false, (Boolean)true, kz.a().a(la.c, le.a(cpo.fI, "_attached_ns")).a(la.b, la.a.b)).a((Boolean)true, (Boolean)true, (Boolean)true, (Boolean)true, (Boolean)false, kz.a().a(la.c, le.a(cpo.fI, "_attached_nse"))).a((Boolean)true, (Boolean)true, (Boolean)false, (Boolean)true, (Boolean)true, kz.a().a(la.c, le.a(cpo.fI, "_attached_nse")).a(la.b, la.a.b)).a((Boolean)true, (Boolean)false, (Boolean)true, (Boolean)true, (Boolean)true, kz.a().a(la.c, le.a(cpo.fI, "_attached_nse")).a(la.b, la.a.c)).a((Boolean)true, (Boolean)true, (Boolean)true, (Boolean)false, (Boolean)true, kz.a().a(la.c, le.a(cpo.fI, "_attached_nse")).a(la.b, la.a.d)).a((Boolean)true, (Boolean)true, (Boolean)true, (Boolean)true, (Boolean)true, kz.a().a(la.c, le.a(cpo.fI, "_attached_nsew")))));
    }

    private void aq() {
        this.d(cpo.fH);
        this.b.accept(kw.a(cpo.fH).a(kx.a(dcr.a, dcr.w).a((T1 $$0, T2 $$1) -> kz.a().a(la.c, lh.a(cpo.fH, ($$0 != false ? "_attached" : "") + ($$1 != false ? "_on" : ""))))).a(kq.b()));
    }

    private acq a(int $$0, String $$1, lh $$2) {
        switch ($$0) {
            case 1: {
                return lg.bj.a(le.a($$1 + "turtle_egg"), $$2, this.c);
            }
            case 2: {
                return lg.bk.a(le.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
            }
            case 3: {
                return lg.bl.a(le.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
            }
            case 4: {
                return lg.bm.a(le.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
            }
        }
        throw new UnsupportedOperationException();
    }

    private acq a(Integer $$0, Integer $$1) {
        switch ($$1) {
            case 0: {
                return this.a($$0, "", lh.b(lh.G(cpo.mf)));
            }
            case 1: {
                return this.a($$0, "slightly_cracked_", lh.b(lh.a(cpo.mf, "_slightly_cracked")));
            }
            case 2: {
                return this.a($$0, "very_cracked_", lh.b(lh.a(cpo.mf, "_very_cracked")));
            }
        }
        throw new UnsupportedOperationException();
    }

    private void ar() {
        this.a(cgc.jT);
        this.b.accept(kw.a(cpo.mf).a(kx.a(dcr.aD, dcr.aE).b((T1 $$0, T2 $$1) -> Arrays.asList(kq.a(this.a((Integer)$$0, (Integer)$$1))))));
    }

    private void as() {
        this.a(cgc.jU);
        Function<Integer, acq> $$02 = $$0 -> {
            String $$1 = switch ($$0) {
                case 1 -> "_slightly_cracked";
                case 2 -> "_very_cracked";
                default -> "_not_cracked";
            };
            lh $$2 = lh.a($$1);
            return lg.bu.a(cpo.mg, $$1, $$2, this.c);
        };
        this.b.accept(kw.a(cpo.mg).a(kx.a(cwv.b).a((T1 $$1) -> kz.a().a(la.c, (acq)$$02.apply((Integer)$$1)))));
    }

    private void E(cpn $$0) {
        this.d($$0);
        acq $$12 = le.a($$0);
        kv $$2 = kv.a($$0);
        ku.c $$3 = ac.a(ku.a(), (T $$1) -> a.stream().map(Pair::getFirst).forEach($$2 -> {
            if ($$0.n().b($$2)) {
                $$1.a($$2, false);
            }
        }));
        for (Pair<dcs, Function<acq, kz>> $$4 : a) {
            dcs $$5 = (dcs)$$4.getFirst();
            Function $$6 = (Function)$$4.getSecond();
            if (!$$0.n().b($$5)) continue;
            $$2.a((ku)ku.a().a($$5, true), (kz)$$6.apply($$12));
            $$2.a((ku)$$3, (kz)$$6.apply($$12));
        }
        this.b.accept($$2);
    }

    private void at() {
        acq $$0 = lh.a(cpo.qH, "_bottom");
        lh $$1 = new lh().a(li.e, $$0).a(li.f, lh.a(cpo.qH, "_top")).a(li.i, lh.a(cpo.qH, "_side"));
        lh $$22 = new lh().a(li.e, $$0).a(li.f, lh.a(cpo.qH, "_top_bloom")).a(li.i, lh.a(cpo.qH, "_side_bloom"));
        acq $$3 = lg.m.a(cpo.qH, "", $$1, this.c);
        acq $$4 = lg.m.a(cpo.qH, "_bloom", $$22, this.c);
        this.b.accept(kw.a(cpo.qH).a(kx.a(dcr.E).a((T1 $$2) -> kz.a().a(la.c, $$2 != false ? $$4 : $$3))));
        this.a(cgc.fN, $$3);
    }

    private void au() {
        cpn $$0 = cpo.cm;
        acq $$1 = le.a($$0);
        kv $$22 = kv.a($$0);
        Map.of(ha.c, la.a.a, ha.f, la.a.b, ha.d, la.a.c, ha.e, la.a.d).forEach(($$2, $$3) -> {
            ku.c $$4 = ku.a().a(dcr.R, $$2);
            $$22.a((ku)$$4, kz.a().a(la.c, $$1).a(la.b, $$3).a(la.d, true));
            this.a($$22, $$4, (la.a)((Object)$$3));
        });
        this.b.accept($$22);
        this.a($$0, le.a($$0, "_inventory"));
        i.clear();
    }

    private void a(kv $$0, ku.c $$1, la.a $$2) {
        Map.of(dcr.bp, lg.aK, dcr.bq, lg.aL, dcr.br, lg.aM, dcr.bs, lg.aN, dcr.bt, lg.aO, dcr.bu, lg.aP).forEach(($$3, $$4) -> {
            this.a($$0, $$1, $$2, (dcs)$$3, (lf)$$4, true);
            this.a($$0, $$1, $$2, (dcs)$$3, (lf)$$4, false);
        });
    }

    private void a(kv $$0, ku.c $$1, la.a $$2, dcs $$32, lf $$4, boolean $$5) {
        String $$6 = $$5 ? "_occupied" : "_empty";
        lh $$7 = new lh().a(li.b, lh.a(cpo.cm, $$6));
        d $$8 = new d($$4, $$6);
        acq $$9 = i.computeIfAbsent($$8, $$3 -> $$4.a(cpo.cm, $$6, $$7, this.c));
        $$0.a(ku.a($$1, ku.a().a($$32, $$5)), kz.a().a(la.c, $$9).a(la.b, $$2));
    }

    private void av() {
        this.b.accept(kq.c(cpo.kJ, lg.c.a(cpo.kJ, lh.b(le.a("magma")), this.c)));
    }

    private void F(cpn $$0) {
        this.b($$0, lj.p);
        lg.bB.a(le.a($$0.k()), lh.u($$0), this.c);
    }

    private void b(cpn $$0, cpn $$1, e $$2) {
        this.b($$0, $$2);
        this.b($$1, $$2);
    }

    private void j(cpn $$0, cpn $$1) {
        lg.bC.a(le.a($$0.k()), lh.u($$1), this.c);
    }

    private void aw() {
        acq $$0 = le.a(cpo.b);
        acq $$1 = le.a(cpo.b, "_mirrored");
        this.b.accept(kq.a(cpo.eO, $$0, $$1));
        this.a(cpo.eO, $$0);
    }

    private void ax() {
        acq $$0 = le.a(cpo.rI);
        acq $$1 = le.a(cpo.rI, "_mirrored");
        this.b.accept(kq.a(cpo.sc, $$0, $$1).a(kq.f()));
        this.a(cpo.sc, $$0);
    }

    private void k(cpn $$0, cpn $$1) {
        this.a($$0, kq$e.b);
        lh $$2 = lh.d(lh.a($$0, "_pot"));
        acq $$3 = kq$e.b.b().a($$1, $$2, this.c);
        this.b.accept(kq.c($$1, $$3));
    }

    private void ay() {
        acq $$0 = lh.a(cpo.pl, "_bottom");
        acq $$12 = lh.a(cpo.pl, "_top_off");
        acq $$2 = lh.a(cpo.pl, "_top");
        acq[] $$3 = new acq[5];
        for (int $$4 = 0; $$4 < 5; ++$$4) {
            lh $$5 = new lh().a(li.e, $$0).a(li.f, $$4 == 0 ? $$12 : $$2).a(li.i, lh.a(cpo.pl, "_side" + $$4));
            $$3[$$4] = lg.m.a(cpo.pl, "_" + $$4, $$5, this.c);
        }
        this.b.accept(kw.a(cpo.pl).a(kx.a(dcr.aZ).a((T1 $$1) -> kz.a().a(la.c, $$3[$$1]))));
        this.a(cgc.vT, $$3[0]);
    }

    private kz a(hc $$0, kz $$1) {
        switch ($$0) {
            case b: {
                return $$1.a(la.a, la.a.b);
            }
            case c: {
                return $$1.a(la.a, la.a.b).a(la.b, la.a.c);
            }
            case d: {
                return $$1.a(la.a, la.a.b).a(la.b, la.a.d);
            }
            case a: {
                return $$1.a(la.a, la.a.b).a(la.b, la.a.b);
            }
            case f: {
                return $$1.a(la.a, la.a.d).a(la.b, la.a.c);
            }
            case g: {
                return $$1.a(la.a, la.a.d);
            }
            case h: {
                return $$1.a(la.a, la.a.d).a(la.b, la.a.b);
            }
            case e: {
                return $$1.a(la.a, la.a.d).a(la.b, la.a.d);
            }
            case k: {
                return $$1;
            }
            case l: {
                return $$1.a(la.b, la.a.c);
            }
            case i: {
                return $$1.a(la.b, la.a.d);
            }
            case j: {
                return $$1.a(la.b, la.a.b);
            }
        }
        throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
    }

    private void az() {
        acq $$02 = lh.a(cpo.pb, "_top");
        acq $$1 = lh.a(cpo.pb, "_bottom");
        acq $$2 = lh.a(cpo.pb, "_side");
        acq $$3 = lh.a(cpo.pb, "_lock");
        lh $$4 = new lh().a(li.o, $$2).a(li.m, $$2).a(li.l, $$2).a(li.c, $$02).a(li.j, $$02).a(li.k, $$1).a(li.n, $$3);
        acq $$5 = lg.b.a(cpo.pb, $$4, this.c);
        this.b.accept(kw.a(cpo.pb, kz.a().a(la.c, $$5)).a(kx.a(dcr.T).a((T1 $$0) -> this.a((hc)$$0, kz.a()))));
    }

    private void aA() {
        cpn $$0 = cpo.n;
        acq $$1 = le.a($$0);
        lj $$2 = lj.a.get($$0);
        cpn $$3 = cpo.jH;
        acq $$4 = lg.Z.a($$3, $$2.b(), this.c);
        acq $$5 = lg.aa.a($$3, $$2.b(), this.c);
        this.b.accept(kq.e($$3, $$4, $$5, $$1));
    }

    public void a() {
        je.a().filter(jf::c).forEach($$0 -> this.h($$0.a()).a((jf)$$0));
        this.h(cpo.qS).a(je.w).a(new cpn[]{cpo.ri}).a(je.y);
        this.h(cpo.qR).a(je.A).a(new cpn[]{cpo.rh}).a(je.C);
        this.h(cpo.qQ).a(je.E).a(new cpn[]{cpo.rg}).a(je.G);
        this.h(cpo.qP).a(je.I).a(new cpn[]{cpo.rf}).a(je.K);
        this.m(cpo.a);
        this.a(cpo.nc, cpo.a);
        this.a(cpo.nb, cpo.a);
        this.m(cpo.fO);
        this.m(cpo.dQ);
        this.a(cpo.nd, cpo.G);
        this.m(cpo.fA);
        this.m(cpo.me);
        this.m(cpo.fr);
        this.m(cpo.fR);
        this.a(cgc.tk);
        this.m(cpo.pg);
        this.m(cpo.G);
        this.m(cpo.H);
        this.m(cpo.hV);
        this.a(cgc.fw);
        this.l(cpo.pM, cpo.qd);
        this.l(cpo.pN, cpo.qe);
        this.l(cpo.pO, cpo.qf);
        this.l(cpo.pP, cpo.qg);
        this.l(cpo.pQ, cpo.qh);
        this.l(cpo.pR, cpo.qi);
        this.l(cpo.pS, cpo.qj);
        this.l(cpo.pT, cpo.qk);
        this.l(cpo.pU, cpo.ql);
        this.l(cpo.pV, cpo.qm);
        this.l(cpo.pW, cpo.qn);
        this.l(cpo.pX, cpo.qo);
        this.l(cpo.pY, cpo.qp);
        this.l(cpo.pZ, cpo.qq);
        this.l(cpo.qa, cpo.qr);
        this.l(cpo.qb, cpo.qs);
        this.l(cpo.pL, cpo.qc);
        this.m(cpo.na);
        this.m(cpo.gs);
        this.m(cpo.qC);
        this.m(cpo.rw);
        this.s(cpo.rx);
        this.s(cpo.ry);
        this.t(cpo.sh);
        this.t(cpo.si);
        this.ag();
        this.e(cpo.rB, cpo.rz);
        this.p(cpo.rA);
        this.a(cpo.hW, cgc.hf);
        this.a(cgc.hf);
        this.aB();
        this.a(cpo.kN, cgc.iF);
        this.a(cgc.iF);
        this.f(cpo.bQ, lh.a(cpo.by, "_side"));
        this.a(cpo.R);
        this.a(cpo.S);
        this.a(cpo.iB);
        this.a(cpo.cx);
        this.a(cpo.cy);
        this.a(cpo.cz);
        this.a(cpo.fE);
        this.a(cpo.fF);
        this.a(cpo.fJ);
        this.a(cpo.N);
        this.a(cpo.T);
        this.a(cpo.O);
        this.a(cpo.ch);
        this.a(cpo.P);
        this.a(cpo.Q);
        this.a(cpo.ci);
        this.b(cpo.pj, lj.c);
        this.a(cpo.pi);
        this.a(cpo.aR);
        this.a(cpo.aS);
        this.a(cpo.aT);
        this.a(cpo.hb);
        this.a(cpo.dI);
        this.a(cpo.dJ);
        this.a(cpo.ha);
        this.a(cpo.pC);
        this.a(cpo.mW);
        this.a(cpo.dR);
        this.a(cpo.k);
        this.a(cpo.pk);
        this.a(cpo.fz);
        this.a(cpo.ed);
        this.a(cpo.L);
        this.a(cpo.ph);
        this.a(cpo.dO);
        this.b(cpo.dT, lj.f);
        this.b(cpo.pq, lj.c);
        this.b(cpo.fa, lj.c);
        this.m(cpo.ac);
        this.m(cpo.ga);
        this.a(cpo.kK);
        this.a(cpo.aY);
        this.a(cpo.iC);
        this.a(cpo.co);
        this.a(cpo.pK);
        this.a(cpo.ii);
        this.a(cpo.oy);
        this.a(cpo.dX);
        this.a(cpo.dY);
        this.a(cpo.ct);
        this.a(cpo.aO);
        this.b(cpo.bw, lj.u);
        this.a(cgc.cw);
        this.b(cpo.ck, lj.e);
        this.b(cpo.pd, lj.c);
        this.a(cpo.op);
        this.a(cpo.aP);
        this.a(cpo.qt);
        this.a(cpo.qu);
        this.a(cpo.qA);
        this.a(cpo.qz);
        this.a(cpo.rt);
        this.a(cpo.se);
        this.a(cpo.sf);
        this.a(cpo.sg);
        this.e(cpo.qF);
        this.aA();
        this.a(cpo.qN);
        this.a(cpo.qO);
        this.a(cpo.qM);
        this.a(cpo.qL);
        this.a(cpo.qK);
        this.a(cpo.qJ);
        this.h(cpo.qM, cpo.rb);
        this.h(cpo.qL, cpo.rd);
        this.h(cpo.qK, cpo.rc);
        this.h(cpo.qJ, cpo.re);
        this.g(cpo.gW, cpo.ch);
        this.g(cpo.gX, cpo.ci);
        this.F();
        this.r();
        this.au();
        this.v();
        this.w();
        this.a(new cpn[]{cpo.og, cpo.oh});
        this.x();
        this.A();
        this.B();
        this.D();
        this.E();
        this.H();
        this.C();
        this.y(cpo.kt);
        this.I();
        this.J();
        this.K();
        this.L();
        this.O();
        this.P();
        this.Q();
        this.R();
        this.q();
        this.S();
        this.T();
        this.U();
        this.V();
        this.X();
        this.Y();
        this.Z();
        this.aa();
        this.ab();
        this.af();
        this.ai();
        this.ah();
        this.aj();
        this.ak();
        this.y();
        this.al();
        this.am();
        this.an();
        this.ao();
        this.ap();
        this.aq();
        this.ar();
        this.as();
        this.E(cpo.ff);
        this.E(cpo.fg);
        this.E(cpo.qG);
        this.av();
        this.az();
        this.ac();
        this.ad();
        this.ae();
        this.W();
        this.N();
        this.M();
        this.D(cpo.cO);
        this.d(cpo.cO);
        this.D(cpo.oa);
        this.g();
        this.D(cpo.rD);
        this.i(cpo.cp, cpo.cq);
        this.i(cpo.eb, cpo.ec);
        this.a(cpo.cA, cpo.n, lh::c);
        this.a(cpo.nY, cpo.p, lh::d);
        this.x(cpo.ow);
        this.x(cpo.on);
        this.v(cpo.aU);
        this.v(cpo.hi);
        this.C(cpo.oe);
        this.C(cpo.of);
        this.e(cpo.eY, le.a(cpo.eY));
        this.a(cpo.dZ, lj.c);
        this.a(cpo.ea, lj.c);
        this.a(cpo.sd);
        this.a(cpo.kM, lj.c);
        this.f(cpo.j);
        this.f(cpo.rG);
        this.f(cpo.I);
        this.g(cpo.J);
        this.g(cpo.M);
        this.f(cpo.K);
        this.e(cpo.F);
        this.b(cpo.sn, lj.e);
        this.a(cpo.ij, lj.c, lj.d);
        this.a(cpo.kx, lj.v, lj.w);
        this.a(cpo.hf, lj.v, lj.w);
        this.a(cpo.sj, lj.c, lj.d);
        this.a(cpo.sk, lj.c, lj.d);
        this.a(cpo.sl, lj.c, lj.d);
        this.c(cpo.nT, lj.h);
        this.z();
        this.a(cpo.pe, lh::A);
        this.a(cpo.pf, lh::C);
        this.a(cpo.kD, dcr.as, 0, 1, 2, 3);
        this.a(cpo.gt, dcr.av, 0, 0, 1, 1, 2, 2, 2, 3);
        this.a(cpo.fq, dcr.as, 0, 1, 1, 2);
        this.a(cpo.gu, dcr.av, 0, 0, 1, 1, 2, 2, 2, 3);
        this.a(cpo.cB, dcr.av, 0, 1, 2, 3, 4, 5, 6, 7);
        this.a(cpo.kA, kq$e.b, dcr.aq, 0, 1);
        this.i();
        this.h();
        this.a(le.a("decorated_pot"), cpo.iA).b(cpo.so);
        this.a(le.a("banner"), cpo.n).a(lg.bD, cpo.iJ, cpo.iK, cpo.iL, cpo.iM, cpo.iN, cpo.iO, cpo.iP, cpo.iQ, cpo.iR, cpo.iS, cpo.iT, cpo.iU, cpo.iV, cpo.iW, cpo.iX, cpo.iY).b(cpo.iZ, cpo.ja, cpo.jb, cpo.jc, cpo.jd, cpo.je, cpo.jf, cpo.jg, cpo.jh, cpo.ji, cpo.jj, cpo.jk, cpo.jl, cpo.jm, cpo.jn, cpo.jo);
        this.a(le.a("bed"), cpo.n).b(cpo.aZ, cpo.ba, cpo.bb, cpo.bc, cpo.bd, cpo.be, cpo.bf, cpo.bg, cpo.bh, cpo.bi, cpo.bj, cpo.bk, cpo.bl, cpo.bm, cpo.bn, cpo.bo);
        this.j(cpo.aZ, cpo.bA);
        this.j(cpo.ba, cpo.bB);
        this.j(cpo.bb, cpo.bC);
        this.j(cpo.bc, cpo.bD);
        this.j(cpo.bd, cpo.bE);
        this.j(cpo.be, cpo.bF);
        this.j(cpo.bf, cpo.bG);
        this.j(cpo.bg, cpo.bH);
        this.j(cpo.bh, cpo.bI);
        this.j(cpo.bi, cpo.bJ);
        this.j(cpo.bj, cpo.bK);
        this.j(cpo.bk, cpo.bL);
        this.j(cpo.bl, cpo.bM);
        this.j(cpo.bm, cpo.bN);
        this.j(cpo.bn, cpo.bO);
        this.j(cpo.bo, cpo.bP);
        this.a(le.a("skull"), cpo.dX).a(lg.bE, cpo.gM, cpo.gK, cpo.gI, cpo.gE, cpo.gG, cpo.gQ).a(cpo.gO).b(cpo.gN, cpo.gP, cpo.gL, cpo.gJ, cpo.gF, cpo.gH, cpo.gR);
        this.F(cpo.kP);
        this.F(cpo.kQ);
        this.F(cpo.kR);
        this.F(cpo.kS);
        this.F(cpo.kT);
        this.F(cpo.kU);
        this.F(cpo.kV);
        this.F(cpo.kW);
        this.F(cpo.kX);
        this.F(cpo.kY);
        this.F(cpo.kZ);
        this.F(cpo.la);
        this.F(cpo.lb);
        this.F(cpo.lc);
        this.F(cpo.ld);
        this.F(cpo.le);
        this.F(cpo.lf);
        this.b(cpo.mX, lj.p);
        this.c(cpo.mX);
        this.a(le.a("chest"), cpo.n).b(cpo.cv, cpo.gV);
        this.a(le.a("ender_chest"), cpo.co).b(cpo.fG);
        this.d(cpo.fx, cpo.co).a(cpo.fx, cpo.kF);
        this.a(cpo.aM);
        this.a(cpo.aN);
        this.a(cpo.lw);
        this.a(cpo.lx);
        this.a(cpo.ly);
        this.a(cpo.lz);
        this.a(cpo.lA);
        this.a(cpo.lB);
        this.a(cpo.lC);
        this.a(cpo.lD);
        this.a(cpo.lE);
        this.a(cpo.lF);
        this.a(cpo.lG);
        this.a(cpo.lH);
        this.a(cpo.lI);
        this.a(cpo.lJ);
        this.a(cpo.lK);
        this.a(cpo.lL);
        this.a(lj.a, cpo.lM, cpo.lN, cpo.lO, cpo.lP, cpo.lQ, cpo.lR, cpo.lS, cpo.lT, cpo.lU, cpo.lV, cpo.lW, cpo.lX, cpo.lY, cpo.lZ, cpo.ma, cpo.mb);
        this.a(cpo.iA);
        this.a(cpo.hj);
        this.a(cpo.hk);
        this.a(cpo.hl);
        this.a(cpo.hm);
        this.a(cpo.hn);
        this.a(cpo.ho);
        this.a(cpo.hp);
        this.a(cpo.hq);
        this.a(cpo.hr);
        this.a(cpo.hs);
        this.a(cpo.ht);
        this.a(cpo.hu);
        this.a(cpo.hv);
        this.a(cpo.hw);
        this.a(cpo.hx);
        this.a(cpo.hy);
        this.a(cpo.qB);
        this.f(cpo.aQ, cpo.eZ);
        this.f(cpo.ej, cpo.hz);
        this.f(cpo.ek, cpo.hA);
        this.f(cpo.el, cpo.hB);
        this.f(cpo.em, cpo.hC);
        this.f(cpo.en, cpo.hD);
        this.f(cpo.eo, cpo.hE);
        this.f(cpo.ep, cpo.hF);
        this.f(cpo.eq, cpo.hG);
        this.f(cpo.er, cpo.hH);
        this.f(cpo.es, cpo.hI);
        this.f(cpo.et, cpo.hJ);
        this.f(cpo.eu, cpo.hK);
        this.f(cpo.ev, cpo.hL);
        this.f(cpo.ew, cpo.hM);
        this.f(cpo.ex, cpo.hN);
        this.f(cpo.ey, cpo.hO);
        this.b(lj.n, cpo.lg, cpo.lh, cpo.li, cpo.lj, cpo.lk, cpo.ll, cpo.lm, cpo.ln, cpo.lo, cpo.lp, cpo.lq, cpo.lr, cpo.ls, cpo.lt, cpo.lu, cpo.lv);
        this.e(cpo.bA, cpo.ik);
        this.e(cpo.bB, cpo.il);
        this.e(cpo.bC, cpo.im);
        this.e(cpo.bD, cpo.in);
        this.e(cpo.bE, cpo.io);
        this.e(cpo.bF, cpo.ip);
        this.e(cpo.bG, cpo.iq);
        this.e(cpo.bH, cpo.ir);
        this.e(cpo.bI, cpo.is);
        this.e(cpo.bJ, cpo.it);
        this.e(cpo.bK, cpo.iu);
        this.e(cpo.bL, cpo.iv);
        this.e(cpo.bM, cpo.iw);
        this.e(cpo.bN, cpo.ix);
        this.e(cpo.bO, cpo.iy);
        this.e(cpo.bP, cpo.iz);
        this.a(cpo.rH);
        this.a(cpo.eM);
        this.a(cpo.bu, cpo.gb, kq$e.a);
        this.a(cpo.bR, cpo.gc, kq$e.b);
        this.a(cpo.bT, cpo.gd, kq$e.b);
        this.a(cpo.bU, cpo.ge, kq$e.b);
        this.a(cpo.bV, cpo.gf, kq$e.b);
        this.a(cpo.bW, cpo.gg, kq$e.b);
        this.a(cpo.bX, cpo.gh, kq$e.b);
        this.a(cpo.bY, cpo.gi, kq$e.b);
        this.a(cpo.bZ, cpo.gj, kq$e.b);
        this.a(cpo.ca, cpo.gk, kq$e.b);
        this.a(cpo.cb, cpo.gl, kq$e.b);
        this.a(cpo.cc, cpo.gm, kq$e.b);
        this.a(cpo.ce, cpo.gn, kq$e.b);
        this.a(cpo.cd, cpo.go, kq$e.b);
        this.a(cpo.cg, cpo.gp, kq$e.b);
        this.a(cpo.cf, cpo.gq, kq$e.b);
        this.a(cpo.bv, cpo.gr, kq$e.b);
        this.a(cpo.bS, cpo.fS, kq$e.b);
        this.G();
        this.u(cpo.eU);
        this.u(cpo.eV);
        this.u(cpo.eW);
        this.a(cpo.bt, kq$e.a);
        this.b(cpo.dS, kq$e.a);
        this.a(cgc.dn);
        this.b(cpo.mc, cpo.md, kq$e.b);
        this.a(cgc.do);
        this.c(cpo.md);
        this.b(cpo.rF, kq$e.b);
        this.c(cpo.rF);
        this.c(cpo.rv);
        this.b(cpo.oz, cpo.oA, kq$e.b);
        this.b(cpo.oB, cpo.oC, kq$e.b);
        this.a(cpo.oz, "_plant");
        this.c(cpo.oA);
        this.a(cpo.oB, "_plant");
        this.c(cpo.oC);
        this.a(cpo.mY, kq$e.a, lh.c(lh.a(cpo.mZ, "_stage0")));
        this.m();
        this.a(cpo.bs, kq$e.b);
        this.c(cpo.iE, kq$e.b);
        this.c(cpo.iF, kq$e.b);
        this.c(cpo.iG, kq$e.b);
        this.c(cpo.iH, kq$e.a);
        this.c(cpo.iI, kq$e.a);
        this.j();
        this.k();
        this.l();
        this.a(cpo.mw, cpo.mr, cpo.mm, cpo.mh, cpo.mG, cpo.mB, cpo.mQ, cpo.mL);
        this.a(cpo.mx, cpo.ms, cpo.mn, cpo.mi, cpo.mH, cpo.mC, cpo.mR, cpo.mM);
        this.a(cpo.my, cpo.mt, cpo.mo, cpo.mj, cpo.mI, cpo.mD, cpo.mS, cpo.mN);
        this.a(cpo.mz, cpo.mu, cpo.mp, cpo.mk, cpo.mJ, cpo.mE, cpo.mT, cpo.mO);
        this.a(cpo.mA, cpo.mv, cpo.mq, cpo.ml, cpo.mK, cpo.mF, cpo.mU, cpo.mP);
        this.c(cpo.fe, cpo.fc);
        this.c(cpo.fd, cpo.fb);
        this.l(cpo.ab).c(cpo.ab).a(cpo.av);
        this.l(cpo.am).c(cpo.am).a(cpo.aD);
        this.a(cpo.am, cpo.dj, cpo.ds);
        this.b(cpo.aL, lj.r);
        this.l(cpo.Y).c(cpo.Y).a(cpo.as);
        this.l(cpo.ai).c(cpo.ai).a(cpo.aA);
        this.a(cpo.ai, cpo.dd, cpo.do);
        this.a(cpo.B, cpo.fX, kq$e.b);
        this.b(cpo.aI, lj.r);
        this.l(cpo.Z).d(cpo.Z).a(cpo.at);
        this.l(cpo.aj).d(cpo.aj).a(cpo.aB);
        this.a(cpo.aj, cpo.de, cpo.dp);
        this.a(cpo.C, cpo.fY, kq$e.b);
        this.b(cpo.aJ, lj.r);
        this.l(cpo.W).c(cpo.W).a(cpo.aq);
        this.l(cpo.ag).c(cpo.ag).a(cpo.ay);
        this.a(cpo.ag, cpo.dc, cpo.dn);
        this.a(cpo.z, cpo.fV, kq$e.b);
        this.b(cpo.aG, lj.r);
        this.l(cpo.U).c(cpo.U).a(cpo.ao);
        this.l(cpo.al).c(cpo.al).a(cpo.aw);
        this.a(cpo.al, cpo.da, cpo.dl);
        this.a(cpo.x, cpo.fT, kq$e.b);
        this.b(cpo.aE, lj.r);
        this.l(cpo.V).c(cpo.V).a(cpo.ap);
        this.l(cpo.af).c(cpo.af).a(cpo.ax);
        this.a(cpo.af, cpo.db, cpo.dm);
        this.a(cpo.y, cpo.fU, kq$e.b);
        this.b(cpo.aF, lj.r);
        this.l(cpo.aa).c(cpo.aa).a(cpo.au);
        this.l(cpo.ak).c(cpo.ak).a(cpo.aC);
        this.a(cpo.ak, cpo.dg, cpo.dr);
        this.a(cpo.D, cpo.fZ, kq$e.b);
        this.b(cpo.aK, lj.r);
        this.l(cpo.X).c(cpo.X).a(cpo.ar);
        this.l(cpo.ah).c(cpo.ah).a(cpo.az);
        this.a(cpo.ah, cpo.df, cpo.dq);
        this.a(cpo.A, cpo.fW, kq$e.b);
        this.b(cpo.aH, lj.r);
        this.l(cpo.os).b(cpo.os).a(cpo.ou);
        this.l(cpo.ot).b(cpo.ot).a(cpo.ov);
        this.a(cpo.ot, cpo.dh, cpo.dt);
        this.a(cpo.ox, cpo.pm, kq$e.b);
        this.k(cpo.oD, cpo.po);
        this.l(cpo.oj).b(cpo.oj).a(cpo.ol);
        this.l(cpo.ok).b(cpo.ok).a(cpo.om);
        this.a(cpo.ok, cpo.di, cpo.du);
        this.a(cpo.oo, cpo.pn, kq$e.b);
        this.k(cpo.oq, cpo.pp);
        this.l(cpo.ae).d(cpo.ae);
        this.l(cpo.an).d(cpo.an);
        this.a(cpo.v, cpo.dk, cpo.dv);
        this.b(cpo.or, kq$e.b);
        this.a(cgc.dk);
        this.i(cpo.dy);
        this.k(cpo.hY);
        this.u();
        this.n(cpo.cP);
        this.o(cpo.bp);
        this.o(cpo.bq);
        this.o(cpo.hh);
        this.t();
        this.q(cpo.fN);
        this.q(cpo.kG);
        this.q(cpo.kH);
        this.r(cpo.gS);
        this.r(cpo.gT);
        this.r(cpo.gU);
        this.o();
        this.p();
        this.d(cpo.cD, lj.g);
        this.d(cpo.nW, lj.g);
        this.d(cpo.nV, lj.h);
        this.s();
        this.ay();
        this.at();
        this.h(cpo.eL, cpo.eT);
        this.h(cpo.m, cpo.eP);
        this.h(cpo.eK, cpo.eS);
        this.h(cpo.eJ, cpo.eR);
        this.aw();
        this.h(cpo.eI, cpo.eQ);
        this.ax();
        che.h().forEach($$0 -> this.a((cfu)$$0, le.b("template_spawn_egg")));
    }

    private void aB() {
        this.c(cpo.hX);
        kx.a<Integer> $$0 = kx.a(dcr.aP);
        for (int $$1 = 0; $$1 < 16; ++$$1) {
            String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
            acq $$3 = lh.a(cgc.hg, $$2);
            $$0.a((Integer)$$1, kz.a().a(la.c, lg.Y.a(cpo.hX, $$2, lh.h($$3), this.c)));
            lg.bv.a(le.a(cgc.hg, $$2), lh.k($$3), this.c);
        }
        this.b.accept(kw.a(cpo.hX).a($$0));
    }

    private void l(cpn $$0, cpn $$1) {
        this.a($$0.k());
        lh $$2 = lh.b(lh.G($$0));
        lh $$3 = lh.b(lh.a($$0, "_lit"));
        acq $$4 = lg.bF.a($$0, "_one_candle", $$2, this.c);
        acq $$5 = lg.bG.a($$0, "_two_candles", $$2, this.c);
        acq $$6 = lg.bH.a($$0, "_three_candles", $$2, this.c);
        acq $$7 = lg.bI.a($$0, "_four_candles", $$2, this.c);
        acq $$8 = lg.bF.a($$0, "_one_candle_lit", $$3, this.c);
        acq $$9 = lg.bG.a($$0, "_two_candles_lit", $$3, this.c);
        acq $$10 = lg.bH.a($$0, "_three_candles_lit", $$3, this.c);
        acq $$11 = lg.bI.a($$0, "_four_candles_lit", $$3, this.c);
        this.b.accept(kw.a($$0).a(kx.a(dcr.az, dcr.r).a((Integer)1, (Boolean)false, kz.a().a(la.c, $$4)).a((Integer)2, (Boolean)false, kz.a().a(la.c, $$5)).a((Integer)3, (Boolean)false, kz.a().a(la.c, $$6)).a((Integer)4, (Boolean)false, kz.a().a(la.c, $$7)).a((Integer)1, (Boolean)true, kz.a().a(la.c, $$8)).a((Integer)2, (Boolean)true, kz.a().a(la.c, $$9)).a((Integer)3, (Boolean)true, kz.a().a(la.c, $$10)).a((Integer)4, (Boolean)true, kz.a().a(la.c, $$11))));
        acq $$12 = lg.bJ.a($$1, lh.a($$0, false), this.c);
        acq $$13 = lg.bJ.a($$1, "_lit", lh.a($$0, true), this.c);
        this.b.accept(kw.a($$1).a(kq.a(dcr.r, $$13, $$12)));
    }

    private /* synthetic */ kz a(int[] $$0, Int2ObjectMap $$1, cpn $$22, Integer $$3) {
        int $$4 = $$0[$$3];
        acq $$5 = (acq)$$1.computeIfAbsent($$4, $$2 -> this.a($$22, "_stage" + $$4, lg.aT, lh::g));
        return kz.a().a(la.c, $$5);
    }

    @FunctionalInterface
    static interface c {
        public kt create(cpn var1, acq var2, lh var3, BiConsumer<acq, Supplier<JsonElement>> var4);
    }

    class b {
        private final lh b;
        private final Map<lf, acq> c = Maps.newHashMap();
        @Nullable
        private jf d;
        @Nullable
        private acq e;

        public b(lh $$0) {
            this.b = $$0;
        }

        public b a(cpn $$0, lf $$1) {
            this.e = $$1.a($$0, this.b, kq.this.c);
            if (kq.this.f.containsKey($$0)) {
                kq.this.b.accept(kq.this.f.get($$0).create($$0, this.e, this.b, kq.this.c));
            } else {
                kq.this.b.accept(kq.c($$0, this.e));
            }
            return this;
        }

        public b a(cpn ... $$0) {
            if (this.e == null) {
                throw new IllegalStateException("Full block not generated yet");
            }
            for (cpn $$1 : $$0) {
                kq.this.b.accept(kq.c($$1, this.e));
                kq.this.a($$1, this.e);
            }
            return this;
        }

        public b a(cpn $$0) {
            acq $$1 = lg.q.a($$0, this.b, kq.this.c);
            acq $$2 = lg.r.a($$0, this.b, kq.this.c);
            kq.this.b.accept(kq.b($$0, $$1, $$2));
            acq $$3 = lg.s.a($$0, this.b, kq.this.c);
            kq.this.a($$0, $$3);
            return this;
        }

        public b b(cpn $$0) {
            acq $$1 = lg.K.a($$0, this.b, kq.this.c);
            acq $$2 = lg.L.a($$0, this.b, kq.this.c);
            acq $$3 = lg.M.a($$0, this.b, kq.this.c);
            kq.this.b.accept(kq.a($$0, $$1, $$2, $$3));
            acq $$4 = lg.N.a($$0, this.b, kq.this.c);
            kq.this.a($$0, $$4);
            return this;
        }

        public b c(cpn $$0) {
            lh $$1 = lh.p($$0);
            acq $$2 = lg.B.a($$0, $$1, kq.this.c);
            acq $$3 = lg.C.a($$0, $$1, kq.this.c);
            acq $$4 = lg.D.a($$0, $$1, kq.this.c);
            acq $$5 = lg.E.a($$0, $$1, kq.this.c);
            acq $$6 = lg.F.a($$0, $$1, kq.this.c);
            kq.this.b.accept(kq.a($$0, $$2, $$3, $$4, $$5, $$6));
            acq $$7 = lg.G.a($$0, $$1, kq.this.c);
            kq.this.a($$0, $$7);
            return this;
        }

        public b d(cpn $$0) {
            acq $$1 = lg.H.a($$0, this.b, kq.this.c);
            acq $$2 = lg.I.a($$0, this.b, kq.this.c);
            kq.this.b.accept(kq.c($$0, $$1, $$2));
            acq $$3 = lg.J.a($$0, this.b, kq.this.c);
            kq.this.a($$0, $$3);
            return this;
        }

        public b e(cpn $$0) {
            lh $$1 = lh.p($$0);
            acq $$2 = lg.P.a($$0, $$1, kq.this.c);
            acq $$3 = lg.O.a($$0, $$1, kq.this.c);
            acq $$4 = lg.R.a($$0, $$1, kq.this.c);
            acq $$5 = lg.Q.a($$0, $$1, kq.this.c);
            kq.this.b.accept(kq.a($$0, $$2, $$3, $$4, $$5, false));
            return this;
        }

        public b f(cpn $$0) {
            acq $$1 = lg.T.a($$0, this.b, kq.this.c);
            acq $$2 = lg.S.a($$0, this.b, kq.this.c);
            acq $$3 = lg.V.a($$0, this.b, kq.this.c);
            acq $$4 = lg.U.a($$0, this.b, kq.this.c);
            kq.this.b.accept(kq.a($$0, $$1, $$2, $$3, $$4, true));
            return this;
        }

        public b g(cpn $$0) {
            acq $$1 = lg.W.a($$0, this.b, kq.this.c);
            acq $$2 = lg.X.a($$0, this.b, kq.this.c);
            kq.this.b.accept(kq.e($$0, $$1, $$2));
            return this;
        }

        public b h(cpn $$0) {
            if (this.d == null) {
                throw new IllegalStateException("Family not defined");
            }
            cpn $$1 = this.d.b().get((Object)jf.b.r);
            acq $$2 = lg.Y.a($$0, this.b, kq.this.c);
            kq.this.b.accept(kq.c($$0, $$2));
            kq.this.b.accept(kq.c($$1, $$2));
            kq.this.a($$0.k());
            kq.this.c($$1);
            return this;
        }

        public b i(cpn $$0) {
            if (this.e == null) {
                throw new IllegalStateException("Full block not generated yet");
            }
            acq $$1 = this.a(lg.Z, $$0);
            acq $$2 = this.a(lg.aa, $$0);
            kq.this.b.accept(kq.e($$0, $$1, $$2, this.e));
            kq.this.a($$0, $$1);
            return this;
        }

        public b j(cpn $$0) {
            acq $$1 = this.a(lg.ad, $$0);
            acq $$2 = this.a(lg.ac, $$0);
            acq $$3 = this.a(lg.ae, $$0);
            kq.this.b.accept(kq.b($$0, $$1, $$2, $$3));
            kq.this.a($$0, $$2);
            return this;
        }

        private b k(cpn $$0) {
            lj $$1 = kq.this.g.getOrDefault($$0, lj.a.get($$0));
            kq.this.b.accept(kq.c($$0, $$1.a($$0, kq.this.c)));
            return this;
        }

        private b l(cpn $$0) {
            kq.this.i($$0);
            return this;
        }

        private void m(cpn $$0) {
            if (kq.this.e.contains($$0)) {
                kq.this.k($$0);
            } else {
                kq.this.j($$0);
            }
        }

        private acq a(lf $$0, cpn $$12) {
            return this.c.computeIfAbsent($$0, $$1 -> $$1.a($$12, this.b, kq.this.c));
        }

        public b a(jf $$02) {
            this.d = $$02;
            $$02.b().forEach(($$0, $$1) -> {
                BiConsumer<b, cpn> $$2 = h.get($$0);
                if ($$2 != null) {
                    $$2.accept(this, (cpn)$$1);
                }
            });
            return this;
        }
    }

    class f {
        private final lh b;

        public f(lh $$0) {
            this.b = $$0;
        }

        public f a(cpn $$0) {
            lh $$1 = this.b.c(li.d, this.b.a(li.i));
            acq $$2 = lg.i.a($$0, $$1, kq.this.c);
            kq.this.b.accept(kq.d($$0, $$2));
            return this;
        }

        public f b(cpn $$0) {
            acq $$1 = lg.i.a($$0, this.b, kq.this.c);
            kq.this.b.accept(kq.d($$0, $$1));
            return this;
        }

        public f c(cpn $$0) {
            acq $$1 = lg.i.a($$0, this.b, kq.this.c);
            acq $$2 = lg.j.a($$0, this.b, kq.this.c);
            kq.this.b.accept(kq.d($$0, $$1, $$2));
            return this;
        }

        public f d(cpn $$0) {
            kq.this.b.accept(kq.a($$0, this.b, kq.this.c));
            return this;
        }
    }

    static final class e
    extends Enum<e> {
        public static final /* enum */ e a = new e();
        public static final /* enum */ e b = new e();
        private static final /* synthetic */ e[] c;

        public static e[] values() {
            return (e[])c.clone();
        }

        public static e valueOf(String $$0) {
            return Enum.valueOf(e.class, $$0);
        }

        public lf a() {
            return this == a ? lg.an : lg.am;
        }

        public lf b() {
            return this == a ? lg.ap : lg.ao;
        }

        private static /* synthetic */ e[] c() {
            return new e[]{a, b};
        }

        static {
            c = kq$e.c();
        }
    }

    class a {
        private final acq b;

        public a(acq $$0, cpn $$1) {
            this.b = lg.Y.a($$0, lh.u($$1), kq.this.c);
        }

        public a a(cpn ... $$0) {
            for (cpn $$1 : $$0) {
                kq.this.b.accept(kq.c($$1, this.b));
            }
            return this;
        }

        public a b(cpn ... $$0) {
            for (cpn $$1 : $$0) {
                kq.this.c($$1);
            }
            return this.a($$0);
        }

        public a a(lf $$0, cpn ... $$1) {
            for (cpn $$2 : $$1) {
                $$0.a(le.a($$2.k()), lh.u($$2), kq.this.c);
            }
            return this.a($$1);
        }
    }

    record d(lf a, String b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "template;modelSuffix", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "template;modelSuffix", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "template;modelSuffix", "a", "b"}, this, $$0);
        }
    }
}

