/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.platform.GlStateManager;

public class eip {
    private final a a;
    private final b b;
    private final int c;
    private final int d;
    private final int e;

    public eip(int $$0, a $$1, b $$2, int $$3) {
        if (!this.a($$0, $$2)) {
            throw new IllegalStateException("Multiple vertex elements of the same type other than UVs are not supported");
        }
        this.b = $$2;
        this.a = $$1;
        this.c = $$0;
        this.d = $$3;
        this.e = $$1.a() * this.d;
    }

    private boolean a(int $$0, b $$1) {
        return $$0 == 0 || $$1 == eip$b.d;
    }

    public final a a() {
        return this.a;
    }

    public final b b() {
        return this.b;
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.c;
    }

    public String toString() {
        return this.d + "," + this.b.a() + "," + this.a.b();
    }

    public final int e() {
        return this.e;
    }

    public final boolean f() {
        return this.b == eip$b.a;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        eip $$1 = (eip)$$0;
        if (this.d != $$1.d) {
            return false;
        }
        if (this.c != $$1.c) {
            return false;
        }
        if (this.a != $$1.a) {
            return false;
        }
        return this.b == $$1.b;
    }

    public int hashCode() {
        int $$0 = this.a.hashCode();
        $$0 = 31 * $$0 + this.b.hashCode();
        $$0 = 31 * $$0 + this.c;
        $$0 = 31 * $$0 + this.d;
        return $$0;
    }

    public void a(int $$0, long $$1, int $$2) {
        this.b.a(this.d, this.a.c(), $$2, $$1, this.c, $$0);
    }

    public void a(int $$0) {
        this.b.a(this.c, $$0);
    }

    public static final class eip$b
    extends Enum<eip$b> {
        public static final /* enum */ eip$b a = new eip$b("Position", ($$0, $$1, $$2, $$3, $$4, $$5) -> {
            GlStateManager._enableVertexAttribArray($$5);
            GlStateManager._vertexAttribPointer($$5, $$0, $$1, false, $$2, $$3);
        }, ($$0, $$1) -> GlStateManager._disableVertexAttribArray($$1));
        public static final /* enum */ eip$b b = new eip$b("Normal", ($$0, $$1, $$2, $$3, $$4, $$5) -> {
            GlStateManager._enableVertexAttribArray($$5);
            GlStateManager._vertexAttribPointer($$5, $$0, $$1, true, $$2, $$3);
        }, ($$0, $$1) -> GlStateManager._disableVertexAttribArray($$1));
        public static final /* enum */ eip$b c = new eip$b("Vertex Color", ($$0, $$1, $$2, $$3, $$4, $$5) -> {
            GlStateManager._enableVertexAttribArray($$5);
            GlStateManager._vertexAttribPointer($$5, $$0, $$1, true, $$2, $$3);
        }, ($$0, $$1) -> GlStateManager._disableVertexAttribArray($$1));
        public static final /* enum */ eip$b d = new eip$b("UV", ($$0, $$1, $$2, $$3, $$4, $$5) -> {
            GlStateManager._enableVertexAttribArray($$5);
            if ($$1 == 5126) {
                GlStateManager._vertexAttribPointer($$5, $$0, $$1, false, $$2, $$3);
            } else {
                GlStateManager._vertexAttribIPointer($$5, $$0, $$1, $$2, $$3);
            }
        }, ($$0, $$1) -> GlStateManager._disableVertexAttribArray($$1));
        public static final /* enum */ eip$b e = new eip$b("Padding", ($$0, $$1, $$2, $$3, $$4, $$5) -> {}, ($$0, $$1) -> {});
        public static final /* enum */ eip$b f = new eip$b("Generic", ($$0, $$1, $$2, $$3, $$4, $$5) -> {
            GlStateManager._enableVertexAttribArray($$5);
            GlStateManager._vertexAttribPointer($$5, $$0, $$1, false, $$2, $$3);
        }, ($$0, $$1) -> GlStateManager._disableVertexAttribArray($$1));
        private final String g;
        private final b h;
        private final a i;
        private static final /* synthetic */ eip$b[] j;

        public static eip$b[] values() {
            return (eip$b[])j.clone();
        }

        public static eip$b valueOf(String $$0) {
            return Enum.valueOf(eip$b.class, $$0);
        }

        private eip$b(String $$0, b $$1, a $$2) {
            this.g = $$0;
            this.h = $$1;
            this.i = $$2;
        }

        void a(int $$0, int $$1, int $$2, long $$3, int $$4, int $$5) {
            this.h.setupBufferState($$0, $$1, $$2, $$3, $$4, $$5);
        }

        public void a(int $$0, int $$1) {
            this.i.clearBufferState($$0, $$1);
        }

        public String a() {
            return this.g;
        }

        private static /* synthetic */ eip$b[] b() {
            return new eip$b[]{a, b, c, d, e, f};
        }

        static {
            j = eip$b.b();
        }

        @FunctionalInterface
        static interface b {
            public void setupBufferState(int var1, int var2, int var3, long var4, int var6, int var7);
        }

        @FunctionalInterface
        static interface a {
            public void clearBufferState(int var1, int var2);
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(4, "Float", 5126);
        public static final /* enum */ a b = new a(1, "Unsigned Byte", 5121);
        public static final /* enum */ a c = new a(1, "Byte", 5120);
        public static final /* enum */ a d = new a(2, "Unsigned Short", 5123);
        public static final /* enum */ a e = new a(2, "Short", 5122);
        public static final /* enum */ a f = new a(4, "Unsigned Int", 5125);
        public static final /* enum */ a g = new a(4, "Int", 5124);
        private final int h;
        private final String i;
        private final int j;
        private static final /* synthetic */ a[] k;

        public static a[] values() {
            return (a[])k.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0, String $$1, int $$2) {
            this.h = $$0;
            this.i = $$1;
            this.j = $$2;
        }

        public int a() {
            return this.h;
        }

        public String b() {
            return this.i;
        }

        public int c() {
            return this.j;
        }

        private static /* synthetic */ a[] d() {
            return new a[]{a, b, c, d, e, f, g};
        }

        static {
            k = eip$a.d();
        }
    }
}

