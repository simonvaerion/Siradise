/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class fye<T>
implements fyi<T> {
    protected final Comparator<T> a;
    protected final fyj<T> b;

    public fye(Function<T, Stream<acq>> $$0, List<T> $$1) {
        ToIntFunction<T> $$2 = ac.e($$1);
        this.a = Comparator.comparingInt($$2);
        this.b = fyj.a($$1, $$0);
    }

    @Override
    public List<T> search(String $$0) {
        int $$1 = $$0.indexOf(58);
        if ($$1 == -1) {
            return this.a($$0);
        }
        return this.a($$0.substring(0, $$1).trim(), $$0.substring($$1 + 1).trim());
    }

    protected List<T> a(String $$0) {
        return this.b.b($$0);
    }

    protected List<T> a(String $$0, String $$1) {
        List<T> $$2 = this.b.a($$0);
        List<T> $$3 = this.b.b($$1);
        return ImmutableList.copyOf(new fyf<T>($$2.iterator(), $$3.iterator(), this.a));
    }
}

