/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.UUID;
import javax.annotation.Nullable;

public class btm
extends btk
implements bgy<btt> {
    private static final UUID bT = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
    private static final aby<Integer> bU = acb.a(btm.class, aca.b);

    public btm(bfn<? extends btm> $$0, cmm $$1) {
        super((bfn<? extends btk>)$$0, $$1);
    }

    @Override
    protected void a(apf $$0) {
        this.a(bhg.a).a(btm.a($$0::a));
        this.a(bhg.d).a(btm.b($$0::j));
        this.a(bhg.m).a(btm.a($$0::j));
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(bU, 0);
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("Variant", this.gg());
        if (!this.co.a(1).b()) {
            $$0.a("ArmorItem", this.co.a(1).b(new qr()));
        }
    }

    public cfz q() {
        return this.c(bfo.e);
    }

    private void n(cfz $$0) {
        this.a(bfo.e, $$0);
        this.a(bfo.e, 0.0f);
    }

    @Override
    public void a(qr $$0) {
        cfz $$1;
        super.a($$0);
        this.w($$0.h("Variant"));
        if ($$0.b("ArmorItem", 10) && !($$1 = cfz.a($$0.p("ArmorItem"))).b() && this.l($$1)) {
            this.co.a(1, $$1);
        }
        this.gv();
    }

    private void w(int $$0) {
        this.am.b(bU, $$0);
    }

    private int gg() {
        return this.am.b(bU);
    }

    private void a(btt $$0, bto $$1) {
        this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
    }

    public btt r() {
        return btt.a(this.gg() & 0xFF);
    }

    @Override
    public void a(btt $$0) {
        this.w($$0.a() & 0xFF | this.gg() & 0xFFFFFF00);
    }

    public bto fY() {
        return bto.a((this.gg() & 0xFF00) >> 8);
    }

    @Override
    protected void gv() {
        if (this.dI().B) {
            return;
        }
        super.gv();
        this.o(this.co.a(1));
        this.a(bfo.e, 0.0f);
    }

    private void o(cfz $$0) {
        this.n($$0);
        if (!this.dI().B) {
            int $$1;
            this.a(bhg.i).b(bT);
            if (this.l($$0) && ($$1 = ((cfp)$$0.d()).i()) != 0) {
                this.a(bhg.i).b(new bhe(bT, "Horse armor bonus", (double)$$1, bhe.a.a));
            }
        }
    }

    @Override
    public void a(bdq $$0) {
        cfz $$1 = this.q();
        super.a($$0);
        cfz $$2 = this.q();
        if (this.ag > 20 && this.l($$2) && $$1 != $$2) {
            this.a(amh.lg, 0.5f, 1.0f);
        }
    }

    @Override
    protected void a(cxa $$0) {
        super.a($$0);
        if (this.af.a(10) == 0) {
            this.a(amh.lh, $$0.a() * 0.6f, $$0.b());
        }
    }

    @Override
    protected amg s() {
        return amh.le;
    }

    @Override
    protected amg g_() {
        return amh.li;
    }

    @Override
    @Nullable
    protected amg gf() {
        return amh.lj;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.ll;
    }

    @Override
    protected amg gx() {
        return amh.lf;
    }

    @Override
    public bdx b(byo $$0, bdw $$1) {
        boolean $$2;
        boolean bl2 = $$2 = !this.h_() && this.gn() && $$0.fD();
        if (this.bN() || $$2) {
            return super.b($$0, $$1);
        }
        cfz $$3 = $$0.b($$1);
        if (!$$3.b()) {
            if (this.m($$3)) {
                return this.c($$0, $$3);
            }
            if (!this.gn()) {
                this.gE();
                return bdx.a(this.dI().B);
            }
        }
        return super.b($$0, $$1);
    }

    @Override
    public boolean a(brl $$0) {
        if ($$0 == this) {
            return false;
        }
        if ($$0 instanceof btl || $$0 instanceof btm) {
            return this.gG() && ((btk)$$0).gG();
        }
        return false;
    }

    @Override
    @Nullable
    public bfe a(aif $$0, bfe $$1) {
        if ($$1 instanceof btl) {
            btp $$2 = bfn.ap.a($$0);
            if ($$2 != null) {
                this.a($$1, $$2);
            }
            return $$2;
        }
        btm $$3 = (btm)$$1;
        btm $$4 = bfn.Y.a($$0);
        if ($$4 != null) {
            bto $$12;
            btt $$8;
            int $$5 = this.af.a(9);
            if ($$5 < 4) {
                btt $$6 = this.r();
            } else if ($$5 < 8) {
                btt $$7 = $$3.r();
            } else {
                $$8 = ac.a(btt.values(), this.af);
            }
            int $$9 = this.af.a(5);
            if ($$9 < 2) {
                bto $$10 = this.fY();
            } else if ($$9 < 4) {
                bto $$11 = $$3.fY();
            } else {
                $$12 = ac.a(bto.values(), this.af);
            }
            $$4.a($$8, $$12);
            this.a($$1, $$4);
        }
        return $$4;
    }

    @Override
    public boolean gH() {
        return true;
    }

    @Override
    public boolean l(cfz $$0) {
        return $$0.d() instanceof cfp;
    }

    @Override
    @Nullable
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        btt $$7;
        apf $$5 = $$0.y_();
        if ($$3 instanceof a) {
            btt $$6 = ((a)$$3).a;
        } else {
            $$7 = ac.a(btt.values(), $$5);
            $$3 = new a($$7);
        }
        this.a($$7, ac.a(bto.values(), $$5));
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public /* synthetic */ Object c() {
        return this.r();
    }

    public static class a
    extends bfe.a {
        public final btt a;

        public a(btt $$0) {
            super(true);
            this.a = $$0;
        }
    }
}

