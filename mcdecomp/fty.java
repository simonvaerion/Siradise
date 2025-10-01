/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

public class fty
extends fpz<fiv, fck<fiv>> {
    public fty(foy.a $$0, boolean $$1) {
        super($$0, new fck($$0.a($$1 ? fed.aQ : fed.aM), $$1), 0.5f);
        this.a(new fsw(this, new fbr($$0.a($$1 ? fed.aR : fed.aO)), new fbr($$0.a($$1 ? fed.aS : fed.aP)), $$0.g()));
        this.a(new ftf<fiv, fck<fiv>>(this, $$0.d()));
        this.a(new fse<fiv, fck<fiv>>($$0, this));
        this.a(new fsm(this));
        this.a(new fsg(this));
        this.a(new fsl<fiv, fck<fiv>>(this, $$0.f(), $$0.d()));
        this.a(new fsp<fiv, fck<fiv>>(this, $$0.f()));
        this.a(new ftd<fiv>(this, $$0.f()));
        this.a(new ftn<fiv>(this, $$0.f()));
        this.a(new fsf<fiv, fck<fiv>>(this));
    }

    @Override
    public void a(fiv $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        this.b($$0);
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public eei a(fiv $$0, float $$1) {
        if ($$0.bU()) {
            return new eei(0.0, -0.125, 0.0);
        }
        return super.a($$0, $$1);
    }

    private void b(fiv $$0) {
        fck $$1 = (fck)this.a();
        if ($$0.G_()) {
            $$1.d_(false);
            $$1.k.k = true;
            $$1.l.k = true;
        } else {
            $$1.d_(true);
            $$1.l.k = $$0.a(byp.g);
            $$1.z.k = $$0.a(byp.b);
            $$1.x.k = $$0.a(byp.e);
            $$1.y.k = $$0.a(byp.f);
            $$1.b.k = $$0.a(byp.c);
            $$1.w.k = $$0.a(byp.d);
            $$1.t = $$0.bU();
            fbs.a $$2 = fty.a($$0, bdw.a);
            fbs.a $$3 = fty.a($$0, bdw.b);
            if ($$2.a()) {
                fbs.a a2 = $$3 = $$0.eP().b() ? fbs.a.a : fbs.a.b;
            }
            if ($$0.fh() == bft.b) {
                $$1.s = $$2;
                $$1.r = $$3;
            } else {
                $$1.s = $$3;
                $$1.r = $$2;
            }
        }
    }

    private static fbs.a a(fiv $$0, bdw $$1) {
        cfz $$2 = $$0.b($$1);
        if ($$2.b()) {
            return fbs.a.a;
        }
        if ($$0.fj() == $$1 && $$0.fl() > 0) {
            chs $$3 = $$2.s();
            if ($$3 == chs.d) {
                return fbs.a.c;
            }
            if ($$3 == chs.e) {
                return fbs.a.d;
            }
            if ($$3 == chs.f) {
                return fbs.a.e;
            }
            if ($$3 == chs.g && $$1 == $$0.fj()) {
                return fbs.a.f;
            }
            if ($$3 == chs.h) {
                return fbs.a.h;
            }
            if ($$3 == chs.i) {
                return fbs.a.i;
            }
            if ($$3 == chs.j) {
                return fbs.a.j;
            }
        } else if (!$$0.aG && $$2.a(cgc.uZ) && ceh.d($$2)) {
            return fbs.a.g;
        }
        return fbs.a.b;
    }

    @Override
    public acq a(fiv $$0) {
        return $$0.d();
    }

    @Override
    protected void a(fiv $$0, eij $$1, float $$2) {
        float $$3 = 0.9375f;
        $$1.b(0.9375f, 0.9375f, 0.9375f);
    }

    @Override
    protected void a(fiv $$0, sw $$1, eij $$2, fjx $$3, int $$4) {
        efg $$6;
        efd $$7;
        double $$5 = this.c.b($$0);
        $$2.a();
        if ($$5 < 100.0 && ($$7 = ($$6 = $$0.gc()).a(2)) != null) {
            eff $$8 = $$6.c($$0.cv(), $$7);
            super.a($$0, sw.b(Integer.toString($$8.b())).b(sv.t).b($$7.d()), $$2, $$3, $$4);
            Objects.requireNonNull(this.b());
            $$2.a(0.0f, 9.0f * 1.15f * 0.025f, 0.0f);
        }
        super.a($$0, $$1, $$2, $$3, $$4);
        $$2.b();
    }

    public void a(eij $$0, fjx $$1, int $$2, fiv $$3) {
        this.a($$0, $$1, $$2, $$3, ((fck)this.f).n, ((fck)this.f).w);
    }

    public void b(eij $$0, fjx $$1, int $$2, fiv $$3) {
        this.a($$0, $$1, $$2, $$3, ((fck)this.f).o, ((fck)this.f).b);
    }

    private void a(eij $$0, fjx $$1, int $$2, fiv $$3, fee $$4, fee $$5) {
        fck $$6 = (fck)this.a();
        this.b($$3);
        $$6.c = 0.0f;
        $$6.t = false;
        $$6.u = 0.0f;
        $$6.a($$3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        $$4.e = 0.0f;
        $$4.a($$0, $$1.getBuffer(fkf.b($$3.d())), $$2, fum.d);
        $$5.e = 0.0f;
        $$5.a($$0, $$1.getBuffer(fkf.h($$3.d())), $$2, fum.d);
    }

    @Override
    protected void a(fiv $$0, eij $$1, float $$2, float $$3, float $$4) {
        float $$5 = $$0.a($$4);
        if ($$0.fr()) {
            super.a($$0, $$1, $$2, $$3, $$4);
            float $$6 = (float)$$0.fs() + $$4;
            float $$7 = apa.a($$6 * $$6 / 100.0f, 0.0f, 1.0f);
            if (!$$0.fe()) {
                $$1.a(a.b.rotationDegrees($$7 * (-90.0f - $$0.dA())));
            }
            eei $$8 = $$0.f($$4);
            eei $$9 = $$0.b($$4);
            double $$10 = $$9.i();
            double $$11 = $$8.i();
            if ($$10 > 0.0 && $$11 > 0.0) {
                double $$12 = ($$9.c * $$8.c + $$9.e * $$8.e) / Math.sqrt($$10 * $$11);
                double $$13 = $$9.c * $$8.e - $$9.e * $$8.c;
                $$1.a(a.d.rotation((float)(Math.signum($$13) * Math.acos($$12))));
            }
        } else if ($$5 > 0.0f) {
            super.a($$0, $$1, $$2, $$3, $$4);
            float $$14 = $$0.aV() ? -90.0f - $$0.dA() : -90.0f;
            float $$15 = apa.i($$5, 0.0f, $$14);
            $$1.a(a.b.rotationDegrees($$15));
            if ($$0.bX()) {
                $$1.a(0.0f, -1.0f, 0.3f);
            }
        } else {
            super.a($$0, $$1, $$2, $$3, $$4);
        }
    }
}

