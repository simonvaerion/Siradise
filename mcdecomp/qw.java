/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class qw
extends re {
    private static final int b = 12;
    public static final rm<qw> a = new rm.a<qw>(){

        public qw a(DataInput $$0, int $$1, ra $$2) throws IOException {
            $$2.a(12L);
            return qw.a($$0.readInt());
        }

        @Override
        public rh.b a(DataInput $$0, rh $$1) throws IOException {
            return $$1.a($$0.readInt());
        }

        @Override
        public int c() {
            return 4;
        }

        @Override
        public String a() {
            return "INT";
        }

        @Override
        public String b() {
            return "TAG_Int";
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
    private final int c;

    qw(int $$0) {
        this.c = $$0;
    }

    public static qw a(int $$0) {
        if ($$0 >= -128 && $$0 <= 1024) {
            return qw$a.a[$$0 - -128];
        }
        return new qw($$0);
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
        $$0.writeInt(this.c);
    }

    @Override
    public int a() {
        return 12;
    }

    @Override
    public byte b() {
        return 3;
    }

    public rm<qw> c() {
        return a;
    }

    public qw e() {
        return this;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        return $$0 instanceof qw && this.c == ((qw)$$0).c;
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
        return (short)(this.c & 0xFFFF);
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
        static final qw[] a = new qw[1153];

        private a() {
        }

        static {
            for (int $$0 = 0; $$0 < a.length; ++$$0) {
                qw$a.a[$$0] = new qw(-128 + $$0);
            }
        }
    }
}

