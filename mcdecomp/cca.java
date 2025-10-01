/*
 * Decompiled with CFR 0.152.
 */
public class cca
extends ccx {
    private final byo a;
    private int b;

    public cca(byo $$0, bdq $$1, int $$2, int $$3, int $$4) {
        super($$1, $$2, $$3, $$4);
        this.a = $$0;
    }

    @Override
    public boolean a(cfz $$0) {
        return false;
    }

    @Override
    public cfz a(int $$0) {
        if (this.f()) {
            this.b += Math.min($$0, this.e().L());
        }
        return super.a($$0);
    }

    @Override
    public void a(byo $$0, cfz $$1) {
        this.b_($$1);
        super.a($$0, $$1);
    }

    @Override
    protected void a(cfz $$0, int $$1) {
        this.b += $$1;
        this.b_($$0);
    }

    @Override
    protected void b_(cfz $$0) {
        $$0.a(this.a.dI(), this.a, this.b);
        Object object = this.a;
        if (object instanceof aig) {
            aig $$1 = (aig)object;
            object = this.d;
            if (object instanceof czc) {
                czc $$2 = (czc)object;
                $$2.a($$1);
            }
        }
        this.b = 0;
    }
}

