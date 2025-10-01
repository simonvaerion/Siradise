/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Streams
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonObject
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fhn {
    private final List<acq> a;

    private fhn(List<acq> $$0) {
        this.a = $$0;
    }

    public List<acq> a() {
        return this.a;
    }

    public static fhn a(JsonObject $$02) {
        JsonArray $$1 = aor.a($$02, "textures", null);
        if ($$1 == null) {
            return new fhn(List.of());
        }
        List $$2 = (List)Streams.stream((Iterable)$$1).map($$0 -> aor.a($$0, "texture")).map(acq::new).collect(ImmutableList.toImmutableList());
        return new fhn($$2);
    }
}

