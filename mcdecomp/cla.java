/*
 * Decompiled with CFR 0.152.
 */
public class cla
extends ckg {
    public cla(ckg.a $$0, bfo ... $$1) {
        super($$0, ckh.i, $$1);
    }

    @Override
    public int a(int $$0) {
        return 1 + ($$0 - 1) * 8;
    }

    @Override
    public int b(int $$0) {
        return this.a($$0) + 20;
    }

    @Override
    public int a() {
        return 5;
    }

    @Override
    public float a(int $$0, bge $$1) {
        if ($$1 == bge.e) {
            return (float)$$0 * 2.5f;
        }
        return 0.0f;
    }
}

