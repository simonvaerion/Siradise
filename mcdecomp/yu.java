/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class yu
implements uo<ur> {
    private final int a;
    private final List<a> b;

    public yu(int $$0, Collection<bhc> $$1) {
        this.a = $$0;
        this.b = Lists.newArrayList();
        for (bhc $$2 : $$1) {
            this.b.add(new a($$2.a(), $$2.b(), $$2.c()));
        }
    }

    public yu(sf $$0) {
        this.a = $$0.m();
        this.b = $$0.a($$02 -> {
            acq $$1 = $$02.t();
            bhb $$2 = jb.v.a($$1);
            double $$3 = $$02.readDouble();
            List<bhe> $$4 = $$02.a($$0 -> new bhe($$0.o(), "Unknown synced attribute modifier", $$0.readDouble(), bhe.a.a($$0.readByte())));
            return new a($$2, $$3, $$4);
        });
    }

    @Override
    public void a(sf $$0) {
        $$0.d(this.a);
        $$0.a(this.b, ($$02, $$12) -> {
            $$02.a(jb.v.b($$12.a()));
            $$02.writeDouble($$12.b());
            $$02.a($$12.c(), ($$0, $$1) -> {
                $$0.a($$1.a());
                $$0.writeDouble($$1.d());
                $$0.writeByte($$1.c().a());
            });
        });
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    public int a() {
        return this.a;
    }

    public List<a> c() {
        return this.b;
    }

    public static class a {
        private final bhb a;
        private final double b;
        private final Collection<bhe> c;

        public a(bhb $$0, double $$1, Collection<bhe> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public bhb a() {
            return this.a;
        }

        public double b() {
            return this.b;
        }

        public Collection<bhe> c() {
            return this.c;
        }
    }
}

