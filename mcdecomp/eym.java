/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.report.AbuseReportLimits
 *  com.mojang.datafixers.util.Unit
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Unit;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eym
extends euq {
    private static final int a = 120;
    private static final int b = 20;
    private static final int c = 20;
    private static final int k = 10;
    private static final int l = 25;
    private static final int m = 280;
    private static final int n = 300;
    private static final sw o = sw.c("gui.chatReport.observed_what");
    private static final sw p = sw.c("gui.chatReport.select_reason");
    private static final sw q = sw.c("gui.chatReport.more_comments");
    private static final sw r = sw.c("gui.chatReport.describe");
    private static final sw s = sw.c("gui.chatReport.report_sent_msg");
    private static final sw t = sw.c("gui.chatReport.select_chat");
    private static final sw u = sw.c("gui.abuseReport.sending.title").a(n.r);
    private static final sw v = sw.c("gui.abuseReport.sent.title").a(n.r);
    private static final sw w = sw.c("gui.abuseReport.error.title").a(n.r);
    private static final sw x = sw.c("gui.abuseReport.send.generic_error");
    private static final Logger y = LogUtils.getLogger();
    @Nullable
    final euq z;
    private final ffs A;
    @Nullable
    private epz C;
    @Nullable
    private epy D;
    private epi E;
    private ffo F;
    @Nullable
    private ffo.a G;

    private eym(@Nullable euq $$0, ffs $$1, ffo $$2) {
        super(sw.c("gui.chatReport.title"));
        this.z = $$0;
        this.A = $$1;
        this.F = $$2;
    }

    public eym(@Nullable euq $$0, ffs $$1, UUID $$2) {
        this($$0, $$1, new ffo($$2, $$1.a().b()));
    }

    public eym(@Nullable euq $$0, ffs $$1, ffo.b $$2) {
        this($$0, $$1, new ffo($$2, $$1.a().b()));
    }

    @Override
    protected void b() {
        tj $$5;
        AbuseReportLimits $$03 = this.A.a().b();
        int $$1 = this.g / 2;
        ffr $$2 = this.F.e();
        this.C = $$2 != null ? epz.a(this.i, (ta)$$2.c(), 280) : null;
        IntSet $$3 = this.F.c();
        if ($$3.isEmpty()) {
            sw $$4 = t;
        } else {
            $$5 = sw.a("gui.chatReport.selected_chat", $$3.size());
        }
        this.d(epi.a($$5, (epi $$02) -> this.f.a(new eyo(this, this.A, this.F, $$0 -> {
            this.F = $$0;
            this.l();
        }))).a(this.F(), this.J(), 280, 20).a());
        sw $$6 = x.a($$2, ffr::b, p);
        this.d(epi.a($$6, (epi $$02) -> this.f.a(new eyp(this, this.F.e(), $$0 -> {
            this.F.a((ffr)((Object)((Object)$$0)));
            this.l();
        }))).a(this.F(), this.K(), 280, 20).a());
        this.D = this.d(new epy(this.f.h, this.F(), this.L(), 280, this.M() - this.L(), r, sw.c("gui.chatReport.comments")));
        this.D.a(this.F.d());
        this.D.a($$03.maxOpinionCommentsLength());
        this.D.b((String $$0) -> {
            this.F.a((String)$$0);
            this.l();
        });
        this.d(epi.a(sv.k, (epi $$0) -> this.aw_()).a($$1 - 120, this.N(), 120, 20).a());
        this.E = this.d(epi.a(sw.c("gui.chatReport.send"), (epi $$0) -> this.B()).a($$1 + 10, this.N(), 120, 20).a());
        this.l();
    }

    private void l() {
        this.G = this.F.g();
        this.E.r = this.G == null;
        this.E.a(x.a(this.G, (T $$0) -> eqp.a($$0.a())));
    }

    private void B() {
        this.F.a(this.A).ifLeft($$02 -> {
            CompletableFuture<Unit> $$12 = this.A.a().a($$02.a(), $$02.b());
            this.f.a(ety.a(u, sv.e, () -> {
                this.f.a(this);
                $$12.cancel(true);
            }));
            $$12.handleAsync(($$0, $$1) -> {
                if ($$1 == null) {
                    this.C();
                } else {
                    if ($$1 instanceof CancellationException) {
                        return null;
                    }
                    this.a((Throwable)$$1);
                }
                return null;
            }, (Executor)this.f);
        }).ifRight($$0 -> this.a($$0.a()));
    }

    private void C() {
        this.E();
        this.f.a(ety.a(v, s, sv.d, () -> this.f.a((euq)null)));
    }

    private void a(Throwable $$0) {
        sw $$3;
        y.error("Encountered error while sending abuse report", $$0);
        Throwable throwable = $$0.getCause();
        if (throwable instanceof tv) {
            tv $$1 = (tv)throwable;
            sw $$2 = $$1.b();
        } else {
            $$3 = x;
        }
        this.a($$3);
    }

    private void a(sw $$0) {
        tj $$1 = $$0.e().a(n.m);
        this.f.a(ety.a(w, $$1, sv.k, () -> this.f.a(this)));
    }

    void D() {
        if (this.F.f()) {
            this.A.a(this.F.a().a());
        }
    }

    void E() {
        this.A.a((ffo.b)null);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        int $$4 = this.g / 2;
        this.a($$0);
        $$0.a(this.i, this.e, $$4, 10, 0xFFFFFF);
        $$0.a(this.i, o, $$4, this.J() - this.i.b - 6, 0xFFFFFF);
        if (this.C != null) {
            this.C.b($$0, this.F(), this.K() + 20 + 5, this.i.b, 0xFFFFFF);
        }
        $$0.b(this.i, q, this.F(), this.L() - this.i.b - 6, 0xFFFFFF);
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void f() {
        this.D.v();
        super.f();
    }

    @Override
    public void aw_() {
        if (this.F.f()) {
            this.f.a(new a());
        } else {
            this.f.a(this.z);
        }
    }

    @Override
    public void ax_() {
        this.D();
        super.ax_();
    }

    @Override
    public boolean b(double $$0, double $$1, int $$2) {
        if (super.b($$0, $$1, $$2)) {
            return true;
        }
        return this.D.b($$0, $$1, $$2);
    }

    private int F() {
        return this.g / 2 - 140;
    }

    private int G() {
        return this.g / 2 + 140;
    }

    private int H() {
        return Math.max((this.h - 300) / 2, 0);
    }

    private int I() {
        return Math.min((this.h + 300) / 2, this.h);
    }

    private int J() {
        return this.H() + 40;
    }

    private int K() {
        return this.J() + 10 + 20;
    }

    private int L() {
        int $$0 = this.K() + 20 + 25;
        if (this.C != null) {
            $$0 += (this.C.a() + 1) * this.i.b;
        }
        return $$0;
    }

    private int M() {
        return this.N() - 20;
    }

    private int N() {
        return this.I() - 20 - 10;
    }

    class a
    extends exr {
        private static final sw c = sw.c("gui.chatReport.discard.title").a(n.r);
        private static final sw k = sw.c("gui.chatReport.discard.content");
        private static final sw l = sw.c("gui.chatReport.discard.return");
        private static final sw m = sw.c("gui.chatReport.discard.draft");
        private static final sw n = sw.c("gui.chatReport.discard.discard");

        protected a() {
            super(c, k, k);
        }

        @Override
        protected void a(int $$02) {
            int $$1 = 150;
            this.d(epi.a(l, (epi $$0) -> this.aw_()).a(this.g / 2 - 155, 100 + $$02, 150, 20).a());
            this.d(epi.a(m, (epi $$0) -> {
                eym.this.D();
                this.f.a(eym.this.z);
            }).a(this.g / 2 + 5, 100 + $$02, 150, 20).a());
            this.d(epi.a(n, (epi $$0) -> {
                eym.this.E();
                this.f.a(eym.this.z);
            }).a(this.g / 2 - 75, 130 + $$02, 150, 20).a());
        }

        @Override
        public void aw_() {
            this.f.a(eym.this);
        }

        @Override
        public boolean av_() {
            return false;
        }

        @Override
        protected void c(eox $$0) {
            $$0.b(this.i, this.e, this.g / 2 - 155, 30, 0xFFFFFF);
        }
    }
}

