/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class apm<K, V> {
    private final Function<K, V> a;
    @Nullable
    private K b = null;
    @Nullable
    private V c;

    public apm(Function<K, V> $$0) {
        this.a = $$0;
    }

    public V a(K $$0) {
        if (this.c == null || !Objects.equals(this.b, $$0)) {
            this.c = this.a.apply($$0);
            this.b = $$0;
        }
        return this.c;
    }
}

