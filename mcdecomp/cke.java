/*
 * Decompiled with CFR 0.152.
 */
public class cke
extends ckg {
    protected cke(ckg.a $$0, bfo ... $$1) {
        super($$0, ckh.j, $$1);
    }

    @Override
    public int a(int $$0) {
        return 5 + ($$0 - 1) * 8;
    }

    @Override
    public int b(int $$0) {
        return super.a($$0) + 50;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public boolean a(cfz $$0) {
        if ($$0.i()) {
            return true;
        }
        return super.a($$0);
    }

    public static boolean a(cfz $$0, int $$1, apf $$2) {
        if ($$0.d() instanceof cdj && $$2.i() < 0.6f) {
            return false;
        }
        return $$2.a($$1 + 1) > 0;
    }
}

