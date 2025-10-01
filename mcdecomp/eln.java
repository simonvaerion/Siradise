/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eln
extends gan {
    static final Logger b = LogUtils.getLogger();
    private final euq c;
    private final ejq G;
    private sw H = sw.c("mco.reset.world.warning");
    private sw I = sv.e;
    private int J = 0xFF0000;
    private static final acq K = new acq("realms", "textures/gui/realms/slot_frame.png");
    private static final acq L = new acq("realms", "textures/gui/realms/upload.png");
    private static final acq M = new acq("realms", "textures/gui/realms/adventure.png");
    private static final acq N = new acq("realms", "textures/gui/realms/survival_spawn.png");
    private static final acq O = new acq("realms", "textures/gui/realms/new_world.png");
    private static final acq P = new acq("realms", "textures/gui/realms/experience.png");
    private static final acq Q = new acq("realms", "textures/gui/realms/inspiration.png");
    eki R;
    eki S;
    eki T;
    eki U;
    public int a = -1;
    private sw V = sw.c("mco.reset.world.resetting.screen.title");
    private final Runnable W;
    private final Runnable X;

    public eln(euq $$0, ejq $$1, sw $$2, Runnable $$3, Runnable $$4) {
        super($$2);
        this.c = $$0;
        this.G = $$1;
        this.W = $$3;
        this.X = $$4;
    }

    public eln(euq $$0, ejq $$1, Runnable $$2, Runnable $$3) {
        this($$0, $$1, sw.c("mco.reset.world.title"), $$2, $$3);
    }

    public eln(euq $$0, ejq $$1, sw $$2, sw $$3, int $$4, sw $$5, Runnable $$6, Runnable $$7) {
        this($$0, $$1, $$2, $$6, $$7);
        this.H = $$3;
        this.J = $$4;
        this.I = $$5;
    }

    public void a(int $$0) {
        this.a = $$0;
    }

    public void a(sw $$0) {
        this.V = $$0;
    }

    @Override
    public void b() {
        this.d(epi.a(this.I, (epi $$0) -> this.f.a(this.c)).a(this.g / 2 - 40, eln.h(14) - 10, 80, 20).a());
        new Thread("Realms-reset-world-fetcher"){

            @Override
            public void run() {
                eiz $$0 = eiz.a();
                try {
                    eki $$1 = $$0.a(1, 10, ejq.c.a);
                    eki $$2 = $$0.a(1, 10, ejq.c.c);
                    eki $$3 = $$0.a(1, 10, ejq.c.d);
                    eki $$4 = $$0.a(1, 10, ejq.c.e);
                    eln.this.f.execute(() -> {
                        eln.this.R = $$1;
                        eln.this.S = $$2;
                        eln.this.T = $$3;
                        eln.this.U = $$4;
                    });
                }
                catch (ekm $$5) {
                    b.error("Couldn't fetch templates in reset world", (Throwable)$$5);
                }
            }
        }.start();
        this.a(new gal(this.H, this.g / 2, 22, this.J));
        this.d(new a(this.b(1), eln.h(0) + 10, sw.c("mco.reset.world.generate"), O, $$0 -> this.f.a(new elm(this::a, this.e))));
        this.d(new a(this.b(2), eln.h(0) + 10, sw.c("mco.reset.world.upload"), L, $$0 -> this.f.a(new elo(this.G.a, this.a != -1 ? this.a : this.G.n, this, this.X))));
        this.d(new a(this.b(3), eln.h(0) + 10, sw.c("mco.reset.world.template"), N, $$0 -> this.f.a(new elp(sw.c("mco.reset.world.template"), this::a, ejq.c.a, this.R))));
        this.d(new a(this.b(1), eln.h(6) + 20, sw.c("mco.reset.world.adventure"), M, $$0 -> this.f.a(new elp(sw.c("mco.reset.world.adventure"), this::a, ejq.c.c, this.S))));
        this.d(new a(this.b(2), eln.h(6) + 20, sw.c("mco.reset.world.experience"), P, $$0 -> this.f.a(new elp(sw.c("mco.reset.world.experience"), this::a, ejq.c.d, this.T))));
        this.d(new a(this.b(3), eln.h(6) + 20, sw.c("mco.reset.world.inspiration"), Q, $$0 -> this.f.a(new elp(sw.c("mco.reset.world.inspiration"), this::a, ejq.c.e, this.U))));
    }

    @Override
    public sw au_() {
        return sv.a(new sw[]{this.m(), this.l()});
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if ($$0 == 256) {
            this.f.a(this.c);
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    private int b(int $$0) {
        return this.g / 2 - 130 + ($$0 - 1) * 100;
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(this.i, this.e, this.g / 2, 7, 0xFFFFFF);
        super.a($$0, $$1, $$2, $$3);
    }

    void a(eox $$0, int $$1, int $$2, sw $$3, acq $$4, boolean $$5, boolean $$6) {
        if ($$5) {
            $$0.a(0.56f, 0.56f, 0.56f, 1.0f);
        }
        $$0.a($$4, $$1 + 2, $$2 + 14, 0.0f, 0.0f, 56, 56, 56, 56);
        $$0.a(K, $$1, $$2 + 12, 0.0f, 0.0f, 60, 60, 60, 60);
        int $$7 = $$5 ? 0xA0A0A0 : 0xFFFFFF;
        $$0.a(this.i, $$3, $$1 + 30, $$2, $$7);
        $$0.a(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private void a(emo $$0) {
        this.f.a(new elh(this.c, $$0));
    }

    public void a(Runnable $$0) {
        this.a(new emv(this.G.a, this.a, () -> this.f.execute($$0)));
    }

    private void a(@Nullable ekh $$0) {
        this.f.a(this);
        if ($$0 != null) {
            this.b(() -> this.a(new emr($$0, this.G.a, this.V, this.W)));
        }
    }

    private void a(@Nullable emi $$0) {
        this.f.a(this);
        if ($$0 != null) {
            this.b(() -> this.a(new emq($$0, this.G.a, this.V, this.W)));
        }
    }

    private void b(Runnable $$0) {
        if (this.a == -1) {
            $$0.run();
        } else {
            this.a($$0);
        }
    }

    class a
    extends epi {
        private final acq b;

        public a(int $$0, int $$1, sw $$2, acq $$3, epi.c $$4) {
            super($$0, $$1, 60, 72, $$2, $$4, x);
            this.b = $$3;
        }

        @Override
        public void b(eox $$0, int $$1, int $$2, float $$3) {
            eln.this.a($$0, this.p(), this.r(), this.l(), this.b, this.n(), this.a_($$1, $$2));
        }
    }
}

