/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bog<T extends bgb>
extends bmv {
    private final T a;
    private final cfz b;
    private final Predicate<? super T> c;
    @Nullable
    private final amg d;

    public bog(T $$0, cfz $$1, @Nullable amg $$2, Predicate<? super T> $$3) {
        this.a = $$0;
        this.b = $$1;
        this.d = $$2;
        this.c = $$3;
    }

    @Override
    public boolean a() {
        return this.c.test(this.a);
    }

    @Override
    public boolean b() {
        return ((bfz)this.a).fi();
    }

    @Override
    public void c() {
        ((bgb)this.a).a(bfo.a, this.b.p());
        ((bfz)this.a).c(bdw.a);
    }

    @Override
    public void d() {
        ((bgb)this.a).a(bfo.a, cfz.b);
        if (this.d != null) {
            ((bfj)this.a).a(this.d, 1.0f, ((bfz)this.a).ec().i() * 0.2f + 0.9f);
        }
    }
}

