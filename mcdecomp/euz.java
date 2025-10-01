/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class euz
extends euq
implements eva {
    private static final sw c = sw.c("multiplayer.downloadingStats");
    private static final acq k = new acq("textures/gui/container/stats_icons.png");
    protected final euq a;
    private a l;
    b m;
    private c n;
    final ams o;
    @Nullable
    private eqc<?> p;
    private boolean q = true;
    private static final int r = 128;
    private static final int s = 18;
    private static final int t = 20;
    private static final int u = 1;
    private static final int v = 1;
    private static final int w = 2;
    private static final int x = 2;
    private static final int y = 40;
    private static final int z = 5;
    private static final int A = 0;
    private static final int C = -1;
    private static final int D = 1;

    public euz(euq $$0, ams $$1) {
        super(sw.c("gui.stats"));
        this.a = $$0;
        this.o = $$1;
    }

    @Override
    protected void b() {
        this.q = true;
        this.f.I().a(new zk(zk.a.b));
    }

    public void l() {
        this.l = new a(this.f);
        this.m = new b(this.f);
        this.n = new c(this.f);
    }

    public void B() {
        this.d(epi.a(sw.c("stat.generalButton"), (epi $$0) -> this.a(this.l)).a(this.g / 2 - 120, this.h - 52, 80, 20).a());
        epi $$02 = this.d(epi.a(sw.c("stat.itemsButton"), (epi $$0) -> this.a(this.m)).a(this.g / 2 - 40, this.h - 52, 80, 20).a());
        epi $$1 = this.d(epi.a(sw.c("stat.mobsButton"), (epi $$0) -> this.a(this.n)).a(this.g / 2 + 40, this.h - 52, 80, 20).a());
        this.d(epi.a(sv.d, (epi $$0) -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 28, 200, 20).a());
        if (this.m.i().isEmpty()) {
            $$02.r = false;
        }
        if (this.n.i().isEmpty()) {
            $$1.r = false;
        }
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        if (this.q) {
            this.a($$0);
            $$0.a(this.i, c, this.g / 2, this.h / 2, 0xFFFFFF);
            $$0.a(this.i, b[(int)(ac.b() / 150L % (long)b.length)], this.g / 2, this.h / 2 + this.i.b * 2, 0xFFFFFF);
        } else {
            this.D().a($$0, $$1, $$2, $$3);
            $$0.a(this.i, this.e, this.g / 2, 20, 0xFFFFFF);
            super.a($$0, $$1, $$2, $$3);
        }
    }

    @Override
    public void C() {
        if (this.q) {
            this.l();
            this.B();
            this.a(this.l);
            this.q = false;
        }
    }

    @Override
    public boolean az_() {
        return !this.q;
    }

    @Nullable
    public eqc<?> D() {
        return this.p;
    }

    public void a(@Nullable eqc<?> $$0) {
        if (this.p != null) {
            this.f(this.p);
        }
        if ($$0 != null) {
            this.e($$0);
            this.p = $$0;
        }
    }

    static String a(amo<acq> $$0) {
        return "stat." + $$0.b().toString().replace(':', '.');
    }

    int a(int $$0) {
        return 115 + 40 * $$0;
    }

    void a(eox $$0, int $$1, int $$2, cfu $$3) {
        this.a($$0, $$1 + 1, $$2 + 1, 0, 0);
        $$0.b($$3.ae_(), $$1 + 2, $$2 + 2);
    }

    void a(eox $$0, int $$1, int $$2, int $$3, int $$4) {
        $$0.a(k, $$1, $$2, 0, (float)$$3, (float)$$4, 18, 18, 128, 128);
    }

    class euz$a
    extends eqc<a> {
        public euz$a(enn $$02) {
            super($$02, euz.this.g, euz.this.h, 32, euz.this.h - 64, 10);
            ObjectArrayList $$1 = new ObjectArrayList(amr.i.iterator());
            $$1.sort(Comparator.comparing($$0 -> fvz.a(euz.a($$0), new Object[0])));
            for (amo $$2 : $$1) {
                this.b(new a($$2));
            }
        }

        @Override
        protected void a(eox $$0) {
            euz.this.a($$0);
        }

        class a
        extends eqc.a<a> {
            private final amo<acq> b;
            private final sw c;

            a(amo<acq> $$0) {
                this.b = $$0;
                this.c = sw.c(euz.a($$0));
            }

            private String b() {
                return this.b.a(euz.this.o.a(this.b));
            }

            @Override
            public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
                $$0.b(euz.this.i, this.c, $$3 + 2, $$2 + 1, $$1 % 2 == 0 ? 0xFFFFFF : 0x909090);
                String $$10 = this.b();
                $$0.b(euz.this.i, $$10, $$3 + 2 + 213 - euz.this.i.b($$10), $$2 + 1, $$1 % 2 == 0 ? 0xFFFFFF : 0x909090);
            }

            @Override
            public sw a() {
                return sw.a("narrator.select", sw.h().b(this.c).b(sv.t).f(this.b()));
            }
        }
    }

    class euz$b
    extends eqc<a> {
        protected final List<amq<cpn>> a;
        protected final List<amq<cfu>> l;
        private final int[] r;
        protected int m;
        protected final Comparator<a> n;
        @Nullable
        protected amq<?> o;
        protected int p;

        public euz$b(enn $$0) {
            super($$0, euz.this.g, euz.this.h, 32, euz.this.h - 64, 20);
            this.r = new int[]{3, 4, 1, 2, 5, 6};
            this.m = -1;
            this.n = new b();
            this.a = Lists.newArrayList();
            this.a.add(amr.a);
            this.l = Lists.newArrayList((Object[])new amq[]{amr.d, amr.b, amr.c, amr.e, amr.f});
            this.a(true, 20);
            Set $$1 = Sets.newIdentityHashSet();
            for (cfu $$2 : jb.i) {
                boolean $$3 = false;
                for (amq<cfu> amq2 : this.l) {
                    if (!amq2.a($$2) || euz.this.o.a(amq2.b($$2)) <= 0) continue;
                    $$3 = true;
                }
                if (!$$3) continue;
                $$1.add($$2);
            }
            for (cpn $$5 : jb.f) {
                boolean $$6 = false;
                for (amq<cml> amq3 : this.a) {
                    if (!amq3.a($$5) || euz.this.o.a(amq3.b($$5)) <= 0) continue;
                    $$6 = true;
                }
                if (!$$6) continue;
                $$1.add($$5.k());
            }
            $$1.remove(cgc.a);
            for (cfu $$8 : $$1) {
                this.b(new a($$8));
            }
        }

        @Override
        protected void a(eox $$0, int $$1, int $$2) {
            if (!this.b.n.b()) {
                this.m = -1;
            }
            for (int $$3 = 0; $$3 < this.r.length; ++$$3) {
                euz.this.a($$0, $$1 + euz.this.a($$3) - 18, $$2 + 1, 0, this.m == $$3 ? 0 : 18);
            }
            if (this.o != null) {
                int $$4 = euz.this.a(this.b(this.o)) - 36;
                int $$5 = this.p == 1 ? 2 : 1;
                euz.this.a($$0, $$1 + $$4, $$2 + 1, 18 * $$5, 0);
            }
            for (int $$6 = 0; $$6 < this.r.length; ++$$6) {
                int $$7 = this.m == $$6 ? 1 : 0;
                euz.this.a($$0, $$1 + euz.this.a($$6) - 18 + $$7, $$2 + 1 + $$7, 18 * this.r[$$6], 18);
            }
        }

        @Override
        public int b() {
            return 375;
        }

        @Override
        protected int c() {
            return this.d / 2 + 140;
        }

        @Override
        protected void a(eox $$0) {
            euz.this.a($$0);
        }

        @Override
        protected void a(int $$0, int $$1) {
            this.m = -1;
            for (int $$2 = 0; $$2 < this.r.length; ++$$2) {
                int $$3 = $$0 - euz.this.a($$2);
                if ($$3 < -36 || $$3 > 0) continue;
                this.m = $$2;
                break;
            }
            if (this.m >= 0) {
                this.a(this.a(this.m));
                this.b.ah().a(fxt.a(amh.yo, 1.0f));
            }
        }

        private amq<?> a(int $$0) {
            return $$0 < this.a.size() ? this.a.get($$0) : this.l.get($$0 - this.a.size());
        }

        @Override
        private int b(amq<?> $$0) {
            int $$1 = this.a.indexOf($$0);
            if ($$1 >= 0) {
                return $$1;
            }
            int $$2 = this.l.indexOf($$0);
            if ($$2 >= 0) {
                return $$2 + this.a.size();
            }
            return -1;
        }

        @Override
        protected void b(eox $$0, int $$1, int $$2) {
            if ($$2 < this.f || $$2 > this.g) {
                return;
            }
            a $$3 = (a)this.r();
            int $$4 = (this.d - this.b()) / 2;
            if ($$3 != null) {
                if ($$1 < $$4 + 40 || $$1 > $$4 + 40 + 20) {
                    return;
                }
                cfu $$5 = $$3.b();
                this.a($$0, this.a($$5), $$1, $$2);
            } else {
                sw $$6 = null;
                int $$7 = $$1 - $$4;
                for (int $$8 = 0; $$8 < this.r.length; ++$$8) {
                    int $$9 = euz.this.a($$8);
                    if ($$7 < $$9 - 18 || $$7 > $$9) continue;
                    $$6 = this.a($$8).c();
                    break;
                }
                this.a($$0, $$6, $$1, $$2);
            }
        }

        protected void a(eox $$0, @Nullable sw $$1, int $$2, int $$3) {
            if ($$1 == null) {
                return;
            }
            int $$4 = $$2 + 12;
            int $$5 = $$3 - 12;
            int $$6 = euz.this.i.a($$1);
            $$0.b($$4 - 3, $$5 - 3, $$4 + $$6 + 3, $$5 + 8 + 3, -1073741824, -1073741824);
            $$0.c().a();
            $$0.c().a(0.0f, 0.0f, 400.0f);
            $$0.b(euz.this.i, $$1, $$4, $$5, -1);
            $$0.c().b();
        }

        protected sw a(cfu $$0) {
            return $$0.p();
        }

        @Override
        protected void a(amq<?> $$0) {
            if ($$0 != this.o) {
                this.o = $$0;
                this.p = -1;
            } else if (this.p == -1) {
                this.p = 1;
            } else {
                this.o = null;
                this.p = 0;
            }
            this.i().sort(this.n);
        }

        class b
        implements Comparator<a> {
            b() {
            }

            public int a(a $$0, a $$1) {
                int $$11;
                int $$10;
                cfu $$2 = $$0.b();
                cfu $$3 = $$1.b();
                if (b.this.o == null) {
                    boolean $$4 = false;
                    boolean $$5 = false;
                } else if (b.this.a.contains(b.this.o)) {
                    amq<?> $$6 = b.this.o;
                    int $$7 = $$2 instanceof cds ? euz.this.o.a($$6, ((cds)$$2).e()) : -1;
                    int $$8 = $$3 instanceof cds ? euz.this.o.a($$6, ((cds)$$3).e()) : -1;
                } else {
                    amq<?> $$9 = b.this.o;
                    $$10 = euz.this.o.a($$9, $$2);
                    $$11 = euz.this.o.a($$9, $$3);
                }
                if ($$10 == $$11) {
                    return b.this.p * Integer.compare(cfu.a($$2), cfu.a($$3));
                }
                return b.this.p * Integer.compare($$10, $$11);
            }

            @Override
            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((a)object, (a)object2);
            }
        }

        class a
        extends eqc.a<a> {
            private final cfu b;

            a(cfu $$0) {
                this.b = $$0;
            }

            public cfu b() {
                return this.b;
            }

            @Override
            public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
                euz.this.a($$0, $$3 + 40, $$2, this.b);
                for (int $$10 = 0; $$10 < euz.this.m.a.size(); ++$$10) {
                    amo<?> $$12;
                    if (this.b instanceof cds) {
                        amo<cpn> $$11 = euz.this.m.a.get($$10).b(((cds)this.b).e());
                    } else {
                        $$12 = null;
                    }
                    this.a($$0, $$12, $$3 + euz.this.a($$10), $$2, $$1 % 2 == 0);
                }
                for (int $$13 = 0; $$13 < euz.this.m.l.size(); ++$$13) {
                    this.a($$0, euz.this.m.l.get($$13).b(this.b), $$3 + euz.this.a($$13 + euz.this.m.a.size()), $$2, $$1 % 2 == 0);
                }
            }

            protected void a(eox $$0, @Nullable amo<?> $$1, int $$2, int $$3, boolean $$4) {
                String $$5 = $$1 == null ? "-" : $$1.a(euz.this.o.a($$1));
                $$0.b(euz.this.i, $$5, $$2 - euz.this.i.b($$5), $$3 + 5, $$4 ? 0xFFFFFF : 0x909090);
            }

            @Override
            public sw a() {
                return sw.a("narrator.select", this.b.p());
            }
        }
    }

    class c
    extends eqc<a> {
        public c(enn $$0) {
            super($$0, euz.this.g, euz.this.h, 32, euz.this.h - 64, ((euz)euz.this).i.b * 4);
            for (bfn bfn2 : jb.h) {
                if (euz.this.o.a(amr.g.b(bfn2)) <= 0 && euz.this.o.a(amr.h.b(bfn2)) <= 0) continue;
                this.b(new a(bfn2));
            }
        }

        @Override
        protected void a(eox $$0) {
            euz.this.a($$0);
        }

        class a
        extends eqc.a<a> {
            private final sw b;
            private final sw c;
            private final boolean d;
            private final sw e;
            private final boolean f;

            public a(bfn<?> $$0) {
                this.b = $$0.h();
                int $$1 = euz.this.o.a(amr.g.b($$0));
                if ($$1 == 0) {
                    this.c = sw.a("stat_type.minecraft.killed.none", this.b);
                    this.d = false;
                } else {
                    this.c = sw.a("stat_type.minecraft.killed", $$1, this.b);
                    this.d = true;
                }
                int $$2 = euz.this.o.a(amr.h.b($$0));
                if ($$2 == 0) {
                    this.e = sw.a("stat_type.minecraft.killed_by.none", this.b);
                    this.f = false;
                } else {
                    this.e = sw.a("stat_type.minecraft.killed_by", this.b, $$2);
                    this.f = true;
                }
            }

            @Override
            public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
                $$0.b(euz.this.i, this.b, $$3 + 2, $$2 + 1, 0xFFFFFF);
                $$0.b(euz.this.i, this.c, $$3 + 2 + 10, $$2 + 1 + ((euz)euz.this).i.b, this.d ? 0x909090 : 0x606060);
                $$0.b(euz.this.i, this.e, $$3 + 2 + 10, $$2 + 1 + ((euz)euz.this).i.b * 2, this.f ? 0x909090 : 0x606060);
            }

            @Override
            public sw a() {
                return sw.a("narrator.select", sv.a(new sw[]{this.c, this.e}));
            }
        }
    }
}

