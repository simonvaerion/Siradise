/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.joml.Matrix4f
 *  org.joml.Vector4f
 */
import java.time.Duration;
import java.time.Instant;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public class fnj
implements fnd.a {
    private static final Duration a = Duration.ofMillis(500L);
    private static final int b = 10;
    private static final Vector4f c = new Vector4f(1.0f, 1.0f, 0.0f, 0.25f);
    private static final Vector4f d = new Vector4f(0.25f, 0.125f, 0.0f, 0.125f);
    private final enn e;
    private final cmv f;
    private Instant g = Instant.now();
    @Nullable
    private a h;

    public fnj(enn $$0, cmv $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public void a(eij $$0, fjx $$1, double $$2, double $$3, double $$4) {
        Instant $$5 = Instant.now();
        if (this.h == null || Duration.between(this.g, $$5).compareTo(a) > 0) {
            this.g = $$5;
            this.h = new a(this.e.s.s_(), hx.a(this.e.t.di()), 10, this.f);
        }
        fnj.a($$0, this.h.a, this.h.c, $$1, $$2, $$3, $$4, c);
        fnj.a($$0, this.h.b, this.h.c, $$1, $$2, $$3, $$4, d);
        ein $$6 = $$1.getBuffer(fkf.B());
        fnj.a($$0, this.h.a, this.h.c, $$6, $$2, $$3, $$4, c);
        fnj.a($$0, this.h.b, this.h.c, $$6, $$2, $$3, $$4, d);
    }

    private static void a(eij $$0, eer $$1, hx $$2, ein $$3, double $$4, double $$5, double $$6, Vector4f $$72) {
        $$1.a(($$7, $$8, $$9, $$10) -> {
            int $$11 = $$8 + $$2.u();
            int $$12 = $$9 + $$2.v();
            int $$13 = $$10 + $$2.w();
            fnj.a($$0, $$3, $$7, $$4, $$5, $$6, $$11, $$12, $$13, $$72);
        });
    }

    private static void a(eij $$0, eer $$1, hx $$2, fjx $$3, double $$4, double $$5, double $$6, Vector4f $$72) {
        $$1.a(($$7, $$8, $$9, $$10, $$11, $$12) -> {
            int $$13 = $$7 + $$2.u();
            int $$14 = $$8 + $$2.v();
            int $$15 = $$9 + $$2.w();
            int $$16 = $$10 + $$2.u();
            int $$17 = $$11 + $$2.v();
            int $$18 = $$12 + $$2.w();
            ein $$19 = $$3.getBuffer(fkf.a(1.0));
            fnj.a($$0, $$19, $$4, $$5, $$6, $$13, $$14, $$15, $$16, $$17, $$18, $$72);
        }, true);
    }

    private static void a(eij $$0, ein $$1, ha $$2, double $$3, double $$4, double $$5, int $$6, int $$7, int $$8, Vector4f $$9) {
        float $$10 = (float)((double)hx.c($$6) - $$3);
        float $$11 = (float)((double)hx.c($$7) - $$4);
        float $$12 = (float)((double)hx.c($$8) - $$5);
        float $$13 = $$10 + 16.0f;
        float $$14 = $$11 + 16.0f;
        float $$15 = $$12 + 16.0f;
        float $$16 = $$9.x();
        float $$17 = $$9.y();
        float $$18 = $$9.z();
        float $$19 = $$9.w();
        Matrix4f $$20 = $$0.c().a();
        switch ($$2) {
            case a: {
                $$1.a($$20, $$10, $$11, $$12).a($$16, $$17, $$18, $$19).e();
                $$1.a($$20, $$13, $$11, $$12).a($$16, $$17, $$18, $$19).e();
                $$1.a($$20, $$13, $$11, $$15).a($$16, $$17, $$18, $$19).e();
                $$1.a($$20, $$10, $$11, $$15).a($$16, $$17, $$18, $$19).e();
                break;
            }
            case b: {
                $$1.a($$20, $$10, $$14, $$12).a($$16, $$17, $$18, $$19).e();
                $$1.a($$20, $$10, $$14, $$15).a($$16, $$17, $$18, $$19).e();
                $$1.a($$20, $$13, $$14, $$15).a($$16, $$17, $$18, $$19).e();
                $$1.a($$20, $$13, $$14, $$12).a($$16, $$17, $$18, $$19).e();
                break;
            }
            case c: {
                $$1.a($$20, $$10, $$11, $$12).a($$16, $$17, $$18, $$19).e();
                $$1.a($$20, $$10, $$14, $$12).a($$16, $$17, $$18, $$19).e();
                $$1.a($$20, $$13, $$14, $$12).a($$16, $$17, $$18, $$19).e();
                $$1.a($$20, $$13, $$11, $$12).a($$16, $$17, $$18, $$19).e();
                break;
            }
            case d: {
                $$1.a($$20, $$10, $$11, $$15).a($$16, $$17, $$18, $$19).e();
                $$1.a($$20, $$13, $$11, $$15).a($$16, $$17, $$18, $$19).e();
                $$1.a($$20, $$13, $$14, $$15).a($$16, $$17, $$18, $$19).e();
                $$1.a($$20, $$10, $$14, $$15).a($$16, $$17, $$18, $$19).e();
                break;
            }
            case e: {
                $$1.a($$20, $$10, $$11, $$12).a($$16, $$17, $$18, $$19).e();
                $$1.a($$20, $$10, $$11, $$15).a($$16, $$17, $$18, $$19).e();
                $$1.a($$20, $$10, $$14, $$15).a($$16, $$17, $$18, $$19).e();
                $$1.a($$20, $$10, $$14, $$12).a($$16, $$17, $$18, $$19).e();
                break;
            }
            case f: {
                $$1.a($$20, $$13, $$11, $$12).a($$16, $$17, $$18, $$19).e();
                $$1.a($$20, $$13, $$14, $$12).a($$16, $$17, $$18, $$19).e();
                $$1.a($$20, $$13, $$14, $$15).a($$16, $$17, $$18, $$19).e();
                $$1.a($$20, $$13, $$11, $$15).a($$16, $$17, $$18, $$19).e();
            }
        }
    }

    private static void a(eij $$0, ein $$1, double $$2, double $$3, double $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, Vector4f $$11) {
        float $$12 = (float)((double)hx.c($$5) - $$2);
        float $$13 = (float)((double)hx.c($$6) - $$3);
        float $$14 = (float)((double)hx.c($$7) - $$4);
        float $$15 = (float)((double)hx.c($$8) - $$2);
        float $$16 = (float)((double)hx.c($$9) - $$3);
        float $$17 = (float)((double)hx.c($$10) - $$4);
        Matrix4f $$18 = $$0.c().a();
        $$1.a($$18, $$12, $$13, $$14).a($$11.x(), $$11.y(), $$11.z(), 1.0f).e();
        $$1.a($$18, $$15, $$16, $$17).a($$11.x(), $$11.y(), $$11.z(), 1.0f).e();
    }

    static final class a {
        final eer a;
        final eer b;
        final hx c;

        a(dwt $$0, hx $$1, int $$2, cmv $$3) {
            int $$4 = $$2 * 2 + 1;
            this.a = new eel($$4, $$4, $$4);
            this.b = new eel($$4, $$4, $$4);
            for (int $$5 = 0; $$5 < $$4; ++$$5) {
                for (int $$6 = 0; $$6 < $$4; ++$$6) {
                    for (int $$7 = 0; $$7 < $$4; ++$$7) {
                        hx $$8 = hx.a($$1.a() + $$7 - $$2, $$1.b() + $$6 - $$2, $$1.c() + $$5 - $$2);
                        dws.b $$9 = $$0.b($$3, $$8);
                        if ($$9 == dws.b.c) {
                            this.a.c($$7, $$6, $$5);
                            this.b.c($$7, $$6, $$5);
                            continue;
                        }
                        if ($$9 != dws.b.b) continue;
                        this.b.c($$7, $$6, $$5);
                    }
                }
            }
            this.c = hx.a($$1.a() - $$2, $$1.b() - $$2, $$1.c() - $$2);
        }
    }
}

