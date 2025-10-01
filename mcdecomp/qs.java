/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class qs
extends re {
    private static final int c = 16;
    public static final qs a = new qs(0.0);
    public static final rm<qs> b = new rm.a<qs>(){

        public qs a(DataInput $$0, int $$1, ra $$2) throws IOException {
            $$2.a(16L);
            return qs.a($$0.readDouble());
        }

        @Override
        public rh.b a(DataInput $$0, rh $$1) throws IOException {
            return $$1.a($$0.readDouble());
        }

        @Override
        public int c() {
            return 8;
        }

        @Override
        public String a() {
            return "DOUBLE";
        }

        @Override
        public String b() {
            return "TAG_Double";
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
    private final double w;

    private qs(double $$0) {
        this.w = $$0;
    }

    public static qs a(double $$0) {
        if ($$0 == 0.0) {
            return a;
        }
        return new qs($$0);
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
        $$0.writeDouble(this.w);
    }

    @Override
    public int a() {
        return 16;
    }

    @Override
    public byte b() {
        return 6;
    }

    public rm<qs> c() {
        return b;
    }

    public qs e() {
        return this;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        return $$0 instanceof qs && this.w == ((qs)$$0).w;
    }

    public int hashCode() {
        long $$0 = Double.doubleToLongBits(this.w);
        return (int)($$0 ^ $$0 >>> 32);
    }

    @Override
    public void a(ro $$0) {
        $$0.a(this);
    }

    @Override
    public long f() {
        return (long)Math.floor(this.w);
    }

    @Override
    public int g() {
        return apa.a(this.w);
    }

    @Override
    public short h() {
        return (short)(apa.a(this.w) & 0xFFFF);
    }

    @Override
    public byte i() {
        return (byte)(apa.a(this.w) & 0xFF);
    }

    @Override
    public double j() {
        return this.w;
    }

    @Override
    public float k() {
        return (float)this.w;
    }

    @Override
    public Number l() {
        return this.w;
    }

    @Override
    public rh.b a(rh $$0) {
        return $$0.a(this.w);
    }

    @Override
    public /* synthetic */ rk d() {
        return this.e();
    }
}

