/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class bvh
extends bfj
implements bgx {
    private static final aby<cfz> c = acb.a(bvh.class, aca.h);
    private static final int d = 6000;
    private static final int e = Short.MAX_VALUE;
    private static final int f = Short.MIN_VALUE;
    private int g;
    private int h;
    private int i = 5;
    @Nullable
    private UUID j;
    @Nullable
    private UUID k;
    public final float b;

    public bvh(bfn<? extends bvh> $$0, cmm $$1) {
        super($$0, $$1);
        this.b = this.af.i() * (float)Math.PI * 2.0f;
        this.a_(this.af.i() * 360.0f);
    }

    public bvh(cmm $$0, double $$1, double $$2, double $$3, cfz $$4) {
        this($$0, $$1, $$2, $$3, $$4, $$0.z.j() * 0.2 - 0.1, 0.2, $$0.z.j() * 0.2 - 0.1);
    }

    public bvh(cmm $$0, double $$1, double $$2, double $$3, cfz $$4, double $$5, double $$6, double $$7) {
        this((bfn<? extends bvh>)bfn.ad, $$0);
        this.e($$1, $$2, $$3);
        this.o($$5, $$6, $$7);
        this.a($$4);
    }

    private bvh(bvh $$0) {
        super($$0.ae(), $$0.dI());
        this.a($$0.j().p());
        this.s($$0);
        this.g = $$0.g;
        this.b = $$0.b;
    }

    @Override
    public boolean aT() {
        return this.j().a(ane.aB);
    }

    @Override
    @Nullable
    public bfj v() {
        cmm cmm2;
        if (this.j != null && (cmm2 = this.dI()) instanceof aif) {
            aif $$0 = (aif)cmm2;
            return $$0.a(this.j);
        }
        return null;
    }

    @Override
    protected bfj.b aS() {
        return bfj.b.a;
    }

    @Override
    protected void a_() {
        this.aj().a(c, cfz.b);
    }

    @Override
    public void l() {
        double $$6;
        int $$5;
        if (this.j().b()) {
            this.ai();
            return;
        }
        super.l();
        if (this.h > 0 && this.h != Short.MAX_VALUE) {
            --this.h;
        }
        this.J = this.dn();
        this.K = this.dp();
        this.L = this.dt();
        eei $$0 = this.dl();
        float $$1 = this.cF() - 0.11111111f;
        if (this.aV() && this.b(anb.a) > (double)$$1) {
            this.y();
        } else if (this.bi() && this.b(anb.b) > (double)$$1) {
            this.z();
        } else if (!this.aR()) {
            this.f(this.dl().b(0.0, -0.04, 0.0));
        }
        if (this.dI().B) {
            this.ae = false;
        } else {
            boolean bl2 = this.ae = !this.dI().a((bfj)this, this.cE().h(1.0E-7));
            if (this.ae) {
                this.m(this.dn(), (this.cE().b + this.cE().e) / 2.0, this.dt());
            }
        }
        if (!this.ay() || this.dl().i() > (double)1.0E-5f || (this.ag + this.af()) % 4 == 0) {
            this.a(bgf.a, this.dl());
            float $$2 = 0.98f;
            if (this.ay()) {
                $$2 = this.dI().a_(this.aE()).b().h() * 0.98f;
            }
            this.f(this.dl().d($$2, 0.98, $$2));
            if (this.ay()) {
                eei $$3 = this.dl();
                if ($$3.d < 0.0) {
                    this.f($$3.d(1.0, -0.5, 1.0));
                }
            }
        }
        boolean $$4 = apa.a(this.J) != apa.a(this.dn()) || apa.a(this.K) != apa.a(this.dp()) || apa.a(this.L) != apa.a(this.dt());
        int n2 = $$5 = $$4 ? 2 : 40;
        if (this.ag % $$5 == 0 && !this.dI().B && this.C()) {
            this.A();
        }
        if (this.g != Short.MIN_VALUE) {
            ++this.g;
        }
        this.at |= this.bb();
        if (!this.dI().B && ($$6 = this.dl().d($$0).g()) > 0.01) {
            this.at = true;
        }
        if (!this.dI().B && this.g >= 6000) {
            this.ai();
        }
    }

    @Override
    protected gu aE() {
        return this.d(0.999999f);
    }

    private void y() {
        eei $$0 = this.dl();
        this.o($$0.c * (double)0.99f, $$0.d + (double)($$0.d < (double)0.06f ? 5.0E-4f : 0.0f), $$0.e * (double)0.99f);
    }

    private void z() {
        eei $$0 = this.dl();
        this.o($$0.c * (double)0.95f, $$0.d + (double)($$0.d < (double)0.06f ? 5.0E-4f : 0.0f), $$0.e * (double)0.95f);
    }

    private void A() {
        if (!this.C()) {
            return;
        }
        List<bvh> $$02 = this.dI().a(bvh.class, this.cE().c(0.5, 0.0, 0.5), (? super T $$0) -> $$0 != this && $$0.C());
        for (bvh $$1 : $$02) {
            if (!$$1.C()) continue;
            this.a($$1);
            if (!this.dD()) continue;
            break;
        }
    }

    private boolean C() {
        cfz $$0 = this.j();
        return this.bs() && this.h != Short.MAX_VALUE && this.g != Short.MIN_VALUE && this.g < 6000 && $$0.L() < $$0.g();
    }

    private void a(bvh $$0) {
        cfz $$1 = this.j();
        cfz $$2 = $$0.j();
        if (!Objects.equals(this.k, $$0.k) || !bvh.a($$1, $$2)) {
            return;
        }
        if ($$2.L() < $$1.L()) {
            bvh.a(this, $$1, $$0, $$2);
        } else {
            bvh.a($$0, $$2, this, $$1);
        }
    }

    public static boolean a(cfz $$0, cfz $$1) {
        if (!$$1.a($$0.d())) {
            return false;
        }
        if ($$1.L() + $$0.L() > $$1.g()) {
            return false;
        }
        if ($$1.u() ^ $$0.u()) {
            return false;
        }
        return !$$1.u() || $$1.v().equals($$0.v());
    }

    public static cfz a(cfz $$0, cfz $$1, int $$2) {
        int $$3 = Math.min(Math.min($$0.g(), $$2) - $$0.L(), $$1.L());
        cfz $$4 = $$0.c($$0.L() + $$3);
        $$1.h($$3);
        return $$4;
    }

    private static void a(bvh $$0, cfz $$1, cfz $$2) {
        cfz $$3 = bvh.a($$1, $$2, 64);
        $$0.a($$3);
    }

    private static void a(bvh $$0, cfz $$1, bvh $$2, cfz $$3) {
        bvh.a($$0, $$1, $$3);
        $$0.h = Math.max($$0.h, $$2.h);
        $$0.g = Math.min($$0.g, $$2.g);
        if ($$3.b()) {
            $$2.ai();
        }
    }

    @Override
    public boolean aU() {
        return this.j().d().w() || super.aU();
    }

    @Override
    public boolean a(ben $$0, float $$1) {
        if (this.b($$0)) {
            return false;
        }
        if (!this.j().b() && this.j().a(cgc.ty) && $$0.a(amy.l)) {
            return false;
        }
        if (!this.j().d().a($$0)) {
            return false;
        }
        if (this.dI().B) {
            return true;
        }
        this.bl();
        this.i = (int)((float)this.i - $$1);
        this.a(dgl.o, $$0.d());
        if (this.i <= 0) {
            this.j().a(this);
            this.ai();
        }
        return true;
    }

    @Override
    public void b(qr $$0) {
        $$0.a("Health", (short)this.i);
        $$0.a("Age", (short)this.g);
        $$0.a("PickupDelay", (short)this.h);
        if (this.j != null) {
            $$0.a("Thrower", this.j);
        }
        if (this.k != null) {
            $$0.a("Owner", this.k);
        }
        if (!this.j().b()) {
            $$0.a("Item", this.j().b(new qr()));
        }
    }

    @Override
    public void a(qr $$0) {
        this.i = $$0.g("Health");
        this.g = $$0.g("Age");
        if ($$0.e("PickupDelay")) {
            this.h = $$0.g("PickupDelay");
        }
        if ($$0.b("Owner")) {
            this.k = $$0.a("Owner");
        }
        if ($$0.b("Thrower")) {
            this.j = $$0.a("Thrower");
        }
        qr $$1 = $$0.p("Item");
        this.a(cfz.a($$1));
        if (this.j().b()) {
            this.ai();
        }
    }

    @Override
    public void b_(byo $$0) {
        if (this.dI().B) {
            return;
        }
        cfz $$1 = this.j();
        cfu $$2 = $$1.d();
        int $$3 = $$1.L();
        if (this.h == 0 && (this.k == null || this.k.equals($$0.ct())) && $$0.fN().e($$1)) {
            $$0.a((bfj)this, $$3);
            if ($$1.b()) {
                this.ai();
                $$1.f($$3);
            }
            $$0.a(amr.e.b($$2), $$3);
            $$0.a(this);
        }
    }

    @Override
    public sw Z() {
        sw $$0 = this.ab();
        if ($$0 != null) {
            return $$0;
        }
        return sw.c(this.j().q());
    }

    @Override
    public boolean cn() {
        return false;
    }

    @Override
    @Nullable
    public bfj b(aif $$0) {
        bfj $$1 = super.b($$0);
        if (!this.dI().B && $$1 instanceof bvh) {
            ((bvh)$$1).A();
        }
        return $$1;
    }

    public cfz j() {
        return this.aj().b(c);
    }

    public void a(cfz $$0) {
        this.aj().b(c, $$0);
    }

    @Override
    public void a(aby<?> $$0) {
        super.a($$0);
        if (c.equals($$0)) {
            this.j().a((bfj)this);
        }
    }

    public void b(@Nullable UUID $$0) {
        this.k = $$0;
    }

    public void c(@Nullable UUID $$0) {
        this.j = $$0;
    }

    public int k() {
        return this.g;
    }

    public void o() {
        this.h = 10;
    }

    public void p() {
        this.h = 0;
    }

    public void q() {
        this.h = Short.MAX_VALUE;
    }

    public void b(int $$0) {
        this.h = $$0;
    }

    public boolean r() {
        return this.h > 0;
    }

    public void s() {
        this.g = Short.MIN_VALUE;
    }

    public void t() {
        this.g = -6000;
    }

    public void w() {
        this.q();
        this.g = 5999;
    }

    public float a(float $$0) {
        return ((float)this.k() + $$0) / 20.0f + this.b;
    }

    public bvh x() {
        return new bvh(this);
    }

    @Override
    public ami cY() {
        return ami.i;
    }

    @Override
    public float dz() {
        return 180.0f - this.a(0.5f) / ((float)Math.PI * 2) * 360.0f;
    }
}

