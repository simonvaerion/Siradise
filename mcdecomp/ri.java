/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.UTFDataFormatException;
import java.util.Objects;

public class ri
implements rk {
    private static final int b = 36;
    public static final rm<ri> a = new rm.b<ri>(){

        public ri a(DataInput $$0, int $$1, ra $$2) throws IOException {
            $$2.a(36L);
            String $$3 = $$0.readUTF();
            $$2.a(2 * $$3.length());
            return ri.a($$3);
        }

        @Override
        public rh.b a(DataInput $$0, rh $$1) throws IOException {
            return $$1.a($$0.readUTF());
        }

        @Override
        public void a(DataInput $$0) throws IOException {
            ri.a($$0);
        }

        @Override
        public String a() {
            return "STRING";
        }

        @Override
        public String b() {
            return "TAG_String";
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
    private static final ri c = new ri("");
    private static final char w = '\"';
    private static final char x = '\'';
    private static final char y = '\\';
    private static final char z = '\u0000';
    private final String A;

    public static void a(DataInput $$0) throws IOException {
        $$0.skipBytes($$0.readUnsignedShort());
    }

    private ri(String $$0) {
        Objects.requireNonNull($$0, "Null string not allowed");
        this.A = $$0;
    }

    public static ri a(String $$0) {
        if ($$0.isEmpty()) {
            return c;
        }
        return new ri($$0);
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
        try {
            $$0.writeUTF(this.A);
        }
        catch (UTFDataFormatException $$1) {
            ac.a("Failed to write NBT String", (Throwable)$$1);
            $$0.writeUTF("");
        }
    }

    @Override
    public int a() {
        return 36 + 2 * this.A.length();
    }

    @Override
    public byte b() {
        return 8;
    }

    public rm<ri> c() {
        return a;
    }

    @Override
    public String toString() {
        return rk.super.m_();
    }

    public ri e() {
        return this;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        return $$0 instanceof ri && Objects.equals(this.A, ((ri)$$0).A);
    }

    public int hashCode() {
        return this.A.hashCode();
    }

    @Override
    public String m_() {
        return this.A;
    }

    @Override
    public void a(ro $$0) {
        $$0.a(this);
    }

    public static String b(String $$0) {
        StringBuilder $$1 = new StringBuilder(" ");
        int $$2 = 0;
        for (int $$3 = 0; $$3 < $$0.length(); ++$$3) {
            int $$4 = $$0.charAt($$3);
            if ($$4 == 92) {
                $$1.append('\\');
            } else if ($$4 == 34 || $$4 == 39) {
                if ($$2 == 0) {
                    int n2 = $$2 = $$4 == 34 ? 39 : 34;
                }
                if ($$2 == $$4) {
                    $$1.append('\\');
                }
            }
            $$1.append((char)$$4);
        }
        if ($$2 == 0) {
            $$2 = 34;
        }
        $$1.setCharAt(0, (char)$$2);
        $$1.append((char)$$2);
        return $$1.toString();
    }

    @Override
    public rh.b a(rh $$0) {
        return $$0.a(this.A);
    }

    @Override
    public /* synthetic */ rk d() {
        return this.e();
    }
}

