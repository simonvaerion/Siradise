/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bgv
extends brl
implements bgh {
    protected static final aby<Byte> bT = acb.a(bgv.class, aca.a);
    protected static final aby<Optional<UUID>> bU = acb.a(bgv.class, aca.q);
    private boolean bW;

    protected bgv(bfn<? extends bgv> $$0, cmm $$1) {
        super((bfn<? extends brl>)$$0, $$1);
        this.r();
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(bT, (byte)0);
        this.am.a(bU, Optional.empty());
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        if (this.U_() != null) {
            $$0.a("Owner", this.U_());
        }
        $$0.a("Sitting", this.bW);
    }

    @Override
    public void a(qr $$0) {
        UUID $$3;
        super.a($$0);
        if ($$0.b("Owner")) {
            UUID $$1 = $$0.a("Owner");
        } else {
            String $$2 = $$0.l("Owner");
            $$3 = alj.a(this.cI(), $$2);
        }
        if ($$3 != null) {
            try {
                this.b($$3);
                this.x(true);
            }
            catch (Throwable $$4) {
                this.x(false);
            }
        }
        this.bW = $$0.q("Sitting");
        this.y(this.bW);
    }

    @Override
    public boolean a(byo $$0) {
        return !this.fO();
    }

    protected void w(boolean $$0) {
        iy $$1 = iv.M;
        if (!$$0) {
            $$1 = iv.Z;
        }
        for (int $$2 = 0; $$2 < 7; ++$$2) {
            double $$3 = this.af.k() * 0.02;
            double $$4 = this.af.k() * 0.02;
            double $$5 = this.af.k() * 0.02;
            this.dI().a($$1, this.d(1.0), this.dq() + 0.5, this.g(1.0), $$3, $$4, $$5);
        }
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 7) {
            this.w(true);
        } else if ($$0 == 6) {
            this.w(false);
        } else {
            super.b($$0);
        }
    }

    public boolean q() {
        return (this.am.b(bT) & 4) != 0;
    }

    public void x(boolean $$0) {
        byte $$1 = this.am.b(bT);
        if ($$0) {
            this.am.b(bT, (byte)($$1 | 4));
        } else {
            this.am.b(bT, (byte)($$1 & 0xFFFFFFFB));
        }
        this.r();
    }

    protected void r() {
    }

    public boolean w() {
        return (this.am.b(bT) & 1) != 0;
    }

    public void y(boolean $$0) {
        byte $$1 = this.am.b(bT);
        if ($$0) {
            this.am.b(bT, (byte)($$1 | 1));
        } else {
            this.am.b(bT, (byte)($$1 & 0xFFFFFFFE));
        }
    }

    @Override
    @Nullable
    public UUID U_() {
        return this.am.b(bU).orElse(null);
    }

    public void b(@Nullable UUID $$0) {
        this.am.b(bU, Optional.ofNullable($$0));
    }

    public void f(byo $$0) {
        this.x(true);
        this.b($$0.ct());
        if ($$0 instanceof aig) {
            ai.x.a((aig)$$0, this);
        }
    }

    @Override
    public boolean c(bfz $$0) {
        if (this.l($$0)) {
            return false;
        }
        return super.c($$0);
    }

    public boolean l(bfz $$0) {
        return $$0 == this.I_();
    }

    public boolean a(bfz $$0, bfz $$1) {
        return true;
    }

    @Override
    public efi cd() {
        bfz $$0;
        if (this.q() && ($$0 = this.I_()) != null) {
            return $$0.cd();
        }
        return super.cd();
    }

    @Override
    public boolean p(bfj $$0) {
        if (this.q()) {
            bfz $$1 = this.I_();
            if ($$0 == $$1) {
                return true;
            }
            if ($$1 != null) {
                return $$1.p($$0);
            }
        }
        return super.p($$0);
    }

    @Override
    public void a(ben $$0) {
        if (!this.dI().B && this.dI().X().b(cmi.m) && this.I_() instanceof aig) {
            this.I_().a(this.eG().a());
        }
        super.a($$0);
    }

    public boolean fY() {
        return this.bW;
    }

    public void z(boolean $$0) {
        this.bW = $$0;
    }

    @Override
    public /* synthetic */ cmd e() {
        return super.dI();
    }
}

