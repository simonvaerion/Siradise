/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class dmd
extends dko<dnr> {
    public dmd(Codec<dnr> $$0) {
        super($$0);
    }

    @Override
    public boolean a(dkq<dnr> $$0) {
        cng $$12 = $$0.b();
        dnr $$2 = $$0.f();
        apf $$3 = $$0.d();
        gu $$4 = $$0.e();
        Predicate<dcb> $$5 = $$1 -> $$1.a($$0.b);
        int $$6 = $$2.j.a($$3) + 1;
        int $$7 = $$2.j.a($$3) + 1;
        Set<gu> $$8 = this.a($$12, $$2, $$3, $$4, $$5, $$6, $$7);
        this.a($$0, $$12, $$2, $$3, $$8, $$6, $$7);
        return !$$8.isEmpty();
    }

    protected Set<gu> a(cng $$02, dnr $$1, apf $$2, gu $$3, Predicate<dcb> $$4, int $$5, int $$6) {
        gu.a $$7 = $$3.j();
        gu.a $$8 = $$7.j();
        ha $$9 = $$1.e.a();
        ha $$10 = $$9.g();
        HashSet<gu> $$11 = new HashSet<gu>();
        for (int $$12 = -$$5; $$12 <= $$5; ++$$12) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            for (int $$14 = -$$6; $$14 <= $$6; ++$$14) {
                int $$19;
                boolean $$18;
                boolean $$15 = $$14 == -$$6 || $$14 == $$6;
                boolean $$16 = $$13 || $$15;
                boolean $$17 = $$13 && $$15;
                boolean bl2 = $$18 = $$16 && !$$17;
                if ($$17 || $$18 && ($$1.k == 0.0f || $$2.i() > $$1.k)) continue;
                $$7.a($$3, $$12, 0, $$14);
                for ($$19 = 0; $$02.a((gu)$$7, dca.a::i) && $$19 < $$1.h; ++$$19) {
                    $$7.c($$9);
                }
                for ($$19 = 0; $$02.a((gu)$$7, (dcb $$0) -> !$$0.i()) && $$19 < $$1.h; ++$$19) {
                    $$7.c($$10);
                }
                $$8.a((hz)$$7, $$1.e.a());
                dcb $$20 = $$02.a_($$8);
                if (!$$02.t($$7) || !$$20.d($$02, $$8, $$1.e.a().g())) continue;
                int $$21 = $$1.f.a($$2) + ($$1.g > 0.0f && $$2.i() < $$1.g ? 1 : 0);
                gu $$22 = $$8.i();
                boolean $$23 = this.a($$02, $$1, $$4, $$2, $$8, $$21);
                if (!$$23) continue;
                $$11.add($$22);
            }
        }
        return $$11;
    }

    protected void a(dkq<dnr> $$0, cng $$1, dnr $$2, apf $$3, Set<gu> $$4, int $$5, int $$6) {
        for (gu $$7 : $$4) {
            if (!($$2.i > 0.0f) || !($$3.i() < $$2.i)) continue;
            this.a($$1, $$2, $$0.c(), $$3, $$7);
        }
    }

    protected boolean a(cng $$0, dnr $$1, ddy $$2, apf $$3, gu $$4) {
        return $$1.d.a().a($$0, $$2, $$3, $$4.a($$1.e.a().g()));
    }

    protected boolean a(cng $$0, dnr $$1, Predicate<dcb> $$2, apf $$3, gu.a $$4, int $$5) {
        for (int $$6 = 0; $$6 < $$5; ++$$6) {
            dcb $$8;
            dcb $$7 = $$1.c.a($$3, $$4);
            if ($$7.a(($$8 = $$0.a_($$4)).b())) continue;
            if (!$$2.test($$8)) {
                return $$6 != 0;
            }
            $$0.a((gu)$$4, $$7, 2);
            $$4.c($$1.e.a());
        }
        return true;
    }
}

