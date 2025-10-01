/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwr
extends bvk {
    private static final String b = "Johnny";
    static final Predicate<bdu> e = $$0 -> $$0 == bdu.c || $$0 == bdu.d;
    boolean bT;

    public bwr(bfn<? extends bwr> $$0, cmm $$1) {
        super((bfn<? extends bvk>)$$0, $$1);
    }

    @Override
    protected void x() {
        super.x();
        this.bO.a(0, new bmp(this));
        this.bO.a(1, new a(this));
        this.bO.a(2, new bvk.b(this));
        this.bO.a(3, new bzw.a(this, this, 10.0f));
        this.bO.a(4, new c(this));
        this.bP.a(1, new bon(this, bzw.class).a(new Class[0]));
        this.bP.a(2, new boo<byo>((bgb)this, byo.class, true));
        this.bP.a(3, new boo<bxw>((bgb)this, bxw.class, true));
        this.bP.a(3, new boo<brx>((bgb)this, brx.class, true));
        this.bP.a(4, new b(this));
        this.bO.a(8, new bns(this, 0.6));
        this.bO.a(9, new bnd(this, byo.class, 3.0f, 1.0f));
        this.bO.a(10, new bnd(this, bgb.class, 8.0f));
    }

    @Override
    protected void W() {
        if (!this.fQ() && bqr.a(this)) {
            boolean $$0 = ((aif)this.dI()).d(this.di());
            ((bpi)this.J()).b($$0);
        }
        super.W();
    }

    public static bhf.a r() {
        return bwc.ge().a(bhg.d, 0.35f).a(bhg.b, 12.0).a(bhg.a, 24.0).a(bhg.f, 5.0);
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        if (this.bT) {
            $$0.a(b, true);
        }
    }

    @Override
    public bvk.a q() {
        if (this.fS()) {
            return bvk.a.b;
        }
        if (this.gp()) {
            return bvk.a.g;
        }
        return bvk.a.a;
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        if ($$0.b(b, 99)) {
            this.bT = $$0.q(b);
        }
    }

    @Override
    public amg Y_() {
        return amh.yW;
    }

    @Override
    @Nullable
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        bgt $$5 = super.a($$0, $$1, $$2, $$3, $$4);
        ((bpi)this.J()).b(true);
        apf $$6 = $$0.y_();
        this.a($$6, $$1);
        this.b($$6, $$1);
        return $$5;
    }

    @Override
    protected void a(apf $$0, bdv $$1) {
        if (this.gm() == null) {
            this.a(bfo.a, new cfz(cgc.op));
        }
    }

    @Override
    public boolean p(bfj $$0) {
        if (super.p($$0)) {
            return true;
        }
        if ($$0 instanceof bfz && ((bfz)$$0).eN() == bge.d) {
            return this.cd() == null && $$0.cd() == null;
        }
        return false;
    }

    @Override
    public void b(@Nullable sw $$0) {
        super.b($$0);
        if (!this.bT && $$0 != null && $$0.getString().equals(b)) {
            this.bT = true;
        }
    }

    @Override
    protected amg s() {
        return amh.yV;
    }

    @Override
    protected amg g_() {
        return amh.yX;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.yY;
    }

    @Override
    public void a(int $$0, boolean $$1) {
        boolean $$5;
        cfz $$2 = new cfz(cgc.op);
        bzv $$3 = this.gm();
        int $$4 = 1;
        if ($$0 > $$3.a(bdu.c)) {
            $$4 = 2;
        }
        boolean bl2 = $$5 = this.af.i() <= $$3.w();
        if ($$5) {
            HashMap $$6 = Maps.newHashMap();
            $$6.put(ckk.n, $$4);
            cki.a($$6, $$2);
        }
        this.a(bfo.a, $$2);
    }

    static class a
    extends bmf {
        public a(bgb $$0) {
            super($$0, 6, e);
            this.a(EnumSet.of(bmv.a.a));
        }

        @Override
        public boolean b() {
            bwr $$0 = (bwr)this.d;
            return $$0.gn() && super.b();
        }

        @Override
        public boolean a() {
            bwr $$0 = (bwr)this.d;
            return $$0.gn() && $$0.af.a(a.b(10)) == 0 && super.a();
        }

        @Override
        public void c() {
            super.c();
            this.d.o(0);
        }
    }

    class c
    extends bnf {
        public c(bwr $$0) {
            super($$0, 1.0, false);
        }

        @Override
        protected double a(bfz $$0) {
            if (this.a.cW() instanceof bwh) {
                float $$1 = this.a.cW().dd() - 0.1f;
                return $$1 * 2.0f * ($$1 * 2.0f) + $$0.dd();
            }
            return super.a($$0);
        }
    }

    static class b
    extends boo<bfz> {
        public b(bwr $$0) {
            super($$0, bfz.class, 0, true, true, bfz::fu);
        }

        @Override
        public boolean a() {
            return ((bwr)this.e).bT && super.a();
        }

        @Override
        public void c() {
            super.c();
            this.e.o(0);
        }
    }
}

