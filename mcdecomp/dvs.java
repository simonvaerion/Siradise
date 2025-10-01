/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 */
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public interface dvs<P extends dvq> {
    public static final Codec<dvq> a = jb.ah.q().dispatch("processor_type", dvq::a, dvs::codec);
    public static final Codec<dvr> b = a.listOf().xmap(dvr::new, dvr::a);
    public static final Codec<dvr> c = Codec.either((Codec)b.fieldOf("processors").codec(), b).xmap($$02 -> (dvr)$$02.map($$0 -> $$0, $$0 -> $$0), Either::left);
    public static final Codec<he<dvr>> d = acm.a(jc.aA, c);
    public static final dvs<duv> e = dvs.a("block_ignore", duv.a);
    public static final dvs<dux> f = dvs.a("block_rot", dux.a);
    public static final dvs<dva> g = dvs.a("gravity", dva.a);
    public static final dvs<dvb> h = dvs.a("jigsaw_replacement", dvb.a);
    public static final dvs<dvm> i = dvs.a("rule", dvm.a);
    public static final dvs<dve> j = dvs.a("nop", dve.a);
    public static final dvs<duu> k = dvs.a("block_age", duu.a);
    public static final dvs<dut> l = dvs.a("blackstone_replace", dut.a);
    public static final dvs<dvc> m = dvs.a("lava_submerged_block", dvc.a);
    public static final dvs<dvj> n = dvs.a("protected_blocks", dvj.b);
    public static final dvs<duz> o = dvs.a("capped", duz.a);

    public Codec<P> codec();

    public static <P extends dvq> dvs<P> a(String $$0, Codec<P> $$1) {
        return hr.a(jb.ah, $$0, () -> $$1);
    }
}

