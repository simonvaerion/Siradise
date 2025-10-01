/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class qp
extends re {
    private static final int w = 9;
    public static final rm<qp> a = new rm.a<qp>(){

        public qp a(DataInput $$0, int $$1, ra $$2) throws IOException {
            $$2.a(9L);
            return qp.a($$0.readByte());
        }

        @Override
        public rh.b a(DataInput $$0, rh $$1) throws IOException {
            return $$1.a($$0.readByte());
        }

        @Override
        public int c() {
            return 1;
        }

        @Override
        public String a() {
            return "BYTE";
        }

        @Override
        public String b() {
            return "TAG_Byte";
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
    public static final qp b = qp.a((byte)0);
    public static final qp c = qp.a((byte)1);
    private final byte x;

    qp(byte $$0) {
        this.x = $$0;
    }

    public static qp a(byte $$0) {
        return qp$a.a[128 + $$0];
    }

    public static qp a(boolean $$0) {
        return $$0 ? c : b;
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
        $$0.writeByte(this.x);
    }

    @Override
    public int a() {
        return 9;
    }

    @Override
    public byte b() {
        return 1;
    }

    public rm<qp> c() {
        return a;
    }

    public qp e() {
        return this;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        return $$0 instanceof qp && this.x == ((qp)$$0).x;
    }

    public int hashCode() {
        return this.x;
    }

    @Override
    public void a(ro $$0) {
        $$0.a(this);
    }

    @Override
    public long f() {
        return this.x;
    }

    @Override
    public int g() {
        return this.x;
    }

    @Override
    public short h() {
        return this.x;
    }

    @Override
    public byte i() {
        return this.x;
    }

    @Override
    public double j() {
        return this.x;
    }

    @Override
    public float k() {
        return this.x;
    }

    @Override
    public Number l() {
        return this.x;
    }

    @Override
    public rh.b a(rh $$0) {
        return $$0.a(this.x);
    }

    @Override
    public /* synthetic */ rk d() {
        return this.e();
    }

    static class a {
        static final qp[] a = new qp[256];

        private a() {
        }

        static {
            for (int $$0 = 0; $$0 < a.length; ++$$0) {
                qp$a.a[$$0] = new qp((byte)($$0 - 128));
            }
        }
    }
}

