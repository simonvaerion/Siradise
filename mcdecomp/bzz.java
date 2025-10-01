/*
 * Decompiled with CFR 0.152.
 */
public class bzz {
    public static final bzz a = bzz.a("core");
    public static final bzz b = bzz.a("idle");
    public static final bzz c = bzz.a("work");
    public static final bzz d = bzz.a("play");
    public static final bzz e = bzz.a("rest");
    public static final bzz f = bzz.a("meet");
    public static final bzz g = bzz.a("panic");
    public static final bzz h = bzz.a("raid");
    public static final bzz i = bzz.a("pre_raid");
    public static final bzz j = bzz.a("hide");
    public static final bzz k = bzz.a("fight");
    public static final bzz l = bzz.a("celebrate");
    public static final bzz m = bzz.a("admire_item");
    public static final bzz n = bzz.a("avoid");
    public static final bzz o = bzz.a("ride");
    public static final bzz p = bzz.a("play_dead");
    public static final bzz q = bzz.a("long_jump");
    public static final bzz r = bzz.a("ram");
    public static final bzz s = bzz.a("tongue");
    public static final bzz t = bzz.a("swim");
    public static final bzz u = bzz.a("lay_spawn");
    public static final bzz v = bzz.a("sniff");
    public static final bzz w = bzz.a("investigate");
    public static final bzz x = bzz.a("roar");
    public static final bzz y = bzz.a("emerge");
    public static final bzz z = bzz.a("dig");
    private final String A;
    private final int B;

    private bzz(String $$0) {
        this.A = $$0;
        this.B = $$0.hashCode();
    }

    public String a() {
        return this.A;
    }

    private static bzz a(String $$0) {
        return hr.a(jb.F, $$0, new bzz($$0));
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        bzz $$1 = (bzz)$$0;
        return this.A.equals($$1.A);
    }

    public int hashCode() {
        return this.B;
    }

    public String toString() {
        return this.a();
    }
}

