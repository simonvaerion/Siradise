/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 *  org.joml.Matrix4f
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fka
implements AutoCloseable {
    private static final String a = "minecraft:main";
    private final egv b;
    private final akx c;
    private final String d;
    private final List<fkb> e = Lists.newArrayList();
    private final Map<String, egv> f = Maps.newHashMap();
    private final List<egv> g = Lists.newArrayList();
    private Matrix4f h;
    private int i;
    private int j;
    private float k;
    private float l;

    public fka(fuw $$0, akx $$1, egv $$2, acq $$3) throws IOException, JsonSyntaxException {
        this.c = $$1;
        this.b = $$2;
        this.k = 0.0f;
        this.l = 0.0f;
        this.i = $$2.e;
        this.j = $$2.f;
        this.d = $$3.toString();
        this.b();
        this.a($$0, $$3);
    }

    private void a(fuw $$0, acq $$1) throws IOException, JsonSyntaxException {
        block15: {
            akv $$2 = this.c.getResourceOrThrow($$1);
            try (BufferedReader $$3 = $$2.e();){
                JsonObject $$4 = aor.a($$3);
                if (aor.d($$4, "targets")) {
                    JsonArray $$5 = $$4.getAsJsonArray("targets");
                    int $$6 = 0;
                    for (JsonElement $$7 : $$5) {
                        try {
                            this.a($$7);
                        }
                        catch (Exception $$8) {
                            act $$9 = act.a($$8);
                            $$9.a("targets[" + $$6 + "]");
                            throw $$9;
                        }
                        ++$$6;
                    }
                }
                if (!aor.d($$4, "passes")) break block15;
                JsonArray $$10 = $$4.getAsJsonArray("passes");
                int $$11 = 0;
                for (JsonElement $$12 : $$10) {
                    try {
                        this.a($$0, $$12);
                    }
                    catch (Exception $$13) {
                        act $$14 = act.a($$13);
                        $$14.a("passes[" + $$11 + "]");
                        throw $$14;
                    }
                    ++$$11;
                }
            }
            catch (Exception $$15) {
                act $$16 = act.a($$15);
                $$16.b($$1.a() + " (" + $$2.b() + ")");
                throw $$16;
            }
        }
    }

    private void a(JsonElement $$0) throws act {
        if (aor.a($$0)) {
            this.a($$0.getAsString(), this.i, this.j);
        } else {
            JsonObject $$1 = aor.m($$0, "target");
            String $$2 = aor.i($$1, "name");
            int $$3 = aor.a($$1, "width", this.i);
            int $$4 = aor.a($$1, "height", this.j);
            if (this.f.containsKey($$2)) {
                throw new act($$2 + " is already defined");
            }
            this.a($$2, $$3, $$4);
        }
    }

    private void a(fuw $$0, JsonElement $$1) throws IOException {
        JsonArray $$27;
        JsonObject $$2 = aor.m($$1, "pass");
        String $$3 = aor.i($$2, "name");
        String $$4 = aor.i($$2, "intarget");
        String $$5 = aor.i($$2, "outtarget");
        egv $$6 = this.b($$4);
        egv $$7 = this.b($$5);
        if ($$6 == null) {
            throw new act("Input target '" + $$4 + "' does not exist");
        }
        if ($$7 == null) {
            throw new act("Output target '" + $$5 + "' does not exist");
        }
        fkb $$8 = this.a($$3, $$6, $$7);
        JsonArray $$9 = aor.a($$2, "auxtargets", null);
        if ($$9 != null) {
            int $$10 = 0;
            for (JsonElement $$11 : $$9) {
                try {
                    String $$18;
                    boolean $$17;
                    JsonObject $$12 = aor.m($$11, "auxtarget");
                    String $$13 = aor.i($$12, "name");
                    String $$14 = aor.i($$12, "id");
                    if ($$14.endsWith(":depth")) {
                        boolean $$15 = true;
                        String $$16 = $$14.substring(0, $$14.lastIndexOf(58));
                    } else {
                        $$17 = false;
                        $$18 = $$14;
                    }
                    egv $$19 = this.b($$18);
                    if ($$19 == null) {
                        if ($$17) {
                            throw new act("Render target '" + $$18 + "' can't be used as depth buffer");
                        }
                        acq $$20 = new acq("textures/effect/" + $$18 + ".png");
                        this.c.getResource($$20).orElseThrow(() -> new act("Render target or texture '" + $$18 + "' does not exist"));
                        RenderSystem.setShaderTexture(0, $$20);
                        $$0.a($$20);
                        fug $$21 = $$0.b($$20);
                        int $$22 = aor.o($$12, "width");
                        int $$23 = aor.o($$12, "height");
                        boolean $$24 = aor.k($$12, "bilinear");
                        if ($$24) {
                            RenderSystem.texParameter(3553, 10241, 9729);
                            RenderSystem.texParameter(3553, 10240, 9729);
                        } else {
                            RenderSystem.texParameter(3553, 10241, 9728);
                            RenderSystem.texParameter(3553, 10240, 9728);
                        }
                        $$8.a($$13, $$21::a, $$22, $$23);
                    } else if ($$17) {
                        $$8.a($$13, $$19::g, $$19.c, $$19.d);
                    } else {
                        $$8.a($$13, $$19::f, $$19.c, $$19.d);
                    }
                }
                catch (Exception $$25) {
                    act $$26 = act.a($$25);
                    $$26.a("auxtargets[" + $$10 + "]");
                    throw $$26;
                }
                ++$$10;
            }
        }
        if (($$27 = aor.a($$2, "uniforms", null)) != null) {
            int $$28 = 0;
            for (JsonElement $$29 : $$27) {
                try {
                    this.b($$29);
                }
                catch (Exception $$30) {
                    act $$31 = act.a($$30);
                    $$31.a("uniforms[" + $$28 + "]");
                    throw $$31;
                }
                ++$$28;
            }
        }
    }

    private void b(JsonElement $$0) throws act {
        JsonObject $$1 = aor.m($$0, "uniform");
        String $$2 = aor.i($$1, "name");
        eia $$3 = this.e.get(this.e.size() - 1).b().a($$2);
        if ($$3 == null) {
            throw new act("Uniform '" + $$2 + "' does not exist");
        }
        float[] $$4 = new float[4];
        int $$5 = 0;
        JsonArray $$6 = aor.v($$1, "values");
        for (JsonElement $$7 : $$6) {
            try {
                $$4[$$5] = aor.e($$7, "value");
            }
            catch (Exception $$8) {
                act $$9 = act.a($$8);
                $$9.a("values[" + $$5 + "]");
                throw $$9;
            }
            ++$$5;
        }
        switch ($$5) {
            case 0: {
                break;
            }
            case 1: {
                $$3.a($$4[0]);
                break;
            }
            case 2: {
                $$3.a($$4[0], $$4[1]);
                break;
            }
            case 3: {
                $$3.a($$4[0], $$4[1], $$4[2]);
                break;
            }
            case 4: {
                $$3.a($$4[0], $$4[1], $$4[2], $$4[3]);
            }
        }
    }

    public egv a(String $$0) {
        return this.f.get($$0);
    }

    public void a(String $$0, int $$1, int $$2) {
        egw $$3 = new egw($$1, $$2, true, enn.a);
        $$3.a(0.0f, 0.0f, 0.0f, 0.0f);
        this.f.put($$0, $$3);
        if ($$1 == this.i && $$2 == this.j) {
            this.g.add($$3);
        }
    }

    @Override
    public void close() {
        for (egv $$0 : this.f.values()) {
            $$0.a();
        }
        for (fkb $$1 : this.e) {
            $$1.close();
        }
        this.e.clear();
    }

    public fkb a(String $$0, egv $$1, egv $$2) throws IOException {
        fkb $$3 = new fkb(this.c, $$0, $$1, $$2);
        this.e.add(this.e.size(), $$3);
        return $$3;
    }

    private void b() {
        this.h = new Matrix4f().setOrtho(0.0f, (float)this.b.c, 0.0f, (float)this.b.d, 0.1f, 1000.0f);
    }

    public void a(int $$0, int $$1) {
        this.i = this.b.c;
        this.j = this.b.d;
        this.b();
        for (fkb $$2 : this.e) {
            $$2.a(this.h);
        }
        for (egv $$3 : this.g) {
            $$3.a($$0, $$1, enn.a);
        }
    }

    public void a(float $$0) {
        if ($$0 < this.l) {
            this.k += 1.0f - this.l;
            this.k += $$0;
        } else {
            this.k += $$0 - this.l;
        }
        this.l = $$0;
        while (this.k > 20.0f) {
            this.k -= 20.0f;
        }
        for (fkb $$1 : this.e) {
            $$1.a(this.k / 20.0f);
        }
    }

    public final String a() {
        return this.d;
    }

    @Nullable
    private egv b(@Nullable String $$0) {
        if ($$0 == null) {
            return null;
        }
        if ($$0.equals(a)) {
            return this.b;
        }
        return this.f.get($$0);
    }
}

