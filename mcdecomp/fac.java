/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public abstract class fac<E extends bfj>
extends fbo<E> {
    private final float a;
    private final float b;

    public fac(float $$0, float $$1) {
        this($$0, $$1, fkf::d);
    }

    public fac(float $$0, float $$1, Function<acq, fkf> $$2) {
        super($$2);
        this.b = $$1;
        this.a = $$0;
    }

    @Override
    public void a(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
        if (this.e) {
            $$0.a();
            $$0.b(this.a, this.a, this.a);
            $$0.a(0.0f, this.b / 16.0f, 0.0f);
            this.a().a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            $$0.b();
        } else {
            this.a().a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        }
    }
}

