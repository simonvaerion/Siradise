/*
 * Decompiled with CFR 0.152.
 */
public class ekz
extends gan {
    private static final sw a = sw.c("mco.client.incompatible.title");
    private static final sw[] b = new sw[]{sw.c("mco.client.incompatible.msg.line1"), sw.c("mco.client.incompatible.msg.line2"), sw.c("mco.client.incompatible.msg.line3")};
    private static final sw[] c = new sw[]{sw.c("mco.client.incompatible.msg.line1"), sw.c("mco.client.incompatible.msg.line2")};
    private final euq G;

    public ekz(euq $$0) {
        super(a);
        this.G = $$0;
    }

    @Override
    public void b() {
        this.d(epi.a(sv.k, (epi $$0) -> this.f.a(this.G)).a(this.g / 2 - 100, ekz.h(12), 200, 20).a());
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(this.i, this.e, this.g / 2, ekz.h(3), 0xFF0000);
        sw[] $$4 = this.B();
        for (int $$5 = 0; $$5 < $$4.length; ++$$5) {
            $$0.a(this.i, $$4[$$5], this.g / 2, ekz.h(5) + $$5 * 12, 0xFFFFFF);
        }
        super.a($$0, $$1, $$2, $$3);
    }

    private sw[] B() {
        if (aa.b().g()) {
            return c;
        }
        return b;
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if ($$0 == 257 || $$0 == 335 || $$0 == 256) {
            this.f.a(this.G);
            return true;
        }
        return super.a($$0, $$1, $$2);
    }
}

