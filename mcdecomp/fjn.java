/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
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
import java.io.InvalidClassException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.IntSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjn
implements ehu,
AutoCloseable {
    private static final String a = "shaders/program/";
    private static final Logger b = LogUtils.getLogger();
    private static final ehs c = new ehs();
    private static final boolean d = true;
    private static fjn e;
    private static int f;
    private final Map<String, IntSupplier> g = Maps.newHashMap();
    private final List<String> h = Lists.newArrayList();
    private final List<Integer> i = Lists.newArrayList();
    private final List<eia> j = Lists.newArrayList();
    private final List<Integer> k = Lists.newArrayList();
    private final Map<String, eia> l = Maps.newHashMap();
    private final int m;
    private final String n;
    private boolean o;
    private final eht p;
    private final List<Integer> q;
    private final List<String> r;
    private final ehv s;
    private final ehv t;

    public fjn(akx $$0, String $$1) throws IOException {
        acq $$2 = new acq(a + $$1 + ".json");
        this.n = $$1;
        akv $$3 = $$0.getResourceOrThrow($$2);
        try (BufferedReader $$4 = $$3.e();){
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
                this.q = Lists.newArrayListWithCapacity((int)$$13.size());
                this.r = Lists.newArrayListWithCapacity((int)$$13.size());
                for (Iterator $$15 : $$13) {
                    try {
                        this.r.add(aor.a((JsonElement)$$15, "attribute"));
                    }
                    catch (Exception $$16) {
                        act $$17 = act.a($$16);
                        $$17.a("attributes[" + $$14 + "]");
                        throw $$17;
                    }
                    ++$$14;
                }
            } else {
                this.q = null;
                this.r = null;
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
            this.p = fjn.a(aor.a($$5, "blend", null));
            this.s = fjn.a($$0, ehx.a.a, $$6);
            this.t = fjn.a($$0, ehx.a.b, $$7);
            this.m = ehy.a();
            ehy.b(this);
            this.i();
            if (this.r != null) {
                for (String $$23 : this.r) {
                    int $$24 = eia.b(this.m, $$23);
                    this.q.add($$24);
                }
            }
        }
        catch (Exception $$25) {
            act $$26 = act.a($$25);
            $$26.b($$2.a() + " (" + $$3.b() + ")");
            throw $$26;
        }
        this.b();
    }

    public static ehv a(akx $$0, ehx.a $$1, String $$2) throws IOException {
        ehv $$9;
        ehx $$3 = $$1.c().get($$2);
        if ($$3 != null && !($$3 instanceof ehv)) {
            throw new InvalidClassException("Program is not of type EffectProgram");
        }
        if ($$3 == null) {
            acq $$4 = new acq(a + $$2 + $$1.b());
            akv $$5 = $$0.getResourceOrThrow($$4);
            try (InputStream $$6 = $$5.d();){
                ehv $$7 = ehv.a($$1, $$2, $$6, $$5.b());
            }
        } else {
            $$9 = (ehv)$$3;
        }
        return $$9;
    }

    public static eht a(@Nullable JsonObject $$0) {
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
        for (eia $$0 : this.j) {
            $$0.close();
        }
        ehy.a(this);
    }

    public void f() {
        RenderSystem.assertOnRenderThread();
        ehy.a(0);
        f = -1;
        e = null;
        for (int $$0 = 0; $$0 < this.i.size(); ++$$0) {
            if (this.g.get(this.h.get($$0)) == null) continue;
            GlStateManager._activeTexture(33984 + $$0);
            GlStateManager._bindTexture(0);
        }
    }

    public void g() {
        RenderSystem.assertOnGameThread();
        this.o = false;
        e = this;
        this.p.a();
        if (this.m != f) {
            ehy.a(this.m);
            f = this.m;
        }
        for (int $$0 = 0; $$0 < this.i.size(); ++$$0) {
            String $$1 = this.h.get($$0);
            IntSupplier $$2 = this.g.get($$1);
            if ($$2 == null) continue;
            RenderSystem.activeTexture(33984 + $$0);
            int $$3 = $$2.getAsInt();
            if ($$3 == -1) continue;
            RenderSystem.bindTexture($$3);
            eia.b((int)this.i.get($$0), $$0);
        }
        for (eia $$4 : this.j) {
            $$4.b();
        }
    }

    @Override
    public void b() {
        this.o = true;
    }

    @Nullable
    public eia a(String $$0) {
        RenderSystem.assertOnRenderThread();
        return this.l.get($$0);
    }

    public ehs b(String $$0) {
        RenderSystem.assertOnGameThread();
        eia $$1 = this.a($$0);
        return $$1 == null ? c : $$1;
    }

    private void i() {
        RenderSystem.assertOnRenderThread();
        IntArrayList $$0 = new IntArrayList();
        for (int $$1 = 0; $$1 < this.h.size(); ++$$1) {
            String $$2 = this.h.get($$1);
            int $$3 = eia.a(this.m, $$2);
            if ($$3 == -1) {
                b.warn("Shader {} could not find sampler named {} in the specified shader program.", (Object)this.n, (Object)$$2);
                this.g.remove($$2);
                $$0.add($$1);
                continue;
            }
            this.i.add($$3);
        }
        for (int $$4 = $$0.size() - 1; $$4 >= 0; --$$4) {
            this.h.remove($$0.getInt($$4));
        }
        for (eia $$5 : this.j) {
            String $$6 = $$5.a();
            int $$7 = eia.a(this.m, $$6);
            if ($$7 == -1) {
                b.warn("Shader {} could not find uniform named {} in the specified shader program.", (Object)this.n, (Object)$$6);
                continue;
            }
            this.k.add($$7);
            $$5.b($$7);
            this.l.put($$6, $$5);
        }
    }

    private void a(JsonElement $$0) {
        JsonObject $$1 = aor.m($$0, "sampler");
        String $$2 = aor.i($$1, "name");
        if (!aor.a($$1, "file")) {
            this.g.put($$2, null);
            this.h.add($$2);
            return;
        }
        this.h.add($$2);
    }

    public void a(String $$0, IntSupplier $$1) {
        if (this.g.containsKey($$0)) {
            this.g.remove($$0);
        }
        this.g.put($$0, $$1);
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
            $$12.a($$5);
        }
        this.j.add($$12);
    }

    @Override
    public ehx c() {
        return this.s;
    }

    @Override
    public ehx d() {
        return this.t;
    }

    @Override
    public void e() {
        this.t.a(this);
        this.s.a(this);
    }

    public String h() {
        return this.n;
    }

    @Override
    public int a() {
        return this.m;
    }

    static {
        f = -1;
    }
}

