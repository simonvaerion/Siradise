/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public final class bdu
extends Enum<bdu>
implements apr {
    public static final /* enum */ bdu a = new bdu(0, "peaceful");
    public static final /* enum */ bdu b = new bdu(1, "easy");
    public static final /* enum */ bdu c = new bdu(2, "normal");
    public static final /* enum */ bdu d = new bdu(3, "hard");
    public static final apr.a<bdu> e;
    private static final IntFunction<bdu> f;
    private final int g;
    private final String h;
    private static final /* synthetic */ bdu[] i;

    public static bdu[] values() {
        return (bdu[])i.clone();
    }

    public static bdu valueOf(String $$0) {
        return Enum.valueOf(bdu.class, $$0);
    }

    private bdu(int $$0, String $$1) {
        this.g = $$0;
        this.h = $$1;
    }

    public int a() {
        return this.g;
    }

    public sw b() {
        return sw.c("options.difficulty." + this.h);
    }

    public sw d() {
        return sw.c("options.difficulty." + this.h + ".info");
    }

    public static bdu a(int $$0) {
        return f.apply($$0);
    }

    @Nullable
    public static bdu a(String $$0) {
        return e.a($$0);
    }

    public String e() {
        return this.h;
    }

    @Override
    public String c() {
        return this.h;
    }

    private static /* synthetic */ bdu[] f() {
        return new bdu[]{a, b, c, d};
    }

    static {
        i = bdu.f();
        e = apr.a(bdu::values);
        f = anu.a(bdu::a, bdu.values(), anu.a.b);
    }
}

