/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.OptionalDynamic
 */
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;

public class dza {
    private final int a;
    private final long b;
    private final String c;
    private final dys d;
    private final boolean e;

    private dza(int $$0, long $$1, String $$2, int $$3, String $$4, boolean $$5) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = new dys($$3, $$4);
        this.e = $$5;
    }

    public static dza a(Dynamic<?> $$0) {
        int $$1 = $$0.get("version").asInt(0);
        long $$2 = $$0.get("LastPlayed").asLong(0L);
        OptionalDynamic $$3 = $$0.get("Version");
        if ($$3.result().isPresent()) {
            return new dza($$1, $$2, $$3.get("Name").asString(aa.b().c()), $$3.get("Id").asInt(aa.b().d().c()), $$3.get("Series").asString(dys.a), $$3.get("Snapshot").asBoolean(!aa.b().g()));
        }
        return new dza($$1, $$2, "", 0, dys.a, false);
    }

    public int a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public dys d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }
}

