/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class brk
extends bri {
    @Nullable
    private brk b;
    private int c = 1;

    public brk(bfn<? extends brk> $$0, cmm $$1) {
        super((bfn<? extends bri>)$$0, $$1);
    }

    @Override
    protected void x() {
        super.x();
        this.bO.a(5, new bmr(this));
    }

    @Override
    public int fE() {
        return this.ga();
    }

    public int ga() {
        return super.fE();
    }

    @Override
    protected boolean fY() {
        return !this.gb();
    }

    public boolean gb() {
        return this.b != null && this.b.bs();
    }

    public brk a(brk $$0) {
        this.b = $$0;
        $$0.gh();
        return $$0;
    }

    public void gc() {
        this.b.gi();
        this.b = null;
    }

    private void gh() {
        ++this.c;
    }

    private void gi() {
        --this.c;
    }

    public boolean gd() {
        return this.ge() && this.c < this.ga();
    }

    @Override
    public void l() {
        List<?> $$0;
        super.l();
        if (this.ge() && this.dI().z.a(200) == 1 && ($$0 = this.dI().a(this.getClass(), this.cE().c(8.0, 8.0, 8.0))).size() <= 1) {
            this.c = 1;
        }
    }

    public boolean ge() {
        return this.c > 1;
    }

    public boolean gf() {
        return this.f((bfj)this.b) <= 121.0;
    }

    public void gg() {
        if (this.gb()) {
            this.J().a((bfj)this.b, 1.0);
        }
    }

    public void a(Stream<? extends brk> $$02) {
        $$02.limit(this.ga() - this.c).filter($$0 -> $$0 != this).forEach($$0 -> $$0.a(this));
    }

    @Override
    @Nullable
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        if ($$3 == null) {
            $$3 = new a(this);
        } else {
            this.a(((a)$$3).a);
        }
        return $$3;
    }

    public static class a
    implements bgt {
        public final brk a;

        public a(brk $$0) {
            this.a = $$0;
        }
    }
}

