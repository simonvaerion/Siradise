/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class qz
extends re {
    private static final int b = 16;
    public static final rm<qz> a = new rm.a<qz>(){

        public qz a(DataInput $$0, int $$1, ra $$2) throws IOException {
            $$2.a(16L);
            return qz.a($$0.readLong());
        }

        @Override
        public rh.b a(DataInput $$0, rh $$1) throws IOException {
            return $$1.a($$0.readLong());
        }

        @Override
        public int c() {
            return 8;
        }

        @Override
        public String a() {
            return "LONG";
        }

        @Override
        public String b() {
            return "TAG_Long";
        }

        @Override
        public boolean d() {
            return true;
        }

        @Override
        public /* synthetic */ rk b(DataInput dataInput, int n2, ra ra2) throws IOException {
            return this.a(dataInput, n2, ra2);
        }
    };
    private final long c;

    qz(long $$0) {
        this.c = $$0;
    }

    public static qz a(long $$0) {
        if ($$0 >= -128L && $$0 <= 1024L) {
            return qz$a.a[(int)$$0 - -128];
        }
        return new qz($$0);
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
        $$0.writeLong(this.c);
    }

    @Override
    public int a() {
        return 16;
    }

    @Override
    public byte b() {
        return 4;
    }

    public rm<qz> c() {
        return a;
    }

    public qz e() {
        return this;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        return $$0 instanceof qz && this.c == ((qz)$$0).c;
    }

    public int hashCode() {
        return (int)(this.c ^ this.c >>> 32);
    }

    @Override
    public void a(ro $$0) {
        $$0.a(this);
    }

    @Override
    public long f() {
        return this.c;
    }

    @Override
    public int g() {
        return (int)(this.c & 0xFFFFFFFFFFFFFFFFL);
    }

    @Override
    public short h() {
        return (short)(this.c & 0xFFFFL);
    }

    @Override
    public byte i() {
        return (byte)(this.c & 0xFFL);
    }

    @Override
    public double j() {
        return this.c;
    }

    @Override
    public float k() {
        return this.c;
    }

    @Override
    public Number l() {
        return this.c;
    }

    @Override
    public rh.b a(rh $$0) {
        return $$0.a(this.c);
    }

    @Override
    public /* synthetic */ rk d() {
        return this.e();
    }

    static class a {
        private static final int b = 1024;
        private static final int c = -128;
        static final qz[] a = new qz[1153];

        private a() {
        }

        static {
            for (int $$0 = 0; $$0 < a.length; ++$$0) {
                qz$a.a[$$0] = new qz(-128 + $$0);
            }
        }
    }
}

