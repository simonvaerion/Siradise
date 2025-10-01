/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bup
extends bud {
    private static final Logger b = LogUtils.getLogger();
    private static final int c = 5;
    private int d;
    @Nullable
    private dxt e;
    @Nullable
    private eei f;
    @Nullable
    private bfz g;
    private boolean h;

    public bup(bub $$0) {
        super($$0);
    }

    @Override
    public void c() {
        double $$6;
        if (this.g == null) {
            b.warn("Skipping player strafe phase because no player was found");
            this.a.fW().a(bur.a);
            return;
        }
        if (this.e != null && this.e.c()) {
            double $$0 = this.g.dn();
            double $$1 = this.g.dt();
            double $$2 = $$0 - this.a.dn();
            double $$3 = $$1 - this.a.dt();
            double $$4 = Math.sqrt($$2 * $$2 + $$3 * $$3);
            double $$5 = Math.min((double)0.4f + $$4 / 80.0 - 1.0, 10.0);
            this.f = new eei($$0, this.g.dp() + $$5, $$1);
        }
        double d2 = $$6 = this.f == null ? 0.0 : this.f.c(this.a.dn(), this.a.dp(), this.a.dt());
        if ($$6 < 100.0 || $$6 > 22500.0) {
            this.j();
        }
        double $$7 = 64.0;
        if (this.g.f((bfj)this.a) < 4096.0) {
            if (this.a.B(this.g)) {
                ++this.d;
                eei $$8 = new eei(this.g.dn() - this.a.dn(), 0.0, this.g.dt() - this.a.dt()).d();
                eei $$9 = new eei(apa.a(this.a.dy() * ((float)Math.PI / 180)), 0.0, -apa.b(this.a.dy() * ((float)Math.PI / 180))).d();
                float $$10 = (float)$$9.b($$8);
                float $$11 = (float)(Math.acos($$10) * 57.2957763671875);
                $$11 += 0.5f;
                if (this.d >= 5 && $$11 >= 0.0f && $$11 < 10.0f) {
                    double $$12 = 1.0;
                    eei $$13 = this.a.f(1.0f);
                    double $$14 = this.a.e.dn() - $$13.c * 1.0;
                    double $$15 = this.a.e.e(0.5) + 0.5;
                    double $$16 = this.a.e.dt() - $$13.e * 1.0;
                    double $$17 = this.g.dn() - $$14;
                    double $$18 = this.g.e(0.5) - $$15;
                    double $$19 = this.g.dt() - $$16;
                    if (!this.a.aQ()) {
                        this.a.dI().a(null, 1017, this.a.di(), 0);
                    }
                    byx $$20 = new byx(this.a.dI(), this.a, $$17, $$18, $$19);
                    $$20.b($$14, $$15, $$16, 0.0f, 0.0f);
                    this.a.dI().b($$20);
                    this.d = 0;
                    if (this.e != null) {
                        while (!this.e.c()) {
                            this.e.a();
                        }
                    }
                    this.a.fW().a(bur.a);
                }
            } else if (this.d > 0) {
                --this.d;
            }
        } else if (this.d > 0) {
            --this.d;
        }
    }

    private void j() {
        if (this.e == null || this.e.c()) {
            int $$0;
            int $$1 = $$0 = this.a.w();
            if (this.a.ec().a(8) == 0) {
                this.h = !this.h;
                $$1 += 6;
            }
            $$1 = this.h ? ++$$1 : --$$1;
            if (this.a.fX() == null || this.a.fX().e() <= 0) {
                $$1 -= 12;
                $$1 &= 7;
                $$1 += 12;
            } else if (($$1 %= 12) < 0) {
                $$1 += 12;
            }
            this.e = this.a.a($$0, $$1, (dxr)null);
            if (this.e != null) {
                this.e.a();
            }
        }
        this.k();
    }

    private void k() {
        if (this.e != null && !this.e.c()) {
            double $$3;
            gu $$0 = this.e.g();
            this.e.a();
            double $$1 = $$0.u();
            double $$2 = $$0.w();
            while (($$3 = (double)((float)$$0.v() + this.a.ec().i() * 20.0f)) < (double)$$0.v()) {
            }
            this.f = new eei($$1, $$3, $$2);
        }
    }

    @Override
    public void d() {
        this.d = 0;
        this.f = null;
        this.e = null;
        this.g = null;
    }

    public void a(bfz $$0) {
        this.g = $$0;
        int $$1 = this.a.w();
        int $$2 = this.a.r(this.g.dn(), this.g.dp(), this.g.dt());
        int $$3 = this.g.dm();
        int $$4 = this.g.ds();
        double $$5 = (double)$$3 - this.a.dn();
        double $$6 = (double)$$4 - this.a.dt();
        double $$7 = Math.sqrt($$5 * $$5 + $$6 * $$6);
        double $$8 = Math.min((double)0.4f + $$7 / 80.0 - 1.0, 10.0);
        int $$9 = apa.a(this.g.dp() + $$8);
        dxr $$10 = new dxr($$3, $$9, $$4);
        this.e = this.a.a($$1, $$2, $$10);
        if (this.e != null) {
            this.e.a();
            this.k();
        }
    }

    @Override
    @Nullable
    public eei g() {
        return this.f;
    }

    public bur<bup> i() {
        return bur.b;
    }
}

