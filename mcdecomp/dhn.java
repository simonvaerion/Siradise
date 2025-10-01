/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.mutable.MutableObject
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Suppliers;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalInt;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;

public final class dhn
extends ddy {
    public static final Codec<dhn> c = RecordCodecBuilder.create($$02 -> $$02.group((App)cno.a.fieldOf("biome_source").forGetter($$0 -> $$0.b), (App)dhp.b.fieldOf("settings").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, $$02.stable(dhn::new)));
    private static final dcb d = cpo.a.n();
    private final he<dhp> e;
    private final Supplier<dgw.a> f;

    public dhn(cno $$0, he<dhp> $$1) {
        super($$0);
        this.e = $$1;
        this.f = Suppliers.memoize(() -> dhn.a((dhp)$$1.a()));
    }

    private static dgw.a a(dhp $$0) {
        dgw.b $$1 = new dgw.b(-54, cpo.H.n());
        int $$2 = $$0.l();
        dgw.b $$3 = new dgw.b($$2, $$0.h());
        dgw.b $$42 = new dgw.b(dfk.e * 2, cpo.a.n());
        return ($$4, $$5, $$6) -> {
            if ($$5 < Math.min(-54, $$2)) {
                return $$1;
            }
            return $$3;
        };
    }

    @Override
    public CompletableFuture<ddx> a(Executor $$0, dhy $$1, dim $$2, cne $$3, ddx $$4) {
        return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
            this.a($$2, $$1, $$3, $$4);
            return $$4;
        }), ac.f());
    }

    private void a(dim $$0, dhy $$1, cne $$2, ddx $$32) {
        dho $$4 = $$32.a((ddx $$3) -> this.a((ddx)$$3, $$2, $$0, $$1));
        cnn $$5 = dgy.a($$0.a(this.b), $$32);
        $$32.a($$5, $$4.a($$1.a(), this.e.a().k()));
    }

    private dho a(ddx $$0, cne $$1, dim $$2, dhy $$3) {
        return dho.a($$0, $$3, dgx.a($$1, $$0.f()), this.e.a(), this.f.get(), $$2);
    }

    @Override
    protected Codec<? extends ddy> a() {
        return c;
    }

    public he<dhp> g() {
        return this.e;
    }

    public boolean a(acp<dhp> $$0) {
        return this.e.a($$0);
    }

    @Override
    public int a(int $$0, int $$1, dhk.a $$2, cmo $$3, dhy $$4) {
        return this.a($$3, $$4, $$0, $$1, null, $$2.e()).orElse($$3.C_());
    }

    @Override
    public cmy a(int $$0, int $$1, cmo $$2, dhy $$3) {
        MutableObject $$4 = new MutableObject();
        this.a($$2, $$3, $$0, $$1, (MutableObject<cmy>)$$4, null);
        return (cmy)$$4.getValue();
    }

    @Override
    public void a(List<String> $$0, dhy $$1, gu $$2) {
        DecimalFormat $$3 = new DecimalFormat("0.000");
        dhq $$4 = $$1.a();
        dhd.e $$5 = new dhd.e($$2.u(), $$2.v(), $$2.w());
        double $$6 = $$4.j().a($$5);
        $$0.add("NoiseRouter T: " + $$3.format($$4.e().a($$5)) + " V: " + $$3.format($$4.f().a($$5)) + " C: " + $$3.format($$4.g().a($$5)) + " E: " + $$3.format($$4.h().a($$5)) + " D: " + $$3.format($$4.i().a($$5)) + " W: " + $$3.format($$6) + " PV: " + $$3.format(dhr.a((float)$$6)) + " AS: " + $$3.format($$4.k().a($$5)) + " N: " + $$3.format($$4.l().a($$5)));
    }

    private OptionalInt a(cmo $$0, dhy $$1, int $$2, int $$3, @Nullable MutableObject<cmy> $$4, @Nullable Predicate<dcb> $$5) {
        dcb[] $$12;
        dhs $$6 = this.e.a().f().a($$0);
        int $$7 = $$6.a();
        int $$8 = $$6.c();
        int $$9 = apa.a($$8, $$7);
        int $$10 = apa.a($$6.d(), $$7);
        if ($$10 <= 0) {
            return OptionalInt.empty();
        }
        if ($$4 == null) {
            Object $$11 = null;
        } else {
            $$12 = new dcb[$$6.d()];
            $$4.setValue((Object)new cmy($$8, $$12));
        }
        int $$13 = $$6.b();
        int $$14 = Math.floorDiv($$2, $$13);
        int $$15 = Math.floorDiv($$3, $$13);
        int $$16 = Math.floorMod($$2, $$13);
        int $$17 = Math.floorMod($$3, $$13);
        int $$18 = $$14 * $$13;
        int $$19 = $$15 * $$13;
        double $$20 = (double)$$16 / (double)$$13;
        double $$21 = (double)$$17 / (double)$$13;
        dho $$22 = new dho(1, $$1, $$18, $$19, $$6, dhe.b.a, this.e.a(), this.f.get(), dim.a());
        $$22.f();
        $$22.b(0);
        for (int $$23 = $$10 - 1; $$23 >= 0; --$$23) {
            $$22.b($$23, 0);
            for (int $$24 = $$7 - 1; $$24 >= 0; --$$24) {
                dcb $$28;
                int $$25 = ($$9 + $$23) * $$7 + $$24;
                double $$26 = (double)$$24 / (double)$$7;
                $$22.a($$25, $$26);
                $$22.b($$2, $$20);
                $$22.c($$3, $$21);
                dcb $$27 = $$22.e();
                dcb dcb2 = $$28 = $$27 == null ? this.e.a().g() : $$27;
                if ($$12 != null) {
                    int $$29 = $$23 * $$7 + $$24;
                    $$12[$$29] = $$28;
                }
                if ($$5 == null || !$$5.test($$28)) continue;
                $$22.g();
                return OptionalInt.of($$25 + 1);
            }
        }
        $$22.g();
        return OptionalInt.empty();
    }

    @Override
    public void a(aim $$0, cne $$1, dhy $$2, ddx $$3) {
        if (aa.a($$3.f())) {
            return;
        }
        dih $$4 = new dih(this, $$0);
        this.a($$3, $$4, $$2, $$1, $$0.z_(), $$0.B_().d(jc.ap), dim.a($$0));
    }

    @VisibleForTesting
    public void a(ddx $$0, dih $$1, dhy $$2, cne $$32, cnm $$4, hr<cnk> $$5, dim $$6) {
        dho $$7 = $$0.a((ddx $$3) -> this.a((ddx)$$3, $$32, $$6, $$2));
        dhp $$8 = this.e.a();
        $$2.c().a($$2, $$4, $$5, $$8.n(), $$1, $$0, $$7, $$8.j());
    }

    @Override
    public void a(aim $$0, long $$12, dhy $$22, cnm $$32, cne $$4, ddx $$5, dhg.a $$6) {
        cnm $$7 = $$32.a((int $$1, int $$2, int $$3) -> this.b.getNoiseBiome($$1, $$2, $$3, $$22.b()));
        dij $$8 = new dij(new dhl(dhz.a()));
        int $$9 = 8;
        clt $$10 = $$5.f();
        dho $$11 = $$5.a((ddx $$3) -> this.a((ddx)$$3, $$4, dim.a($$0), $$22));
        dgw $$122 = $$11.i();
        djk $$13 = new djk(this, $$0.B_(), $$5.z(), $$11, $$22, this.e.a().j());
        ddw $$14 = ((des)$$5).b($$6);
        for (int $$15 = -8; $$15 <= 8; ++$$15) {
            for (int $$16 = -8; $$16 <= 8; ++$$16) {
                clt $$17 = new clt($$10.e + $$15, $$10.f + $$16);
                ddx $$18 = $$0.a($$17.e, $$17.f);
                cnl $$19 = $$18.a(() -> this.a(this.b.getNoiseBiome(hq.a($$17.d()), 0, hq.a($$17.e()), $$22.b())));
                Iterable<he<djn<?>>> $$20 = $$19.a($$6);
                int $$21 = 0;
                for (he<djn<?>> $$222 : $$20) {
                    djn<?> $$23 = $$222.a();
                    $$8.c($$12 + (long)$$21, $$17.e, $$17.f);
                    if ($$23.a($$8)) {
                        $$23.a($$13, $$5, $$7::a, $$8, $$122, $$17, $$14);
                    }
                    ++$$21;
                }
            }
        }
    }

    @Override
    public CompletableFuture<ddx> a(Executor $$0, dim $$12, dhy $$22, cne $$3, ddx $$4) {
        dhs $$5 = this.e.a().f().a($$4.z());
        int $$6 = $$5.c();
        int $$7 = apa.a($$6, $$5.a());
        int $$8 = apa.a($$5.d(), $$5.a());
        if ($$8 <= 0) {
            return CompletableFuture.completedFuture($$4);
        }
        int $$9 = $$4.e($$8 * $$5.a() - 1 + $$6);
        int $$10 = $$4.e($$6);
        HashSet $$11 = Sets.newHashSet();
        for (int $$122 = $$9; $$122 >= $$10; --$$122) {
            dej $$13 = $$4.b($$122);
            $$13.a();
            $$11.add($$13);
        }
        return CompletableFuture.supplyAsync(ac.a("wgen_fill_noise", () -> this.a($$12, $$3, $$22, $$4, $$7, $$8)), ac.f()).whenCompleteAsync(($$1, $$2) -> {
            for (dej $$3 : $$11) {
                $$3.b();
            }
        }, $$0);
    }

    private ddx a(dim $$0, cne $$1, dhy $$2, ddx $$32, int $$4, int $$5) {
        dho $$6 = $$32.a((ddx $$3) -> this.a((ddx)$$3, $$1, $$0, $$2));
        dhk $$7 = $$32.a(dhk.a.c);
        dhk $$8 = $$32.a(dhk.a.a);
        clt $$9 = $$32.f();
        int $$10 = $$9.d();
        int $$11 = $$9.e();
        dgw $$12 = $$6.i();
        $$6.f();
        gu.a $$13 = new gu.a();
        int $$14 = $$6.j();
        int $$15 = $$6.k();
        int $$16 = 16 / $$14;
        int $$17 = 16 / $$14;
        for (int $$18 = 0; $$18 < $$16; ++$$18) {
            $$6.b($$18);
            for (int $$19 = 0; $$19 < $$17; ++$$19) {
                int $$20 = $$32.ak() - 1;
                dej $$21 = $$32.b($$20);
                for (int $$22 = $$5 - 1; $$22 >= 0; --$$22) {
                    $$6.b($$22, $$19);
                    for (int $$23 = $$15 - 1; $$23 >= 0; --$$23) {
                        int $$24 = ($$4 + $$22) * $$15 + $$23;
                        int $$25 = $$24 & 0xF;
                        int $$26 = $$32.e($$24);
                        if ($$20 != $$26) {
                            $$20 = $$26;
                            $$21 = $$32.b($$26);
                        }
                        double $$27 = (double)$$23 / (double)$$15;
                        $$6.a($$24, $$27);
                        for (int $$28 = 0; $$28 < $$14; ++$$28) {
                            int $$29 = $$10 + $$18 * $$14 + $$28;
                            int $$30 = $$29 & 0xF;
                            double $$31 = (double)$$28 / (double)$$14;
                            $$6.b($$29, $$31);
                            for (int $$322 = 0; $$322 < $$14; ++$$322) {
                                int $$33 = $$11 + $$19 * $$14 + $$322;
                                int $$34 = $$33 & 0xF;
                                double $$35 = (double)$$322 / (double)$$14;
                                $$6.c($$33, $$35);
                                dcb $$36 = $$6.e();
                                if ($$36 == null) {
                                    $$36 = this.e.a().g();
                                }
                                if (($$36 = this.a($$6, $$29, $$24, $$33, $$36)) == d || aa.a($$32.f())) continue;
                                $$21.a($$30, $$25, $$34, $$36, false);
                                $$7.a($$30, $$24, $$34, $$36);
                                $$8.a($$30, $$24, $$34, $$36);
                                if (!$$12.a() || $$36.u().c()) continue;
                                $$13.d($$29, $$24, $$33);
                                $$32.e($$13);
                            }
                        }
                    }
                }
            }
            $$6.h();
        }
        $$6.g();
        return $$32;
    }

    private dcb a(dho $$0, int $$1, int $$2, int $$3, dcb $$4) {
        return $$4;
    }

    @Override
    public int d() {
        return this.e.a().f().d();
    }

    @Override
    public int e() {
        return this.e.a().l();
    }

    @Override
    public int f() {
        return this.e.a().f().c();
    }

    @Override
    public void a(aim $$0) {
        if (this.e.a().a()) {
            return;
        }
        clt $$1 = $$0.a();
        he<cnk> $$2 = $$0.s($$1.l().h($$0.aj() - 1));
        dij $$3 = new dij(new dhl(dhz.a()));
        $$3.a($$0.A(), $$1.d(), $$1.e());
        cmx.a($$0, $$2, $$1, $$3);
    }
}

