/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fkw
implements fxc {
    private static final Logger g = LogUtils.getLogger();
    private static final fky h = new fky();
    @VisibleForTesting
    static final Gson a = new GsonBuilder().registerTypeAdapter(fkw.class, (Object)new a()).registerTypeAdapter(fks.class, (Object)new fks.a()).registerTypeAdapter(fkt.class, (Object)new fkt.a()).registerTypeAdapter(fkv.class, (Object)new fkv.a()).registerTypeAdapter(flc.class, (Object)new flc.a()).registerTypeAdapter(fld.class, (Object)new fld.a()).registerTypeAdapter(fla.class, (Object)new fla.a()).create();
    private static final char i = '#';
    public static final String b = "particle";
    private static final boolean j = true;
    private final List<fks> k;
    @Nullable
    private final b l;
    @Nullable
    private final Boolean m;
    private final fld n;
    private final List<fla> o;
    public String c = "";
    @VisibleForTesting
    protected final Map<String, Either<fwu, String>> d;
    @Nullable
    protected fkw e;
    @Nullable
    protected acq f;

    public static fkw a(Reader $$0) {
        return aor.a(a, $$0, fkw.class);
    }

    public static fkw a(String $$0) {
        return fkw.a(new StringReader($$0));
    }

    public fkw(@Nullable acq $$0, List<fks> $$1, Map<String, Either<fwu, String>> $$2, @Nullable Boolean $$3, @Nullable b $$4, fld $$5, List<fla> $$6) {
        this.k = $$1;
        this.m = $$3;
        this.l = $$4;
        this.d = $$2;
        this.f = $$0;
        this.n = $$5;
        this.o = $$6;
    }

    public List<fks> a() {
        if (this.k.isEmpty() && this.e != null) {
            return this.e.a();
        }
        return this.k;
    }

    public boolean b() {
        if (this.m != null) {
            return this.m;
        }
        if (this.e != null) {
            return this.e.b();
        }
        return true;
    }

    public b c() {
        if (this.l != null) {
            return this.l;
        }
        if (this.e != null) {
            return this.e.c();
        }
        return fkw$b.b;
    }

    public boolean d() {
        return this.f == null || this.e != null && this.e.d();
    }

    public List<fla> e() {
        return this.o;
    }

    private flb a(fwv $$0, fkw $$1) {
        if (this.o.isEmpty()) {
            return flb.a;
        }
        return new flb($$0, $$1, this.o);
    }

    @Override
    public Collection<acq> f() {
        HashSet $$0 = Sets.newHashSet();
        for (fla $$1 : this.o) {
            $$0.add($$1.a());
        }
        if (this.f != null) {
            $$0.add(this.f);
        }
        return $$0;
    }

    @Override
    public void a(Function<acq, fxc> $$0) {
        LinkedHashSet $$12 = Sets.newLinkedHashSet();
        fkw $$2 = this;
        while ($$2.f != null && $$2.e == null) {
            $$12.add($$2);
            fxc $$3 = $$0.apply($$2.f);
            if ($$3 == null) {
                g.warn("No parent '{}' while loading model '{}'", (Object)this.f, (Object)$$2);
            }
            if ($$12.contains($$3)) {
                g.warn("Found 'parent' loop while loading model '{}' in chain: {} -> {}", new Object[]{$$2, $$12.stream().map(Object::toString).collect(Collectors.joining(" -> ")), this.f});
                $$3 = null;
            }
            if ($$3 == null) {
                $$2.f = fww.n;
                $$3 = $$0.apply($$2.f);
            }
            if (!($$3 instanceof fkw)) {
                throw new IllegalStateException("BlockModel parent has to be a block model.");
            }
            $$2.e = (fkw)$$3;
            $$2 = $$2.e;
        }
        this.o.forEach($$1 -> {
            fxc $$2 = (fxc)$$0.apply($$1.a());
            if (Objects.equals($$2, this)) {
                return;
            }
            $$2.a($$0);
        });
    }

    @Override
    public fwr a(fwv $$0, Function<fwu, fuv> $$1, fwz $$2, acq $$3) {
        return this.a($$0, this, $$1, $$2, $$3, true);
    }

    public fwr a(fwv $$0, fkw $$1, Function<fwu, fuv> $$2, fwz $$3, acq $$4, boolean $$5) {
        fuv $$6 = $$2.apply(this.c(b));
        if (this.g() == fww.s) {
            return new fwt(this.h(), this.a($$0, $$1), $$6, this.c().a());
        }
        fxb.a $$7 = new fxb.a(this, this.a($$0, $$1), $$5).a($$6);
        for (fks $$8 : this.a()) {
            for (ha $$9 : $$8.c.keySet()) {
                fkt $$10 = $$8.c.get($$9);
                fuv $$11 = $$2.apply(this.c($$10.d));
                if ($$10.b == null) {
                    $$7.a(fkw.a($$8, $$10, $$11, $$9, $$3, $$4));
                    continue;
                }
                $$7.a(ha.a($$3.b().c(), $$10.b), fkw.a($$8, $$10, $$11, $$9, $$3, $$4));
            }
        }
        return $$7.b();
    }

    private static fkr a(fks $$0, fkt $$1, fuv $$2, ha $$3, fwz $$4, acq $$5) {
        return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
    }

    public boolean b(String $$0) {
        return !ful.b().equals(this.c($$0).b());
    }

    public fwu c(String $$0) {
        if (fkw.e($$0)) {
            $$0 = $$0.substring(1);
        }
        ArrayList $$1 = Lists.newArrayList();
        Either<fwu, String> $$2;
        Optional $$3;
        while (!($$3 = ($$2 = this.d($$0)).left()).isPresent()) {
            $$0 = (String)$$2.right().get();
            if ($$1.contains($$0)) {
                g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on((String)"->").join((Iterable)$$1), $$0, this.c});
                return new fwu(fuu.e, ful.b());
            }
            $$1.add($$0);
        }
        return (fwu)$$3.get();
    }

    private Either<fwu, String> d(String $$0) {
        fkw $$1 = this;
        while ($$1 != null) {
            Either<fwu, String> $$2 = $$1.d.get($$0);
            if ($$2 != null) {
                return $$2;
            }
            $$1 = $$1.e;
        }
        return Either.left((Object)new fwu(fuu.e, ful.b()));
    }

    static boolean e(String $$0) {
        return $$0.charAt(0) == '#';
    }

    public fkw g() {
        return this.e == null ? this : this.e.g();
    }

    public fld h() {
        flc $$0 = this.a(cfw.b);
        flc $$1 = this.a(cfw.c);
        flc $$2 = this.a(cfw.d);
        flc $$3 = this.a(cfw.e);
        flc $$4 = this.a(cfw.f);
        flc $$5 = this.a(cfw.g);
        flc $$6 = this.a(cfw.h);
        flc $$7 = this.a(cfw.i);
        return new fld($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    private flc a(cfw $$0) {
        if (this.e != null && !this.n.b($$0)) {
            return this.e.a($$0);
        }
        return this.n.a($$0);
    }

    public String toString() {
        return this.c;
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b("front");
        public static final /* enum */ b b = new b("side");
        private final String c;
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0) {
            this.c = $$0;
        }

        public static b a(String $$0) {
            for (b $$1 : fkw$b.values()) {
                if (!$$1.c.equals($$0)) continue;
                return $$1;
            }
            throw new IllegalArgumentException("Invalid gui light: " + $$0);
        }

        public boolean a() {
            return this == b;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b};
        }

        static {
            d = fkw$b.b();
        }
    }

    public static class a
    implements JsonDeserializer<fkw> {
        public fkw a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            JsonObject $$3 = $$0.getAsJsonObject();
            List<fks> $$4 = this.b($$2, $$3);
            String $$5 = this.c($$3);
            Map<String, Either<fwu, String>> $$6 = this.b($$3);
            Boolean $$7 = this.a($$3);
            fld $$8 = fld.a;
            if ($$3.has("display")) {
                JsonObject $$9 = aor.u($$3, "display");
                $$8 = (fld)$$2.deserialize((JsonElement)$$9, fld.class);
            }
            List<fla> $$10 = this.a($$2, $$3);
            b $$11 = null;
            if ($$3.has("gui_light")) {
                $$11 = fkw$b.a(aor.i($$3, "gui_light"));
            }
            acq $$12 = $$5.isEmpty() ? null : new acq($$5);
            return new fkw($$12, $$4, $$6, $$7, $$11, $$8, $$10);
        }

        protected List<fla> a(JsonDeserializationContext $$0, JsonObject $$1) {
            ArrayList $$2 = Lists.newArrayList();
            if ($$1.has("overrides")) {
                JsonArray $$3 = aor.v($$1, "overrides");
                for (JsonElement $$4 : $$3) {
                    $$2.add((fla)$$0.deserialize($$4, fla.class));
                }
            }
            return $$2;
        }

        private Map<String, Either<fwu, String>> b(JsonObject $$0) {
            acq $$1 = fuu.e;
            HashMap $$2 = Maps.newHashMap();
            if ($$0.has("textures")) {
                JsonObject $$3 = aor.u($$0, "textures");
                for (Map.Entry $$4 : $$3.entrySet()) {
                    $$2.put((String)$$4.getKey(), fkw$a.a($$1, ((JsonElement)$$4.getValue()).getAsString()));
                }
            }
            return $$2;
        }

        private static Either<fwu, String> a(acq $$0, String $$1) {
            if (fkw.e($$1)) {
                return Either.right((Object)$$1.substring(1));
            }
            acq $$2 = acq.a($$1);
            if ($$2 == null) {
                throw new JsonParseException($$1 + " is not valid resource location");
            }
            return Either.left((Object)new fwu($$0, $$2));
        }

        private String c(JsonObject $$0) {
            return aor.a($$0, "parent", "");
        }

        @Nullable
        protected Boolean a(JsonObject $$0) {
            if ($$0.has("ambientocclusion")) {
                return aor.k($$0, "ambientocclusion");
            }
            return null;
        }

        protected List<fks> b(JsonDeserializationContext $$0, JsonObject $$1) {
            ArrayList $$2 = Lists.newArrayList();
            if ($$1.has("elements")) {
                for (JsonElement $$3 : aor.v($$1, "elements")) {
                    $$2.add((fks)$$0.deserialize($$3, fks.class));
                }
            }
            return $$2;
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }

    public static class c
    extends RuntimeException {
        public c(String $$0) {
            super($$0);
        }
    }
}

