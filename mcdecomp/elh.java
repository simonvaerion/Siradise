/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.time.Duration;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class elh
extends gan
implements ekp {
    private static final gao b = new gao(Duration.ofSeconds(5L));
    private static final Logger c = LogUtils.getLogger();
    private final euq G;
    private volatile sw H = sv.a;
    @Nullable
    private volatile sw I;
    private volatile boolean J;
    private int K;
    private final emo L;
    private final int M = 212;
    private epi N;
    public static final String[] a = new String[]{"\u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583", "_ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584", "_ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585", "_ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586", "_ _ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587", "_ _ _ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588", "_ _ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587", "_ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586", "_ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585", "_ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584", "\u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583", "\u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _", "\u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _", "\u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _", "\u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _ _", "\u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _ _ _", "\u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _ _", "\u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _", "\u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _", "\u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _"};

    public elh(euq $$0, emo $$1) {
        super(enf.a);
        this.G = $$0;
        this.L = $$1;
        $$1.a(this);
        Thread $$2 = new Thread((Runnable)$$1, "Realms-long-running-task");
        $$2.setUncaughtExceptionHandler(new ekk(c));
        $$2.start();
    }

    @Override
    public void f() {
        super.f();
        b.a(this.f.aU(), this.H);
        ++this.K;
        this.L.b();
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if ($$0 == 256) {
            this.B();
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public void b() {
        this.L.d();
        this.N = this.d(epi.a(sv.e, (epi $$0) -> this.B()).a(this.g / 2 - 106, elh.h(12), 212, 20).a());
    }

    private void B() {
        this.J = true;
        this.L.a();
        this.f.a(this.G);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(this.i, this.H, this.g / 2, elh.h(3), 0xFFFFFF);
        sw $$4 = this.I;
        if ($$4 == null) {
            $$0.a(this.i, a[this.K % a.length], this.g / 2, elh.h(8), 0x808080);
        } else {
            $$0.a(this.i, $$4, this.g / 2, elh.h(8), 0xFF0000);
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(sw $$0) {
        this.I = $$0;
        this.f.aU().c($$0);
        this.f.execute(() -> {
            this.f(this.N);
            this.N = this.d(epi.a(sv.k, (epi $$0) -> this.B()).a(this.g / 2 - 106, this.h / 4 + 120 + 12, 200, 20).a());
        });
    }

    public void b(sw $$0) {
        this.H = $$0;
    }

    public boolean c() {
        return this.J;
    }
}

