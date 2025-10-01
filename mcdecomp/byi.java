/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Optional;
import javax.annotation.Nullable;

public class byi
implements clz {
    private static final int b = 1200;
    public static final int a = 24000;
    private static final int c = 25;
    private static final int d = 75;
    private static final int e = 25;
    private static final int f = 10;
    private static final int g = 10;
    private final apf h = apf.a();
    private final dzd i;
    private int j;
    private int k;
    private int l;

    public byi(dzd $$0) {
        this.i = $$0;
        this.j = 1200;
        this.k = $$0.v();
        this.l = $$0.w();
        if (this.k == 0 && this.l == 0) {
            this.k = 24000;
            $$0.g(this.k);
            this.l = 25;
            $$0.h(this.l);
        }
    }

    @Override
    public int a(aif $$0, boolean $$1, boolean $$2) {
        if (!$$0.X().b(cmi.H)) {
            return 0;
        }
        if (--this.j > 0) {
            return 0;
        }
        this.j = 1200;
        this.k -= 1200;
        this.i.g(this.k);
        if (this.k > 0) {
            return 0;
        }
        this.k = 24000;
        if (!$$0.X().b(cmi.e)) {
            return 0;
        }
        int $$3 = this.l;
        this.l = apa.a(this.l + 25, 25, 75);
        this.i.h(this.l);
        if (this.h.a(100) > $$3) {
            return 0;
        }
        if (this.a($$0)) {
            this.l = 25;
            return 1;
        }
        return 0;
    }

    private boolean a(aif $$02) {
        aig $$1 = $$02.i();
        if ($$1 == null) {
            return true;
        }
        if (this.h.a(10) != 0) {
            return false;
        }
        gu $$2 = $$1.di();
        int $$3 = 48;
        bqz $$4 = $$02.w();
        Optional<gu> $$5 = $$4.d($$0 -> $$0.a(brd.o), $$0 -> true, $$2, 48, bqz.b.c);
        gu $$6 = $$5.orElse($$2);
        gu $$7 = this.a((cmp)$$02, $$6, 48);
        if ($$7 != null && this.a($$02, $$7)) {
            if ($$02.s($$7).a(amv.ag)) {
                return false;
            }
            byh $$8 = bfn.bh.a($$02, $$7, bgd.h);
            if ($$8 != null) {
                for (int $$9 = 0; $$9 < 2; ++$$9) {
                    this.a($$02, $$8, 4);
                }
                this.i.a($$8.ct());
                $$8.u(48000);
                $$8.i($$6);
                $$8.a($$6, 16);
                return true;
            }
        }
        return false;
    }

    private void a(aif $$0, byh $$1, int $$2) {
        gu $$3 = this.a((cmp)$$0, $$1.di(), $$2);
        if ($$3 == null) {
            return;
        }
        bts $$4 = bfn.ba.a($$0, $$3, bgd.h);
        if ($$4 == null) {
            return;
        }
        $$4.b($$1, true);
    }

    @Nullable
    private gu a(cmp $$0, gu $$1, int $$2) {
        gu $$3 = null;
        for (int $$4 = 0; $$4 < 10; ++$$4) {
            int $$6;
            int $$7;
            int $$5 = $$1.u() + this.h.a($$2 * 2) - $$2;
            gu $$8 = new gu($$5, $$7 = $$0.a(dhk.a.b, $$5, $$6 = $$1.w() + this.h.a($$2 * 2) - $$2), $$6);
            if (!cmx.a(bgu.c.a, $$0, $$8, bfn.bh)) continue;
            $$3 = $$8;
            break;
        }
        return $$3;
    }

    private boolean a(cls $$0, gu $$1) {
        for (gu $$2 : gu.a($$1, $$1.b(1, 2, 1))) {
            if ($$0.a_($$2).k($$0, $$2).b()) continue;
            return false;
        }
        return true;
    }
}

