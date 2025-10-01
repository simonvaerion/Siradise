/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import com.mojang.blaze3d.systems.RenderSystem;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class fjw
implements AutoCloseable {
    public static final int a = 0xF000F0;
    public static final int b = 0xF00000;
    public static final int c = 240;
    private final fui d;
    private final ehk e;
    private final acq f;
    private boolean g;
    private float h;
    private final fjq i;
    private final enn j;

    public fjw(fjq $$0, enn $$1) {
        this.i = $$0;
        this.j = $$1;
        this.d = new fui(16, 16, false);
        this.f = this.j.X().a("light_map", this.d);
        this.e = this.d.e();
        for (int $$2 = 0; $$2 < 16; ++$$2) {
            for (int $$3 = 0; $$3 < 16; ++$$3) {
                this.e.a($$3, $$2, -1);
            }
        }
        this.d.d();
    }

    @Override
    public void close() {
        this.d.close();
    }

    public void a() {
        this.h += (float)((Math.random() - Math.random()) * Math.random() * Math.random() * 0.1);
        this.h *= 0.9f;
        this.g = true;
    }

    public void b() {
        RenderSystem.setShaderTexture(2, 0);
    }

    public void c() {
        RenderSystem.setShaderTexture(2, this.f);
        this.j.X().a(this.f);
        RenderSystem.texParameter(3553, 10241, 9729);
        RenderSystem.texParameter(3553, 10240, 9729);
    }

    private float b(float $$0) {
        bfa $$1;
        if (this.j.t.a(bfc.G) && ($$1 = this.j.t.b(bfc.G)) != null && $$1.a().isPresent()) {
            return $$1.a().get().a(this.j.t, $$0);
        }
        return 0.0f;
    }

    private float a(bfz $$0, float $$1, float $$2) {
        float $$3 = 0.45f * $$1;
        return Math.max(0.0f, apa.b(((float)$$0.ag - $$2) * (float)Math.PI * 0.025f) * $$3);
    }

    public void a(float $$0) {
        float $$11;
        float $$4;
        if (!this.g) {
            return;
        }
        this.g = false;
        this.j.aG().a("lightTex");
        few $$1 = this.j.s;
        if ($$1 == null) {
            return;
        }
        float $$2 = $$1.g(1.0f);
        if ($$1.j() > 0) {
            float $$3 = 1.0f;
        } else {
            $$4 = $$2 * 0.95f + 0.05f;
        }
        float $$5 = this.j.m.ag().c().floatValue();
        float $$6 = this.b($$0) * $$5;
        float $$7 = this.a(this.j.t, $$6, $$0) * $$5;
        float $$8 = this.j.t.J();
        if (this.j.t.a(bfc.p)) {
            float $$9 = fjq.a(this.j.t, $$0);
        } else if ($$8 > 0.0f && this.j.t.a(bfc.C)) {
            float $$10 = $$8;
        } else {
            $$11 = 0.0f;
        }
        Vector3f $$12 = new Vector3f($$2, $$2, 1.0f).lerp((Vector3fc)new Vector3f(1.0f, 1.0f, 1.0f), 0.35f);
        float $$13 = this.h + 1.5f;
        Vector3f $$14 = new Vector3f();
        for (int $$15 = 0; $$15 < 16; ++$$15) {
            for (int $$16 = 0; $$16 < 16; ++$$16) {
                float $$26;
                float $$18;
                float $$17 = fjw.a($$1.x_(), $$15) * $$4;
                float $$19 = $$18 = fjw.a($$1.x_(), $$16) * $$13;
                float $$20 = $$18 * (($$18 * 0.6f + 0.4f) * 0.6f + 0.4f);
                float $$21 = $$18 * ($$18 * $$18 * 0.6f + 0.4f);
                $$14.set($$19, $$20, $$21);
                boolean $$22 = $$1.d().d();
                if ($$22) {
                    $$14.lerp((Vector3fc)new Vector3f(0.99f, 1.12f, 1.0f), 0.25f);
                    fjw.a($$14);
                } else {
                    Vector3f $$23 = new Vector3f((Vector3fc)$$12).mul($$17);
                    $$14.add((Vector3fc)$$23);
                    $$14.lerp((Vector3fc)new Vector3f(0.75f, 0.75f, 0.75f), 0.04f);
                    if (this.i.b($$0) > 0.0f) {
                        float $$24 = this.i.b($$0);
                        Vector3f $$25 = new Vector3f((Vector3fc)$$14).mul(0.7f, 0.6f, 0.6f);
                        $$14.lerp((Vector3fc)$$25, $$24);
                    }
                }
                if ($$11 > 0.0f && ($$26 = Math.max($$14.x(), Math.max($$14.y(), $$14.z()))) < 1.0f) {
                    float $$27 = 1.0f / $$26;
                    Vector3f $$28 = new Vector3f((Vector3fc)$$14).mul($$27);
                    $$14.lerp((Vector3fc)$$28, $$11);
                }
                if (!$$22) {
                    if ($$7 > 0.0f) {
                        $$14.add(-$$7, -$$7, -$$7);
                    }
                    fjw.a($$14);
                }
                float $$29 = this.j.m.ak().c().floatValue();
                Vector3f $$30 = new Vector3f(this.c($$14.x), this.c($$14.y), this.c($$14.z));
                $$14.lerp((Vector3fc)$$30, Math.max(0.0f, $$29 - $$6));
                $$14.lerp((Vector3fc)new Vector3f(0.75f, 0.75f, 0.75f), 0.04f);
                fjw.a($$14);
                $$14.mul(255.0f);
                int $$31 = 255;
                int $$32 = (int)$$14.x();
                int $$33 = (int)$$14.y();
                int $$34 = (int)$$14.z();
                this.e.a($$16, $$15, 0xFF000000 | $$34 << 16 | $$33 << 8 | $$32);
            }
        }
        this.d.d();
        this.j.aG().c();
    }

    private static void a(Vector3f $$0) {
        $$0.set(apa.a($$0.x, 0.0f, 1.0f), apa.a($$0.y, 0.0f, 1.0f), apa.a($$0.z, 0.0f, 1.0f));
    }

    private float c(float $$0) {
        float $$1 = 1.0f - $$0;
        return 1.0f - $$1 * $$1 * $$1 * $$1;
    }

    public static float a(dfk $$0, int $$1) {
        float $$2 = (float)$$1 / 15.0f;
        float $$3 = $$2 / (4.0f - 3.0f * $$2);
        return apa.i($$0.s(), $$3, 1.0f);
    }

    public static int a(int $$0, int $$1) {
        return $$0 << 4 | $$1 << 20;
    }

    public static int a(int $$0) {
        return $$0 >> 4 & 0xFFFF;
    }

    public static int b(int $$0) {
        return $$0 >> 20 & 0xFFFF;
    }
}

