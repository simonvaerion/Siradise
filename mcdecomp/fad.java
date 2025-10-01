/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public abstract class fad<E extends bfj>
extends fbf<E> {
    private final boolean a;
    private final float b;
    private final float f;
    private final float g;
    private final float h;
    private final float i;

    protected fad(boolean $$0, float $$1, float $$2) {
        this($$0, $$1, $$2, 2.0f, 2.0f, 24.0f);
    }

    protected fad(boolean $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this(fkf::d, $$0, $$1, $$2, $$3, $$4, $$5);
    }

    protected fad(Function<acq, fkf> $$0, boolean $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
        super($$0);
        this.a = $$1;
        this.b = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = $$5;
        this.i = $$6;
    }

    protected fad() {
        this(false, 5.0f, 2.0f);
    }

    @Override
    public void a(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
        if (this.e) {
            $$0.a();
            if (this.a) {
                float $$82 = 1.5f / this.g;
                $$0.b($$82, $$82, $$82);
            }
            $$0.a(0.0f, this.b / 16.0f, this.f / 16.0f);
            this.a().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
            $$0.b();
            $$0.a();
            float $$9 = 1.0f / this.h;
            $$0.b($$9, $$9, $$9);
            $$0.a(0.0f, this.i / 16.0f, 0.0f);
            this.b().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
            $$0.b();
        } else {
            this.a().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
            this.b().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
        }
    }

    protected abstract Iterable<fee> a();

    protected abstract Iterable<fee> b();
}

