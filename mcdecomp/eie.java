/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.IntConsumer
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.mutable.MutableInt
 *  org.joml.Vector3f
 *  org.lwjgl.system.MemoryUtil
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntConsumer;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableInt;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class eie
extends eii
implements eig {
    private static final int f = 0x200000;
    private static final Logger g = LogUtils.getLogger();
    private ByteBuffer h;
    private int i;
    private int j;
    private int k;
    private int l;
    @Nullable
    private eip m;
    private int n;
    private eio o;
    private eio.b p;
    private boolean q;
    private boolean r;
    private boolean s;
    @Nullable
    private Vector3f[] t;
    @Nullable
    private eir u;
    private boolean v;

    public eie(int $$0) {
        this.h = ehh.a($$0 * 6);
    }

    private void l() {
        this.d(this.o.b());
    }

    private void d(int $$0) {
        if (this.k + $$0 <= this.h.capacity()) {
            return;
        }
        int $$1 = this.h.capacity();
        int $$2 = $$1 + eie.e($$0);
        g.debug("Needed to grow BufferBuilder buffer: Old size {} bytes, new size {} bytes.", (Object)$$1, (Object)$$2);
        ByteBuffer $$3 = ehh.a(this.h, $$2);
        $$3.rewind();
        this.h = $$3;
    }

    private static int e(int $$0) {
        int $$2;
        int $$1 = 0x200000;
        if ($$0 == 0) {
            return $$1;
        }
        if ($$0 < 0) {
            $$1 *= -1;
        }
        if (($$2 = $$0 % $$1) == 0) {
            return $$0;
        }
        return $$0 + $$1 - $$2;
    }

    public void a(eir $$0) {
        if (this.p != eio.b.h) {
            return;
        }
        this.u = $$0;
        if (this.t == null) {
            this.t = this.m();
        }
    }

    public c a() {
        return new c(this.p, this.l, this.t, this.u);
    }

    public void a(c $$0) {
        this.h.rewind();
        this.p = $$0.a;
        this.l = $$0.b;
        this.k = this.j;
        this.t = $$0.c;
        this.u = $$0.d;
        this.v = true;
    }

    public void a(eio.b $$0, eio $$1) {
        if (this.s) {
            throw new IllegalStateException("Already building!");
        }
        this.s = true;
        this.p = $$0;
        this.a($$1);
        this.m = (eip)$$1.c().get(0);
        this.n = 0;
        this.h.rewind();
    }

    private void a(eio $$0) {
        if (this.o == $$0) {
            return;
        }
        this.o = $$0;
        boolean $$1 = $$0 == eih.k;
        boolean $$2 = $$0 == eih.j;
        this.q = $$1 || $$2;
        this.r = $$1;
    }

    private IntConsumer a(int $$0, eio.a $$12) {
        MutableInt $$2 = new MutableInt($$0);
        return switch ($$12) {
            default -> throw new IncompatibleClassChangeError();
            case eio.a.a -> $$1 -> this.h.putShort($$2.getAndAdd(2), (short)$$1);
            case eio.a.b -> $$1 -> this.h.putInt($$2.getAndAdd(4), $$1);
        };
    }

    private Vector3f[] m() {
        FloatBuffer $$0 = this.h.asFloatBuffer();
        int $$1 = this.j / 4;
        int $$2 = this.o.a();
        int $$3 = $$2 * this.p.k;
        int $$4 = this.l / this.p.k;
        Vector3f[] $$5 = new Vector3f[$$4];
        for (int $$6 = 0; $$6 < $$4; ++$$6) {
            float $$7 = $$0.get($$1 + $$6 * $$3 + 0);
            float $$8 = $$0.get($$1 + $$6 * $$3 + 1);
            float $$9 = $$0.get($$1 + $$6 * $$3 + 2);
            float $$10 = $$0.get($$1 + $$6 * $$3 + $$2 * 2 + 0);
            float $$11 = $$0.get($$1 + $$6 * $$3 + $$2 * 2 + 1);
            float $$12 = $$0.get($$1 + $$6 * $$3 + $$2 * 2 + 2);
            float $$13 = ($$7 + $$10) / 2.0f;
            float $$14 = ($$8 + $$11) / 2.0f;
            float $$15 = ($$9 + $$12) / 2.0f;
            $$5[$$6] = new Vector3f($$13, $$14, $$15);
        }
        return $$5;
    }

    private void a(eio.a $$0) {
        if (this.t == null || this.u == null) {
            throw new IllegalStateException("Sorting state uninitialized");
        }
        int[] $$1 = this.u.sort(this.t);
        IntConsumer $$2 = this.a(this.k, $$0);
        for (int $$3 : $$1) {
            $$2.accept($$3 * this.p.k + 0);
            $$2.accept($$3 * this.p.k + 1);
            $$2.accept($$3 * this.p.k + 2);
            $$2.accept($$3 * this.p.k + 2);
            $$2.accept($$3 * this.p.k + 3);
            $$2.accept($$3 * this.p.k + 0);
        }
    }

    public boolean b() {
        return this.l == 0;
    }

    @Nullable
    public b c() {
        this.n();
        if (this.b()) {
            this.p();
            return null;
        }
        b $$0 = this.o();
        this.p();
        return $$0;
    }

    public b d() {
        this.n();
        b $$0 = this.o();
        this.p();
        return $$0;
    }

    private void n() {
        if (!this.s) {
            throw new IllegalStateException("Not building!");
        }
    }

    private b o() {
        int $$7;
        boolean $$6;
        int $$0 = this.p.a(this.l);
        int $$1 = !this.v ? this.l * this.o.b() : 0;
        eio.a $$2 = eio.a.a($$0);
        if (this.t != null) {
            int $$3 = apa.d($$0 * $$2.d, 4);
            this.d($$3);
            this.a($$2);
            boolean $$4 = false;
            this.k += $$3;
            int $$5 = $$1 + $$3;
        } else {
            $$6 = true;
            $$7 = $$1;
        }
        int $$8 = this.j;
        this.j += $$7;
        ++this.i;
        a $$9 = new a(this.o, this.l, $$0, this.p, $$2, this.v, $$6);
        return new b($$8, $$9);
    }

    private void p() {
        this.s = false;
        this.l = 0;
        this.m = null;
        this.n = 0;
        this.t = null;
        this.u = null;
        this.v = false;
    }

    @Override
    public void a(int $$0, byte $$1) {
        this.h.put(this.k + $$0, $$1);
    }

    @Override
    public void a(int $$0, short $$1) {
        this.h.putShort(this.k + $$0, $$1);
    }

    @Override
    public void a(int $$0, float $$1) {
        this.h.putFloat(this.k + $$0, $$1);
    }

    @Override
    public void e() {
        if (this.n != 0) {
            throw new IllegalStateException("Not filled all elements of the vertex");
        }
        ++this.l;
        this.l();
        if (this.p == eio.b.a || this.p == eio.b.b) {
            int $$0 = this.o.b();
            this.h.put(this.k, this.h, this.k - $$0, $$0);
            this.k += $$0;
            ++this.l;
            this.l();
        }
    }

    @Override
    public void f() {
        eip $$1;
        ImmutableList<eip> $$0 = this.o.c();
        this.n = (this.n + 1) % $$0.size();
        this.k += this.m.e();
        this.m = $$1 = (eip)$$0.get(this.n);
        if ($$1.b() == eip.b.e) {
            this.f();
        }
        if (this.a && this.m.b() == eip.b.c) {
            eig.super.a(this.b, this.c, this.d, this.e);
        }
    }

    @Override
    public ein a(int $$0, int $$1, int $$2, int $$3) {
        if (this.a) {
            throw new IllegalStateException();
        }
        return eig.super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, int $$9, int $$10, float $$11, float $$12, float $$13) {
        if (this.a) {
            throw new IllegalStateException();
        }
        if (this.q) {
            int $$15;
            this.a(0, $$0);
            this.a(4, $$1);
            this.a(8, $$2);
            this.a(12, (byte)($$3 * 255.0f));
            this.a(13, (byte)($$4 * 255.0f));
            this.a(14, (byte)($$5 * 255.0f));
            this.a(15, (byte)($$6 * 255.0f));
            this.a(16, $$7);
            this.a(20, $$8);
            if (this.r) {
                this.a(24, (short)($$9 & 0xFFFF));
                this.a(26, (short)($$9 >> 16 & 0xFFFF));
                int $$14 = 28;
            } else {
                $$15 = 24;
            }
            this.a($$15 + 0, (short)($$10 & 0xFFFF));
            this.a($$15 + 2, (short)($$10 >> 16 & 0xFFFF));
            this.a($$15 + 4, eig.a($$11));
            this.a($$15 + 5, eig.a($$12));
            this.a($$15 + 6, eig.a($$13));
            this.k += $$15 + 8;
            this.e();
            return;
        }
        super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12, $$13);
    }

    void q() {
        if (this.i > 0 && --this.i == 0) {
            this.g();
        }
    }

    public void g() {
        if (this.i > 0) {
            g.warn("Clearing BufferBuilder with unused batches");
        }
        this.h();
    }

    public void h() {
        this.i = 0;
        this.j = 0;
        this.k = 0;
    }

    @Override
    public eip i() {
        if (this.m == null) {
            throw new IllegalStateException("BufferBuilder not started");
        }
        return this.m;
    }

    public boolean j() {
        return this.s;
    }

    ByteBuffer c(int $$0, int $$1) {
        return MemoryUtil.memSlice((ByteBuffer)this.h, (int)$$0, (int)($$1 - $$0));
    }

    public static class c {
        final eio.b a;
        final int b;
        @Nullable
        final Vector3f[] c;
        @Nullable
        final eir d;

        c(eio.b $$0, int $$1, @Nullable Vector3f[] $$2, @Nullable eir $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }
    }

    public class b {
        private final int b;
        private final a c;
        private boolean d;

        b(int $$1, a $$2) {
            this.b = $$1;
            this.c = $$2;
        }

        public ByteBuffer a() {
            int $$0 = this.b + this.c.b();
            int $$1 = this.b + this.c.c();
            return eie.this.c($$0, $$1);
        }

        public ByteBuffer b() {
            int $$0 = this.b + this.c.d();
            int $$1 = this.b + this.c.e();
            return eie.this.c($$0, $$1);
        }

        public a c() {
            return this.c;
        }

        public boolean d() {
            return this.c.b == 0;
        }

        public void e() {
            if (this.d) {
                throw new IllegalStateException("Buffer has already been released!");
            }
            eie.this.q();
            this.d = true;
        }
    }

    public static final class a
    extends Record {
        private final eio a;
        final int b;
        private final int c;
        private final eio.b d;
        private final eio.a e;
        private final boolean f;
        private final boolean g;

        public a(eio $$0, int $$1, int $$2, eio.b $$3, eio.a $$4, boolean $$5, boolean $$6) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
        }

        public int a() {
            return this.b * this.a.b();
        }

        public int b() {
            return 0;
        }

        public int c() {
            return this.a();
        }

        public int d() {
            return this.f ? 0 : this.c();
        }

        public int e() {
            return this.d() + this.n();
        }

        private int n() {
            return this.g ? 0 : this.c * this.e.d;
        }

        public int f() {
            return this.e();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "format;vertexCount;indexCount;mode;indexType;indexOnly;sequentialIndex", "a", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "format;vertexCount;indexCount;mode;indexType;indexOnly;sequentialIndex", "a", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "format;vertexCount;indexCount;mode;indexType;indexOnly;sequentialIndex", "a", "b", "c", "d", "e", "f", "g"}, this, $$0);
        }

        public eio g() {
            return this.a;
        }

        public int h() {
            return this.b;
        }

        public int i() {
            return this.c;
        }

        public eio.b j() {
            return this.d;
        }

        public eio.a k() {
            return this.e;
        }

        public boolean l() {
            return this.f;
        }

        public boolean m() {
            return this.g;
        }
    }
}

