/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Objects;
import javax.annotation.Nullable;

public class eli
extends gan {
    private static final acq a = new acq("realms", "textures/gui/realms/invite_icon.png");
    private static final acq b = new acq("realms", "textures/gui/realms/trial_icon.png");
    private static final acq c = new acq("realms", "textures/gui/realms/news_notification_mainscreen.png");
    private static final acq G = new acq("minecraft", "textures/gui/unseen_notification.png");
    @Nullable
    private elx.c H;
    @Nullable
    private a I;
    private volatile int J;
    static boolean K;
    private static boolean L;
    static boolean M;
    private static boolean N;
    private static boolean O;
    private final a P = new a(){

        @Override
        public elx.c a(ekq $$0) {
            elx.c $$1 = $$0.a.a();
            eli.this.a($$0, $$1);
            eli.this.b($$0, $$1);
            return $$1;
        }

        @Override
        public boolean a() {
            return true;
        }
    };
    private final a Q = new a(){

        @Override
        public elx.c a(ekq $$0) {
            elx.c $$1 = $$0.a.a();
            eli.this.b($$0, $$1);
            return $$1;
        }

        @Override
        public boolean a() {
            return false;
        }
    };

    public eli() {
        super(enf.a);
    }

    @Override
    public void b() {
        this.E();
        if (this.H != null) {
            this.H.a();
        }
    }

    @Override
    public void ay_() {
        super.ay_();
        this.f.aX().b.a();
    }

    @Nullable
    private a B() {
        boolean $$0;
        boolean bl2 = $$0 = this.D() && M;
        if (!$$0) {
            return null;
        }
        return this.C() ? this.P : this.Q;
    }

    @Override
    public void f() {
        a $$0 = this.B();
        if (!Objects.equals(this.I, $$0)) {
            this.I = $$0;
            this.H = this.I != null ? this.I.a(this.f.aX()) : null;
        }
        if (this.H != null) {
            this.H.b();
        }
    }

    private boolean C() {
        return this.f.m.O().c();
    }

    private boolean D() {
        return this.f.z instanceof euw;
    }

    private void E() {
        if (!K) {
            K = true;
            new Thread("Realms Notification Availability checker #1"){

                @Override
                public void run() {
                    eiz $$0 = eiz.a();
                    try {
                        eiz.a $$1 = $$0.j();
                        if ($$1 != eiz.a.a) {
                            return;
                        }
                    }
                    catch (ekm $$2) {
                        if ($$2.a != 401) {
                            K = false;
                        }
                        return;
                    }
                    M = true;
                }
            }.start();
        }
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        if (M) {
            this.c($$0);
        }
        super.a($$0, $$1, $$2, $$3);
    }

    private void c(eox $$0) {
        int $$1 = this.J;
        int $$2 = 24;
        int $$3 = this.h / 4 + 48;
        int $$4 = this.g / 2 + 80;
        int $$5 = $$3 + 48 + 2;
        int $$6 = 0;
        if (O) {
            $$0.a(G, $$4 - $$6 + 5, $$5 + 3, 0.0f, 0.0f, 10, 10, 10, 10);
            $$6 += 14;
        }
        if (this.I != null && this.I.a()) {
            if (N) {
                $$0.c().a();
                $$0.c().b(0.4f, 0.4f, 0.4f);
                $$0.a(c, (int)((double)($$4 + 2 - $$6) * 2.5), (int)((double)$$5 * 2.5), 0.0f, 0.0f, 40, 40, 40, 40);
                $$0.c().b();
                $$6 += 14;
            }
            if ($$1 != 0) {
                $$0.a(a, $$4 - $$6, $$5, 0.0f, 0.0f, 18, 15, 18, 30);
                $$6 += 16;
            }
            if (L) {
                int $$7 = 0;
                if ((ac.b() / 800L & 1L) == 1L) {
                    $$7 = 8;
                }
                $$0.a(b, $$4 + 4 - $$6, $$5 + 4, 0.0f, (float)$$7, 8, 8, 8, 16);
            }
        }
    }

    void a(ekq $$02, elx.c $$12) {
        $$12.a($$02.e, (T $$0) -> {
            this.J = $$0;
        });
        $$12.a($$02.f, (T $$0) -> {
            L = $$0;
        });
        $$12.a($$02.g, (T $$1) -> {
            $$0.h.a((ejo)$$1);
            N = $$0.h.a();
        });
    }

    void b(ekq $$02, elx.c $$1) {
        $$1.a($$02.b, (T $$0) -> {
            O = false;
            for (ejp $$1 : $$0) {
                if ($$1.a()) continue;
                O = true;
                break;
            }
        });
    }

    static interface a {
        public elx.c a(ekq var1);

        public boolean a();
    }
}

