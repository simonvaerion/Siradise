/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class flw {
    private static final Map<czp<?>, flv<?>> a = Maps.newHashMap();

    private static <T extends czn> void a(czp<? extends T> $$0, flv<T> $$1) {
        a.put($$0, $$1);
    }

    public static Map<czp<?>, flu<?>> a(flv.a $$0) {
        ImmutableMap.Builder $$1 = ImmutableMap.builder();
        a.forEach(($$2, $$3) -> {
            try {
                $$1.put($$2, $$3.create($$0));
            }
            catch (Exception $$4) {
                throw new IllegalStateException("Failed to create model for " + jb.l.b((czp<?>)$$2), $$4);
            }
        });
        return $$1.build();
    }

    static {
        flw.a(czp.h, fmi::new);
        flw.a(czp.i, fme::new);
        flw.a(czp.j, fmk::new);
        flw.a(czp.k, fmg::new);
        flw.a(czp.b, fma::new);
        flw.a(czp.d, fma::new);
        flw.a(czp.c, fma::new);
        flw.a(czp.m, fmd::new);
        flw.a(czp.D, fmf::new);
        flw.a(czp.n, fmn::new);
        flw.a(czp.v, fmm::new);
        flw.a(czp.o, flq::new);
        flw.a(czp.p, fmj::new);
        flw.a(czp.t, flp::new);
        flw.a(czp.u, fml::new);
        flw.a(czp.x, fmh::new);
        flw.a(czp.y, flr::new);
        flw.a(czp.z, fmb::new);
        flw.a(czp.E, fls::new);
        flw.a(czp.G, flz::new);
        flw.a(czp.N, fly::new);
        flw.a(czp.O, fmc::new);
    }
}

