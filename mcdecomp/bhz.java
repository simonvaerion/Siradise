/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class bhz<E extends bgb, T extends bfz>
extends bhr<E> {
    private static final int c = 1200;
    private int d;
    private a e = bhz$a.a;

    public bhz() {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.n, (Object)((Object)bpc.c), bpb.o, (Object)((Object)bpc.a)), 1200);
    }

    @Override
    protected boolean a(aif $$0, E $$1) {
        bfz $$2 = bhz.b($$1);
        return ((bfz)$$1).b(cgc.uZ) && bht.b($$1, $$2) && bht.a($$1, $$2, 0);
    }

    @Override
    protected boolean a(aif $$0, E $$1, long $$2) {
        return ((bfz)$$1).dK().a(bpb.o) && this.a($$0, $$1);
    }

    @Override
    protected void b(aif $$0, E $$1, long $$2) {
        bfz $$3 = bhz.b($$1);
        this.b((bgb)$$1, $$3);
        this.a($$1, $$3);
    }

    @Override
    protected void c(aif $$0, E $$1, long $$2) {
        if (((bfz)$$1).fi()) {
            ((bfz)$$1).fo();
        }
        if (((bfz)$$1).b(cgc.uZ)) {
            ((bvp)$$1).b(false);
            ceh.a(((bfz)$$1).fk(), false);
        }
    }

    private void a(E $$0, bfz $$1) {
        if (this.e == bhz$a.a) {
            ((bfz)$$0).c(bzh.a($$0, cgc.uZ));
            this.e = bhz$a.b;
            ((bvp)$$0).b(true);
        } else if (this.e == bhz$a.b) {
            cfz $$3;
            int $$2;
            if (!((bfz)$$0).fi()) {
                this.e = bhz$a.a;
            }
            if (($$2 = ((bfz)$$0).fm()) >= ceh.k($$3 = ((bfz)$$0).fk())) {
                ((bfz)$$0).fn();
                this.e = bhz$a.c;
                this.d = 20 + ((bfz)$$0).ec().a(20);
                ((bvp)$$0).b(false);
            }
        } else if (this.e == bhz$a.c) {
            --this.d;
            if (this.d == 0) {
                this.e = bhz$a.d;
            }
        } else if (this.e == bhz$a.d) {
            ((bwg)$$0).a($$1, 1.0f);
            cfz $$4 = ((bfz)$$0).b(bzh.a($$0, cgc.uZ));
            ceh.a($$4, false);
            this.e = bhz$a.a;
        }
    }

    private void b(bgb $$0, bfz $$1) {
        $$0.dK().a(bpb.n, new bic($$1, true));
    }

    private static bfz b(bfz $$0) {
        return $$0.dK().c(bpb.o).get();
    }

    @Override
    protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
        this.c(aif2, (E)((bgb)bfz2), l2);
    }

    @Override
    protected /* synthetic */ void c(aif aif2, bfz bfz2, long l2) {
        this.b(aif2, (E)((bgb)bfz2), l2);
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            e = bhz$a.a();
        }
    }
}

