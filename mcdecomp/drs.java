/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  org.slf4j.Logger
 */
import com.google.common.base.MoreObjects;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class drs {
    private static final Logger b = LogUtils.getLogger();
    public static final Codec<drs> a = Codec.INT_STREAM.comapFlatMap($$02 -> ac.a($$02, 6).map($$0 -> new drs($$0[0], $$0[1], $$0[2], $$0[3], $$0[4], $$0[5])), $$0 -> IntStream.of($$0.c, $$0.d, $$0.e, $$0.f, $$0.g, $$0.h)).stable();
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public drs(gu $$0) {
        this($$0.u(), $$0.v(), $$0.w(), $$0.u(), $$0.v(), $$0.w());
    }

    public drs(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = $$5;
        if ($$3 < $$0 || $$4 < $$1 || $$5 < $$2) {
            String $$6 = "Invalid bounding box data, inverted bounds for: " + this;
            if (aa.aS) {
                throw new IllegalStateException($$6);
            }
            b.error($$6);
            this.c = Math.min($$0, $$3);
            this.d = Math.min($$1, $$4);
            this.e = Math.min($$2, $$5);
            this.f = Math.max($$0, $$3);
            this.g = Math.max($$1, $$4);
            this.h = Math.max($$2, $$5);
        }
    }

    public static drs a(hz $$0, hz $$1) {
        return new drs(Math.min($$0.u(), $$1.u()), Math.min($$0.v(), $$1.v()), Math.min($$0.w(), $$1.w()), Math.max($$0.u(), $$1.u()), Math.max($$0.v(), $$1.v()), Math.max($$0.w(), $$1.w()));
    }

    public static drs a() {
        return new drs(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public static drs a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, ha $$9) {
        switch ($$9) {
            default: {
                return new drs($$0 + $$3, $$1 + $$4, $$2 + $$5, $$0 + $$6 - 1 + $$3, $$1 + $$7 - 1 + $$4, $$2 + $$8 - 1 + $$5);
            }
            case c: {
                return new drs($$0 + $$3, $$1 + $$4, $$2 - $$8 + 1 + $$5, $$0 + $$6 - 1 + $$3, $$1 + $$7 - 1 + $$4, $$2 + $$5);
            }
            case e: {
                return new drs($$0 - $$8 + 1 + $$5, $$1 + $$4, $$2 + $$3, $$0 + $$5, $$1 + $$7 - 1 + $$4, $$2 + $$6 - 1 + $$3);
            }
            case f: 
        }
        return new drs($$0 + $$5, $$1 + $$4, $$2 + $$3, $$0 + $$8 - 1 + $$5, $$1 + $$7 - 1 + $$4, $$2 + $$6 - 1 + $$3);
    }

    public boolean a(drs $$0) {
        return this.f >= $$0.c && this.c <= $$0.f && this.h >= $$0.e && this.e <= $$0.h && this.g >= $$0.d && this.d <= $$0.g;
    }

    public boolean a(int $$0, int $$1, int $$2, int $$3) {
        return this.f >= $$0 && this.c <= $$2 && this.h >= $$1 && this.e <= $$3;
    }

    public static Optional<drs> a(Iterable<gu> $$0) {
        Iterator<gu> $$1 = $$0.iterator();
        if (!$$1.hasNext()) {
            return Optional.empty();
        }
        drs $$2 = new drs($$1.next());
        $$1.forEachRemaining($$2::a);
        return Optional.of($$2);
    }

    public static Optional<drs> b(Iterable<drs> $$0) {
        Iterator<drs> $$1 = $$0.iterator();
        if (!$$1.hasNext()) {
            return Optional.empty();
        }
        drs $$2 = $$1.next();
        drs $$3 = new drs($$2.c, $$2.d, $$2.e, $$2.f, $$2.g, $$2.h);
        $$1.forEachRemaining($$3::b);
        return Optional.of($$3);
    }

    @Deprecated
    public drs b(drs $$0) {
        this.c = Math.min(this.c, $$0.c);
        this.d = Math.min(this.d, $$0.d);
        this.e = Math.min(this.e, $$0.e);
        this.f = Math.max(this.f, $$0.f);
        this.g = Math.max(this.g, $$0.g);
        this.h = Math.max(this.h, $$0.h);
        return this;
    }

    @Deprecated
    public drs a(gu $$0) {
        this.c = Math.min(this.c, $$0.u());
        this.d = Math.min(this.d, $$0.v());
        this.e = Math.min(this.e, $$0.w());
        this.f = Math.max(this.f, $$0.u());
        this.g = Math.max(this.g, $$0.v());
        this.h = Math.max(this.h, $$0.w());
        return this;
    }

    @Deprecated
    public drs a(int $$0, int $$1, int $$2) {
        this.c += $$0;
        this.d += $$1;
        this.e += $$2;
        this.f += $$0;
        this.g += $$1;
        this.h += $$2;
        return this;
    }

    @Deprecated
    public drs a(hz $$0) {
        return this.a($$0.u(), $$0.v(), $$0.w());
    }

    public drs b(int $$0, int $$1, int $$2) {
        return new drs(this.c + $$0, this.d + $$1, this.e + $$2, this.f + $$0, this.g + $$1, this.h + $$2);
    }

    public drs a(int $$0) {
        return new drs(this.g() - $$0, this.h() - $$0, this.i() - $$0, this.j() + $$0, this.k() + $$0, this.l() + $$0);
    }

    public boolean b(hz $$0) {
        return this.c($$0.u(), $$0.v(), $$0.w());
    }

    public boolean c(int $$0, int $$1, int $$2) {
        return $$0 >= this.c && $$0 <= this.f && $$2 >= this.e && $$2 <= this.h && $$1 >= this.d && $$1 <= this.g;
    }

    public hz b() {
        return new hz(this.f - this.c, this.g - this.d, this.h - this.e);
    }

    public int c() {
        return this.f - this.c + 1;
    }

    public int d() {
        return this.g - this.d + 1;
    }

    public int e() {
        return this.h - this.e + 1;
    }

    public gu f() {
        return new gu(this.c + (this.f - this.c + 1) / 2, this.d + (this.g - this.d + 1) / 2, this.e + (this.h - this.e + 1) / 2);
    }

    public void a(Consumer<gu> $$0) {
        gu.a $$1 = new gu.a();
        $$0.accept($$1.d(this.f, this.g, this.h));
        $$0.accept($$1.d(this.c, this.g, this.h));
        $$0.accept($$1.d(this.f, this.d, this.h));
        $$0.accept($$1.d(this.c, this.d, this.h));
        $$0.accept($$1.d(this.f, this.g, this.e));
        $$0.accept($$1.d(this.c, this.g, this.e));
        $$0.accept($$1.d(this.f, this.d, this.e));
        $$0.accept($$1.d(this.c, this.d, this.e));
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("minX", this.c).add("minY", this.d).add("minZ", this.e).add("maxX", this.f).add("maxY", this.g).add("maxZ", this.h).toString();
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof drs) {
            drs $$1 = (drs)$$0;
            return this.c == $$1.c && this.d == $$1.d && this.e == $$1.e && this.f == $$1.f && this.g == $$1.g && this.h == $$1.h;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.d;
    }

    public int i() {
        return this.e;
    }

    public int j() {
        return this.f;
    }

    public int k() {
        return this.g;
    }

    public int l() {
        return this.h;
    }
}

