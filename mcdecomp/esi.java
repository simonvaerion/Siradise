/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public interface esi {
    public void e(int var1);

    public void f(int var1);

    public int p();

    public int r();

    public int k();

    public int h();

    default public esz s() {
        return new esz(this.p(), this.r(), this.k(), this.h());
    }

    default public void b(int $$0, int $$1) {
        this.e($$0);
        this.f($$1);
    }

    public void a(Consumer<epf> var1);
}

