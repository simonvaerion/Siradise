/*
 * Decompiled with CFR 0.152.
 */
public class blz
extends blx {
    private final int h;
    private static final int i = 10;
    private static final int j = 20;

    public blz(bgb $$0, int $$1) {
        super($$0);
        this.h = $$1;
    }

    @Override
    public void a() {
        if (this.d > 0) {
            --this.d;
            this.i().ifPresent($$0 -> {
                this.a.aX = this.a(this.a.aX, $$0.floatValue() + 20.0f, this.b);
            });
            this.h().ifPresent($$0 -> this.a.b_(this.a(this.a.dA(), $$0.floatValue() + 10.0f, this.c)));
        } else {
            if (this.a.J().l()) {
                this.a.b_(this.a(this.a.dA(), 0.0f, 5.0f));
            }
            this.a.aX = this.a(this.a.aX, this.a.aV, this.b);
        }
        float $$02 = apa.g(this.a.aX - this.a.aV);
        if ($$02 < (float)(-this.h)) {
            this.a.aV -= 4.0f;
        } else if ($$02 > (float)this.h) {
            this.a.aV += 4.0f;
        }
    }
}

