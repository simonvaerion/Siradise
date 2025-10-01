/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public class fqj
extends fqe<bsa, fce<bsa>> {
    private static final Map<bsa.a, acq> a = ac.a(Maps.newEnumMap(bsa.a.class), $$0 -> {
        $$0.put(bsa.a.a, new acq("textures/entity/panda/panda.png"));
        $$0.put(bsa.a.b, new acq("textures/entity/panda/lazy_panda.png"));
        $$0.put(bsa.a.c, new acq("textures/entity/panda/worried_panda.png"));
        $$0.put(bsa.a.d, new acq("textures/entity/panda/playful_panda.png"));
        $$0.put(bsa.a.e, new acq("textures/entity/panda/brown_panda.png"));
        $$0.put(bsa.a.f, new acq("textures/entity/panda/weak_panda.png"));
        $$0.put(bsa.a.g, new acq("textures/entity/panda/aggressive_panda.png"));
    });

    public fqj(foy.a $$0) {
        super($$0, new fce($$0.a(fed.az)), 0.9f);
        this.a(new ftc(this, $$0.d()));
    }

    @Override
    public acq a(bsa $$0) {
        return a.getOrDefault($$0.gk(), a.get(bsa.a.a));
    }

    @Override
    protected void a(bsa $$0, eij $$1, float $$2, float $$3, float $$4) {
        float $$26;
        float $$24;
        super.a($$0, $$1, $$2, $$3, $$4);
        if ($$0.bU > 0) {
            float $$8;
            int $$5 = $$0.bU;
            int $$6 = $$5 + 1;
            float $$7 = 7.0f;
            float f2 = $$8 = $$0.h_() ? 0.3f : 0.8f;
            if ($$5 < 8) {
                float $$9 = (float)(90 * $$5) / 7.0f;
                float $$10 = (float)(90 * $$6) / 7.0f;
                float $$11 = this.a($$9, $$10, $$6, $$4, 8.0f);
                $$1.a(0.0f, ($$8 + 0.2f) * ($$11 / 90.0f), 0.0f);
                $$1.a(a.b.rotationDegrees(-$$11));
            } else if ($$5 < 16) {
                float $$12 = ((float)$$5 - 8.0f) / 7.0f;
                float $$13 = 90.0f + 90.0f * $$12;
                float $$14 = 90.0f + 90.0f * ((float)$$6 - 8.0f) / 7.0f;
                float $$15 = this.a($$13, $$14, $$6, $$4, 16.0f);
                $$1.a(0.0f, $$8 + 0.2f + ($$8 - 0.2f) * ($$15 - 90.0f) / 90.0f, 0.0f);
                $$1.a(a.b.rotationDegrees(-$$15));
            } else if ((float)$$5 < 24.0f) {
                float $$16 = ((float)$$5 - 16.0f) / 7.0f;
                float $$17 = 180.0f + 90.0f * $$16;
                float $$18 = 180.0f + 90.0f * ((float)$$6 - 16.0f) / 7.0f;
                float $$19 = this.a($$17, $$18, $$6, $$4, 24.0f);
                $$1.a(0.0f, $$8 + $$8 * (270.0f - $$19) / 90.0f, 0.0f);
                $$1.a(a.b.rotationDegrees(-$$19));
            } else if ($$5 < 32) {
                float $$20 = ((float)$$5 - 24.0f) / 7.0f;
                float $$21 = 270.0f + 90.0f * $$20;
                float $$22 = 270.0f + 90.0f * ((float)$$6 - 24.0f) / 7.0f;
                float $$23 = this.a($$21, $$22, $$6, $$4, 32.0f);
                $$1.a(0.0f, $$8 * ((360.0f - $$23) / 90.0f), 0.0f);
                $$1.a(a.b.rotationDegrees(-$$23));
            }
        }
        if (($$24 = $$0.D($$4)) > 0.0f) {
            $$1.a(0.0f, 0.8f * $$24, 0.0f);
            $$1.a(a.b.rotationDegrees(apa.i($$24, $$0.dA(), $$0.dA() + 90.0f)));
            $$1.a(0.0f, -1.0f * $$24, 0.0f);
            if ($$0.gq()) {
                float $$25 = (float)(Math.cos((double)$$0.ag * 1.25) * Math.PI * (double)0.05f);
                $$1.a(a.d.rotationDegrees($$25));
                if ($$0.h_()) {
                    $$1.a(0.0f, 0.8f, 0.55f);
                }
            }
        }
        if (($$26 = $$0.E($$4)) > 0.0f) {
            float $$27 = $$0.h_() ? 0.5f : 1.3f;
            $$1.a(0.0f, $$27 * $$26, 0.0f);
            $$1.a(a.b.rotationDegrees(apa.i($$26, $$0.dA(), $$0.dA() + 180.0f)));
        }
    }

    private float a(float $$0, float $$1, int $$2, float $$3, float $$4) {
        if ((float)$$2 < $$4) {
            return apa.i($$3, $$0, $$1);
        }
        return $$0;
    }
}

