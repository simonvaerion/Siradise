/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  javax.annotation.Nullable
 */
import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bzg
extends bfj
implements bgx {
    @Nullable
    private UUID b;
    @Nullable
    private bfj c;
    private boolean d;
    private boolean e;

    bzg(bfn<? extends bzg> $$0, cmm $$1) {
        super($$0, $$1);
    }

    public void b(@Nullable bfj $$0) {
        if ($$0 != null) {
            this.b = $$0.ct();
            this.c = $$0;
        }
    }

    @Override
    @Nullable
    public bfj v() {
        if (this.c != null && !this.c.dD()) {
            return this.c;
        }
        if (this.b != null && this.dI() instanceof aif) {
            this.c = ((aif)this.dI()).a(this.b);
            return this.c;
        }
        return null;
    }

    public bfj A() {
        return (bfj)MoreObjects.firstNonNull((Object)this.v(), (Object)this);
    }

    @Override
    protected void b(qr $$0) {
        if (this.b != null) {
            $$0.a("Owner", this.b);
        }
        if (this.d) {
            $$0.a("LeftOwner", true);
        }
        $$0.a("HasBeenShot", this.e);
    }

    protected boolean d(bfj $$0) {
        return $$0.ct().equals(this.b);
    }

    @Override
    protected void a(qr $$0) {
        if ($$0.b("Owner")) {
            this.b = $$0.a("Owner");
            this.c = null;
        }
        this.d = $$0.q("LeftOwner");
        this.e = $$0.q("HasBeenShot");
    }

    @Override
    public void l() {
        if (!this.e) {
            this.a(dgl.L, this.v());
            this.e = true;
        }
        if (!this.d) {
            this.d = this.k();
        }
        super.l();
    }

    private boolean k() {
        bfj $$02 = this.v();
        if ($$02 != null) {
            for (bfj $$1 : this.dI().a((bfj)this, this.cE().b(this.dl()).g(1.0), (? super bfj $$0) -> !$$0.G_() && $$0.bo())) {
                if ($$1.cT() != $$02.cT()) continue;
                return false;
            }
        }
        return true;
    }

    public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
        eei $$5 = new eei($$0, $$1, $$2).d().b(this.af.a(0.0, 0.0172275 * (double)$$4), this.af.a(0.0, 0.0172275 * (double)$$4), this.af.a(0.0, 0.0172275 * (double)$$4)).a((double)$$3);
        this.f($$5);
        double $$6 = $$5.h();
        this.a_((float)(apa.d($$5.c, $$5.e) * 57.2957763671875));
        this.b_((float)(apa.d($$5.d, $$6) * 57.2957763671875));
        this.M = this.dy();
        this.N = this.dA();
    }

    public void a(bfj $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        float $$6 = -apa.a($$2 * ((float)Math.PI / 180)) * apa.b($$1 * ((float)Math.PI / 180));
        float $$7 = -apa.a(($$1 + $$3) * ((float)Math.PI / 180));
        float $$8 = apa.b($$2 * ((float)Math.PI / 180)) * apa.b($$1 * ((float)Math.PI / 180));
        this.c($$6, $$7, $$8, $$4, $$5);
        eei $$9 = $$0.dl();
        this.f(this.dl().b($$9.c, $$0.ay() ? 0.0 : $$9.d, $$9.e));
    }

    protected void a(eeg $$0) {
        eeg.a $$1 = $$0.c();
        if ($$1 == eeg.a.c) {
            this.a((eef)$$0);
            this.dI().a(dgl.K, $$0.e(), dgl.a.a(this, null));
        } else if ($$1 == eeg.a.b) {
            eee $$2 = (eee)$$0;
            this.a($$2);
            gu $$3 = $$2.a();
            this.dI().a(dgl.K, $$3, dgl.a.a(this, this.dI().a_($$3)));
        }
    }

    protected void a(eef $$0) {
    }

    protected void a(eee $$0) {
        dcb $$1 = this.dI().a_($$0.a());
        $$1.a(this.dI(), $$1, $$0, this);
    }

    @Override
    public void l(double $$0, double $$1, double $$2) {
        this.o($$0, $$1, $$2);
        if (this.N == 0.0f && this.M == 0.0f) {
            double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            this.b_((float)(apa.d($$1, $$3) * 57.2957763671875));
            this.a_((float)(apa.d($$0, $$2) * 57.2957763671875));
            this.N = this.dA();
            this.M = this.dy();
            this.b(this.dn(), this.dp(), this.dt(), this.dy(), this.dA());
        }
    }

    protected boolean a(bfj $$0) {
        if (!$$0.bn()) {
            return false;
        }
        bfj $$1 = this.v();
        return $$1 == null || this.d || !$$1.v($$0);
    }

    protected void C() {
        eei $$0 = this.dl();
        double $$1 = $$0.h();
        this.b_(bzg.d(this.N, (float)(apa.d($$0.d, $$1) * 57.2957763671875)));
        this.a_(bzg.d(this.M, (float)(apa.d($$0.c, $$0.e) * 57.2957763671875)));
    }

    protected static float d(float $$0, float $$1) {
        while ($$1 - $$0 < -180.0f) {
            $$0 -= 360.0f;
        }
        while ($$1 - $$0 >= 180.0f) {
            $$0 += 360.0f;
        }
        return apa.i(0.2f, $$0, $$1);
    }

    @Override
    public uo<ur> S() {
        bfj $$0 = this.v();
        return new us(this, $$0 == null ? 0 : $$0.af());
    }

    @Override
    public void a(us $$0) {
        super.a($$0);
        bfj $$1 = this.dI().a($$0.n());
        if ($$1 != null) {
            this.b($$1);
        }
    }

    @Override
    public boolean a(cmm $$0, gu $$1) {
        bfj $$2 = this.v();
        if ($$2 instanceof byo) {
            return $$2.a($$0, $$1);
        }
        return $$2 == null || $$0.X().b(cmi.c);
    }
}

