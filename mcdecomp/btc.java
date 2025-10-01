/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class btc
extends bhr<bta> {
    public static final int c = 100;
    public static final int d = 6;
    public static final int e = 10;
    private static final float h = 1.75f;
    private static final float i = 0.75f;
    public static final int f = 100;
    public static final int g = 5;
    private int j;
    private int k;
    private final amg l;
    private final amg m;
    private eei n;
    private a o = btc$a.d;

    public btc(amg $$0, amg $$1) {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.m, (Object)((Object)bpc.b), bpb.n, (Object)((Object)bpc.c), bpb.o, (Object)((Object)bpc.a), bpb.Y, (Object)((Object)bpc.b)), 100);
        this.l = $$0;
        this.m = $$1;
    }

    @Override
    protected boolean a(aif $$0, bta $$1) {
        bfz $$2 = $$1.dK().c(bpb.o).get();
        boolean $$3 = this.a($$1, $$2);
        if (!$$3) {
            $$1.dK().b(bpb.o);
            this.b($$1, $$2);
        }
        return $$3 && $$1.al() != bgl.i && bta.l($$2);
    }

    @Override
    protected boolean a(aif $$0, bta $$1, long $$2) {
        return $$1.dK().a(bpb.o) && this.o != btc$a.d && !$$1.dK().a(bpb.Y);
    }

    @Override
    protected void b(aif $$0, bta $$1, long $$2) {
        bfz $$3 = $$1.dK().c(bpb.o).get();
        bht.a((bfz)$$1, $$3);
        $$1.a((bfj)$$3);
        $$1.dK().a(bpb.m, new bpe($$3.dg(), 2.0f, 0));
        this.k = 10;
        this.o = btc$a.a;
    }

    @Override
    protected void c(aif $$0, bta $$1, long $$2) {
        $$1.dK().b(bpb.o);
        $$1.q();
        $$1.b(bgl.a);
    }

    private void b(aif $$0, bta $$1) {
        bfj $$3;
        $$0.a(null, $$1, this.m, ami.g, 2.0f, 1.0f);
        Optional<bfj> $$2 = $$1.r();
        if ($$2.isPresent() && ($$3 = $$2.get()).bs()) {
            $$1.z($$3);
            if (!$$3.bs()) {
                $$3.a(bfj.c.a);
            }
        }
    }

    @Override
    protected void d(aif $$0, bta $$1, long $$2) {
        bfz $$3 = $$1.dK().c(bpb.o).get();
        $$1.a((bfj)$$3);
        switch (this.o) {
            case a: {
                if ($$3.e((bfj)$$1) < 1.75f) {
                    $$0.a(null, $$1, this.l, ami.g, 2.0f, 1.0f);
                    $$1.b(bgl.j);
                    $$3.f($$3.dg().a($$1.dg()).d().a(0.75));
                    this.n = $$3.dg();
                    this.j = 0;
                    this.o = btc$a.b;
                    break;
                }
                if (this.k <= 0) {
                    $$1.dK().a(bpb.m, new bpe($$3.dg(), 2.0f, 0));
                    this.k = 10;
                    break;
                }
                --this.k;
                break;
            }
            case b: {
                if (this.j++ < 6) break;
                this.o = btc$a.c;
                this.b($$0, $$1);
                break;
            }
            case c: {
                if (this.j >= 10) {
                    this.o = btc$a.d;
                    break;
                }
                ++this.j;
                break;
            }
        }
    }

    private boolean a(bta $$0, bfz $$1) {
        dxt $$2 = $$0.J().a((bfj)$$1, 0);
        return $$2 != null && $$2.n() < 1.75f;
    }

    private void b(bta $$0, bfz $$1) {
        boolean $$3;
        List $$2 = $$0.dK().c(bpb.Z).orElseGet(ArrayList::new);
        boolean bl2 = $$3 = !$$2.contains($$1.ct());
        if ($$2.size() == 5 && $$3) {
            $$2.remove(0);
        }
        if ($$3) {
            $$2.add($$1.ct());
        }
        $$0.dK().a(bpb.Z, $$2, 100L);
    }

    @Override
    protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
        this.c(aif2, (bta)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void c(aif aif2, bfz bfz2, long l2) {
        this.d(aif2, (bta)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.b(aif2, (bta)bfz2, l2);
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
            e = btc$a.a();
        }
    }
}

