/*
 * Decompiled with CFR 0.152.
 */
public class etp
extends euq {
    private epz a = epz.a;
    private final Runnable b;

    public etp(Runnable $$0) {
        super(sw.c("datapackFailure.title"));
        this.b = $$0;
    }

    @Override
    protected void b() {
        super.b();
        this.a = epz.a(this.i, (ta)this.m(), this.g - 50);
        this.d(epi.a(sw.c("datapackFailure.safeMode"), (epi $$0) -> this.b.run()).a(this.g / 2 - 155, this.h / 6 + 96, 150, 20).a());
        this.d(epi.a(sv.l, (epi $$0) -> this.f.a((euq)null)).a(this.g / 2 - 155 + 160, this.h / 6 + 96, 150, 20).a());
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        this.a.a($$0, this.g / 2, 70);
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public boolean av_() {
        return false;
    }
}

