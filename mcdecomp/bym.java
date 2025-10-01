/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.IntFunction;

public final class bym
extends Enum<bym>
implements apc {
    public static final /* enum */ bym a = new bym(0, "options.chat.visibility.full");
    public static final /* enum */ bym b = new bym(1, "options.chat.visibility.system");
    public static final /* enum */ bym c = new bym(2, "options.chat.visibility.hidden");
    private static final IntFunction<bym> d;
    private final int e;
    private final String f;
    private static final /* synthetic */ bym[] g;

    public static bym[] values() {
        return (bym[])g.clone();
    }

    public static bym valueOf(String $$0) {
        return Enum.valueOf(bym.class, $$0);
    }

    private bym(int $$0, String $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public int a() {
        return this.e;
    }

    @Override
    public String b() {
        return this.f;
    }

    public static bym a(int $$0) {
        return d.apply($$0);
    }

    private static /* synthetic */ bym[] d() {
        return new bym[]{a, b, c};
    }

    static {
        g = bym.d();
        d = anu.a(bym::a, bym.values(), anu.a.b);
    }
}

