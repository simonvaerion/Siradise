/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.apache.commons.lang3.mutable.MutableInt
 */
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableInt;

public class evv
extends euq {
    private static final int a = 114;
    private static final int b = 128;
    private static final int c = 192;
    private static final int k = 192;
    private static final sw l = sw.c("book.editTitle");
    private static final sw m = sw.c("book.finalizeWarning");
    private static final aom n = aom.forward("_", ts.a.a(n.a));
    private static final aom o = aom.forward("_", ts.a.a(n.h));
    private final byo p;
    private final cfz q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private final List<String> v = Lists.newArrayList();
    private String w = "";
    private final erq x = new erq(this::L, this::b, this::l, this::a, $$0 -> $$0.length() < 1024 && this.i.b((String)$$0, 114) <= 128);
    private final erq y = new erq(() -> this.w, $$0 -> {
        this.w = $$0;
    }, this::l, this::a, $$0 -> $$0.length() < 16);
    private long z;
    private int A = -1;
    private eww C;
    private eww D;
    private epi E;
    private epi F;
    private epi G;
    private epi H;
    private final bdw I;
    @Nullable
    private a J = evv$a.a;
    private sw K = sv.a;
    private final sw L;

    public evv(byo $$02, cfz $$1, bdw $$2) {
        super(enf.a);
        this.p = $$02;
        this.q = $$1;
        this.I = $$2;
        qr $$3 = $$1.v();
        if ($$3 != null) {
            evw.a($$3, this.v::add);
        }
        if (this.v.isEmpty()) {
            this.v.add("");
        }
        this.L = sw.a("book.byAuthor", $$02.Z()).a(n.i);
    }

    private void a(String $$0) {
        if (this.f != null) {
            erq.a(this.f, $$0);
        }
    }

    private String l() {
        return this.f != null ? erq.b(this.f) : "";
    }

    private int B() {
        return this.v.size();
    }

    @Override
    public void f() {
        super.f();
        ++this.t;
    }

    @Override
    protected void b() {
        this.N();
        this.F = this.d(epi.a(sw.c("book.signButton"), (epi $$0) -> {
            this.s = true;
            this.E();
        }).a(this.g / 2 - 100, 196, 98, 20).a());
        this.E = this.d(epi.a(sv.d, (epi $$0) -> {
            this.f.a((euq)null);
            this.c(false);
        }).a(this.g / 2 + 2, 196, 98, 20).a());
        this.G = this.d(epi.a(sw.c("book.finalizeButton"), (epi $$0) -> {
            if (this.s) {
                this.c(true);
                this.f.a((euq)null);
            }
        }).a(this.g / 2 - 100, 196, 98, 20).a());
        this.H = this.d(epi.a(sv.e, (epi $$0) -> {
            if (this.s) {
                this.s = false;
            }
            this.E();
        }).a(this.g / 2 + 2, 196, 98, 20).a());
        int $$02 = (this.g - 192) / 2;
        int $$1 = 2;
        this.C = this.d(new eww($$02 + 116, 159, true, $$0 -> this.D(), true));
        this.D = this.d(new eww($$02 + 43, 159, false, $$0 -> this.C(), true));
        this.E();
    }

    private void C() {
        if (this.u > 0) {
            --this.u;
        }
        this.E();
        this.O();
    }

    private void D() {
        if (this.u < this.B() - 1) {
            ++this.u;
        } else {
            this.G();
            if (this.u < this.B() - 1) {
                ++this.u;
            }
        }
        this.E();
        this.O();
    }

    private void E() {
        this.D.s = !this.s && this.u > 0;
        this.C.s = !this.s;
        this.E.s = !this.s;
        this.F.s = !this.s;
        this.H.s = this.s;
        this.G.s = this.s;
        this.G.r = !this.w.trim().isEmpty();
    }

    private void F() {
        ListIterator<String> $$0 = this.v.listIterator(this.v.size());
        while ($$0.hasPrevious() && $$0.previous().isEmpty()) {
            $$0.remove();
        }
    }

    private void c(boolean $$0) {
        if (!this.r) {
            return;
        }
        this.F();
        this.e($$0);
        int $$1 = this.I == bdw.a ? this.p.fN().l : 40;
        this.f.I().a(new zr($$1, this.v, $$0 ? Optional.of(this.w.trim()) : Optional.empty()));
    }

    private void e(boolean $$0) {
        qx $$1 = new qx();
        this.v.stream().map(ri::a).forEach($$1::add);
        if (!this.v.isEmpty()) {
            this.q.a("pages", $$1);
        }
        if ($$0) {
            this.q.a("author", ri.a(this.p.fM().getName()));
            this.q.a("title", ri.a(this.w.trim()));
        }
    }

    private void G() {
        if (this.B() >= 100) {
            return;
        }
        this.v.add("");
        this.r = true;
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if (super.a($$0, $$1, $$2)) {
            return true;
        }
        if (this.s) {
            return this.d($$0, $$1, $$2);
        }
        boolean $$3 = this.c($$0, $$1, $$2);
        if ($$3) {
            this.N();
            return true;
        }
        return false;
    }

    @Override
    public boolean a(char $$0, int $$1) {
        if (super.a($$0, $$1)) {
            return true;
        }
        if (this.s) {
            boolean $$2 = this.y.a($$0);
            if ($$2) {
                this.E();
                this.r = true;
                return true;
            }
            return false;
        }
        if (aa.a($$0)) {
            this.x.a(Character.toString($$0));
            this.N();
            return true;
        }
        return false;
    }

    private boolean c(int $$0, int $$1, int $$2) {
        if (euq.g($$0)) {
            this.x.d();
            return true;
        }
        if (euq.f($$0)) {
            this.x.c();
            return true;
        }
        if (euq.e($$0)) {
            this.x.b();
            return true;
        }
        if (euq.d($$0)) {
            this.x.a();
            return true;
        }
        erq.a $$3 = euq.p() ? erq.a.b : erq.a.a;
        switch ($$0) {
            case 259: {
                this.x.a(-1, $$3);
                return true;
            }
            case 261: {
                this.x.a(1, $$3);
                return true;
            }
            case 257: 
            case 335: {
                this.x.a("\n");
                return true;
            }
            case 263: {
                this.x.a(-1, euq.q(), $$3);
                return true;
            }
            case 262: {
                this.x.a(1, euq.q(), $$3);
                return true;
            }
            case 265: {
                this.H();
                return true;
            }
            case 264: {
                this.I();
                return true;
            }
            case 266: {
                this.D.c();
                return true;
            }
            case 267: {
                this.C.c();
                return true;
            }
            case 268: {
                this.J();
                return true;
            }
            case 269: {
                this.K();
                return true;
            }
        }
        return false;
    }

    private void H() {
        this.a(-1);
    }

    private void I() {
        this.a(1);
    }

    private void a(int $$0) {
        int $$1 = this.x.g();
        int $$2 = this.M().a($$1, $$0);
        this.x.c($$2, euq.q());
    }

    private void J() {
        if (euq.p()) {
            this.x.a(euq.q());
        } else {
            int $$0 = this.x.g();
            int $$1 = this.M().a($$0);
            this.x.c($$1, euq.q());
        }
    }

    private void K() {
        if (euq.p()) {
            this.x.b(euq.q());
        } else {
            a $$0 = this.M();
            int $$1 = this.x.g();
            int $$2 = $$0.b($$1);
            this.x.c($$2, euq.q());
        }
    }

    private boolean d(int $$0, int $$1, int $$2) {
        switch ($$0) {
            case 259: {
                this.y.e(-1);
                this.E();
                this.r = true;
                return true;
            }
            case 257: 
            case 335: {
                if (!this.w.isEmpty()) {
                    this.c(true);
                    this.f.a((euq)null);
                }
                return true;
            }
        }
        return false;
    }

    private String L() {
        if (this.u >= 0 && this.u < this.v.size()) {
            return this.v.get(this.u);
        }
        return "";
    }

    private void b(String $$0) {
        if (this.u >= 0 && this.u < this.v.size()) {
            this.v.set(this.u, $$0);
            this.r = true;
            this.N();
        }
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        this.a(null);
        int $$4 = (this.g - 192) / 2;
        int $$5 = 2;
        $$0.a(evw.l, $$4, 2, 0, 0, 192, 192);
        if (this.s) {
            boolean $$6 = this.t / 6 % 2 == 0;
            aom $$7 = aom.composite(aom.forward(this.w, ts.a), $$6 ? n : o);
            int $$8 = this.i.a(l);
            $$0.a(this.i, l, $$4 + 36 + (114 - $$8) / 2, 34, 0, false);
            int $$9 = this.i.a($$7);
            $$0.a(this.i, $$7, $$4 + 36 + (114 - $$9) / 2, 50, 0, false);
            int $$10 = this.i.a(this.L);
            $$0.a(this.i, this.L, $$4 + 36 + (114 - $$10) / 2, 60, 0, false);
            $$0.a(this.i, (ta)m, $$4 + 36, 82, 114, 0);
        } else {
            int $$11 = this.i.a(this.K);
            $$0.a(this.i, this.K, $$4 - $$11 + 192 - 44, 18, 0, false);
            a $$12 = this.M();
            for (b $$13 : $$12.f) {
                $$0.a(this.i, $$13.c, $$13.d, $$13.e, -16777216, false);
            }
            this.a($$0, $$12.g);
            this.a($$0, $$12.c, $$12.d);
        }
        super.a($$0, $$1, $$2, $$3);
    }

    private void a(eox $$0, c $$1, boolean $$2) {
        if (this.t / 6 % 2 == 0) {
            $$1 = this.b($$1);
            if (!$$2) {
                $$0.a($$1.a, $$1.b - 1, $$1.a + 1, $$1.b + this.i.b, -16777216);
            } else {
                $$0.a(this.i, "_", $$1.a, $$1.b, 0, false);
            }
        }
    }

    private void a(eox $$0, fkc[] $$1) {
        for (fkc $$2 : $$1) {
            int $$3 = $$2.a();
            int $$4 = $$2.b();
            int $$5 = $$3 + $$2.c();
            int $$6 = $$4 + $$2.d();
            $$0.a(fkf.E(), $$3, $$4, $$5, $$6, -16776961);
        }
    }

    private c a(c $$0) {
        return new c($$0.a - (this.g - 192) / 2 - 36, $$0.b - 32);
    }

    private c b(c $$0) {
        return new c($$0.a + (this.g - 192) / 2 + 36, $$0.b + 32);
    }

    @Override
    public boolean a(double $$0, double $$1, int $$2) {
        if (super.a($$0, $$1, $$2)) {
            return true;
        }
        if ($$2 == 0) {
            long $$3 = ac.b();
            a $$4 = this.M();
            int $$5 = $$4.a(this.i, this.a(new c((int)$$0, (int)$$1)));
            if ($$5 >= 0) {
                if ($$5 == this.A && $$3 - this.z < 250L) {
                    if (!this.x.i()) {
                        this.b($$5);
                    } else {
                        this.x.d();
                    }
                } else {
                    this.x.c($$5, euq.q());
                }
                this.N();
            }
            this.A = $$5;
            this.z = $$3;
        }
        return true;
    }

    private void b(int $$0) {
        String $$1 = this.L();
        this.x.a(enz.a($$1, -1, $$0, false), enz.a($$1, 1, $$0, false));
    }

    @Override
    public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
        if (super.a($$0, $$1, $$2, $$3, $$4)) {
            return true;
        }
        if ($$2 == 0) {
            a $$5 = this.M();
            int $$6 = $$5.a(this.i, this.a(new c((int)$$0, (int)$$1)));
            this.x.c($$6, true);
            this.N();
        }
        return true;
    }

    private a M() {
        if (this.J == null) {
            this.J = this.P();
            this.K = sw.a("book.pageIndicator", this.u + 1, this.B());
        }
        return this.J;
    }

    private void N() {
        this.J = null;
    }

    private void O() {
        this.x.f();
        this.N();
    }

    private a P() {
        c $$13;
        boolean $$9;
        String $$0 = this.L();
        if ($$0.isEmpty()) {
            return evv$a.a;
        }
        int $$1 = this.x.g();
        int $$2 = this.x.h();
        IntArrayList $$3 = new IntArrayList();
        ArrayList $$4 = Lists.newArrayList();
        MutableInt $$5 = new MutableInt();
        MutableBoolean $$6 = new MutableBoolean();
        enz $$7 = this.i.b();
        $$7.a($$0, 114, ts.a, true, (arg_0, arg_1, arg_2) -> this.a($$5, $$0, $$6, (IntList)$$3, $$4, arg_0, arg_1, arg_2));
        int[] $$8 = $$3.toIntArray();
        boolean bl2 = $$9 = $$1 == $$0.length();
        if ($$9 && $$6.isTrue()) {
            c $$10 = new c(0, $$4.size() * this.i.b);
        } else {
            int $$11 = evv.a($$8, $$1);
            int $$12 = this.i.b($$0.substring($$8[$$11], $$1));
            $$13 = new c($$12, $$11 * this.i.b);
        }
        ArrayList $$14 = Lists.newArrayList();
        if ($$1 != $$2) {
            int $$18;
            int $$15 = Math.min($$1, $$2);
            int $$16 = Math.max($$1, $$2);
            int $$17 = evv.a($$8, $$15);
            if ($$17 == ($$18 = evv.a($$8, $$16))) {
                int $$19 = $$17 * this.i.b;
                int $$20 = $$8[$$17];
                $$14.add(this.a($$0, $$7, $$15, $$16, $$19, $$20));
            } else {
                int $$21 = $$17 + 1 > $$8.length ? $$0.length() : $$8[$$17 + 1];
                $$14.add(this.a($$0, $$7, $$15, $$21, $$17 * this.i.b, $$8[$$17]));
                for (int $$22 = $$17 + 1; $$22 < $$18; ++$$22) {
                    int $$23 = $$22 * this.i.b;
                    String $$24 = $$0.substring($$8[$$22], $$8[$$22 + 1]);
                    int $$25 = (int)$$7.a($$24);
                    $$14.add(this.a(new c(0, $$23), new c($$25, $$23 + this.i.b)));
                }
                $$14.add(this.a($$0, $$7, $$8[$$18], $$16, $$18 * this.i.b, $$8[$$18]));
            }
        }
        return new a($$0, $$13, $$9, $$8, $$4.toArray(new b[0]), $$14.toArray(new fkc[0]));
    }

    static int a(int[] $$0, int $$1) {
        int $$2 = Arrays.binarySearch($$0, $$1);
        if ($$2 < 0) {
            return -($$2 + 2);
        }
        return $$2;
    }

    private fkc a(String $$0, enz $$1, int $$2, int $$3, int $$4, int $$5) {
        String $$6 = $$0.substring($$5, $$2);
        String $$7 = $$0.substring($$5, $$3);
        c $$8 = new c((int)$$1.a($$6), $$4);
        c $$9 = new c((int)$$1.a($$7), $$4 + this.i.b);
        return this.a($$8, $$9);
    }

    private fkc a(c $$0, c $$1) {
        c $$2 = this.b($$0);
        c $$3 = this.b($$1);
        int $$4 = Math.min($$2.a, $$3.a);
        int $$5 = Math.max($$2.a, $$3.a);
        int $$6 = Math.min($$2.b, $$3.b);
        int $$7 = Math.max($$2.b, $$3.b);
        return new fkc($$4, $$6, $$5 - $$4, $$7 - $$6);
    }

    private /* synthetic */ void a(MutableInt $$0, String $$1, MutableBoolean $$2, IntList $$3, List $$4, ts $$5, int $$6, int $$7) {
        int $$8 = $$0.getAndIncrement();
        String $$9 = $$1.substring($$6, $$7);
        $$2.setValue($$9.endsWith("\n"));
        String $$10 = StringUtils.stripEnd((String)$$9, (String)" \n");
        int $$11 = $$8 * this.i.b;
        c $$12 = this.b(new c(0, $$11));
        $$3.add($$6);
        $$4.add(new b($$5, $$10, $$12.a, $$12.b));
    }

    static class a {
        static final a a = new a("", new c(0, 0), true, new int[]{0}, new b[]{new b(ts.a, "", 0, 0)}, new fkc[0]);
        private final String b;
        final c c;
        final boolean d;
        private final int[] e;
        final b[] f;
        final fkc[] g;

        public a(String $$0, c $$1, boolean $$2, int[] $$3, b[] $$4, fkc[] $$5) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
            this.g = $$5;
        }

        public int a(eov $$0, c $$1) {
            int $$2 = $$1.b / $$0.b;
            if ($$2 < 0) {
                return 0;
            }
            if ($$2 >= this.f.length) {
                return this.b.length();
            }
            b $$3 = this.f[$$2];
            return this.e[$$2] + $$0.b().a($$3.b, $$1.a, $$3.a);
        }

        public int a(int $$0, int $$1) {
            int $$7;
            int $$2 = evv.a(this.e, $$0);
            int $$3 = $$2 + $$1;
            if (0 <= $$3 && $$3 < this.e.length) {
                int $$4 = $$0 - this.e[$$2];
                int $$5 = this.f[$$3].b.length();
                int $$6 = this.e[$$3] + Math.min($$4, $$5);
            } else {
                $$7 = $$0;
            }
            return $$7;
        }

        public int a(int $$0) {
            int $$1 = evv.a(this.e, $$0);
            return this.e[$$1];
        }

        public int b(int $$0) {
            int $$1 = evv.a(this.e, $$0);
            return this.e[$$1] + this.f[$$1].b.length();
        }
    }

    static class b {
        final ts a;
        final String b;
        final sw c;
        final int d;
        final int e;

        public b(ts $$0, String $$1, int $$2, int $$3) {
            this.a = $$0;
            this.b = $$1;
            this.d = $$2;
            this.e = $$3;
            this.c = sw.b($$1).b($$0);
        }
    }

    static class c {
        public final int a;
        public final int b;

        c(int $$0, int $$1) {
            this.a = $$0;
            this.b = $$1;
        }
    }
}

