/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import javax.annotation.Nullable;

public class eve {
    private static final acq a = new acq("textures/gui/advancements/widgets.png");
    private static final int b = 26;
    private static final int c = 0;
    private static final int d = 200;
    private static final int e = 26;
    private static final int f = 8;
    private static final int g = 5;
    private static final int h = 26;
    private static final int i = 3;
    private static final int j = 5;
    private static final int k = 32;
    private static final int l = 9;
    private static final int m = 163;
    private static final int[] n = new int[]{0, 10, -10, 25, -25};
    private final evc o;
    private final ae p;
    private final an q;
    private final aom r;
    private final int s;
    private final List<aom> t;
    private final enn u;
    @Nullable
    private eve v;
    private final List<eve> w = Lists.newArrayList();
    @Nullable
    private ag x;
    private final int y;
    private final int z;

    public eve(evc $$0, enn $$1, ae $$2, an $$3) {
        this.o = $$0;
        this.p = $$2;
        this.q = $$3;
        this.u = $$1;
        this.r = qm.a().a($$1.h.a($$3.a(), 163));
        this.y = apa.d($$3.f() * 28.0f);
        this.z = apa.d($$3.g() * 27.0f);
        int $$4 = $$2.i();
        int $$5 = String.valueOf($$4).length();
        int $$6 = $$4 > 1 ? $$1.h.b("  ") + $$1.h.b("0") * $$5 * 2 + $$1.h.b("/") : 0;
        int $$7 = 29 + $$1.h.a(this.r) + $$6;
        this.t = qm.a().a(this.a(sy.a($$3.b().e(), ts.a.a($$3.e().c())), $$7));
        for (aom $$8 : this.t) {
            $$7 = Math.max($$7, $$1.h.a($$8));
        }
        this.s = $$7 + 3 + 5;
    }

    private static float a(enz $$0, List<ta> $$1) {
        return (float)$$1.stream().mapToDouble($$0::a).max().orElse(0.0);
    }

    private List<ta> a(sw $$0, int $$1) {
        enz $$2 = this.u.h.b();
        List<ta> $$3 = null;
        float $$4 = Float.MAX_VALUE;
        for (int $$5 : n) {
            List<ta> $$6 = $$2.b($$0, $$1 - $$5, ts.a);
            float $$7 = Math.abs(eve.a($$2, $$6) - (float)$$1);
            if ($$7 <= 10.0f) {
                return $$6;
            }
            if (!($$7 < $$4)) continue;
            $$4 = $$7;
            $$3 = $$6;
        }
        return $$3;
    }

    @Nullable
    private eve a(ae $$0) {
        while (($$0 = $$0.b()) != null && $$0.d() == null) {
        }
        if ($$0 == null || $$0.d() == null) {
            return null;
        }
        return this.o.b($$0);
    }

    public void a(eox $$0, int $$1, int $$2, boolean $$3) {
        if (this.v != null) {
            int $$9;
            int $$4 = $$1 + this.v.y + 13;
            int $$5 = $$1 + this.v.y + 26 + 4;
            int $$6 = $$2 + this.v.z + 13;
            int $$7 = $$1 + this.y + 13;
            int $$8 = $$2 + this.z + 13;
            int n2 = $$9 = $$3 ? -16777216 : -1;
            if ($$3) {
                $$0.a($$5, $$4, $$6 - 1, $$9);
                $$0.a($$5 + 1, $$4, $$6, $$9);
                $$0.a($$5, $$4, $$6 + 1, $$9);
                $$0.a($$7, $$5 - 1, $$8 - 1, $$9);
                $$0.a($$7, $$5 - 1, $$8, $$9);
                $$0.a($$7, $$5 - 1, $$8 + 1, $$9);
                $$0.b($$5 - 1, $$8, $$6, $$9);
                $$0.b($$5 + 1, $$8, $$6, $$9);
            } else {
                $$0.a($$5, $$4, $$6, $$9);
                $$0.a($$7, $$5, $$8, $$9);
                $$0.b($$5, $$8, $$6, $$9);
            }
        }
        for (eve $$10 : this.w) {
            $$10.a($$0, $$1, $$2, $$3);
        }
    }

    public void a(eox $$0, int $$1, int $$2) {
        if (!this.q.j() || this.x != null && this.x.a()) {
            evf $$5;
            float $$3;
            float f2 = $$3 = this.x == null ? 0.0f : this.x.c();
            if ($$3 >= 1.0f) {
                evf $$4 = evf.a;
            } else {
                $$5 = evf.b;
            }
            $$0.a(a, $$1 + this.y + 3, $$2 + this.z, this.q.e().b(), 128 + $$5.a() * 26, 26, 26);
            $$0.b(this.q.c(), $$1 + this.y + 8, $$2 + this.z + 5);
        }
        for (eve $$6 : this.w) {
            $$6.a($$0, $$1, $$2);
        }
    }

    public int a() {
        return this.s;
    }

    public void a(ag $$0) {
        this.x = $$0;
    }

    public void a(eve $$0) {
        this.w.add($$0);
    }

    public void a(eox $$0, int $$1, int $$2, float $$3, int $$4, int $$5) {
        int $$27;
        evf $$23;
        evf $$22;
        evf $$21;
        boolean $$6 = $$4 + $$1 + this.y + this.s + 26 >= this.o.f().g;
        String $$7 = this.x == null ? null : this.x.d();
        int $$8 = $$7 == null ? 0 : this.u.h.b($$7);
        boolean $$9 = 113 - $$2 - this.z - 26 <= 6 + this.t.size() * this.u.h.b;
        float $$10 = this.x == null ? 0.0f : this.x.c();
        int $$11 = apa.d($$10 * (float)this.s);
        if ($$10 >= 1.0f) {
            $$11 = this.s / 2;
            evf $$12 = evf.a;
            evf $$13 = evf.a;
            evf $$14 = evf.a;
        } else if ($$11 < 2) {
            $$11 = this.s / 2;
            evf $$15 = evf.b;
            evf $$16 = evf.b;
            evf $$17 = evf.b;
        } else if ($$11 > this.s - 2) {
            $$11 = this.s / 2;
            evf $$18 = evf.a;
            evf $$19 = evf.a;
            evf $$20 = evf.b;
        } else {
            $$21 = evf.a;
            $$22 = evf.b;
            $$23 = evf.b;
        }
        int $$24 = this.s - $$11;
        RenderSystem.enableBlend();
        int $$25 = $$2 + this.z;
        if ($$6) {
            int $$26 = $$1 + this.y - this.s + 26 + 6;
        } else {
            $$27 = $$1 + this.y;
        }
        int $$28 = 32 + this.t.size() * this.u.h.b;
        if (!this.t.isEmpty()) {
            if ($$9) {
                $$0.a(a, $$27, $$25 + 26 - $$28, this.s, $$28, 10, 200, 26, 0, 52);
            } else {
                $$0.a(a, $$27, $$25, this.s, $$28, 10, 200, 26, 0, 52);
            }
        }
        $$0.a(a, $$27, $$25, 0, $$21.a() * 26, $$11, 26);
        $$0.a(a, $$27 + $$11, $$25, 200 - $$24, $$22.a() * 26, $$24, 26);
        $$0.a(a, $$1 + this.y + 3, $$2 + this.z, this.q.e().b(), 128 + $$23.a() * 26, 26, 26);
        if ($$6) {
            $$0.b(this.u.h, this.r, $$27 + 5, $$2 + this.z + 9, -1);
            if ($$7 != null) {
                $$0.b(this.u.h, $$7, $$1 + this.y - $$8, $$2 + this.z + 9, -1);
            }
        } else {
            $$0.b(this.u.h, this.r, $$1 + this.y + 32, $$2 + this.z + 9, -1);
            if ($$7 != null) {
                $$0.b(this.u.h, $$7, $$1 + this.y + this.s - $$8 - 5, $$2 + this.z + 9, -1);
            }
        }
        if ($$9) {
            for (int $$29 = 0; $$29 < this.t.size(); ++$$29) {
                $$0.a(this.u.h, this.t.get($$29), $$27 + 5, $$25 + 26 - $$28 + 7 + $$29 * this.u.h.b, -5592406, false);
            }
        } else {
            for (int $$30 = 0; $$30 < this.t.size(); ++$$30) {
                $$0.a(this.u.h, this.t.get($$30), $$27 + 5, $$2 + this.z + 9 + 17 + $$30 * this.u.h.b, -5592406, false);
            }
        }
        $$0.b(this.q.c(), $$1 + this.y + 8, $$2 + this.z + 5);
    }

    public boolean a(int $$0, int $$1, int $$2, int $$3) {
        if (this.q.j() && (this.x == null || !this.x.a())) {
            return false;
        }
        int $$4 = $$0 + this.y;
        int $$5 = $$4 + 26;
        int $$6 = $$1 + this.z;
        int $$7 = $$6 + 26;
        return $$2 >= $$4 && $$2 <= $$5 && $$3 >= $$6 && $$3 <= $$7;
    }

    public void b() {
        if (this.v == null && this.p.b() != null) {
            this.v = this.a(this.p);
            if (this.v != null) {
                this.v.a(this);
            }
        }
    }

    public int c() {
        return this.z;
    }

    public int d() {
        return this.y;
    }
}

