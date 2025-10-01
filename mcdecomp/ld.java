/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Supplier;

public class ld
implements Supplier<JsonElement> {
    private final acq a;

    public ld(acq $$0) {
        this.a = $$0;
    }

    public JsonElement a() {
        JsonObject $$0 = new JsonObject();
        $$0.addProperty("parent", this.a.toString());
        return $$0;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.a();
    }
}

