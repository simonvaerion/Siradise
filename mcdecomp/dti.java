/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public interface dti<P extends dth> {
    public static final dti<dtg> a = dti.a("single_pool_element", dtg.b);
    public static final dti<dtf> b = dti.a("list_pool_element", dtf.a);
    public static final dti<dtb> c = dti.a("feature_pool_element", dtb.a);
    public static final dti<dta> d = dti.a("empty_pool_element", dta.a);
    public static final dti<dte> e = dti.a("legacy_single_pool_element", dte.a);

    public Codec<P> codec();

    public static <P extends dth> dti<P> a(String $$0, Codec<P> $$1) {
        return hr.a(jb.ai, $$0, () -> $$1);
    }
}

