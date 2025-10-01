/*
 * Decompiled with CFR 0.152.
 */
public interface cjf<T extends cjc<?>> {
    public static final cjf<cit> a = cjf.a("crafting");
    public static final cjf<cjo> b = cjf.a("smelting");
    public static final cjf<cio> c = cjf.a("blasting");
    public static final cjf<cjs> d = cjf.a("smoking");
    public static final cjf<ciq> e = cjf.a("campfire_cooking");
    public static final cjf<cjt> f = cjf.a("stonecutting");
    public static final cjf<cjp> g = cjf.a("smithing");

    public static <T extends cjc<?>> cjf<T> a(final String $$0) {
        return hr.a(jb.t, new acq($$0), new cjf<T>(){

            public String toString() {
                return $$0;
            }
        });
    }
}

