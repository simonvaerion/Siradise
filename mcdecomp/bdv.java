/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.concurrent.Immutable
 */
import javax.annotation.concurrent.Immutable;

@Immutable
public class bdv {
    private static final float a = -72000.0f;
    private static final float b = 1440000.0f;
    private static final float c = 3600000.0f;
    private final bdu d;
    private final float e;

    public bdv(bdu $$0, long $$1, long $$2, float $$3) {
        this.d = $$0;
        this.e = this.a($$0, $$1, $$2, $$3);
    }

    public bdu a() {
        return this.d;
    }

    public float b() {
        return this.e;
    }

    public boolean c() {
        return this.e >= (float)bdu.d.ordinal();
    }

    public boolean a(float $$0) {
        return this.e > $$0;
    }

    public float d() {
        if (this.e < 2.0f) {
            return 0.0f;
        }
        if (this.e > 4.0f) {
            return 1.0f;
        }
        return (this.e - 2.0f) / 2.0f;
    }

    private float a(bdu $$0, long $$1, long $$2, float $$3) {
        if ($$0 == bdu.a) {
            return 0.0f;
        }
        boolean $$4 = $$0 == bdu.d;
        float $$5 = 0.75f;
        float $$6 = apa.a(((float)$$1 + -72000.0f) / 1440000.0f, 0.0f, 1.0f) * 0.25f;
        $$5 += $$6;
        float $$7 = 0.0f;
        $$7 += apa.a((float)$$2 / 3600000.0f, 0.0f, 1.0f) * ($$4 ? 1.0f : 0.75f);
        $$7 += apa.a($$3 * 0.25f, 0.0f, $$6);
        if ($$0 == bdu.b) {
            $$7 *= 0.5f;
        }
        return (float)$$0.a() * ($$5 += $$7);
    }
}

