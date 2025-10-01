/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjr
extends alc<a> {
    private static final Logger a = LogUtils.getLogger();
    private static final acq b = new acq("gpu_warnlist.json");
    private ImmutableMap<String, String> c = ImmutableMap.of();
    private boolean d;
    private boolean e;
    private boolean f;

    public boolean a() {
        return !this.c.isEmpty();
    }

    public boolean b() {
        return this.a() && !this.e;
    }

    public void d() {
        this.d = true;
    }

    public void e() {
        this.e = true;
    }

    public void f() {
        this.e = true;
        this.f = true;
    }

    public boolean g() {
        return this.d && !this.e;
    }

    public boolean h() {
        return this.f;
    }

    public void i() {
        this.d = false;
        this.e = false;
        this.f = false;
    }

    @Nullable
    public String j() {
        return (String)this.c.get((Object)"renderer");
    }

    @Nullable
    public String k() {
        return (String)this.c.get((Object)"version");
    }

    @Nullable
    public String l() {
        return (String)this.c.get((Object)"vendor");
    }

    @Nullable
    public String m() {
        StringBuilder $$0 = new StringBuilder();
        this.c.forEach(($$1, $$2) -> $$0.append((String)$$1).append(": ").append((String)$$2));
        return $$0.length() == 0 ? null : $$0.toString();
    }

    protected a a(akx $$0, ban $$1) {
        ArrayList $$2 = Lists.newArrayList();
        ArrayList $$3 = Lists.newArrayList();
        ArrayList $$4 = Lists.newArrayList();
        $$1.a();
        JsonObject $$5 = fjr.c($$0, $$1);
        if ($$5 != null) {
            $$1.a("compile_regex");
            fjr.a($$5.getAsJsonArray("renderer"), $$2);
            fjr.a($$5.getAsJsonArray("version"), $$3);
            fjr.a($$5.getAsJsonArray("vendor"), $$4);
            $$1.c();
        }
        $$1.b();
        return new a($$2, $$3, $$4);
    }

    @Override
    protected void a(a $$0, akx $$1, ban $$2) {
        this.c = $$0.a();
    }

    private static void a(JsonArray $$0, List<Pattern> $$12) {
        $$0.forEach($$1 -> $$12.add(Pattern.compile($$1.getAsString(), 2)));
    }

    @Nullable
    private static JsonObject c(akx $$0, ban $$1) {
        $$1.a("parse_json");
        JsonObject $$2 = null;
        try (BufferedReader $$3 = $$0.openAsReader(b);){
            $$2 = JsonParser.parseReader((Reader)$$3).getAsJsonObject();
        }
        catch (JsonSyntaxException | IOException $$4) {
            a.warn("Failed to load GPU warnlist");
        }
        $$1.c();
        return $$2;
    }

    @Override
    protected /* synthetic */ Object b(akx akx2, ban ban2) {
        return this.a(akx2, ban2);
    }

    protected static final class a {
        private final List<Pattern> a;
        private final List<Pattern> b;
        private final List<Pattern> c;

        a(List<Pattern> $$0, List<Pattern> $$1, List<Pattern> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        private static String a(List<Pattern> $$0, String $$1) {
            ArrayList $$2 = Lists.newArrayList();
            for (Pattern $$3 : $$0) {
                Matcher $$4 = $$3.matcher($$1);
                while ($$4.find()) {
                    $$2.add($$4.group());
                }
            }
            return String.join((CharSequence)", ", $$2);
        }

        ImmutableMap<String, String> a() {
            String $$3;
            String $$2;
            ImmutableMap.Builder $$0 = new ImmutableMap.Builder();
            String $$1 = fjr$a.a(this.a, ehc.c());
            if (!$$1.isEmpty()) {
                $$0.put((Object)"renderer", (Object)$$1);
            }
            if (!($$2 = fjr$a.a(this.b, ehc.d())).isEmpty()) {
                $$0.put((Object)"version", (Object)$$2);
            }
            if (!($$3 = fjr$a.a(this.c, ehc.a())).isEmpty()) {
                $$0.put((Object)"vendor", (Object)$$3);
            }
            return $$0.build();
        }
    }
}

