/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  org.apache.commons.lang3.tuple.Triple
 *  org.joml.Matrix4f
 */
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import org.apache.commons.lang3.tuple.Triple;
import org.joml.Matrix4f;

public abstract class fke {
    private static final float aS = 0.99975586f;
    public static final double a = 8.0;
    protected final String b;
    private final Runnable aT;
    private final Runnable aU;
    protected static final p c = new p("no_transparency", () -> RenderSystem.disableBlend(), () -> {});
    protected static final p d = new p("additive_transparency", () -> {
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
    }, () -> {
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
    });
    protected static final p e = new p("lightning_transparency", () -> {
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
    }, () -> {
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
    });
    protected static final p f = new p("glint_transparency", () -> {
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_COLOR, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE);
    }, () -> {
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
    });
    protected static final p g = new p("crumbling_transparency", () -> {
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.DST_COLOR, GlStateManager.DestFactor.SRC_COLOR, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
    }, () -> {
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
    });
    protected static final p h = new p("translucent_transparency", () -> {
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
    }, () -> {
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
    });
    protected static final m i = new m();
    protected static final m j = new m(fjq::v);
    protected static final m k = new m(fjq::p);
    protected static final m l = new m(fjq::r);
    protected static final m m = new m(fjq::s);
    protected static final m n = new m(fjq::w);
    protected static final m o = new m(fjq::q);
    protected static final m p = new m(fjq::z);
    protected static final m q = new m(fjq::A);
    protected static final m r = new m(fjq::B);
    protected static final m s = new m(fjq::C);
    protected static final m t = new m(fjq::D);
    protected static final m u = new m(fjq::E);
    protected static final m v = new m(fjq::F);
    protected static final m w = new m(fjq::G);
    protected static final m x = new m(fjq::H);
    protected static final m y = new m(fjq::I);
    protected static final m z = new m(fjq::J);
    protected static final m A = new m(fjq::K);
    protected static final m B = new m(fjq::L);
    protected static final m C = new m(fjq::M);
    protected static final m D = new m(fjq::N);
    protected static final m E = new m(fjq::O);
    protected static final m F = new m(fjq::P);
    protected static final m G = new m(fjq::Q);
    protected static final m H = new m(fjq::R);
    protected static final m I = new m(fjq::S);
    protected static final m J = new m(fjq::T);
    protected static final m K = new m(fjq::U);
    protected static final m L = new m(fjq::V);
    protected static final m M = new m(fjq::W);
    protected static final m N = new m(fjq::X);
    protected static final m O = new m(fjq::Y);
    protected static final m P = new m(fjq::Z);
    protected static final m Q = new m(fjq::aa);
    protected static final m R = new m(fjq::ab);
    protected static final m S = new m(fjq::ac);
    protected static final m T = new m(fjq::ad);
    protected static final m U = new m(fjq::ae);
    protected static final m V = new m(fjq::af);
    protected static final m W = new m(fjq::ar);
    protected static final m X = new m(fjq::ag);
    protected static final m Y = new m(fjq::ah);
    protected static final m Z = new m(fjq::ai);
    protected static final m aa = new m(fjq::aj);
    protected static final m ab = new m(fjq::ak);
    protected static final m ac = new m(fjq::al);
    protected static final m ad = new m(fjq::am);
    protected static final m ae = new m(fjq::an);
    protected static final m af = new m(fjq::ao);
    protected static final m ag = new m(fjq::ap);
    protected static final m ah = new m(fjq::aq);
    protected static final m ai = new m(fjq::as);
    protected static final m aj = new m(fjq::at);
    protected static final m ak = new m(fjq::au);
    protected static final m al = new m(fjq::av);
    protected static final n am = new n(fuu.e, false, true);
    protected static final n an = new n(fuu.e, false, false);
    protected static final e ao = new e();
    protected static final o ap = new o("default_texturing", () -> {}, () -> {});
    protected static final o aq = new o("glint_texturing", () -> fke.a(8.0f), () -> RenderSystem.resetTextureMatrix());
    protected static final o ar = new o("entity_glint_texturing", () -> fke.a(0.16f), () -> RenderSystem.resetTextureMatrix());
    protected static final g as = new g(true);
    protected static final g at = new g(false);
    protected static final l au = new l(true);
    protected static final l av = new l(false);
    protected static final c aw = new c(true);
    protected static final c ax = new c(false);
    protected static final d ay = new d("always", 519);
    protected static final d az = new d("==", 514);
    protected static final d aA = new d("<=", 515);
    protected static final d aB = new d(">", 516);
    protected static final q aC = new q(true, true);
    protected static final q aD = new q(true, false);
    protected static final q aE = new q(false, true);
    protected static final f aF = new f("no_layering", () -> {}, () -> {});
    protected static final f aG = new f("polygon_offset_layering", () -> {
        RenderSystem.polygonOffset(-1.0f, -10.0f);
        RenderSystem.enablePolygonOffset();
    }, () -> {
        RenderSystem.polygonOffset(0.0f, 0.0f);
        RenderSystem.disablePolygonOffset();
    });
    protected static final f aH = new f("view_offset_z_layering", () -> {
        eij $$0 = RenderSystem.getModelViewStack();
        $$0.a();
        $$0.b(0.99975586f, 0.99975586f, 0.99975586f);
        RenderSystem.applyModelViewMatrix();
    }, () -> {
        eij $$0 = RenderSystem.getModelViewStack();
        $$0.b();
        RenderSystem.applyModelViewMatrix();
    });
    protected static final k aI = new k("main_target", () -> {}, () -> {});
    protected static final k aJ = new k("outline_target", () -> enn.N().f.s().a(false), () -> enn.N().f().a(false));
    protected static final k aK = new k("translucent_target", () -> {
        if (enn.L()) {
            enn.N().f.t().a(false);
        }
    }, () -> {
        if (enn.L()) {
            enn.N().f().a(false);
        }
    });
    protected static final k aL = new k("particles_target", () -> {
        if (enn.L()) {
            enn.N().f.v().a(false);
        }
    }, () -> {
        if (enn.L()) {
            enn.N().f().a(false);
        }
    });
    protected static final k aM = new k("weather_target", () -> {
        if (enn.L()) {
            enn.N().f.w().a(false);
        }
    }, () -> {
        if (enn.L()) {
            enn.N().f().a(false);
        }
    });
    protected static final k aN = new k("clouds_target", () -> {
        if (enn.L()) {
            enn.N().f.x().a(false);
        }
    }, () -> {
        if (enn.L()) {
            enn.N().f().a(false);
        }
    });
    protected static final k aO = new k("item_entity_target", () -> {
        if (enn.L()) {
            enn.N().f.u().a(false);
        }
    }, () -> {
        if (enn.L()) {
            enn.N().f().a(false);
        }
    });
    protected static final h aP = new h(OptionalDouble.of(1.0));
    protected static final b aQ = new b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {});
    protected static final b aR = new b("or_reverse", () -> {
        RenderSystem.enableColorLogicOp();
        RenderSystem.logicOp(GlStateManager.g.n);
    }, () -> RenderSystem.disableColorLogicOp());

    public fke(String $$0, Runnable $$1, Runnable $$2) {
        this.b = $$0;
        this.aT = $$1;
        this.aU = $$2;
    }

    public void a() {
        this.aT.run();
    }

    public void b() {
        this.aU.run();
    }

    public String toString() {
        return this.b;
    }

    private static void a(float $$0) {
        long $$1 = (long)((double)ac.b() * enn.N().m.ah().c() * 8.0);
        float $$2 = (float)($$1 % 110000L) / 110000.0f;
        float $$3 = (float)($$1 % 30000L) / 30000.0f;
        Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0f);
        $$4.rotateZ(0.17453292f).scale($$0);
        RenderSystem.setTextureMatrix($$4);
    }

    protected static class p
    extends fke {
        public p(String $$0, Runnable $$1, Runnable $$2) {
            super($$0, $$1, $$2);
        }
    }

    protected static class m
    extends fke {
        private final Optional<Supplier<fki>> aS;

        public m(Supplier<fki> $$0) {
            super("shader", () -> RenderSystem.setShader($$0), () -> {});
            this.aS = Optional.of($$0);
        }

        public m() {
            super("shader", () -> RenderSystem.setShader(() -> null), () -> {});
            this.aS = Optional.empty();
        }

        @Override
        public String toString() {
            return this.b + "[" + this.aS + "]";
        }
    }

    protected static class n
    extends e {
        private final Optional<acq> aS;
        private final boolean aT;
        private final boolean aU;

        public n(acq $$0, boolean $$1, boolean $$2) {
            super(() -> {
                fuw $$3 = enn.N().X();
                $$3.b($$0).a($$1, $$2);
                RenderSystem.setShaderTexture(0, $$0);
            }, () -> {});
            this.aS = Optional.of($$0);
            this.aT = $$1;
            this.aU = $$2;
        }

        @Override
        public String toString() {
            return this.b + "[" + this.aS + "(blur=" + this.aT + ", mipmap=" + this.aU + ")]";
        }

        @Override
        protected Optional<acq> c() {
            return this.aS;
        }
    }

    protected static class e
    extends fke {
        public e(Runnable $$0, Runnable $$1) {
            super("texture", $$0, $$1);
        }

        e() {
            super("texture", () -> {}, () -> {});
        }

        protected Optional<acq> c() {
            return Optional.empty();
        }
    }

    protected static class o
    extends fke {
        public o(String $$0, Runnable $$1, Runnable $$2) {
            super($$0, $$1, $$2);
        }
    }

    protected static class g
    extends a {
        public g(boolean $$0) {
            super("lightmap", () -> {
                if ($$0) {
                    enn.N().j.n().c();
                }
            }, () -> {
                if ($$0) {
                    enn.N().j.n().b();
                }
            }, $$0);
        }
    }

    protected static class l
    extends a {
        public l(boolean $$0) {
            super("overlay", () -> {
                if ($$0) {
                    enn.N().j.o().a();
                }
            }, () -> {
                if ($$0) {
                    enn.N().j.o().b();
                }
            }, $$0);
        }
    }

    protected static class c
    extends a {
        public c(boolean $$0) {
            super("cull", () -> {
                if (!$$0) {
                    RenderSystem.disableCull();
                }
            }, () -> {
                if (!$$0) {
                    RenderSystem.enableCull();
                }
            }, $$0);
        }
    }

    protected static class d
    extends fke {
        private final String aS;

        public d(String $$0, int $$1) {
            super("depth_test", () -> {
                if ($$1 != 519) {
                    RenderSystem.enableDepthTest();
                    RenderSystem.depthFunc($$1);
                }
            }, () -> {
                if ($$1 != 519) {
                    RenderSystem.disableDepthTest();
                    RenderSystem.depthFunc(515);
                }
            });
            this.aS = $$0;
        }

        @Override
        public String toString() {
            return this.b + "[" + this.aS + "]";
        }
    }

    protected static class q
    extends fke {
        private final boolean aS;
        private final boolean aT;

        public q(boolean $$0, boolean $$1) {
            super("write_mask_state", () -> {
                if (!$$1) {
                    RenderSystem.depthMask($$1);
                }
                if (!$$0) {
                    RenderSystem.colorMask($$0, $$0, $$0, $$0);
                }
            }, () -> {
                if (!$$1) {
                    RenderSystem.depthMask(true);
                }
                if (!$$0) {
                    RenderSystem.colorMask(true, true, true, true);
                }
            });
            this.aS = $$0;
            this.aT = $$1;
        }

        @Override
        public String toString() {
            return this.b + "[writeColor=" + this.aS + ", writeDepth=" + this.aT + "]";
        }
    }

    protected static class f
    extends fke {
        public f(String $$0, Runnable $$1, Runnable $$2) {
            super($$0, $$1, $$2);
        }
    }

    protected static class k
    extends fke {
        public k(String $$0, Runnable $$1, Runnable $$2) {
            super($$0, $$1, $$2);
        }
    }

    protected static class h
    extends fke {
        private final OptionalDouble aS;

        public h(OptionalDouble $$0) {
            super("line_width", () -> {
                if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
                    if ($$0.isPresent()) {
                        RenderSystem.lineWidth((float)$$0.getAsDouble());
                    } else {
                        RenderSystem.lineWidth(Math.max(2.5f, (float)enn.N().aM().k() / 1920.0f * 2.5f));
                    }
                }
            }, () -> {
                if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
                    RenderSystem.lineWidth(1.0f);
                }
            });
            this.aS = $$0;
        }

        @Override
        public String toString() {
            return this.b + "[" + (Serializable)(this.aS.isPresent() ? Double.valueOf(this.aS.getAsDouble()) : "window_scale") + "]";
        }
    }

    protected static class b
    extends fke {
        public b(String $$0, Runnable $$1, Runnable $$2) {
            super($$0, $$1, $$2);
        }
    }

    static class a
    extends fke {
        private final boolean aS;

        public a(String $$0, Runnable $$1, Runnable $$2, boolean $$3) {
            super($$0, $$1, $$2);
            this.aS = $$3;
        }

        @Override
        public String toString() {
            return this.b + "[" + this.aS + "]";
        }
    }

    protected static final class j
    extends o {
        public j(float $$0, float $$1) {
            super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0f)), () -> RenderSystem.resetTextureMatrix());
        }
    }

    protected static class i
    extends e {
        private final Optional<acq> aS;

        i(ImmutableList<Triple<acq, Boolean, Boolean>> $$0) {
            super(() -> {
                int $$1 = 0;
                for (Triple $$2 : $$0) {
                    fuw $$3 = enn.N().X();
                    $$3.b((acq)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
                    RenderSystem.setShaderTexture($$1++, (acq)$$2.getLeft());
                }
            }, () -> {});
            this.aS = $$0.stream().findFirst().map(Triple::getLeft);
        }

        @Override
        protected Optional<acq> c() {
            return this.aS;
        }

        public static a d() {
            return new a();
        }

        public static final class a {
            private final ImmutableList.Builder<Triple<acq, Boolean, Boolean>> a = new ImmutableList.Builder();

            public a a(acq $$0, boolean $$1, boolean $$2) {
                this.a.add((Object)Triple.of((Object)$$0, (Object)$$1, (Object)$$2));
                return this;
            }

            public i a() {
                return new i((ImmutableList<Triple<acq, Boolean, Boolean>>)this.a.build());
            }
        }
    }
}

