/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public final class hc
extends Enum<hc>
implements apr {
    public static final /* enum */ hc a = new hc("down_east", ha.a, ha.f);
    public static final /* enum */ hc b = new hc("down_north", ha.a, ha.c);
    public static final /* enum */ hc c = new hc("down_south", ha.a, ha.d);
    public static final /* enum */ hc d = new hc("down_west", ha.a, ha.e);
    public static final /* enum */ hc e = new hc("up_east", ha.b, ha.f);
    public static final /* enum */ hc f = new hc("up_north", ha.b, ha.c);
    public static final /* enum */ hc g = new hc("up_south", ha.b, ha.d);
    public static final /* enum */ hc h = new hc("up_west", ha.b, ha.e);
    public static final /* enum */ hc i = new hc("west_up", ha.e, ha.b);
    public static final /* enum */ hc j = new hc("east_up", ha.f, ha.b);
    public static final /* enum */ hc k = new hc("north_up", ha.c, ha.b);
    public static final /* enum */ hc l = new hc("south_up", ha.d, ha.b);
    private static final Int2ObjectMap<hc> m;
    private final String n;
    private final ha o;
    private final ha p;
    private static final /* synthetic */ hc[] q;

    public static hc[] values() {
        return (hc[])q.clone();
    }

    public static hc valueOf(String $$0) {
        return Enum.valueOf(hc.class, $$0);
    }

    private static int b(ha $$0, ha $$1) {
        return $$1.ordinal() << 3 | $$0.ordinal();
    }

    private hc(String $$0, ha $$1, ha $$2) {
        this.n = $$0;
        this.p = $$1;
        this.o = $$2;
    }

    @Override
    public String c() {
        return this.n;
    }

    public static hc a(ha $$0, ha $$1) {
        int $$2 = hc.b($$0, $$1);
        return (hc)m.get($$2);
    }

    public ha a() {
        return this.p;
    }

    public ha b() {
        return this.o;
    }

    private static /* synthetic */ hc[] d() {
        return new hc[]{a, b, c, d, e, f, g, h, i, j, k, l};
    }

    static {
        q = hc.d();
        m = (Int2ObjectMap)ac.a(new Int2ObjectOpenHashMap(hc.values().length), (T $$0) -> {
            for (hc $$1 : hc.values()) {
                $$0.put(hc.b($$1.p, $$1.o), (Object)$$1);
            }
        });
    }
}

