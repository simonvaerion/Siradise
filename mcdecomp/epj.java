/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epj {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 100;
    private static final int c = -1;
    private static final int d = 4;
    private static final int e = 4;
    private static final int f = 40;
    private static final int g = 60;
    private static final sw h = sw.c("chat.deleted_marker").a(n.h, n.u);
    private final enn i;
    private final List<String> j = Lists.newArrayList();
    private final List<enh> k = Lists.newArrayList();
    private final List<enh.a> l = Lists.newArrayList();
    private int m;
    private boolean n;
    private final List<a> o = new ArrayList<a>();

    public epj(enn $$0) {
        this.i = $$0;
    }

    public void a() {
        if (!this.o.isEmpty()) {
            this.k();
        }
    }

    public void a(eox $$0, int $$1, int $$2, int $$3) {
        if (this.j()) {
            return;
        }
        int $$4 = this.i();
        int $$5 = this.l.size();
        if ($$5 <= 0) {
            return;
        }
        boolean $$6 = this.m();
        float $$7 = (float)this.g();
        int $$8 = apa.f((float)this.e() / $$7);
        int $$9 = $$0.b();
        $$0.c().a();
        $$0.c().b($$7, $$7, 1.0f);
        $$0.c().a(4.0f, 0.0f, 0.0f);
        int $$10 = apa.d((float)($$9 - 40) / $$7);
        int $$11 = this.d(this.c($$2), this.d($$3));
        double $$12 = this.i.m.m().c() * (double)0.9f + (double)0.1f;
        double $$13 = this.i.m.o().c();
        double $$14 = this.i.m.n().c();
        int $$15 = this.n();
        int $$16 = (int)Math.round(-8.0 * ($$14 + 1.0) + 4.0 * $$14);
        int $$17 = 0;
        for (int $$18 = 0; $$18 + this.m < this.l.size() && $$18 < $$4; ++$$18) {
            int $$21;
            int $$19 = $$18 + this.m;
            enh.a $$20 = this.l.get($$19);
            if ($$20 == null || ($$21 = $$1 - $$20.a()) >= 200 && !$$6) continue;
            double $$22 = $$6 ? 1.0 : epj.b($$21);
            int $$23 = (int)(255.0 * $$22 * $$12);
            int $$24 = (int)(255.0 * $$22 * $$13);
            ++$$17;
            if ($$23 <= 3) continue;
            boolean $$25 = false;
            int $$26 = $$10 - $$18 * $$15;
            int $$27 = $$26 + $$16;
            $$0.c().a();
            $$0.c().a(0.0f, 0.0f, 50.0f);
            $$0.a(-4, $$26 - $$15, 0 + $$8 + 4 + 4, $$26, $$24 << 24);
            eni $$28 = $$20.c();
            if ($$28 != null) {
                int $$29 = $$28.d() | $$23 << 24;
                $$0.a(-4, $$26 - $$15, -2, $$26, $$29);
                if ($$19 == $$11 && $$28.e() != null) {
                    int $$30 = this.a($$20);
                    int $$31 = $$27 + this.i.h.b;
                    this.a($$0, $$30, $$31, $$28.e());
                }
            }
            $$0.c().a(0.0f, 0.0f, 50.0f);
            $$0.b(this.i.h, $$20.b(), 0, $$27, 0xFFFFFF + ($$23 << 24));
            $$0.c().b();
        }
        long $$32 = this.i.aV().c();
        if ($$32 > 0L) {
            int $$33 = (int)(128.0 * $$12);
            int $$34 = (int)(255.0 * $$13);
            $$0.c().a();
            $$0.c().a(0.0f, $$10, 50.0f);
            $$0.a(-2, 0, $$8 + 4, 9, $$34 << 24);
            $$0.c().a(0.0f, 0.0f, 50.0f);
            $$0.b(this.i.h, sw.a("chat.queue", $$32), 0, 1, 0xFFFFFF + ($$33 << 24));
            $$0.c().b();
        }
        if ($$6) {
            int $$35 = this.n();
            int $$36 = $$5 * $$35;
            int $$37 = $$17 * $$35;
            int $$38 = this.m * $$37 / $$5 - $$10;
            int $$39 = $$37 * $$37 / $$36;
            if ($$36 != $$37) {
                int $$40 = $$38 > 0 ? 170 : 96;
                int $$41 = this.n ? 0xCC3333 : 0x3333AA;
                int $$42 = $$8 + 4;
                $$0.a($$42, -$$38, $$42 + 2, -$$38 - $$39, $$41 + ($$40 << 24));
                $$0.a($$42 + 2, -$$38, $$42 + 1, -$$38 - $$39, 0xCCCCCC + ($$40 << 24));
            }
        }
        $$0.c().b();
    }

    private void a(eox $$0, int $$1, int $$2, eni.a $$3) {
        int $$4 = $$2 - $$3.e - 1;
        $$3.a($$0, $$1, $$4);
    }

    private int a(enh.a $$0) {
        return this.i.h.a($$0.b()) + 4;
    }

    private boolean j() {
        return this.i.m.l().c() == bym.c;
    }

    private static double b(int $$0) {
        double $$1 = (double)$$0 / 200.0;
        $$1 = 1.0 - $$1;
        $$1 *= 10.0;
        $$1 = apa.a($$1, 0.0, 1.0);
        $$1 *= $$1;
        return $$1;
    }

    public void a(boolean $$0) {
        this.i.aV().d();
        this.o.clear();
        this.l.clear();
        this.k.clear();
        if ($$0) {
            this.j.clear();
        }
    }

    public void a(sw $$0) {
        this.a($$0, null, this.i.T() ? eni.b() : eni.a());
    }

    public void a(sw $$0, @Nullable th $$1, @Nullable eni $$2) {
        this.a($$0, $$2);
        this.a($$0, $$1, this.i.l.e(), $$2, false);
    }

    private void a(sw $$0, @Nullable eni $$1) {
        String $$2 = $$0.getString().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n");
        String $$3 = x.a($$1, eni::g);
        if ($$3 != null) {
            a.info("[{}] [CHAT] {}", (Object)$$3, (Object)$$2);
        } else {
            a.info("[CHAT] {}", (Object)$$2);
        }
    }

    private void a(sw $$0, @Nullable th $$1, int $$2, @Nullable eni $$3, boolean $$4) {
        int $$5 = apa.a((double)this.e() / this.g());
        if ($$3 != null && $$3.e() != null) {
            $$5 -= $$3.e().d + 4 + 2;
        }
        List<aom> $$6 = epn.a($$0, $$5, this.i.h);
        boolean $$7 = this.m();
        for (int $$8 = 0; $$8 < $$6.size(); ++$$8) {
            aom $$9 = $$6.get($$8);
            if ($$7 && this.m > 0) {
                this.n = true;
                this.a(1);
            }
            boolean $$10 = $$8 == $$6.size() - 1;
            this.l.add(0, new enh.a($$2, $$9, $$3, $$10));
        }
        while (this.l.size() > 100) {
            this.l.remove(this.l.size() - 1);
        }
        if (!$$4) {
            this.k.add(0, new enh($$2, $$0, $$1, $$3));
            while (this.k.size() > 100) {
                this.k.remove(this.k.size() - 1);
            }
        }
    }

    private void k() {
        int $$0 = this.i.l.e();
        this.o.removeIf($$1 -> {
            if ($$0 >= $$1.b()) {
                return this.b($$1.a()) == null;
            }
            return false;
        });
    }

    public void a(th $$0) {
        a $$1 = this.b($$0);
        if ($$1 != null) {
            this.o.add($$1);
        }
    }

    @Nullable
    private a b(th $$0) {
        int $$1 = this.i.l.e();
        ListIterator<enh> $$2 = this.k.listIterator();
        while ($$2.hasNext()) {
            enh $$3 = $$2.next();
            if (!$$0.equals($$3.c())) continue;
            int $$4 = $$3.a() + 60;
            if ($$1 >= $$4) {
                $$2.set(this.a($$3));
                this.l();
                return null;
            }
            return new a($$0, $$4);
        }
        return null;
    }

    private enh a(enh $$0) {
        return new enh($$0.a(), h, null, eni.a());
    }

    public void b() {
        this.d();
        this.l();
    }

    private void l() {
        this.l.clear();
        for (int $$0 = this.k.size() - 1; $$0 >= 0; --$$0) {
            enh $$1 = this.k.get($$0);
            this.a($$1.b(), $$1.c(), $$1.a(), $$1.d(), true);
        }
    }

    public List<String> c() {
        return this.j;
    }

    public void a(String $$0) {
        if (this.j.isEmpty() || !this.j.get(this.j.size() - 1).equals($$0)) {
            this.j.add($$0);
        }
    }

    public void d() {
        this.m = 0;
        this.n = false;
    }

    public void a(int $$0) {
        this.m += $$0;
        int $$1 = this.l.size();
        if (this.m > $$1 - this.i()) {
            this.m = $$1 - this.i();
        }
        if (this.m <= 0) {
            this.m = 0;
            this.n = false;
        }
    }

    public boolean a(double $$0, double $$1) {
        if (!this.m() || this.i.m.Z || this.j()) {
            return false;
        }
        ffg $$2 = this.i.aV();
        if ($$2.c() == 0L) {
            return false;
        }
        double $$3 = $$0 - 2.0;
        double $$4 = (double)this.i.aM().p() - $$1 - 40.0;
        if ($$3 <= (double)apa.a((double)this.e() / this.g()) && $$4 < 0.0 && $$4 > (double)apa.a(-9.0 * this.g())) {
            $$2.b();
            return true;
        }
        return false;
    }

    @Nullable
    public ts b(double $$0, double $$1) {
        double $$3;
        double $$2 = this.c($$0);
        int $$4 = this.e($$2, $$3 = this.d($$1));
        if ($$4 >= 0 && $$4 < this.l.size()) {
            enh.a $$5 = this.l.get($$4);
            return this.i.h.b().a($$5.b(), apa.a($$2));
        }
        return null;
    }

    @Nullable
    public eni c(double $$0, double $$1) {
        enh.a $$5;
        eni $$6;
        double $$3;
        double $$2 = this.c($$0);
        int $$4 = this.d($$2, $$3 = this.d($$1));
        if ($$4 >= 0 && $$4 < this.l.size() && ($$6 = ($$5 = this.l.get($$4)).c()) != null && this.a($$2, $$5, $$6)) {
            return $$6;
        }
        return null;
    }

    private boolean a(double $$0, enh.a $$1, eni $$2) {
        if ($$0 < 0.0) {
            return true;
        }
        eni.a $$3 = $$2.e();
        if ($$3 != null) {
            int $$4 = this.a($$1);
            int $$5 = $$4 + $$3.d;
            return $$0 >= (double)$$4 && $$0 <= (double)$$5;
        }
        return false;
    }

    private double c(double $$0) {
        return $$0 / this.g() - 4.0;
    }

    private double d(double $$0) {
        double $$1 = (double)this.i.aM().p() - $$0 - 40.0;
        return $$1 / (this.g() * (double)this.n());
    }

    private int d(double $$0, double $$1) {
        int $$2 = this.e($$0, $$1);
        if ($$2 == -1) {
            return -1;
        }
        while ($$2 >= 0) {
            if (this.l.get($$2).d()) {
                return $$2;
            }
            --$$2;
        }
        return $$2;
    }

    private int e(double $$0, double $$1) {
        int $$3;
        if (!this.m() || this.i.m.Z || this.j()) {
            return -1;
        }
        if ($$0 < -4.0 || $$0 > (double)apa.a((double)this.e() / this.g())) {
            return -1;
        }
        int $$2 = Math.min(this.i(), this.l.size());
        if ($$1 >= 0.0 && $$1 < (double)$$2 && ($$3 = apa.a($$1 + (double)this.m)) >= 0 && $$3 < this.l.size()) {
            return $$3;
        }
        return -1;
    }

    private boolean m() {
        return this.i.z instanceof eti;
    }

    public int e() {
        return epj.a(this.i.m.t().c());
    }

    public int f() {
        return epj.b(this.m() ? this.i.m.v().c() : this.i.m.u().c());
    }

    public double g() {
        return this.i.m.s().c();
    }

    public static int a(double $$0) {
        int $$1 = 320;
        int $$2 = 40;
        return apa.a($$0 * 280.0 + 40.0);
    }

    public static int b(double $$0) {
        int $$1 = 180;
        int $$2 = 20;
        return apa.a($$0 * 160.0 + 20.0);
    }

    public static double h() {
        int $$0 = 180;
        int $$1 = 20;
        return 70.0 / (double)(epj.b(1.0) - 20);
    }

    public int i() {
        return this.f() / this.n();
    }

    private int n() {
        return (int)((double)this.i.h.b * (this.i.m.n().c() + 1.0));
    }

    record a(th a, int b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "signature;deletableAfter", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "signature;deletableAfter", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "signature;deletableAfter", "a", "b"}, this, $$0);
        }
    }
}

