/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonObject;
import java.util.Date;
import javax.annotation.Nullable;

public class ali
extends alf<String> {
    public ali(String $$0) {
        this($$0, (Date)null, (String)null, (Date)null, (String)null);
    }

    public ali(String $$0, @Nullable Date $$1, @Nullable String $$2, @Nullable Date $$3, @Nullable String $$4) {
        super($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public sw e() {
        return sw.b(String.valueOf(this.g()));
    }

    public ali(JsonObject $$0) {
        super(ali.b($$0), $$0);
    }

    private static String b(JsonObject $$0) {
        return $$0.has("ip") ? $$0.get("ip").getAsString() : null;
    }

    @Override
    protected void a(JsonObject $$0) {
        if (this.g() == null) {
            return;
        }
        $$0.addProperty("ip", (String)this.g());
        super.a($$0);
    }
}

