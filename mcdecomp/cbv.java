/*
 * Decompiled with CFR 0.152.
 */
public abstract class cbv {
    private int a;

    public static cbv a(final cbp $$0, final int $$1) {
        return new cbv(){

            @Override
            public int b() {
                return $$0.a($$1);
            }

            @Override
            public void a(int $$02) {
                $$0.a($$1, $$02);
            }
        };
    }

    public static cbv a(final int[] $$0, final int $$1) {
        return new cbv(){

            @Override
            public int b() {
                return $$0[$$1];
            }

            @Override
            public void a(int $$02) {
                $$0[$$1] = $$02;
            }
        };
    }

    public static cbv a() {
        return new cbv(){
            private int a;

            @Override
            public int b() {
                return this.a;
            }

            @Override
            public void a(int $$0) {
                this.a = $$0;
            }
        };
    }

    public abstract int b();

    public abstract void a(int var1);

    public boolean c() {
        int $$0 = this.b();
        boolean $$1 = $$0 != this.a;
        this.a = $$0;
        return $$1;
    }
}

