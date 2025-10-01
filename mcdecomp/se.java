/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMaps
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class se
extends Enum<se>
implements un.b {
    public static final /* enum */ se a = new se(-1, se.b().a(up.a, new a().a(abb.class, abb::new)));
    public static final /* enum */ se b = new se(0, se.b().a(up.b, new a().b(vd.class, vd::new).a(us.class, us::new).a(ut.class, ut::new).a(uu.class, uu::new).a(uv.class, uv::new).a(uw.class, uw::new).a(ux.class, ux::new).a(uy.class, uy::new).a(uz.class, uz::new).a(va.class, va::new).a(vb.class, vb::new).a(vc.class, vc::new).a(ve.class, ve::new).a(vf.class, vf::new).a(vg.class, vg::new).a(vh.class, vh::new).a(vi.class, vi::new).a(vj.class, vj::new).a(vk.class, vk::new).a(vl.class, vl::new).a(vm.class, vm::new).a(vn.class, vn::new).a(vo.class, vo::new).a(vp.class, vp::new).a(vq.class, vq::new).a(vr.class, vr::new).a(vs.class, vs::new).a(vt.class, vt::new).a(vu.class, vu::new).a(vv.class, vv::new).a(vw.class, vw::new).a(vx.class, vx::new).a(vy.class, vy::new).a(vz.class, vz::new).a(wa.class, wa::new).a(wb.class, wb::new).a(wd.class, wd::new).a(we.class, we::new).a(wf.class, wf::new).a(wg.class, wg::new).a(wi.class, wi::new).a(wj.class, wj::new).a(wk.class, wk::new).a(wl.a.class, wl.a::b).a(wl.b.class, wl.b::b).a(wl.c.class, wl.c::b).a(wm.class, wm::new).a(wn.class, wn::new).a(wo.class, wo::new).a(wp.class, wp::new).a(wq.class, wq::new).a(wr.class, wr::new).a(ws.class, ws::new).a(wt.class, wt::new).a(wu.class, wu::new).a(wv.class, wv::new).a(ww.class, ww::new).a(wx.class, wx::new).a(wy.class, wy::new).a(wz.class, wz::new).a(xa.class, xa::new).a(xb.class, xb::new).a(xc.class, xc::new).a(xd.class, xd::new).a(xe.class, xe::new).a(xf.class, xf::new).a(xg.class, xg::new).a(xh.class, xh::new).a(xi.class, xi::new).a(xj.class, xj::new).a(xk.class, xk::new).a(xl.class, xl::new).a(xm.class, xm::new).a(xn.class, xn::new).a(xo.class, xo::new).a(xp.class, xp::new).a(xq.class, xq::new).a(xr.class, xr::new).a(xs.class, xs::new).a(xt.class, xt::new).a(xu.class, xu::new).a(xv.class, xv::new).a(xw.class, xw::new).a(xx.class, xx::new).a(xy.class, xy::new).a(xz.class, xz::new).a(ya.class, ya::new).a(yb.class, yb::new).a(yc.class, yc::new).a(yd.class, yd::new).a(ye.class, ye::new).a(yf.class, yf::new).a(yg.class, yg::new).a(yh.class, yh::new).a(yi.class, yi::new).a(yj.class, yj::new).a(yk.class, yk::new).a(yl.class, yl::new).a(ym.class, ym::new).a(yn.class, yn::new).a(yo.class, yo::new).a(yp.class, yp::new).a(yq.class, yq::new).a(yr.class, yr::new).a(ys.class, ys::new).a(yt.class, yt::new).a(yu.class, yu::new).a(yv.class, yv::new).a(yw.class, yw::new).a(yx.class, yx::new).a(yy.class, yy::new)).a(up.a, new a().a(zd.class, zd::new).a(ze.class, ze::new).a(zf.class, zf::new).a(zg.class, zg::new).a(zh.class, zh::new).a(zi.class, zi::new).a(zj.class, zj::new).a(zk.class, zk::new).a(zl.class, zl::new).a(zm.class, zm::new).a(zn.class, zn::new).a(zo.class, zo::new).a(zp.class, zp::new).a(zq.class, zq::new).a(zr.class, zr::new).a(zs.class, zs::new).a(zt.class, zt::new).a(zu.class, zu::new).a(zv.class, zv::new).a(zw.class, zw::new).a(zx.a.class, zx.a::b).a(zx.b.class, zx.b::b).a(zx.c.class, zx.c::b).a(zx.d.class, zx.d::b).a(zy.class, zy::new).a(zz.class, zz::new).a(aaa.class, aaa::new).a(aab.class, aab::new).a(aac.class, aac::new).a(aad.class, aad::new).a(aae.class, aae::new).a(aaf.class, aaf::new).a(aag.class, aag::new).a(aah.class, aah::new).a(aai.class, aai::new).a(aaj.class, aaj::new).a(aak.class, aak::new).a(aal.class, aal::new).a(aam.class, aam::new).a(aan.class, aan::new).a(aao.class, aao::new).a(aap.class, aap::new).a(aaq.class, aaq::new).a(aar.class, aar::new).a(aas.class, aas::new).a(aat.class, aat::new).a(aau.class, aau::new).a(aav.class, aav::new).a(aaw.class, aaw::new).a(aax.class, aax::new).a(aay.class, aay::new)));
    public static final /* enum */ se c = new se(1, se.b().a(up.a, new a().a(abw.class, abw::new).a(abv.class, abv::new)).a(up.b, new a().a(abs.class, abs::new).a(abr.class, abr::new)));
    public static final /* enum */ se d = new se(2, se.b().a(up.b, new a().a(abj.class, abj::new).a(abh.class, abh::new).a(abg.class, abg::new).a(abi.class, abi::new).a(abf.class, abf::new)).a(up.a, new a().a(abm.class, abm::new).a(abn.class, abn::new).a(abl.class, abl::new)));
    public static final int e = -1;
    private static final int f = -1;
    private static final int g = 2;
    private static final se[] h;
    private static final Map<Class<? extends uo<?>>, se> i;
    private final int j;
    private final Map<up, ? extends a<?>> k;
    private static final /* synthetic */ se[] l;

    public static se[] values() {
        return (se[])l.clone();
    }

    public static se valueOf(String $$0) {
        return Enum.valueOf(se.class, $$0);
    }

    private static b b() {
        return new b();
    }

    private se(int $$0, b $$1) {
        this.j = $$0;
        this.k = $$1.a;
    }

    public int a(up $$0, uo<?> $$1) {
        return this.k.get((Object)$$0).a($$1.getClass());
    }

    @Override
    public un a(up $$0) {
        return this.k.get((Object)$$0).a();
    }

    @aqa
    public Int2ObjectMap<Class<? extends uo<?>>> b(up $$0) {
        Int2ObjectOpenHashMap $$1 = new Int2ObjectOpenHashMap();
        a<?> $$2 = this.k.get((Object)$$0);
        if ($$2 == null) {
            return Int2ObjectMaps.emptyMap();
        }
        $$2.b.forEach((arg_0, arg_1) -> se.a((Int2ObjectMap)$$1, arg_0, arg_1));
        return $$1;
    }

    @Nullable
    public uo<?> a(up $$0, int $$1, sf $$2) {
        return this.k.get((Object)$$0).a($$1, $$2);
    }

    public int a() {
        return this.j;
    }

    @Nullable
    public static se a(int $$0) {
        if ($$0 < -1 || $$0 > 2) {
            return null;
        }
        return h[$$0 - -1];
    }

    @Nullable
    public static se a(uo<?> $$0) {
        return i.get($$0.getClass());
    }

    private static /* synthetic */ void a(Int2ObjectMap $$0, Class $$1, Integer $$2) {
        $$0.put($$2.intValue(), (Object)$$1);
    }

    private static /* synthetic */ se[] c() {
        return new se[]{a, b, c, d};
    }

    static {
        l = se.c();
        h = new se[4];
        i = Maps.newHashMap();
        for (se $$0 : se.values()) {
            int $$1 = $$0.a();
            if ($$1 < -1 || $$1 > 2) {
                throw new Error("Invalid protocol ID " + $$1);
            }
            se.h[$$1 - -1] = $$0;
            $$0.k.forEach(($$12, $$2) -> $$2.a((Class<? extends uo<?>> $$1) -> {
                if (i.containsKey($$1) && i.get($$1) != $$0) {
                    throw new IllegalStateException("Packet " + $$1 + " is already assigned to protocol " + i.get($$1) + " - can't reassign to " + $$0);
                }
                i.put((Class<uo<?>>)$$1, $$0);
            }));
        }
    }

    static class b {
        final Map<up, a<?>> a = Maps.newEnumMap(up.class);

        b() {
        }

        public <T extends sk> b a(up $$0, a<T> $$1) {
            this.a.put($$0, $$1);
            return this;
        }
    }

    static class a<T extends sk> {
        private static final Logger a = LogUtils.getLogger();
        final Object2IntMap<Class<? extends uo<T>>> b = (Object2IntMap)ac.a(new Object2IntOpenHashMap(), (T $$0) -> $$0.defaultReturnValue(-1));
        private final List<Function<sf, ? extends uo<T>>> c = Lists.newArrayList();
        private un d = un.c;
        private final Set<Class<? extends uo<T>>> e = new HashSet<Class<? extends uo<T>>>();

        a() {
        }

        public <P extends uo<T>> a<T> a(Class<P> $$0, Function<sf, P> $$1) {
            int $$2 = this.c.size();
            int $$3 = this.b.put($$0, $$2);
            if ($$3 != -1) {
                String $$4 = "Packet " + $$0 + " is already registered to ID " + $$3;
                a.error(LogUtils.FATAL_MARKER, $$4);
                throw new IllegalArgumentException($$4);
            }
            this.c.add($$1);
            return this;
        }

        public <P extends um<T>> a<T> b(Class<P> $$0, Function<Iterable<uo<T>>, P> $$12) {
            if (this.d != un.c) {
                throw new IllegalStateException("Bundle packet already configured");
            }
            ul $$2 = new ul();
            this.a(ul.class, (sf $$1) -> $$2);
            this.d = un.a($$0, $$12, $$2);
            this.e.add($$0);
            return this;
        }

        public int a(Class<?> $$0) {
            return this.b.getInt($$0);
        }

        @Nullable
        public uo<?> a(int $$0, sf $$1) {
            Function<sf, uo<sf>> $$2 = this.c.get($$0);
            return $$2 != null ? $$2.apply($$1) : null;
        }

        public void a(Consumer<Class<? extends uo<?>>> $$02) {
            this.b.keySet().stream().filter($$0 -> $$0 != ul.class).forEach($$02);
            this.e.forEach($$02);
        }

        public un a() {
            return this.d;
        }
    }
}

