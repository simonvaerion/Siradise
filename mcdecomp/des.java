/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class des
extends ddx {
    @Nullable
    private volatile dwt n;
    private volatile dec o = dec.c;
    private final List<qr> p = Lists.newArrayList();
    private final Map<dhg.a, ddw> q = new Object2ObjectArrayMap();
    @Nullable
    private dgy r;
    private final efr<cpn> s;
    private final efr<dxd> t;

    public des(clt $$0, dev $$1, cmo $$2, hr<cnk> $$3, @Nullable din $$4) {
        this($$0, $$1, null, new efr<cpn>(), new efr<dxd>(), $$2, $$3, $$4);
    }

    public des(clt $$0, dev $$1, @Nullable dej[] $$2, efr<cpn> $$3, efr<dxd> $$4, cmo $$5, hr<cnk> $$6, @Nullable din $$7) {
        super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
        this.s = $$3;
        this.t = $$4;
    }

    @Override
    public efw<cpn> o() {
        return this.s;
    }

    @Override
    public efw<dxd> p() {
        return this.t;
    }

    @Override
    public ddx.a q() {
        return new ddx.a(this.s, this.t);
    }

    @Override
    public dcb a_(gu $$0) {
        int $$1 = $$0.v();
        if (this.d($$1)) {
            return cpo.nb.n();
        }
        dej $$2 = this.b(this.e($$1));
        if ($$2.c()) {
            return cpo.a.n();
        }
        return $$2.a($$0.u() & 0xF, $$1 & 0xF, $$0.w() & 0xF);
    }

    @Override
    public dxe b_(gu $$0) {
        int $$1 = $$0.v();
        if (this.d($$1)) {
            return dxf.a.g();
        }
        dej $$2 = this.b(this.e($$1));
        if ($$2.c()) {
            return dxf.a.g();
        }
        return $$2.b($$0.u() & 0xF, $$1 & 0xF, $$0.w() & 0xF);
    }

    @Override
    @Nullable
    public dcb a(gu $$0, dcb $$1, boolean $$2) {
        int $$3 = $$0.u();
        int $$4 = $$0.v();
        int $$5 = $$0.w();
        if ($$4 < this.C_() || $$4 >= this.aj()) {
            return cpo.nb.n();
        }
        int $$6 = this.e($$4);
        dej $$7 = this.b($$6);
        boolean $$8 = $$7.c();
        if ($$8 && $$1.a(cpo.a)) {
            return $$1;
        }
        int $$9 = hx.b($$3);
        int $$10 = hx.b($$4);
        int $$11 = hx.b($$5);
        dcb $$12 = $$7.a($$9, $$10, $$11, $$1);
        if (this.o.b(dec.k)) {
            boolean $$13 = $$7.c();
            if ($$13 != $$8) {
                this.n.a($$0, $$13);
            }
            if (dwv.a((cls)this, $$0, $$12, $$1)) {
                this.i.a((cls)this, $$9, $$4, $$11);
                this.n.a($$0);
            }
        }
        EnumSet<dhk.a> $$14 = this.j().h();
        EnumSet<dhk.a> $$15 = null;
        for (dhk.a $$16 : $$14) {
            dhk $$17 = (dhk)this.h.get($$16);
            if ($$17 != null) continue;
            if ($$15 == null) {
                $$15 = EnumSet.noneOf(dhk.a.class);
            }
            $$15.add($$16);
        }
        if ($$15 != null) {
            dhk.a(this, $$15);
        }
        for (dhk.a $$18 : $$14) {
            ((dhk)this.h.get($$18)).a($$9, $$4, $$11, $$1);
        }
        return $$12;
    }

    @Override
    public void a(czn $$0) {
        this.k.put($$0.p(), $$0);
    }

    @Override
    @Nullable
    public czn c_(gu $$0) {
        return (czn)this.k.get($$0);
    }

    public Map<gu, czn> D() {
        return this.k;
    }

    public void b(qr $$0) {
        this.p.add($$0);
    }

    @Override
    public void a(bfj $$0) {
        if ($$0.bM()) {
            return;
        }
        qr $$1 = new qr();
        $$0.e($$1);
        this.b($$1);
    }

    @Override
    public void a(dsa $$0, dsi $$1) {
        dgy $$2 = this.x();
        if ($$2 != null && $$1.b()) {
            drs $$3 = $$1.a();
            cmo $$4 = this.z();
            if ($$3.h() < $$4.C_() || $$3.k() >= $$4.aj()) {
                return;
            }
        }
        super.a($$0, $$1);
    }

    public List<qr> E() {
        return this.p;
    }

    @Override
    public dec j() {
        return this.o;
    }

    public void a(dec $$0) {
        this.o = $$0;
        if (this.r != null && $$0.b(this.r.a())) {
            this.a((dgy)null);
        }
        this.a(true);
    }

    @Override
    public he<cnk> getNoiseBiome(int $$0, int $$1, int $$2) {
        if (this.k().b(dec.f)) {
            return super.getNoiseBiome($$0, $$1, $$2);
        }
        throw new IllegalStateException("Asking for biomes before we have biomes");
    }

    public static short j(gu $$0) {
        int $$1 = $$0.u();
        int $$2 = $$0.v();
        int $$3 = $$0.w();
        int $$4 = $$1 & 0xF;
        int $$5 = $$2 & 0xF;
        int $$6 = $$3 & 0xF;
        return (short)($$4 | $$5 << 4 | $$6 << 8);
    }

    public static gu a(short $$0, int $$1, clt $$2) {
        int $$3 = hx.a($$2.e, $$0 & 0xF);
        int $$4 = hx.a($$1, $$0 >>> 4 & 0xF);
        int $$5 = hx.a($$2.f, $$0 >>> 8 & 0xF);
        return new gu($$3, $$4, $$5);
    }

    @Override
    public void e(gu $$0) {
        if (!this.r($$0)) {
            ddx.a(this.b, this.e($$0.v())).add(des.j($$0));
        }
    }

    @Override
    public void a(short $$0, int $$1) {
        ddx.a(this.b, $$1).add($$0);
    }

    public Map<gu, qr> F() {
        return Collections.unmodifiableMap(this.j);
    }

    @Override
    @Nullable
    public qr g(gu $$0) {
        czn $$1 = this.c_($$0);
        if ($$1 != null) {
            return $$1.m();
        }
        return (qr)this.j.get($$0);
    }

    @Override
    public void d(gu $$0) {
        this.k.remove($$0);
        this.j.remove($$0);
    }

    @Nullable
    public ddw a(dhg.a $$0) {
        return this.q.get($$0);
    }

    public ddw b(dhg.a $$02) {
        return this.q.computeIfAbsent($$02, $$0 -> new ddw(this.D_(), this.C_()));
    }

    public void a(dhg.a $$0, ddw $$1) {
        this.q.put($$0, $$1);
    }

    public void a(dwt $$0) {
        this.n = $$0;
    }

    public void a(@Nullable dgy $$0) {
        this.r = $$0;
    }

    @Override
    @Nullable
    public dgy x() {
        return this.r;
    }

    private static <T> efo<T> a(efr<T> $$0) {
        return new efo<T>($$0.b());
    }

    public efo<cpn> G() {
        return des.a(this.s);
    }

    public efo<dxd> H() {
        return des.a(this.t);
    }

    @Override
    public cmo z() {
        if (this.y()) {
            return dgy.b;
        }
        return this;
    }
}

