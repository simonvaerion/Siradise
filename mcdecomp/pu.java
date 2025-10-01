/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Streams
 *  org.apache.commons.lang3.mutable.MutableInt
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;

public class pu {
    private static final int e = 100;
    public static final int a = 2;
    public static final int b = 5;
    public static final int c = 6;
    public static final int d = 8;

    public static void a(pr $$0, gu $$1, px $$2) {
        $$0.a();
        $$2.a($$0);
        $$0.a(new qd($$0, $$2, $$1));
        $$0.a($$1, 2);
    }

    public static Collection<pr> a(Collection<pm> $$0, gu $$1, cvz $$2, aif $$3, px $$4, int $$5) {
        pn $$6 = new pn($$0, $$1, $$2, $$3, $$4, $$5);
        $$6.b();
        return $$6.a();
    }

    public static Collection<pr> b(Collection<qi> $$0, gu $$1, cvz $$2, aif $$3, px $$4, int $$5) {
        return pu.a(pu.a($$0), $$1, $$2, $$3, $$4, $$5);
    }

    public static Collection<pm> a(Collection<qi> $$02) {
        Map<String, List<qi>> $$1 = $$02.stream().collect(Collectors.groupingBy(qi::e));
        return (Collection)$$1.entrySet().stream().flatMap($$0 -> {
            String $$1 = (String)$$0.getKey();
            Consumer<aif> $$2 = pt.c($$1);
            Consumer<aif> $$3 = pt.d($$1);
            MutableInt $$42 = new MutableInt();
            Collection $$5 = (Collection)$$0.getValue();
            return Streams.stream((Iterable)Iterables.partition((Iterable)$$5, (int)100)).map($$4 -> new pm($$1 + ":" + $$42.incrementAndGet(), (Collection<qi>)ImmutableList.copyOf((Collection)$$4), $$2, $$3));
        }).collect(ImmutableList.toImmutableList());
    }

    public static void a(aif $$0, gu $$12, px $$2, int $$3) {
        $$2.a();
        gu $$4 = $$12.b(-$$3, 0, -$$3);
        gu $$5 = $$12.b($$3, 0, $$3);
        gu.b($$4, $$5).filter($$1 -> $$0.a_((gu)$$1).a(cpo.pa)).forEach($$1 -> {
            dba $$2 = (dba)$$0.c_((gu)$$1);
            gu $$3 = $$2.p();
            drs $$4 = qe.b($$2);
            qe.a($$4, $$3.v(), $$0);
        });
    }

    public static void a(aif $$0) {
        za.a($$0);
    }
}

