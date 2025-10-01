/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public interface lo {
    public void a(JsonObject var1);

    default public JsonObject a() {
        JsonObject $$0 = new JsonObject();
        $$0.addProperty("type", jb.u.b(this.c()).toString());
        this.a($$0);
        return $$0;
    }

    public acq b();

    public cje<?> c();

    @Nullable
    public JsonObject d();

    @Nullable
    public acq e();
}

