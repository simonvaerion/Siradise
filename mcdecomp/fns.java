/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;

public class fns
implements fnd.a {
    private final List<gu> a = Lists.newArrayList();
    private final List<Float> b = Lists.newArrayList();
    private final List<Float> c = Lists.newArrayList();
    private final List<Float> d = Lists.newArrayList();
    private final List<Float> e = Lists.newArrayList();
    private final List<Float> f = Lists.newArrayList();

    public void a(gu $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.a.add($$0);
        this.b.add(Float.valueOf($$1));
        this.c.add(Float.valueOf($$5));
        this.d.add(Float.valueOf($$2));
        this.e.add(Float.valueOf($$3));
        this.f.add(Float.valueOf($$4));
    }

    @Override
    public void a(eij $$0, fjx $$1, double $$2, double $$3, double $$4) {
        ein $$5 = $$1.getBuffer(fkf.z());
        for (int $$6 = 0; $$6 < this.a.size(); ++$$6) {
            gu $$7 = this.a.get($$6);
            Float $$8 = this.b.get($$6);
            float $$9 = $$8.floatValue() / 2.0f;
            fjv.b($$0, $$5, (double)((float)$$7.u() + 0.5f - $$9) - $$2, (double)((float)$$7.v() + 0.5f - $$9) - $$3, (double)((float)$$7.w() + 0.5f - $$9) - $$4, (double)((float)$$7.u() + 0.5f + $$9) - $$2, (double)((float)$$7.v() + 0.5f + $$9) - $$3, (double)((float)$$7.w() + 0.5f + $$9) - $$4, this.d.get($$6).floatValue(), this.e.get($$6).floatValue(), this.f.get($$6).floatValue(), this.c.get($$6).floatValue());
        }
    }
}

