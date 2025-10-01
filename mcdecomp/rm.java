/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.IOException;

public interface rm<T extends rk> {
    public T b(DataInput var1, int var2, ra var3) throws IOException;

    public rh.b a(DataInput var1, rh var2) throws IOException;

    default public void b(DataInput $$0, rh $$1) throws IOException {
        switch ($$1.b(this)) {
            case a: {
                this.a($$0, $$1);
                break;
            }
            case c: {
                break;
            }
            case b: {
                this.a($$0);
            }
        }
    }

    public void a(DataInput var1, int var2) throws IOException;

    public void a(DataInput var1) throws IOException;

    default public boolean d() {
        return false;
    }

    public String a();

    public String b();

    public static rm<qt> a(final int $$0) {
        return new rm<qt>(){

            private IOException c() {
                return new IOException("Invalid tag id: " + $$0);
            }

            public qt a(DataInput $$02, int $$1, ra $$2) throws IOException {
                throw this.c();
            }

            @Override
            public rh.b a(DataInput $$02, rh $$1) throws IOException {
                throw this.c();
            }

            @Override
            public void a(DataInput $$02, int $$1) throws IOException {
                throw this.c();
            }

            @Override
            public void a(DataInput $$02) throws IOException {
                throw this.c();
            }

            @Override
            public String a() {
                return "INVALID[" + $$0 + "]";
            }

            @Override
            public String b() {
                return "UNKNOWN_" + $$0;
            }

            @Override
            public /* synthetic */ rk b(DataInput dataInput, int n2, ra ra2) throws IOException {
                return this.a(dataInput, n2, ra2);
            }
        };
    }

    public static interface b<T extends rk>
    extends rm<T> {
        @Override
        default public void a(DataInput $$0, int $$1) throws IOException {
            for (int $$2 = 0; $$2 < $$1; ++$$2) {
                this.a($$0);
            }
        }
    }

    public static interface a<T extends rk>
    extends rm<T> {
        @Override
        default public void a(DataInput $$0) throws IOException {
            $$0.skipBytes(this.c());
        }

        @Override
        default public void a(DataInput $$0, int $$1) throws IOException {
            $$0.skipBytes(this.c() * $$1);
        }

        public int c();
    }
}

