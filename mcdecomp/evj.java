/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.ArrayUtils
 */
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class evj
extends epo<b> {
    final evk a;
    int l;

    public evj(evk $$0, enn $$1) {
        super($$1, $$0.g + 45, $$0.h, 20, $$0.h - 32, 20);
        this.a = $$0;
        Object[] $$2 = (enl[])ArrayUtils.clone((Object[])$$1.m.X);
        Arrays.sort($$2);
        String $$3 = null;
        for (Object $$4 : $$2) {
            tj $$6;
            int $$7;
            String $$5 = ((enl)$$4).f();
            if (!$$5.equals($$3)) {
                $$3 = $$5;
                this.b(new a(sw.c($$5)));
            }
            if (($$7 = $$1.h.a($$6 = sw.c(((enl)$$4).h()))) > this.l) {
                this.l = $$7;
            }
            this.b(new c((enl)$$4, $$6));
        }
    }

    public void d() {
        enl.d();
        this.e();
    }

    public void e() {
        this.i().forEach(b::d);
    }

    @Override
    protected int c() {
        return super.c() + 15;
    }

    @Override
    public int b() {
        return super.b() + 32;
    }

    public class a
    extends b {
        final sw b;
        private final int c;

        public a(sw $$1) {
            this.b = $$1;
            this.c = ((evj)evj.this).b.h.a(this.b);
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(((evj)evj.this).b.h, this.b, ((evj)evj.this).b.z.g / 2 - this.c / 2, $$2 + $$5 - ((evj)evj.this).b.h.b - 1, 0xFFFFFF, false);
        }

        @Override
        @Nullable
        public eou a(esv $$0) {
            return null;
        }

        @Override
        public List<? extends eqt> i() {
            return Collections.emptyList();
        }

        @Override
        public List<? extends esn> b() {
            return ImmutableList.of((Object)new esn(){

                @Override
                public esn.a q() {
                    return esn.a.b;
                }

                @Override
                public void b(esp $$0) {
                    $$0.a(eso.a, a.this.b);
                }
            });
        }

        @Override
        protected void d() {
        }
    }

    public class c
    extends b {
        private final enl b;
        private final sw c;
        private final epi d;
        private final epi e;
        private boolean f = false;

        c(enl $$12, sw $$22) {
            this.b = $$12;
            this.c = $$22;
            this.d = epi.a($$22, (epi $$1) -> {
                evj.this.a.c = $$12;
                evj.this.d();
            }).a(0, 0, 75, 20).a((Supplier<tj> $$2) -> {
                if ($$12.j()) {
                    return sw.a("narrator.controls.unbound", $$22);
                }
                return sw.a("narrator.controls.bound", $$22, $$2.get());
            }).a();
            this.e = epi.a(sw.c("controls.reset"), (epi $$1) -> {
                ((evj)evj.this).b.m.a($$12, $$12.i());
                evj.this.d();
            }).a(0, 0, 50, 20).a((Supplier<tj> $$1) -> sw.a("narrator.controls.reset", $$22)).a();
            this.d();
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(((evj)evj.this).b.h, this.c, $$3 + 90 - evj.this.l, $$2 + $$5 / 2 - ((evj)evj.this).b.h.b / 2, 0xFFFFFF, false);
            this.e.e($$3 + 190);
            this.e.f($$2);
            this.e.a($$0, $$6, $$7, $$9);
            this.d.e($$3 + 105);
            this.d.f($$2);
            if (this.f) {
                int $$10 = 3;
                int $$11 = this.d.p() - 6;
                $$0.a($$11, $$2 + 2, $$11 + 3, $$2 + $$5 + 2, (int)(n.m.f() | 0xFF000000));
            }
            this.d.a($$0, $$6, $$7, $$9);
        }

        @Override
        public List<? extends eqt> i() {
            return ImmutableList.of((Object)this.d, (Object)this.e);
        }

        @Override
        public List<? extends esn> b() {
            return ImmutableList.of((Object)this.d, (Object)this.e);
        }

        @Override
        protected void d() {
            this.d.b(this.b.k());
            this.e.r = !this.b.l();
            this.f = false;
            tj $$0 = sw.h();
            if (!this.b.j()) {
                for (enl $$1 : ((evj)evj.this).b.m.X) {
                    if ($$1 == this.b || !this.b.b($$1)) continue;
                    if (this.f) {
                        $$0.f(", ");
                    }
                    this.f = true;
                    $$0.b(sw.c($$1.h()));
                }
            }
            if (this.f) {
                this.d.b(sw.b("[ ").b(this.d.l().e().a(n.p)).f(" ]").a(n.m));
                this.d.a(eqp.a(sw.a("controls.keybinds.duplicateKeybinds", $$0)));
            } else {
                this.d.a((eqp)null);
            }
            if (evj.this.a.c == this.b) {
                this.d.b(sw.b("> ").b(this.d.l().e().a(n.p, n.t)).f(" <").a(n.o));
            }
        }
    }

    public static abstract class b
    extends epo.a<b> {
        abstract void d();
    }
}

