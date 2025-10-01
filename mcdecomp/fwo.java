/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class fwo
implements ajx<fwn> {
    public fwn b(JsonObject $$0) {
        boolean $$1 = aor.a($$0, "blur", false);
        boolean $$2 = aor.a($$0, "clamp", false);
        return new fwn($$1, $$2);
    }

    @Override
    public String a() {
        return "texture";
    }

    @Override
    public /* synthetic */ Object a(JsonObject jsonObject) {
        return this.b(jsonObject);
    }
}

