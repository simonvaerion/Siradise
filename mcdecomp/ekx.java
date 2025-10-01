/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ekx
extends gan {
    static final Logger a = LogUtils.getLogger();
    static final acq b = new acq("realms", "textures/gui/realms/plus_icon.png");
    static final acq c = new acq("realms", "textures/gui/realms/restore_icon.png");
    static final sw G = sw.c("mco.backup.button.restore");
    static final sw H = sw.c("mco.backup.changes.tooltip");
    private static final sw I = sw.c("mco.configure.world.backup");
    private static final sw J = sw.c("mco.backup.nobackups");
    private final ela K;
    List<ejf> L = Collections.emptyList();
    a M;
    int N = -1;
    private final int O;
    private epi P;
    private epi Q;
    private epi R;
    Boolean S = false;
    final ejq T;
    private static final String U = "uploaded";

    public ekx(ela $$0, ejq $$1, int $$2) {
        super(sw.c("mco.configure.world.backup"));
        this.K = $$0;
        this.T = $$1;
        this.O = $$2;
    }

    @Override
    public void b() {
        this.M = new a();
        new Thread("Realms-fetch-backups"){

            @Override
            public void run() {
                eiz $$0 = eiz.a();
                try {
                    List<ejf> $$1 = $$0.e((long)ekx.this.T.a).a;
                    ekx.this.f.execute(() -> {
                        ekx.this.L = $$1;
                        ekx.this.S = ekx.this.L.isEmpty();
                        ekx.this.M.v();
                        for (ejf $$1 : ekx.this.L) {
                            ekx.this.M.a($$1);
                        }
                    });
                }
                catch (ekm $$2) {
                    a.error("Couldn't request backups", (Throwable)$$2);
                }
            }
        }.start();
        this.P = this.d(epi.a(sw.c("mco.backup.button.download"), (epi $$0) -> this.E()).a(this.g - 135, ekx.h(1), 120, 20).a());
        this.Q = this.d(epi.a(sw.c("mco.backup.button.restore"), (epi $$0) -> this.a(this.N)).a(this.g - 135, ekx.h(3), 120, 20).a());
        this.R = this.d(epi.a(sw.c("mco.backup.changes.tooltip"), (epi $$0) -> {
            this.f.a(new ekw(this, this.L.get(this.N)));
            this.N = -1;
        }).a(this.g - 135, ekx.h(5), 120, 20).a());
        this.d(epi.a(sv.k, (epi $$0) -> this.f.a(this.K)).a(this.g - 100, this.h - 35, 85, 20).a());
        this.e(this.M);
        this.b(this.M);
        this.B();
    }

    void B() {
        this.Q.s = this.D();
        this.R.s = this.C();
    }

    private boolean C() {
        if (this.N == -1) {
            return false;
        }
        return !this.L.get((int)this.N).e.isEmpty();
    }

    private boolean D() {
        if (this.N == -1) {
            return false;
        }
        return !this.T.j;
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if ($$0 == 256) {
            this.f.a(this.K);
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    void a(int $$02) {
        if ($$02 >= 0 && $$02 < this.L.size() && !this.T.j) {
            this.N = $$02;
            Date $$1 = this.L.get((int)$$02).b;
            String $$2 = DateFormat.getDateTimeInstance(3, 3).format($$1);
            sw $$3 = emf.a($$1);
            tj $$4 = sw.a("mco.configure.world.restore.question.line1", new Object[]{$$2, $$3});
            tj $$5 = sw.c("mco.configure.world.restore.question.line2");
            this.f.a(new elg($$0 -> {
                if ($$0) {
                    this.G();
                } else {
                    this.N = -1;
                    this.f.a(this);
                }
            }, elg.a.a, $$4, $$5, true));
        }
    }

    private void E() {
        tj $$02 = sw.c("mco.configure.world.restore.download.question.line1");
        tj $$1 = sw.c("mco.configure.world.restore.download.question.line2");
        this.f.a(new elg($$0 -> {
            if ($$0) {
                this.F();
            } else {
                this.f.a(this);
            }
        }, elg.a.b, $$02, $$1, true));
    }

    private void F() {
        this.f.a(new elh(this.K.d(), new emm(this.T.a, this.O, this.T.c + " (" + this.T.i.get(this.T.n).a(this.T.n) + ")", this)));
    }

    private void G() {
        ejf $$0 = this.L.get(this.N);
        this.N = -1;
        this.f.a(new elh(this.K.d(), new emt($$0, this.T.a, this.K)));
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        this.M.a($$0, $$1, $$2, $$3);
        $$0.a(this.i, this.e, this.g / 2, 12, 0xFFFFFF);
        $$0.a(this.i, I, (this.g - 150) / 2 - 90, 20, 0xA0A0A0, false);
        if (this.S.booleanValue()) {
            $$0.a(this.i, J, 20, this.h / 2 - 10, 0xFFFFFF, false);
        }
        this.P.r = this.S == false;
        super.a($$0, $$1, $$2, $$3);
    }

    class a
    extends gam<b> {
        public a() {
            super(ekx.this.g - 150, ekx.this.h, 32, ekx.this.h - 15, 36);
        }

        @Override
        public void a(ejf $$0) {
            this.a(new b($$0));
        }

        @Override
        public int b() {
            return (int)((double)this.d * 0.93);
        }

        @Override
        public int a() {
            return this.k() * 36;
        }

        @Override
        public void a(eox $$0) {
            ekx.this.a($$0);
        }

        @Override
        public int c() {
            return this.d - 5;
        }

        @Override
        public void a(int $$0) {
            super.a($$0);
            this.b($$0);
        }

        public void b(int $$0) {
            ekx.this.N = $$0;
            ekx.this.B();
        }

        @Override
        public void a(@Nullable b $$0) {
            super.a($$0);
            ekx.this.N = this.i().indexOf($$0);
            ekx.this.B();
        }
    }

    class b
    extends eqc.a<b> {
        private static final int b = 2;
        private static final int c = 7;
        private final ejf d;
        private final List<epf> e = new ArrayList<epf>();
        @Nullable
        private ept f;
        @Nullable
        private ept g;

        public b(ejf $$0) {
            this.d = $$0;
            this.a($$0);
            if (!$$0.e.isEmpty()) {
                this.b();
            }
            if (!ekx.this.T.j) {
                this.d();
            }
        }

        private void a(ejf $$0) {
            int $$1 = ekx.this.L.indexOf($$0);
            if ($$1 == ekx.this.L.size() - 1) {
                return;
            }
            ejf $$2 = ekx.this.L.get($$1 + 1);
            for (String $$3 : $$0.d.keySet()) {
                if (!$$3.contains(ekx.U) && $$2.d.containsKey($$3)) {
                    if ($$0.d.get($$3).equals($$2.d.get($$3))) continue;
                    this.a($$3);
                    continue;
                }
                this.a($$3);
            }
        }

        private void a(String $$0) {
            if ($$0.contains(ekx.U)) {
                String $$1 = DateFormat.getDateTimeInstance(3, 3).format(this.d.b);
                this.d.e.put($$0, $$1);
                this.d.a(true);
            } else {
                this.d.e.put($$0, this.d.d.get($$0));
            }
        }

        private void b() {
            int $$02 = 9;
            int $$1 = 9;
            int $$2 = ekx.this.M.p() - 9 - 28;
            int $$3 = ekx.this.M.g(ekx.this.L.indexOf(this.d)) + 2;
            this.g = new ept($$2, $$3, 9, 9, 0, 0, 9, b, 9, 18, $$0 -> ekx.this.f.a(new ekw(ekx.this, this.d)));
            this.g.a(eqp.a(H));
            this.e.add(this.g);
        }

        private void d() {
            int $$02 = 17;
            int $$1 = 10;
            int $$2 = ekx.this.M.p() - 17 - 7;
            int $$3 = ekx.this.M.g(ekx.this.L.indexOf(this.d)) + 2;
            this.f = new ept($$2, $$3, 17, 10, 0, 0, 10, c, 17, 20, $$0 -> ekx.this.a(ekx.this.L.indexOf(this.d)));
            this.f.a(eqp.a(G));
            this.e.add(this.f);
        }

        @Override
        public boolean a(double $$0, double $$1, int $$2) {
            if (this.f != null) {
                this.f.a($$0, $$1, $$2);
            }
            if (this.g != null) {
                this.g.a($$0, $$1, $$2);
            }
            return true;
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$52, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = this.d.a() ? -8388737 : 0xFFFFFF;
            $$0.a(ekx.this.i, sw.a("mco.backup.entry", emf.a(this.d.b)), $$3, $$2 + 1, $$10, false);
            $$0.a(ekx.this.i, this.a(this.d.b), $$3, $$2 + 12, 0x4C4C4C, false);
            this.e.forEach($$5 -> {
                $$5.f($$2 + 2);
                $$5.a($$0, $$6, $$7, $$9);
            });
        }

        private String a(Date $$0) {
            return DateFormat.getDateTimeInstance(3, 3).format($$0);
        }

        @Override
        public sw a() {
            return sw.a("narrator.select", new Object[]{this.d.b.toString()});
        }
    }
}

