/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 */
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.joml.Vector3f;

public class eog {
    public static void a(fbo<?> $$0, eoe $$1, long $$2, float $$3, Vector3f $$4) {
        float $$5 = eog.a($$1, $$2);
        for (Map.Entry<String, List<eod>> $$6 : $$1.c().entrySet()) {
            Optional<fee> $$7 = $$0.a($$6.getKey());
            List<eod> $$8 = $$6.getValue();
            $$7.ifPresent($$42 -> $$8.forEach($$4 -> {
                float $$12;
                eof[] $$5 = $$4.b();
                int $$6 = Math.max(0, apa.a(0, $$5.length, $$2 -> $$5 <= $$5[$$2].a()) - 1);
                int $$7 = Math.min($$5.length - 1, $$6 + 1);
                eof $$8 = $$5[$$6];
                eof $$9 = $$5[$$7];
                float $$10 = $$5 - $$8.a();
                if ($$7 != $$6) {
                    float $$11 = apa.a($$10 / ($$9.a() - $$8.a()), 0.0f, 1.0f);
                } else {
                    $$12 = 0.0f;
                }
                $$9.c().apply($$4, $$12, $$5, $$6, $$7, $$3);
                $$4.a().apply((fee)$$42, $$4);
            }));
        }
    }

    private static float a(eoe $$0, long $$1) {
        float $$2 = (float)$$1 / 1000.0f;
        return $$0.b() ? $$2 % $$0.a() : $$2;
    }

    public static Vector3f a(float $$0, float $$1, float $$2) {
        return new Vector3f($$0, -$$1, $$2);
    }

    public static Vector3f b(float $$0, float $$1, float $$2) {
        return new Vector3f($$0 * ((float)Math.PI / 180), $$1 * ((float)Math.PI / 180), $$2 * ((float)Math.PI / 180));
    }

    public static Vector3f a(double $$0, double $$1, double $$2) {
        return new Vector3f((float)($$0 - 1.0), (float)($$1 - 1.0), (float)($$2 - 1.0));
    }
}

