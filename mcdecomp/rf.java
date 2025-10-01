/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class rf
extends re {
    private static final int b = 10;
    public static final rm<rf> a = new rm.a<rf>(){

        public rf a(DataInput $$0, int $$1, ra $$2) throws IOException {
            $$2.a(10L);
            return rf.a($$0.readShort());
        }

        @Override
        public rh.b a(DataInput $$0, rh $$1) throws IOException {
            return $$1.a($$0.readShort());
        }

        @Override
        public int c() {
            return 2;
        }

        @Override
        public String a() {
            return "SHORT";
        }

        @Override
        public String b() {
            return "TAG_Short";
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
    private final short c;

    rf(short $$0) {
        this.c = $$0;
    }

    public static rf a(short $$0) {
        if ($$0 >= -128 && $$0 <= 1024) {
            return rf$a.a[$$0 - -128];
        }
        return new rf($$0);
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
        $$0.writeShort(this.c);
    }

    @Override
    public int a() {
        return 10;
    }

    @Override
    public byte b() {
        return 2;
    }

    public rm<rf> c() {
        return a;
    }

    public rf e() {
        return this;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        return $$0 instanceof rf && this.c == ((rf)$$0).c;
    }

    public int hashCode() {
        return this.c;
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
        return this.c;
    }

    @Override
    public short h() {
        return this.c;
    }

    @Override
    public byte i() {
        return (byte)(this.c & 0xFF);
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
        static final rf[] a = new rf[1153];

        private a() {
        }

        static {
            for (int $$0 = 0; $$0 < a.length; ++$$0) {
                rf$a.a[$$0] = new rf((short)(-128 + $$0));
            }
        }
    }
}

