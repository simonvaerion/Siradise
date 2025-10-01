/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class drw
extends dse {
    private static final Logger d = LogUtils.getLogger();
    protected final dth a;
    protected gu b;
    private final int h;
    protected final cvz c;
    private final List<dtc> i = Lists.newArrayList();
    private final dvu j;

    public drw(dvu $$0, dth $$1, gu $$2, int $$3, cvz $$4, drs $$5) {
        super(dsr.ad, 0, $$5);
        this.j = $$0;
        this.a = $$1;
        this.b = $$2;
        this.h = $$3;
        this.c = $$4;
    }

    public drw(dsq $$0, qr $$12) {
        super(dsr.ad, $$12);
        this.j = $$0.c();
        this.b = new gu($$12.h("PosX"), $$12.h("PosY"), $$12.h("PosZ"));
        this.h = $$12.h("ground_level_delta");
        aco<rk> $$2 = aco.a(rc.a, $$0.b());
        this.a = (dth)dth.e.parse($$2, (Object)$$12.p("pool_element")).resultOrPartial(arg_0 -> ((Logger)d).error(arg_0)).orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
        this.c = cvz.valueOf($$12.l("rotation"));
        this.f = this.a.a(this.j, this.b, this.c);
        qx $$3 = $$12.c("junctions", 10);
        this.i.clear();
        $$3.forEach($$1 -> this.i.add(dtc.a(new Dynamic($$2, $$1))));
    }

    @Override
    protected void a(dsq $$0, qr $$12) {
        $$12.a("PosX", this.b.u());
        $$12.a("PosY", this.b.v());
        $$12.a("PosZ", this.b.w());
        $$12.a("ground_level_delta", this.h);
        aco<rk> $$2 = aco.a(rc.a, $$0.b());
        dth.e.encodeStart($$2, (Object)this.a).resultOrPartial(arg_0 -> ((Logger)d).error(arg_0)).ifPresent($$1 -> $$12.a("pool_element", (rk)$$1));
        $$12.a("rotation", this.c.name());
        qx $$3 = new qx();
        for (dtc $$4 : this.i) {
            $$3.add((rk)$$4.a($$2).getValue());
        }
        $$12.a("junctions", $$3);
    }

    @Override
    public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
        this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
    }

    public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, gu $$5, boolean $$6) {
        this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, $$6);
    }

    @Override
    public void a(int $$0, int $$1, int $$2) {
        super.a($$0, $$1, $$2);
        this.b = this.b.b($$0, $$1, $$2);
    }

    @Override
    public cvz a() {
        return this.c;
    }

    public String toString() {
        return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
    }

    public dth b() {
        return this.a;
    }

    public gu c() {
        return this.b;
    }

    public int d() {
        return this.h;
    }

    public void a(dtc $$0) {
        this.i.add($$0);
    }

    public List<dtc> e() {
        return this.i;
    }
}

