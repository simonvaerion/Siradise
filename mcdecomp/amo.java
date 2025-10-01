/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Objects;
import javax.annotation.Nullable;

public class amo<T>
extends efj {
    private final amp n;
    private final T o;
    private final amq<T> p;

    protected amo(amq<T> $$0, T $$1, amp $$2) {
        super(amo.a($$0, $$1));
        this.p = $$0;
        this.n = $$2;
        this.o = $$1;
    }

    public static <T> String a(amq<T> $$0, T $$1) {
        return amo.a(jb.y.b($$0)) + ":" + amo.a($$0.a().b($$1));
    }

    private static <T> String a(@Nullable acq $$0) {
        return $$0.toString().replace(':', '.');
    }

    public amq<T> a() {
        return this.p;
    }

    public T b() {
        return this.o;
    }

    public String a(int $$0) {
        return this.n.format($$0);
    }

    public boolean equals(Object $$0) {
        return this == $$0 || $$0 instanceof amo && Objects.equals(this.d(), ((amo)$$0).d());
    }

    public int hashCode() {
        return this.d().hashCode();
    }

    public String toString() {
        return "Stat{name=" + this.d() + ", formatter=" + this.n + "}";
    }
}

