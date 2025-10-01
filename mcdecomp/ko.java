/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ko
implements ji {
    private final jk d;
    private final Map<String, Supplier<JsonElement>> e = new HashMap<String, Supplier<JsonElement>>();

    public ko(jk $$0) {
        this.d = $$0;
    }

    public <T> ko a(ajy<T> $$0, T $$1) {
        this.e.put($$0.a(), () -> $$0.a($$1));
        return this;
    }

    @Override
    public CompletableFuture<?> a(jg $$0) {
        JsonObject $$12 = new JsonObject();
        this.e.forEach(($$1, $$2) -> $$12.add($$1, (JsonElement)$$2.get()));
        return ji.a($$0, (JsonElement)$$12, this.d.a().resolve("pack.mcmeta"));
    }

    @Override
    public final String a() {
        return "Pack Metadata";
    }

    public static ko a(jk $$0, sw $$1) {
        return new ko($$0).a(ajz.a, new ajz($$1, t.a.a(ajm.b)));
    }

    public static ko a(jk $$0, sw $$1, caw $$2) {
        return ko.a($$0, $$1).a(ajj.a, new ajj($$2));
    }
}

