/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public final class fkm
implements AutoCloseable {
    private final enn a;
    private final ehl b;

    public fkm(enn $$0) {
        this.a = $$0;
        this.b = new ehl(ehi::new);
    }

    public ehn a(eha $$0, @Nullable String $$1, String $$2) {
        return new ehn(this.a, this.b, $$0, $$1, $$2);
    }

    @Override
    public void close() {
        this.b.a();
    }
}

