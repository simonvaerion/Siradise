/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ees
implements een {
    protected static final een a = new ees(false, -1.7976931348623157E308, cfz.b, $$0 -> false, null){

        @Override
        public boolean a(efb $$0, gu $$1, boolean $$2) {
            return $$2;
        }
    };
    private final boolean b;
    private final double c;
    private final cfz d;
    private final Predicate<dxe> e;
    @Nullable
    private final bfj f;

    protected ees(boolean $$0, double $$1, cfz $$2, Predicate<dxe> $$3, @Nullable bfj $$4) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }

    @Deprecated
    protected ees(bfj $$02) {
        this($$02.bT(), $$02.dp(), $$02 instanceof bfz ? ((bfz)$$02).eO() : cfz.b, $$02 instanceof bfz ? ((bfz)$$02)::a : $$0 -> false, $$02);
    }

    @Override
    public boolean a(cfu $$0) {
        return this.d.a($$0);
    }

    @Override
    public boolean a(dxe $$0, dxe $$1) {
        return this.e.test($$1) && !$$0.a().a($$1.a());
    }

    @Override
    public boolean b() {
        return this.b;
    }

    @Override
    public boolean a(efb $$0, gu $$1, boolean $$2) {
        return this.c > (double)$$1.v() + $$0.c(ha.a.b) - (double)1.0E-5f;
    }

    @Nullable
    public bfj c() {
        return this.f;
    }
}

