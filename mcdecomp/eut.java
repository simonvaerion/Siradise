/*
 * Decompiled with CFR 0.152.
 */
public class eut
extends eui {
    public eut(euq $$0, enr $$1) {
        super($$0, $$1, sw.c("options.skinCustomisation.title"));
    }

    @Override
    protected void b() {
        int $$02 = 0;
        for (byp $$12 : byp.values()) {
            this.d(epp.b(this.b.a($$12)).a(this.g / 2 - 155 + $$02 % 2 * 160, this.h / 6 + 24 * ($$02 >> 1), 150, 20, $$12.d(), ($$1, $$2) -> this.b.a($$12, (boolean)$$2)));
            ++$$02;
        }
        this.d(this.b.r().a(this.b, this.g / 2 - 155 + $$02 % 2 * 160, this.h / 6 + 24 * ($$02 >> 1), 150));
        if (++$$02 % 2 == 1) {
            ++$$02;
        }
        this.d(epi.a(sv.d, (epi $$0) -> this.f.a(this.a)).a(this.g / 2 - 100, this.h / 6 + 24 * ($$02 >> 1), 200, 20).a());
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(this.i, this.e, this.g / 2, 20, 0xFFFFFF);
        super.a($$0, $$1, $$2, $$3);
    }
}

