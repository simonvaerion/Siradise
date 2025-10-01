/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cme {
    private static final cmf a = new cmf();
    private static final int b = 16;
    private final boolean c;
    private final a d;
    private final apf e = apf.a();
    private final cmm f;
    private final double g;
    private final double h;
    private final double i;
    @Nullable
    private final bfj j;
    private final float k;
    private final ben l;
    private final cmf m;
    private final ObjectArrayList<gu> n = new ObjectArrayList();
    private final Map<byo, eei> o = Maps.newHashMap();

    public cme(cmm $$0, @Nullable bfj $$1, double $$2, double $$3, double $$4, float $$5, List<gu> $$6) {
        this($$0, $$1, $$2, $$3, $$4, $$5, false, cme$a.c, $$6);
    }

    public cme(cmm $$0, @Nullable bfj $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, a $$7, List<gu> $$8) {
        this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        this.n.addAll($$8);
    }

    public cme(cmm $$0, @Nullable bfj $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, a $$7) {
        this($$0, $$1, null, null, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    public cme(cmm $$0, @Nullable bfj $$1, @Nullable ben $$2, @Nullable cmf $$3, double $$4, double $$5, double $$6, float $$7, boolean $$8, a $$9) {
        this.f = $$0;
        this.j = $$1;
        this.k = $$7;
        this.g = $$4;
        this.h = $$5;
        this.i = $$6;
        this.c = $$8;
        this.d = $$9;
        this.l = $$2 == null ? $$0.ag().a(this) : $$2;
        this.m = $$3 == null ? this.a($$1) : $$3;
    }

    private cmf a(@Nullable bfj $$0) {
        return $$0 == null ? a : new cmc($$0);
    }

    public static float a(eei $$0, bfj $$1) {
        eed $$2 = $$1.cE();
        double $$3 = 1.0 / (($$2.d - $$2.a) * 2.0 + 1.0);
        double $$4 = 1.0 / (($$2.e - $$2.b) * 2.0 + 1.0);
        double $$5 = 1.0 / (($$2.f - $$2.c) * 2.0 + 1.0);
        double $$6 = (1.0 - Math.floor(1.0 / $$3) * $$3) / 2.0;
        double $$7 = (1.0 - Math.floor(1.0 / $$5) * $$5) / 2.0;
        if ($$3 < 0.0 || $$4 < 0.0 || $$5 < 0.0) {
            return 0.0f;
        }
        int $$8 = 0;
        int $$9 = 0;
        for (double $$10 = 0.0; $$10 <= 1.0; $$10 += $$3) {
            for (double $$11 = 0.0; $$11 <= 1.0; $$11 += $$4) {
                for (double $$12 = 0.0; $$12 <= 1.0; $$12 += $$5) {
                    double $$13 = apa.d($$10, $$2.a, $$2.d);
                    double $$14 = apa.d($$11, $$2.b, $$2.e);
                    double $$15 = apa.d($$12, $$2.c, $$2.f);
                    eei $$16 = new eei($$13 + $$6, $$14, $$15 + $$7);
                    if ($$1.dI().a(new clv($$16, $$0, clv.a.a, clv.b.a, $$1)).c() == eeg.a.a) {
                        ++$$8;
                    }
                    ++$$9;
                }
            }
        }
        return (float)$$8 / (float)$$9;
    }

    public void a() {
        this.f.a(this.j, dgl.x, new eei(this.g, this.h, this.i));
        HashSet $$0 = Sets.newHashSet();
        int $$1 = 16;
        for (int $$2 = 0; $$2 < 16; ++$$2) {
            for (int $$3 = 0; $$3 < 16; ++$$3) {
                block2: for (int $$4 = 0; $$4 < 16; ++$$4) {
                    if ($$2 != 0 && $$2 != 15 && $$3 != 0 && $$3 != 15 && $$4 != 0 && $$4 != 15) continue;
                    double $$5 = (float)$$2 / 15.0f * 2.0f - 1.0f;
                    double $$6 = (float)$$3 / 15.0f * 2.0f - 1.0f;
                    double $$7 = (float)$$4 / 15.0f * 2.0f - 1.0f;
                    double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                    $$5 /= $$8;
                    $$6 /= $$8;
                    $$7 /= $$8;
                    double $$10 = this.g;
                    double $$11 = this.h;
                    double $$12 = this.i;
                    float $$13 = 0.3f;
                    for (float $$9 = this.k * (0.7f + this.f.z.i() * 0.6f); $$9 > 0.0f; $$9 -= 0.22500001f) {
                        gu $$14 = gu.a($$10, $$11, $$12);
                        dcb $$15 = this.f.a_($$14);
                        dxe $$16 = this.f.b_($$14);
                        if (!this.f.j($$14)) continue block2;
                        Optional<Float> $$17 = this.m.a(this, (cls)this.f, $$14, $$15, $$16);
                        if ($$17.isPresent()) {
                            $$9 -= ($$17.get().floatValue() + 0.3f) * 0.3f;
                        }
                        if ($$9 > 0.0f && this.m.a(this, (cls)this.f, $$14, $$15, $$9)) {
                            $$0.add($$14);
                        }
                        $$10 += $$5 * (double)0.3f;
                        $$11 += $$6 * (double)0.3f;
                        $$12 += $$7 * (double)0.3f;
                    }
                }
            }
        }
        this.n.addAll((Collection)$$0);
        float $$18 = this.k * 2.0f;
        int $$19 = apa.a(this.g - (double)$$18 - 1.0);
        int $$20 = apa.a(this.g + (double)$$18 + 1.0);
        int $$21 = apa.a(this.h - (double)$$18 - 1.0);
        int $$22 = apa.a(this.h + (double)$$18 + 1.0);
        int $$23 = apa.a(this.i - (double)$$18 - 1.0);
        int $$24 = apa.a(this.i + (double)$$18 + 1.0);
        List<bfj> $$25 = this.f.a_(this.j, new eed($$19, $$21, $$23, $$20, $$22, $$24));
        eei $$26 = new eei(this.g, this.h, this.i);
        for (int $$27 = 0; $$27 < $$25.size(); ++$$27) {
            byo $$40;
            double $$38;
            double $$32;
            double $$31;
            double $$30;
            double $$33;
            double $$29;
            bfj $$28 = $$25.get($$27);
            if ($$28.cJ() || !(($$29 = Math.sqrt($$28.e($$26)) / (double)$$18) <= 1.0) || ($$33 = Math.sqrt(($$30 = $$28.dn() - this.g) * $$30 + ($$31 = ($$28 instanceof bvi ? $$28.dp() : $$28.dr()) - this.h) * $$31 + ($$32 = $$28.dt() - this.i) * $$32)) == 0.0) continue;
            $$30 /= $$33;
            $$31 /= $$33;
            $$32 /= $$33;
            double $$34 = cme.a($$26, $$28);
            double $$35 = (1.0 - $$29) * $$34;
            $$28.a(this.c(), (float)((int)(($$35 * $$35 + $$35) / 2.0 * 7.0 * (double)$$18 + 1.0)));
            if ($$28 instanceof bfz) {
                bfz $$36 = (bfz)$$28;
                double $$37 = ckt.a($$36, $$35);
            } else {
                $$38 = $$35;
            }
            eei $$39 = new eei($$30 *= $$38, $$31 *= $$38, $$32 *= $$38);
            $$28.f($$28.dl().e($$39));
            if (!($$28 instanceof byo) || ($$40 = (byo)$$28).G_() || $$40.f() && $$40.fO().b) continue;
            this.o.put($$40, $$39);
        }
    }

    public void a(boolean $$0) {
        if (this.f.B) {
            this.f.a(this.g, this.h, this.i, amh.iX, ami.e, 4.0f, (1.0f + (this.f.z.i() - this.f.z.i()) * 0.2f) * 0.7f, false);
        }
        boolean $$1 = this.b();
        if ($$0) {
            if (this.k < 2.0f || !$$1) {
                this.f.a(iv.x, this.g, this.h, this.i, 1.0, 0.0, 0.0);
            } else {
                this.f.a(iv.w, this.g, this.h, this.i, 1.0, 0.0, 0.0);
            }
        }
        if ($$1) {
            ObjectArrayList $$22 = new ObjectArrayList();
            boolean $$3 = this.e() instanceof byo;
            ac.b(this.n, this.f.z);
            for (gu $$4 : this.n) {
                cmm cmm2;
                dcb $$5 = this.f.a_($$4);
                cpn $$6 = $$5.b();
                if ($$5.i()) continue;
                gu $$7 = $$4.i();
                this.f.ad().a("explosion_blocks");
                if ($$6.a(this) && (cmm2 = this.f) instanceof aif) {
                    aif $$8 = (aif)cmm2;
                    czn $$9 = $$5.t() ? this.f.c_($$4) : null;
                    dzq.a $$10 = new dzq.a($$8).a(ebw.f, eei.b($$4)).a(ebw.i, cfz.b).b(ebw.h, $$9).b(ebw.a, this.j);
                    if (this.d == cme$a.c) {
                        $$10.a(ebw.j, Float.valueOf(this.k));
                    }
                    $$5.a($$8, $$4, cfz.b, $$3);
                    $$5.a($$10).forEach($$2 -> cme.a((ObjectArrayList<Pair<cfz, gu>>)$$22, $$2, $$7));
                }
                this.f.a($$4, cpo.a.n(), 3);
                $$6.a(this.f, $$4, this);
                this.f.ad().c();
            }
            for (Pair $$11 : $$22) {
                cpn.a(this.f, (gu)$$11.getSecond(), (cfz)$$11.getFirst());
            }
        }
        if (this.c) {
            for (gu $$12 : this.n) {
                if (this.e.a(3) != 0 || !this.f.a_($$12).i() || !this.f.a_($$12.d()).i(this.f, $$12.d())) continue;
                this.f.b($$12, cpb.a(this.f, $$12));
            }
        }
    }

    public boolean b() {
        return this.d != cme$a.a;
    }

    private static void a(ObjectArrayList<Pair<cfz, gu>> $$0, cfz $$1, gu $$2) {
        int $$3 = $$0.size();
        for (int $$4 = 0; $$4 < $$3; ++$$4) {
            Pair $$5 = (Pair)$$0.get($$4);
            cfz $$6 = (cfz)$$5.getFirst();
            if (!bvh.a($$6, $$1)) continue;
            cfz $$7 = bvh.a($$6, $$1, 16);
            $$0.set($$4, (Object)Pair.of((Object)$$7, (Object)((gu)$$5.getSecond())));
            if (!$$1.b()) continue;
            return;
        }
        $$0.add((Object)Pair.of((Object)$$1, (Object)$$2));
    }

    public ben c() {
        return this.l;
    }

    public Map<byo, eei> d() {
        return this.o;
    }

    @Nullable
    public bfz e() {
        bzg $$2;
        bfj $$3;
        if (this.j == null) {
            return null;
        }
        bfj bfj2 = this.j;
        if (bfj2 instanceof bvi) {
            bvi $$0 = (bvi)bfj2;
            return $$0.j();
        }
        bfj2 = this.j;
        if (bfj2 instanceof bfz) {
            bfz $$1 = (bfz)bfj2;
            return $$1;
        }
        bfj2 = this.j;
        if (bfj2 instanceof bzg && ($$3 = ($$2 = (bzg)bfj2).v()) instanceof bfz) {
            bfz $$4 = (bfz)$$3;
            return $$4;
        }
        return null;
    }

    @Nullable
    public bfj f() {
        return this.j;
    }

    public void g() {
        this.n.clear();
    }

    public List<gu> h() {
        return this.n;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = cme$a.a();
        }
    }
}

