/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ceb
extends cfu {
    private static final String b = "Items";
    public static final int a = 64;
    private static final int c = 4;
    private static final int d = apa.f(0.4f, 0.4f, 1.0f);

    public ceb(cfu.a $$0) {
        super($$0);
    }

    public static float d(cfz $$0) {
        return (float)ceb.o($$0) / 64.0f;
    }

    @Override
    public boolean a(cfz $$0, ccx $$1, cbn $$22, byo $$3) {
        if ($$22 != cbn.b) {
            return false;
        }
        cfz $$4 = $$1.e();
        if ($$4.b()) {
            this.a($$3);
            ceb.p($$0).ifPresent($$2 -> ceb.b($$0, $$1.f((cfz)$$2)));
        } else if ($$4.d().ah_()) {
            int $$5 = (64 - ceb.o($$0)) / ceb.k($$4);
            int $$6 = ceb.b($$0, $$1.b($$4.L(), $$5, $$3));
            if ($$6 > 0) {
                this.b($$3);
            }
        }
        return true;
    }

    @Override
    public boolean a(cfz $$0, cfz $$1, ccx $$22, cbn $$3, byo $$4, bgs $$5) {
        if ($$3 != cbn.b || !$$22.b($$4)) {
            return false;
        }
        if ($$1.b()) {
            ceb.p($$0).ifPresent($$2 -> {
                this.a($$4);
                $$5.a((cfz)$$2);
            });
        } else {
            int $$6 = ceb.b($$0, $$1);
            if ($$6 > 0) {
                this.b($$4);
                $$1.h($$6);
            }
        }
        return true;
    }

    @Override
    public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
        cfz $$3 = $$1.b($$2);
        if (ceb.a($$3, $$1)) {
            this.c($$1);
            $$1.b(amr.c.b(this));
            return bdy.a($$3, $$0.r_());
        }
        return bdy.d($$3);
    }

    @Override
    public boolean e(cfz $$0) {
        return ceb.o($$0) > 0;
    }

    @Override
    public int f(cfz $$0) {
        return Math.min(1 + 12 * ceb.o($$0) / 64, 13);
    }

    @Override
    public int g(cfz $$0) {
        return d;
    }

    private static int b(cfz $$0, cfz $$1) {
        if ($$1.b() || !$$1.d().ah_()) {
            return 0;
        }
        qr $$2 = $$0.w();
        if (!$$2.e(b)) {
            $$2.a(b, new qx());
        }
        int $$3 = ceb.o($$0);
        int $$4 = ceb.k($$1);
        int $$5 = Math.min($$1.L(), (64 - $$3) / $$4);
        if ($$5 == 0) {
            return 0;
        }
        qx $$6 = $$2.c(b, 10);
        Optional<qr> $$7 = ceb.a($$1, $$6);
        if ($$7.isPresent()) {
            qr $$8 = $$7.get();
            cfz $$9 = cfz.a($$8);
            $$9.g($$5);
            $$9.b($$8);
            $$6.remove($$8);
            $$6.c(0, $$8);
        } else {
            cfz $$10 = $$1.c($$5);
            qr $$11 = new qr();
            $$10.b($$11);
            $$6.c(0, $$11);
        }
        return $$5;
    }

    private static Optional<qr> a(cfz $$0, qx $$12) {
        if ($$0.a(cgc.qg)) {
            return Optional.empty();
        }
        return $$12.stream().filter(qr.class::isInstance).map(qr.class::cast).filter($$1 -> cfz.c(cfz.a($$1), $$0)).findFirst();
    }

    private static int k(cfz $$0) {
        qr $$1;
        if ($$0.a(cgc.qg)) {
            return 4 + ceb.o($$0);
        }
        if (($$0.a(cgc.vC) || $$0.a(cgc.vB)) && $$0.u() && ($$1 = cds.a($$0)) != null && !$$1.c("Bees", 10).isEmpty()) {
            return 64;
        }
        return 64 / $$0.g();
    }

    private static int o(cfz $$02) {
        return ceb.q($$02).mapToInt($$0 -> ceb.k($$0) * $$0.L()).sum();
    }

    private static Optional<cfz> p(cfz $$0) {
        qr $$1 = $$0.w();
        if (!$$1.e(b)) {
            return Optional.empty();
        }
        qx $$2 = $$1.c(b, 10);
        if ($$2.isEmpty()) {
            return Optional.empty();
        }
        boolean $$3 = false;
        qr $$4 = $$2.a(0);
        cfz $$5 = cfz.a($$4);
        $$2.c(0);
        if ($$2.isEmpty()) {
            $$0.c(b);
        }
        return Optional.of($$5);
    }

    private static boolean a(cfz $$0, byo $$1) {
        qr $$2 = $$0.w();
        if (!$$2.e(b)) {
            return false;
        }
        if ($$1 instanceof aig) {
            qx $$3 = $$2.c(b, 10);
            for (int $$4 = 0; $$4 < $$3.size(); ++$$4) {
                qr $$5 = $$3.a($$4);
                cfz $$6 = cfz.a($$5);
                $$1.a($$6, true);
            }
        }
        $$0.c(b);
        return true;
    }

    private static Stream<cfz> q(cfz $$0) {
        qr $$1 = $$0.v();
        if ($$1 == null) {
            return Stream.empty();
        }
        qx $$2 = $$1.c(b, 10);
        return $$2.stream().map(qr.class::cast).map(cfz::a);
    }

    @Override
    public Optional<cdf> h(cfz $$0) {
        hn<cfz> $$1 = hn.a();
        ceb.q($$0).forEach($$1::add);
        return Optional.of(new cde($$1, ceb.o($$0)));
    }

    @Override
    public void a(cfz $$0, cmm $$1, List<sw> $$2, chq $$3) {
        $$2.add(sw.a("item.minecraft.bundle.fullness", ceb.o($$0), 64).a(n.h));
    }

    @Override
    public void a(bvh $$0) {
        cgb.a($$0, ceb.q($$0.j()));
    }

    private void a(bfj $$0) {
        $$0.a(amh.cJ, 0.8f, 0.8f + $$0.dI().y_().i() * 0.4f);
    }

    private void b(bfj $$0) {
        $$0.a(amh.cI, 0.8f, 0.8f + $$0.dI().y_().i() * 0.4f);
    }

    private void c(bfj $$0) {
        $$0.a(amh.cH, 0.8f, 0.8f + $$0.dI().y_().i() * 0.4f);
    }
}

