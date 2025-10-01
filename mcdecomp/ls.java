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
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ls
extends ln
implements lp {
    private final lq b;
    private final cfu c;
    private final int d;
    private final List<String> e = Lists.newArrayList();
    private final Map<Character, ciz> f = Maps.newLinkedHashMap();
    private final ae.a g = ae.a.b();
    @Nullable
    private String h;
    private boolean i = true;

    public ls(lq $$0, cml $$1, int $$2) {
        this.b = $$0;
        this.c = $$1.k();
        this.d = $$2;
    }

    public static ls a(lq $$0, cml $$1) {
        return ls.a($$0, $$1, 1);
    }

    public static ls a(lq $$0, cml $$1, int $$2) {
        return new ls($$0, $$1, $$2);
    }

    public ls a(Character $$0, anl<cfu> $$1) {
        return this.a($$0, ciz.a($$1));
    }

    public ls a(Character $$0, cml $$1) {
        return this.a($$0, ciz.a($$1));
    }

    public ls a(Character $$0, ciz $$1) {
        if (this.f.containsKey($$0)) {
            throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
        }
        if ($$0.charValue() == ' ') {
            throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
        }
        this.f.put($$0, $$1);
        return this;
    }

    public ls b(String $$0) {
        if (!this.e.isEmpty() && $$0.length() != this.e.get(0).length()) {
            throw new IllegalArgumentException("Pattern must be the same width on every line!");
        }
        this.e.add($$0);
        return this;
    }

    public ls b(String $$0, am $$1) {
        this.g.a($$0, $$1);
        return this;
    }

    public ls c(@Nullable String $$0) {
        this.h = $$0;
        return this;
    }

    public ls a(boolean $$0) {
        this.i = $$0;
        return this;
    }

    @Override
    public cfu a() {
        return this.c;
    }

    @Override
    public void a(Consumer<lo> $$0, acq $$1) {
        this.a($$1);
        this.g.a(a).a("has_the_recipe", cs.a($$1)).a(ah.a.c($$1)).a(ap.b);
        $$0.accept(new a($$1, this.c, this.d, this.h == null ? "" : this.h, ls.a(this.b), this.e, this.f, this.g, $$1.d("recipes/" + this.b.a() + "/"), this.i));
    }

    private void a(acq $$0) {
        if (this.e.isEmpty()) {
            throw new IllegalStateException("No pattern is defined for shaped recipe " + $$0 + "!");
        }
        HashSet $$1 = Sets.newHashSet(this.f.keySet());
        $$1.remove(Character.valueOf(' '));
        for (String $$2 : this.e) {
            for (int $$3 = 0; $$3 < $$2.length(); ++$$3) {
                char $$4 = $$2.charAt($$3);
                if (!this.f.containsKey(Character.valueOf($$4)) && $$4 != ' ') {
                    throw new IllegalStateException("Pattern in recipe " + $$0 + " uses undefined symbol '" + $$4 + "'");
                }
                $$1.remove(Character.valueOf($$4));
            }
        }
        if (!$$1.isEmpty()) {
            throw new IllegalStateException("Ingredients are defined but not used in pattern for recipe " + $$0);
        }
        if (this.e.size() == 1 && this.e.get(0).length() == 1) {
            throw new IllegalStateException("Shaped recipe " + $$0 + " only takes in a single item - should it be a shapeless recipe instead?");
        }
        if (this.g.d().isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + $$0);
        }
    }

    @Override
    public /* synthetic */ lp a(@Nullable String string) {
        return this.c(string);
    }

    @Override
    public /* synthetic */ lp a(String string, am am2) {
        return this.b(string, am2);
    }

    static class a
    extends ln.a {
        private final acq a;
        private final cfu b;
        private final int c;
        private final String d;
        private final List<String> e;
        private final Map<Character, ciz> f;
        private final ae.a g;
        private final acq h;
        private final boolean i;

        public a(acq $$0, cfu $$1, int $$2, String $$3, cis $$4, List<String> $$5, Map<Character, ciz> $$6, ae.a $$7, acq $$8, boolean $$9) {
            super($$4);
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$5;
            this.f = $$6;
            this.g = $$7;
            this.h = $$8;
            this.i = $$9;
        }

        @Override
        public void a(JsonObject $$0) {
            super.a($$0);
            if (!this.d.isEmpty()) {
                $$0.addProperty("group", this.d);
            }
            JsonArray $$1 = new JsonArray();
            for (String string : this.e) {
                $$1.add(string);
            }
            $$0.add("pattern", (JsonElement)$$1);
            JsonObject $$3 = new JsonObject();
            for (Map.Entry<Character, ciz> entry : this.f.entrySet()) {
                $$3.add(String.valueOf(entry.getKey()), entry.getValue().c());
            }
            $$0.add("key", (JsonElement)$$3);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("item", jb.i.b(this.b).toString());
            if (this.c > 1) {
                jsonObject.addProperty("count", (Number)this.c);
            }
            $$0.add("result", (JsonElement)jsonObject);
            $$0.addProperty("show_notification", Boolean.valueOf(this.i));
        }

        @Override
        public cje<?> c() {
            return cje.a;
        }

        @Override
        public acq b() {
            return this.a;
        }

        @Override
        @Nullable
        public JsonObject d() {
            return this.g.c();
        }

        @Override
        @Nullable
        public acq e() {
            return this.h;
        }
    }
}

