/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class eaq
extends eay {
    final ecy a;
    final List<b> b;

    eaq(eck[] $$0, ecy $$1, List<b> $$2) {
        super($$0);
        this.a = $$1;
        this.b = ImmutableList.copyOf($$2);
    }

    @Override
    public eba b() {
        return ebb.v;
    }

    static eh.g a(String $$0) {
        try {
            return new eh().a(new StringReader($$0));
        }
        catch (CommandSyntaxException $$1) {
            throw new IllegalArgumentException("Failed to parse path " + $$0, $$1);
        }
    }

    @Override
    public Set<ebt<?>> a() {
        return this.a.b();
    }

    @Override
    public cfz a(cfz $$0, dzk $$1) {
        rk $$22 = this.a.a($$1);
        if ($$22 != null) {
            this.b.forEach($$2 -> $$2.a($$0::w, $$22));
        }
        return $$0;
    }

    public static a a(ecy $$0) {
        return new a($$0);
    }

    public static a a(dzk.b $$0) {
        return new a(ecw.a($$0));
    }

    public static class a
    extends eay.a<a> {
        private final ecy a;
        private final List<b> b = Lists.newArrayList();

        a(ecy $$0) {
            this.a = $$0;
        }

        public a a(String $$0, String $$1, c $$2) {
            this.b.add(new b($$0, $$1, $$2));
            return this;
        }

        public a a(String $$0, String $$1) {
            return this.a($$0, $$1, c.a);
        }

        protected a a() {
            return this;
        }

        @Override
        public eaz b() {
            return new eaq(this.g(), this.a, this.b);
        }

        @Override
        protected /* synthetic */ eay.a c() {
            return this.a();
        }
    }

    static class b {
        private final String a;
        private final eh.g b;
        private final String c;
        private final eh.g d;
        private final c e;

        b(String $$0, String $$1, c $$2) {
            this.a = $$0;
            this.b = eaq.a($$0);
            this.c = $$1;
            this.d = eaq.a($$1);
            this.e = $$2;
        }

        public void a(Supplier<rk> $$0, rk $$1) {
            try {
                List<rk> $$2 = this.b.a($$1);
                if (!$$2.isEmpty()) {
                    this.e.a($$0.get(), this.d, $$2);
                }
            }
            catch (CommandSyntaxException commandSyntaxException) {
                // empty catch block
            }
        }

        public JsonObject a() {
            JsonObject $$0 = new JsonObject();
            $$0.addProperty("source", this.a);
            $$0.addProperty("target", this.c);
            $$0.addProperty("op", this.e.d);
            return $$0;
        }

        public static b a(JsonObject $$0) {
            String $$1 = aor.i($$0, "source");
            String $$2 = aor.i($$0, "target");
            c $$3 = eaq$c.a(aor.i($$0, "op"));
            return new b($$1, $$2, $$3);
        }
    }

    public static class d
    extends eay.c<eaq> {
        @Override
        public void a(JsonObject $$0, eaq $$1, JsonSerializationContext $$2) {
            super.a($$0, $$1, $$2);
            $$0.add("source", $$2.serialize((Object)$$1.a));
            JsonArray $$3 = new JsonArray();
            $$1.b.stream().map(b::a).forEach(arg_0 -> ((JsonArray)$$3).add(arg_0));
            $$0.add("ops", (JsonElement)$$3);
        }

        public eaq a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
            ecy $$3 = aor.a($$0, "source", $$1, ecy.class);
            ArrayList $$4 = Lists.newArrayList();
            JsonArray $$5 = aor.v($$0, "ops");
            for (JsonElement $$6 : $$5) {
                JsonObject $$7 = aor.m($$6, "op");
                $$4.add(eaq$b.a($$7));
            }
            return new eaq($$2, $$3, $$4);
        }

        @Override
        public /* synthetic */ eay b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, eck[] eckArray) {
            return this.a(jsonObject, jsonDeserializationContext, eckArray);
        }
    }

    /*
     * Uses 'sealed' constructs - enablewith --sealed true
     */
    public static abstract class c
    extends Enum<c> {
        public static final /* enum */ c a = new c("replace"){

            @Override
            public void a(rk $$0, eh.g $$1, List<rk> $$2) throws CommandSyntaxException {
                $$1.a($$0, (rk)Iterables.getLast($$2));
            }
        };
        public static final /* enum */ c b = new c("append"){

            @Override
            public void a(rk $$0, eh.g $$1, List<rk> $$2) throws CommandSyntaxException {
                List<rk> $$3 = $$1.a($$0, qx::new);
                $$3.forEach($$12 -> {
                    if ($$12 instanceof qx) {
                        $$2.forEach($$1 -> ((qx)$$12).add($$1.d()));
                    }
                });
            }
        };
        public static final /* enum */ c c = new c("merge"){

            @Override
            public void a(rk $$0, eh.g $$1, List<rk> $$2) throws CommandSyntaxException {
                List<rk> $$3 = $$1.a($$0, qr::new);
                $$3.forEach($$12 -> {
                    if ($$12 instanceof qr) {
                        $$2.forEach($$1 -> {
                            if ($$1 instanceof qr) {
                                ((qr)$$12).a((qr)$$1);
                            }
                        });
                    }
                });
            }
        };
        final String d;
        private static final /* synthetic */ c[] e;

        public static c[] values() {
            return (c[])e.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        public abstract void a(rk var1, eh.g var2, List<rk> var3) throws CommandSyntaxException;

        c(String $$0) {
            this.d = $$0;
        }

        public static c a(String $$0) {
            for (c $$1 : eaq$c.values()) {
                if (!$$1.d.equals($$0)) continue;
                return $$1;
            }
            throw new IllegalArgumentException("Invalid merge strategy" + $$0);
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c};
        }

        static {
            e = eaq$c.a();
        }
    }
}

