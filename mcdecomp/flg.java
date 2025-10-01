/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Streams
 */
import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class flg
implements flh {
    public static final String a = "AND";
    private final Iterable<? extends flh> d;

    public flg(Iterable<? extends flh> $$0) {
        this.d = $$0;
    }

    @Override
    public Predicate<dcb> getPredicate(dcc<cpn, dcb> $$0) {
        List $$13 = Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).collect(Collectors.toList());
        return $$12 -> $$13.stream().allMatch($$1 -> $$1.test($$12));
    }
}

