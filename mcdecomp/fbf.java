/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public abstract class fbf<T extends bfj>
extends fcb {
    public float c;
    public boolean d;
    public boolean e = true;

    protected fbf() {
        this(fkf::d);
    }

    protected fbf(Function<acq, fkf> $$0) {
        super($$0);
    }

    public abstract void a(T var1, float var2, float var3, float var4, float var5, float var6);

    public void a(T $$0, float $$1, float $$2, float $$3) {
    }

    public void a(fbf<T> $$0) {
        $$0.c = this.c;
        $$0.d = this.d;
        $$0.e = this.e;
    }
}

