/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.EnumSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class fmc
implements flu<dac> {
    private static final String a = "neck";
    private static final String b = "front";
    private static final String c = "back";
    private static final String d = "left";
    private static final String e = "right";
    private static final String f = "top";
    private static final String g = "bottom";
    private final fee h;
    private final fee i;
    private final fee j;
    private final fee k;
    private final fee l;
    private final fee m;
    private final fee n;
    private final fwu o = Objects.requireNonNull(fkj.c(dad.a));

    public fmc(flv.a $$0) {
        fee $$1 = $$0.a(fed.E);
        this.h = $$1.b(a);
        this.m = $$1.b(f);
        this.n = $$1.b(g);
        fee $$2 = $$0.a(fed.F);
        this.i = $$2.b(b);
        this.j = $$2.b(c);
        this.k = $$2.b(d);
        this.l = $$2.b(e);
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        fei $$2 = new fei(0.2f);
        fei $$3 = new fei(-0.1f);
        $$1.a(a, fej.c().a(0, 0).a(4.0f, 17.0f, 4.0f, 8.0f, 3.0f, 8.0f, $$3).a(0, 5).a(5.0f, 20.0f, 5.0f, 6.0f, 1.0f, 6.0f, $$2), feg.a(0.0f, 37.0f, 16.0f, (float)Math.PI, 0.0f, 0.0f));
        fej $$4 = fej.c().a(-14, 13).a(0.0f, 0.0f, 0.0f, 14.0f, 0.0f, 14.0f);
        $$1.a(f, $$4, feg.a(1.0f, 16.0f, 1.0f, 0.0f, 0.0f, 0.0f));
        $$1.a(g, $$4, feg.a(1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f));
        return fek.a($$0, 32, 32);
    }

    public static fek c() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        fej $$2 = fej.c().a(1, 0).a(0.0f, 0.0f, 0.0f, 14.0f, 16.0f, 0.0f, EnumSet.of(ha.c));
        $$1.a(c, $$2, feg.a(15.0f, 16.0f, 1.0f, 0.0f, 0.0f, (float)Math.PI));
        $$1.a(d, $$2, feg.a(1.0f, 16.0f, 1.0f, 0.0f, -1.5707964f, (float)Math.PI));
        $$1.a(e, $$2, feg.a(15.0f, 16.0f, 15.0f, 0.0f, 1.5707964f, (float)Math.PI));
        $$1.a(b, $$2, feg.a(1.0f, 16.0f, 15.0f, (float)Math.PI, 0.0f, 0.0f));
        return fek.a($$0, 16, 16);
    }

    @Nullable
    private static fwu a(cfu $$0) {
        fwu $$1 = fkj.c(dad.a($$0));
        if ($$1 == null) {
            $$1 = fkj.c(dad.a(cgc.pX));
        }
        return $$1;
    }

    @Override
    public void a(dac $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
        $$2.a();
        ha $$6 = $$0.d();
        $$2.a(0.5, 0.0, 0.5);
        $$2.a(a.d.rotationDegrees(180.0f - $$6.p()));
        $$2.a(-0.5, 0.0, -0.5);
        ein $$7 = this.o.a($$3, fkf::b);
        this.h.a($$2, $$7, $$4, $$5);
        this.m.a($$2, $$7, $$4, $$5);
        this.n.a($$2, $$7, $$4, $$5);
        dac.a $$8 = $$0.f();
        this.a(this.i, $$2, $$3, $$4, $$5, fmc.a($$8.e()));
        this.a(this.j, $$2, $$3, $$4, $$5, fmc.a($$8.b()));
        this.a(this.k, $$2, $$3, $$4, $$5, fmc.a($$8.c()));
        this.a(this.l, $$2, $$3, $$4, $$5, fmc.a($$8.d()));
        $$2.b();
    }

    private void a(fee $$0, eij $$1, fjx $$2, int $$3, int $$4, @Nullable fwu $$5) {
        if ($$5 == null) {
            $$5 = fmc.a(cgc.pX);
        }
        if ($$5 != null) {
            $$0.a($$1, $$5.a($$2, fkf::b), $$3, $$4);
        }
    }
}

