/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class duk {
    private static final int b = 3;
    private static final int c = 3;
    private static final int d = 50;
    private static final int e = 10;
    private static final boolean f = true;
    public static final int a = 64;
    private static final f[] g = new f[]{new f(n.class, 40, 0), new f(h.class, 5, 5), new f(d.class, 20, 0), new f(i.class, 20, 0), new f(j.class, 10, 6), new f(o.class, 5, 5), new f(l.class, 5, 5), new f(c.class, 5, 4), new f(a.class, 5, 4), new f(e.class, 10, 2){

        @Override
        public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
        }
    }, new f(g.class, 20, 1){

        @Override
        public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
        }
    }};
    private static List<f> h;
    static Class<? extends p> i;
    private static int j;
    static final k k;

    public static void a() {
        h = Lists.newArrayList();
        for (f $$0 : g) {
            $$0.c = 0;
            h.add($$0);
        }
        i = null;
    }

    private static boolean b() {
        boolean $$0 = false;
        j = 0;
        for (f $$1 : h) {
            if ($$1.d > 0 && $$1.c < $$1.d) {
                $$0 = true;
            }
            j += $$1.b;
        }
        return $$0;
    }

    private static p a(Class<? extends p> $$0, dsf $$1, apf $$2, int $$3, int $$4, int $$5, @Nullable ha $$6, int $$7) {
        p $$8 = null;
        if ($$0 == n.class) {
            $$8 = n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == h.class) {
            $$8 = duk$h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == d.class) {
            $$8 = duk$d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == i.class) {
            $$8 = duk$i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == j.class) {
            $$8 = duk$j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == o.class) {
            $$8 = o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == l.class) {
            $$8 = l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == c.class) {
            $$8 = duk$c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == a.class) {
            $$8 = duk$a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == e.class) {
            $$8 = duk$e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == g.class) {
            $$8 = duk$g.a($$1, $$3, $$4, $$5, $$6, $$7);
        }
        return $$8;
    }

    private static p a(m $$0, dsf $$1, apf $$2, int $$3, int $$4, int $$5, ha $$6, int $$7) {
        if (!duk.b()) {
            return null;
        }
        if (i != null) {
            p $$8 = duk.a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
                return $$8;
            }
        }
        int $$9 = 0;
        block0: while ($$9 < 5) {
            ++$$9;
            int $$10 = $$2.a(j);
            for (f $$11 : h) {
                if (($$10 -= $$11.b) >= 0) continue;
                if (!$$11.a($$7) || $$11 == $$0.a) continue block0;
                p $$12 = duk.a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
                if ($$12 == null) continue;
                ++$$11.c;
                $$0.a = $$11;
                if (!$$11.a()) {
                    h.remove($$11);
                }
                return $$12;
            }
        }
        drs $$13 = duk$b.a($$1, $$2, $$3, $$4, $$5, $$6);
        if ($$13 != null && $$13.h() > 1) {
            return new b($$7, $$13, $$6);
        }
        return null;
    }

    static dse b(m $$0, dsf $$1, apf $$2, int $$3, int $$4, int $$5, @Nullable ha $$6, int $$7) {
        if ($$7 > 50) {
            return null;
        }
        if (Math.abs($$3 - $$0.f().g()) > 112 || Math.abs($$5 - $$0.f().i()) > 112) {
            return null;
        }
        p $$8 = duk.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
        if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
        }
        return $$8;
    }

    static {
        k = new k();
    }

    static class f {
        public final Class<? extends p> a;
        public final int b;
        public int c;
        public final int d;

        public f(Class<? extends p> $$0, int $$1, int $$2) {
            this.a = $$0;
            this.b = $$1;
            this.d = $$2;
        }

        public boolean a(int $$0) {
            return this.d == 0 || this.c < this.d;
        }

        public boolean a() {
            return this.d == 0 || this.c < this.d;
        }
    }

    public static class n
    extends p {
        private static final int a = 5;
        private static final int b = 5;
        private static final int c = 7;
        private final boolean d;
        private final boolean i;

        public n(int $$0, apf $$1, drs $$2, ha $$3) {
            super(dsr.E, $$0, $$2);
            this.a($$3);
            this.h = this.b($$1);
            this.d = $$1.a(2) == 0;
            this.i = $$1.a(2) == 0;
        }

        public n(qr $$0) {
            super(dsr.E, $$0);
            this.d = $$0.q("Left");
            this.i = $$0.q("Right");
        }

        @Override
        protected void a(dsq $$0, qr $$1) {
            super.a($$0, $$1);
            $$1.a("Left", this.d);
            $$1.a("Right", this.i);
        }

        @Override
        public void a(dse $$0, dsf $$1, apf $$2) {
            this.a((m)$$0, $$1, $$2, 1, 1);
            if (this.d) {
                this.b((m)$$0, $$1, $$2, 1, 2);
            }
            if (this.i) {
                this.c((m)$$0, $$1, $$2, 1, 2);
            }
        }

        public static n a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
            drs $$7 = drs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
            if (!n.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new n($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
            this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 1, 1, 0);
            this.a($$0, $$3, $$4, p.a.a, 1, 1, 6);
            dcb $$7 = (dcb)cpo.cq.n().a(cyn.a, ha.f);
            dcb $$8 = (dcb)cpo.cq.n().a(cyn.a, ha.e);
            this.a($$0, $$4, $$3, 0.1f, 1, 2, 1, $$7);
            this.a($$0, $$4, $$3, 0.1f, 3, 2, 1, $$8);
            this.a($$0, $$4, $$3, 0.1f, 1, 2, 5, $$7);
            this.a($$0, $$4, $$3, 0.1f, 3, 2, 5, $$8);
            if (this.d) {
                this.a($$0, $$4, 0, 1, 2, 0, 3, 4, e, e, false);
            }
            if (this.i) {
                this.a($$0, $$4, 4, 1, 2, 4, 3, 4, e, e, false);
            }
        }
    }

    public static class h
    extends p {
        protected static final int a = 9;
        protected static final int b = 5;
        protected static final int c = 11;

        public h(int $$0, apf $$1, drs $$2, ha $$3) {
            super(dsr.z, $$0, $$2);
            this.a($$3);
            this.h = this.b($$1);
        }

        public h(qr $$0) {
            super(dsr.z, $$0);
        }

        @Override
        public void a(dse $$0, dsf $$1, apf $$2) {
            this.a((m)$$0, $$1, $$2, 1, 1);
        }

        public static h a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
            drs $$7 = drs.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
            if (!duk$h.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new h($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
            this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 1, 1, 0);
            this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
            this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, k);
            this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, k);
            this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, k);
            this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, k);
            for (int $$7 = 1; $$7 <= 3; ++$$7) {
                this.a($$0, (dcb)((dcb)cpo.eX.n().a(ctl.a, true)).a(ctl.c, true), 4, $$7, 4, $$4);
                this.a($$0, (dcb)((dcb)((dcb)cpo.eX.n().a(ctl.a, true)).a(ctl.c, true)).a(ctl.b, true), 4, $$7, 5, $$4);
                this.a($$0, (dcb)((dcb)cpo.eX.n().a(ctl.a, true)).a(ctl.c, true), 4, $$7, 6, $$4);
                this.a($$0, (dcb)((dcb)cpo.eX.n().a(ctl.d, true)).a(ctl.b, true), 5, $$7, 5, $$4);
                this.a($$0, (dcb)((dcb)cpo.eX.n().a(ctl.d, true)).a(ctl.b, true), 6, $$7, 5, $$4);
                this.a($$0, (dcb)((dcb)cpo.eX.n().a(ctl.d, true)).a(ctl.b, true), 7, $$7, 5, $$4);
            }
            this.a($$0, (dcb)((dcb)cpo.eX.n().a(ctl.a, true)).a(ctl.c, true), 4, 3, 2, $$4);
            this.a($$0, (dcb)((dcb)cpo.eX.n().a(ctl.a, true)).a(ctl.c, true), 4, 3, 8, $$4);
            dcb $$8 = (dcb)cpo.dy.n().a(crp.a, ha.e);
            dcb $$9 = (dcb)((dcb)cpo.dy.n().a(crp.a, ha.e)).a(crp.e, dcx.a);
            this.a($$0, $$8, 4, 1, 2, $$4);
            this.a($$0, $$9, 4, 2, 2, $$4);
            this.a($$0, $$8, 4, 1, 8, $$4);
            this.a($$0, $$9, 4, 2, 8, $$4);
        }
    }

    public static class d
    extends q {
        public d(int $$0, apf $$1, drs $$2, ha $$3) {
            super(dsr.w, $$0, $$2);
            this.a($$3);
            this.h = this.b($$1);
        }

        public d(qr $$0) {
            super(dsr.w, $$0);
        }

        @Override
        public void a(dse $$0, dsf $$1, apf $$2) {
            ha $$3 = this.i();
            if ($$3 == ha.c || $$3 == ha.f) {
                this.b((m)$$0, $$1, $$2, 1, 1);
            } else {
                this.c((m)$$0, $$1, $$2, 1, 1);
            }
        }

        public static d a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
            drs $$7 = drs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
            if (!duk$d.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new d($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
            this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 1, 1, 0);
            ha $$7 = this.i();
            if ($$7 == ha.c || $$7 == ha.f) {
                this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
            } else {
                this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
            }
        }
    }

    public static class i
    extends q {
        public i(int $$0, apf $$1, drs $$2, ha $$3) {
            super(dsr.A, $$0, $$2);
            this.a($$3);
            this.h = this.b($$1);
        }

        public i(qr $$0) {
            super(dsr.A, $$0);
        }

        @Override
        public void a(dse $$0, dsf $$1, apf $$2) {
            ha $$3 = this.i();
            if ($$3 == ha.c || $$3 == ha.f) {
                this.c((m)$$0, $$1, $$2, 1, 1);
            } else {
                this.b((m)$$0, $$1, $$2, 1, 1);
            }
        }

        public static i a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
            drs $$7 = drs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
            if (!duk$i.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new i($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
            this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 1, 1, 0);
            ha $$7 = this.i();
            if ($$7 == ha.c || $$7 == ha.f) {
                this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
            } else {
                this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
            }
        }
    }

    public static class j
    extends p {
        protected static final int a = 11;
        protected static final int b = 7;
        protected static final int c = 11;
        protected final int d;

        public j(int $$0, apf $$1, drs $$2, ha $$3) {
            super(dsr.B, $$0, $$2);
            this.a($$3);
            this.h = this.b($$1);
            this.d = $$1.a(5);
        }

        public j(qr $$0) {
            super(dsr.B, $$0);
            this.d = $$0.h("Type");
        }

        @Override
        protected void a(dsq $$0, qr $$1) {
            super.a($$0, $$1);
            $$1.a("Type", this.d);
        }

        @Override
        public void a(dse $$0, dsf $$1, apf $$2) {
            this.a((m)$$0, $$1, $$2, 4, 1);
            this.b((m)$$0, $$1, $$2, 1, 4);
            this.c((m)$$0, $$1, $$2, 1, 4);
        }

        public static j a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
            drs $$7 = drs.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
            if (!duk$j.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new j($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
            this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 4, 1, 0);
            this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
            this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
            this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
            switch (this.d) {
                default: {
                    break;
                }
                case 0: {
                    this.a($$0, cpo.eI.n(), 5, 1, 5, $$4);
                    this.a($$0, cpo.eI.n(), 5, 2, 5, $$4);
                    this.a($$0, cpo.eI.n(), 5, 3, 5, $$4);
                    this.a($$0, (dcb)cpo.cq.n().a(cyn.a, ha.e), 4, 3, 5, $$4);
                    this.a($$0, (dcb)cpo.cq.n().a(cyn.a, ha.f), 6, 3, 5, $$4);
                    this.a($$0, (dcb)cpo.cq.n().a(cyn.a, ha.d), 5, 3, 4, $$4);
                    this.a($$0, (dcb)cpo.cq.n().a(cyn.a, ha.c), 5, 3, 6, $$4);
                    this.a($$0, cpo.jE.n(), 4, 1, 4, $$4);
                    this.a($$0, cpo.jE.n(), 4, 1, 5, $$4);
                    this.a($$0, cpo.jE.n(), 4, 1, 6, $$4);
                    this.a($$0, cpo.jE.n(), 6, 1, 4, $$4);
                    this.a($$0, cpo.jE.n(), 6, 1, 5, $$4);
                    this.a($$0, cpo.jE.n(), 6, 1, 6, $$4);
                    this.a($$0, cpo.jE.n(), 5, 1, 4, $$4);
                    this.a($$0, cpo.jE.n(), 5, 1, 6, $$4);
                    break;
                }
                case 1: {
                    for (int $$7 = 0; $$7 < 5; ++$$7) {
                        this.a($$0, cpo.eI.n(), 3, 1, 3 + $$7, $$4);
                        this.a($$0, cpo.eI.n(), 7, 1, 3 + $$7, $$4);
                        this.a($$0, cpo.eI.n(), 3 + $$7, 1, 3, $$4);
                        this.a($$0, cpo.eI.n(), 3 + $$7, 1, 7, $$4);
                    }
                    this.a($$0, cpo.eI.n(), 5, 1, 5, $$4);
                    this.a($$0, cpo.eI.n(), 5, 2, 5, $$4);
                    this.a($$0, cpo.eI.n(), 5, 3, 5, $$4);
                    this.a($$0, cpo.G.n(), 5, 4, 5, $$4);
                    break;
                }
                case 2: {
                    for (int $$8 = 1; $$8 <= 9; ++$$8) {
                        this.a($$0, cpo.m.n(), 1, 3, $$8, $$4);
                        this.a($$0, cpo.m.n(), 9, 3, $$8, $$4);
                    }
                    for (int $$9 = 1; $$9 <= 9; ++$$9) {
                        this.a($$0, cpo.m.n(), $$9, 3, 1, $$4);
                        this.a($$0, cpo.m.n(), $$9, 3, 9, $$4);
                    }
                    this.a($$0, cpo.m.n(), 5, 1, 4, $$4);
                    this.a($$0, cpo.m.n(), 5, 1, 6, $$4);
                    this.a($$0, cpo.m.n(), 5, 3, 4, $$4);
                    this.a($$0, cpo.m.n(), 5, 3, 6, $$4);
                    this.a($$0, cpo.m.n(), 4, 1, 5, $$4);
                    this.a($$0, cpo.m.n(), 6, 1, 5, $$4);
                    this.a($$0, cpo.m.n(), 4, 3, 5, $$4);
                    this.a($$0, cpo.m.n(), 6, 3, 5, $$4);
                    for (int $$10 = 1; $$10 <= 3; ++$$10) {
                        this.a($$0, cpo.m.n(), 4, $$10, 4, $$4);
                        this.a($$0, cpo.m.n(), 6, $$10, 4, $$4);
                        this.a($$0, cpo.m.n(), 4, $$10, 6, $$4);
                        this.a($$0, cpo.m.n(), 6, $$10, 6, $$4);
                    }
                    this.a($$0, cpo.cq.n(), 5, 3, 5, $$4);
                    for (int $$11 = 2; $$11 <= 8; ++$$11) {
                        this.a($$0, cpo.n.n(), 2, 3, $$11, $$4);
                        this.a($$0, cpo.n.n(), 3, 3, $$11, $$4);
                        if ($$11 <= 3 || $$11 >= 7) {
                            this.a($$0, cpo.n.n(), 4, 3, $$11, $$4);
                            this.a($$0, cpo.n.n(), 5, 3, $$11, $$4);
                            this.a($$0, cpo.n.n(), 6, 3, $$11, $$4);
                        }
                        this.a($$0, cpo.n.n(), 7, 3, $$11, $$4);
                        this.a($$0, cpo.n.n(), 8, 3, $$11, $$4);
                    }
                    dcb $$12 = (dcb)cpo.cO.n().a(ctq.a, ha.e);
                    this.a($$0, $$12, 9, 1, 3, $$4);
                    this.a($$0, $$12, 9, 2, 3, $$4);
                    this.a($$0, $$12, 9, 3, 3, $$4);
                    this.a($$0, $$4, $$3, 3, 4, 8, dzg.x);
                }
            }
        }
    }

    public static class o
    extends p {
        private static final int a = 5;
        private static final int b = 11;
        private static final int c = 8;

        public o(int $$0, apf $$1, drs $$2, ha $$3) {
            super(dsr.F, $$0, $$2);
            this.a($$3);
            this.h = this.b($$1);
        }

        public o(qr $$0) {
            super(dsr.F, $$0);
        }

        @Override
        public void a(dse $$0, dsf $$1, apf $$2) {
            this.a((m)$$0, $$1, $$2, 1, 1);
        }

        public static o a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
            drs $$7 = drs.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
            if (!o.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new o($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
            this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 1, 7, 0);
            this.a($$0, $$3, $$4, p.a.a, 1, 1, 7);
            dcb $$7 = (dcb)cpo.cQ.n().a(cxh.a, ha.d);
            for (int $$8 = 0; $$8 < 6; ++$$8) {
                this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
                this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
                this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
                if ($$8 >= 5) continue;
                this.a($$0, cpo.eI.n(), 1, 5 - $$8, 1 + $$8, $$4);
                this.a($$0, cpo.eI.n(), 2, 5 - $$8, 1 + $$8, $$4);
                this.a($$0, cpo.eI.n(), 3, 5 - $$8, 1 + $$8, $$4);
            }
        }
    }

    public static class l
    extends p {
        private static final int a = 5;
        private static final int b = 11;
        private static final int c = 5;
        private final boolean d;

        public l(dsr $$0, int $$1, int $$2, int $$3, ha $$4) {
            super($$0, $$1, l.a($$2, 64, $$3, $$4, 5, 11, 5));
            this.d = true;
            this.a($$4);
            this.h = p.a.a;
        }

        public l(int $$0, apf $$1, drs $$2, ha $$3) {
            super(dsr.C, $$0, $$2);
            this.d = false;
            this.a($$3);
            this.h = this.b($$1);
        }

        public l(dsr $$0, qr $$1) {
            super($$0, $$1);
            this.d = $$1.q("Source");
        }

        public l(qr $$0) {
            this(dsr.C, $$0);
        }

        @Override
        protected void a(dsq $$0, qr $$1) {
            super.a($$0, $$1);
            $$1.a("Source", this.d);
        }

        @Override
        public void a(dse $$0, dsf $$1, apf $$2) {
            if (this.d) {
                i = c.class;
            }
            this.a((m)$$0, $$1, $$2, 1, 1);
        }

        public static l a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
            drs $$7 = drs.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
            if (!l.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new l($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
            this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 1, 7, 0);
            this.a($$0, $$3, $$4, p.a.a, 1, 1, 4);
            this.a($$0, cpo.eI.n(), 2, 6, 1, $$4);
            this.a($$0, cpo.eI.n(), 1, 5, 1, $$4);
            this.a($$0, cpo.jE.n(), 1, 6, 1, $$4);
            this.a($$0, cpo.eI.n(), 1, 5, 2, $$4);
            this.a($$0, cpo.eI.n(), 1, 4, 3, $$4);
            this.a($$0, cpo.jE.n(), 1, 5, 3, $$4);
            this.a($$0, cpo.eI.n(), 2, 4, 3, $$4);
            this.a($$0, cpo.eI.n(), 3, 3, 3, $$4);
            this.a($$0, cpo.jE.n(), 3, 4, 3, $$4);
            this.a($$0, cpo.eI.n(), 3, 3, 2, $$4);
            this.a($$0, cpo.eI.n(), 3, 2, 1, $$4);
            this.a($$0, cpo.jE.n(), 3, 3, 1, $$4);
            this.a($$0, cpo.eI.n(), 2, 2, 1, $$4);
            this.a($$0, cpo.eI.n(), 1, 1, 1, $$4);
            this.a($$0, cpo.jE.n(), 1, 2, 1, $$4);
            this.a($$0, cpo.eI.n(), 1, 1, 2, $$4);
            this.a($$0, cpo.jE.n(), 1, 1, 3, $$4);
        }
    }

    public static class c
    extends p {
        protected static final int a = 10;
        protected static final int b = 9;
        protected static final int c = 11;
        private final boolean d;
        private final boolean i;
        private final boolean j;
        private final boolean k;

        public c(int $$0, apf $$1, drs $$2, ha $$3) {
            super(dsr.v, $$0, $$2);
            this.a($$3);
            this.h = this.b($$1);
            this.d = $$1.h();
            this.i = $$1.h();
            this.j = $$1.h();
            this.k = $$1.a(3) > 0;
        }

        public c(qr $$0) {
            super(dsr.v, $$0);
            this.d = $$0.q("leftLow");
            this.i = $$0.q("leftHigh");
            this.j = $$0.q("rightLow");
            this.k = $$0.q("rightHigh");
        }

        @Override
        protected void a(dsq $$0, qr $$1) {
            super.a($$0, $$1);
            $$1.a("leftLow", this.d);
            $$1.a("leftHigh", this.i);
            $$1.a("rightLow", this.j);
            $$1.a("rightHigh", this.k);
        }

        @Override
        public void a(dse $$0, dsf $$1, apf $$2) {
            int $$3 = 3;
            int $$4 = 5;
            ha $$5 = this.i();
            if ($$5 == ha.e || $$5 == ha.c) {
                $$3 = 8 - $$3;
                $$4 = 8 - $$4;
            }
            this.a((m)$$0, $$1, $$2, 5, 1);
            if (this.d) {
                this.b((m)$$0, $$1, $$2, $$3, 1);
            }
            if (this.i) {
                this.b((m)$$0, $$1, $$2, $$4, 7);
            }
            if (this.j) {
                this.c((m)$$0, $$1, $$2, $$3, 1);
            }
            if (this.k) {
                this.c((m)$$0, $$1, $$2, $$4, 7);
            }
        }

        public static c a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
            drs $$7 = drs.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
            if (!duk$c.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new c($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
            this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 4, 3, 0);
            if (this.d) {
                this.a($$0, $$4, 0, 3, 1, 0, 5, 3, e, e, false);
            }
            if (this.j) {
                this.a($$0, $$4, 9, 3, 1, 9, 5, 3, e, e, false);
            }
            if (this.i) {
                this.a($$0, $$4, 0, 5, 7, 0, 7, 9, e, e, false);
            }
            if (this.k) {
                this.a($$0, $$4, 9, 5, 7, 9, 7, 9, e, e, false);
            }
            this.a($$0, $$4, 5, 1, 10, 7, 3, 10, e, e, false);
            this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, k);
            this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, k);
            this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, k);
            this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, k);
            this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, k);
            this.a($$0, $$4, 1, 3, 4, 3, 3, 4, cpo.jE.n(), cpo.jE.n(), false);
            this.a($$0, $$4, 1, 4, 6, 3, 4, 6, cpo.jE.n(), cpo.jE.n(), false);
            this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, k);
            this.a($$0, $$4, 5, 1, 9, 7, 1, 9, cpo.jE.n(), cpo.jE.n(), false);
            this.a($$0, $$4, 5, 2, 7, 7, 2, 7, cpo.jE.n(), cpo.jE.n(), false);
            this.a($$0, $$4, 4, 5, 7, 4, 5, 9, cpo.jE.n(), cpo.jE.n(), false);
            this.a($$0, $$4, 8, 5, 7, 8, 5, 9, cpo.jE.n(), cpo.jE.n(), false);
            this.a($$0, $$4, 5, 5, 7, 7, 5, 9, (dcb)cpo.jE.n().a(cwq.a, ddj.c), (dcb)cpo.jE.n().a(cwq.a, ddj.c), false);
            this.a($$0, (dcb)cpo.cq.n().a(cyn.a, ha.d), 6, 5, 6, $$4);
        }
    }

    public static class a
    extends p {
        private static final int a = 5;
        private static final int b = 5;
        private static final int c = 7;
        private boolean d;

        public a(int $$0, apf $$1, drs $$2, ha $$3) {
            super(dsr.t, $$0, $$2);
            this.a($$3);
            this.h = this.b($$1);
        }

        public a(qr $$0) {
            super(dsr.t, $$0);
            this.d = $$0.q("Chest");
        }

        @Override
        protected void a(dsq $$0, qr $$1) {
            super.a($$0, $$1);
            $$1.a("Chest", this.d);
        }

        @Override
        public void a(dse $$0, dsf $$1, apf $$2) {
            this.a((m)$$0, $$1, $$2, 1, 1);
        }

        public static a a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
            drs $$7 = drs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
            if (!duk$a.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new a($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
            this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 1, 1, 0);
            this.a($$0, $$3, $$4, p.a.a, 1, 1, 6);
            this.a($$0, $$4, 3, 1, 2, 3, 1, 4, cpo.eI.n(), cpo.eI.n(), false);
            this.a($$0, cpo.jK.n(), 3, 1, 1, $$4);
            this.a($$0, cpo.jK.n(), 3, 1, 5, $$4);
            this.a($$0, cpo.jK.n(), 3, 2, 2, $$4);
            this.a($$0, cpo.jK.n(), 3, 2, 4, $$4);
            for (int $$7 = 2; $$7 <= 4; ++$$7) {
                this.a($$0, cpo.jK.n(), 2, 1, $$7, $$4);
            }
            if (!this.d && $$4.b(this.b(3, 2, 3))) {
                this.d = true;
                this.a($$0, $$4, $$3, 3, 2, 3, dzg.y);
            }
        }
    }

    public static class e
    extends p {
        protected static final int a = 14;
        protected static final int b = 6;
        protected static final int c = 11;
        protected static final int d = 15;
        private final boolean i;

        public e(int $$0, apf $$1, drs $$2, ha $$3) {
            super(dsr.x, $$0, $$2);
            this.a($$3);
            this.h = this.b($$1);
            this.i = $$2.d() > 6;
        }

        public e(qr $$0) {
            super(dsr.x, $$0);
            this.i = $$0.q("Tall");
        }

        @Override
        protected void a(dsq $$0, qr $$1) {
            super.a($$0, $$1);
            $$1.a("Tall", this.i);
        }

        public static e a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
            drs $$7 = drs.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
            if (!(duk$e.a($$7) && $$0.a($$7) == null || duk$e.a($$7 = drs.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5)) && $$0.a($$7) == null)) {
                return null;
            }
            return new e($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
            int $$7 = 11;
            if (!this.i) {
                $$7 = 6;
            }
            this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 4, 1, 0);
            this.a($$0, $$4, $$3, 0.07f, 2, 1, 1, 11, 4, 13, cpo.bs.n(), cpo.bs.n(), false, false);
            boolean $$8 = true;
            int $$9 = 12;
            for (int $$10 = 1; $$10 <= 13; ++$$10) {
                if (($$10 - 1) % 4 == 0) {
                    this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cpo.n.n(), cpo.n.n(), false);
                    this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cpo.n.n(), cpo.n.n(), false);
                    this.a($$0, (dcb)cpo.cq.n().a(cyn.a, ha.f), 2, 3, $$10, $$4);
                    this.a($$0, (dcb)cpo.cq.n().a(cyn.a, ha.e), 11, 3, $$10, $$4);
                    if (!this.i) continue;
                    this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cpo.n.n(), cpo.n.n(), false);
                    this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cpo.n.n(), cpo.n.n(), false);
                    continue;
                }
                this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cpo.cl.n(), cpo.cl.n(), false);
                this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cpo.cl.n(), cpo.cl.n(), false);
                if (!this.i) continue;
                this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cpo.cl.n(), cpo.cl.n(), false);
                this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cpo.cl.n(), cpo.cl.n(), false);
            }
            for (int $$11 = 3; $$11 < 12; $$11 += 2) {
                this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, cpo.cl.n(), cpo.cl.n(), false);
                this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, cpo.cl.n(), cpo.cl.n(), false);
                this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, cpo.cl.n(), cpo.cl.n(), false);
            }
            if (this.i) {
                this.a($$0, $$4, 1, 5, 1, 3, 5, 13, cpo.n.n(), cpo.n.n(), false);
                this.a($$0, $$4, 10, 5, 1, 12, 5, 13, cpo.n.n(), cpo.n.n(), false);
                this.a($$0, $$4, 4, 5, 1, 9, 5, 2, cpo.n.n(), cpo.n.n(), false);
                this.a($$0, $$4, 4, 5, 12, 9, 5, 13, cpo.n.n(), cpo.n.n(), false);
                this.a($$0, cpo.n.n(), 9, 5, 11, $$4);
                this.a($$0, cpo.n.n(), 8, 5, 11, $$4);
                this.a($$0, cpo.n.n(), 9, 5, 10, $$4);
                dcb $$12 = (dcb)((dcb)cpo.dU.n().a(csh.d, true)).a(csh.b, true);
                dcb $$13 = (dcb)((dcb)cpo.dU.n().a(csh.a, true)).a(csh.c, true);
                this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
                this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
                this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
                this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
                this.a($$0, (dcb)((dcb)cpo.dU.n().a(csh.a, true)).a(csh.b, true), 3, 6, 2, $$4);
                this.a($$0, (dcb)((dcb)cpo.dU.n().a(csh.c, true)).a(csh.b, true), 3, 6, 12, $$4);
                this.a($$0, (dcb)((dcb)cpo.dU.n().a(csh.a, true)).a(csh.d, true), 10, 6, 2, $$4);
                for (int $$14 = 0; $$14 <= 2; ++$$14) {
                    this.a($$0, (dcb)((dcb)cpo.dU.n().a(csh.c, true)).a(csh.d, true), 8 + $$14, 6, 12 - $$14, $$4);
                    if ($$14 == 2) continue;
                    this.a($$0, (dcb)((dcb)cpo.dU.n().a(csh.a, true)).a(csh.b, true), 8 + $$14, 6, 11 - $$14, $$4);
                }
                dcb $$15 = (dcb)cpo.cO.n().a(ctq.a, ha.d);
                this.a($$0, $$15, 10, 1, 13, $$4);
                this.a($$0, $$15, 10, 2, 13, $$4);
                this.a($$0, $$15, 10, 3, 13, $$4);
                this.a($$0, $$15, 10, 4, 13, $$4);
                this.a($$0, $$15, 10, 5, 13, $$4);
                this.a($$0, $$15, 10, 6, 13, $$4);
                this.a($$0, $$15, 10, 7, 13, $$4);
                int $$16 = 7;
                int $$17 = 7;
                dcb $$18 = (dcb)cpo.dU.n().a(csh.b, true);
                this.a($$0, $$18, 6, 9, 7, $$4);
                dcb $$19 = (dcb)cpo.dU.n().a(csh.d, true);
                this.a($$0, $$19, 7, 9, 7, $$4);
                this.a($$0, $$18, 6, 8, 7, $$4);
                this.a($$0, $$19, 7, 8, 7, $$4);
                dcb $$20 = (dcb)((dcb)$$13.a(csh.d, true)).a(csh.b, true);
                this.a($$0, $$20, 6, 7, 7, $$4);
                this.a($$0, $$20, 7, 7, 7, $$4);
                this.a($$0, $$18, 5, 7, 7, $$4);
                this.a($$0, $$19, 8, 7, 7, $$4);
                this.a($$0, (dcb)$$18.a(csh.a, true), 6, 7, 6, $$4);
                this.a($$0, (dcb)$$18.a(csh.c, true), 6, 7, 8, $$4);
                this.a($$0, (dcb)$$19.a(csh.a, true), 7, 7, 6, $$4);
                this.a($$0, (dcb)$$19.a(csh.c, true), 7, 7, 8, $$4);
                dcb $$21 = cpo.cp.n();
                this.a($$0, $$21, 5, 8, 7, $$4);
                this.a($$0, $$21, 8, 8, 7, $$4);
                this.a($$0, $$21, 6, 8, 6, $$4);
                this.a($$0, $$21, 6, 8, 8, $$4);
                this.a($$0, $$21, 7, 8, 6, $$4);
                this.a($$0, $$21, 7, 8, 8, $$4);
            }
            this.a($$0, $$4, $$3, 3, 3, 5, dzg.w);
            if (this.i) {
                this.a($$0, e, 12, 9, 1, $$4);
                this.a($$0, $$4, $$3, 12, 8, 1, dzg.w);
            }
        }
    }

    public static class g
    extends p {
        protected static final int a = 11;
        protected static final int b = 8;
        protected static final int c = 16;
        private boolean d;

        public g(int $$0, drs $$1, ha $$2) {
            super(dsr.y, $$0, $$1);
            this.a($$2);
        }

        public g(qr $$0) {
            super(dsr.y, $$0);
            this.d = $$0.q("Mob");
        }

        @Override
        protected void a(dsq $$0, qr $$1) {
            super.a($$0, $$1);
            $$1.a("Mob", this.d);
        }

        @Override
        public void a(dse $$0, dsf $$1, apf $$2) {
            if ($$0 != null) {
                ((m)$$0).b = this;
            }
        }

        public static g a(dsf $$0, int $$1, int $$2, int $$3, ha $$4, int $$5) {
            drs $$6 = drs.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
            if (!duk$g.a($$6) || $$0.a($$6) != null) {
                return null;
            }
            return new g($$5, $$6, $$4);
        }

        @Override
        public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
            gu.a $$22;
            this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, k);
            this.a($$0, $$3, $$4, p.a.c, 4, 1, 0);
            int $$7 = 6;
            this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, k);
            this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, k);
            this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, k);
            this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, k);
            this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, k);
            this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, k);
            this.a($$0, $$4, 1, 1, 1, 1, 1, 3, cpo.H.n(), cpo.H.n(), false);
            this.a($$0, $$4, 9, 1, 1, 9, 1, 3, cpo.H.n(), cpo.H.n(), false);
            this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, k);
            this.a($$0, $$4, 4, 1, 9, 6, 1, 11, cpo.H.n(), cpo.H.n(), false);
            dcb $$8 = (dcb)((dcb)cpo.eX.n().a(ctl.a, true)).a(ctl.c, true);
            dcb $$9 = (dcb)((dcb)cpo.eX.n().a(ctl.d, true)).a(ctl.b, true);
            for (int $$10 = 3; $$10 < 14; $$10 += 2) {
                this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
                this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
            }
            for (int $$11 = 2; $$11 < 9; $$11 += 2) {
                this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
            }
            dcb $$12 = (dcb)cpo.fj.n().a(cxh.a, ha.c);
            this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, k);
            this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, k);
            this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, k);
            for (int $$13 = 4; $$13 <= 6; ++$$13) {
                this.a($$0, $$12, $$13, 1, 4, $$4);
                this.a($$0, $$12, $$13, 2, 5, $$4);
                this.a($$0, $$12, $$13, 3, 6, $$4);
            }
            dcb $$14 = (dcb)cpo.fy.n().a(cry.a, ha.c);
            dcb $$15 = (dcb)cpo.fy.n().a(cry.a, ha.d);
            dcb $$16 = (dcb)cpo.fy.n().a(cry.a, ha.f);
            dcb $$17 = (dcb)cpo.fy.n().a(cry.a, ha.e);
            boolean $$18 = true;
            boolean[] $$19 = new boolean[12];
            for (int $$20 = 0; $$20 < $$19.length; ++$$20) {
                $$19[$$20] = $$3.i() > 0.9f;
                $$18 &= $$19[$$20];
            }
            this.a($$0, (dcb)$$14.a(cry.b, $$19[0]), 4, 3, 8, $$4);
            this.a($$0, (dcb)$$14.a(cry.b, $$19[1]), 5, 3, 8, $$4);
            this.a($$0, (dcb)$$14.a(cry.b, $$19[2]), 6, 3, 8, $$4);
            this.a($$0, (dcb)$$15.a(cry.b, $$19[3]), 4, 3, 12, $$4);
            this.a($$0, (dcb)$$15.a(cry.b, $$19[4]), 5, 3, 12, $$4);
            this.a($$0, (dcb)$$15.a(cry.b, $$19[5]), 6, 3, 12, $$4);
            this.a($$0, (dcb)$$16.a(cry.b, $$19[6]), 3, 3, 9, $$4);
            this.a($$0, (dcb)$$16.a(cry.b, $$19[7]), 3, 3, 10, $$4);
            this.a($$0, (dcb)$$16.a(cry.b, $$19[8]), 3, 3, 11, $$4);
            this.a($$0, (dcb)$$17.a(cry.b, $$19[9]), 7, 3, 9, $$4);
            this.a($$0, (dcb)$$17.a(cry.b, $$19[10]), 7, 3, 10, $$4);
            this.a($$0, (dcb)$$17.a(cry.b, $$19[11]), 7, 3, 11, $$4);
            if ($$18) {
                dcb $$21 = cpo.fx.n();
                this.a($$0, $$21, 4, 3, 9, $$4);
                this.a($$0, $$21, 5, 3, 9, $$4);
                this.a($$0, $$21, 6, 3, 9, $$4);
                this.a($$0, $$21, 4, 3, 10, $$4);
                this.a($$0, $$21, 5, 3, 10, $$4);
                this.a($$0, $$21, 6, 3, 10, $$4);
                this.a($$0, $$21, 4, 3, 11, $$4);
                this.a($$0, $$21, 5, 3, 11, $$4);
                this.a($$0, $$21, 6, 3, 11, $$4);
            }
            if (!this.d && $$4.b($$22 = this.b(5, 3, 6))) {
                this.d = true;
                $$0.a((gu)$$22, cpo.ct.n(), 2);
                czn $$23 = $$0.c_($$22);
                if ($$23 instanceof daz) {
                    daz $$24 = (daz)$$23;
                    $$24.a(bfn.aI, $$3);
                }
            }
        }
    }

    static abstract class p
    extends dse {
        protected a h = a.a;

        protected p(dsr $$0, int $$1, drs $$2) {
            super($$0, $$1, $$2);
        }

        public p(dsr $$0, qr $$1) {
            super($$0, $$1);
            this.h = a.valueOf($$1.l("EntryDoor"));
        }

        @Override
        protected void a(dsq $$0, qr $$1) {
            $$1.a("EntryDoor", this.h.name());
        }

        protected void a(cng $$0, apf $$1, drs $$2, a $$3, int $$4, int $$5, int $$6) {
            switch ($$3) {
                case a: {
                    this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
                    break;
                }
                case b: {
                    this.a($$0, cpo.eI.n(), $$4, $$5, $$6, $$2);
                    this.a($$0, cpo.eI.n(), $$4, $$5 + 1, $$6, $$2);
                    this.a($$0, cpo.eI.n(), $$4, $$5 + 2, $$6, $$2);
                    this.a($$0, cpo.eI.n(), $$4 + 1, $$5 + 2, $$6, $$2);
                    this.a($$0, cpo.eI.n(), $$4 + 2, $$5 + 2, $$6, $$2);
                    this.a($$0, cpo.eI.n(), $$4 + 2, $$5 + 1, $$6, $$2);
                    this.a($$0, cpo.eI.n(), $$4 + 2, $$5, $$6, $$2);
                    this.a($$0, cpo.cN.n(), $$4 + 1, $$5, $$6, $$2);
                    this.a($$0, (dcb)cpo.cN.n().a(crp.e, dcx.a), $$4 + 1, $$5 + 1, $$6, $$2);
                    break;
                }
                case c: {
                    this.a($$0, cpo.nc.n(), $$4 + 1, $$5, $$6, $$2);
                    this.a($$0, cpo.nc.n(), $$4 + 1, $$5 + 1, $$6, $$2);
                    this.a($$0, (dcb)cpo.eX.n().a(ctl.d, true), $$4, $$5, $$6, $$2);
                    this.a($$0, (dcb)cpo.eX.n().a(ctl.d, true), $$4, $$5 + 1, $$6, $$2);
                    this.a($$0, (dcb)((dcb)cpo.eX.n().a(ctl.b, true)).a(ctl.d, true), $$4, $$5 + 2, $$6, $$2);
                    this.a($$0, (dcb)((dcb)cpo.eX.n().a(ctl.b, true)).a(ctl.d, true), $$4 + 1, $$5 + 2, $$6, $$2);
                    this.a($$0, (dcb)((dcb)cpo.eX.n().a(ctl.b, true)).a(ctl.d, true), $$4 + 2, $$5 + 2, $$6, $$2);
                    this.a($$0, (dcb)cpo.eX.n().a(ctl.b, true), $$4 + 2, $$5 + 1, $$6, $$2);
                    this.a($$0, (dcb)cpo.eX.n().a(ctl.b, true), $$4 + 2, $$5, $$6, $$2);
                    break;
                }
                case d: {
                    this.a($$0, cpo.eI.n(), $$4, $$5, $$6, $$2);
                    this.a($$0, cpo.eI.n(), $$4, $$5 + 1, $$6, $$2);
                    this.a($$0, cpo.eI.n(), $$4, $$5 + 2, $$6, $$2);
                    this.a($$0, cpo.eI.n(), $$4 + 1, $$5 + 2, $$6, $$2);
                    this.a($$0, cpo.eI.n(), $$4 + 2, $$5 + 2, $$6, $$2);
                    this.a($$0, cpo.eI.n(), $$4 + 2, $$5 + 1, $$6, $$2);
                    this.a($$0, cpo.eI.n(), $$4 + 2, $$5, $$6, $$2);
                    this.a($$0, cpo.dy.n(), $$4 + 1, $$5, $$6, $$2);
                    this.a($$0, (dcb)cpo.dy.n().a(crp.e, dcx.a), $$4 + 1, $$5 + 1, $$6, $$2);
                    this.a($$0, (dcb)cpo.dM.n().a(cpw.aC, ha.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
                    this.a($$0, (dcb)cpo.dM.n().a(cpw.aC, ha.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
                }
            }
        }

        protected a b(apf $$0) {
            int $$1 = $$0.a(5);
            switch ($$1) {
                default: {
                    return a.a;
                }
                case 2: {
                    return a.b;
                }
                case 3: {
                    return a.c;
                }
                case 4: 
            }
            return a.d;
        }

        @Nullable
        protected dse a(m $$0, dsf $$1, apf $$2, int $$3, int $$4) {
            ha $$5 = this.i();
            if ($$5 != null) {
                switch ($$5) {
                    case c: {
                        return duk.b($$0, $$1, $$2, this.f.g() + $$3, this.f.h() + $$4, this.f.i() - 1, $$5, this.g());
                    }
                    case d: {
                        return duk.b($$0, $$1, $$2, this.f.g() + $$3, this.f.h() + $$4, this.f.l() + 1, $$5, this.g());
                    }
                    case e: {
                        return duk.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$4, this.f.i() + $$3, $$5, this.g());
                    }
                    case f: {
                        return duk.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$4, this.f.i() + $$3, $$5, this.g());
                    }
                }
            }
            return null;
        }

        @Nullable
        protected dse b(m $$0, dsf $$1, apf $$2, int $$3, int $$4) {
            ha $$5 = this.i();
            if ($$5 != null) {
                switch ($$5) {
                    case c: {
                        return duk.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$3, this.f.i() + $$4, ha.e, this.g());
                    }
                    case d: {
                        return duk.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$3, this.f.i() + $$4, ha.e, this.g());
                    }
                    case e: {
                        return duk.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.i() - 1, ha.c, this.g());
                    }
                    case f: {
                        return duk.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.i() - 1, ha.c, this.g());
                    }
                }
            }
            return null;
        }

        @Nullable
        protected dse c(m $$0, dsf $$1, apf $$2, int $$3, int $$4) {
            ha $$5 = this.i();
            if ($$5 != null) {
                switch ($$5) {
                    case c: {
                        return duk.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$3, this.f.i() + $$4, ha.f, this.g());
                    }
                    case d: {
                        return duk.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$3, this.f.i() + $$4, ha.f, this.g());
                    }
                    case e: {
                        return duk.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.l() + 1, ha.d, this.g());
                    }
                    case f: {
                        return duk.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.l() + 1, ha.d, this.g());
                    }
                }
            }
            return null;
        }

        protected static boolean a(drs $$0) {
            return $$0 != null && $$0.h() > 10;
        }

        protected static final class a
        extends Enum<a> {
            public static final /* enum */ a a = new a();
            public static final /* enum */ a b = new a();
            public static final /* enum */ a c = new a();
            public static final /* enum */ a d = new a();
            private static final /* synthetic */ a[] e;

            public static a[] values() {
                return (a[])e.clone();
            }

            public static a valueOf(String $$0) {
                return Enum.valueOf(a.class, $$0);
            }

            private static /* synthetic */ a[] a() {
                return new a[]{a, b, c, d};
            }

            static {
                e = duk$p$a.a();
            }
        }
    }

    public static class m
    extends l {
        public f a;
        @Nullable
        public g b;
        public final List<dse> c = Lists.newArrayList();

        public m(apf $$0, int $$1, int $$2) {
            super(dsr.D, 0, $$1, $$2, m.a($$0));
        }

        public m(qr $$0) {
            super(dsr.D, $$0);
        }

        @Override
        public gu h() {
            if (this.b != null) {
                return this.b.h();
            }
            return super.h();
        }
    }

    public static class b
    extends p {
        private final int a;

        public b(int $$0, drs $$1, ha $$2) {
            super(dsr.u, $$0, $$1);
            this.a($$2);
            this.a = $$2 == ha.c || $$2 == ha.d ? $$1.e() : $$1.c();
        }

        public b(qr $$0) {
            super(dsr.u, $$0);
            this.a = $$0.h("Steps");
        }

        @Override
        protected void a(dsq $$0, qr $$1) {
            super.a($$0, $$1);
            $$1.a("Steps", this.a);
        }

        public static drs a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5) {
            int $$6 = 3;
            drs $$7 = drs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
            dse $$8 = $$0.a($$7);
            if ($$8 == null) {
                return null;
            }
            if ($$8.f().h() == $$7.h()) {
                for (int $$9 = 2; $$9 >= 1; --$$9) {
                    $$7 = drs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                    if ($$8.f().a($$7)) continue;
                    return drs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                }
            }
            return null;
        }

        @Override
        public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
            for (int $$7 = 0; $$7 < this.a; ++$$7) {
                this.a($$0, cpo.eI.n(), 0, 0, $$7, $$4);
                this.a($$0, cpo.eI.n(), 1, 0, $$7, $$4);
                this.a($$0, cpo.eI.n(), 2, 0, $$7, $$4);
                this.a($$0, cpo.eI.n(), 3, 0, $$7, $$4);
                this.a($$0, cpo.eI.n(), 4, 0, $$7, $$4);
                for (int $$8 = 1; $$8 <= 3; ++$$8) {
                    this.a($$0, cpo.eI.n(), 0, $$8, $$7, $$4);
                    this.a($$0, cpo.nc.n(), 1, $$8, $$7, $$4);
                    this.a($$0, cpo.nc.n(), 2, $$8, $$7, $$4);
                    this.a($$0, cpo.nc.n(), 3, $$8, $$7, $$4);
                    this.a($$0, cpo.eI.n(), 4, $$8, $$7, $$4);
                }
                this.a($$0, cpo.eI.n(), 0, 4, $$7, $$4);
                this.a($$0, cpo.eI.n(), 1, 4, $$7, $$4);
                this.a($$0, cpo.eI.n(), 2, 4, $$7, $$4);
                this.a($$0, cpo.eI.n(), 3, 4, $$7, $$4);
                this.a($$0, cpo.eI.n(), 4, 4, $$7, $$4);
            }
        }
    }

    static class k
    extends dse.a {
        k() {
        }

        @Override
        public void a(apf $$0, int $$1, int $$2, int $$3, boolean $$4) {
            float $$5;
            this.a = $$4 ? (($$5 = $$0.i()) < 0.2f ? cpo.eK.n() : ($$5 < 0.5f ? cpo.eJ.n() : ($$5 < 0.55f ? cpo.eQ.n() : cpo.eI.n()))) : cpo.nc.n();
        }
    }

    public static abstract class q
    extends p {
        protected static final int a = 5;
        protected static final int b = 5;
        protected static final int c = 5;

        protected q(dsr $$0, int $$1, drs $$2) {
            super($$0, $$1, $$2);
        }

        public q(dsr $$0, qr $$1) {
            super($$0, $$1);
        }
    }
}

