/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public interface dsj<S extends dsa> {
    public static final dsj<dtm> a = dsj.a("buried_treasure", dtm.d);
    public static final dsj<dto> b = dsj.a("desert_pyramid", dto.d);
    public static final dsj<dtq> c = dsj.a("end_city", dtq.d);
    public static final dsj<dtz> d = dsj.a("fortress", dtz.e);
    public static final dsj<dts> e = dsj.a("igloo", dts.d);
    public static final dsj<dtt> f = dsj.a("jigsaw", dtt.e);
    public static final dsj<dtv> g = dsj.a("jungle_temple", dtv.d);
    public static final dsj<dtx> h = dsj.a("mineshaft", dtx.d);
    public static final dsj<dub> i = dsj.a("nether_fossil", dub.d);
    public static final dsj<dud> j = dsj.a("ocean_monument", dud.d);
    public static final dsj<duf> k = dsj.a("ocean_ruin", duf.d);
    public static final dsj<duh> l = dsj.a("ruined_portal", duh.d);
    public static final dsj<duj> m = dsj.a("shipwreck", duj.d);
    public static final dsj<dul> n = dsj.a("stronghold", dul.d);
    public static final dsj<dun> o = dsj.a("swamp_hut", dun.d);
    public static final dsj<dup> p = dsj.a("woodland_mansion", dup.d);

    public Codec<S> codec();

    private static <S extends dsa> dsj<S> a(String $$0, Codec<S> $$1) {
        return hr.a(jb.U, $$0, () -> $$1);
    }
}

