/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap
 *  javax.annotation.Nullable
 */
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import java.util.BitSet;
import java.util.List;
import javax.annotation.Nullable;

public class fkq {
    private static final int a = 0;
    private static final int b = 1;
    static final ha[] c = ha.values();
    private final eoo d;
    private static final int e = 100;
    static final ThreadLocal<d> f = ThreadLocal.withInitial(d::new);

    public fkq(eoo $$0) {
        this.d = $$0;
    }

    public void a(clp $$0, fwr $$1, dcb $$2, gu $$3, eij $$4, ein $$5, boolean $$6, apf $$7, long $$8, int $$9) {
        boolean $$10 = enn.M() && $$2.h() == 0 && $$1.a();
        eei $$11 = $$2.n($$0, $$3);
        $$4.a($$11.c, $$11.d, $$11.e);
        try {
            if ($$10) {
                this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            } else {
                this.c($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
        }
        catch (Throwable $$12) {
            o $$13 = o.a($$12, "Tesselating block model");
            p $$14 = $$13.a("Block model being tesselated");
            p.a($$14, $$0, $$3, $$2);
            $$14.a("Using AO", $$10);
            throw new y($$13);
        }
    }

    public void b(clp $$0, fwr $$1, dcb $$2, gu $$3, eij $$4, ein $$5, boolean $$6, apf $$7, long $$8, int $$9) {
        float[] $$10 = new float[c.length * 2];
        BitSet $$11 = new BitSet(3);
        b $$12 = new b();
        gu.a $$13 = $$3.j();
        for (ha $$14 : c) {
            $$7.b($$8);
            List<fkr> $$15 = $$1.a($$2, $$14, $$7);
            if ($$15.isEmpty()) continue;
            $$13.a((hz)$$3, $$14);
            if ($$6 && !cpn.a($$2, $$0, $$3, $$14, $$13)) continue;
            this.a($$0, $$2, $$3, $$4, $$5, $$15, $$10, $$11, $$12, $$9);
        }
        $$7.b($$8);
        List<fkr> $$16 = $$1.a($$2, null, $$7);
        if (!$$16.isEmpty()) {
            this.a($$0, $$2, $$3, $$4, $$5, $$16, $$10, $$11, $$12, $$9);
        }
    }

    public void c(clp $$0, fwr $$1, dcb $$2, gu $$3, eij $$4, ein $$5, boolean $$6, apf $$7, long $$8, int $$9) {
        BitSet $$10 = new BitSet(3);
        gu.a $$11 = $$3.j();
        for (ha $$12 : c) {
            $$7.b($$8);
            List<fkr> $$13 = $$1.a($$2, $$12, $$7);
            if ($$13.isEmpty()) continue;
            $$11.a((hz)$$3, $$12);
            if ($$6 && !cpn.a($$2, $$0, $$3, $$12, $$11)) continue;
            int $$14 = fjv.a($$0, $$2, $$11);
            this.a($$0, $$2, $$3, $$14, $$9, false, $$4, $$5, $$13, $$10);
        }
        $$7.b($$8);
        List<fkr> $$15 = $$1.a($$2, null, $$7);
        if (!$$15.isEmpty()) {
            this.a($$0, $$2, $$3, -1, $$9, true, $$4, $$5, $$15, $$10);
        }
    }

    private void a(clp $$0, dcb $$1, gu $$2, eij $$3, ein $$4, List<fkr> $$5, float[] $$6, BitSet $$7, b $$8, int $$9) {
        for (fkr $$10 : $$5) {
            this.a($$0, $$1, $$2, $$10.b(), $$10.e(), $$6, $$7);
            $$8.a($$0, $$1, $$2, $$10.e(), $$6, $$7, $$10.f());
            this.a($$0, $$1, $$2, $$4, $$3.c(), $$10, $$8.a[0], $$8.a[1], $$8.a[2], $$8.a[3], $$8.b[0], $$8.b[1], $$8.b[2], $$8.b[3], $$9);
        }
    }

    private void a(clp $$0, dcb $$1, gu $$2, ein $$3, eij.a $$4, fkr $$5, float $$6, float $$7, float $$8, float $$9, int $$10, int $$11, int $$12, int $$13, int $$14) {
        float $$21;
        float $$20;
        float $$19;
        if ($$5.c()) {
            int $$15 = this.d.a($$1, $$0, $$2, $$5.d());
            float $$16 = (float)($$15 >> 16 & 0xFF) / 255.0f;
            float $$17 = (float)($$15 >> 8 & 0xFF) / 255.0f;
            float $$18 = (float)($$15 & 0xFF) / 255.0f;
        } else {
            $$19 = 1.0f;
            $$20 = 1.0f;
            $$21 = 1.0f;
        }
        $$3.a($$4, $$5, new float[]{$$6, $$7, $$8, $$9}, $$19, $$20, $$21, new int[]{$$10, $$11, $$12, $$13}, $$14, true);
    }

    private void a(clp $$0, dcb $$1, gu $$2, int[] $$3, ha $$4, @Nullable float[] $$5, BitSet $$6) {
        float $$7 = 32.0f;
        float $$8 = 32.0f;
        float $$9 = 32.0f;
        float $$10 = -32.0f;
        float $$11 = -32.0f;
        float $$12 = -32.0f;
        for (int $$13 = 0; $$13 < 4; ++$$13) {
            float $$14 = Float.intBitsToFloat($$3[$$13 * 8]);
            float $$15 = Float.intBitsToFloat($$3[$$13 * 8 + 1]);
            float $$16 = Float.intBitsToFloat($$3[$$13 * 8 + 2]);
            $$7 = Math.min($$7, $$14);
            $$8 = Math.min($$8, $$15);
            $$9 = Math.min($$9, $$16);
            $$10 = Math.max($$10, $$14);
            $$11 = Math.max($$11, $$15);
            $$12 = Math.max($$12, $$16);
        }
        if ($$5 != null) {
            $$5[ha.e.d()] = $$7;
            $$5[ha.f.d()] = $$10;
            $$5[ha.a.d()] = $$8;
            $$5[ha.b.d()] = $$11;
            $$5[ha.c.d()] = $$9;
            $$5[ha.d.d()] = $$12;
            int $$17 = c.length;
            $$5[ha.e.d() + $$17] = 1.0f - $$7;
            $$5[ha.f.d() + $$17] = 1.0f - $$10;
            $$5[ha.a.d() + $$17] = 1.0f - $$8;
            $$5[ha.b.d() + $$17] = 1.0f - $$11;
            $$5[ha.c.d() + $$17] = 1.0f - $$9;
            $$5[ha.d.d() + $$17] = 1.0f - $$12;
        }
        float $$18 = 1.0E-4f;
        float $$19 = 0.9999f;
        switch ($$4) {
            case a: {
                $$6.set(1, $$7 >= 1.0E-4f || $$9 >= 1.0E-4f || $$10 <= 0.9999f || $$12 <= 0.9999f);
                $$6.set(0, $$8 == $$11 && ($$8 < 1.0E-4f || $$1.r($$0, $$2)));
                break;
            }
            case b: {
                $$6.set(1, $$7 >= 1.0E-4f || $$9 >= 1.0E-4f || $$10 <= 0.9999f || $$12 <= 0.9999f);
                $$6.set(0, $$8 == $$11 && ($$11 > 0.9999f || $$1.r($$0, $$2)));
                break;
            }
            case c: {
                $$6.set(1, $$7 >= 1.0E-4f || $$8 >= 1.0E-4f || $$10 <= 0.9999f || $$11 <= 0.9999f);
                $$6.set(0, $$9 == $$12 && ($$9 < 1.0E-4f || $$1.r($$0, $$2)));
                break;
            }
            case d: {
                $$6.set(1, $$7 >= 1.0E-4f || $$8 >= 1.0E-4f || $$10 <= 0.9999f || $$11 <= 0.9999f);
                $$6.set(0, $$9 == $$12 && ($$12 > 0.9999f || $$1.r($$0, $$2)));
                break;
            }
            case e: {
                $$6.set(1, $$8 >= 1.0E-4f || $$9 >= 1.0E-4f || $$11 <= 0.9999f || $$12 <= 0.9999f);
                $$6.set(0, $$7 == $$10 && ($$7 < 1.0E-4f || $$1.r($$0, $$2)));
                break;
            }
            case f: {
                $$6.set(1, $$8 >= 1.0E-4f || $$9 >= 1.0E-4f || $$11 <= 0.9999f || $$12 <= 0.9999f);
                $$6.set(0, $$7 == $$10 && ($$10 > 0.9999f || $$1.r($$0, $$2)));
            }
        }
    }

    private void a(clp $$0, dcb $$1, gu $$2, int $$3, int $$4, boolean $$5, eij $$6, ein $$7, List<fkr> $$8, BitSet $$9) {
        for (fkr $$10 : $$8) {
            if ($$5) {
                this.a($$0, $$1, $$2, $$10.b(), $$10.e(), null, $$9);
                gu $$11 = $$9.get(0) ? $$2.a($$10.e()) : $$2;
                $$3 = fjv.a($$0, $$1, $$11);
            }
            float $$12 = $$0.a($$10.e(), $$10.f());
            this.a($$0, $$1, $$2, $$7, $$6.c(), $$10, $$12, $$12, $$12, $$12, $$3, $$3, $$3, $$3, $$4);
        }
    }

    public void a(eij.a $$0, ein $$1, @Nullable dcb $$2, fwr $$3, float $$4, float $$5, float $$6, int $$7, int $$8) {
        apf $$9 = apf.a();
        long $$10 = 42L;
        for (ha $$11 : c) {
            $$9.b(42L);
            fkq.a($$0, $$1, $$4, $$5, $$6, $$3.a($$2, $$11, $$9), $$7, $$8);
        }
        $$9.b(42L);
        fkq.a($$0, $$1, $$4, $$5, $$6, $$3.a($$2, null, $$9), $$7, $$8);
    }

    private static void a(eij.a $$0, ein $$1, float $$2, float $$3, float $$4, List<fkr> $$5, int $$6, int $$7) {
        for (fkr $$8 : $$5) {
            float $$14;
            float $$13;
            float $$12;
            if ($$8.c()) {
                float $$9 = apa.a($$2, 0.0f, 1.0f);
                float $$10 = apa.a($$3, 0.0f, 1.0f);
                float $$11 = apa.a($$4, 0.0f, 1.0f);
            } else {
                $$12 = 1.0f;
                $$13 = 1.0f;
                $$14 = 1.0f;
            }
            $$1.a($$0, $$8, $$12, $$13, $$14, $$6, $$7);
        }
    }

    public static void a() {
        f.get().a();
    }

    public static void b() {
        f.get().b();
    }

    static class b {
        final float[] a = new float[4];
        final int[] b = new int[4];

        public void a(clp $$0, dcb $$1, gu $$2, ha $$3, float[] $$4, BitSet $$5, boolean $$6) {
            int $$50;
            float $$49;
            int $$45;
            float $$44;
            int $$40;
            float $$39;
            int $$35;
            float $$34;
            boolean $$30;
            gu $$7 = $$5.get(0) ? $$2.a($$3) : $$2;
            a $$8 = fkq$a.a($$3);
            gu.a $$9 = new gu.a();
            d $$10 = f.get();
            $$9.a((hz)$$7, $$8.g[0]);
            dcb $$11 = $$0.a_($$9);
            int $$12 = $$10.a($$11, $$0, $$9);
            float $$13 = $$10.b($$11, $$0, $$9);
            $$9.a((hz)$$7, $$8.g[1]);
            dcb $$14 = $$0.a_($$9);
            int $$15 = $$10.a($$14, $$0, $$9);
            float $$16 = $$10.b($$14, $$0, $$9);
            $$9.a((hz)$$7, $$8.g[2]);
            dcb $$17 = $$0.a_($$9);
            int $$18 = $$10.a($$17, $$0, $$9);
            float $$19 = $$10.b($$17, $$0, $$9);
            $$9.a((hz)$$7, $$8.g[3]);
            dcb $$20 = $$0.a_($$9);
            int $$21 = $$10.a($$20, $$0, $$9);
            float $$22 = $$10.b($$20, $$0, $$9);
            dcb $$23 = $$0.a_($$9.a((hz)$$7, $$8.g[0]).c($$3));
            boolean $$24 = !$$23.p($$0, $$9) || $$23.b($$0, (gu)$$9) == 0;
            dcb $$25 = $$0.a_($$9.a((hz)$$7, $$8.g[1]).c($$3));
            boolean $$26 = !$$25.p($$0, $$9) || $$25.b($$0, (gu)$$9) == 0;
            dcb $$27 = $$0.a_($$9.a((hz)$$7, $$8.g[2]).c($$3));
            boolean $$28 = !$$27.p($$0, $$9) || $$27.b($$0, (gu)$$9) == 0;
            dcb $$29 = $$0.a_($$9.a((hz)$$7, $$8.g[3]).c($$3));
            boolean bl2 = $$30 = !$$29.p($$0, $$9) || $$29.b($$0, (gu)$$9) == 0;
            if ($$28 || $$24) {
                $$9.a((hz)$$7, $$8.g[0]).c($$8.g[2]);
                dcb $$31 = $$0.a_($$9);
                float $$32 = $$10.b($$31, $$0, $$9);
                int $$33 = $$10.a($$31, $$0, $$9);
            } else {
                $$34 = $$13;
                $$35 = $$12;
            }
            if ($$30 || $$24) {
                $$9.a((hz)$$7, $$8.g[0]).c($$8.g[3]);
                dcb $$36 = $$0.a_($$9);
                float $$37 = $$10.b($$36, $$0, $$9);
                int $$38 = $$10.a($$36, $$0, $$9);
            } else {
                $$39 = $$13;
                $$40 = $$12;
            }
            if ($$28 || $$26) {
                $$9.a((hz)$$7, $$8.g[1]).c($$8.g[2]);
                dcb $$41 = $$0.a_($$9);
                float $$42 = $$10.b($$41, $$0, $$9);
                int $$43 = $$10.a($$41, $$0, $$9);
            } else {
                $$44 = $$13;
                $$45 = $$12;
            }
            if ($$30 || $$26) {
                $$9.a((hz)$$7, $$8.g[1]).c($$8.g[3]);
                dcb $$46 = $$0.a_($$9);
                float $$47 = $$10.b($$46, $$0, $$9);
                int $$48 = $$10.a($$46, $$0, $$9);
            } else {
                $$49 = $$13;
                $$50 = $$12;
            }
            int $$51 = $$10.a($$1, $$0, $$2);
            $$9.a((hz)$$2, $$3);
            dcb $$52 = $$0.a_($$9);
            if ($$5.get(0) || !$$52.i($$0, $$9)) {
                $$51 = $$10.a($$52, $$0, $$9);
            }
            float $$53 = $$5.get(0) ? $$10.b($$0.a_($$7), $$0, $$7) : $$10.b($$0.a_($$2), $$0, $$2);
            c $$54 = fkq$c.a($$3);
            if (!$$5.get(1) || !$$8.h) {
                float $$55 = ($$22 + $$13 + $$39 + $$53) * 0.25f;
                float $$56 = ($$19 + $$13 + $$34 + $$53) * 0.25f;
                float $$57 = ($$19 + $$16 + $$44 + $$53) * 0.25f;
                float $$58 = ($$22 + $$16 + $$49 + $$53) * 0.25f;
                this.b[$$54.g] = this.a($$21, $$12, $$40, $$51);
                this.b[$$54.h] = this.a($$18, $$12, $$35, $$51);
                this.b[$$54.i] = this.a($$18, $$15, $$45, $$51);
                this.b[$$54.j] = this.a($$21, $$15, $$50, $$51);
                this.a[$$54.g] = $$55;
                this.a[$$54.h] = $$56;
                this.a[$$54.i] = $$57;
                this.a[$$54.j] = $$58;
            } else {
                float $$59 = ($$22 + $$13 + $$39 + $$53) * 0.25f;
                float $$60 = ($$19 + $$13 + $$34 + $$53) * 0.25f;
                float $$61 = ($$19 + $$16 + $$44 + $$53) * 0.25f;
                float $$62 = ($$22 + $$16 + $$49 + $$53) * 0.25f;
                float $$63 = $$4[$$8.i[0].m] * $$4[$$8.i[1].m];
                float $$64 = $$4[$$8.i[2].m] * $$4[$$8.i[3].m];
                float $$65 = $$4[$$8.i[4].m] * $$4[$$8.i[5].m];
                float $$66 = $$4[$$8.i[6].m] * $$4[$$8.i[7].m];
                float $$67 = $$4[$$8.j[0].m] * $$4[$$8.j[1].m];
                float $$68 = $$4[$$8.j[2].m] * $$4[$$8.j[3].m];
                float $$69 = $$4[$$8.j[4].m] * $$4[$$8.j[5].m];
                float $$70 = $$4[$$8.j[6].m] * $$4[$$8.j[7].m];
                float $$71 = $$4[$$8.k[0].m] * $$4[$$8.k[1].m];
                float $$72 = $$4[$$8.k[2].m] * $$4[$$8.k[3].m];
                float $$73 = $$4[$$8.k[4].m] * $$4[$$8.k[5].m];
                float $$74 = $$4[$$8.k[6].m] * $$4[$$8.k[7].m];
                float $$75 = $$4[$$8.l[0].m] * $$4[$$8.l[1].m];
                float $$76 = $$4[$$8.l[2].m] * $$4[$$8.l[3].m];
                float $$77 = $$4[$$8.l[4].m] * $$4[$$8.l[5].m];
                float $$78 = $$4[$$8.l[6].m] * $$4[$$8.l[7].m];
                this.a[$$54.g] = $$59 * $$63 + $$60 * $$64 + $$61 * $$65 + $$62 * $$66;
                this.a[$$54.h] = $$59 * $$67 + $$60 * $$68 + $$61 * $$69 + $$62 * $$70;
                this.a[$$54.i] = $$59 * $$71 + $$60 * $$72 + $$61 * $$73 + $$62 * $$74;
                this.a[$$54.j] = $$59 * $$75 + $$60 * $$76 + $$61 * $$77 + $$62 * $$78;
                int $$79 = this.a($$21, $$12, $$40, $$51);
                int $$80 = this.a($$18, $$12, $$35, $$51);
                int $$81 = this.a($$18, $$15, $$45, $$51);
                int $$82 = this.a($$21, $$15, $$50, $$51);
                this.b[$$54.g] = this.a($$79, $$80, $$81, $$82, $$63, $$64, $$65, $$66);
                this.b[$$54.h] = this.a($$79, $$80, $$81, $$82, $$67, $$68, $$69, $$70);
                this.b[$$54.i] = this.a($$79, $$80, $$81, $$82, $$71, $$72, $$73, $$74);
                this.b[$$54.j] = this.a($$79, $$80, $$81, $$82, $$75, $$76, $$77, $$78);
            }
            float $$83 = $$0.a($$3, $$6);
            int $$84 = 0;
            while ($$84 < this.a.length) {
                int n2 = $$84++;
                this.a[n2] = this.a[n2] * $$83;
            }
        }

        private int a(int $$0, int $$1, int $$2, int $$3) {
            if ($$0 == 0) {
                $$0 = $$3;
            }
            if ($$1 == 0) {
                $$1 = $$3;
            }
            if ($$2 == 0) {
                $$2 = $$3;
            }
            return $$0 + $$1 + $$2 + $$3 >> 2 & 0xFF00FF;
        }

        private int a(int $$0, int $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
            int $$8 = (int)((float)($$0 >> 16 & 0xFF) * $$4 + (float)($$1 >> 16 & 0xFF) * $$5 + (float)($$2 >> 16 & 0xFF) * $$6 + (float)($$3 >> 16 & 0xFF) * $$7) & 0xFF;
            int $$9 = (int)((float)($$0 & 0xFF) * $$4 + (float)($$1 & 0xFF) * $$5 + (float)($$2 & 0xFF) * $$6 + (float)($$3 & 0xFF) * $$7) & 0xFF;
            return $$8 << 16 | $$9;
        }
    }

    static class d {
        private boolean a;
        private final Long2IntLinkedOpenHashMap b = ac.a(() -> {
            Long2IntLinkedOpenHashMap $$0 = new Long2IntLinkedOpenHashMap(100, 0.25f){

                protected void rehash(int $$0) {
                }
            };
            $$0.defaultReturnValue(Integer.MAX_VALUE);
            return $$0;
        });
        private final Long2FloatLinkedOpenHashMap c = ac.a(() -> {
            Long2FloatLinkedOpenHashMap $$0 = new Long2FloatLinkedOpenHashMap(100, 0.25f){

                protected void rehash(int $$0) {
                }
            };
            $$0.defaultReturnValue(Float.NaN);
            return $$0;
        });

        private d() {
        }

        public void a() {
            this.a = true;
        }

        public void b() {
            this.a = false;
            this.b.clear();
            this.c.clear();
        }

        public int a(dcb $$0, clp $$1, gu $$2) {
            int $$4;
            long $$3 = $$2.a();
            if (this.a && ($$4 = this.b.get($$3)) != Integer.MAX_VALUE) {
                return $$4;
            }
            int $$5 = fjv.a($$1, $$0, $$2);
            if (this.a) {
                if (this.b.size() == 100) {
                    this.b.removeFirstInt();
                }
                this.b.put($$3, $$5);
            }
            return $$5;
        }

        public float b(dcb $$0, clp $$1, gu $$2) {
            float $$4;
            long $$3 = $$2.a();
            if (this.a && !Float.isNaN($$4 = this.c.get($$3))) {
                return $$4;
            }
            float $$5 = $$0.f($$1, $$2);
            if (this.a) {
                if (this.c.size() == 100) {
                    this.c.removeFirstFloat();
                }
                this.c.put($$3, $$5);
            }
            return $$5;
        }
    }

    protected static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(new ha[]{ha.e, ha.f, ha.c, ha.d}, 0.5f, true, new e[]{fkq$e.k, fkq$e.d, fkq$e.k, fkq$e.j, fkq$e.e, fkq$e.j, fkq$e.e, fkq$e.d}, new e[]{fkq$e.k, fkq$e.c, fkq$e.k, fkq$e.i, fkq$e.e, fkq$e.i, fkq$e.e, fkq$e.c}, new e[]{fkq$e.l, fkq$e.c, fkq$e.l, fkq$e.i, fkq$e.f, fkq$e.i, fkq$e.f, fkq$e.c}, new e[]{fkq$e.l, fkq$e.d, fkq$e.l, fkq$e.j, fkq$e.f, fkq$e.j, fkq$e.f, fkq$e.d});
        public static final /* enum */ a b = new a(new ha[]{ha.f, ha.e, ha.c, ha.d}, 1.0f, true, new e[]{fkq$e.f, fkq$e.d, fkq$e.f, fkq$e.j, fkq$e.l, fkq$e.j, fkq$e.l, fkq$e.d}, new e[]{fkq$e.f, fkq$e.c, fkq$e.f, fkq$e.i, fkq$e.l, fkq$e.i, fkq$e.l, fkq$e.c}, new e[]{fkq$e.e, fkq$e.c, fkq$e.e, fkq$e.i, fkq$e.k, fkq$e.i, fkq$e.k, fkq$e.c}, new e[]{fkq$e.e, fkq$e.d, fkq$e.e, fkq$e.j, fkq$e.k, fkq$e.j, fkq$e.k, fkq$e.d});
        public static final /* enum */ a c = new a(new ha[]{ha.b, ha.a, ha.f, ha.e}, 0.8f, true, new e[]{fkq$e.b, fkq$e.k, fkq$e.b, fkq$e.e, fkq$e.h, fkq$e.e, fkq$e.h, fkq$e.k}, new e[]{fkq$e.b, fkq$e.l, fkq$e.b, fkq$e.f, fkq$e.h, fkq$e.f, fkq$e.h, fkq$e.l}, new e[]{fkq$e.a, fkq$e.l, fkq$e.a, fkq$e.f, fkq$e.g, fkq$e.f, fkq$e.g, fkq$e.l}, new e[]{fkq$e.a, fkq$e.k, fkq$e.a, fkq$e.e, fkq$e.g, fkq$e.e, fkq$e.g, fkq$e.k});
        public static final /* enum */ a d = new a(new ha[]{ha.e, ha.f, ha.a, ha.b}, 0.8f, true, new e[]{fkq$e.b, fkq$e.k, fkq$e.h, fkq$e.k, fkq$e.h, fkq$e.e, fkq$e.b, fkq$e.e}, new e[]{fkq$e.a, fkq$e.k, fkq$e.g, fkq$e.k, fkq$e.g, fkq$e.e, fkq$e.a, fkq$e.e}, new e[]{fkq$e.a, fkq$e.l, fkq$e.g, fkq$e.l, fkq$e.g, fkq$e.f, fkq$e.a, fkq$e.f}, new e[]{fkq$e.b, fkq$e.l, fkq$e.h, fkq$e.l, fkq$e.h, fkq$e.f, fkq$e.b, fkq$e.f});
        public static final /* enum */ a e = new a(new ha[]{ha.b, ha.a, ha.c, ha.d}, 0.6f, true, new e[]{fkq$e.b, fkq$e.d, fkq$e.b, fkq$e.j, fkq$e.h, fkq$e.j, fkq$e.h, fkq$e.d}, new e[]{fkq$e.b, fkq$e.c, fkq$e.b, fkq$e.i, fkq$e.h, fkq$e.i, fkq$e.h, fkq$e.c}, new e[]{fkq$e.a, fkq$e.c, fkq$e.a, fkq$e.i, fkq$e.g, fkq$e.i, fkq$e.g, fkq$e.c}, new e[]{fkq$e.a, fkq$e.d, fkq$e.a, fkq$e.j, fkq$e.g, fkq$e.j, fkq$e.g, fkq$e.d});
        public static final /* enum */ a f = new a(new ha[]{ha.a, ha.b, ha.c, ha.d}, 0.6f, true, new e[]{fkq$e.g, fkq$e.d, fkq$e.g, fkq$e.j, fkq$e.a, fkq$e.j, fkq$e.a, fkq$e.d}, new e[]{fkq$e.g, fkq$e.c, fkq$e.g, fkq$e.i, fkq$e.a, fkq$e.i, fkq$e.a, fkq$e.c}, new e[]{fkq$e.h, fkq$e.c, fkq$e.h, fkq$e.i, fkq$e.b, fkq$e.i, fkq$e.b, fkq$e.c}, new e[]{fkq$e.h, fkq$e.d, fkq$e.h, fkq$e.j, fkq$e.b, fkq$e.j, fkq$e.b, fkq$e.d});
        final ha[] g;
        final boolean h;
        final e[] i;
        final e[] j;
        final e[] k;
        final e[] l;
        private static final a[] m;
        private static final /* synthetic */ a[] n;

        public static a[] values() {
            return (a[])n.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(ha[] $$0, float $$1, boolean $$2, e[] $$3, e[] $$4, e[] $$5, e[] $$6) {
            this.g = $$0;
            this.h = $$2;
            this.i = $$3;
            this.j = $$4;
            this.k = $$5;
            this.l = $$6;
        }

        public static a a(ha $$0) {
            return m[$$0.d()];
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f};
        }

        static {
            n = fkq$a.a();
            m = ac.a(new a[6], $$0 -> {
                $$0[ha.a.d()] = a;
                $$0[ha.b.d()] = b;
                $$0[ha.c.d()] = c;
                $$0[ha.d.d()] = d;
                $$0[ha.e.d()] = e;
                $$0[ha.f.d()] = f;
            });
        }
    }

    protected static final class e
    extends Enum<e> {
        public static final /* enum */ e a = new e(ha.a, false);
        public static final /* enum */ e b = new e(ha.b, false);
        public static final /* enum */ e c = new e(ha.c, false);
        public static final /* enum */ e d = new e(ha.d, false);
        public static final /* enum */ e e = new e(ha.e, false);
        public static final /* enum */ e f = new e(ha.f, false);
        public static final /* enum */ e g = new e(ha.a, true);
        public static final /* enum */ e h = new e(ha.b, true);
        public static final /* enum */ e i = new e(ha.c, true);
        public static final /* enum */ e j = new e(ha.d, true);
        public static final /* enum */ e k = new e(ha.e, true);
        public static final /* enum */ e l = new e(ha.f, true);
        final int m;
        private static final /* synthetic */ e[] n;

        public static e[] values() {
            return (e[])n.clone();
        }

        public static e valueOf(String $$0) {
            return Enum.valueOf(e.class, $$0);
        }

        private e(ha $$0, boolean $$1) {
            this.m = $$0.d() + ($$1 ? c.length : 0);
        }

        private static /* synthetic */ e[] a() {
            return new e[]{a, b, c, d, e, f, g, h, i, j, k, l};
        }

        static {
            n = fkq$e.a();
        }
    }

    static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c(0, 1, 2, 3);
        public static final /* enum */ c b = new c(2, 3, 0, 1);
        public static final /* enum */ c c = new c(3, 0, 1, 2);
        public static final /* enum */ c d = new c(0, 1, 2, 3);
        public static final /* enum */ c e = new c(3, 0, 1, 2);
        public static final /* enum */ c f = new c(1, 2, 3, 0);
        final int g;
        final int h;
        final int i;
        final int j;
        private static final c[] k;
        private static final /* synthetic */ c[] l;

        public static c[] values() {
            return (c[])l.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private c(int $$0, int $$1, int $$2, int $$3) {
            this.g = $$0;
            this.h = $$1;
            this.i = $$2;
            this.j = $$3;
        }

        public static c a(ha $$0) {
            return k[$$0.d()];
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c, d, e, f};
        }

        static {
            l = fkq$c.a();
            k = ac.a(new c[6], $$0 -> {
                $$0[ha.a.d()] = a;
                $$0[ha.b.d()] = b;
                $$0[ha.c.d()] = c;
                $$0[ha.d.d()] = d;
                $$0[ha.e.d()] = e;
                $$0[ha.f.d()] = f;
            });
        }
    }
}

