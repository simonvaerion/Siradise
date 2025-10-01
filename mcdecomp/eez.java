/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class eez
extends efb {
    private final efb b;
    private final ha.a c;
    private static final DoubleList d = new eeo(1);

    public eez(efb $$0, ha.a $$1, int $$2) {
        super(eez.a($$0.a, $$1, $$2));
        this.b = $$0;
        this.c = $$1;
    }

    private static eer a(eer $$0, ha.a $$1, int $$2) {
        return new efa($$0, $$1.a($$2, 0, 0), $$1.a(0, $$2, 0), $$1.a(0, 0, $$2), $$1.a($$2 + 1, $$0.a, $$0.a), $$1.a($$0.b, $$2 + 1, $$0.b), $$1.a($$0.c, $$0.c, $$2 + 1));
    }

    @Override
    protected DoubleList a(ha.a $$0) {
        if ($$0 == this.c) {
            return d;
        }
        return this.b.a($$0);
    }
}

