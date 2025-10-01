/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.UnaryOperator;

public interface akj {
    public static final UnaryOperator<sw> a = UnaryOperator.identity();
    public static final akj b = akj.a(a, true);
    public static final akj c = akj.a(akj.a("pack.source.builtin"), true);
    public static final akj d = akj.a(akj.a("pack.source.feature"), false);
    public static final akj e = akj.a(akj.a("pack.source.world"), true);
    public static final akj f = akj.a(akj.a("pack.source.server"), true);

    public sw a(sw var1);

    public boolean a();

    public static akj a(final UnaryOperator<sw> $$0, final boolean $$1) {
        return new akj(){

            @Override
            public sw a(sw $$02) {
                return (sw)$$0.apply($$02);
            }

            @Override
            public boolean a() {
                return $$1;
            }
        };
    }

    private static UnaryOperator<sw> a(String $$0) {
        tj $$12 = sw.c($$0);
        return $$1 -> sw.a("pack.nameAndSource", $$1, $$12).a(n.h);
    }
}

