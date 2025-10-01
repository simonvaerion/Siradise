/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ell
extends gan {
    private static final Logger a = LogUtils.getLogger();
    static final acq b = new acq("realms", "textures/gui/realms/op_icon.png");
    static final acq c = new acq("realms", "textures/gui/realms/user_icon.png");
    static final acq G = new acq("realms", "textures/gui/realms/cross_player_icon.png");
    private static final acq H = new acq("minecraft", "textures/gui/options_background.png");
    private static final sw I = sw.c("mco.question");
    static final sw J = sw.c("mco.configure.world.invites.normal.tooltip");
    static final sw K = sw.c("mco.configure.world.invites.ops.tooltip");
    static final sw L = sw.c("mco.configure.world.invites.remove.tooltip");
    private static final int M = -1;
    private final ela N;
    final ejq O;
    b P;
    int Q;
    int R;
    private epi S;
    private epi T;
    int U = -1;
    private boolean V;

    public ell(ela $$0, ejq $$1) {
        super(sw.c("mco.configure.world.players.title"));
        this.N = $$0;
        this.O = $$1;
    }

    @Override
    public void b() {
        this.Q = this.g / 2 - 160;
        this.R = 150;
        int $$02 = this.g / 2 + 12;
        this.P = new b();
        this.P.f(this.Q);
        this.e(this.P);
        for (ejm $$1 : this.O.h) {
            this.P.a($$1);
        }
        this.U = -1;
        this.d(epi.a(sw.c("mco.configure.world.buttons.invite"), (epi $$0) -> this.f.a(new elf(this.N, this, this.O))).a($$02, ell.h(1), this.R + 10, 20).a());
        this.S = this.d(epi.a(sw.c("mco.configure.world.invites.remove.tooltip"), (epi $$0) -> this.l(this.U)).a($$02, ell.h(7), this.R + 10, 20).a());
        this.T = this.d(epi.a(sw.c("mco.configure.world.invites.ops.tooltip"), (epi $$0) -> {
            if (this.O.h.get(this.U).c()) {
                this.k(this.U);
            } else {
                this.j(this.U);
            }
        }).a($$02, ell.h(9), this.R + 10, 20).a());
        this.d(epi.a(sv.k, (epi $$0) -> this.C()).a($$02 + this.R / 2 + 2, ell.h(12), this.R / 2 + 10 - 2, 20).a());
        this.B();
    }

    void B() {
        this.S.s = this.i(this.U);
        this.T.s = this.i(this.U);
        this.P.d();
    }

    private boolean i(int $$0) {
        return $$0 != -1;
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if ($$0 == 256) {
            this.C();
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    private void C() {
        if (this.V) {
            this.f.a(this.N.d());
        } else {
            this.f.a(this.N);
        }
    }

    void j(int $$0) {
        eiz $$1 = eiz.a();
        String $$2 = this.O.h.get($$0).b();
        try {
            this.a($$1.e(this.O.a, $$2));
        }
        catch (ekm $$3) {
            a.error("Couldn't op the user");
        }
        this.B();
    }

    void k(int $$0) {
        eiz $$1 = eiz.a();
        String $$2 = this.O.h.get($$0).b();
        try {
            this.a($$1.f(this.O.a, $$2));
        }
        catch (ekm $$3) {
            a.error("Couldn't deop the user");
        }
        this.B();
    }

    private void a(eji $$0) {
        for (ejm $$1 : this.O.h) {
            $$1.a($$0.a.contains($$1.a()));
        }
    }

    void l(int $$0) {
        this.B();
        if ($$0 >= 0 && $$0 < this.O.h.size()) {
            ejm $$12 = this.O.h.get($$0);
            elb $$2 = new elb($$1 -> {
                if ($$1) {
                    eiz $$2 = eiz.a();
                    try {
                        $$2.a(this.O.a, $$12.b());
                    }
                    catch (ekm $$3) {
                        a.error("Couldn't uninvite user");
                    }
                    this.O.h.remove(this.U);
                    this.U = -1;
                    this.B();
                }
                this.V = true;
                this.f.a(this);
            }, I, sw.a("mco.configure.world.uninvite.player", new Object[]{$$12.a()}));
            this.f.a($$2);
        }
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        this.P.a($$0, $$1, $$2, $$3);
        $$0.a(this.i, this.e, this.g / 2, 17, 0xFFFFFF);
        int $$4 = ell.h(12) + 20;
        $$0.a(0.25f, 0.25f, 0.25f, 1.0f);
        $$0.a(H, 0, $$4, 0.0f, 0.0f, this.g, this.h - $$4, 32, 32);
        $$0.a(1.0f, 1.0f, 1.0f, 1.0f);
        String $$5 = this.O.h != null ? Integer.toString(this.O.h.size()) : "0";
        $$0.a(this.i, sw.a("mco.configure.world.invited.number", new Object[]{$$5}), this.Q, ell.h(0), 0xA0A0A0, false);
        super.a($$0, $$1, $$2, $$3);
    }

    class b
    extends gam<a> {
        public b() {
            super(ell.this.R + 10, ell.h(12) + 20, ell.h(1), ell.h(12) + 20, 13);
        }

        public void d() {
            if (ell.this.U != -1) {
                ((a)this.d(ell.this.U)).b();
            }
        }

        @Override
        public void a(ejm $$0) {
            this.a(new a($$0));
        }

        @Override
        public int b() {
            return (int)((double)this.d * 1.0);
        }

        @Override
        public void a(int $$0) {
            super.a($$0);
            this.b($$0);
        }

        public void b(int $$0) {
            ell.this.U = $$0;
            ell.this.B();
        }

        @Override
        public void a(@Nullable a $$0) {
            super.a($$0);
            ell.this.U = this.i().indexOf($$0);
            ell.this.B();
        }

        @Override
        public void a(eox $$0) {
            ell.this.a($$0);
        }

        @Override
        public int c() {
            return ell.this.Q + this.d - 5;
        }

        @Override
        public int a() {
            return this.k() * 13;
        }
    }

    class a
    extends eqc.a<a> {
        private static final int b = 3;
        private static final int c = 1;
        private static final int d = 8;
        private static final int e = 7;
        private final ejm f;
        private final List<epf> g = new ArrayList<epf>();
        private final ept h;
        private final ept i;
        private final ept j;

        public a(ejm $$0) {
            this.f = $$0;
            int $$12 = ell.this.O.h.indexOf(this.f);
            int $$2 = ell.this.P.p() - 16 - 9;
            int $$3 = ell.this.P.g($$12) + 1;
            this.h = new ept($$2, $$3, 8, 7, 0, 0, 7, G, 8, 14, $$1 -> ell.this.l($$12));
            this.h.a(eqp.a(L));
            this.g.add(this.h);
            this.i = new ept($$2 += 11, $$3, 8, 7, 0, 0, 7, c, 8, 14, $$1 -> ell.this.j($$12));
            this.i.a(eqp.a(J));
            this.g.add(this.i);
            this.j = new ept($$2, $$3, 8, 7, 0, 0, 7, b, 8, 14, $$1 -> ell.this.k($$12));
            this.j.a(eqp.a(K));
            this.g.add(this.j);
            this.b();
        }

        public void b() {
            this.i.s = !this.f.c();
            this.j.s = !this.i.s;
        }

        @Override
        public boolean a(double $$0, double $$1, int $$2) {
            if (!this.i.a($$0, $$1, $$2)) {
                this.j.a($$0, $$1, $$2);
            }
            this.h.a($$0, $$1, $$2);
            return true;
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$52, int $$6, int $$7, boolean $$8, float $$9) {
            int $$12;
            if (!this.f.d()) {
                int $$10 = 0xA0A0A0;
            } else if (this.f.e()) {
                int $$11 = 0x7FFF7F;
            } else {
                $$12 = 0xFFFFFF;
            }
            emf.a($$0, ell.this.Q + 2 + 2, $$2 + 1, 8, this.f.b());
            $$0.a(ell.this.i, this.f.a(), ell.this.Q + 3 + 12, $$2 + 1, $$12, false);
            this.g.forEach($$5 -> {
                $$5.f($$2 + 1);
                $$5.a($$0, $$6, $$7, $$9);
            });
        }

        @Override
        public sw a() {
            return sw.a("narrator.select", new Object[]{this.f.a()});
        }
    }
}

