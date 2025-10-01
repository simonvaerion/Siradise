/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;

public class eaj
extends dzy {
    eaj(eaf[] $$0, eck[] $$1) {
        super($$0, $$1);
    }

    @Override
    public eag a() {
        return ead.g;
    }

    @Override
    protected dzx a(dzx[] $$0) {
        switch ($$0.length) {
            case 0: {
                return b;
            }
            case 1: {
                return $$0[0];
            }
            case 2: {
                return $$0[0].and($$0[1]);
            }
        }
        return ($$1, $$2) -> {
            for (dzx $$3 : $$0) {
                if ($$3.expand($$1, $$2)) continue;
                return false;
            }
            return true;
        };
    }

    public static a a(eaf.a<?> ... $$0) {
        return new a($$0);
    }

    public static class a
    extends eaf.a<a> {
        private final List<eaf> a = Lists.newArrayList();

        public a(eaf.a<?> ... $$0) {
            for (eaf.a<?> $$1 : $$0) {
                this.a.add($$1.b());
            }
        }

        protected a a() {
            return this;
        }

        @Override
        public a c(eaf.a<?> $$0) {
            this.a.add($$0.b());
            return this;
        }

        @Override
        public eaf b() {
            return new eaj(this.a.toArray(new eaf[0]), this.f());
        }

        @Override
        protected /* synthetic */ eaf.a at_() {
            return this.a();
        }
    }
}

