/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class fjp {
    private static final int b = 96;
    private static final List<e> c = Lists.newArrayList((Object[])new e[]{new a(), new b()});
    public static final float a = 5000.0f;
    private static float d;
    private static float e;
    private static float f;
    private static int g;
    private static int h;
    private static long i;

    public static void a(emz $$0, float $$1, few $$2, int $$32, float $$42) {
        float $$44;
        bfz $$422;
        dxg $$52 = $$0.k();
        bfj $$6 = $$0.g();
        if ($$52 == dxg.b) {
            long $$7 = ac.b();
            int $$8 = $$2.s(gu.a($$0.b())).a().j();
            if (i < 0L) {
                g = $$8;
                h = $$8;
                i = $$7;
            }
            int $$9 = g >> 16 & 0xFF;
            int $$10 = g >> 8 & 0xFF;
            int $$11 = g & 0xFF;
            int $$12 = h >> 16 & 0xFF;
            int $$13 = h >> 8 & 0xFF;
            int $$14 = h & 0xFF;
            float $$15 = apa.a((float)($$7 - i) / 5000.0f, 0.0f, 1.0f);
            float $$16 = apa.i($$15, $$12, $$9);
            float $$17 = apa.i($$15, $$13, $$10);
            float $$18 = apa.i($$15, $$14, $$11);
            d = $$16 / 255.0f;
            e = $$17 / 255.0f;
            f = $$18 / 255.0f;
            if (g != $$8) {
                g = $$8;
                h = apa.d($$16) << 16 | apa.d($$17) << 8 | apa.d($$18);
                i = $$7;
            }
        } else if ($$52 == dxg.a) {
            d = 0.6f;
            e = 0.1f;
            f = 0.0f;
            i = -1L;
        } else if ($$52 == dxg.c) {
            d = 0.623f;
            e = 0.734f;
            f = 0.785f;
            i = -1L;
            RenderSystem.clearColor(d, e, f, 0.0f);
        } else {
            float $$35;
            float $$19 = 0.25f + 0.75f * (float)$$32 / 32.0f;
            $$19 = 1.0f - (float)Math.pow($$19, 0.25);
            eei $$20 = $$2.a($$0.b(), $$1);
            float $$21 = (float)$$20.c;
            float $$22 = (float)$$20.d;
            float $$23 = (float)$$20.e;
            float $$24 = apa.a(apa.b($$2.f($$1) * ((float)Math.PI * 2)) * 2.0f + 0.5f, 0.0f, 1.0f);
            cnm $$25 = $$2.z_();
            eei $$26 = $$0.b().a(2.0, 2.0, 2.0).a(0.25);
            eei $$27 = aoc.a($$26, ($$3, $$4, $$5) -> $$2.d().a(eei.a($$25.a($$3, $$4, $$5).a().e()), $$24));
            d = (float)$$27.a();
            e = (float)$$27.b();
            f = (float)$$27.c();
            if ($$32 >= 4) {
                float[] $$31;
                float $$28 = apa.a($$2.a($$1)) > 0.0f ? -1.0f : 1.0f;
                Vector3f $$29 = new Vector3f($$28, 0.0f, 0.0f);
                float $$30 = $$0.l().dot((Vector3fc)$$29);
                if ($$30 < 0.0f) {
                    $$30 = 0.0f;
                }
                if ($$30 > 0.0f && ($$31 = $$2.d().a($$2.f($$1), $$1)) != null) {
                    d = d * (1.0f - ($$30 *= $$31[3])) + $$31[0] * $$30;
                    e = e * (1.0f - $$30) + $$31[1] * $$30;
                    f = f * (1.0f - $$30) + $$31[2] * $$30;
                }
            }
            d += ($$21 - d) * $$19;
            e += ($$22 - e) * $$19;
            f += ($$23 - f) * $$19;
            float $$322 = $$2.d($$1);
            if ($$322 > 0.0f) {
                float $$33 = 1.0f - $$322 * 0.5f;
                float $$34 = 1.0f - $$322 * 0.4f;
                d *= $$33;
                e *= $$33;
                f *= $$34;
            }
            if (($$35 = $$2.b($$1)) > 0.0f) {
                float $$36 = 1.0f - $$35 * 0.5f;
                d *= $$36;
                e *= $$36;
                f *= $$36;
            }
            i = -1L;
        }
        float $$37 = ((float)$$0.b().d - (float)$$2.C_()) * $$2.k().g();
        e $$38 = fjp.a($$6, $$1);
        if ($$38 != null) {
            bfz $$39 = (bfz)$$6;
            $$37 = $$38.a($$39, $$39.b($$38.a()), $$37, $$1);
        }
        if ($$37 < 1.0f && $$52 != dxg.a && $$52 != dxg.c) {
            if ($$37 < 0.0f) {
                $$37 = 0.0f;
            }
            $$37 *= $$37;
            d *= $$37;
            e *= $$37;
            f *= $$37;
        }
        if ($$42 > 0.0f) {
            d = d * (1.0f - $$42) + d * 0.7f * $$42;
            e = e * (1.0f - $$42) + e * 0.6f * $$42;
            f = f * (1.0f - $$42) + f * 0.6f * $$42;
        }
        if ($$52 == dxg.b) {
            if ($$6 instanceof fiy) {
                float $$40 = ((fiy)$$6).J();
            } else {
                float $$41 = 1.0f;
            }
        } else if ($$6 instanceof bfz && ($$422 = (bfz)$$6).a(bfc.p) && !$$422.a(bfc.G)) {
            float $$43 = fjq.a($$422, $$1);
        } else {
            $$44 = 0.0f;
        }
        if (d != 0.0f && e != 0.0f && f != 0.0f) {
            float $$45 = Math.min(1.0f / d, Math.min(1.0f / e, 1.0f / f));
            d = d * (1.0f - $$44) + d * $$45 * $$44;
            e = e * (1.0f - $$44) + e * $$45 * $$44;
            f = f * (1.0f - $$44) + f * $$45 * $$44;
        }
        RenderSystem.clearColor(d, e, f, 0.0f);
    }

    public static void a() {
        RenderSystem.setShaderFogStart(Float.MAX_VALUE);
    }

    @Nullable
    private static e a(bfj $$0, float $$1) {
        if ($$0 instanceof bfz) {
            bfz $$22 = (bfz)$$0;
            return c.stream().filter($$2 -> $$2.a($$22, $$1)).findFirst().orElse(null);
        }
        return null;
    }

    public static void a(emz $$0, d $$1, float $$2, boolean $$3, float $$4) {
        dxg $$5 = $$0.k();
        bfj $$6 = $$0.g();
        c $$7 = new c($$1);
        e $$8 = fjp.a($$6, $$4);
        if ($$5 == dxg.a) {
            if ($$6.G_()) {
                $$7.b = -8.0f;
                $$7.c = $$2 * 0.5f;
            } else if ($$6 instanceof bfz && ((bfz)$$6).a(bfc.l)) {
                $$7.b = 0.0f;
                $$7.c = 3.0f;
            } else {
                $$7.b = 0.25f;
                $$7.c = 1.0f;
            }
        } else if ($$5 == dxg.c) {
            if ($$6.G_()) {
                $$7.b = -8.0f;
                $$7.c = $$2 * 0.5f;
            } else {
                $$7.b = 0.0f;
                $$7.c = 2.0f;
            }
        } else if ($$8 != null) {
            bfz $$9 = (bfz)$$6;
            bfa $$10 = $$9.b($$8.a());
            if ($$10 != null) {
                $$8.a($$7, $$9, $$10, $$2, $$4);
            }
        } else if ($$5 == dxg.b) {
            $$7.b = -8.0f;
            $$7.c = 96.0f;
            if ($$6 instanceof fiy) {
                fiy $$11 = (fiy)$$6;
                $$7.c *= Math.max(0.25f, $$11.J());
                he<cnk> $$12 = $$11.dI().s($$11.di());
                if ($$12.a(amv.Z)) {
                    $$7.c *= 0.85f;
                }
            }
            if ($$7.c > $$2) {
                $$7.c = $$2;
                $$7.d = ehw.b;
            }
        } else if ($$3) {
            $$7.b = $$2 * 0.05f;
            $$7.c = Math.min($$2, 192.0f) * 0.5f;
        } else if ($$1 == fjp$d.a) {
            $$7.b = 0.0f;
            $$7.c = $$2;
            $$7.d = ehw.b;
        } else {
            float $$13 = apa.a($$2 / 10.0f, 4.0f, 64.0f);
            $$7.b = $$2 - $$13;
            $$7.c = $$2;
            $$7.d = ehw.b;
        }
        RenderSystem.setShaderFogStart($$7.b);
        RenderSystem.setShaderFogEnd($$7.c);
        RenderSystem.setShaderFogShape($$7.d);
    }

    public static void b() {
        RenderSystem.setShaderFogColor(d, e, f);
    }

    static {
        g = -1;
        h = -1;
        i = -1L;
    }

    static interface e {
        public bey a();

        public void a(c var1, bfz var2, bfa var3, float var4, float var5);

        default public boolean a(bfz $$0, float $$1) {
            return $$0.a(this.a());
        }

        default public float a(bfz $$0, bfa $$1, float $$2, float $$3) {
            bfa $$4 = $$0.b(this.a());
            if ($$4 != null) {
                $$2 = $$4.a(19) ? 1.0f - (float)$$4.d() / 20.0f : 0.0f;
            }
            return $$2;
        }
    }

    static class c {
        public final d a;
        public float b;
        public float c;
        public ehw d = ehw.a;

        public c(d $$0) {
            this.a = $$0;
        }
    }

    public static final class d
    extends Enum<d> {
        public static final /* enum */ d a = new d();
        public static final /* enum */ d b = new d();
        private static final /* synthetic */ d[] c;

        public static d[] values() {
            return (d[])c.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        private static /* synthetic */ d[] a() {
            return new d[]{a, b};
        }

        static {
            c = fjp$d.a();
        }
    }

    static class a
    implements e {
        a() {
        }

        @Override
        public bey a() {
            return bfc.o;
        }

        @Override
        public void a(c $$0, bfz $$1, bfa $$2, float $$3, float $$4) {
            float $$5;
            float f2 = $$5 = $$2.b() ? 5.0f : apa.i(Math.min(1.0f, (float)$$2.d() / 20.0f), $$3, 5.0f);
            if ($$0.a == fjp$d.a) {
                $$0.b = 0.0f;
                $$0.c = $$5 * 0.8f;
            } else {
                $$0.b = $$5 * 0.25f;
                $$0.c = $$5;
            }
        }
    }

    static class b
    implements e {
        b() {
        }

        @Override
        public bey a() {
            return bfc.G;
        }

        @Override
        public void a(c $$0, bfz $$1, bfa $$2, float $$3, float $$4) {
            if ($$2.a().isEmpty()) {
                return;
            }
            float $$5 = apa.i($$2.a().get().a($$1, $$4), $$3, 15.0f);
            $$0.b = $$0.a == fjp$d.a ? 0.0f : $$5 * 0.75f;
            $$0.c = $$5;
        }

        @Override
        public float a(bfz $$0, bfa $$1, float $$2, float $$3) {
            if ($$1.a().isEmpty()) {
                return 0.0f;
            }
            return 1.0f - $$1.a().get().a($$0, $$3);
        }
    }
}

