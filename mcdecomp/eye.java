/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class eye
extends eqj {
    private final enw g;
    private static final float h = 15.0f;
    private float i;

    public eye(enw $$0) {
        super(0, 0, 35, 27, false);
        this.g = $$0;
        this.a(153, 2, 35, 0, eyc.a);
    }

    public void a(enn $$0) {
        enb $$1 = $$0.t.x();
        List<eyg> $$2 = $$1.a(this.g);
        if (!($$0.t.bR instanceof ccp)) {
            return;
        }
        for (eyg $$3 : $$2) {
            for (cjc<?> $$4 : $$3.a($$1.a((ccp)$$0.t.bR))) {
                if (!$$1.d($$4)) continue;
                this.i = 15.0f;
                return;
            }
        }
    }

    @Override
    public void b(eox $$0, int $$1, int $$2, float $$3) {
        if (this.i > 0.0f) {
            float $$4 = 1.0f + 0.1f * (float)Math.sin(this.i / 15.0f * (float)Math.PI);
            $$0.c().a();
            $$0.c().a(this.p() + 8, this.r() + 12, 0.0f);
            $$0.c().b(1.0f, $$4, 1.0f);
            $$0.c().a(-(this.p() + 8), -(this.r() + 12), 0.0f);
        }
        enn $$5 = enn.N();
        RenderSystem.disableDepthTest();
        int $$6 = this.c;
        int $$7 = this.d;
        if (this.b) {
            $$6 += this.e;
        }
        if (this.n()) {
            $$7 += this.f;
        }
        int $$8 = this.p();
        if (this.b) {
            $$8 -= 2;
        }
        $$0.a(this.a, $$8, this.r(), $$6, $$7, this.o, this.p);
        RenderSystem.enableDepthTest();
        this.a($$0, $$5.ap());
        if (this.i > 0.0f) {
            $$0.c().b();
            this.i -= $$3;
        }
    }

    private void a(eox $$0, fpw $$1) {
        int $$3;
        List<cfz> $$2 = this.g.a();
        int n2 = $$3 = this.b ? -2 : 0;
        if ($$2.size() == 1) {
            $$0.b($$2.get(0), this.p() + 9 + $$3, this.r() + 5);
        } else if ($$2.size() == 2) {
            $$0.b($$2.get(0), this.p() + 3 + $$3, this.r() + 5);
            $$0.b($$2.get(1), this.p() + 14 + $$3, this.r() + 5);
        }
    }

    public enw b() {
        return this.g;
    }

    public boolean a(enb $$0) {
        List<eyg> $$1 = $$0.a(this.g);
        this.s = false;
        if ($$1 != null) {
            for (eyg $$2 : $$1) {
                if (!$$2.b() || !$$2.d()) continue;
                this.s = true;
                break;
            }
        }
        return this.s;
    }
}

