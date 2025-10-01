/*
 * Decompiled with CFR 0.152.
 */
public class ett
extends euq {
    private static final sw a = sw.c("gui.toMenu");
    private static final sw b = sw.c("gui.toTitle");
    private final euq c;
    private final sw k;
    private final sw l;
    private final esf m = new esf();

    public ett(euq $$0, sw $$1, sw $$2) {
        this($$0, $$1, $$2, a);
    }

    public ett(euq $$0, sw $$1, sw $$2, sw $$3) {
        super($$1);
        this.c = $$0;
        this.k = $$2;
        this.l = $$3;
    }

    @Override
    protected void b() {
        epi $$2;
        this.m.b().b().a(10);
        esf.b $$02 = this.m.d(1);
        $$02.a(new eqk(this.e, this.i));
        $$02.a(new eqa(this.k, this.i).i(this.g - 50).b(true));
        if (this.f.C()) {
            epi $$1 = epi.a(this.l, (epi $$0) -> this.f.a(this.c)).a();
        } else {
            $$2 = epi.a(b, (epi $$0) -> this.f.a(new euw())).a();
        }
        $$02.a($$2);
        this.m.c();
        this.m.a(this::d);
        this.aG_();
    }

    @Override
    protected void aG_() {
        ese.a(this.m, this.s());
    }

    @Override
    public sw au_() {
        return sv.a(new sw[]{this.e, this.k});
    }

    @Override
    public boolean av_() {
        return false;
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        super.a($$0, $$1, $$2, $$3);
    }
}

