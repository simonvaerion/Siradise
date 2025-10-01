/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ch {
    private static final Logger b = LogUtils.getLogger();
    public static final ch a = new ch(cj.c.e, cj.c.e, cj.c.e, null, null, null, null, ce.a, at.a, bv.a);
    private final cj.c c;
    private final cj.c d;
    private final cj.c e;
    @Nullable
    private final acp<cnk> f;
    @Nullable
    private final acp<dsa> g;
    @Nullable
    private final acp<cmm> h;
    @Nullable
    private final Boolean i;
    private final ce j;
    private final at k;
    private final bv l;

    public ch(cj.c $$0, cj.c $$1, cj.c $$2, @Nullable acp<cnk> $$3, @Nullable acp<dsa> $$4, @Nullable acp<cmm> $$5, @Nullable Boolean $$6, ce $$7, at $$8, bv $$9) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = $$5;
        this.i = $$6;
        this.j = $$7;
        this.k = $$8;
        this.l = $$9;
    }

    public static ch a(acp<cnk> $$0) {
        return new ch(cj.c.e, cj.c.e, cj.c.e, $$0, null, null, null, ce.a, at.a, bv.a);
    }

    public static ch b(acp<cmm> $$0) {
        return new ch(cj.c.e, cj.c.e, cj.c.e, null, null, $$0, null, ce.a, at.a, bv.a);
    }

    public static ch c(acp<dsa> $$0) {
        return new ch(cj.c.e, cj.c.e, cj.c.e, null, $$0, null, null, ce.a, at.a, bv.a);
    }

    public static ch a(cj.c $$0) {
        return new ch(cj.c.e, $$0, cj.c.e, null, null, null, null, ce.a, at.a, bv.a);
    }

    public boolean a(aif $$0, double $$1, double $$2, double $$3) {
        if (!this.c.d($$1)) {
            return false;
        }
        if (!this.d.d($$2)) {
            return false;
        }
        if (!this.e.d($$3)) {
            return false;
        }
        if (this.h != null && this.h != $$0.ac()) {
            return false;
        }
        gu $$4 = gu.a($$1, $$2, $$3);
        boolean $$5 = $$0.o($$4);
        if (!(this.f == null || $$5 && $$0.s($$4).a(this.f))) {
            return false;
        }
        if (!(this.g == null || $$5 && $$0.a().a($$4, this.g).b())) {
            return false;
        }
        if (!(this.i == null || $$5 && this.i == cqa.a($$0, $$4))) {
            return false;
        }
        if (!this.j.a($$0, $$4)) {
            return false;
        }
        if (!this.k.a($$0, $$4)) {
            return false;
        }
        return this.l.a($$0, $$4);
    }

    public JsonElement a() {
        if (this == a) {
            return JsonNull.INSTANCE;
        }
        JsonObject $$0 = new JsonObject();
        if (!(this.c.c() && this.d.c() && this.e.c())) {
            JsonObject $$12 = new JsonObject();
            $$12.add("x", this.c.d());
            $$12.add("y", this.d.d());
            $$12.add("z", this.e.d());
            $$0.add("position", (JsonElement)$$12);
        }
        if (this.h != null) {
            cmm.g.encodeStart((DynamicOps)JsonOps.INSTANCE, this.h).resultOrPartial(arg_0 -> ((Logger)b).error(arg_0)).ifPresent($$1 -> $$0.add("dimension", $$1));
        }
        if (this.g != null) {
            $$0.addProperty("structure", this.g.a().toString());
        }
        if (this.f != null) {
            $$0.addProperty("biome", this.f.a().toString());
        }
        if (this.i != null) {
            $$0.addProperty("smokey", this.i);
        }
        $$0.add("light", this.j.a());
        $$0.add("block", this.k.a());
        $$0.add("fluid", this.l.a());
        return $$0;
    }

    public static ch a(@Nullable JsonElement $$02) {
        acp $$6;
        if ($$02 == null || $$02.isJsonNull()) {
            return a;
        }
        JsonObject $$1 = aor.m($$02, "location");
        JsonObject $$2 = aor.a($$1, "position", new JsonObject());
        cj.c $$3 = cj.c.a($$2.get("x"));
        cj.c $$4 = cj.c.a($$2.get("y"));
        cj.c $$5 = cj.c.a($$2.get("z"));
        acp acp2 = $$1.has("dimension") ? (acp)acq.a.parse((DynamicOps)JsonOps.INSTANCE, (Object)$$1.get("dimension")).resultOrPartial(arg_0 -> ((Logger)b).error(arg_0)).map($$0 -> acp.a(jc.aH, $$0)).orElse(null) : ($$6 = null);
        acp $$7 = $$1.has("structure") ? (acp)acq.a.parse((DynamicOps)JsonOps.INSTANCE, (Object)$$1.get("structure")).resultOrPartial(arg_0 -> ((Logger)b).error(arg_0)).map($$0 -> acp.a(jc.az, $$0)).orElse(null) : null;
        acp<cnk> $$8 = null;
        if ($$1.has("biome")) {
            acq $$9 = new acq(aor.i($$1, "biome"));
            $$8 = acp.a(jc.ap, $$9);
        }
        Boolean $$10 = $$1.has("smokey") ? Boolean.valueOf($$1.get("smokey").getAsBoolean()) : null;
        ce $$11 = ce.a($$1.get("light"));
        at $$12 = at.a($$1.get("block"));
        bv $$13 = bv.a($$1.get("fluid"));
        return new ch($$3, $$4, $$5, $$8, $$7, $$6, $$10, $$11, $$12, $$13);
    }

    public static class a {
        private cj.c a = cj.c.e;
        private cj.c b = cj.c.e;
        private cj.c c = cj.c.e;
        @Nullable
        private acp<cnk> d;
        @Nullable
        private acp<dsa> e;
        @Nullable
        private acp<cmm> f;
        @Nullable
        private Boolean g;
        private ce h = ce.a;
        private at i = at.a;
        private bv j = bv.a;

        public static a a() {
            return new a();
        }

        public a a(cj.c $$0) {
            this.a = $$0;
            return this;
        }

        public a b(cj.c $$0) {
            this.b = $$0;
            return this;
        }

        public a c(cj.c $$0) {
            this.c = $$0;
            return this;
        }

        public a a(@Nullable acp<cnk> $$0) {
            this.d = $$0;
            return this;
        }

        public a b(@Nullable acp<dsa> $$0) {
            this.e = $$0;
            return this;
        }

        public a c(@Nullable acp<cmm> $$0) {
            this.f = $$0;
            return this;
        }

        public a a(ce $$0) {
            this.h = $$0;
            return this;
        }

        public a a(at $$0) {
            this.i = $$0;
            return this;
        }

        public a a(bv $$0) {
            this.j = $$0;
            return this;
        }

        public a a(Boolean $$0) {
            this.g = $$0;
            return this;
        }

        public ch b() {
            return new ch(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }
    }
}

