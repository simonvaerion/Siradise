/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 */
import java.util.Map;
import org.joml.Vector3f;

public class fnh
implements fnd.a {
    private final enn a;
    private static final int b = 2;
    private static final float c = 0.09375f;

    public fnh(enn $$0) {
        this.a = $$0;
    }

    @Override
    public void a(eij $$0, fjx $$1, double $$2, double $$3, double $$4) {
        few $$5 = this.a.s;
        ein $$6 = $$1.getBuffer(fkf.z());
        gu $$7 = gu.a($$2, 0.0, $$4);
        for (int $$8 = -2; $$8 <= 2; ++$$8) {
            for (int $$9 = -2; $$9 <= 2; ++$$9) {
                ddx $$10 = $$5.x($$7.b($$8 * 16, 0, $$9 * 16));
                for (Map.Entry<dhk.a, dhk> $$11 : $$10.e()) {
                    dhk.a $$12 = $$11.getKey();
                    clt $$13 = $$10.f();
                    Vector3f $$14 = this.a($$12);
                    for (int $$15 = 0; $$15 < 16; ++$$15) {
                        for (int $$16 = 0; $$16 < 16; ++$$16) {
                            int $$17 = hx.a($$13.e, $$15);
                            int $$18 = hx.a($$13.f, $$16);
                            float $$19 = (float)((double)((float)$$5.a($$12, $$17, $$18) + (float)$$12.ordinal() * 0.09375f) - $$3);
                            fjv.b($$0, $$6, (double)((float)$$17 + 0.25f) - $$2, $$19, (double)((float)$$18 + 0.25f) - $$4, (double)((float)$$17 + 0.75f) - $$2, $$19 + 0.09375f, (double)((float)$$18 + 0.75f) - $$4, $$14.x(), $$14.y(), $$14.z(), 1.0f);
                        }
                    }
                }
            }
        }
    }

    private Vector3f a(dhk.a $$0) {
        return switch ($$0) {
            default -> throw new IncompatibleClassChangeError();
            case dhk.a.a -> new Vector3f(1.0f, 1.0f, 0.0f);
            case dhk.a.c -> new Vector3f(1.0f, 0.0f, 1.0f);
            case dhk.a.b -> new Vector3f(0.0f, 0.7f, 0.0f);
            case dhk.a.d -> new Vector3f(0.0f, 0.0f, 0.5f);
            case dhk.a.e -> new Vector3f(0.0f, 0.3f, 0.3f);
            case dhk.a.f -> new Vector3f(0.0f, 0.5f, 0.5f);
        };
    }
}

