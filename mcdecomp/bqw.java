/*
 * Decompiled with CFR 0.152.
 */
public interface bqw {
    public static final bqw a = bqw.a("zombie_villager_cured");
    public static final bqw b = bqw.a("golem_killed");
    public static final bqw c = bqw.a("villager_hurt");
    public static final bqw d = bqw.a("villager_killed");
    public static final bqw e = bqw.a("trade");

    public static bqw a(final String $$0) {
        return new bqw(){

            public String toString() {
                return $$0;
            }
        };
    }
}

