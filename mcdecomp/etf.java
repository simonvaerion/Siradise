/*
 * Decompiled with CFR 0.152.
 */
public class etf
extends euq {
    private final euq c;
    protected final a a;
    private final sw k;
    private final boolean l;
    private epz m = epz.a;
    protected int b;
    private epk n;

    public etf(euq $$0, a $$1, sw $$2, sw $$3, boolean $$4) {
        super($$2);
        this.c = $$0;
        this.a = $$1;
        this.k = $$3;
        this.l = $$4;
    }

    @Override
    protected void b() {
        super.b();
        this.m = epz.a(this.i, (ta)this.k, this.g - 50);
        int $$02 = (this.m.a() + 1) * this.i.b;
        this.d(epi.a(sw.c("selectWorld.backupJoinConfirmButton"), (epi $$0) -> this.a.proceed(true, this.n.a())).a(this.g / 2 - 155, 100 + $$02, 150, 20).a());
        this.d(epi.a(sw.c("selectWorld.backupJoinSkipButton"), (epi $$0) -> this.a.proceed(false, this.n.a())).a(this.g / 2 - 155 + 160, 100 + $$02, 150, 20).a());
        this.d(epi.a(sv.e, (epi $$0) -> this.f.a(this.c)).a(this.g / 2 - 155 + 80, 124 + $$02, 150, 20).a());
        this.n = new epk(this.g / 2 - 155 + 80, 76 + $$02, 150, 20, sw.c("selectWorld.backupEraseCache"), false);
        if (this.l) {
            this.d(this.n);
        }
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(this.i, this.e, this.g / 2, 50, 0xFFFFFF);
        this.m.a($$0, this.g / 2, 70);
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public boolean av_() {
        return false;
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if ($$0 == 256) {
            this.f.a(this.c);
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    public static interface a {
        public void proceed(boolean var1, boolean var2);
    }
}

