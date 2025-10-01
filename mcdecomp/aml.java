/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.EnumMap;
import java.util.Map;

public final class aml {
    private static final Map<ccq, Pair<String, String>> a = ImmutableMap.of((Object)((Object)ccq.a), (Object)Pair.of((Object)"isGuiOpen", (Object)"isFilteringCraftable"), (Object)((Object)ccq.b), (Object)Pair.of((Object)"isFurnaceGuiOpen", (Object)"isFurnaceFilteringCraftable"), (Object)((Object)ccq.c), (Object)Pair.of((Object)"isBlastingFurnaceGuiOpen", (Object)"isBlastingFurnaceFilteringCraftable"), (Object)((Object)ccq.d), (Object)Pair.of((Object)"isSmokerGuiOpen", (Object)"isSmokerFilteringCraftable"));
    private final Map<ccq, a> b;

    private aml(Map<ccq, a> $$0) {
        this.b = $$0;
    }

    public aml() {
        this(ac.a(Maps.newEnumMap(ccq.class), $$0 -> {
            for (ccq $$1 : ccq.values()) {
                $$0.put($$1, new a(false, false));
            }
        }));
    }

    public boolean a(ccq $$0) {
        return this.b.get((Object)((Object)$$0)).a;
    }

    public void a(ccq $$0, boolean $$1) {
        this.b.get((Object)((Object)$$0)).a = $$1;
    }

    public boolean b(ccq $$0) {
        return this.b.get((Object)((Object)$$0)).b;
    }

    public void b(ccq $$0, boolean $$1) {
        this.b.get((Object)((Object)$$0)).b = $$1;
    }

    public static aml a(sf $$0) {
        EnumMap $$1 = Maps.newEnumMap(ccq.class);
        for (ccq $$2 : ccq.values()) {
            boolean $$3 = $$0.readBoolean();
            boolean $$4 = $$0.readBoolean();
            $$1.put($$2, new a($$3, $$4));
        }
        return new aml($$1);
    }

    public void b(sf $$0) {
        for (ccq $$1 : ccq.values()) {
            a $$2 = this.b.get((Object)$$1);
            if ($$2 == null) {
                $$0.writeBoolean(false);
                $$0.writeBoolean(false);
                continue;
            }
            $$0.writeBoolean($$2.a);
            $$0.writeBoolean($$2.b);
        }
    }

    public static aml a(qr $$0) {
        EnumMap $$1 = Maps.newEnumMap(ccq.class);
        a.forEach(($$2, $$3) -> {
            boolean $$4 = $$0.q((String)$$3.getFirst());
            boolean $$5 = $$0.q((String)$$3.getSecond());
            $$1.put($$2, new a($$4, $$5));
        });
        return new aml($$1);
    }

    public void b(qr $$0) {
        a.forEach(($$1, $$2) -> {
            a $$3 = this.b.get($$1);
            $$0.a((String)$$2.getFirst(), $$3.a);
            $$0.a((String)$$2.getSecond(), $$3.b);
        });
    }

    public aml a() {
        EnumMap $$0 = Maps.newEnumMap(ccq.class);
        for (ccq $$1 : ccq.values()) {
            a $$2 = this.b.get((Object)$$1);
            $$0.put($$1, $$2.a());
        }
        return new aml($$0);
    }

    public void a(aml $$0) {
        this.b.clear();
        for (ccq $$1 : ccq.values()) {
            a $$2 = $$0.b.get((Object)$$1);
            this.b.put($$1, $$2.a());
        }
    }

    public boolean equals(Object $$0) {
        return this == $$0 || $$0 instanceof aml && this.b.equals(((aml)$$0).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    static final class a {
        boolean a;
        boolean b;

        public a(boolean $$0, boolean $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public a a() {
            return new a(this.a, this.b);
        }

        public boolean equals(Object $$0) {
            if (this == $$0) {
                return true;
            }
            if ($$0 instanceof a) {
                a $$1 = (a)$$0;
                return this.a == $$1.a && this.b == $$1.b;
            }
            return false;
        }

        public int hashCode() {
            int $$0 = this.a ? 1 : 0;
            $$0 = 31 * $$0 + (this.b ? 1 : 0);
            return $$0;
        }

        public String toString() {
            return "[open=" + this.a + ", filtering=" + this.b + "]";
        }
    }
}

