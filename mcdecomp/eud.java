/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntSupplier;

public class eud
extends euk {
    static final acq c = new acq("textures/gui/title/mojangstudios.png");
    private static final int d = aok.b.a(255, 239, 50, 61);
    private static final int e = aok.b.a(255, 0, 0, 0);
    private static final IntSupplier f = () -> enn.N().m.a().c() != false ? e : d;
    private static final int g = 240;
    private static final float h = 60.0f;
    private static final int i = 60;
    private static final int j = 120;
    private static final float k = 0.0625f;
    private static final float l = 0.95f;
    public static final long a = 1000L;
    public static final long b = 500L;
    private final enn m;
    private final akt n;
    private final Consumer<Optional<Throwable>> o;
    private final boolean p;
    private float q;
    private long r = -1L;
    private long s = -1L;

    public eud(enn $$0, akt $$1, Consumer<Optional<Throwable>> $$2, boolean $$3) {
        this.m = $$0;
        this.n = $$1;
        this.o = $$2;
        this.p = $$3;
    }

    public static void a(enn $$0) {
        $$0.X().a(c, new a());
    }

    private static int a(int $$0, int $$1) {
        return $$0 & 0xFFFFFF | $$1 << 24;
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        float $$17;
        float $$8;
        int $$4 = $$0.a();
        int $$5 = $$0.b();
        long $$6 = ac.b();
        if (this.p && this.s == -1L) {
            this.s = $$6;
        }
        float $$7 = this.r > -1L ? (float)($$6 - this.r) / 1000.0f : -1.0f;
        float f2 = $$8 = this.s > -1L ? (float)($$6 - this.s) / 500.0f : -1.0f;
        if ($$7 >= 1.0f) {
            if (this.m.z != null) {
                this.m.z.a($$0, 0, 0, $$3);
            }
            int $$9 = apa.f((1.0f - apa.a($$7 - 1.0f, 0.0f, 1.0f)) * 255.0f);
            $$0.a(fkf.D(), 0, 0, $$4, $$5, eud.a(f.getAsInt(), $$9));
            float $$10 = 1.0f - apa.a($$7 - 1.0f, 0.0f, 1.0f);
        } else if (this.p) {
            if (this.m.z != null && $$8 < 1.0f) {
                this.m.z.a($$0, $$1, $$2, $$3);
            }
            int $$11 = apa.c(apa.a((double)$$8, 0.15, 1.0) * 255.0);
            $$0.a(fkf.D(), 0, 0, $$4, $$5, eud.a(f.getAsInt(), $$11));
            float $$12 = apa.a($$8, 0.0f, 1.0f);
        } else {
            int $$13 = f.getAsInt();
            float $$14 = (float)($$13 >> 16 & 0xFF) / 255.0f;
            float $$15 = (float)($$13 >> 8 & 0xFF) / 255.0f;
            float $$16 = (float)($$13 & 0xFF) / 255.0f;
            GlStateManager._clearColor($$14, $$15, $$16, 1.0f);
            GlStateManager._clear(16384, enn.a);
            $$17 = 1.0f;
        }
        int $$18 = (int)((double)$$0.a() * 0.5);
        int $$19 = (int)((double)$$0.b() * 0.5);
        double $$20 = Math.min((double)$$0.a() * 0.75, (double)$$0.b()) * 0.25;
        int $$21 = (int)($$20 * 0.5);
        double $$22 = $$20 * 4.0;
        int $$23 = (int)($$22 * 0.5);
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(770, 1);
        $$0.a(1.0f, 1.0f, 1.0f, $$17);
        $$0.a(c, $$18 - $$23, $$19 - $$21, $$23, (int)$$20, -0.0625f, 0.0f, 120, 60, 120, 120);
        $$0.a(c, $$18, $$19 - $$21, $$23, (int)$$20, 0.0625f, 60.0f, 120, 60, 120, 120);
        $$0.a(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
        RenderSystem.depthMask(true);
        RenderSystem.enableDepthTest();
        int $$24 = (int)((double)$$0.b() * 0.8325);
        float $$25 = this.n.b();
        this.q = apa.a(this.q * 0.95f + $$25 * 0.050000012f, 0.0f, 1.0f);
        if ($$7 < 1.0f) {
            this.a($$0, $$4 / 2 - $$23, $$24 - 5, $$4 / 2 + $$23, $$24 + 5, 1.0f - apa.a($$7, 0.0f, 1.0f));
        }
        if ($$7 >= 2.0f) {
            this.m.a((euk)null);
        }
        if (this.r == -1L && this.n.c() && (!this.p || $$8 >= 2.0f)) {
            try {
                this.n.d();
                this.o.accept(Optional.empty());
            }
            catch (Throwable $$26) {
                this.o.accept(Optional.of($$26));
            }
            this.r = ac.b();
            if (this.m.z != null) {
                this.m.z.b(this.m, $$0.a(), $$0.b());
            }
        }
    }

    private void a(eox $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
        int $$6 = apa.f((float)($$3 - $$1 - 2) * this.q);
        int $$7 = Math.round($$5 * 255.0f);
        int $$8 = aok.b.a($$7, 255, 255, 255);
        $$0.a($$1 + 2, $$2 + 2, $$1 + $$6, $$4 - 2, $$8);
        $$0.a($$1 + 1, $$2, $$3 - 1, $$2 + 1, $$8);
        $$0.a($$1 + 1, $$4, $$3 - 1, $$4 - 1, $$8);
        $$0.a($$1, $$2, $$1 + 1, $$4, $$8);
        $$0.a($$3, $$2, $$3 - 1, $$4, $$8);
    }

    @Override
    public boolean a() {
        return true;
    }

    static class a
    extends fuo {
        public a() {
            super(c);
        }

        @Override
        protected fuo.a b(akx $$0) {
            fuo.a a2;
            block9: {
                ajo $$1 = enn.N().aa();
                akp<InputStream> $$2 = $$1.a(ajm.a, c);
                if ($$2 == null) {
                    return new fuo.a(new FileNotFoundException(c.toString()));
                }
                InputStream $$3 = $$2.get();
                try {
                    a2 = new fuo.a(new fwn(true, true), ehk.a($$3));
                    if ($$3 == null) break block9;
                }
                catch (Throwable throwable) {
                    try {
                        if ($$3 != null) {
                            try {
                                $$3.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    catch (IOException $$4) {
                        return new fuo.a($$4);
                    }
                }
                $$3.close();
            }
            return a2;
        }
    }
}

