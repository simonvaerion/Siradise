/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.function.Predicate;

public interface deo<T> {
    public int a(T var1);

    public boolean a(Predicate<T> var1);

    public T a(int var1);

    public void a(sf var1);

    public void b(sf var1);

    public int a();

    public int b();

    public deo<T> c();

    public static interface a {
        public <A> deo<A> create(int var1, hj<A> var2, dep<A> var3, List<A> var4);
    }
}

