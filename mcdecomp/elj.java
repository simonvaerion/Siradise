/*
 * Decompiled with CFR 0.152.
 */
public class elj
extends gan {
    private static final sw a = sw.c("mco.account.privacyinfo");
    private final euq b;
    private epz c = epz.a;

    public elj(euq $$0) {
        super(enf.a);
        this.b = $$0;
    }

    @Override
    public void b() {
        tj $$02 = sw.c("mco.account.update");
        sw $$1 = sv.k;
        int $$2 = Math.max(this.i.a($$02), this.i.a($$1)) + 30;
        tj $$3 = sw.c("mco.account.privacy.info");
        int $$4 = (int)((double)this.i.a($$3) * 1.2);
        this.d(epi.a($$3, (epi $$0) -> ac.i().a("https://aka.ms/MinecraftGDPR")).a(this.g / 2 - $$4 / 2, elj.h(11), $$4, 20).a());
        this.d(epi.a($$02, (epi $$0) -> ac.i().a("https://aka.ms/UpdateMojangAccount")).a(this.g / 2 - ($$2 + 5), elj.h(13), $$2, 20).a());
        this.d(epi.a($$1, (epi $$0) -> this.f.a(this.b)).a(this.g / 2 + 5, elj.h(13), $$2, 20).a());
        this.c = epz.a(this.i, (ta)a, (int)Math.round((double)this.g * 0.9));
    }

    @Override
    public sw au_() {
        return a;
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        this.c.a($$0, this.g / 2, 15, 15, 0xFFFFFF);
        super.a($$0, $$1, $$2, $$3);
    }
}

