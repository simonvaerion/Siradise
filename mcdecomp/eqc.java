/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public abstract class eqc<E extends a<E>>
extends epc<E> {
    private static final sw a = sw.c("narration.selection.usage");

    public eqc(enn $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        super($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    @Nullable
    public eou a(esv $$0) {
        if (this.k() == 0) {
            return null;
        }
        if (this.aB_() && $$0 instanceof esv.a) {
            esv.a $$1 = (esv.a)$$0;
            a $$2 = (a)this.a($$1.b());
            if ($$2 != null) {
                return eou.a(this, eou.a($$2));
            }
            return null;
        }
        if (!this.aB_()) {
            a $$3 = (a)this.f();
            if ($$3 == null) {
                $$3 = (a)this.a($$0.a());
            }
            if ($$3 == null) {
                return null;
            }
            return eou.a(this, eou.a($$3));
        }
        return null;
    }

    @Override
    public void b(esp $$0) {
        a $$1 = (a)this.r();
        if ($$1 != null) {
            this.a($$0.a(), $$1);
            $$1.b($$0);
        } else {
            a $$2 = (a)this.f();
            if ($$2 != null) {
                this.a($$0.a(), $$2);
                $$2.b($$0);
            }
        }
        if (this.aB_()) {
            $$0.a(eso.d, a);
        }
    }

    public static abstract class a<E extends a<E>>
    extends epc.a<E>
    implements esq {
        public abstract sw a();

        @Override
        public void b(esp $$0) {
            $$0.a(eso.a, this.a());
        }
    }
}

