/*
 * Decompiled with CFR 0.152.
 */
public class bok
extends bnf {
    private final bwv b;
    private int c;

    public bok(bwv $$0, double $$1, boolean $$2) {
        super($$0, $$1, $$2);
        this.b = $$0;
    }

    @Override
    public void c() {
        super.c();
        this.c = 0;
    }

    @Override
    public void d() {
        super.d();
        this.b.v(false);
    }

    @Override
    public void e() {
        super.e();
        ++this.c;
        if (this.c >= 5 && this.k() < this.l() / 2) {
            this.b.v(true);
        } else {
            this.b.v(false);
        }
    }
}

