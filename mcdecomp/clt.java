/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public class clt {
    private static final int g = 1056;
    public static final long a = clt.c(1875066, 1875066);
    public static final clt b = new clt(0, 0);
    private static final long h = 32L;
    private static final long i = 0xFFFFFFFFL;
    private static final int j = 5;
    public static final int c = 32;
    private static final int k = 31;
    public static final int d = 31;
    public final int e;
    public final int f;
    private static final int l = 1664525;
    private static final int m = 1013904223;
    private static final int n = -559038737;

    public clt(int $$0, int $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    public clt(gu $$0) {
        this.e = hx.a($$0.u());
        this.f = hx.a($$0.w());
    }

    public clt(long $$0) {
        this.e = (int)$$0;
        this.f = (int)($$0 >> 32);
    }

    public static clt a(int $$0, int $$1) {
        return new clt($$0 << 5, $$1 << 5);
    }

    public static clt b(int $$0, int $$1) {
        return new clt(($$0 << 5) + 31, ($$1 << 5) + 31);
    }

    public long a() {
        return clt.c(this.e, this.f);
    }

    public static long c(int $$0, int $$1) {
        return (long)$$0 & 0xFFFFFFFFL | ((long)$$1 & 0xFFFFFFFFL) << 32;
    }

    public static long a(gu $$0) {
        return clt.c(hx.a($$0.u()), hx.a($$0.w()));
    }

    public static int a(long $$0) {
        return (int)($$0 & 0xFFFFFFFFL);
    }

    public static int b(long $$0) {
        return (int)($$0 >>> 32 & 0xFFFFFFFFL);
    }

    public int hashCode() {
        return clt.d(this.e, this.f);
    }

    public static int d(int $$0, int $$1) {
        int $$2 = 1664525 * $$0 + 1013904223;
        int $$3 = 1664525 * ($$1 ^ 0xDEADBEEF) + 1013904223;
        return $$2 ^ $$3;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof clt) {
            clt $$1 = (clt)$$0;
            return this.e == $$1.e && this.f == $$1.f;
        }
        return false;
    }

    public int b() {
        return this.a(8);
    }

    public int c() {
        return this.b(8);
    }

    public int d() {
        return hx.c(this.e);
    }

    public int e() {
        return hx.c(this.f);
    }

    public int f() {
        return this.a(15);
    }

    public int g() {
        return this.b(15);
    }

    public int h() {
        return this.e >> 5;
    }

    public int i() {
        return this.f >> 5;
    }

    public int j() {
        return this.e & 0x1F;
    }

    public int k() {
        return this.f & 0x1F;
    }

    public gu a(int $$0, int $$1, int $$2) {
        return new gu(this.a($$0), $$1, this.b($$2));
    }

    public int a(int $$0) {
        return hx.a(this.e, $$0);
    }

    public int b(int $$0) {
        return hx.a(this.f, $$0);
    }

    public gu c(int $$0) {
        return new gu(this.b(), $$0, this.c());
    }

    public String toString() {
        return "[" + this.e + ", " + this.f + "]";
    }

    public gu l() {
        return new gu(this.d(), 0, this.e());
    }

    public int a(clt $$0) {
        return Math.max(Math.abs(this.e - $$0.e), Math.abs(this.f - $$0.f));
    }

    public static Stream<clt> a(clt $$0, int $$1) {
        return clt.a(new clt($$0.e - $$1, $$0.f - $$1), new clt($$0.e + $$1, $$0.f + $$1));
    }

    public static Stream<clt> a(final clt $$0, final clt $$1) {
        int $$2 = Math.abs($$0.e - $$1.e) + 1;
        int $$3 = Math.abs($$0.f - $$1.f) + 1;
        final int $$4 = $$0.e < $$1.e ? 1 : -1;
        final int $$5 = $$0.f < $$1.f ? 1 : -1;
        return StreamSupport.stream(new Spliterators.AbstractSpliterator<clt>((long)($$2 * $$3), 64){
            @Nullable
            private clt e;

            @Override
            public boolean tryAdvance(Consumer<? super clt> $$02) {
                if (this.e == null) {
                    this.e = $$0;
                } else {
                    int $$12 = this.e.e;
                    int $$2 = this.e.f;
                    if ($$12 == $$1.e) {
                        if ($$2 == $$1.f) {
                            return false;
                        }
                        this.e = new clt($$0.e, $$2 + $$5);
                    } else {
                        this.e = new clt($$12 + $$4, $$2);
                    }
                }
                $$02.accept(this.e);
                return true;
            }
        }, false);
    }
}

