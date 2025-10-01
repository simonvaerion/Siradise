/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dal
extends daq
implements dak {
    public static final int f = 8;
    public static final int g = 5;
    private hn<cfz> j = hn.a(5, cfz.b);
    private int k = -1;
    private long l;

    public dal(gu $$0, dcb $$1) {
        super(czp.r, $$0, $$1);
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.j = hn.a(this.b(), cfz.b);
        if (!this.d($$0)) {
            bdr.b($$0, this.j);
        }
        this.k = $$0.h("TransferCooldown");
    }

    @Override
    protected void b(qr $$0) {
        super.b($$0);
        if (!this.e($$0)) {
            bdr.a($$0, this.j);
        }
        $$0.a("TransferCooldown", this.k);
    }

    @Override
    public int b() {
        return this.j.size();
    }

    @Override
    public cfz a(int $$0, int $$1) {
        this.e((byo)null);
        return bdr.a(this.f(), $$0, $$1);
    }

    @Override
    public void a(int $$0, cfz $$1) {
        this.e((byo)null);
        this.f().set($$0, $$1);
        if ($$1.L() > this.ac_()) {
            $$1.f(this.ac_());
        }
    }

    @Override
    protected sw g() {
        return sw.c("container.hopper");
    }

    public static void a(cmm $$0, gu $$1, dcb $$2, dal $$3) {
        --$$3.k;
        $$3.l = $$0.V();
        if (!$$3.j()) {
            $$3.c(0);
            dal.a($$0, $$1, $$2, $$3, () -> dal.a($$0, (dak)$$3));
        }
    }

    private static boolean a(cmm $$0, gu $$1, dcb $$2, dal $$3, BooleanSupplier $$4) {
        if ($$0.B) {
            return false;
        }
        if (!$$3.j() && $$2.c(ctf.b).booleanValue()) {
            boolean $$5 = false;
            if (!$$3.ab_()) {
                $$5 = dal.a($$0, $$1, $$2, (bdq)$$3);
            }
            if (!$$3.i()) {
                $$5 |= $$4.getAsBoolean();
            }
            if ($$5) {
                $$3.c(8);
                dal.a($$0, $$1, $$2);
                return true;
            }
        }
        return false;
    }

    private boolean i() {
        for (cfz $$0 : this.j) {
            if (!$$0.b() && $$0.L() == $$0.g()) continue;
            return false;
        }
        return true;
    }

    private static boolean a(cmm $$0, gu $$1, dcb $$2, bdq $$3) {
        bdq $$4 = dal.b($$0, $$1, $$2);
        if ($$4 == null) {
            return false;
        }
        ha $$5 = $$2.c(ctf.a).g();
        if (dal.b($$4, $$5)) {
            return false;
        }
        for (int $$6 = 0; $$6 < $$3.b(); ++$$6) {
            if ($$3.a($$6).b()) continue;
            cfz $$7 = $$3.a($$6).p();
            cfz $$8 = dal.a($$3, $$4, $$3.a($$6, 1), $$5);
            if ($$8.b()) {
                $$4.e();
                return true;
            }
            $$3.a($$6, $$7);
        }
        return false;
    }

    private static IntStream a(bdq $$0, ha $$1) {
        if ($$0 instanceof beg) {
            return IntStream.of(((beg)$$0).a($$1));
        }
        return IntStream.range(0, $$0.b());
    }

    private static boolean b(bdq $$0, ha $$12) {
        return dal.a($$0, $$12).allMatch($$1 -> {
            cfz $$2 = $$0.a($$1);
            return $$2.L() >= $$2.g();
        });
    }

    private static boolean c(bdq $$0, ha $$12) {
        return dal.a($$0, $$12).allMatch($$1 -> $$0.a($$1).b());
    }

    public static boolean a(cmm $$0, dak $$1) {
        bdq $$2 = dal.c($$0, $$1);
        if ($$2 != null) {
            ha $$32 = ha.a;
            if (dal.c($$2, $$32)) {
                return false;
            }
            return dal.a($$2, $$32).anyMatch($$3 -> dal.a($$1, $$2, $$3, $$32));
        }
        for (bvh $$4 : dal.b($$0, $$1)) {
            if (!dal.a((bdq)$$1, $$4)) continue;
            return true;
        }
        return false;
    }

    private static boolean a(dak $$0, bdq $$1, int $$2, ha $$3) {
        cfz $$4 = $$1.a($$2);
        if (!$$4.b() && dal.a($$0, $$1, $$4, $$2, $$3)) {
            cfz $$5 = $$4.p();
            cfz $$6 = dal.a($$1, (bdq)$$0, $$1.a($$2, 1), null);
            if ($$6.b()) {
                $$1.e();
                return true;
            }
            $$1.a($$2, $$5);
        }
        return false;
    }

    public static boolean a(bdq $$0, bvh $$1) {
        boolean $$2 = false;
        cfz $$3 = $$1.j().p();
        cfz $$4 = dal.a(null, $$0, $$3, null);
        if ($$4.b()) {
            $$2 = true;
            $$1.ai();
        } else {
            $$1.a($$4);
        }
        return $$2;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static cfz a(@Nullable bdq $$0, bdq $$1, cfz $$2, @Nullable ha $$3) {
        if ($$1 instanceof beg) {
            beg $$4 = (beg)$$1;
            if ($$3 != null) {
                int[] $$5 = $$4.a($$3);
                int $$6 = 0;
                while ($$6 < $$5.length) {
                    if ($$2.b()) return $$2;
                    $$2 = dal.b($$0, $$1, $$2, $$5[$$6], $$3);
                    ++$$6;
                }
                return $$2;
            }
        }
        int $$7 = $$1.b();
        int $$8 = 0;
        while ($$8 < $$7) {
            if ($$2.b()) return $$2;
            $$2 = dal.b($$0, $$1, $$2, $$8, $$3);
            ++$$8;
        }
        return $$2;
    }

    private static boolean a(bdq $$0, cfz $$1, int $$2, @Nullable ha $$3) {
        beg $$4;
        if (!$$0.b($$2, $$1)) {
            return false;
        }
        return !($$0 instanceof beg) || ($$4 = (beg)$$0).a($$2, $$1, $$3);
    }

    private static boolean a(bdq $$0, bdq $$1, cfz $$2, int $$3, ha $$4) {
        beg $$5;
        if (!$$1.a($$0, $$3, $$2)) {
            return false;
        }
        return !($$1 instanceof beg) || ($$5 = (beg)$$1).b($$3, $$2, $$4);
    }

    private static cfz b(@Nullable bdq $$0, bdq $$1, cfz $$2, int $$3, @Nullable ha $$4) {
        cfz $$5 = $$1.a($$3);
        if (dal.a($$1, $$2, $$3, $$4)) {
            boolean $$6 = false;
            boolean $$7 = $$1.ab_();
            if ($$5.b()) {
                $$1.a($$3, $$2);
                $$2 = cfz.b;
                $$6 = true;
            } else if (dal.a($$5, $$2)) {
                int $$8 = $$2.g() - $$5.L();
                int $$9 = Math.min($$2.L(), $$8);
                $$2.h($$9);
                $$5.g($$9);
                boolean bl2 = $$6 = $$9 > 0;
            }
            if ($$6) {
                dal $$10;
                if ($$7 && $$1 instanceof dal && !($$10 = (dal)$$1).v()) {
                    int $$11 = 0;
                    if ($$0 instanceof dal) {
                        dal $$12 = (dal)$$0;
                        if ($$10.l >= $$12.l) {
                            $$11 = 1;
                        }
                    }
                    $$10.c(8 - $$11);
                }
                $$1.e();
            }
        }
        return $$2;
    }

    @Nullable
    private static bdq b(cmm $$0, gu $$1, dcb $$2) {
        ha $$3 = $$2.c(ctf.a);
        return dal.a($$0, $$1.a($$3));
    }

    @Nullable
    private static bdq c(cmm $$0, dak $$1) {
        return dal.a($$0, $$1.G(), $$1.I() + 1.0, $$1.J());
    }

    public static List<bvh> b(cmm $$0, dak $$1) {
        return $$1.aq_().d().stream().flatMap($$2 -> $$0.a(bvh.class, $$2.d($$1.G() - 0.5, $$1.I() - 0.5, $$1.J() - 0.5), bfm.a).stream()).collect(Collectors.toList());
    }

    @Nullable
    public static bdq a(cmm $$0, gu $$1) {
        return dal.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
    }

    @Nullable
    private static bdq a(cmm $$0, double $$1, double $$2, double $$3) {
        List<bfj> $$9;
        czn $$8;
        bdq $$4 = null;
        gu $$5 = gu.a($$1, $$2, $$3);
        dcb $$6 = $$0.a_($$5);
        cpn $$7 = $$6.b();
        if ($$7 instanceof beh) {
            $$4 = ((beh)((Object)$$7)).a($$6, $$0, $$5);
        } else if ($$6.t() && ($$8 = $$0.c_($$5)) instanceof bdq && ($$4 = (bdq)((Object)$$8)) instanceof czu && $$7 instanceof cqp) {
            $$4 = cqp.a((cqp)$$7, $$6, $$0, $$5, true);
        }
        if ($$4 == null && !($$9 = $$0.a((bfj)null, new eed($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bfm.d)).isEmpty()) {
            $$4 = (bdq)((Object)$$9.get($$0.z.a($$9.size())));
        }
        return $$4;
    }

    private static boolean a(cfz $$0, cfz $$1) {
        return $$0.L() <= $$0.g() && cfz.c($$0, $$1);
    }

    @Override
    public double G() {
        return (double)this.p.u() + 0.5;
    }

    @Override
    public double I() {
        return (double)this.p.v() + 0.5;
    }

    @Override
    public double J() {
        return (double)this.p.w() + 0.5;
    }

    private void c(int $$0) {
        this.k = $$0;
    }

    private boolean j() {
        return this.k > 0;
    }

    private boolean v() {
        return this.k > 8;
    }

    @Override
    protected hn<cfz> f() {
        return this.j;
    }

    @Override
    protected void a(hn<cfz> $$0) {
        this.j = $$0;
    }

    public static void a(cmm $$0, gu $$1, dcb $$2, bfj $$3, dal $$4) {
        if ($$3 instanceof bvh && eey.c(eey.a($$3.cE().d(-$$1.u(), -$$1.v(), -$$1.w())), $$4.aq_(), eem.i)) {
            dal.a($$0, $$1, $$2, $$4, () -> dal.a((bdq)$$4, (bvh)$$3));
        }
    }

    @Override
    protected cbf a(int $$0, byn $$1) {
        return new ccc($$0, $$1, this);
    }
}

