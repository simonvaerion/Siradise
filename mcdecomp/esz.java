/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import javax.annotation.Nullable;

public final class esz
extends Record {
    private final esy a;
    private final int b;
    private final int c;
    private static final esz d = new esz(0, 0, 0, 0);

    public esz(int $$0, int $$1, int $$2, int $$3) {
        this(new esy($$0, $$1), $$2, $$3);
    }

    public esz(esy $$0, int $$1, int $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public static esz a() {
        return d;
    }

    public static esz a(esw $$0, int $$1, int $$2, int $$3, int $$4) {
        return switch ($$0) {
            default -> throw new IncompatibleClassChangeError();
            case esw.a -> new esz($$1, $$2, $$3, $$4);
            case esw.b -> new esz($$2, $$1, $$4, $$3);
        };
    }

    public esz a(esx $$0) {
        return new esz(this.a.a($$0), this.b, this.c);
    }

    public int a(esw $$0) {
        return switch ($$0) {
            default -> throw new IncompatibleClassChangeError();
            case esw.a -> this.b;
            case esw.b -> this.c;
        };
    }

    public int b(esx $$0) {
        esw $$1 = $$0.a();
        if ($$0.c()) {
            return this.a.a($$1) + this.a($$1) - 1;
        }
        return this.a.a($$1);
    }

    public esz c(esx $$0) {
        int $$1 = this.b($$0);
        esw $$2 = $$0.a().a();
        int $$3 = this.b($$2.c());
        int $$4 = this.a($$2);
        return esz.a($$0.a(), $$1, $$3, 1, $$4).a($$0);
    }

    public boolean a(esz $$0) {
        return this.a($$0, esw.a) && this.a($$0, esw.b);
    }

    public boolean a(esz $$0, esw $$1) {
        int $$2 = this.b($$1.c());
        int $$3 = $$0.b($$1.c());
        int $$4 = this.b($$1.b());
        int $$5 = $$0.b($$1.b());
        return Math.max($$2, $$3) <= Math.min($$4, $$5);
    }

    public int b(esw $$0) {
        return (this.b($$0.b()) + this.b($$0.c())) / 2;
    }

    @Nullable
    public esz b(esz $$0) {
        int $$1 = Math.max(this.d(), $$0.d());
        int $$2 = Math.max(this.b(), $$0.b());
        int $$3 = Math.min(this.e(), $$0.e());
        int $$4 = Math.min(this.c(), $$0.c());
        if ($$1 >= $$3 || $$2 >= $$4) {
            return null;
        }
        return new esz($$1, $$2, $$3 - $$1, $$4 - $$2);
    }

    public int b() {
        return this.a.b();
    }

    public int c() {
        return this.a.b() + this.c;
    }

    public int d() {
        return this.a.a();
    }

    public int e() {
        return this.a.a() + this.b;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{esz.class, "position;width;height", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{esz.class, "position;width;height", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{esz.class, "position;width;height", "a", "b", "c"}, this, $$0);
    }

    public esy f() {
        return this.a;
    }

    public int g() {
        return this.b;
    }

    public int h() {
        return this.c;
    }
}

