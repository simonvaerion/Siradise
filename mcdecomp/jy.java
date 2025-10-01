/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class jy
implements ji {
    private final jk d;

    public jy(jk $$0) {
        this.d = $$0;
    }

    @Override
    public CompletableFuture<?> a(jg $$0) {
        JsonObject $$12 = new JsonObject();
        jb.ap.h().forEach($$1 -> $$12.add($$1.g().a().toString(), jy.a((hr)$$1.a())));
        Path $$2 = this.d.a(jk.b.c).resolve("registries.json");
        return ji.a($$0, (JsonElement)$$12, $$2);
    }

    private static <T> JsonElement a(hr<T> $$0) {
        JsonObject $$1 = new JsonObject();
        if ($$0 instanceof gz) {
            acq $$22 = ((gz)$$0).a();
            $$1.addProperty("default", $$22.toString());
        }
        int $$3 = jb.ap.a($$0);
        $$1.addProperty("protocol_id", (Number)$$3);
        JsonObject $$4 = new JsonObject();
        $$0.h().forEach($$2 -> {
            Object $$3 = $$2.a();
            int $$4 = $$0.a($$3);
            JsonObject $$5 = new JsonObject();
            $$5.addProperty("protocol_id", (Number)$$4);
            $$4.add($$2.g().a().toString(), (JsonElement)$$5);
        });
        $$1.add("entries", (JsonElement)$$4);
        return $$1;
    }

    @Override
    public final String a() {
        return "Registry Dump";
    }
}

