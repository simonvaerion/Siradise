/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class t
implements ad {
    private static final Logger b = LogUtils.getLogger();
    public static final ad a = new t();
    private final String c;
    private final String d;
    private final boolean e;
    private final dys f;
    private final int g;
    private final int h;
    private final int i;
    private final Date j;

    private t() {
        this.c = UUID.randomUUID().toString().replaceAll("-", "");
        this.d = "1.20.1";
        this.e = true;
        this.f = new dys(3465, "main");
        this.g = aa.c();
        this.h = 15;
        this.i = 15;
        this.j = new Date();
    }

    private t(JsonObject $$0) {
        this.c = aor.i($$0, "id");
        this.d = aor.i($$0, "name");
        this.e = aor.k($$0, "stable");
        this.f = new dys(aor.o($$0, "world_version"), aor.a($$0, "series_id", dys.a));
        this.g = aor.o($$0, "protocol_version");
        JsonObject $$1 = aor.u($$0, "pack_version");
        this.h = aor.o($$1, "resource");
        this.i = aor.o($$1, "data");
        this.j = Date.from(ZonedDateTime.parse(aor.i($$0, "build_time")).toInstant());
    }

    /*
     * Enabled aggressive exception aggregation
     */
    public static ad a() {
        try (InputStream $$0 = t.class.getResourceAsStream("/version.json");){
            t t2;
            if ($$0 == null) {
                b.warn("Missing version information!");
                ad ad2 = a;
                return ad2;
            }
            try (InputStreamReader $$1 = new InputStreamReader($$0);){
                t2 = new t(aor.a($$1));
            }
            return t2;
        }
        catch (JsonParseException | IOException $$2) {
            throw new IllegalStateException("Game version information is corrupt", $$2);
        }
    }

    @Override
    public String b() {
        return this.c;
    }

    @Override
    public String c() {
        return this.d;
    }

    @Override
    public dys d() {
        return this.f;
    }

    @Override
    public int e() {
        return this.g;
    }

    @Override
    public int a(ajm $$0) {
        return $$0 == ajm.b ? this.i : this.h;
    }

    @Override
    public Date f() {
        return this.j;
    }

    @Override
    public boolean g() {
        return this.e;
    }
}

