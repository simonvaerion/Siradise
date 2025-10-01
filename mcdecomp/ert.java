/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;
import java.util.function.Supplier;

public final class ert
extends Enum<ert>
implements egl {
    public static final /* enum */ ert a = new ert(() -> ert.a(5, 8, ($$0, $$1) -> -1));
    public static final /* enum */ ert b = new ert(() -> {
        int $$02 = 5;
        int $$12 = 8;
        return ert.a(5, 8, ($$0, $$1) -> {
            boolean $$2 = $$0 == 0 || $$0 + 1 == 5 || $$1 == 0 || $$1 + 1 == 8;
            return $$2 ? -1 : 0;
        });
    });
    final ehk c;
    private static final /* synthetic */ ert[] d;

    public static ert[] values() {
        return (ert[])d.clone();
    }

    public static ert valueOf(String $$0) {
        return Enum.valueOf(ert.class, $$0);
    }

    private static ehk a(int $$0, int $$1, a $$2) {
        ehk $$3 = new ehk(ehk.a.a, $$0, $$1, false);
        for (int $$4 = 0; $$4 < $$1; ++$$4) {
            for (int $$5 = 0; $$5 < $$0; ++$$5) {
                $$3.a($$5, $$4, $$2.getColor($$5, $$4));
            }
        }
        $$3.i();
        return $$3;
    }

    private ert(Supplier<ehk> $$0) {
        this.c = $$0.get();
    }

    @Override
    public float getAdvance() {
        return this.c.a() + 1;
    }

    @Override
    public err bake(Function<egn, err> $$0) {
        return $$0.apply(new egn(){

            @Override
            public int a() {
                return ert.this.c.a();
            }

            @Override
            public int b() {
                return ert.this.c.b();
            }

            @Override
            public float d() {
                return 1.0f;
            }

            @Override
            public void a(int $$0, int $$1) {
                ert.this.c.a(0, $$0, $$1, false);
            }

            @Override
            public boolean c() {
                return true;
            }
        });
    }

    private static /* synthetic */ ert[] e() {
        return new ert[]{a, b};
    }

    static {
        d = ert.e();
    }

    @FunctionalInterface
    static interface a {
        public int getColor(int var1, int var2);
    }
}

