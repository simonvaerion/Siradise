/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class cl {
    public static final cl a = new cl(null);
    @Nullable
    private final qr b;

    public cl(@Nullable qr $$0) {
        this.b = $$0;
    }

    public boolean a(cfz $$0) {
        if (this == a) {
            return true;
        }
        return this.a($$0.v());
    }

    public boolean a(bfj $$0) {
        if (this == a) {
            return true;
        }
        return this.a(cl.b($$0));
    }

    public boolean a(@Nullable rk $$0) {
        if ($$0 == null) {
            return this == a;
        }
        return this.b == null || rd.a((rk)this.b, $$0, true);
    }

    public JsonElement a() {
        if (this == a || this.b == null) {
            return JsonNull.INSTANCE;
        }
        return new JsonPrimitive(this.b.toString());
    }

    /*
     * WARNING - void declaration
     */
    public static cl a(@Nullable JsonElement $$0) {
        void $$3;
        if ($$0 == null || $$0.isJsonNull()) {
            return a;
        }
        try {
            qr $$1 = rl.a(aor.a($$0, "nbt"));
        }
        catch (CommandSyntaxException $$2) {
            throw new JsonSyntaxException("Invalid nbt tag: " + $$2.getMessage());
        }
        return new cl((qr)$$3);
    }

    public static qr b(bfj $$0) {
        cfz $$2;
        qr $$1 = $$0.f(new qr());
        if ($$0 instanceof byo && !($$2 = ((byo)$$0).fN().f()).b()) {
            $$1.a("SelectedItem", $$2.b(new qr()));
        }
        return $$1;
    }
}

