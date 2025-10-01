/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.Validate
 */
import com.google.common.collect.ImmutableList;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class fwf
implements ajx<fwe> {
    public fwe b(JsonObject $$0) {
        ImmutableList.Builder $$1 = ImmutableList.builder();
        int $$2 = aor.a($$0, "frametime", 1);
        if ($$2 != 1) {
            Validate.inclusiveBetween((long)1L, (long)Integer.MAX_VALUE, (long)$$2, (String)"Invalid default frame time");
        }
        if ($$0.has("frames")) {
            try {
                JsonArray $$3 = aor.v($$0, "frames");
                for (int $$4 = 0; $$4 < $$3.size(); ++$$4) {
                    JsonElement $$5 = $$3.get($$4);
                    fwd $$6 = this.a($$4, $$5);
                    if ($$6 == null) continue;
                    $$1.add((Object)$$6);
                }
            }
            catch (ClassCastException $$7) {
                throw new JsonParseException("Invalid animation->frames: expected array, was " + $$0.get("frames"), (Throwable)$$7);
            }
        }
        int $$8 = aor.a($$0, "width", -1);
        int $$9 = aor.a($$0, "height", -1);
        if ($$8 != -1) {
            Validate.inclusiveBetween((long)1L, (long)Integer.MAX_VALUE, (long)$$8, (String)"Invalid width");
        }
        if ($$9 != -1) {
            Validate.inclusiveBetween((long)1L, (long)Integer.MAX_VALUE, (long)$$9, (String)"Invalid height");
        }
        boolean $$10 = aor.a($$0, "interpolate", false);
        return new fwe((List<fwd>)$$1.build(), $$8, $$9, $$2, $$10);
    }

    @Nullable
    private fwd a(int $$0, JsonElement $$1) {
        if ($$1.isJsonPrimitive()) {
            return new fwd(aor.g($$1, "frames[" + $$0 + "]"));
        }
        if ($$1.isJsonObject()) {
            JsonObject $$2 = aor.m($$1, "frames[" + $$0 + "]");
            int $$3 = aor.a($$2, "time", -1);
            if ($$2.has("time")) {
                Validate.inclusiveBetween((long)1L, (long)Integer.MAX_VALUE, (long)$$3, (String)"Invalid frame time");
            }
            int $$4 = aor.o($$2, "index");
            Validate.inclusiveBetween((long)0L, (long)Integer.MAX_VALUE, (long)$$4, (String)"Invalid frame index");
            return new fwd($$4, $$3);
        }
        return null;
    }

    @Override
    public String a() {
        return "animation";
    }

    @Override
    public /* synthetic */ Object a(JsonObject jsonObject) {
        return this.b(jsonObject);
    }
}

