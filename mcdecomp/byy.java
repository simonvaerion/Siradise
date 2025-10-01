/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class byy
extends bfj
implements bgx {
    public static final int b = 20;
    public static final int c = 2;
    public static final int d = 14;
    private int e;
    private boolean f;
    private int g = 22;
    private boolean h;
    @Nullable
    private bfz i;
    @Nullable
    private UUID j;

    public byy(bfn<? extends byy> $$0, cmm $$1) {
        super($$0, $$1);
    }

    public byy(cmm $$0, double $$1, double $$2, double $$3, float $$4, int $$5, bfz $$6) {
        this((bfn<? extends byy>)bfn.H, $$0);
        this.e = $$5;
        this.a($$6);
        this.a_($$4 * 57.295776f);
        this.e($$1, $$2, $$3);
    }

    @Override
    protected void a_() {
    }

    public void a(@Nullable bfz $$0) {
        this.i = $$0;
        this.j = $$0 == null ? null : $$0.ct();
    }

    @Nullable
    public bfz j() {
        bfj $$0;
        if (this.i == null && this.j != null && this.dI() instanceof aif && ($$0 = ((aif)this.dI()).a(this.j)) instanceof bfz) {
            this.i = (bfz)$$0;
        }
        return this.i;
    }

    @Override
    protected void a(qr $$0) {
        this.e = $$0.h("Warmup");
        if ($$0.b("Owner")) {
            this.j = $$0.a("Owner");
        }
    }

    @Override
    protected void b(qr $$0) {
        $$0.a("Warmup", this.e);
        if (this.j != null) {
            $$0.a("Owner", this.j);
        }
    }

    @Override
    public void l() {
        super.l();
        if (this.dI().B) {
            if (this.h) {
                --this.g;
                if (this.g == 14) {
                    for (int $$0 = 0; $$0 < 12; ++$$0) {
                        double $$1 = this.dn() + (this.af.j() * 2.0 - 1.0) * (double)this.dd() * 0.5;
                        double $$2 = this.dp() + 0.05 + this.af.j();
                        double $$3 = this.dt() + (this.af.j() * 2.0 - 1.0) * (double)this.dd() * 0.5;
                        double $$4 = (this.af.j() * 2.0 - 1.0) * 0.3;
                        double $$5 = 0.3 + this.af.j() * 0.3;
                        double $$6 = (this.af.j() * 2.0 - 1.0) * 0.3;
                        this.dI().a(iv.g, $$1, $$2 + 1.0, $$3, $$4, $$5, $$6);
                    }
                }
            }
        } else if (--this.e < 0) {
            if (this.e == -8) {
                List<bfz> $$7 = this.dI().a(bfz.class, this.cE().c(0.2, 0.0, 0.2));
                for (bfz $$8 : $$7) {
                    this.c($$8);
                }
            }
            if (!this.f) {
                this.dI().a((bfj)this, (byte)4);
                this.f = true;
            }
            if (--this.g < 0) {
                this.ai();
            }
        }
    }

    private void c(bfz $$0) {
        bfz $$1 = this.j();
        if (!$$0.bs() || $$0.co() || $$0 == $$1) {
            return;
        }
        if ($$1 == null) {
            $$0.a(this.dJ().o(), 6.0f);
        } else {
            if ($$1.p($$0)) {
                return;
            }
            $$0.a(this.dJ().c(this, $$1), 6.0f);
        }
    }

    @Override
    public void b(byte $$0) {
        super.b($$0);
        if ($$0 == 4) {
            this.h = true;
            if (!this.aQ()) {
                this.dI().a(this.dn(), this.dp(), this.dt(), amh.hu, this.cY(), 1.0f, this.af.i() * 0.2f + 0.85f, false);
            }
        }
    }

    public float a(float $$0) {
        if (!this.h) {
            return 0.0f;
        }
        int $$1 = this.g - 2;
        if ($$1 <= 0) {
            return 1.0f;
        }
        return 1.0f - ((float)$$1 - $$0) / 20.0f;
    }

    @Override
    @Nullable
    public /* synthetic */ bfj v() {
        return this.j();
    }
}

