/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fle
implements fxc {
    private final List<flf> a;

    public fle(List<flf> $$0) {
        this.a = $$0;
    }

    public List<flf> a() {
        return this.a;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof fle) {
            fle $$1 = (fle)$$0;
            return this.a.equals($$1.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public Collection<acq> f() {
        return this.a().stream().map(flf::a).collect(Collectors.toSet());
    }

    @Override
    public void a(Function<acq, fxc> $$0) {
        this.a().stream().map(flf::a).distinct().forEach($$1 -> ((fxc)$$0.apply((acq)$$1)).a($$0));
    }

    @Override
    @Nullable
    public fwr a(fwv $$0, Function<fwu, fuv> $$1, fwz $$2, acq $$3) {
        if (this.a().isEmpty()) {
            return null;
        }
        fxd.a $$4 = new fxd.a();
        for (flf $$5 : this.a()) {
            fwr $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
        }
        return $$4.a();
    }

    public static class a
    implements JsonDeserializer<fle> {
        public fle a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            ArrayList $$3 = Lists.newArrayList();
            if ($$0.isJsonArray()) {
                JsonArray $$4 = $$0.getAsJsonArray();
                if ($$4.size() == 0) {
                    throw new JsonParseException("Empty variant array");
                }
                for (JsonElement $$5 : $$4) {
                    $$3.add((flf)$$2.deserialize($$5, flf.class));
                }
            } else {
                $$3.add((flf)$$2.deserialize($$0, flf.class));
            }
            return new fle($$3);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}

