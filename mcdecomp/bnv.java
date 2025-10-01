/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class bnv<T extends bwc>
extends bmv {
    private final T a;
    private final double b;
    private int c;
    private final float d;
    private int e = -1;
    private int f;
    private boolean g;
    private boolean h;
    private int i = -1;

    public bnv(T $$0, double $$1, int $$2, float $$3) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3 * $$3;
        this.a(EnumSet.of(bmv.a.a, bmv.a.b));
    }

    public void c(int $$0) {
        this.c = $$0;
    }

    @Override
    public boolean a() {
        if (((bgb)this.a).j() == null) {
            return false;
        }
        return this.h();
    }

    protected boolean h() {
        return ((bfz)this.a).b(cgc.nG);
    }

    @Override
    public boolean b() {
        return (this.a() || !((bgb)this.a).J().l()) && this.h();
    }

    @Override
    public void c() {
        super.c();
        ((bgb)this.a).v(true);
    }

    @Override
    public void d() {
        super.d();
        ((bgb)this.a).v(false);
        this.f = 0;
        this.e = -1;
        ((bfz)this.a).fo();
    }

    @Override
    public boolean K_() {
        return true;
    }

    @Override
    public void e() {
        boolean $$3;
        bfz $$0 = ((bgb)this.a).j();
        if ($$0 == null) {
            return;
        }
        double $$1 = ((bfj)this.a).i($$0.dn(), $$0.dp(), $$0.dt());
        boolean $$2 = ((bgb)this.a).K().a($$0);
        boolean bl2 = $$3 = this.f > 0;
        if ($$2 != $$3) {
            this.f = 0;
        }
        this.f = $$2 ? ++this.f : --this.f;
        if ($$1 > (double)this.d || this.f < 20) {
            ((bgb)this.a).J().a((bfj)$$0, this.b);
            this.i = -1;
        } else {
            ((bgb)this.a).J().n();
            ++this.i;
        }
        if (this.i >= 20) {
            if ((double)((bfz)this.a).ec().i() < 0.3) {
                boolean bl3 = this.g = !this.g;
            }
            if ((double)((bfz)this.a).ec().i() < 0.3) {
                this.h = !this.h;
            }
            this.i = 0;
        }
        if (this.i > -1) {
            if ($$1 > (double)(this.d * 0.75f)) {
                this.h = false;
            } else if ($$1 < (double)(this.d * 0.25f)) {
                this.h = true;
            }
            ((bgb)this.a).G().a(this.h ? -0.5f : 0.5f, this.g ? 0.5f : -0.5f);
            bfj bfj2 = ((bfj)this.a).cX();
            if (bfj2 instanceof bgb) {
                bgb $$4 = (bgb)bfj2;
                $$4.a((bfj)$$0, 30.0f, 30.0f);
            }
            ((bgb)this.a).a((bfj)$$0, 30.0f, 30.0f);
        } else {
            ((bgb)this.a).E().a($$0, 30.0f, 30.0f);
        }
        if (((bfz)this.a).fi()) {
            int $$5;
            if (!$$2 && this.f < -60) {
                ((bfz)this.a).fo();
            } else if ($$2 && ($$5 = ((bfz)this.a).fm()) >= 20) {
                ((bfz)this.a).fo();
                ((bwg)this.a).a($$0, cdx.a($$5));
                this.e = this.c;
            }
        } else if (--this.e <= 0 && this.f >= -60) {
            ((bfz)this.a).c(bzh.a(this.a, cgc.nG));
        }
    }
}

