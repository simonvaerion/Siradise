/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.reflect.TypeToken
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fzc
extends alc<a> {
    public static final fxv a = new fxv("minecraft:empty", bcy.a(1.0f), bcy.a(1.0f), 1, fxv.a.a, false, false, 16);
    public static final acq b = new acq("minecraft", "intentionally_empty");
    public static final fzd c = new fzd(b, null);
    public static final fxv d = new fxv(b.toString(), bcy.a(1.0f), bcy.a(1.0f), 1, fxv.a.a, false, false, 16);
    static final Logger e = LogUtils.getLogger();
    private static final String f = "sounds.json";
    private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(sw.class, (Object)new sw.a()).registerTypeAdapter(fxw.class, (Object)new fxx()).create();
    private static final TypeToken<Map<String, fxw>> h = new TypeToken<Map<String, fxw>>(){};
    private final Map<acq, fzd> i = Maps.newHashMap();
    private final fyz j;
    private final Map<acq, akv> k = new HashMap<acq, akv>();

    public fzc(enr $$0) {
        this.j = new fyz(this, $$0, ala.fromMap(this.k));
    }

    protected a a(akx $$0, ban $$1) {
        a $$2 = new a();
        $$1.a();
        $$1.a("list");
        $$2.a($$0);
        $$1.c();
        for (String $$3 : $$0.a()) {
            $$1.a($$3);
            try {
                List<akv> $$4 = $$0.a(new acq($$3, f));
                for (akv $$5 : $$4) {
                    $$1.a($$5.b());
                    try (BufferedReader $$6 = $$5.e();){
                        $$1.a("parse");
                        Map<String, fxw> $$7 = aor.a(g, (Reader)$$6, h);
                        $$1.b("register");
                        for (Map.Entry<String, fxw> $$8 : $$7.entrySet()) {
                            $$2.a(new acq($$3, $$8.getKey()), $$8.getValue());
                        }
                        $$1.c();
                    }
                    catch (RuntimeException $$9) {
                        e.warn("Invalid {} in resourcepack: '{}'", new Object[]{f, $$5.b(), $$9});
                    }
                    $$1.c();
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
            $$1.c();
        }
        $$1.b();
        return $$2;
    }

    @Override
    protected void a(a $$0, akx $$1, ban $$2) {
        $$0.a(this.i, this.k, this.j);
        if (aa.aS) {
            for (acq $$3 : this.i.keySet()) {
                fzd $$4 = this.i.get($$3);
                if (sy.b($$4.a()) || !jb.c.c($$3)) continue;
                e.error("Missing subtitle {} for sound event: {}", (Object)$$4.a(), (Object)$$3);
            }
        }
        if (e.isDebugEnabled()) {
            for (acq $$5 : this.i.keySet()) {
                if (jb.c.c($$5)) continue;
                e.debug("Not having sound event for: {}", (Object)$$5);
            }
        }
        this.j.a();
    }

    public List<String> a() {
        return this.j.g();
    }

    static boolean a(fxv $$0, acq $$1, ala $$2) {
        acq $$3 = $$0.b();
        if ($$2.getResource($$3).isEmpty()) {
            e.warn("File {} does not exist, cannot add it to event {}", (Object)$$3, (Object)$$1);
            return false;
        }
        return true;
    }

    @Nullable
    public fzd a(acq $$0) {
        return this.i.get($$0);
    }

    public Collection<acq> b() {
        return this.i.keySet();
    }

    public void a(fxz $$0) {
        this.j.a($$0);
    }

    public void a(fxy $$0) {
        this.j.c($$0);
    }

    public void a(fxy $$0, int $$1) {
        this.j.a($$0, $$1);
    }

    public void a(emz $$0) {
        this.j.a($$0);
    }

    public void d() {
        this.j.d();
    }

    public void e() {
        this.j.c();
    }

    public void f() {
        this.j.b();
    }

    public void a(boolean $$0) {
        this.j.a($$0);
    }

    public void g() {
        this.j.e();
    }

    public void a(ami $$0, float $$1) {
        if ($$0 == ami.a && $$1 <= 0.0f) {
            this.e();
        }
        this.j.a($$0, $$1);
    }

    public void b(fxy $$0) {
        this.j.a($$0);
    }

    public boolean c(fxy $$0) {
        return this.j.b($$0);
    }

    public void a(fzb $$0) {
        this.j.a($$0);
    }

    public void b(fzb $$0) {
        this.j.b($$0);
    }

    public void a(@Nullable acq $$0, @Nullable ami $$1) {
        this.j.a($$0, $$1);
    }

    public String h() {
        return this.j.f();
    }

    public void i() {
        this.j.a();
    }

    @Override
    protected /* synthetic */ Object b(akx akx2, ban ban2) {
        return this.a(akx2, ban2);
    }

    protected static class a {
        final Map<acq, fzd> a = Maps.newHashMap();
        private Map<acq, akv> b = Map.of();

        protected a() {
        }

        void a(akx $$0) {
            this.b = fxv.a.a($$0);
        }

        /*
         * WARNING - void declaration
         */
        void a(acq $$0, fxw $$1) {
            boolean $$3;
            fzd $$2 = this.a.get($$0);
            boolean bl2 = $$3 = $$2 == null;
            if ($$3 || $$1.b()) {
                if (!$$3) {
                    e.debug("Replaced sound event location {}", (Object)$$0);
                }
                $$2 = new fzd($$0, $$1.c());
                this.a.put($$0, $$2);
            }
            ala $$4 = ala.fromMap(this.b);
            block4: for (final fxv $$5 : $$1.a()) {
                void $$9;
                final acq $$6 = $$5.a();
                switch ($$5.f()) {
                    case a: {
                        if (!fzc.a($$5, $$0, $$4)) continue block4;
                        fxv $$7 = $$5;
                        break;
                    }
                    case b: {
                        fze<fxv> $$8 = new fze<fxv>(){

                            @Override
                            public int e() {
                                fzd $$0 = a.get($$6);
                                return $$0 == null ? 0 : $$0.e();
                            }

                            public fxv a(apf $$0) {
                                fzd $$1 = a.get($$6);
                                if ($$1 == null) {
                                    return fzc.a;
                                }
                                fxv $$2 = $$1.a($$0);
                                return new fxv($$2.a().toString(), new bde($$2.c(), $$5.c()), new bde($$2.d(), $$5.d()), $$5.e(), fxv.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                            }

                            @Override
                            public void a(fyz $$0) {
                                fzd $$1 = a.get($$6);
                                if ($$1 == null) {
                                    return;
                                }
                                $$1.a($$0);
                            }

                            @Override
                            public /* synthetic */ Object b(apf apf2) {
                                return this.a(apf2);
                            }
                        };
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Unknown SoundEventRegistration type: " + $$5.f());
                    }
                }
                $$2.a((fze<fxv>)$$9);
            }
        }

        public void a(Map<acq, fzd> $$0, Map<acq, akv> $$1, fyz $$2) {
            $$0.clear();
            $$1.clear();
            $$1.putAll(this.b);
            for (Map.Entry<acq, fzd> $$3 : this.a.entrySet()) {
                $$0.put($$3.getKey(), $$3.getValue());
                $$3.getValue().a($$2);
            }
        }
    }
}

