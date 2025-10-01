/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.concurrent.locks.ReentrantLock;
import org.slf4j.Logger;

public class elt
extends gan {
    private static final Logger a = LogUtils.getLogger();
    private static final sw b = sw.c("mco.terms.title");
    private static final sw c = sw.c("mco.terms.sentence.1");
    private static final sw G = sv.a().b(sw.c("mco.terms.sentence.2").c(ts.a.c(true)));
    private final euq H;
    private final eiu I;
    private final ejq J;
    private boolean K;

    public elt(euq $$0, eiu $$1, ejq $$2) {
        super(b);
        this.H = $$0;
        this.I = $$1;
        this.J = $$2;
    }

    @Override
    public void b() {
        int $$02 = this.g / 4 - 2;
        this.d(epi.a(sw.c("mco.terms.buttons.agree"), (epi $$0) -> this.B()).a(this.g / 4, elt.h(12), $$02, 20).a());
        this.d(epi.a(sw.c("mco.terms.buttons.disagree"), (epi $$0) -> this.f.a(this.H)).a(this.g / 2 + 4, elt.h(12), $$02, 20).a());
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if ($$0 == 256) {
            this.f.a(this.H);
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    private void B() {
        eiz $$0 = eiz.a();
        try {
            $$0.m();
            this.f.a(new elh(this.H, new emn(this.I, this.H, this.J, new ReentrantLock())));
        }
        catch (ekm $$1) {
            a.error("Couldn't agree to TOS");
        }
    }

    @Override
    public boolean a(double $$0, double $$1, int $$2) {
        if (this.K) {
            this.f.o.a("https://aka.ms/MinecraftRealmsTerms");
            ac.i().a("https://aka.ms/MinecraftRealmsTerms");
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public sw au_() {
        return sv.a(new sw[]{super.au_(), c}).b(sv.t).b(G);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(this.i, this.e, this.g / 2, 17, 0xFFFFFF);
        $$0.a(this.i, c, this.g / 2 - 120, elt.h(5), 0xFFFFFF, false);
        int $$4 = this.i.a(c);
        int $$5 = this.g / 2 - 121 + $$4;
        int $$6 = elt.h(5);
        int $$7 = $$5 + this.i.a(G) + 1;
        int $$8 = $$6 + 1 + this.i.b;
        this.K = $$5 <= $$1 && $$1 <= $$7 && $$6 <= $$2 && $$2 <= $$8;
        $$0.a(this.i, G, this.g / 2 - 120 + $$4, elt.h(5), this.K ? 7107012 : 0x3366BB, false);
        super.a($$0, $$1, $$2, $$3);
    }
}

