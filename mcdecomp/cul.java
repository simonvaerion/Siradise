/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cul
extends cpn {
    private static final float b = 1.0f;
    private static final efb c = cpn.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
    private static final efb d = cpn.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
    private static final efb e = cpn.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
    private static final efb f = cpn.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    private static final efb g = cpn.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
    private static final efb h = cpn.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
    private static final Map<ha, dcs> i = cuz.g;
    private static final Map<ha, efb> j = ac.a(Maps.newEnumMap(ha.class), (T $$0) -> {
        $$0.put(ha.c, g);
        $$0.put(ha.f, f);
        $$0.put(ha.d, h);
        $$0.put(ha.e, e);
        $$0.put(ha.b, c);
        $$0.put(ha.a, d);
    });
    protected static final ha[] a = ha.values();
    private final ImmutableMap<dcb, efb> k;
    private final boolean l;
    private final boolean m;
    private final boolean n;

    public cul(dca.d $$0) {
        super($$0);
        this.k(cul.a(this.C));
        this.k = this.a(cul::o);
        this.l = ha.c.a.a().allMatch(this::a);
        this.m = ha.c.a.a().filter(ha.a.a).filter(this::a).count() % 2L == 0L;
        this.n = ha.c.a.a().filter(ha.a.c).filter(this::a).count() % 2L == 0L;
    }

    public static Set<ha> h(dcb $$0) {
        if (!($$0.b() instanceof cul)) {
            return Set.of();
        }
        EnumSet<ha> $$1 = EnumSet.noneOf(ha.class);
        for (ha $$2 : ha.values()) {
            if (!cul.a($$0, $$2)) continue;
            $$1.add($$2);
        }
        return $$1;
    }

    public static Set<ha> a(byte $$0) {
        EnumSet<ha> $$1 = EnumSet.noneOf(ha.class);
        for (ha $$2 : ha.values()) {
            if (($$0 & (byte)(1 << $$2.ordinal())) <= 0) continue;
            $$1.add($$2);
        }
        return $$1;
    }

    public static byte a(Collection<ha> $$0) {
        byte $$1 = 0;
        for (ha $$2 : $$0) {
            $$1 = (byte)($$1 | 1 << $$2.ordinal());
        }
        return $$1;
    }

    protected boolean a(ha $$0) {
        return true;
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        for (ha $$1 : a) {
            if (!this.a($$1)) continue;
            $$0.a(new dde[]{cul.b($$1)});
        }
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if (!cul.n($$0)) {
            return cpo.a.n();
        }
        if (!cul.a($$0, $$1) || cul.a($$3, $$1, $$5, $$2)) {
            return $$0;
        }
        return cul.a($$0, cul.b($$1));
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return (efb)this.k.get((Object)$$0);
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        boolean $$3 = false;
        for (ha $$4 : a) {
            if (!cul.a($$0, $$4)) continue;
            gu $$5 = $$2.a($$4);
            if (!cul.a($$1, $$4, $$5, $$1.a_($$5))) {
                return false;
            }
            $$3 = true;
        }
        return $$3;
    }

    @Override
    public boolean a(dcb $$0, cih $$1) {
        return cul.p($$0);
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        cmm $$1 = $$0.q();
        gu $$2 = $$0.a();
        dcb $$32 = $$1.a_($$2);
        return Arrays.stream($$0.f()).map($$3 -> this.c($$32, (cls)$$1, $$2, (ha)$$3)).filter(Objects::nonNull).findFirst().orElse(null);
    }

    public boolean a(cls $$0, dcb $$1, gu $$2, ha $$3) {
        if (!this.a($$3) || $$1.a(this) && cul.a($$1, $$3)) {
            return false;
        }
        gu $$4 = $$2.a($$3);
        return cul.a($$0, $$3, $$4, $$0.a_($$4));
    }

    @Nullable
    public dcb c(dcb $$0, cls $$1, gu $$2, ha $$3) {
        dcb $$6;
        if (!this.a($$1, $$0, $$2, $$3)) {
            return null;
        }
        if ($$0.a(this)) {
            dcb $$4 = $$0;
        } else if (this.g() && $$0.u().a(dxf.c)) {
            dcb $$5 = (dcb)this.n().a(dcr.C, true);
        } else {
            $$6 = this.n();
        }
        return (dcb)$$6.a(cul.b($$3), true);
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        if (!this.l) {
            return $$0;
        }
        return this.a($$0, $$1::a);
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        if ($$1 == cui.c && !this.m) {
            return $$0;
        }
        if ($$1 == cui.b && !this.n) {
            return $$0;
        }
        return this.a($$0, $$1::b);
    }

    private dcb a(dcb $$0, Function<ha, ha> $$1) {
        dcb $$2 = $$0;
        for (ha $$3 : a) {
            if (!this.a($$3)) continue;
            $$2 = (dcb)$$2.a(cul.b($$1.apply($$3)), $$0.c(cul.b($$3)));
        }
        return $$2;
    }

    public static boolean a(dcb $$0, ha $$1) {
        dcs $$2 = cul.b($$1);
        return $$0.b($$2) && $$0.c($$2) != false;
    }

    public static boolean a(cls $$0, ha $$1, gu $$2, dcb $$3) {
        return cpn.a($$3.l($$0, $$2), $$1.g()) || cpn.a($$3.k($$0, $$2), $$1.g());
    }

    private boolean g() {
        return this.C.d().contains(dcr.C);
    }

    private static dcb a(dcb $$0, dcs $$1) {
        dcb $$2 = (dcb)$$0.a($$1, false);
        if (cul.n($$2)) {
            return $$2;
        }
        return cpo.a.n();
    }

    public static dcs b(ha $$0) {
        return i.get($$0);
    }

    private static dcb a(dcc<cpn, dcb> $$0) {
        dcb $$1 = $$0.b();
        for (dcs $$2 : i.values()) {
            if (!$$1.b($$2)) continue;
            $$1 = (dcb)$$1.a($$2, false);
        }
        return $$1;
    }

    private static efb o(dcb $$0) {
        efb $$1 = eey.a();
        for (ha $$2 : a) {
            if (!cul.a($$0, $$2)) continue;
            $$1 = eey.a($$1, j.get($$2));
        }
        return $$1.b() ? eey.b() : $$1;
    }

    protected static boolean n(dcb $$0) {
        return Arrays.stream(a).anyMatch($$1 -> cul.a($$0, $$1));
    }

    private static boolean p(dcb $$0) {
        return Arrays.stream(a).anyMatch($$1 -> !cul.a($$0, $$1));
    }

    public abstract cum b();
}

