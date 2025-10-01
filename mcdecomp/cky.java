/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public class cky
extends ckg {
    private static final float a = 0.15f;

    public cky(ckg.a $$0, bfo ... $$1) {
        super($$0, ckh.d, $$1);
    }

    @Override
    public int a(int $$0) {
        return 10 + 20 * ($$0 - 1);
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
        if ($$0.d() instanceof cdj) {
            return true;
        }
        return super.a($$0);
    }

    @Override
    public void b(bfz $$0, bfj $$12, int $$2) {
        apf $$3 = $$0.ec();
        Map.Entry<bfo, cfz> $$4 = cki.b(ckk.h, $$0);
        if (cky.a($$2, $$3)) {
            if ($$12 != null) {
                $$12.a($$0.dJ().d($$0), (float)cky.b($$2, $$3));
            }
            if ($$4 != null) {
                $$4.getValue().a(2, $$0, $$1 -> $$1.d((bfo)((Object)((Object)$$4.getKey()))));
            }
        }
    }

    public static boolean a(int $$0, apf $$1) {
        if ($$0 <= 0) {
            return false;
        }
        return $$1.i() < 0.15f * (float)$$0;
    }

    public static int b(int $$0, apf $$1) {
        if ($$0 > 10) {
            return $$0 - 10;
        }
        return 1 + $$1.a(4);
    }
}

