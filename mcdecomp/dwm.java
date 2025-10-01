/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 */
import com.google.common.annotations.VisibleForTesting;

public final class dwm
extends dwv<dwn.a, dwn> {
    private final gu.a g = new gu.a();

    public dwm(del $$0) {
        this($$0, new dwn($$0));
    }

    @VisibleForTesting
    public dwm(del $$0, dwn $$1) {
        super($$0, $$1);
    }

    @Override
    protected void a(long $$0) {
        int $$4;
        long $$1 = hx.e($$0);
        if (!((dwn)this.f).b($$1)) {
            return;
        }
        dcb $$2 = this.c(this.g.f($$0));
        int $$3 = this.a($$0, $$2);
        if ($$3 < ($$4 = ((dwn)this.f).e($$0))) {
            ((dwn)this.f).a($$0, 0);
            this.b($$0, dwv.a.a($$4));
        } else {
            this.b($$0, c);
        }
        if ($$3 > 0) {
            this.c($$0, dwv.a.a($$3, dwm.a($$2)));
        }
    }

    @Override
    protected void a(long $$0, long $$1, int $$2) {
        dcb $$3 = null;
        for (ha $$4 : d) {
            int $$6;
            int $$7;
            long $$5;
            if (!dwv.a.a($$1, $$4) || !((dwn)this.f).b(hx.e($$5 = gu.a($$0, $$4))) || ($$7 = $$2 - 1) <= ($$6 = ((dwn)this.f).e($$5))) continue;
            this.g.f($$5);
            dcb $$8 = this.c(this.g);
            int $$9 = $$2 - this.a($$8, this.g);
            if ($$9 <= $$6) continue;
            if ($$3 == null) {
                dcb dcb2 = $$3 = dwv.a.b($$1) ? cpo.a.n() : this.c(this.g.f($$0));
            }
            if (this.a($$0, $$3, $$5, $$8, $$4)) continue;
            ((dwn)this.f).a($$5, $$9);
            if ($$9 <= 1) continue;
            this.c($$5, dwv.a.a($$9, dwm.a($$8), $$4.g()));
        }
    }

    @Override
    protected void a(long $$0, long $$1) {
        int $$2 = dwv.a.a($$1);
        for (ha $$3 : d) {
            int $$5;
            long $$4;
            if (!dwv.a.a($$1, $$3) || !((dwn)this.f).b(hx.e($$4 = gu.a($$0, $$3))) || ($$5 = ((dwn)this.f).e($$4)) == 0) continue;
            if ($$5 <= $$2 - 1) {
                dcb $$6 = this.c(this.g.f($$4));
                int $$7 = this.a($$4, $$6);
                ((dwn)this.f).a($$4, 0);
                if ($$7 < $$5) {
                    this.b($$4, dwv.a.a($$5, $$3.g()));
                }
                if ($$7 <= 0) continue;
                this.c($$4, dwv.a.a($$7, dwm.a($$6)));
                continue;
            }
            this.c($$4, dwv.a.b($$5, false, $$3.g()));
        }
    }

    private int a(long $$0, dcb $$1) {
        int $$2 = $$1.h();
        if ($$2 > 0 && ((dwn)this.f).j(hx.e($$0))) {
            return $$2;
        }
        return 0;
    }

    @Override
    public void b(clt $$02) {
        this.a($$02, true);
        dek $$12 = this.e.c($$02.e, $$02.f);
        if ($$12 != null) {
            $$12.a((gu $$0, dcb $$1) -> {
                int $$2 = $$1.h();
                this.c($$0.a(), dwv.a.a($$2, dwm.a($$1)));
            });
        }
    }
}

