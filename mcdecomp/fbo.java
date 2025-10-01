/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 */
import java.util.Optional;
import java.util.function.Function;
import org.joml.Vector3f;

public abstract class fbo<E extends bfj>
extends fbf<E> {
    private static final Vector3f a = new Vector3f();

    public fbo() {
        this(fkf::d);
    }

    public fbo(Function<acq, fkf> $$0) {
        super($$0);
    }

    @Override
    public void a(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
        this.a().a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    public abstract fee a();

    public Optional<fee> a(String $$0) {
        if ($$0.equals("root")) {
            return Optional.of(this.a());
        }
        return this.a().e().filter($$1 -> $$1.a($$0)).findFirst().map($$1 -> $$1.b($$0));
    }

    protected void a(bff $$0, eoe $$1, float $$2) {
        this.a($$0, $$1, $$2, 1.0f);
    }

    protected void a(eoe $$0, float $$1, float $$2, float $$3, float $$4) {
        long $$5 = (long)($$1 * 50.0f * $$3);
        float $$6 = Math.min($$2 * $$4, 1.0f);
        eog.a(this, $$0, $$5, $$6, a);
    }

    protected void a(bff $$0, eoe $$12, float $$2, float $$3) {
        $$0.a($$2, $$3);
        $$0.a((bff $$1) -> eog.a(this, $$12, $$1.b(), 1.0f, a));
    }

    protected void a(eoe $$0) {
        eog.a(this, $$0, 0L, 1.0f, a);
    }
}

