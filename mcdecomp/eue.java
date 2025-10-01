/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eue {
    private static final Logger a = LogUtils.getLogger();
    private static final Map<cck<?>, a<?, ?>> b = Maps.newHashMap();

    public static <T extends cbf> void a(@Nullable cck<T> $$0, enn $$1, int $$2, sw $$3) {
        if ($$0 == null) {
            a.warn("Trying to open invalid screen with name: {}", (Object)$$3.getString());
            return;
        }
        a<T, ?> $$4 = eue.a($$0);
        if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", (Object)jb.s.b($$0));
            return;
        }
        $$4.a($$3, $$0, $$1, $$2);
    }

    @Nullable
    private static <T extends cbf> a<T, ?> a(cck<T> $$0) {
        return b.get($$0);
    }

    private static <M extends cbf, U extends euq> void a(cck<? extends M> $$0, a<M, U> $$1) {
        a<M, U> $$2 = b.put($$0, $$1);
        if ($$2 != null) {
            throw new IllegalStateException("Duplicate registration for " + jb.s.b($$0));
        }
    }

    public static boolean a() {
        boolean $$0 = false;
        for (cck cck2 : jb.s) {
            if (b.containsKey(cck2)) continue;
            a.debug("Menu {} has no matching screen", (Object)jb.s.b(cck2));
            $$0 = true;
        }
        return $$0;
    }

    static {
        eue.a(cck.a, ewa::new);
        eue.a(cck.b, ewa::new);
        eue.a(cck.c, ewa::new);
        eue.a(cck.d, ewa::new);
        eue.a(cck.e, ewa::new);
        eue.a(cck.f, ewa::new);
        eue.a(cck.g, ewf::new);
        eue.a(cck.h, evs::new);
        eue.a(cck.i, evt::new);
        eue.a(cck.j, evu::new);
        eue.a(cck.k, evx::new);
        eue.a(cck.l, ewb::new);
        eue.a(cck.m, ewi::new);
        eue.a(cck.n, ewj::new);
        eue.a(cck.o, ewk::new);
        eue.a(cck.p, ewm::new);
        eue.a(cck.q, ewr::new);
        eue.a(cck.r, ews::new);
        eue.a(cck.s, ewu::new);
        eue.a(cck.t, ewx::new);
        eue.a(cck.u, ewz::new);
        eue.a(cck.v, exa::new);
        eue.a(cck.w, evy::new);
        eue.a(cck.x, exb::new);
    }

    static interface a<T extends cbf, U extends euq> {
        default public void a(sw $$0, cck<T> $$1, enn $$2, int $$3) {
            U $$4 = this.create($$1.a($$3, $$2.t.fN()), $$2.t.fN(), $$0);
            $$2.t.bR = ((ewt)$$4).C();
            $$2.a((euq)$$4);
        }

        public U create(T var1, byn var2, sw var3);
    }
}

