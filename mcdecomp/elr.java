/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class elr
extends gan {
    private static final int G = 2;
    public static final List<bdu> a = ImmutableList.of((Object)bdu.a, (Object)bdu.b, (Object)bdu.c, (Object)bdu.d);
    private static final int H = 0;
    public static final List<cmj> b = ImmutableList.of((Object)cmj.a, (Object)cmj.b, (Object)cmj.c);
    private static final sw I = sw.c("mco.configure.world.edit.slot.name");
    static final sw J = sw.c("mco.configure.world.spawnProtection");
    private static final sw K = sw.c("mco.configure.world.spawn_toggle.title").a(n.m, n.r);
    private epr L;
    protected final ela c;
    private int M;
    private int N;
    private final ejx O;
    private final ejq.c P;
    private bdu Q;
    private cmj R;
    private final String S;
    private String T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    int Y;
    private boolean Z;
    private boolean aa;
    a ab;

    public elr(ela $$0, ejx $$1, ejq.c $$2, int $$3) {
        super(sw.c("mco.configure.world.buttons.options"));
        this.c = $$0;
        this.O = $$1;
        this.P = $$2;
        this.Q = elr.a(a, $$1.h, 2);
        this.R = elr.a(b, $$1.i, 0);
        this.S = $$1.b($$3);
        this.a($$1.a($$3));
        if ($$2 == ejq.c.a) {
            this.U = $$1.a;
            this.Y = $$1.e;
            this.aa = $$1.g;
            this.W = $$1.b;
            this.X = $$1.c;
            this.V = $$1.d;
            this.Z = $$1.f;
        } else {
            this.U = true;
            this.Y = 0;
            this.aa = false;
            this.W = true;
            this.X = true;
            this.V = true;
            this.Z = true;
        }
    }

    @Override
    public void f() {
        this.L.a();
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if ($$0 == 256) {
            this.f.a(this.c);
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    private static <T> T a(List<T> $$0, int $$1, int $$2) {
        try {
            return $$0.get($$1);
        }
        catch (IndexOutOfBoundsException $$3) {
            return $$0.get($$2);
        }
    }

    private static <T> int a(List<T> $$0, T $$1, int $$2) {
        int $$3 = $$0.indexOf($$1);
        return $$3 == -1 ? $$2 : $$3;
    }

    @Override
    public void b() {
        this.N = 170;
        this.M = this.g / 2 - this.N;
        int $$02 = this.g / 2 + 10;
        if (this.P != ejq.c.a) {
            tj $$3;
            if (this.P == ejq.c.c) {
                tj $$12 = sw.c("mco.configure.world.edit.subscreen.adventuremap");
            } else if (this.P == ejq.c.e) {
                tj $$22 = sw.c("mco.configure.world.edit.subscreen.inspiration");
            } else {
                $$3 = sw.c("mco.configure.world.edit.subscreen.experience");
            }
            this.a(new gal($$3, this.g / 2, 26, 0xFF0000));
        }
        this.L = new epr(this.f.h, this.M + 2, elr.h(1), this.N - 4, 20, null, sw.c("mco.configure.world.edit.slot.name"));
        this.L.m(10);
        this.L.a(this.T);
        this.L.b(this::a);
        this.b(this.L);
        epp<Boolean> $$4 = this.d(epp.b(this.U).a($$02, elr.h(1), this.N, 20, sw.c("mco.configure.world.pvp"), ($$0, $$1) -> {
            this.U = $$1;
        }));
        this.d(epp.a(cmj::e).a((cmj)((Object)b)).a((List<cmj>)((Object)this.R)).a(this.M, elr.h(3), this.N, 20, sw.c("selectWorld.gameMode"), ($$0, $$1) -> {
            this.R = $$1;
        }));
        tj $$5 = sw.c("mco.configure.world.spawn_toggle.message");
        epp<Boolean> $$6 = this.d(epp.b(this.W).a($$02, elr.h(3), this.N, 20, sw.c("mco.configure.world.spawnAnimals"), this.a($$5, (Boolean $$0) -> {
            this.W = $$0;
        })));
        epp<Boolean> $$7 = epp.b(this.Q != bdu.a && this.X).a($$02, elr.h(5), this.N, 20, sw.c("mco.configure.world.spawnMonsters"), this.a($$5, (Boolean $$0) -> {
            this.X = $$0;
        }));
        this.d(epp.a(bdu::b).a((bdu)((Object)a)).a((List<bdu>)((Object)this.Q)).a(this.M, elr.h(5), this.N, 20, sw.c("options.difficulty"), ($$1, $$2) -> {
            this.Q = $$2;
            if (this.P == ejq.c.a) {
                boolean $$3;
                $$0.r = $$3 = this.Q != bdu.a;
                $$7.a($$3 && this.X);
            }
        }));
        this.d($$7);
        this.ab = this.d(new a(this.M, elr.h(7), this.N, this.Y, 0.0f, 16.0f));
        epp<Boolean> $$8 = this.d(epp.b(this.V).a($$02, elr.h(7), this.N, 20, sw.c("mco.configure.world.spawnNPCs"), this.a(sw.c("mco.configure.world.spawn_toggle.message.npc"), (Boolean $$0) -> {
            this.V = $$0;
        })));
        epp<Boolean> $$9 = this.d(epp.b(this.aa).a(this.M, elr.h(9), this.N, 20, sw.c("mco.configure.world.forceGameMode"), ($$0, $$1) -> {
            this.aa = $$1;
        }));
        epp<Boolean> $$10 = this.d(epp.b(this.Z).a($$02, elr.h(9), this.N, 20, sw.c("mco.configure.world.commandBlocks"), ($$0, $$1) -> {
            this.Z = $$1;
        }));
        if (this.P != ejq.c.a) {
            $$4.r = false;
            $$6.r = false;
            $$8.r = false;
            $$7.r = false;
            this.ab.r = false;
            $$10.r = false;
            $$9.r = false;
        }
        if (this.Q == bdu.a) {
            $$7.r = false;
        }
        this.d(epi.a(sw.c("mco.configure.world.buttons.done"), (epi $$0) -> this.B()).a(this.M, elr.h(13), this.N, 20).a());
        this.d(epi.a(sv.e, (epi $$0) -> this.f.a(this.c)).a($$02, elr.h(13), this.N, 20).a());
        this.e(this.L);
    }

    private epp.b<Boolean> a(sw $$0, Consumer<Boolean> $$1) {
        return ($$2, $$3) -> {
            if ($$3.booleanValue()) {
                $$1.accept(true);
            } else {
                this.f.a(new etk($$1 -> {
                    if ($$1) {
                        $$1.accept(false);
                    }
                    this.f.a(this);
                }, K, $$0, sv.i, sv.e));
            }
        };
    }

    @Override
    public sw au_() {
        return sv.a(new sw[]{this.m(), this.l()});
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(this.i, this.e, this.g / 2, 17, 0xFFFFFF);
        $$0.a(this.i, I, this.M + this.N / 2 - this.i.a(I) / 2, elr.h(0) - 5, 0xFFFFFF, false);
        this.L.a($$0, $$1, $$2, $$3);
        super.a($$0, $$1, $$2, $$3);
    }

    private void a(String $$0) {
        this.T = $$0.equals(this.S) ? "" : $$0;
    }

    private void B() {
        int $$0 = elr.a(a, this.Q, 2);
        int $$1 = elr.a(b, this.R, 0);
        if (this.P == ejq.c.c || this.P == ejq.c.d || this.P == ejq.c.e) {
            this.c.a(new ejx(this.O.a, this.O.b, this.O.c, this.O.d, this.O.e, this.O.f, $$0, $$1, this.O.g, this.T));
        } else {
            boolean $$2 = this.P == ejq.c.a && this.Q != bdu.a && this.X;
            this.c.a(new ejx(this.U, this.W, $$2, this.V, this.Y, this.Z, $$0, $$1, this.aa, this.T));
        }
    }

    class a
    extends epd {
        private final double h;
        private final double i;

        public a(int $$0, int $$1, int $$2, int $$3, float $$4, float $$5) {
            super($$0, $$1, $$2, 20, sv.a, 0.0);
            this.h = $$4;
            this.i = $$5;
            this.g = (apa.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4);
            this.b();
        }

        @Override
        public void a() {
            if (!elr.this.ab.r) {
                return;
            }
            elr.this.Y = (int)apa.d(apa.a(this.g, 0.0, 1.0), this.h, this.i);
        }

        @Override
        protected void b() {
            this.b(sv.a(J, elr.this.Y == 0 ? sv.c : sw.b(String.valueOf(elr.this.Y))));
        }

        @Override
        public void a(double $$0, double $$1) {
        }

        @Override
        public void b(double $$0, double $$1) {
        }
    }
}

