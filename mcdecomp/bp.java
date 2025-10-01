/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.ImmutableBiMap
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bp {
    public static final bp a = new bp(){

        @Override
        public boolean a(bfj $$0, aif $$1, @Nullable eei $$2) {
            return true;
        }

        @Override
        public JsonObject a() {
            return new JsonObject();
        }

        @Override
        public a c() {
            return b.a;
        }
    };

    public static bp a(@Nullable JsonElement $$0) {
        if ($$0 == null || $$0.isJsonNull()) {
            return a;
        }
        JsonObject $$1 = aor.m($$0, "type_specific");
        String $$2 = aor.a($$1, "type", null);
        if ($$2 == null) {
            return a;
        }
        a $$3 = (a)b.s.get((Object)$$2);
        if ($$3 == null) {
            throw new JsonSyntaxException("Unknown sub-predicate type: " + $$2);
        }
        return $$3.deserialize($$1);
    }

    public boolean a(bfj var1, aif var2, @Nullable eei var3);

    public JsonObject a();

    default public JsonElement b() {
        if (this.c() == b.a) {
            return JsonNull.INSTANCE;
        }
        JsonObject $$0 = this.a();
        String $$1 = (String)b.s.inverse().get((Object)this.c());
        $$0.addProperty("type", $$1);
        return $$0;
    }

    public a c();

    public static bp a(brp $$0) {
        return b.f.a($$0);
    }

    public static bp a(brw $$0) {
        return b.g.a($$0);
    }

    public static final class b {
        public static final a a = $$0 -> a;
        public static final a b = cf::a;
        public static final a c = bt::a;
        public static final a d = cp::a;
        public static final a e = cx::a;
        public static final br<brp> f = br.a(jb.aj, $$0 -> {
            Optional<Object> optional;
            if ($$0 instanceof bro) {
                bro $$1 = (bro)$$0;
                optional = Optional.of($$1.gf());
            } else {
                optional = Optional.empty();
            }
            return optional;
        });
        public static final br<brw> g = br.a(jb.ak, $$0 -> {
            Optional<Object> optional;
            if ($$0 instanceof bta) {
                bta $$1 = (bta)$$0;
                optional = Optional.of($$1.w());
            } else {
                optional = Optional.empty();
            }
            return optional;
        });
        public static final br<bss.d> h = br.a(bss.d.f, $$0 -> {
            Optional<Object> optional;
            if ($$0 instanceof bss) {
                bss $$1 = (bss)$$0;
                optional = Optional.of($$1.fY());
            } else {
                optional = Optional.empty();
            }
            return optional;
        });
        public static final br<cah.b> i = br.a(cah.b.j, $$0 -> {
            Optional<Object> optional;
            if ($$0 instanceof cah) {
                cah $$1 = (cah)$$0;
                optional = Optional.of($$1.v());
            } else {
                optional = Optional.empty();
            }
            return optional;
        });
        public static final br<brv.v> j = br.a(brv.v.c, $$0 -> {
            Optional<Object> optional;
            if ($$0 instanceof brv) {
                brv $$1 = (brv)$$0;
                optional = Optional.of($$1.r());
            } else {
                optional = Optional.empty();
            }
            return optional;
        });
        public static final br<bry.a> k = br.a(bry.a.c, $$0 -> {
            Optional<Object> optional;
            if ($$0 instanceof bry) {
                bry $$1 = (bry)$$0;
                optional = Optional.of($$1.r());
            } else {
                optional = Optional.empty();
            }
            return optional;
        });
        public static final br<he<bvd>> l = br.a(jb.m.r(), $$0 -> {
            Optional<Object> optional;
            if ($$0 instanceof bvc) {
                bvc $$1 = (bvc)$$0;
                optional = Optional.of($$1.j());
            } else {
                optional = Optional.empty();
            }
            return optional;
        });
        public static final br<bsf.h> m = br.a(bsf.h.h, $$0 -> {
            Optional<Object> optional;
            if ($$0 instanceof bsf) {
                bsf $$1 = (bsf)$$0;
                optional = Optional.of($$1.fY());
            } else {
                optional = Optional.empty();
            }
            return optional;
        });
        public static final br<btt> n = br.a(btt.h, $$0 -> {
            Optional<Object> optional;
            if ($$0 instanceof btm) {
                btm $$1 = (btm)$$0;
                optional = Optional.of($$1.r());
            } else {
                optional = Optional.empty();
            }
            return optional;
        });
        public static final br<btn.d> o = br.a(btn.d.e, $$0 -> {
            Optional<Object> optional;
            if ($$0 instanceof btn) {
                btn $$1 = (btn)$$0;
                optional = Optional.of($$1.gk());
            } else {
                optional = Optional.empty();
            }
            return optional;
        });
        public static final br<byg> p = br.a(jb.z.q(), $$0 -> {
            Optional<Object> optional;
            if ($$0 instanceof byd) {
                byd $$1 = (byd)((Object)$$0);
                optional = Optional.of($$1.a());
            } else {
                optional = Optional.empty();
            }
            return optional;
        });
        public static final br<bsb.b> q = br.a(bsb.b.f, $$0 -> {
            Optional<Object> optional;
            if ($$0 instanceof bsb) {
                bsb $$1 = (bsb)$$0;
                optional = Optional.of($$1.gg());
            } else {
                optional = Optional.empty();
            }
            return optional;
        });
        public static final br<bsl.b> r = br.a(bsl.b.m, $$0 -> {
            Optional<Object> optional;
            if ($$0 instanceof bsl) {
                bsl $$1 = (bsl)$$0;
                optional = Optional.of($$1.gj());
            } else {
                optional = Optional.empty();
            }
            return optional;
        });
        public static final BiMap<String, a> s = ImmutableBiMap.builder().put((Object)"any", (Object)a).put((Object)"lightning", (Object)b).put((Object)"fishing_hook", (Object)c).put((Object)"player", (Object)d).put((Object)"slime", (Object)e).put((Object)"cat", (Object)f.a()).put((Object)"frog", (Object)g.a()).put((Object)"axolotl", (Object)h.a()).put((Object)"boat", (Object)i.a()).put((Object)"fox", (Object)j.a()).put((Object)"mooshroom", (Object)k.a()).put((Object)"painting", (Object)l.a()).put((Object)"rabbit", (Object)m.a()).put((Object)"horse", (Object)n.a()).put((Object)"llama", (Object)o.a()).put((Object)"villager", (Object)p.a()).put((Object)"parrot", (Object)q.a()).put((Object)"tropical_fish", (Object)r.a()).buildOrThrow();
    }

    public static interface a {
        public bp deserialize(JsonObject var1);
    }
}

