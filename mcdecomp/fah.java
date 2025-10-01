/*
 * Decompiled with CFR 0.152.
 */
public class fah
extends fbs<bux> {
    public fah(fee $$0) {
        super($$0);
    }

    public static fek a(fei $$0) {
        fem $$1 = fbs.a($$0, 0.0f);
        fen $$2 = $$1.a();
        $$2.a("head", fej.c().a(0, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, $$0), feg.a(0.0f, 1.0f, 0.0f));
        $$2.a("hat", fej.c().a(32, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, $$0.a(0.5f)), feg.a(0.0f, 1.0f, 0.0f));
        $$2.a("right_leg", fej.c().a(0, 16).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0.a(-0.1f)), feg.a(-1.9f, 11.0f, 0.0f));
        $$2.a("left_leg", fej.c().a(0, 16).a().a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0.a(-0.1f)), feg.a(1.9f, 11.0f, 0.0f));
        return fek.a($$1, 64, 32);
    }

    @Override
    public void a(bux $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.k.e = (float)Math.PI / 180 * $$0.x().b();
        this.k.f = (float)Math.PI / 180 * $$0.x().c();
        this.k.g = (float)Math.PI / 180 * $$0.x().d();
        this.m.e = (float)Math.PI / 180 * $$0.y().b();
        this.m.f = (float)Math.PI / 180 * $$0.y().c();
        this.m.g = (float)Math.PI / 180 * $$0.y().d();
        this.o.e = (float)Math.PI / 180 * $$0.z().b();
        this.o.f = (float)Math.PI / 180 * $$0.z().c();
        this.o.g = (float)Math.PI / 180 * $$0.z().d();
        this.n.e = (float)Math.PI / 180 * $$0.A().b();
        this.n.f = (float)Math.PI / 180 * $$0.A().c();
        this.n.g = (float)Math.PI / 180 * $$0.A().d();
        this.q.e = (float)Math.PI / 180 * $$0.C().b();
        this.q.f = (float)Math.PI / 180 * $$0.C().c();
        this.q.g = (float)Math.PI / 180 * $$0.C().d();
        this.p.e = (float)Math.PI / 180 * $$0.D().b();
        this.p.f = (float)Math.PI / 180 * $$0.D().c();
        this.p.g = (float)Math.PI / 180 * $$0.D().d();
        this.l.a(this.k);
    }
}

