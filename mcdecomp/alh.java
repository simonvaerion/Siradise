/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class alh
extends alp<String, ali> {
    public alh(File $$0) {
        super($$0);
    }

    @Override
    protected alo<String> a(JsonObject $$0) {
        return new ali($$0);
    }

    public boolean a(SocketAddress $$0) {
        String $$1 = this.c($$0);
        return this.d($$1);
    }

    public boolean a(String $$0) {
        return this.d($$0);
    }

    @Override
    @Nullable
    public ali b(SocketAddress $$0) {
        String $$1 = this.c($$0);
        return (ali)this.b($$1);
    }

    private String c(SocketAddress $$0) {
        String $$1 = $$0.toString();
        if ($$1.contains("/")) {
            $$1 = $$1.substring($$1.indexOf(47) + 1);
        }
        if ($$1.contains(":")) {
            $$1 = $$1.substring(0, $$1.indexOf(58));
        }
        return $$1;
    }
}

