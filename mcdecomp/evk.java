/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class evk
extends eui {
    @Nullable
    public enl c;
    public long k;
    private evj l;
    private epi m;

    public evk(euq $$0, enr $$1) {
        super($$0, $$1, sw.c("controls.keybinds.title"));
    }

    @Override
    protected void b() {
        this.l = new evj(this, this.f);
        this.e(this.l);
        this.m = this.d(epi.a(sw.c("controls.resetAll"), (epi $$0) -> {
            for (enl $$1 : this.b.X) {
                $$1.b($$1.i());
            }
            this.l.d();
        }).a(this.g / 2 - 155, this.h - 29, 150, 20).a());
        this.d(epi.a(sv.d, (epi $$0) -> this.f.a(this.a)).a(this.g / 2 - 155 + 160, this.h - 29, 150, 20).a());
    }

    @Override
    public boolean a(double $$0, double $$1, int $$2) {
        if (this.c != null) {
            this.b.a(this.c, ehe.b.c.a($$2));
            this.c = null;
            this.l.d();
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if (this.c != null) {
            if ($$0 == 256) {
                this.b.a(this.c, ehe.bv);
            } else {
                this.b.a(this.c, ehe.a($$0, $$1));
            }
            this.c = null;
            this.k = ac.b();
            this.l.d();
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        this.l.a($$0, $$1, $$2, $$3);
        $$0.a(this.i, this.e, this.g / 2, 8, 0xFFFFFF);
        boolean $$4 = false;
        for (enl $$5 : this.b.X) {
            if ($$5.l()) continue;
            $$4 = true;
            break;
        }
        this.m.r = $$4;
        super.a($$0, $$1, $$2, $$3);
    }
}

