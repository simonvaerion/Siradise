/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class fyd<T>
extends fye<T> {
    private final List<T> c;
    private final Function<T, Stream<String>> d;
    private fyh<T> e = fyh.a();

    public fyd(Function<T, Stream<String>> $$0, Function<T, Stream<acq>> $$1, List<T> $$2) {
        super($$1, $$2);
        this.c = $$2;
        this.d = $$0;
    }

    @Override
    public void a() {
        super.a();
        this.e = fyh.a(this.c, this.d);
    }

    @Override
    protected List<T> a(String $$0) {
        return this.e.search($$0);
    }

    @Override
    protected List<T> a(String $$0, String $$1) {
        List $$2 = this.b.a($$0);
        List $$3 = this.b.b($$1);
        List<T> $$4 = this.e.search($$1);
        fyg $$5 = new fyg($$3.iterator(), $$4.iterator(), this.a);
        return ImmutableList.copyOf(new fyf($$2.iterator(), $$5, this.a));
    }
}

