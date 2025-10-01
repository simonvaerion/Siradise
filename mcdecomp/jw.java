/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class jw
implements ji {
    private final jk d;

    public jw(jk $$0) {
        this.d = $$0;
    }

    @Override
    public CompletableFuture<?> a(jg $$0) {
        JsonObject $$1 = new JsonObject();
        for (cpn $$2 : jb.f) {
            acq $$3 = jb.f.b($$2);
            JsonObject $$4 = new JsonObject();
            dcc<cpn, dcb> $$5 = $$2.l();
            if (!$$5.d().isEmpty()) {
                JsonObject $$6 = new JsonObject();
                for (dde dde2 : $$5.d()) {
                    JsonArray $$8 = new JsonArray();
                    for (Comparable $$9 : dde2.a()) {
                        $$8.add(ac.a(dde2, $$9));
                    }
                    $$6.add(dde2.f(), (JsonElement)$$8);
                }
                $$4.add("properties", (JsonElement)$$6);
            }
            JsonArray $$10 = new JsonArray();
            for (dcb dcb2 : $$5.a()) {
                JsonObject $$12 = new JsonObject();
                JsonObject $$13 = new JsonObject();
                for (dde<?> $$14 : $$5.d()) {
                    $$13.addProperty($$14.f(), ac.a($$14, dcb2.c($$14)));
                }
                if ($$13.size() > 0) {
                    $$12.add("properties", (JsonElement)$$13);
                }
                $$12.addProperty("id", (Number)cpn.i(dcb2));
                if (dcb2 == $$2.n()) {
                    $$12.addProperty("default", Boolean.valueOf(true));
                }
                $$10.add((JsonElement)$$12);
            }
            $$4.add("states", (JsonElement)$$10);
            $$1.add($$3.toString(), (JsonElement)$$4);
        }
        Path $$15 = this.d.a(jk.b.c).resolve("blocks.json");
        return ji.a($$0, (JsonElement)$$1, $$15);
    }

    @Override
    public final String a() {
        return "Block List";
    }
}

