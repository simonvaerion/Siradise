/*
 * Decompiled with CFR 0.152.
 */
public class bof
extends bmv {
    private final bgi a;

    public bof(bgi $$0) {
        this.a = $$0;
    }

    @Override
    public boolean a() {
        return this.a.ay() && !this.a.dI().b_(this.a.di()).a(anb.a);
    }

    @Override
    public void c() {
        hz $$0 = null;
        Iterable<gu> $$1 = gu.b(apa.a(this.a.dn() - 2.0), apa.a(this.a.dp() - 2.0), apa.a(this.a.dt() - 2.0), apa.a(this.a.dn() + 2.0), this.a.do(), apa.a(this.a.dt() + 2.0));
        for (gu $$2 : $$1) {
            if (!this.a.dI().b_($$2).a(anb.a)) continue;
            $$0 = $$2;
            break;
        }
        if ($$0 != null) {
            this.a.G().a($$0.u(), $$0.v(), $$0.w(), 1.0);
        }
    }
}

