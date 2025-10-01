/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;

public class eum
extends euq {
    private static final int a = 20;
    private static final int b = 5;
    private static final int c = 20;
    private final sw k;
    private final ta l;
    private final ImmutableList<a> m;
    private epz n = epz.a;
    private int o;
    private int p;

    protected eum(sw $$0, List<sw> $$1, ImmutableList<a> $$2) {
        super($$0);
        this.l = ta.a($$1);
        this.k = sv.a(new sw[]{$$0, sy.a($$1, sv.a)});
        this.m = $$2;
    }

    @Override
    public sw au_() {
        return this.k;
    }

    @Override
    public void b() {
        for (a $$0 : this.m) {
            this.p = Math.max(this.p, 20 + this.i.a($$0.a) + 20);
        }
        int $$1 = 5 + this.p + 5;
        int $$2 = $$1 * this.m.size();
        this.n = epz.a(this.i, this.l, $$2);
        int $$3 = this.n.a() * this.i.b;
        this.o = (int)((double)this.h / 2.0 - (double)$$3 / 2.0);
        int $$4 = this.o + $$3 + this.i.b * 2;
        int $$5 = (int)((double)this.g / 2.0 - (double)$$2 / 2.0);
        for (a $$6 : this.m) {
            this.d(epi.a($$6.a, $$6.b).a($$5, $$4, this.p, 20).a());
            $$5 += $$1;
        }
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.b($$0);
        $$0.a(this.i, this.e, this.g / 2, this.o - this.i.b * 2, -1);
        this.n.a($$0, this.g / 2, this.o);
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public boolean av_() {
        return false;
    }

    public static final class a {
        final sw a;
        final epi.c b;

        public a(sw $$0, epi.c $$1) {
            this.a = $$0;
            this.b = $$1;
        }
    }
}

