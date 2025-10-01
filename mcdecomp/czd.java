/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class czd
extends czn
implements beb {
    public static final int a = 6;
    public static final String b = "Patterns";
    public static final String c = "Pattern";
    public static final String d = "Color";
    @Nullable
    private sw e;
    private cen f;
    @Nullable
    private qx g;
    @Nullable
    private List<Pair<he<cze>, cen>> h;

    public czd(gu $$0, dcb $$1) {
        super(czp.t, $$0, $$1);
        this.f = ((cod)$$1.b()).a();
    }

    public czd(gu $$0, dcb $$1, cen $$2) {
        this($$0, $$1);
        this.f = $$2;
    }

    @Nullable
    public static qx a(cfz $$0) {
        qx $$1 = null;
        qr $$2 = cds.a($$0);
        if ($$2 != null && $$2.b(b, 9)) {
            $$1 = $$2.c(b, 10).e();
        }
        return $$1;
    }

    public void a(cfz $$0, cen $$1) {
        this.f = $$1;
        this.b($$0);
    }

    public void b(cfz $$0) {
        this.g = czd.a($$0);
        this.h = null;
        this.e = $$0.A() ? $$0.y() : null;
    }

    @Override
    public sw Z() {
        if (this.e != null) {
            return this.e;
        }
        return sw.c("block.minecraft.banner");
    }

    @Override
    @Nullable
    public sw ab() {
        return this.e;
    }

    public void a(sw $$0) {
        this.e = $$0;
    }

    @Override
    protected void b(qr $$0) {
        super.b($$0);
        if (this.g != null) {
            $$0.a(b, this.g);
        }
        if (this.e != null) {
            $$0.a("CustomName", sw.a.a(this.e));
        }
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        if ($$0.b("CustomName", 8)) {
            this.e = sw.a.a($$0.l("CustomName"));
        }
        this.g = $$0.c(b, 10);
        this.h = null;
    }

    public uz a() {
        return uz.a(this);
    }

    @Override
    public qr ao_() {
        return this.o();
    }

    public static int c(cfz $$0) {
        qr $$1 = cds.a($$0);
        if ($$1 != null && $$1.e(b)) {
            return $$1.c(b, 10).size();
        }
        return 0;
    }

    public List<Pair<he<cze>, cen>> c() {
        if (this.h == null) {
            this.h = czd.a(this.f, this.g);
        }
        return this.h;
    }

    public static List<Pair<he<cze>, cen>> a(cen $$0, @Nullable qx $$1) {
        ArrayList $$2 = Lists.newArrayList();
        $$2.add(Pair.of(jb.al.f(czf.a), (Object)$$0));
        if ($$1 != null) {
            for (int $$3 = 0; $$3 < $$1.size(); ++$$3) {
                qr $$4 = $$1.a($$3);
                he<cze> $$5 = cze.a($$4.l(c));
                if ($$5 == null) continue;
                int $$6 = $$4.h(d);
                $$2.add(Pair.of($$5, (Object)cen.a($$6)));
            }
        }
        return $$2;
    }

    public static void d(cfz $$0) {
        qr $$1 = cds.a($$0);
        if ($$1 == null || !$$1.b(b, 9)) {
            return;
        }
        qx $$2 = $$1.c(b, 10);
        if ($$2.isEmpty()) {
            return;
        }
        $$2.c($$2.size() - 1);
        if ($$2.isEmpty()) {
            $$1.r(b);
        }
        cds.a($$0, czp.t, $$1);
    }

    public cfz f() {
        cfz $$0 = new cfz(cot.a(this.f));
        if (this.g != null && !this.g.isEmpty()) {
            qr $$1 = new qr();
            $$1.a(b, this.g.e());
            cds.a($$0, this.u(), $$1);
        }
        if (this.e != null) {
            $$0.a(this.e);
        }
        return $$0;
    }

    public cen g() {
        return this.f;
    }

    public /* synthetic */ uo h() {
        return this.a();
    }
}

