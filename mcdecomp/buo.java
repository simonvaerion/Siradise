/*
 * Decompiled with CFR 0.152.
 */
public class buo
extends bue {
    private static final int b = 100;
    private static final int c = 10;
    private static final int d = 20;
    private static final int e = 150;
    private static final bqm f = bqm.a().a(150.0);
    private final bqm g = bqm.a().a(20.0).a($$1 -> Math.abs($$1.dp() - $$0.dp()) <= 10.0);
    private int h;

    public buo(bub $$0) {
        super($$0);
    }

    @Override
    public void c() {
        ++this.h;
        byo $$0 = this.a.dI().a(this.g, this.a, this.a.dn(), this.a.dp(), this.a.dt());
        if ($$0 != null) {
            if (this.h > 25) {
                this.a.fW().a(bur.h);
            } else {
                eei $$1 = new eei($$0.dn() - this.a.dn(), 0.0, $$0.dt() - this.a.dt()).d();
                eei $$2 = new eei(apa.a(this.a.dy() * ((float)Math.PI / 180)), 0.0, -apa.b(this.a.dy() * ((float)Math.PI / 180))).d();
                float $$3 = (float)$$2.b($$1);
                float $$4 = (float)(Math.acos($$3) * 57.2957763671875) + 0.5f;
                if ($$4 < 0.0f || $$4 > 10.0f) {
                    float $$8;
                    double $$5 = $$0.dn() - this.a.e.dn();
                    double $$6 = $$0.dt() - this.a.e.dt();
                    double $$7 = apa.a(apa.d(180.0 - apa.d($$5, $$6) * 57.2957763671875 - (double)this.a.dy()), -100.0, 100.0);
                    this.a.bW *= 0.8f;
                    float $$9 = $$8 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6) + 1.0f;
                    if ($$8 > 40.0f) {
                        $$8 = 40.0f;
                    }
                    this.a.bW += (float)$$7 * (0.7f / $$8 / $$9);
                    this.a.a_(this.a.dy() + this.a.bW);
                }
            }
        } else if (this.h >= 100) {
            $$0 = this.a.dI().a(f, this.a, this.a.dn(), this.a.dp(), this.a.dt());
            this.a.fW().a(bur.e);
            if ($$0 != null) {
                this.a.fW().a(bur.i);
                this.a.fW().b(bur.i).a(new eei($$0.dn(), $$0.dp(), $$0.dt()));
            }
        }
    }

    @Override
    public void d() {
        this.h = 0;
    }

    public bur<buo> i() {
        return bur.g;
    }
}

