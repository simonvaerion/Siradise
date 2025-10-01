/*
 * Decompiled with CFR 0.152.
 */
public class evi
extends eui {
    private static final int c = 24;

    public evi(euq $$0, enr $$1) {
        super($$0, $$1, sw.c("controls.title"));
    }

    @Override
    protected void b() {
        super.b();
        int $$02 = this.g / 2 - 155;
        int $$1 = $$02 + 160;
        int $$2 = this.h / 6 - 12;
        this.d(epi.a(sw.c("options.mouse_settings"), (epi $$0) -> this.f.a(new euf(this, this.b))).a($$02, $$2, 150, 20).a());
        this.d(epi.a(sw.c("controls.keybinds"), (epi $$0) -> this.f.a(new evk(this, this.b))).a($$1, $$2, 150, 20).a());
        this.d(this.b.X().a(this.b, $$02, $$2 += 24, 150));
        this.d(this.b.Y().a(this.b, $$1, $$2, 150));
        this.d(this.b.D().a(this.b, $$02, $$2 += 24, 150));
        this.d(this.b.E().a(this.b, $$1, $$2, 150));
        this.d(epi.a(sv.d, (epi $$0) -> this.f.a(this.a)).a(this.g / 2 - 100, $$2 += 24, 200, 20).a());
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(this.i, this.e, this.g / 2, 15, 0xFFFFFF);
        super.a($$0, $$1, $$2, $$3);
    }
}

