/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.jetbrains.annotations.Contract
 */
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public final class cmj
extends Enum<cmj>
implements apr {
    public static final /* enum */ cmj a = new cmj(0, "survival");
    public static final /* enum */ cmj b = new cmj(1, "creative");
    public static final /* enum */ cmj c = new cmj(2, "adventure");
    public static final /* enum */ cmj d = new cmj(3, "spectator");
    public static final cmj e;
    public static final apr.a<cmj> f;
    private static final IntFunction<cmj> g;
    private static final int h = -1;
    private final int i;
    private final String j;
    private final sw k;
    private final sw l;
    private static final /* synthetic */ cmj[] m;

    public static cmj[] values() {
        return (cmj[])m.clone();
    }

    public static cmj valueOf(String $$0) {
        return Enum.valueOf(cmj.class, $$0);
    }

    private cmj(int $$0, String $$1) {
        this.i = $$0;
        this.j = $$1;
        this.k = sw.c("selectWorld.gameMode." + $$1);
        this.l = sw.c("gameMode." + $$1);
    }

    public int a() {
        return this.i;
    }

    public String b() {
        return this.j;
    }

    @Override
    public String c() {
        return this.j;
    }

    public sw d() {
        return this.l;
    }

    public sw e() {
        return this.k;
    }

    public void a(byl $$0) {
        if (this == b) {
            $$0.c = true;
            $$0.d = true;
            $$0.a = true;
        } else if (this == d) {
            $$0.c = true;
            $$0.d = false;
            $$0.a = true;
            $$0.b = true;
        } else {
            $$0.c = false;
            $$0.d = false;
            $$0.a = false;
            $$0.b = false;
        }
        $$0.e = !this.f();
    }

    public boolean f() {
        return this == c || this == d;
    }

    public boolean g() {
        return this == b;
    }

    public boolean h() {
        return this == a || this == c;
    }

    public static cmj a(int $$0) {
        return g.apply($$0);
    }

    public static cmj a(String $$0) {
        return cmj.a($$0, a);
    }

    @Nullable
    @Contract(value="_,!null->!null;_,null->_")
    public static cmj a(String $$0, @Nullable cmj $$1) {
        cmj $$2 = f.a($$0);
        return $$2 != null ? $$2 : $$1;
    }

    public static int a(@Nullable cmj $$0) {
        return $$0 != null ? $$0.i : -1;
    }

    @Nullable
    public static cmj b(int $$0) {
        if ($$0 == -1) {
            return null;
        }
        return cmj.a($$0);
    }

    private static /* synthetic */ cmj[] i() {
        return new cmj[]{a, b, c, d};
    }

    static {
        m = cmj.i();
        e = a;
        f = apr.a(cmj::values);
        g = anu.a(cmj::a, cmj.values(), anu.a.a);
    }
}

