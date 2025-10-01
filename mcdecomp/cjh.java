/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSyntaxException
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class cjh
implements cit {
    final int a;
    final int b;
    final hn<ciz> c;
    final cfz d;
    private final acq e;
    final String f;
    final cis g;
    final boolean h;

    public cjh(acq $$0, String $$1, cis $$2, int $$3, int $$4, hn<ciz> $$5, cfz $$6, boolean $$7) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.a = $$3;
        this.b = $$4;
        this.c = $$5;
        this.d = $$6;
        this.h = $$7;
    }

    public cjh(acq $$0, String $$1, cis $$2, int $$3, int $$4, hn<ciz> $$5, cfz $$6) {
        this($$0, $$1, $$2, $$3, $$4, $$5, $$6, true);
    }

    @Override
    public acq e() {
        return this.e;
    }

    @Override
    public cje<?> aj_() {
        return cje.a;
    }

    @Override
    public String c() {
        return this.f;
    }

    @Override
    public cis d() {
        return this.g;
    }

    @Override
    public cfz a(hs $$0) {
        return this.d;
    }

    @Override
    public hn<ciz> a() {
        return this.c;
    }

    @Override
    public boolean i() {
        return this.h;
    }

    @Override
    public boolean a(int $$0, int $$1) {
        return $$0 >= this.a && $$1 >= this.b;
    }

    @Override
    public boolean a(cbt $$0, cmm $$1) {
        for (int $$2 = 0; $$2 <= $$0.f() - this.a; ++$$2) {
            for (int $$3 = 0; $$3 <= $$0.g() - this.b; ++$$3) {
                if (this.a($$0, $$2, $$3, true)) {
                    return true;
                }
                if (!this.a($$0, $$2, $$3, false)) continue;
                return true;
            }
        }
        return false;
    }

    private boolean a(cbt $$0, int $$1, int $$2, boolean $$3) {
        for (int $$4 = 0; $$4 < $$0.f(); ++$$4) {
            for (int $$5 = 0; $$5 < $$0.g(); ++$$5) {
                int $$6 = $$4 - $$1;
                int $$7 = $$5 - $$2;
                ciz $$8 = ciz.a;
                if ($$6 >= 0 && $$7 >= 0 && $$6 < this.a && $$7 < this.b) {
                    $$8 = $$3 ? this.c.get(this.a - $$6 - 1 + $$7 * this.a) : this.c.get($$6 + $$7 * this.a);
                }
                if ($$8.a($$0.a($$4 + $$5 * $$0.f()))) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public cfz a(cbt $$0, hs $$1) {
        return this.a($$1).p();
    }

    public int k() {
        return this.a;
    }

    public int l() {
        return this.b;
    }

    static hn<ciz> a(String[] $$0, Map<String, ciz> $$1, int $$2, int $$3) {
        hn<ciz> $$4 = hn.a($$2 * $$3, ciz.a);
        HashSet $$5 = Sets.newHashSet($$1.keySet());
        $$5.remove(" ");
        for (int $$6 = 0; $$6 < $$0.length; ++$$6) {
            for (int $$7 = 0; $$7 < $$0[$$6].length(); ++$$7) {
                String $$8 = $$0[$$6].substring($$7, $$7 + 1);
                ciz $$9 = $$1.get($$8);
                if ($$9 == null) {
                    throw new JsonSyntaxException("Pattern references symbol '" + $$8 + "' but it's not defined in the key");
                }
                $$5.remove($$8);
                $$4.set($$7 + $$2 * $$6, $$9);
            }
        }
        if (!$$5.isEmpty()) {
            throw new JsonSyntaxException("Key defines symbols that aren't used in pattern: " + $$5);
        }
        return $$4;
    }

    @VisibleForTesting
    static String[] a(String ... $$0) {
        int $$1 = Integer.MAX_VALUE;
        int $$2 = 0;
        int $$3 = 0;
        int $$4 = 0;
        for (int $$5 = 0; $$5 < $$0.length; ++$$5) {
            String $$6 = $$0[$$5];
            $$1 = Math.min($$1, cjh.a($$6));
            int $$7 = cjh.b($$6);
            $$2 = Math.max($$2, $$7);
            if ($$7 < 0) {
                if ($$3 == $$5) {
                    ++$$3;
                }
                ++$$4;
                continue;
            }
            $$4 = 0;
        }
        if ($$0.length == $$4) {
            return new String[0];
        }
        String[] $$8 = new String[$$0.length - $$4 - $$3];
        for (int $$9 = 0; $$9 < $$8.length; ++$$9) {
            $$8[$$9] = $$0[$$9 + $$3].substring($$1, $$2 + 1);
        }
        return $$8;
    }

    @Override
    public boolean j() {
        hn<ciz> $$02 = this.a();
        return $$02.isEmpty() || $$02.stream().filter($$0 -> !$$0.d()).anyMatch($$0 -> $$0.a().length == 0);
    }

    private static int a(String $$0) {
        int $$1;
        for ($$1 = 0; $$1 < $$0.length() && $$0.charAt($$1) == ' '; ++$$1) {
        }
        return $$1;
    }

    private static int b(String $$0) {
        int $$1;
        for ($$1 = $$0.length() - 1; $$1 >= 0 && $$0.charAt($$1) == ' '; --$$1) {
        }
        return $$1;
    }

    static String[] a(JsonArray $$0) {
        String[] $$1 = new String[$$0.size()];
        if ($$1.length > 3) {
            throw new JsonSyntaxException("Invalid pattern: too many rows, 3 is maximum");
        }
        if ($$1.length == 0) {
            throw new JsonSyntaxException("Invalid pattern: empty pattern not allowed");
        }
        for (int $$2 = 0; $$2 < $$1.length; ++$$2) {
            String $$3 = aor.a($$0.get($$2), "pattern[" + $$2 + "]");
            if ($$3.length() > 3) {
                throw new JsonSyntaxException("Invalid pattern: too many columns, 3 is maximum");
            }
            if ($$2 > 0 && $$1[0].length() != $$3.length()) {
                throw new JsonSyntaxException("Invalid pattern: each row must be the same width");
            }
            $$1[$$2] = $$3;
        }
        return $$1;
    }

    static Map<String, ciz> c(JsonObject $$0) {
        HashMap $$1 = Maps.newHashMap();
        for (Map.Entry $$2 : $$0.entrySet()) {
            if (((String)$$2.getKey()).length() != 1) {
                throw new JsonSyntaxException("Invalid key entry: '" + (String)$$2.getKey() + "' is an invalid symbol (must be 1 character only).");
            }
            if (" ".equals($$2.getKey())) {
                throw new JsonSyntaxException("Invalid key entry: ' ' is a reserved symbol.");
            }
            $$1.put((String)$$2.getKey(), ciz.a((JsonElement)$$2.getValue(), false));
        }
        $$1.put(" ", ciz.a);
        return $$1;
    }

    public static cfz a(JsonObject $$0) {
        cfu $$1 = cjh.b($$0);
        if ($$0.has("data")) {
            throw new JsonParseException("Disallowed data tag found");
        }
        int $$2 = aor.a($$0, "count", 1);
        if ($$2 < 1) {
            throw new JsonSyntaxException("Invalid output count: " + $$2);
        }
        return new cfz($$1, $$2);
    }

    public static cfu b(JsonObject $$0) {
        String $$1 = aor.i($$0, "item");
        cfu $$2 = (cfu)jb.i.b(acq.a($$1)).orElseThrow(() -> new JsonSyntaxException("Unknown item '" + $$1 + "'"));
        if ($$2 == cgc.a) {
            throw new JsonSyntaxException("Empty ingredient not allowed here");
        }
        return $$2;
    }

    public static class a
    implements cje<cjh> {
        public cjh b(acq $$0, JsonObject $$1) {
            String $$2 = aor.a($$1, "group", "");
            cis $$3 = cis.e.a(aor.a($$1, "category", null), cis.d);
            Map<String, ciz> $$4 = cjh.c(aor.u($$1, "key"));
            String[] $$5 = cjh.a(cjh.a(aor.v($$1, "pattern")));
            int $$6 = $$5[0].length();
            int $$7 = $$5.length;
            hn<ciz> $$8 = cjh.a($$5, $$4, $$6, $$7);
            cfz $$9 = cjh.a(aor.u($$1, "result"));
            boolean $$10 = aor.a($$1, "show_notification", true);
            return new cjh($$0, $$2, $$3, $$6, $$7, $$8, $$9, $$10);
        }

        public cjh b(acq $$0, sf $$1) {
            int $$2 = $$1.m();
            int $$3 = $$1.m();
            String $$4 = $$1.s();
            cis $$5 = $$1.b(cis.class);
            hn<ciz> $$6 = hn.a($$2 * $$3, ciz.a);
            for (int $$7 = 0; $$7 < $$6.size(); ++$$7) {
                $$6.set($$7, ciz.b($$1));
            }
            cfz $$8 = $$1.r();
            boolean $$9 = $$1.readBoolean();
            return new cjh($$0, $$4, $$5, $$2, $$3, $$6, $$8, $$9);
        }

        @Override
        public void a(sf $$0, cjh $$1) {
            $$0.d($$1.a);
            $$0.d($$1.b);
            $$0.a($$1.f);
            $$0.a($$1.g);
            for (ciz $$2 : $$1.c) {
                $$2.a($$0);
            }
            $$0.a($$1.d);
            $$0.writeBoolean($$1.h);
        }

        @Override
        public /* synthetic */ cjc a(acq acq2, sf sf2) {
            return this.b(acq2, sf2);
        }

        @Override
        public /* synthetic */ cjc a(acq acq2, JsonObject jsonObject) {
            return this.b(acq2, jsonObject);
        }
    }
}

