/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.shorts.ShortIterator
 *  it.unimi.dsi.fastutil.shorts.ShortSet
 */
import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.function.BiConsumer;

public class xh
implements uo<ur> {
    private static final int a = 12;
    private final hx b;
    private final short[] c;
    private final dcb[] d;

    public xh(hx $$0, ShortSet $$1, dej $$2) {
        this.b = $$0;
        int $$3 = $$1.size();
        this.c = new short[$$3];
        this.d = new dcb[$$3];
        int $$4 = 0;
        ShortIterator shortIterator = $$1.iterator();
        while (shortIterator.hasNext()) {
            short $$5;
            this.c[$$4] = $$5 = ((Short)shortIterator.next()).shortValue();
            this.d[$$4] = $$2.a(hx.a($$5), hx.b($$5), hx.c($$5));
            ++$$4;
        }
    }

    public xh(sf $$0) {
        this.b = hx.a($$0.readLong());
        int $$1 = $$0.m();
        this.c = new short[$$1];
        this.d = new dcb[$$1];
        for (int $$2 = 0; $$2 < $$1; ++$$2) {
            long $$3 = $$0.n();
            this.c[$$2] = (short)($$3 & 0xFFFL);
            this.d[$$2] = cpn.o.a((int)($$3 >>> 12));
        }
    }

    @Override
    public void a(sf $$0) {
        $$0.writeLong(this.b.s());
        $$0.d(this.c.length);
        for (int $$1 = 0; $$1 < this.c.length; ++$$1) {
            $$0.b((long)cpn.i(this.d[$$1]) << 12 | (long)this.c[$$1]);
        }
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    @Override
    public void a(BiConsumer<gu, dcb> $$0) {
        gu.a $$1 = new gu.a();
        for (int $$2 = 0; $$2 < this.c.length; ++$$2) {
            short $$3 = this.c[$$2];
            $$1.d(this.b.d($$3), this.b.e($$3), this.b.f($$3));
            $$0.accept($$1, this.d[$$2]);
        }
    }
}

