/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dky
extends dko<dkx> {
    private static final float a = 0.06f;

    public dky(Codec<dkx> $$0) {
        super($$0);
    }

    @Override
    public boolean a(dkq<dkx> $$0) {
        cng $$1 = $$0.b();
        gu $$2 = $$0.e();
        apf $$3 = $$0.d();
        ddy $$4 = $$0.c();
        dkx $$5 = $$0.f();
        cpn $$6 = $$5.b.b();
        gu $$7 = null;
        dcb $$8 = $$1.a_($$2.d());
        if ($$8.a($$6)) {
            $$7 = $$2;
        }
        if ($$7 == null) {
            return false;
        }
        int $$9 = apa.a($$3, 4, 13);
        if ($$3.a(12) == 0) {
            $$9 *= 2;
        }
        if (!$$5.g) {
            int $$10 = $$4.d();
            if ($$7.v() + $$9 + 1 >= $$10) {
                return false;
            }
        }
        boolean $$11 = !$$5.g && $$3.i() < 0.06f;
        $$1.a($$2, cpo.a.n(), 4);
        this.a($$1, $$3, $$5, $$7, $$9, $$11);
        this.b($$1, $$3, $$5, $$7, $$9, $$11);
        return true;
    }

    private static boolean a(cng $$0, gu $$1, dkx $$2, boolean $$3) {
        if ($$0.a($$1, dca.a::r)) {
            return true;
        }
        if ($$3) {
            return $$2.f.test($$0, $$1);
        }
        return false;
    }

    private void a(cng $$0, apf $$1, dkx $$2, gu $$3, int $$4, boolean $$5) {
        gu.a $$6 = new gu.a();
        dcb $$7 = $$2.c;
        int $$8 = $$5 ? 1 : 0;
        for (int $$9 = -$$8; $$9 <= $$8; ++$$9) {
            for (int $$10 = -$$8; $$10 <= $$8; ++$$10) {
                boolean $$11 = $$5 && apa.a($$9) == $$8 && apa.a($$10) == $$8;
                for (int $$12 = 0; $$12 < $$4; ++$$12) {
                    $$6.a($$3, $$9, $$12, $$10);
                    if (!dky.a($$0, $$6, $$2, true)) continue;
                    if ($$2.g) {
                        if (!$$0.a_($$6.d()).i()) {
                            $$0.b((gu)$$6, true);
                        }
                        $$0.a((gu)$$6, $$7, 3);
                        continue;
                    }
                    if ($$11) {
                        if (!($$1.i() < 0.1f)) continue;
                        this.a($$0, $$6, $$7);
                        continue;
                    }
                    this.a($$0, $$6, $$7);
                }
            }
        }
    }

    private void b(cng $$0, apf $$1, dkx $$2, gu $$3, int $$4, boolean $$5) {
        int $$9;
        gu.a $$6 = new gu.a();
        boolean $$7 = $$2.d.a(cpo.kK);
        int $$8 = Math.min($$1.a(1 + $$4 / 3) + 5, $$4);
        for (int $$10 = $$9 = $$4 - $$8; $$10 <= $$4; ++$$10) {
            int $$11;
            int n2 = $$11 = $$10 < $$4 - $$1.a(3) ? 2 : 1;
            if ($$8 > 8 && $$10 < $$9 + 4) {
                $$11 = 3;
            }
            if ($$5) {
                ++$$11;
            }
            for (int $$12 = -$$11; $$12 <= $$11; ++$$12) {
                for (int $$13 = -$$11; $$13 <= $$11; ++$$13) {
                    boolean $$14 = $$12 == -$$11 || $$12 == $$11;
                    boolean $$15 = $$13 == -$$11 || $$13 == $$11;
                    boolean $$16 = !$$14 && !$$15 && $$10 != $$4;
                    boolean $$17 = $$14 && $$15;
                    boolean $$18 = $$10 < $$9 + 3;
                    $$6.a($$3, $$12, $$10, $$13);
                    if (!dky.a($$0, $$6, $$2, false)) continue;
                    if ($$2.g && !$$0.a_($$6.d()).i()) {
                        $$0.b((gu)$$6, true);
                    }
                    if ($$18) {
                        if ($$16) continue;
                        this.a($$0, $$1, $$6, $$2.d, $$7);
                        continue;
                    }
                    if ($$16) {
                        this.a($$0, $$1, $$2, $$6, 0.1f, 0.2f, $$7 ? 0.1f : 0.0f);
                        continue;
                    }
                    if ($$17) {
                        this.a($$0, $$1, $$2, $$6, 0.01f, 0.7f, $$7 ? 0.083f : 0.0f);
                        continue;
                    }
                    this.a($$0, $$1, $$2, $$6, 5.0E-4f, 0.98f, $$7 ? 0.07f : 0.0f);
                }
            }
        }
    }

    private void a(cmn $$0, apf $$1, dkx $$2, gu.a $$3, float $$4, float $$5, float $$6) {
        if ($$1.i() < $$4) {
            this.a($$0, $$3, $$2.e);
        } else if ($$1.i() < $$5) {
            this.a($$0, $$3, $$2.d);
            if ($$1.i() < $$6) {
                dky.a($$3, $$0, $$1);
            }
        }
    }

    private void a(cmn $$0, apf $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$0.a_($$2.d()).a($$3.b())) {
            this.a($$0, $$2, $$3);
        } else if ((double)$$1.i() < 0.15) {
            this.a($$0, $$2, $$3);
            if ($$4 && $$1.a(11) == 0) {
                dky.a($$2, $$0, $$1);
            }
        }
    }

    private static void a(gu $$0, cmn $$1, apf $$2) {
        gu.a $$3 = $$0.j().c(ha.a);
        if (!$$1.t($$3)) {
            return;
        }
        int $$4 = apa.a($$2, 1, 5);
        if ($$2.a(7) == 0) {
            $$4 *= 2;
        }
        int $$5 = 23;
        int $$6 = 25;
        dmh.a($$1, $$2, $$3, $$4, 23, 25);
    }
}

