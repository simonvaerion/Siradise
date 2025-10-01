/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  javax.annotation.Nullable
 *  org.apache.commons.io.IOUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class fki
implements ehz,
AutoCloseable {
    public static final String a = "shaders";
    private static final String r = "shaders/core/";
    private static final String s = "shaders/include/";
    static final Logger t = LogUtils.getLogger();
    private static final ehs u = new ehs();
    private static final boolean v = true;
    private static fki w;
    private static int x;
    private final Map<String, Object> y = Maps.newHashMap();
    private final List<String> z = Lists.newArrayList();
    private final List<Integer> A = Lists.newArrayList();
    private final List<eia> B = Lists.newArrayList();
    private final List<Integer> C = Lists.newArrayList();
    private final Map<String, eia> D = Maps.newHashMap();
    private final int E;
    private final String F;
    private boolean G;
    private final eht H;
    private final List<Integer> I;
    private final List<String> J;
    private final ehx K;
    private final ehx L;
    private final eio M;
    @Nullable
    public final eia b;
    @Nullable
    public final eia c;
    @Nullable
    public final eia d;
    @Nullable
    public final eia e;
    @Nullable
    public final eia f;
    @Nullable
    public final eia g;
    @Nullable
    public final eia h;
    @Nullable
    public final eia i;
    @Nullable
    public final eia j;
    @Nullable
    public final eia k;
    @Nullable
    public final eia l;
    @Nullable
    public final eia m;
    @Nullable
    public final eia n;
    @Nullable
    public final eia o;
    @Nullable
    public final eia p;
    @Nullable
    public final eia q;

    public fki(ala $$0, String $$1, eio $$2) throws IOException {
        this.F = $$1;
        this.M = $$2;
        acq $$3 = new acq(r + $$1 + ".json");
        try (BufferedReader $$4 = $$0.openAsReader($$3);){
            JsonArray $$18;
            JsonArray $$13;
            JsonObject $$5 = aor.a($$4);
            String $$6 = aor.i($$5, "vertex");
            String $$7 = aor.i($$5, "fragment");
            JsonArray $$8 = aor.a($$5, "samplers", null);
            if ($$8 != null) {
                int $$9 = 0;
                for (Object $$10 : $$8) {
                    try {
                        this.a((JsonElement)$$10);
                    }
                    catch (Exception $$11) {
                        act $$12 = act.a($$11);
                        $$12.a("samplers[" + $$9 + "]");
                        throw $$12;
                    }
                    ++$$9;
                }
            }
            if (($$13 = aor.a($$5, "attributes", null)) != null) {
                int $$14 = 0;
                this.I = Lists.newArrayListWithCapacity((int)$$13.size());
                this.J = Lists.newArrayListWithCapacity((int)$$13.size());
                for (JsonElement $$15 : $$13) {
                    try {
                        this.J.add(aor.a($$15, "attribute"));
                    }
                    catch (Exception $$16) {
                        act $$17 = act.a($$16);
                        $$17.a("attributes[" + $$14 + "]");
                        throw $$17;
                    }
                    ++$$14;
                }
            } else {
                this.I = null;
                this.J = null;
            }
            if (($$18 = aor.a($$5, "uniforms", null)) != null) {
                int $$19 = 0;
                for (JsonElement $$20 : $$18) {
                    try {
                        this.b($$20);
                    }
                    catch (Exception $$21) {
                        act $$22 = act.a($$21);
                        $$22.a("uniforms[" + $$19 + "]");
                        throw $$22;
                    }
                    ++$$19;
                }
            }
            this.H = fki.a(aor.a($$5, "blend", null));
            this.K = fki.a($$0, ehx.a.a, $$6);
            this.L = fki.a($$0, ehx.a.b, $$7);
            this.E = ehy.a();
            if (this.J != null) {
                int $$23 = 0;
                for (String $$24 : $$2.d()) {
                    eia.a(this.E, $$23, $$24);
                    this.I.add($$23);
                    ++$$23;
                }
            }
            ehy.b(this);
            this.j();
        }
        catch (Exception $$26) {
            act $$27 = act.a($$26);
            $$27.b($$3.a());
            throw $$27;
        }
        this.b();
        this.b = this.a("ModelViewMat");
        this.c = this.a("ProjMat");
        this.d = this.a("IViewRotMat");
        this.e = this.a("TextureMat");
        this.f = this.a("ScreenSize");
        this.g = this.a("ColorModulator");
        this.h = this.a("Light0_Direction");
        this.i = this.a("Light1_Direction");
        this.j = this.a("GlintAlpha");
        this.k = this.a("FogStart");
        this.l = this.a("FogEnd");
        this.m = this.a("FogColor");
        this.n = this.a("FogShape");
        this.o = this.a("LineWidth");
        this.p = this.a("GameTime");
        this.q = this.a("ChunkOffset");
    }

    private static ehx a(final ala $$0, ehx.a $$1, String $$2) throws IOException {
        ehx $$10;
        ehx $$3 = $$1.c().get($$2);
        if ($$3 == null) {
            String $$4 = r + $$2 + $$1.b();
            akv $$5 = $$0.getResourceOrThrow(new acq($$4));
            try (InputStream $$6 = $$5.d();){
                final String $$7 = v.a($$4);
                ehx $$8 = ehx.a($$1, $$2, $$6, $$5.b(), new ehq(){
                    private final Set<String> c = Sets.newHashSet();

                    @Override
                    public String a(boolean $$02, String $$1) {
                        String string;
                        block9: {
                            $$1 = v.b(($$02 ? $$7 : fki.s) + $$1);
                            if (!this.c.add($$1)) {
                                return null;
                            }
                            acq $$2 = new acq($$1);
                            BufferedReader $$3 = $$0.openAsReader($$2);
                            try {
                                string = IOUtils.toString((Reader)$$3);
                                if ($$3 == null) break block9;
                            }
                            catch (Throwable throwable) {
                                try {
                                    if ($$3 != null) {
                                        try {
                                            ((Reader)$$3).close();
                                        }
                                        catch (Throwable throwable2) {
                                            throwable.addSuppressed(throwable2);
                                        }
                                    }
                                    throw throwable;
                                }
                                catch (IOException $$4) {
                                    t.error("Could not open GLSL import {}: {}", (Object)$$1, (Object)$$4.getMessage());
                                    return "#error " + $$4.getMessage();
                                }
                            }
                            ((Reader)$$3).close();
                        }
                        return string;
                    }
                });
            }
        } else {
            $$10 = $$3;
        }
        return $$10;
    }

    public static eht a(JsonObject $$0) {
        if ($$0 == null) {
            return new eht();
        }
        int $$1 = 32774;
        int $$2 = 1;
        int $$3 = 0;
        int $$4 = 1;
        int $$5 = 0;
        boolean $$6 = true;
        boolean $$7 = false;
        if (aor.a($$0, "func") && ($$1 = eht.a($$0.get("func").getAsString())) != 32774) {
            $$6 = false;
        }
        if (aor.a($$0, "srcrgb") && ($$2 = eht.b($$0.get("srcrgb").getAsString())) != 1) {
            $$6 = false;
        }
        if (aor.a($$0, "dstrgb") && ($$3 = eht.b($$0.get("dstrgb").getAsString())) != 0) {
            $$6 = false;
        }
        if (aor.a($$0, "srcalpha")) {
            $$4 = eht.b($$0.get("srcalpha").getAsString());
            if ($$4 != 1) {
                $$6 = false;
            }
            $$7 = true;
        }
        if (aor.a($$0, "dstalpha")) {
            $$5 = eht.b($$0.get("dstalpha").getAsString());
            if ($$5 != 0) {
                $$6 = false;
            }
            $$7 = true;
        }
        if ($$6) {
            return new eht();
        }
        if ($$7) {
            return new eht($$2, $$3, $$4, $$5, $$1);
        }
        return new eht($$2, $$3, $$1);
    }

    @Override
    public void close() {
        for (eia $$0 : this.B) {
            $$0.close();
        }
        ehy.a(this);
    }

    public void f() {
        RenderSystem.assertOnRenderThread();
        ehy.a(0);
        x = -1;
        w = null;
        int $$0 = GlStateManager._getActiveTexture();
        for (int $$1 = 0; $$1 < this.A.size(); ++$$1) {
            if (this.y.get(this.z.get($$1)) == null) continue;
            GlStateManager._activeTexture(33984 + $$1);
            GlStateManager._bindTexture(0);
        }
        GlStateManager._activeTexture($$0);
    }

    public void g() {
        RenderSystem.assertOnRenderThread();
        this.G = false;
        w = this;
        this.H.a();
        if (this.E != x) {
            ehy.a(this.E);
            x = this.E;
        }
        int $$0 = GlStateManager._getActiveTexture();
        for (int $$1 = 0; $$1 < this.A.size(); ++$$1) {
            String $$2 = this.z.get($$1);
            if (this.y.get($$2) == null) continue;
            int $$3 = eia.a(this.E, $$2);
            eia.b($$3, $$1);
            RenderSystem.activeTexture(33984 + $$1);
            Object $$4 = this.y.get($$2);
            int $$5 = -1;
            if ($$4 instanceof egv) {
                $$5 = ((egv)$$4).f();
            } else if ($$4 instanceof fug) {
                $$5 = ((fug)$$4).a();
            } else if ($$4 instanceof Integer) {
                $$5 = (Integer)$$4;
            }
            if ($$5 == -1) continue;
            RenderSystem.bindTexture($$5);
        }
        GlStateManager._activeTexture($$0);
        for (eia $$6 : this.B) {
            $$6.b();
        }
    }

    @Override
    public void b() {
        this.G = true;
    }

    @Nullable
    public eia a(String $$0) {
        RenderSystem.assertOnRenderThread();
        return this.D.get($$0);
    }

    public ehs b(String $$0) {
        RenderSystem.assertOnGameThread();
        eia $$1 = this.a($$0);
        return $$1 == null ? u : $$1;
    }

    private void j() {
        RenderSystem.assertOnRenderThread();
        IntArrayList $$0 = new IntArrayList();
        for (int $$1 = 0; $$1 < this.z.size(); ++$$1) {
            String $$2 = this.z.get($$1);
            int $$3 = eia.a(this.E, $$2);
            if ($$3 == -1) {
                t.warn("Shader {} could not find sampler named {} in the specified shader program.", (Object)this.F, (Object)$$2);
                this.y.remove($$2);
                $$0.add($$1);
                continue;
            }
            this.A.add($$3);
        }
        for (int $$4 = $$0.size() - 1; $$4 >= 0; --$$4) {
            int $$5 = $$0.getInt($$4);
            this.z.remove($$5);
        }
        for (eia $$6 : this.B) {
            String $$7 = $$6.a();
            int $$8 = eia.a(this.E, $$7);
            if ($$8 == -1) {
                t.warn("Shader {} could not find uniform named {} in the specified shader program.", (Object)this.F, (Object)$$7);
                continue;
            }
            this.C.add($$8);
            $$6.b($$8);
            this.D.put($$7, $$6);
        }
    }

    private void a(JsonElement $$0) {
        JsonObject $$1 = aor.m($$0, "sampler");
        String $$2 = aor.i($$1, "name");
        if (!aor.a($$1, "file")) {
            this.y.put($$2, null);
            this.z.add($$2);
            return;
        }
        this.z.add($$2);
    }

    public void a(String $$0, Object $$1) {
        this.y.put($$0, $$1);
        this.b();
    }

    private void b(JsonElement $$0) throws act {
        JsonObject $$1 = aor.m($$0, "uniform");
        String $$2 = aor.i($$1, "name");
        int $$3 = eia.a(aor.i($$1, "type"));
        int $$4 = aor.o($$1, "count");
        float[] $$5 = new float[Math.max($$4, 16)];
        JsonArray $$6 = aor.v($$1, "values");
        if ($$6.size() != $$4 && $$6.size() > 1) {
            throw new act("Invalid amount of values specified (expected " + $$4 + ", found " + $$6.size() + ")");
        }
        int $$7 = 0;
        for (JsonElement $$8 : $$6) {
            try {
                $$5[$$7] = aor.e($$8, "value");
            }
            catch (Exception $$9) {
                act $$10 = act.a($$9);
                $$10.a("values[" + $$7 + "]");
                throw $$10;
            }
            ++$$7;
        }
        if ($$4 > 1 && $$6.size() == 1) {
            while ($$7 < $$4) {
                $$5[$$7] = $$5[0];
                ++$$7;
            }
        }
        int $$11 = $$4 > 1 && $$4 <= 4 && $$3 < 8 ? $$4 - 1 : 0;
        eia $$12 = new eia($$2, $$3 + $$11, $$4, this);
        if ($$3 <= 3) {
            $$12.a((int)$$5[0], (int)$$5[1], (int)$$5[2], (int)$$5[3]);
        } else if ($$3 <= 7) {
            $$12.b($$5[0], $$5[1], $$5[2], $$5[3]);
        } else {
            $$12.a(Arrays.copyOfRange($$5, 0, $$4));
        }
        this.B.add($$12);
    }

    @Override
    public ehx c() {
        return this.K;
    }

    @Override
    public ehx d() {
        return this.L;
    }

    @Override
    public void e() {
        this.L.a(this);
        this.K.a(this);
    }

    public eio h() {
        return this.M;
    }

    public String i() {
        return this.F;
    }

    @Override
    public int a() {
        return this.E;
    }

    static {
        x = -1;
    }
}

