/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dof<P extends doe> {
    public static final dof<dnz> a = dof.a("blob_foliage_placer", dnz.a);
    public static final dof<dok> b = dof.a("spruce_foliage_placer", dok.a);
    public static final dof<doi> c = dof.a("pine_foliage_placer", doi.a);
    public static final dof<dny> d = dof.a("acacia_foliage_placer", dny.a);
    public static final dof<doa> e = dof.a("bush_foliage_placer", doa.c);
    public static final dof<dod> f = dof.a("fancy_foliage_placer", dod.c);
    public static final dof<dog> g = dof.a("jungle_foliage_placer", dog.a);
    public static final dof<doh> h = dof.a("mega_pine_foliage_placer", doh.a);
    public static final dof<doc> i = dof.a("dark_oak_foliage_placer", doc.a);
    public static final dof<doj> j = dof.a("random_spread_foliage_placer", doj.a);
    public static final dof<dob> k = dof.a("cherry_foliage_placer", dob.a);
    private final Codec<P> l;

    private static <P extends doe> dof<P> a(String $$0, Codec<P> $$1) {
        return hr.a(jb.X, $$0, new dof<P>($$1));
    }

    private dof(Codec<P> $$0) {
        this.l = $$0;
    }

    public Codec<P> a() {
        return this.l;
    }
}

