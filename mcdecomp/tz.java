/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Optional;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class tz
implements sx {
    private final String b;
    @Nullable
    private Supplier<sw> c;

    public tz(String $$0) {
        this.b = $$0;
    }

    private sw b() {
        if (this.c == null) {
            this.c = ua.a.apply(this.b);
        }
        return this.c.get();
    }

    @Override
    public <T> Optional<T> a(ta.a<T> $$0) {
        return this.b().a($$0);
    }

    @Override
    public <T> Optional<T> a(ta.b<T> $$0, ts $$1) {
        return this.b().a($$0, $$1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof tz)) return false;
        tz $$1 = (tz)$$0;
        if (!this.b.equals($$1.b)) return false;
        return true;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "keybind{" + this.b + "}";
    }

    public String a() {
        return this.b;
    }
}

