/*
 * Decompiled with CFR 0.152.
 */
public class fkp {
    private static final float a = 0.8888889f;
    private final fuv[] b = new fuv[2];
    private final fuv[] c = new fuv[2];
    private fuv d;

    protected void a() {
        this.b[0] = enn.N().aD().b().b(cpo.H.n()).e();
        this.b[1] = fww.c.c();
        this.c[0] = enn.N().aD().b().b(cpo.G.n()).e();
        this.c[1] = fww.d.c();
        this.d = fww.e.c();
    }

    private static boolean a(dxe $$0, dxe $$1) {
        return $$1.a().a($$0.a());
    }

    private static boolean a(cls $$0, ha $$1, float $$2, gu $$3, dcb $$4) {
        if ($$4.p()) {
            efb $$5 = eey.a(0.0, 0.0, 0.0, 1.0, $$2, 1.0);
            efb $$6 = $$4.c($$0, $$3);
            return eey.a($$5, $$6, $$1);
        }
        return false;
    }

    private static boolean a(cls $$0, gu $$1, ha $$2, float $$3, dcb $$4) {
        return fkp.a($$0, $$2, $$3, $$1.a($$2), $$4);
    }

    private static boolean a(cls $$0, gu $$1, dcb $$2, ha $$3) {
        return fkp.a($$0, $$3.g(), 1.0f, $$1, $$2);
    }

    public static boolean a(clp $$0, gu $$1, dxe $$2, dcb $$3, ha $$4, dxe $$5) {
        return !fkp.a($$0, $$1, $$3, $$4) && !fkp.a($$2, $$5);
    }

    /*
     * WARNING - void declaration
     */
    public void a(clp $$0, gu $$1, ein $$2, dcb $$3, dxe $$4) {
        float $$51;
        float $$46;
        float $$45;
        float $$44;
        float $$43;
        boolean $$5 = $$4.a(anb.b);
        fuv[] $$6 = $$5 ? this.b : this.c;
        int $$7 = $$5 ? 0xFFFFFF : fji.c($$0, $$1);
        float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0f;
        float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0f;
        float $$10 = (float)($$7 & 0xFF) / 255.0f;
        dcb $$11 = $$0.a_($$1.a(ha.a));
        dxe $$12 = $$11.u();
        dcb $$13 = $$0.a_($$1.a(ha.b));
        dxe $$14 = $$13.u();
        dcb $$15 = $$0.a_($$1.a(ha.c));
        dxe $$16 = $$15.u();
        dcb $$17 = $$0.a_($$1.a(ha.d));
        dxe $$18 = $$17.u();
        dcb $$19 = $$0.a_($$1.a(ha.e));
        dxe $$20 = $$19.u();
        dcb $$21 = $$0.a_($$1.a(ha.f));
        dxe $$22 = $$21.u();
        boolean $$23 = !fkp.a($$4, $$14);
        boolean $$24 = fkp.a($$0, $$1, $$4, $$3, ha.a, $$12) && !fkp.a((cls)$$0, $$1, ha.a, 0.8888889f, $$11);
        boolean $$25 = fkp.a($$0, $$1, $$4, $$3, ha.c, $$16);
        boolean $$26 = fkp.a($$0, $$1, $$4, $$3, ha.d, $$18);
        boolean $$27 = fkp.a($$0, $$1, $$4, $$3, ha.e, $$20);
        boolean $$28 = fkp.a($$0, $$1, $$4, $$3, ha.f, $$22);
        if (!($$23 || $$24 || $$28 || $$27 || $$25 || $$26)) {
            return;
        }
        float $$29 = $$0.a(ha.a, true);
        float $$30 = $$0.a(ha.b, true);
        float $$31 = $$0.a(ha.c, true);
        float $$32 = $$0.a(ha.e, true);
        dxd $$33 = $$4.a();
        float $$34 = this.a($$0, $$33, $$1, $$3, $$4);
        if ($$34 >= 1.0f) {
            float $$35 = 1.0f;
            float $$36 = 1.0f;
            float $$37 = 1.0f;
            float $$38 = 1.0f;
        } else {
            float $$39 = this.a($$0, $$33, $$1.e(), $$15, $$16);
            float $$40 = this.a($$0, $$33, $$1.f(), $$17, $$18);
            float $$41 = this.a($$0, $$33, $$1.h(), $$21, $$22);
            float $$42 = this.a($$0, $$33, $$1.g(), $$19, $$20);
            $$43 = this.a($$0, $$33, $$34, $$39, $$41, $$1.a(ha.c).a(ha.f));
            $$44 = this.a($$0, $$33, $$34, $$39, $$42, $$1.a(ha.c).a(ha.e));
            $$45 = this.a($$0, $$33, $$34, $$40, $$41, $$1.a(ha.d).a(ha.f));
            $$46 = this.a($$0, $$33, $$34, $$40, $$42, $$1.a(ha.d).a(ha.e));
        }
        double $$47 = $$1.u() & 0xF;
        double $$48 = $$1.v() & 0xF;
        double $$49 = $$1.w() & 0xF;
        float $$50 = 0.001f;
        float f2 = $$51 = $$24 ? 0.001f : 0.0f;
        if ($$23 && !fkp.a((cls)$$0, $$1, ha.b, Math.min(Math.min($$44, $$46), Math.min($$45, $$43)), $$13)) {
            float $$74;
            float $$73;
            float $$72;
            float $$71;
            float $$70;
            float $$69;
            float $$68;
            float $$67;
            $$44 -= 0.001f;
            $$46 -= 0.001f;
            $$45 -= 0.001f;
            $$43 -= 0.001f;
            eei $$52 = $$4.c($$0, $$1);
            if ($$52.c == 0.0 && $$52.e == 0.0) {
                fuv $$53 = $$6[0];
                float $$54 = $$53.a(0.0);
                float $$55 = $$53.b(0.0);
                float $$56 = $$54;
                float $$57 = $$53.b(16.0);
                float $$58 = $$53.a(16.0);
                float $$59 = $$57;
                float $$60 = $$58;
                float $$61 = $$55;
            } else {
                fuv $$62 = $$6[1];
                float $$63 = (float)apa.d($$52.e, $$52.c) - 1.5707964f;
                float $$64 = apa.a($$63) * 0.25f;
                float $$65 = apa.b($$63) * 0.25f;
                float $$66 = 8.0f;
                $$67 = $$62.a((double)(8.0f + (-$$65 - $$64) * 16.0f));
                $$68 = $$62.b((double)(8.0f + (-$$65 + $$64) * 16.0f));
                $$69 = $$62.a((double)(8.0f + (-$$65 + $$64) * 16.0f));
                $$70 = $$62.b((double)(8.0f + ($$65 + $$64) * 16.0f));
                $$71 = $$62.a((double)(8.0f + ($$65 + $$64) * 16.0f));
                $$72 = $$62.b((double)(8.0f + ($$65 - $$64) * 16.0f));
                $$73 = $$62.a((double)(8.0f + ($$65 - $$64) * 16.0f));
                $$74 = $$62.b((double)(8.0f + (-$$65 - $$64) * 16.0f));
            }
            void $$75 = ($$67 + $$69 + $$71 + $$73) / 4.0f;
            void $$76 = ($$68 + $$70 + $$72 + $$74) / 4.0f;
            float $$77 = $$6[0].k();
            $$67 = apa.i($$77, $$67, (float)$$75);
            $$69 = apa.i($$77, $$69, (float)$$75);
            $$71 = apa.i($$77, $$71, (float)$$75);
            $$73 = apa.i($$77, $$73, (float)$$75);
            $$68 = apa.i($$77, $$68, (float)$$76);
            $$70 = apa.i($$77, $$70, (float)$$76);
            $$72 = apa.i($$77, $$72, (float)$$76);
            $$74 = apa.i($$77, $$74, (float)$$76);
            int $$78 = this.a($$0, $$1);
            float $$79 = $$30 * $$8;
            float $$80 = $$30 * $$9;
            float $$81 = $$30 * $$10;
            this.a($$2, $$47 + 0.0, $$48 + (double)$$44, $$49 + 0.0, $$79, $$80, $$81, $$67, $$68, $$78);
            this.a($$2, $$47 + 0.0, $$48 + (double)$$46, $$49 + 1.0, $$79, $$80, $$81, $$69, $$70, $$78);
            this.a($$2, $$47 + 1.0, $$48 + (double)$$45, $$49 + 1.0, $$79, $$80, $$81, $$71, $$72, $$78);
            this.a($$2, $$47 + 1.0, $$48 + (double)$$43, $$49 + 0.0, $$79, $$80, $$81, $$73, $$74, $$78);
            if ($$4.b($$0, $$1.c())) {
                this.a($$2, $$47 + 0.0, $$48 + (double)$$44, $$49 + 0.0, $$79, $$80, $$81, $$67, $$68, $$78);
                this.a($$2, $$47 + 1.0, $$48 + (double)$$43, $$49 + 0.0, $$79, $$80, $$81, $$73, $$74, $$78);
                this.a($$2, $$47 + 1.0, $$48 + (double)$$45, $$49 + 1.0, $$79, $$80, $$81, $$71, $$72, $$78);
                this.a($$2, $$47 + 0.0, $$48 + (double)$$46, $$49 + 1.0, $$79, $$80, $$81, $$69, $$70, $$78);
            }
        }
        if ($$24) {
            float $$82 = $$6[0].c();
            float $$83 = $$6[0].d();
            float $$84 = $$6[0].g();
            float $$85 = $$6[0].h();
            int $$86 = this.a($$0, $$1.d());
            float $$87 = $$29 * $$8;
            float $$88 = $$29 * $$9;
            float $$89 = $$29 * $$10;
            this.a($$2, $$47, $$48 + (double)$$51, $$49 + 1.0, $$87, $$88, $$89, $$82, $$85, $$86);
            this.a($$2, $$47, $$48 + (double)$$51, $$49, $$87, $$88, $$89, $$82, $$84, $$86);
            this.a($$2, $$47 + 1.0, $$48 + (double)$$51, $$49, $$87, $$88, $$89, $$83, $$84, $$86);
            this.a($$2, $$47 + 1.0, $$48 + (double)$$51, $$49 + 1.0, $$87, $$88, $$89, $$83, $$85, $$86);
        }
        int $$90 = this.a($$0, $$1);
        for (ha $$91 : ha.c.a) {
            cpn $$122;
            boolean $$119;
            double $$118;
            double $$117;
            double $$116;
            double $$115;
            void $$114;
            float $$113;
            switch ($$91) {
                case c: {
                    void $$92 = $$44;
                    float $$93 = $$43;
                    double $$94 = $$47;
                    double $$95 = $$47 + 1.0;
                    double $$96 = $$49 + (double)0.001f;
                    double $$97 = $$49 + (double)0.001f;
                    boolean $$98 = $$25;
                    break;
                }
                case d: {
                    void $$99 = $$45;
                    void $$100 = $$46;
                    double $$101 = $$47 + 1.0;
                    double $$102 = $$47;
                    double $$103 = $$49 + 1.0 - (double)0.001f;
                    double $$104 = $$49 + 1.0 - (double)0.001f;
                    boolean $$105 = $$26;
                    break;
                }
                case e: {
                    void $$106 = $$46;
                    void $$107 = $$44;
                    double $$108 = $$47 + (double)0.001f;
                    double $$109 = $$47 + (double)0.001f;
                    double $$110 = $$49 + 1.0;
                    double $$111 = $$49;
                    boolean $$112 = $$27;
                    break;
                }
                default: {
                    $$113 = $$43;
                    $$114 = $$45;
                    $$115 = $$47 + 1.0 - (double)0.001f;
                    $$116 = $$47 + 1.0 - (double)0.001f;
                    $$117 = $$49;
                    $$118 = $$49 + 1.0;
                    $$119 = $$28;
                }
            }
            if (!$$119 || fkp.a((cls)$$0, $$1, $$91, Math.max($$113, (float)$$114), $$0.a_($$1.a($$91)))) continue;
            gu $$120 = $$1.a($$91);
            fuv $$121 = $$6[1];
            if (!$$5 && (($$122 = $$0.a_($$120).b()) instanceof ctb || $$122 instanceof ctu)) {
                $$121 = this.d;
            }
            float $$123 = $$121.a(0.0);
            float $$124 = $$121.a(8.0);
            float $$125 = $$121.b((double)((1.0f - $$113) * 16.0f * 0.5f));
            float $$126 = $$121.b((double)((1.0f - $$114) * 16.0f * 0.5f));
            float $$127 = $$121.b(8.0);
            float $$128 = $$91.o() == ha.a.c ? $$31 : $$32;
            float $$129 = $$30 * $$128 * $$8;
            float $$130 = $$30 * $$128 * $$9;
            float $$131 = $$30 * $$128 * $$10;
            this.a($$2, $$115, $$48 + (double)$$113, $$117, $$129, $$130, $$131, $$123, $$125, $$90);
            this.a($$2, $$116, $$48 + (double)$$114, $$118, $$129, $$130, $$131, $$124, $$126, $$90);
            this.a($$2, $$116, $$48 + (double)$$51, $$118, $$129, $$130, $$131, $$124, $$127, $$90);
            this.a($$2, $$115, $$48 + (double)$$51, $$117, $$129, $$130, $$131, $$123, $$127, $$90);
            if ($$121 == this.d) continue;
            this.a($$2, $$115, $$48 + (double)$$51, $$117, $$129, $$130, $$131, $$123, $$127, $$90);
            this.a($$2, $$116, $$48 + (double)$$51, $$118, $$129, $$130, $$131, $$124, $$127, $$90);
            this.a($$2, $$116, $$48 + (double)$$114, $$118, $$129, $$130, $$131, $$124, $$126, $$90);
            this.a($$2, $$115, $$48 + (double)$$113, $$117, $$129, $$130, $$131, $$123, $$125, $$90);
        }
    }

    private float a(clp $$0, dxd $$1, float $$2, float $$3, float $$4, gu $$5) {
        if ($$4 >= 1.0f || $$3 >= 1.0f) {
            return 1.0f;
        }
        float[] $$6 = new float[2];
        if ($$4 > 0.0f || $$3 > 0.0f) {
            float $$7 = this.a($$0, $$1, $$5);
            if ($$7 >= 1.0f) {
                return 1.0f;
            }
            this.a($$6, $$7);
        }
        this.a($$6, $$2);
        this.a($$6, $$4);
        this.a($$6, $$3);
        return $$6[0] / $$6[1];
    }

    private void a(float[] $$0, float $$1) {
        if ($$1 >= 0.8f) {
            $$0[0] = $$0[0] + $$1 * 10.0f;
            $$0[1] = $$0[1] + 10.0f;
        } else if ($$1 >= 0.0f) {
            $$0[0] = $$0[0] + $$1;
            $$0[1] = $$0[1] + 1.0f;
        }
    }

    private float a(clp $$0, dxd $$1, gu $$2) {
        dcb $$3 = $$0.a_($$2);
        return this.a($$0, $$1, $$2, $$3, $$3.u());
    }

    private float a(clp $$0, dxd $$1, gu $$2, dcb $$3, dxe $$4) {
        if ($$1.a($$4.a())) {
            dcb $$5 = $$0.a_($$2.c());
            if ($$1.a($$5.u().a())) {
                return 1.0f;
            }
            return $$4.d();
        }
        if (!$$3.e()) {
            return 0.0f;
        }
        return -1.0f;
    }

    private void a(ein $$0, double $$1, double $$2, double $$3, float $$4, float $$5, float $$6, float $$7, float $$8, int $$9) {
        $$0.a($$1, $$2, $$3).a($$4, $$5, $$6, 1.0f).a($$7, $$8).b($$9).a(0.0f, 1.0f, 0.0f).e();
    }

    private int a(clp $$0, gu $$1) {
        int $$2 = fjv.a($$0, $$1);
        int $$3 = fjv.a($$0, $$1.c());
        int $$4 = $$2 & 0xFF;
        int $$5 = $$3 & 0xFF;
        int $$6 = $$2 >> 16 & 0xFF;
        int $$7 = $$3 >> 16 & 0xFF;
        return ($$4 > $$5 ? $$4 : $$5) | ($$6 > $$7 ? $$6 : $$7) << 16;
    }
}

