/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Table
 *  com.google.common.primitives.UnsignedLong
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  org.slf4j.Logger
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.primitives.UnsignedLong;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class edv<T> {
    private static final Logger a = LogUtils.getLogger();
    private static final String b = "Callback";
    private static final String c = "Name";
    private static final String d = "TriggerTime";
    private final edu<T> e;
    private final Queue<a<T>> f = new PriorityQueue<a<T>>(edv.c());
    private UnsignedLong g = UnsignedLong.ZERO;
    private final Table<String, Long, a<T>> h = HashBasedTable.create();

    private static <T> Comparator<a<T>> c() {
        return Comparator.comparingLong($$0 -> $$0.a).thenComparing($$0 -> $$0.b);
    }

    public edv(edu<T> $$02, Stream<? extends Dynamic<?>> $$1) {
        this($$02);
        this.f.clear();
        this.h.clear();
        this.g = UnsignedLong.ZERO;
        $$1.forEach($$0 -> {
            rk $$1 = (rk)$$0.convert((DynamicOps)rc.a).getValue();
            if ($$1 instanceof qr) {
                qr $$2 = (qr)$$1;
                this.a($$2);
            } else {
                a.warn("Invalid format of events: {}", (Object)$$1);
            }
        });
    }

    public edv(edu<T> $$0) {
        this.e = $$0;
    }

    public void a(T $$0, long $$1) {
        a<T> $$2;
        while (($$2 = this.f.peek()) != null && $$2.a <= $$1) {
            this.f.remove();
            this.h.remove((Object)$$2.c, (Object)$$1);
            $$2.d.handle($$0, this, $$1);
        }
    }

    public void a(String $$0, long $$1, edt<T> $$2) {
        if (this.h.contains((Object)$$0, (Object)$$1)) {
            return;
        }
        this.g = this.g.plus(UnsignedLong.ONE);
        a<T> $$3 = new a<T>($$1, this.g, $$0, $$2);
        this.h.put((Object)$$0, (Object)$$1, $$3);
        this.f.add($$3);
    }

    public int a(String $$0) {
        Collection $$1 = this.h.row((Object)$$0).values();
        $$1.forEach(this.f::remove);
        int $$2 = $$1.size();
        $$1.clear();
        return $$2;
    }

    public Set<String> a() {
        return Collections.unmodifiableSet(this.h.rowKeySet());
    }

    private void a(qr $$0) {
        qr $$1 = $$0.p(b);
        edt<T> $$2 = this.e.a($$1);
        if ($$2 != null) {
            String $$3 = $$0.l(c);
            long $$4 = $$0.i(d);
            this.a($$3, $$4, $$2);
        }
    }

    private qr a(a<T> $$0) {
        qr $$1 = new qr();
        $$1.a(c, $$0.c);
        $$1.a(d, $$0.a);
        $$1.a(b, this.e.a($$0.d));
        return $$1;
    }

    public qx b() {
        qx $$0 = new qx();
        this.f.stream().sorted(edv.c()).map(this::a).forEach($$0::add);
        return $$0;
    }

    public static class a<T> {
        public final long a;
        public final UnsignedLong b;
        public final String c;
        public final edt<T> d;

        a(long $$0, UnsignedLong $$1, String $$2, edt<T> $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }
    }
}

