/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class xb
implements uo<ur> {
    private final a a;
    private final List<acq> b;
    private final List<acq> c;
    private final aml d;

    public xb(a $$0, Collection<acq> $$1, Collection<acq> $$2, aml $$3) {
        this.a = $$0;
        this.b = ImmutableList.copyOf($$1);
        this.c = ImmutableList.copyOf($$2);
        this.d = $$3;
    }

    public xb(sf $$0) {
        this.a = $$0.b(a.class);
        this.d = aml.a($$0);
        this.b = $$0.a(sf::t);
        this.c = this.a == xb$a.a ? $$0.a(sf::t) : ImmutableList.of();
    }

    @Override
    public void a(sf $$0) {
        $$0.a(this.a);
        this.d.b($$0);
        $$0.a(this.b, sf::a);
        if (this.a == xb$a.a) {
            $$0.a(this.c, sf::a);
        }
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    public List<acq> a() {
        return this.b;
    }

    public List<acq> c() {
        return this.c;
    }

    public aml d() {
        return this.d;
    }

    public a e() {
        return this.a;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = xb$a.a();
        }
    }
}

