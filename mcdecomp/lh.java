/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class lh {
    private final Map<li, acq> a = Maps.newHashMap();
    private final Set<li> b = Sets.newHashSet();

    public lh a(li $$0, acq $$1) {
        this.a.put($$0, $$1);
        return this;
    }

    public lh b(li $$0, acq $$1) {
        this.a.put($$0, $$1);
        this.b.add($$0);
        return this;
    }

    public Stream<li> a() {
        return this.b.stream();
    }

    public lh a(li $$0, li $$1) {
        this.a.put($$1, this.a.get($$0));
        return this;
    }

    public lh b(li $$0, li $$1) {
        this.a.put($$1, this.a.get($$0));
        this.b.add($$1);
        return this;
    }

    public acq a(li $$0) {
        for (li $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
            acq $$2 = this.a.get($$1);
            if ($$2 == null) continue;
            return $$2;
        }
        throw new IllegalStateException("Can't find texture for slot " + $$0);
    }

    public lh c(li $$0, acq $$1) {
        lh $$2 = new lh();
        $$2.a.putAll(this.a);
        $$2.b.addAll(this.b);
        $$2.a($$0, $$1);
        return $$2;
    }

    public static lh a(cpn $$0) {
        acq $$1 = lh.G($$0);
        return lh.b($$1);
    }

    public static lh b(cpn $$0) {
        acq $$1 = lh.G($$0);
        return lh.a($$1);
    }

    public static lh a(acq $$0) {
        return new lh().a(li.b, $$0);
    }

    public static lh b(acq $$0) {
        return new lh().a(li.a, $$0);
    }

    public static lh c(cpn $$0) {
        return lh.d(li.p, lh.G($$0));
    }

    public static lh c(acq $$0) {
        return lh.d(li.p, $$0);
    }

    public static lh d(cpn $$0) {
        return lh.d(li.q, lh.G($$0));
    }

    public static lh d(acq $$0) {
        return lh.d(li.q, $$0);
    }

    public static lh e(cpn $$0) {
        return lh.d(li.s, lh.G($$0));
    }

    public static lh e(acq $$0) {
        return lh.d(li.s, $$0);
    }

    public static lh f(cpn $$0) {
        return lh.d(li.t, lh.G($$0));
    }

    public static lh g(cpn $$0) {
        return new lh().a(li.P, lh.G($$0)).a(li.y, lh.a($$0, "_stem"));
    }

    public static lh f(acq $$0) {
        return lh.d(li.t, $$0);
    }

    public static lh h(cpn $$0) {
        return lh.d(li.y, lh.G($$0));
    }

    public static lh a(cpn $$0, cpn $$1) {
        return new lh().a(li.y, lh.G($$0)).a(li.z, lh.G($$1));
    }

    public static lh i(cpn $$0) {
        return lh.d(li.u, lh.G($$0));
    }

    public static lh j(cpn $$0) {
        return lh.d(li.x, lh.G($$0));
    }

    public static lh g(acq $$0) {
        return lh.d(li.A, $$0);
    }

    public static lh b(cpn $$0, cpn $$1) {
        return new lh().a(li.v, lh.G($$0)).a(li.w, lh.a($$1, "_top"));
    }

    public static lh d(li $$0, acq $$1) {
        return new lh().a($$0, $$1);
    }

    public static lh k(cpn $$0) {
        return new lh().a(li.i, lh.a($$0, "_side")).a(li.d, lh.a($$0, "_top"));
    }

    public static lh l(cpn $$0) {
        return new lh().a(li.i, lh.a($$0, "_side")).a(li.f, lh.a($$0, "_top"));
    }

    public static lh m(cpn $$0) {
        return new lh().a(li.q, lh.a($$0, "_plant")).a(li.i, lh.a($$0, "_side")).a(li.f, lh.a($$0, "_top"));
    }

    public static lh n(cpn $$0) {
        return new lh().a(li.i, lh.G($$0)).a(li.d, lh.a($$0, "_top")).a(li.c, lh.G($$0));
    }

    public static lh a(acq $$0, acq $$1) {
        return new lh().a(li.i, $$0).a(li.d, $$1);
    }

    public static lh o(cpn $$0) {
        return new lh().a(li.b, lh.G($$0)).a(li.i, lh.a($$0, "_side")).a(li.f, lh.a($$0, "_top"));
    }

    public static lh p(cpn $$0) {
        return new lh().a(li.b, lh.G($$0)).a(li.c, lh.a($$0, "_particle"));
    }

    public static lh q(cpn $$0) {
        return new lh().a(li.i, lh.a($$0, "_side")).a(li.f, lh.a($$0, "_top")).a(li.e, lh.a($$0, "_bottom"));
    }

    public static lh r(cpn $$0) {
        acq $$1 = lh.G($$0);
        return new lh().a(li.r, $$1).a(li.i, $$1).a(li.f, lh.a($$0, "_top")).a(li.e, lh.a($$0, "_bottom"));
    }

    public static lh s(cpn $$0) {
        acq $$1 = lh.G($$0);
        return new lh().a(li.b, $$1).a(li.r, $$1).a(li.i, $$1).a(li.d, lh.a($$0, "_top"));
    }

    public static lh b(acq $$0, acq $$1) {
        return new lh().a(li.f, $$0).a(li.e, $$1);
    }

    public static lh t(cpn $$0) {
        return new lh().a(li.f, lh.a($$0, "_top")).a(li.e, lh.a($$0, "_bottom"));
    }

    public static lh u(cpn $$0) {
        return new lh().a(li.c, lh.G($$0));
    }

    public static lh h(acq $$0) {
        return new lh().a(li.c, $$0);
    }

    public static lh v(cpn $$0) {
        return new lh().a(li.C, lh.a($$0, "_0"));
    }

    public static lh w(cpn $$0) {
        return new lh().a(li.C, lh.a($$0, "_1"));
    }

    public static lh x(cpn $$0) {
        return new lh().a(li.D, lh.G($$0));
    }

    public static lh y(cpn $$0) {
        return new lh().a(li.G, lh.G($$0));
    }

    public static lh i(acq $$0) {
        return new lh().a(li.G, $$0);
    }

    public static lh a(cfu $$0) {
        return new lh().a(li.c, lh.c($$0));
    }

    public static lh z(cpn $$0) {
        return new lh().a(li.i, lh.a($$0, "_side")).a(li.g, lh.a($$0, "_front")).a(li.h, lh.a($$0, "_back"));
    }

    public static lh A(cpn $$0) {
        return new lh().a(li.i, lh.a($$0, "_side")).a(li.g, lh.a($$0, "_front")).a(li.f, lh.a($$0, "_top")).a(li.e, lh.a($$0, "_bottom"));
    }

    public static lh B(cpn $$0) {
        return new lh().a(li.i, lh.a($$0, "_side")).a(li.g, lh.a($$0, "_front")).a(li.f, lh.a($$0, "_top"));
    }

    public static lh C(cpn $$0) {
        return new lh().a(li.i, lh.a($$0, "_side")).a(li.g, lh.a($$0, "_front")).a(li.d, lh.a($$0, "_end"));
    }

    public static lh D(cpn $$0) {
        return new lh().a(li.f, lh.a($$0, "_top"));
    }

    public static lh c(cpn $$0, cpn $$1) {
        return new lh().a(li.c, lh.a($$0, "_front")).a(li.o, lh.G($$1)).a(li.n, lh.a($$0, "_top")).a(li.j, lh.a($$0, "_front")).a(li.l, lh.a($$0, "_side")).a(li.k, lh.a($$0, "_side")).a(li.m, lh.a($$0, "_front"));
    }

    public static lh d(cpn $$0, cpn $$1) {
        return new lh().a(li.c, lh.a($$0, "_front")).a(li.o, lh.G($$1)).a(li.n, lh.a($$0, "_top")).a(li.j, lh.a($$0, "_front")).a(li.k, lh.a($$0, "_front")).a(li.l, lh.a($$0, "_side")).a(li.m, lh.a($$0, "_side"));
    }

    public static lh a(String $$0) {
        return new lh().a(li.c, lh.a(cpo.mg, $$0 + "_north")).a(li.e, lh.a(cpo.mg, $$0 + "_bottom")).a(li.f, lh.a(cpo.mg, $$0 + "_top")).a(li.j, lh.a(cpo.mg, $$0 + "_north")).a(li.k, lh.a(cpo.mg, $$0 + "_south")).a(li.l, lh.a(cpo.mg, $$0 + "_east")).a(li.m, lh.a(cpo.mg, $$0 + "_west"));
    }

    public static lh E(cpn $$0) {
        return new lh().a(li.K, lh.a($$0, "_log_lit")).a(li.C, lh.a($$0, "_fire"));
    }

    public static lh a(cpn $$0, boolean $$1) {
        return new lh().a(li.c, lh.a(cpo.eh, "_side")).a(li.e, lh.a(cpo.eh, "_bottom")).a(li.f, lh.a(cpo.eh, "_top")).a(li.i, lh.a(cpo.eh, "_side")).a(li.L, lh.a($$0, $$1 ? "_lit" : ""));
    }

    public static lh j(acq $$0) {
        return new lh().a(li.c, lh.a(cpo.ft, "_side")).a(li.i, lh.a(cpo.ft, "_side")).a(li.f, lh.a(cpo.ft, "_top")).a(li.e, lh.a(cpo.ft, "_bottom")).a(li.M, lh.a(cpo.ft, "_inner")).a(li.N, $$0);
    }

    public static lh a(boolean $$0) {
        String $$1 = $$0 ? "_can_summon" : "";
        return new lh().a(li.c, lh.a(cpo.qI, "_bottom")).a(li.i, lh.a(cpo.qI, "_side")).a(li.f, lh.a(cpo.qI, "_top")).a(li.O, lh.a(cpo.qI, $$1 + "_inner_top")).a(li.e, lh.a(cpo.qI, "_bottom"));
    }

    public static lh b(cfu $$0) {
        return new lh().a(li.H, lh.c($$0));
    }

    public static lh F(cpn $$0) {
        return new lh().a(li.H, lh.G($$0));
    }

    public static lh k(acq $$0) {
        return new lh().a(li.H, $$0);
    }

    public static lh c(acq $$0, acq $$1) {
        return new lh().a(li.H, $$0).a(li.I, $$1);
    }

    public static lh a(acq $$0, acq $$1, acq $$2) {
        return new lh().a(li.H, $$0).a(li.I, $$1).a(li.J, $$2);
    }

    public static acq G(cpn $$0) {
        acq $$1 = jb.f.b($$0);
        return $$1.d("block/");
    }

    public static acq a(cpn $$0, String $$12) {
        acq $$2 = jb.f.b($$0);
        return $$2.a($$1 -> "block/" + $$1 + $$12);
    }

    public static acq c(cfu $$0) {
        acq $$1 = jb.i.b($$0);
        return $$1.d("item/");
    }

    public static acq a(cfu $$0, String $$12) {
        acq $$2 = jb.i.b($$0);
        return $$2.a($$1 -> "item/" + $$1 + $$12);
    }
}

