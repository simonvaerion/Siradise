/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 */
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class ets
extends euq {
    private static final sw a = sw.c("addServer.enterIp");
    private epi b;
    private final ffd c;
    private epr k;
    private final BooleanConsumer l;
    private final euq m;

    public ets(euq $$0, BooleanConsumer $$1, ffd $$2) {
        super(sw.c("selectServer.direct"));
        this.m = $$0;
        this.c = $$2;
        this.l = $$1;
    }

    @Override
    public void f() {
        this.k.a();
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if (this.b.r && this.t() == this.k && ($$0 == 257 || $$0 == 335)) {
            this.l();
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    protected void b() {
        this.k = new epr(this.i, this.g / 2 - 100, 116, 200, 20, sw.c("addServer.enterIp"));
        this.k.m(128);
        this.k.a(this.f.m.ad);
        this.k.b((String $$0) -> this.B());
        this.e(this.k);
        this.b = this.d(epi.a(sw.c("selectServer.select"), (epi $$0) -> this.l()).a(this.g / 2 - 100, this.h / 4 + 96 + 12, 200, 20).a());
        this.d(epi.a(sv.e, (epi $$0) -> this.l.accept(false)).a(this.g / 2 - 100, this.h / 4 + 120 + 12, 200, 20).a());
        this.c(this.k);
        this.B();
    }

    @Override
    public void a(enn $$0, int $$1, int $$2) {
        String $$3 = this.k.b();
        this.b($$0, $$1, $$2);
        this.k.a($$3);
    }

    private void l() {
        this.c.b = this.k.b();
        this.l.accept(true);
    }

    @Override
    public void aw_() {
        this.f.a(this.m);
    }

    @Override
    public void ax_() {
        this.f.m.ad = this.k.b();
        this.f.m.aq();
    }

    private void B() {
        this.b.r = fga.b(this.k.b());
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(this.i, this.e, this.g / 2, 20, 0xFFFFFF);
        $$0.b(this.i, a, this.g / 2 - 100, 100, 0xA0A0A0);
        this.k.a($$0, $$1, $$2, $$3);
        super.a($$0, $$1, $$2, $$3);
    }
}

