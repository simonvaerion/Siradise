/*
 * Decompiled with CFR 0.152.
 */
import java.nio.file.Path;

public class eyx
extends euq {
    private static final int a = 8;
    private static final sw b = sw.c("telemetry_info.screen.title");
    private static final sw c = sw.c("telemetry_info.screen.description").a(n.h);
    private static final sw k = sw.c("telemetry_info.button.give_feedback");
    private static final sw l = sw.c("telemetry_info.button.show_data");
    private final euq m;
    private final enr n;
    private eyw o;
    private double p;

    public eyx(euq $$0, enr $$1) {
        super(b);
        this.m = $$0;
        this.n = $$1;
    }

    @Override
    public sw au_() {
        return sv.a(new sw[]{super.au_(), c});
    }

    @Override
    protected void b() {
        ese $$02 = new ese();
        $$02.b().a(8);
        $$02.a(this.h);
        esf $$12 = $$02.a(new esf(), $$02.a().a(0.5f, 0.0f));
        $$12.b().b().e(8);
        esf.b $$2 = $$12.d(1);
        $$2.a(new eqk(this.m(), this.i));
        $$2.a(new eqa(c, this.i).i(this.g - 16).b(true));
        esf $$3 = this.a(epi.a(k, this::b).a(), epi.a(l, this::c).a());
        $$2.a($$3);
        esf $$4 = this.a(this.l(), epi.a(sv.d, this::a).a());
        $$02.a($$4, $$02.a().a(0.5f, 1.0f));
        $$02.c();
        this.o = new eyw(0, 0, this.g - 40, $$4.r() - ($$3.r() + $$3.h()) - 16, this.f.h);
        this.o.a(this.p);
        this.o.a((double $$0) -> {
            this.p = $$0;
        });
        this.c(this.o);
        $$2.a(this.o);
        $$02.c();
        ese.a($$02, 0, 0, this.g, this.h, 0.5f, 0.0f);
        $$02.a($$1 -> {
            epf cfr_ignored_0 = (epf)this.d($$1);
        });
    }

    private epf l() {
        epf $$02 = this.n.ad().a(this.n, 0, 0, 150, $$0 -> this.o.b((boolean)$$0));
        $$02.r = this.f.A();
        return $$02;
    }

    private void a(epi $$0) {
        this.f.a(this.m);
    }

    private void b(epi $$02) {
        this.f.a(new etj($$0 -> {
            if ($$0) {
                ac.i().a("https://aka.ms/javafeedback?ref=game");
            }
            this.f.a(this);
        }, "https://aka.ms/javafeedback?ref=game", true));
    }

    private void c(epi $$0) {
        Path $$1 = this.f.t().b();
        ac.i().a($$1.toUri());
    }

    @Override
    public void aw_() {
        this.f.a(this.m);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.b($$0);
        super.a($$0, $$1, $$2, $$3);
    }

    private esf a(epf $$0, epf $$1) {
        esf $$2 = new esf();
        $$2.b().b().f(4);
        $$2.a($$0, 0, 0);
        $$2.a($$1, 0, 1);
        return $$2;
    }
}

