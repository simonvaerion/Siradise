/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class fts<T extends bxs, M extends fdr<T>>
extends ftg<T, M> {
    private final acq a;
    private final a<T> b;
    private final b<T, M> c;

    public fts(fqt<T, M> $$0, acq $$1, a<T> $$2, b<T, M> $$3) {
        super($$0);
        this.a = $$1;
        this.b = $$2;
        this.c = $$3;
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        if (((bfj)$$3).cb()) {
            return;
        }
        this.a();
        ein $$10 = $$1.getBuffer(fkf.i(this.a));
        ((fdr)this.c()).a($$0, $$10, $$2, fpz.c($$3, 0.0f), 1.0f, 1.0f, 1.0f, this.b.apply($$3, $$6, $$7));
        this.b();
    }

    private void a() {
        List<fee> $$02 = this.c.getPartsToDraw((fdr)this.c());
        ((fdr)this.c()).a().e().forEach($$0 -> {
            $$0.l = true;
        });
        $$02.forEach($$0 -> {
            $$0.l = false;
        });
    }

    private void b() {
        ((fdr)this.c()).a().e().forEach($$0 -> {
            $$0.l = false;
        });
    }

    public static interface a<T extends bxs> {
        public float apply(T var1, float var2, float var3);
    }

    public static interface b<T extends bxs, M extends fbf<T>> {
        public List<fee> getPartsToDraw(M var1);
    }
}

