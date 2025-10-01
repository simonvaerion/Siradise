/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;

public class amq<T>
implements Iterable<amo<T>> {
    private final hr<T> a;
    private final Map<T, amo<T>> b = new IdentityHashMap<T, amo<T>>();
    @Nullable
    private sw c;

    public amq(hr<T> $$0) {
        this.a = $$0;
    }

    public boolean a(T $$0) {
        return this.b.containsKey($$0);
    }

    public amo<T> a(T $$0, amp $$12) {
        return this.b.computeIfAbsent($$0, $$1 -> new amo<Object>(this, $$1, $$12));
    }

    public hr<T> a() {
        return this.a;
    }

    @Override
    public Iterator<amo<T>> iterator() {
        return this.b.values().iterator();
    }

    public amo<T> b(T $$0) {
        return this.a($$0, amp.b);
    }

    public String b() {
        return "stat_type." + jb.y.b(this).toString().replace(':', '.');
    }

    public sw c() {
        if (this.c == null) {
            this.c = sw.c(this.b());
        }
        return this.c;
    }
}

