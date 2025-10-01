/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import javax.annotation.Nullable;

public final class eni
extends Record {
    private final int a;
    @Nullable
    private final a b;
    @Nullable
    private final sw c;
    @Nullable
    private final String d;
    private static final sw e = sw.c("chat.tag.system");
    private static final sw f = sw.c("chat.tag.system_single_player");
    private static final sw g = sw.c("chat.tag.not_secure");
    private static final sw h = sw.c("chat.tag.modified");
    private static final int i = 0xD0D0D0;
    private static final int j = 0x606060;
    private static final eni k = new eni(0xD0D0D0, null, e, "System");
    private static final eni l = new eni(0xD0D0D0, null, f, "System");
    private static final eni m = new eni(0xD0D0D0, null, g, "Not Secure");
    static final acq n = new acq("textures/gui/chat_tags.png");

    public eni(int $$0, @Nullable a $$1, @Nullable sw $$2, @Nullable String $$3) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
    }

    public static eni a() {
        return k;
    }

    public static eni b() {
        return l;
    }

    public static eni c() {
        return m;
    }

    public static eni a(String $$0) {
        tj $$1 = sw.b($$0).a(n.h);
        tj $$2 = sw.h().b(h).b(sv.q).b($$1);
        return new eni(0x606060, eni$a.a, $$2, "Modified");
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{eni.class, "indicatorColor;icon;text;logTag", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{eni.class, "indicatorColor;icon;text;logTag", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{eni.class, "indicatorColor;icon;text;logTag", "a", "b", "c", "d"}, this, $$0);
    }

    public int d() {
        return this.a;
    }

    @Nullable
    public a e() {
        return this.b;
    }

    @Nullable
    public sw f() {
        return this.c;
    }

    @Nullable
    public String g() {
        return this.d;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(0, 0, 9, 9);
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0, int $$1, int $$2, int $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        public void a(eox $$0, int $$1, int $$2) {
            $$0.a(n, $$1, $$2, (float)this.b, (float)this.c, this.d, this.e, 32, 32);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a};
        }

        static {
            f = eni$a.a();
        }
    }
}

