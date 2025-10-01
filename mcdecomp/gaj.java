/*
 * Decompiled with CFR 0.152.
 */
public class gaj
extends gan {
    private final sw a;
    private epz b = epz.a;
    private final euq c;
    private int G;

    public gaj(euq $$0, sw $$1, sw $$2) {
        super($$1);
        this.c = $$0;
        this.a = $$2;
    }

    @Override
    public void b() {
        enn $$0 = enn.N();
        $$0.d(false);
        $$0.ab().a();
        this.b = epz.a(this.i, (ta)this.a, this.g - 50);
        this.G = this.b.a() * this.i.b;
        this.d(epi.a(sv.k, (epi $$1) -> $$0.a(this.c)).a(this.g / 2 - 100, this.h / 2 + this.G / 2 + this.i.b, 200, 20).a());
    }

    @Override
    public sw au_() {
        return sw.h().b(this.e).f(": ").b(this.a);
    }

    @Override
    public void aw_() {
        enn.N().a(this.c);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(this.i, this.e, this.g / 2, this.h / 2 - this.G / 2 - this.i.b * 2, 0xAAAAAA);
        this.b.a($$0, this.g / 2, this.h / 2 - this.G / 2);
        super.a($$0, $$1, $$2, $$3);
    }
}

