/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class kv
implements kt {
    private final cpn a;
    private final List<b> b = Lists.newArrayList();

    private kv(cpn $$0) {
        this.a = $$0;
    }

    @Override
    public cpn a() {
        return this.a;
    }

    public static kv a(cpn $$0) {
        return new kv($$0);
    }

    public kv a(List<kz> $$0) {
        this.b.add(new b($$0));
        return this;
    }

    public kv a(kz $$0) {
        return this.a((List<kz>)ImmutableList.of((Object)$$0));
    }

    public kv a(ku $$0, List<kz> $$1) {
        this.b.add(new a($$0, $$1));
        return this;
    }

    public kv a(ku $$0, kz ... $$1) {
        return this.a($$0, (List<kz>)ImmutableList.copyOf((Object[])$$1));
    }

    public kv a(ku $$0, kz $$1) {
        return this.a($$0, (List<kz>)ImmutableList.of((Object)$$1));
    }

    public JsonElement b() {
        dcc<cpn, dcb> $$0 = this.a.l();
        this.b.forEach($$1 -> $$1.a($$0));
        JsonArray $$12 = new JsonArray();
        this.b.stream().map(b::a).forEach(arg_0 -> ((JsonArray)$$12).add(arg_0));
        JsonObject $$2 = new JsonObject();
        $$2.add("multipart", (JsonElement)$$12);
        return $$2;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.b();
    }

    static class b
    implements Supplier<JsonElement> {
        private final List<kz> a;

        b(List<kz> $$0) {
            this.a = $$0;
        }

        public void a(dcc<?, ?> $$0) {
        }

        public void a(JsonObject $$0) {
        }

        public JsonElement a() {
            JsonObject $$0 = new JsonObject();
            this.a($$0);
            $$0.add("apply", kz.a(this.a));
            return $$0;
        }

        @Override
        public /* synthetic */ Object get() {
            return this.a();
        }
    }

    static class a
    extends b {
        private final ku a;

        a(ku $$0, List<kz> $$1) {
            super($$1);
            this.a = $$0;
        }

        @Override
        public void a(dcc<?, ?> $$0) {
            this.a.a($$0);
        }

        @Override
        public void a(JsonObject $$0) {
            $$0.add("when", (JsonElement)this.a.get());
        }
    }
}

