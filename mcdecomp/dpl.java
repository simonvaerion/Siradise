/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dpl<P extends dpk> {
    public static final dpl<dpm> a = dpl.a("trunk_vine", dpm.a);
    public static final dpl<dpj> b = dpl.a("leave_vine", dpj.a);
    public static final dpl<dpi> c = dpl.a("cocoa", dpi.a);
    public static final dpl<dph> d = dpl.a("beehive", dph.a);
    public static final dpl<dpf> e = dpl.a("alter_ground", dpf.a);
    public static final dpl<dpg> f = dpl.a("attached_to_leaves", dpg.a);
    private final Codec<P> g;

    private static <P extends dpk> dpl<P> a(String $$0, Codec<P> $$1) {
        return hr.a(jb.aa, $$0, new dpl<P>($$1));
    }

    private dpl(Codec<P> $$0) {
        this.g = $$0;
    }

    public Codec<P> a() {
        return this.g;
    }
}

