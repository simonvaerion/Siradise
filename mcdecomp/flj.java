/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class flj
implements fxc {
    private final dcc<cpn, dcb> a;
    private final List<fll> b;

    public flj(dcc<cpn, dcb> $$0, List<fll> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public List<fll> a() {
        return this.b;
    }

    public Set<fle> b() {
        HashSet $$0 = Sets.newHashSet();
        for (fll $$1 : this.b) {
            $$0.add($$1.a());
        }
        return $$0;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof flj) {
            flj $$1 = (flj)$$0;
            return Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override
    public Collection<acq> f() {
        return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
    }

    @Override
    public void a(Function<acq, fxc> $$0) {
        this.a().forEach($$1 -> $$1.a().a($$0));
    }

    @Override
    @Nullable
    public fwr a(fwv $$0, Function<fwu, fuv> $$1, fwz $$2, acq $$3) {
        fxa.a $$4 = new fxa.a();
        for (fll $$5 : this.a()) {
            fwr $$6 = $$5.a().a($$0, $$1, $$2, $$3);
            if ($$6 == null) continue;
            $$4.a($$5.a(this.a), $$6);
        }
        return $$4.a();
    }

    public static class a
    implements JsonDeserializer<flj> {
        private final fkx.a a;

        public a(fkx.a $$0) {
            this.a = $$0;
        }

        public flj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            return new flj(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
        }

        private List<fll> a(JsonDeserializationContext $$0, JsonArray $$1) {
            ArrayList $$2 = Lists.newArrayList();
            for (JsonElement $$3 : $$1) {
                $$2.add((fll)$$0.deserialize($$3, fll.class));
            }
            return $$2;
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}

