/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class eqw
implements ezs {
    private static final acq b = new acq("textures/gui/widgets.png");
    public static final acq a = new acq("textures/gui/spectator_widgets.png");
    private static final long c = 5000L;
    private static final long d = 2000L;
    private final enn e;
    private long f;
    @Nullable
    private ezp g;

    public eqw(enn $$0) {
        this.e = $$0;
    }

    public void a(int $$0) {
        this.f = ac.b();
        if (this.g != null) {
            this.g.b($$0);
        } else {
            this.g = new ezp(this);
        }
    }

    private float c() {
        long $$0 = this.f - ac.b() + 5000L;
        return apa.a((float)$$0 / 2000.0f, 0.0f, 1.0f);
    }

    public void a(eox $$0) {
        if (this.g == null) {
            return;
        }
        float $$1 = this.c();
        if ($$1 <= 0.0f) {
            this.g.d();
            return;
        }
        int $$2 = $$0.a() / 2;
        $$0.c().a();
        $$0.c().a(0.0f, 0.0f, -90.0f);
        int $$3 = apa.d((float)$$0.b() - 22.0f * $$1);
        ezt $$4 = this.g.f();
        this.a($$0, $$1, $$2, $$3, $$4);
        $$0.c().b();
    }

    protected void a(eox $$0, float $$1, int $$2, int $$3, ezt $$4) {
        RenderSystem.enableBlend();
        $$0.a(1.0f, 1.0f, 1.0f, $$1);
        $$0.a(b, $$2 - 91, $$3, 0, 0, 182, 22);
        if ($$4.a() >= 0) {
            $$0.a(b, $$2 - 91 - 1 + $$4.a() * 20, $$3 - 1, 0, 22, 24, 22);
        }
        $$0.a(1.0f, 1.0f, 1.0f, 1.0f);
        for (int $$5 = 0; $$5 < 9; ++$$5) {
            this.a($$0, $$5, $$0.a() / 2 - 90 + $$5 * 20 + 2, $$3 + 3, $$1, $$4.a($$5));
        }
        RenderSystem.disableBlend();
    }

    private void a(eox $$0, int $$1, int $$2, float $$3, float $$4, ezr $$5) {
        if ($$5 != ezp.a) {
            int $$6 = (int)($$4 * 255.0f);
            $$0.c().a();
            $$0.c().a($$2, $$3, 0.0f);
            float $$7 = $$5.aJ_() ? 1.0f : 0.25f;
            $$0.a($$7, $$7, $$7, $$4);
            $$5.a($$0, $$7, $$6);
            $$0.a(1.0f, 1.0f, 1.0f, 1.0f);
            $$0.c().b();
            if ($$6 > 3 && $$5.aJ_()) {
                sw $$8 = this.e.m.U[$$1].k();
                $$0.b(this.e.h, $$8, $$2 + 19 - 2 - this.e.h.a($$8), (int)$$3 + 6 + 3, 0xFFFFFF + ($$6 << 24));
            }
        }
    }

    public void b(eox $$0) {
        int $$1 = (int)(this.c() * 255.0f);
        if ($$1 > 3 && this.g != null) {
            sw $$3;
            ezr $$2 = this.g.b();
            sw sw2 = $$3 = $$2 == ezp.a ? this.g.c().b() : $$2.aI_();
            if ($$3 != null) {
                int $$4 = ($$0.a() - this.e.h.a($$3)) / 2;
                int $$5 = $$0.b() - 35;
                $$0.b(this.e.h, $$3, $$4, $$5, 0xFFFFFF + ($$1 << 24));
            }
        }
    }

    @Override
    public void a(ezp $$0) {
        this.g = null;
        this.f = 0L;
    }

    public boolean a() {
        return this.g != null;
    }

    public void b(int $$0) {
        int $$1;
        for ($$1 = this.g.e() + $$0; !($$1 < 0 || $$1 > 8 || this.g.a($$1) != ezp.a && this.g.a($$1).aJ_()); $$1 += $$0) {
        }
        if ($$1 >= 0 && $$1 <= 8) {
            this.g.b($$1);
            this.f = ac.b();
        }
    }

    public void b() {
        this.f = ac.b();
        if (this.a()) {
            int $$0 = this.g.e();
            if ($$0 != -1) {
                this.g.b($$0);
            }
        } else {
            this.g = new ezp(this);
        }
    }
}

