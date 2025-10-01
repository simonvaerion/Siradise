/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public class aik<T> {
    private final String i;
    private final Comparator<T> j;
    private final long k;
    public static final aik<apz> a = aik.a("start", ($$0, $$1) -> 0);
    public static final aik<apz> b = aik.a("dragon", ($$0, $$1) -> 0);
    public static final aik<clt> c = aik.a("player", Comparator.comparingLong(clt::a));
    public static final aik<clt> d = aik.a("forced", Comparator.comparingLong(clt::a));
    public static final aik<clt> e = aik.a("light", Comparator.comparingLong(clt::a));
    public static final aik<gu> f = aik.a("portal", hz::i, 300);
    public static final aik<Integer> g = aik.a("post_teleport", Integer::compareTo, 5);
    public static final aik<clt> h = aik.a("unknown", Comparator.comparingLong(clt::a), 1);

    public static <T> aik<T> a(String $$0, Comparator<T> $$1) {
        return new aik<T>($$0, $$1, 0L);
    }

    public static <T> aik<T> a(String $$0, Comparator<T> $$1, int $$2) {
        return new aik<T>($$0, $$1, $$2);
    }

    protected aik(String $$0, Comparator<T> $$1, long $$2) {
        this.i = $$0;
        this.j = $$1;
        this.k = $$2;
    }

    public String toString() {
        return this.i;
    }

    public Comparator<T> a() {
        return this.j;
    }

    public long b() {
        return this.k;
    }
}

