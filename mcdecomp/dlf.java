/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dlf
extends dko<dmz> {
    private static final Logger a = LogUtils.getLogger();
    private static final bfn<?>[] b = new bfn[]{bfn.aJ, bfn.bp, bfn.bp, bfn.aS};
    private static final dcb c = cpo.nc.n();

    public dlf(Codec<dmz> $$0) {
        super($$0);
    }

    @Override
    public boolean a(dkq<dmz> $$0) {
        Predicate<dcb> $$1 = dko.a(amw.bF);
        gu $$2 = $$0.e();
        apf $$3 = $$0.d();
        cng $$4 = $$0.b();
        int $$5 = 3;
        int $$6 = $$3.a(2) + 2;
        int $$7 = -$$6 - 1;
        int $$8 = $$6 + 1;
        int $$9 = -1;
        int $$10 = 4;
        int $$11 = $$3.a(2) + 2;
        int $$12 = -$$11 - 1;
        int $$13 = $$11 + 1;
        int $$14 = 0;
        for (int $$15 = $$7; $$15 <= $$8; ++$$15) {
            for (int $$16 = -1; $$16 <= 4; ++$$16) {
                for (int $$17 = $$12; $$17 <= $$13; ++$$17) {
                    gu $$18 = $$2.b($$15, $$16, $$17);
                    boolean $$19 = $$4.a_($$18).e();
                    if ($$16 == -1 && !$$19) {
                        return false;
                    }
                    if ($$16 == 4 && !$$19) {
                        return false;
                    }
                    if ($$15 != $$7 && $$15 != $$8 && $$17 != $$12 && $$17 != $$13 || $$16 != 0 || !$$4.t($$18) || !$$4.t($$18.c())) continue;
                    ++$$14;
                }
            }
        }
        if ($$14 < 1 || $$14 > 5) {
            return false;
        }
        for (int $$20 = $$7; $$20 <= $$8; ++$$20) {
            for (int $$21 = 3; $$21 >= -1; --$$21) {
                for (int $$22 = $$12; $$22 <= $$13; ++$$22) {
                    gu $$23 = $$2.b($$20, $$21, $$22);
                    dcb $$24 = $$4.a_($$23);
                    if ($$20 == $$7 || $$21 == -1 || $$22 == $$12 || $$20 == $$8 || $$21 == 4 || $$22 == $$13) {
                        if ($$23.v() >= $$4.C_() && !$$4.a_($$23.d()).e()) {
                            $$4.a($$23, c, 2);
                            continue;
                        }
                        if (!$$24.e() || $$24.a(cpo.cv)) continue;
                        if ($$21 == -1 && $$3.a(4) != 0) {
                            this.a($$4, $$23, cpo.cn.n(), $$1);
                            continue;
                        }
                        this.a($$4, $$23, cpo.m.n(), $$1);
                        continue;
                    }
                    if ($$24.a(cpo.cv) || $$24.a(cpo.ct)) continue;
                    this.a($$4, $$23, c, $$1);
                }
            }
        }
        block6: for (int $$25 = 0; $$25 < 2; ++$$25) {
            for (int $$26 = 0; $$26 < 3; ++$$26) {
                int $$29;
                int $$28;
                int $$27 = $$2.u() + $$3.a($$6 * 2 + 1) - $$6;
                gu $$30 = new gu($$27, $$28 = $$2.v(), $$29 = $$2.w() + $$3.a($$11 * 2 + 1) - $$11);
                if (!$$4.t($$30)) continue;
                int $$31 = 0;
                for (ha $$32 : ha.c.a) {
                    if (!$$4.a_($$30.a($$32)).e()) continue;
                    ++$$31;
                }
                if ($$31 != 1) continue;
                this.a($$4, $$30, dse.a($$4, $$30, cpo.cv.n()), $$1);
                daq.a($$4, $$3, $$30, dzg.d);
                continue block6;
            }
        }
        this.a($$4, $$2, cpo.ct.n(), $$1);
        czn $$33 = $$4.c_($$2);
        if ($$33 instanceof daz) {
            daz $$34 = (daz)$$33;
            $$34.a(this.a($$3), $$3);
        } else {
            a.error("Failed to fetch mob spawner entity at ({}, {}, {})", new Object[]{$$2.u(), $$2.v(), $$2.w()});
        }
        return true;
    }

    private bfn<?> a(apf $$0) {
        return ac.a(b, $$0);
    }
}

