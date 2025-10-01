/*
 * Decompiled with CFR 0.152.
 */
public class elq
extends gan {
    private static final int a = 212;
    private static final sw b = sw.c("mco.configure.world.name");
    private static final sw c = sw.c("mco.configure.world.description");
    private final ela G;
    private final ejq H;
    private epi I;
    private epr J;
    private epr K;

    public elq(ela $$0, ejq $$1) {
        super(sw.c("mco.configure.world.settings.title"));
        this.G = $$0;
        this.H = $$1;
    }

    @Override
    public void f() {
        this.K.a();
        this.J.a();
        this.I.r = !this.K.b().trim().isEmpty();
    }

    @Override
    public void b() {
        int $$03 = this.g / 2 - 106;
        this.I = this.d(epi.a(sw.c("mco.configure.world.buttons.done"), (epi $$0) -> this.e()).a($$03 - 2, elq.h(12), 106, 20).a());
        this.d(epi.a(sv.e, (epi $$0) -> this.f.a(this.G)).a(this.g / 2 + 2, elq.h(12), 106, 20).a());
        String $$1 = this.H.e == ejq.b.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
        epi $$2 = epi.a(sw.c($$1), (epi $$02) -> {
            if (this.H.e == ejq.b.b) {
                tj $$1 = sw.c("mco.configure.world.close.question.line1");
                tj $$2 = sw.c("mco.configure.world.close.question.line2");
                this.f.a(new elg($$0 -> {
                    if ($$0) {
                        this.G.a(this);
                    } else {
                        this.f.a(this);
                    }
                }, elg.a.b, $$1, $$2, true));
            } else {
                this.G.a(false, this);
            }
        }).a(this.g / 2 - 53, elq.h(0), 106, 20).a();
        this.d($$2);
        this.K = new epr(this.f.h, $$03, elq.h(4), 212, 20, null, sw.c("mco.configure.world.name"));
        this.K.m(32);
        this.K.a(this.H.b());
        this.e(this.K);
        this.b(this.K);
        this.J = new epr(this.f.h, $$03, elq.h(8), 212, 20, null, sw.c("mco.configure.world.description"));
        this.J.m(32);
        this.J.a(this.H.a());
        this.e(this.J);
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if ($$0 == 256) {
            this.f.a(this.G);
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(this.i, this.e, this.g / 2, 17, 0xFFFFFF);
        $$0.a(this.i, b, this.g / 2 - 106, elq.h(3), 0xA0A0A0, false);
        $$0.a(this.i, c, this.g / 2 - 106, elq.h(7), 0xA0A0A0, false);
        this.K.a($$0, $$1, $$2, $$3);
        this.J.a($$0, $$1, $$2, $$3);
        super.a($$0, $$1, $$2, $$3);
    }

    public void e() {
        this.G.a(this.K.b(), this.J.b());
    }
}

