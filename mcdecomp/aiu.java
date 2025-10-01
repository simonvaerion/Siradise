/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import javax.annotation.Nullable;

public record aiu(String b, sz c) {
    private final String b;
    private final sz c;
    public static final aiu a = aiu.a("");

    public static aiu a(String $$0) {
        return new aiu($$0, sz.c);
    }

    public static aiu b(String $$0) {
        return new aiu($$0, sz.b);
    }

    @Nullable
    public String a() {
        return this.c.a(this.b);
    }

    public String b() {
        return Objects.requireNonNullElse(this.a(), "");
    }

    public boolean c() {
        return !this.c.a();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aiu.class, "raw;mask", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aiu.class, "raw;mask", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aiu.class, "raw;mask", "b", "c"}, this, $$0);
    }

    public String d() {
        return this.b;
    }

    public sz e() {
        return this.c;
    }
}

