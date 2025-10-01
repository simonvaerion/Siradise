/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

public interface epz {
    public static final epz a = new epz(){

        @Override
        public int a(eox $$0, int $$1, int $$2) {
            return $$2;
        }

        @Override
        public int a(eox $$0, int $$1, int $$2, int $$3, int $$4) {
            return $$2;
        }

        @Override
        public int b(eox $$0, int $$1, int $$2, int $$3, int $$4) {
            return $$2;
        }

        @Override
        public int c(eox $$0, int $$1, int $$2, int $$3, int $$4) {
            return $$2;
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        }

        @Override
        public int a() {
            return 0;
        }

        @Override
        public int b() {
            return 0;
        }
    };

    public static epz a(eov $$0, ta $$12, int $$2) {
        return epz.b($$0, (List)$$0.c($$12, $$2).stream().map($$1 -> new a((aom)$$1, $$0.a((aom)$$1))).collect(ImmutableList.toImmutableList()));
    }

    public static epz a(eov $$0, ta $$12, int $$2, int $$3) {
        return epz.b($$0, (List)$$0.c($$12, $$2).stream().limit($$3).map($$1 -> new a((aom)$$1, $$0.a((aom)$$1))).collect(ImmutableList.toImmutableList()));
    }

    public static epz a(eov $$0, sw ... $$12) {
        return epz.b($$0, (List)Arrays.stream($$12).map(sw::f).map($$1 -> new a((aom)$$1, $$0.a((aom)$$1))).collect(ImmutableList.toImmutableList()));
    }

    public static epz a(eov $$0, List<sw> $$12) {
        return epz.b($$0, (List)$$12.stream().map(sw::f).map($$1 -> new a((aom)$$1, $$0.a((aom)$$1))).collect(ImmutableList.toImmutableList()));
    }

    public static epz b(final eov $$0, final List<a> $$1) {
        if ($$1.isEmpty()) {
            return a;
        }
        return new epz(){
            private final int d;
            {
                this.d = $$1.stream().mapToInt($$0 -> $$02.b).max().orElse(0);
            }

            @Override
            public int a(eox $$02, int $$12, int $$2) {
                return this.a($$02, $$12, $$2, $$0.b, 0xFFFFFF);
            }

            @Override
            public int a(eox $$02, int $$12, int $$2, int $$3, int $$4) {
                int $$5 = $$2;
                for (a $$6 : $$1) {
                    $$02.b($$0, $$6.a, $$12 - $$6.b / 2, $$5, $$4);
                    $$5 += $$3;
                }
                return $$5;
            }

            @Override
            public int b(eox $$02, int $$12, int $$2, int $$3, int $$4) {
                int $$5 = $$2;
                for (a $$6 : $$1) {
                    $$02.b($$0, $$6.a, $$12, $$5, $$4);
                    $$5 += $$3;
                }
                return $$5;
            }

            @Override
            public int c(eox $$02, int $$12, int $$2, int $$3, int $$4) {
                int $$5 = $$2;
                for (a $$6 : $$1) {
                    $$02.a($$0, $$6.a, $$12, $$5, $$4, false);
                    $$5 += $$3;
                }
                return $$5;
            }

            @Override
            public void a(eox $$02, int $$12, int $$2, int $$3, int $$4, int $$5) {
                int $$6 = $$1.stream().mapToInt($$0 -> $$02.b).max().orElse(0);
                if ($$6 > 0) {
                    $$02.a($$12 - $$6 / 2 - $$4, $$2 - $$4, $$12 + $$6 / 2 + $$4, $$2 + $$1.size() * $$3 + $$4, $$5);
                }
            }

            @Override
            public int a() {
                return $$1.size();
            }

            @Override
            public int b() {
                return this.d;
            }
        };
    }

    public int a(eox var1, int var2, int var3);

    public int a(eox var1, int var2, int var3, int var4, int var5);

    public int b(eox var1, int var2, int var3, int var4, int var5);

    public int c(eox var1, int var2, int var3, int var4, int var5);

    public void a(eox var1, int var2, int var3, int var4, int var5, int var6);

    public int a();

    public int b();

    public static class a {
        final aom a;
        final int b;

        a(aom $$0, int $$1) {
            this.a = $$0;
            this.b = $$1;
        }
    }
}

