/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public abstract class alo<T> {
    @Nullable
    private final T a;

    public alo(@Nullable T $$0) {
        this.a = $$0;
    }

    @Nullable
    T g() {
        return this.a;
    }

    boolean f() {
        return false;
    }

    protected abstract void a(JsonObject var1);
}

