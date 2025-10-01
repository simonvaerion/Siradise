/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  javax.annotation.Nullable
 */
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class fxm
implements fxi {
    private static final int a = 40;
    private static final float b = 0.001f;
    private final fiy c;
    private final fzc d;
    private final cnm e;
    private final apf f;
    private final Object2ObjectArrayMap<cnk, a> g = new Object2ObjectArrayMap();
    private Optional<cni> h = Optional.empty();
    private Optional<cnh> i = Optional.empty();
    private float j;
    @Nullable
    private cnk k;

    public fxm(fiy $$0, fzc $$1, cnm $$2) {
        this.f = $$0.dI().y_();
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    public float b() {
        return this.j;
    }

    @Override
    public void a() {
        this.g.values().removeIf(fxh::m);
        cnk $$02 = this.e.a(this.c.dn(), this.c.dp(), this.c.dt()).a();
        if ($$02 != this.k) {
            this.k = $$02;
            this.h = $$02.m();
            this.i = $$02.n();
            this.g.values().forEach(a::o);
            $$02.l().ifPresent($$12 -> this.g.compute((Object)$$02, ($$1, $$2) -> {
                if ($$2 == null) {
                    $$2 = new a((amg)$$12.a());
                    this.d.a((fxy)$$2);
                }
                $$2.p();
                return $$2;
            }));
        }
        this.i.ifPresent($$0 -> {
            if (this.f.j() < $$0.b()) {
                this.d.a(fxt.b($$0.a().a()));
            }
        });
        this.h.ifPresent($$0 -> {
            cmm $$1 = this.c.dI();
            int $$2 = $$0.c() * 2 + 1;
            gu $$3 = gu.a(this.c.dn() + (double)this.f.a($$2) - (double)$$0.c(), this.c.dr() + (double)this.f.a($$2) - (double)$$0.c(), this.c.dt() + (double)this.f.a($$2) - (double)$$0.c());
            int $$4 = $$1.a(cmv.a, $$3);
            this.j = $$4 > 0 ? (this.j -= (float)$$4 / (float)$$1.M() * 0.001f) : (this.j -= (float)($$1.a(cmv.b, $$3) - 1) / (float)$$0.b());
            if (this.j >= 1.0f) {
                double $$5 = (double)$$3.u() + 0.5;
                double $$6 = (double)$$3.v() + 0.5;
                double $$7 = (double)$$3.w() + 0.5;
                double $$8 = $$5 - this.c.dn();
                double $$9 = $$6 - this.c.dr();
                double $$10 = $$7 - this.c.dt();
                double $$11 = Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10);
                double $$12 = $$11 + $$0.d();
                fxt $$13 = fxt.a($$0.a().a(), this.f, this.c.dn() + $$8 / $$11 * $$12, this.c.dr() + $$9 / $$11 * $$12, this.c.dt() + $$10 / $$11 * $$12);
                this.d.a($$13);
                this.j = 0.0f;
            } else {
                this.j = Math.max(this.j, 0.0f);
            }
        });
    }

    public static class a
    extends fxh {
        private int n;
        private int o;

        public a(amg $$0) {
            super($$0, ami.i, fxy.t());
            this.i = true;
            this.j = 0;
            this.d = 1.0f;
            this.l = true;
        }

        @Override
        public void q() {
            if (this.o < 0) {
                this.n();
            }
            this.o += this.n;
            this.d = apa.a((float)this.o / 40.0f, 0.0f, 1.0f);
        }

        public void o() {
            this.o = Math.min(this.o, 40);
            this.n = -1;
        }

        public void p() {
            this.o = Math.max(0, this.o);
            this.n = 1;
        }
    }
}

