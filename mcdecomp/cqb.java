/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMaps
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class cqb
extends coe
implements cwo {
    public static final int c = 1;
    public static final int d = 4;
    public static final ddb e = dcr.az;
    public static final dcs f = coe.b;
    public static final dcs g = dcr.C;
    public static final ToIntFunction<dcb> h = $$0 -> $$0.c(f) != false ? 3 * $$0.c(e) : 0;
    private static final Int2ObjectMap<List<eei>> i = ac.a(() -> {
        Int2ObjectOpenHashMap $$0 = new Int2ObjectOpenHashMap();
        $$0.defaultReturnValue((Object)ImmutableList.of());
        $$0.put(1, (Object)ImmutableList.of((Object)new eei(0.5, 0.5, 0.5)));
        $$0.put(2, (Object)ImmutableList.of((Object)new eei(0.375, 0.44, 0.5), (Object)new eei(0.625, 0.5, 0.44)));
        $$0.put(3, (Object)ImmutableList.of((Object)new eei(0.5, 0.313, 0.625), (Object)new eei(0.375, 0.44, 0.5), (Object)new eei(0.56, 0.5, 0.44)));
        $$0.put(4, (Object)ImmutableList.of((Object)new eei(0.44, 0.313, 0.56), (Object)new eei(0.625, 0.44, 0.56), (Object)new eei(0.375, 0.44, 0.375), (Object)new eei(0.56, 0.5, 0.375)));
        return Int2ObjectMaps.unmodifiable((Int2ObjectMap)$$0);
    });
    private static final efb j = cpn.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
    private static final efb k = cpn.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
    private static final efb l = cpn.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
    private static final efb m = cpn.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

    public cqb(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)((dcb)this.C.b()).a(e, 1)).a(f, false)).a(g, false));
    }

    @Override
    public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
        if ($$3.fO().e && $$3.b($$4).b() && $$0.c(f).booleanValue()) {
            cqb.a($$3, $$0, (cmn)$$1, $$2);
            return bdx.a($$1.B);
        }
        return bdx.d;
    }

    @Override
    public boolean a(dcb $$0, cih $$1) {
        if (!$$1.h() && $$1.n().d() == this.k() && $$0.c(e) < 4) {
            return true;
        }
        return super.a($$0, $$1);
    }

    @Override
    public dcb a(cih $$0) {
        dcb $$1 = $$0.q().a_($$0.a());
        if ($$1.a(this)) {
            return (dcb)$$1.a(e);
        }
        dxe $$2 = $$0.q().b_($$0.a());
        boolean $$3 = $$2.a() == dxf.c;
        return (dcb)super.a($$0).a(g, $$3);
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(g).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(g).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        switch ($$0.c(e)) {
            default: {
                return j;
            }
            case 2: {
                return k;
            }
            case 3: {
                return l;
            }
            case 4: 
        }
        return m;
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(e, f, g);
    }

    @Override
    public boolean a(cmn $$0, gu $$1, dcb $$2, dxe $$3) {
        if ($$2.c(g).booleanValue() || $$3.a() != dxf.c) {
            return false;
        }
        dcb $$4 = (dcb)$$2.a(g, true);
        if ($$2.c(f).booleanValue()) {
            cqb.a(null, $$4, $$0, $$1);
        } else {
            $$0.a($$1, $$4, 3);
        }
        $$0.a($$1, $$3.a(), $$3.a().a($$0));
        return true;
    }

    public static boolean g(dcb $$02) {
        return $$02.a(amw.ae, (dca.a $$0) -> $$0.b(f) && $$0.b(g)) && $$02.c(f) == false && $$02.c(g) == false;
    }

    @Override
    protected Iterable<eei> b(dcb $$0) {
        return (Iterable)i.get($$0.c(e).intValue());
    }

    @Override
    protected boolean d(dcb $$0) {
        return $$0.c(g) == false && super.d($$0);
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        return cpn.a($$1, $$2.d(), ha.b);
    }
}

