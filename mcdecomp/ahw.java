/*
 * Decompiled with CFR 0.152.
 */
public class ahw
extends aih {
    public static final int a = 5;
    public static final int b = 120500;
    private boolean e;
    private boolean f;
    private int g;
    private int h;

    public ahw(aig $$0) {
        super($$0);
    }

    @Override
    public void a() {
        super.a();
        ++this.h;
        long $$0 = this.c.V();
        long $$1 = $$0 / 24000L + 1L;
        if (!this.e && this.h > 20) {
            this.e = true;
            this.d.c.a(new vx(vx.f, 0.0f));
        }
        boolean bl2 = this.f = $$0 > 120500L;
        if (this.f) {
            ++this.g;
        }
        if ($$0 % 24000L == 500L) {
            if ($$1 <= 6L) {
                if ($$1 == 6L) {
                    this.d.c.a(new vx(vx.f, 104.0f));
                } else {
                    this.d.a(sw.c("demo.day." + $$1));
                }
            }
        } else if ($$1 == 1L) {
            if ($$0 == 100L) {
                this.d.c.a(new vx(vx.f, 101.0f));
            } else if ($$0 == 175L) {
                this.d.c.a(new vx(vx.f, 102.0f));
            } else if ($$0 == 250L) {
                this.d.c.a(new vx(vx.f, 103.0f));
            }
        } else if ($$1 == 5L && $$0 % 24000L == 22000L) {
            this.d.a(sw.c("demo.day.warning"));
        }
    }

    private void f() {
        if (this.g > 100) {
            this.d.a(sw.c("demo.reminder"));
            this.g = 0;
        }
    }

    @Override
    public void a(gu $$0, aad.a $$1, ha $$2, int $$3, int $$4) {
        if (this.f) {
            this.f();
            return;
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public bdx a(aig $$0, cmm $$1, cfz $$2, bdw $$3) {
        if (this.f) {
            this.f();
            return bdx.d;
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public bdx a(aig $$0, cmm $$1, cfz $$2, bdw $$3, eee $$4) {
        if (this.f) {
            this.f();
            return bdx.d;
        }
        return super.a($$0, $$1, $$2, $$3, $$4);
    }
}

