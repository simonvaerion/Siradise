/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class aoh<T extends Throwable> {
    @Nullable
    private T a;

    public void a(T $$0) {
        if (this.a == null) {
            this.a = $$0;
        } else {
            ((Throwable)this.a).addSuppressed((Throwable)$$0);
        }
    }

    public void a() throws T {
        if (this.a != null) {
            throw this.a;
        }
    }
}

