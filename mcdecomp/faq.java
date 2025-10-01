/*
 * Decompiled with CFR 0.152.
 */
public class faq<T extends bro>
extends fcd<T> {
    private float q;
    private float r;
    private float s;

    public faq(fee $$0) {
        super($$0);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3) {
        this.q = ((bro)$$0).D($$3);
        this.r = ((bro)$$0).E($$3);
        this.s = ((bro)$$0).F($$3);
        if (this.q <= 0.0f) {
            this.n.e = 0.0f;
            this.n.g = 0.0f;
            this.j.e = 0.0f;
            this.j.g = 0.0f;
            this.k.e = 0.0f;
            this.k.g = 0.0f;
            this.k.b = -1.2f;
            this.h.e = 0.0f;
            this.i.e = 0.0f;
            this.i.g = 0.0f;
            this.i.b = -1.1f;
            this.i.c = 18.0f;
        }
        super.a($$0, $$1, $$2, $$3);
        if (((bgv)$$0).w()) {
            this.o.e = 0.7853982f;
            this.o.c += -4.0f;
            this.o.d += 5.0f;
            this.n.c += -3.3f;
            this.n.d += 1.0f;
            this.l.c += 8.0f;
            this.l.d += -2.0f;
            this.m.c += 2.0f;
            this.m.d += -0.8f;
            this.l.e = 1.7278761f;
            this.m.e = 2.670354f;
            this.j.e = -0.15707964f;
            this.j.c = 16.1f;
            this.j.d = -7.0f;
            this.k.e = -0.15707964f;
            this.k.c = 16.1f;
            this.k.d = -7.0f;
            this.h.e = -1.5707964f;
            this.h.c = 21.0f;
            this.h.d = 1.0f;
            this.i.e = -1.5707964f;
            this.i.c = 21.0f;
            this.i.d = 1.0f;
            this.p = 3;
        }
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        if (this.q > 0.0f) {
            this.n.g = fcc.a(this.n.g, -1.2707963f, this.q);
            this.n.f = fcc.a(this.n.f, 1.2707963f, this.q);
            this.j.e = -1.2707963f;
            this.k.e = -0.47079635f;
            this.k.g = -0.2f;
            this.k.b = -0.2f;
            this.h.e = -0.4f;
            this.i.e = 0.5f;
            this.i.g = -0.5f;
            this.i.b = -0.3f;
            this.i.c = 20.0f;
            this.l.e = fcc.a(this.l.e, 0.8f, this.r);
            this.m.e = fcc.a(this.m.e, -0.4f, this.r);
        }
        if (this.s > 0.0f) {
            this.n.e = fcc.a(this.n.e, -0.58177644f, this.s);
        }
    }
}

