/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class qv
extends qq<qw> {
    private static final int b = 24;
    public static final rm<qv> a = new rm.b<qv>(){

        public qv a(DataInput $$0, int $$1, ra $$2) throws IOException {
            $$2.a(24L);
            int $$3 = $$0.readInt();
            $$2.a(4L * (long)$$3);
            int[] $$4 = new int[$$3];
            for (int $$5 = 0; $$5 < $$3; ++$$5) {
                $$4[$$5] = $$0.readInt();
            }
            return new qv($$4);
        }

        @Override
        public rh.b a(DataInput $$0, rh $$1) throws IOException {
            int $$2 = $$0.readInt();
            int[] $$3 = new int[$$2];
            for (int $$4 = 0; $$4 < $$2; ++$$4) {
                $$3[$$4] = $$0.readInt();
            }
            return $$1.a($$3);
        }

        @Override
        public void a(DataInput $$0) throws IOException {
            $$0.skipBytes($$0.readInt() * 4);
        }

        @Override
        public String a() {
            return "INT[]";
        }

        @Override
        public String b() {
            return "TAG_Int_Array";
        }

        @Override
        public /* synthetic */ rk b(DataInput dataInput, int n2, ra ra2) throws IOException {
            return this.a(dataInput, n2, ra2);
        }
    };
    private int[] c;

    public qv(int[] $$0) {
        this.c = $$0;
    }

    public qv(List<Integer> $$0) {
        this(qv.a($$0));
    }

    private static int[] a(List<Integer> $$0) {
        int[] $$1 = new int[$$0.size()];
        for (int $$2 = 0; $$2 < $$0.size(); ++$$2) {
            Integer $$3 = $$0.get($$2);
            $$1[$$2] = $$3 == null ? 0 : $$3;
        }
        return $$1;
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
        $$0.writeInt(this.c.length);
        for (int $$1 : this.c) {
            $$0.writeInt($$1);
        }
    }

    @Override
    public int a() {
        return 24 + 4 * this.c.length;
    }

    @Override
    public byte b() {
        return 11;
    }

    public rm<qv> c() {
        return a;
    }

    @Override
    public String toString() {
        return this.m_();
    }

    public qv e() {
        int[] $$0 = new int[this.c.length];
        System.arraycopy(this.c, 0, $$0, 0, this.c.length);
        return new qv($$0);
    }

    @Override
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        return $$0 instanceof qv && Arrays.equals(this.c, ((qv)$$0).c);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.c);
    }

    public int[] g() {
        return this.c;
    }

    @Override
    public void a(ro $$0) {
        $$0.a(this);
    }

    @Override
    public int size() {
        return this.c.length;
    }

    public qw a(int $$0) {
        return qw.a(this.c[$$0]);
    }

    public qw a(int $$0, qw $$1) {
        int $$2 = this.c[$$0];
        this.c[$$0] = $$1.g();
        return qw.a($$2);
    }

    public void b(int $$0, qw $$1) {
        this.c = ArrayUtils.add((int[])this.c, (int)$$0, (int)$$1.g());
    }

    @Override
    public boolean a(int $$0, rk $$1) {
        if ($$1 instanceof re) {
            this.c[$$0] = ((re)$$1).g();
            return true;
        }
        return false;
    }

    @Override
    public boolean b(int $$0, rk $$1) {
        if ($$1 instanceof re) {
            this.c = ArrayUtils.add((int[])this.c, (int)$$0, (int)((re)$$1).g());
            return true;
        }
        return false;
    }

    public qw b(int $$0) {
        int $$1 = this.c[$$0];
        this.c = ArrayUtils.remove((int[])this.c, (int)$$0);
        return qw.a($$1);
    }

    @Override
    public byte f() {
        return 3;
    }

    @Override
    public void clear() {
        this.c = new int[0];
    }

    @Override
    public rh.b a(rh $$0) {
        return $$0.a(this.c);
    }

    @Override
    public /* synthetic */ rk c(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ void c(int n2, rk rk2) {
        this.b(n2, (qw)rk2);
    }

    @Override
    public /* synthetic */ rk d(int n2, rk rk2) {
        return this.a(n2, (qw)rk2);
    }

    @Override
    public /* synthetic */ rk d() {
        return this.e();
    }

    @Override
    public /* synthetic */ Object remove(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ void add(int n2, Object object) {
        this.b(n2, (qw)object);
    }

    @Override
    public /* synthetic */ Object set(int n2, Object object) {
        return this.a(n2, (qw)object);
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }
}

