/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public interface ban {
    public static final String b = "root";

    public void a();

    public void b();

    public void a(String var1);

    public void a(Supplier<String> var1);

    public void c();

    public void b(String var1);

    public void b(Supplier<String> var1);

    public void a(bbr var1);

    default public void d(String $$0) {
        this.a($$0, 1);
    }

    public void a(String var1, int var2);

    default public void c(Supplier<String> $$0) {
        this.a($$0, 1);
    }

    public void a(Supplier<String> var1, int var2);

    public static ban a(final ban $$0, final ban $$1) {
        if ($$0 == bak.a) {
            return $$1;
        }
        if ($$1 == bak.a) {
            return $$0;
        }
        return new ban(){

            @Override
            public void a() {
                $$0.a();
                $$1.a();
            }

            @Override
            public void b() {
                $$0.b();
                $$1.b();
            }

            @Override
            public void a(String $$02) {
                $$0.a($$02);
                $$1.a($$02);
            }

            @Override
            public void a(Supplier<String> $$02) {
                $$0.a($$02);
                $$1.a($$02);
            }

            @Override
            public void a(bbr $$02) {
                $$0.a($$02);
                $$1.a($$02);
            }

            @Override
            public void c() {
                $$0.c();
                $$1.c();
            }

            @Override
            public void b(String $$02) {
                $$0.b($$02);
                $$1.b($$02);
            }

            @Override
            public void b(Supplier<String> $$02) {
                $$0.b($$02);
                $$1.b($$02);
            }

            @Override
            public void a(String $$02, int $$12) {
                $$0.a($$02, $$12);
                $$1.a($$02, $$12);
            }

            @Override
            public void a(Supplier<String> $$02, int $$12) {
                $$0.a($$02, $$12);
                $$1.a($$02, $$12);
            }
        };
    }
}

