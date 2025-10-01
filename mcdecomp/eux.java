/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Optional;

public class eux
extends eui {
    private static final sw c = sw.c("options.graphics.fabulous").a(n.u);
    private static final sw k = sw.a("options.graphics.warning.message", c, c);
    private static final sw l = sw.c("options.graphics.warning.title").a(n.m);
    private static final sw m = sw.c("options.graphics.warning.accept");
    private static final sw n = sw.c("options.graphics.warning.cancel");
    private eqd o;
    private final fjr p;
    private final int q;

    private static enq<?>[] a(enr $$0) {
        return new enq[]{$$0.i(), $$0.d(), $$0.k(), $$0.e(), $$0.j(), $$0.g(), $$0.J(), $$0.W(), $$0.al(), $$0.z(), $$0.ak(), $$0.h(), $$0.V(), $$0.am(), $$0.y(), $$0.K(), $$0.ae(), $$0.f(), $$0.af(), $$0.aa(), $$0.ah(), $$0.ai()};
    }

    public eux(euq $$0, enr $$1) {
        super($$0, $$1, sw.c("options.videoTitle"));
        this.p = $$0.f.ag();
        this.p.i();
        if ($$1.i().c() == eng.c) {
            this.p.e();
        }
        this.q = $$1.y().c();
    }

    @Override
    protected void b() {
        int $$5;
        this.o = new eqd(this.f, this.g, this.h, 32, this.h - 32, 25);
        int $$0 = -1;
        ehn $$12 = this.f.aM();
        ehi $$22 = $$12.t();
        if ($$22 == null) {
            int $$3 = -1;
        } else {
            Optional<ehm> $$4 = $$12.f();
            $$5 = $$4.map($$22::a).orElse(-1);
        }
        enq<Integer> $$6 = new enq<Integer>("options.fullscreen.resolution", enq.a(), ($$1, $$2) -> {
            if ($$22 == null) {
                return sw.c("options.fullscreen.unavailable");
            }
            if ($$2 == -1) {
                return enr.a($$1, sw.c("options.fullscreen.current"));
            }
            return enr.a($$1, sw.b($$22.a((int)$$2).toString()));
        }, new enq.f(-1, $$22 != null ? $$22.e() - 1 : -1), $$5, $$2 -> {
            if ($$22 == null) {
                return;
            }
            $$12.a($$2 == -1 ? Optional.empty() : Optional.of($$22.a((int)$$2)));
        });
        this.o.a($$6);
        this.o.a(this.b.A());
        this.o.a(eux.a(this.b));
        this.e(this.o);
        this.d(epi.a(sv.d, (epi $$1) -> {
            this.f.m.aq();
            $$12.g();
            this.f.a(this.a);
        }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
    }

    @Override
    public void ax_() {
        if (this.b.y().c() != this.q) {
            this.f.b(this.b.y().c());
            this.f.O();
        }
        super.ax_();
    }

    @Override
    public boolean a(double $$02, double $$1, int $$2) {
        int $$3 = this.b.al().c();
        if (super.a($$02, $$1, $$2)) {
            if (this.b.al().c() != $$3) {
                this.f.a();
            }
            if (this.p.g()) {
                String $$7;
                String $$6;
                ArrayList $$4 = Lists.newArrayList((Object[])new sw[]{k, sv.q});
                String $$5 = this.p.j();
                if ($$5 != null) {
                    $$4.add(sv.q);
                    $$4.add(sw.a("options.graphics.warning.renderer", new Object[]{$$5}).a(n.h));
                }
                if (($$6 = this.p.l()) != null) {
                    $$4.add(sv.q);
                    $$4.add(sw.a("options.graphics.warning.vendor", new Object[]{$$6}).a(n.h));
                }
                if (($$7 = this.p.k()) != null) {
                    $$4.add(sv.q);
                    $$4.add(sw.a("options.graphics.warning.version", new Object[]{$$7}).a(n.h));
                }
                this.f.a(new eum(l, $$4, (ImmutableList<eum.a>)ImmutableList.of((Object)new eum.a(m, $$0 -> {
                    this.b.i().a(eng.c);
                    enn.N().f.f();
                    this.p.e();
                    this.f.a(this);
                }), (Object)new eum.a(n, $$0 -> {
                    this.p.f();
                    this.f.a(this);
                }))));
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean a(double $$0, double $$1, double $$2) {
        if (euq.p()) {
            enq<Integer> $$3 = this.b.al();
            int $$4 = $$3.c() + (int)Math.signum($$2);
            if ($$4 != 0) {
                $$3.a($$4);
                if ($$3.c() == $$4) {
                    this.f.a();
                    return true;
                }
            }
            return false;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0, this.o, $$1, $$2, $$3);
    }
}

