/*
 * Decompiled with CFR 0.152.
 */
public class epw
extends epi {
    private boolean a;

    public epw(int $$0, int $$1, epi.c $$2) {
        super($$0, $$1, 20, 20, sw.c("narrator.button.difficulty_lock"), $$2, x);
    }

    @Override
    protected tj aE_() {
        return sv.a(new sw[]{super.aE_(), this.a() ? sw.c("narrator.button.difficulty_lock.locked") : sw.c("narrator.button.difficulty_lock.unlocked")});
    }

    public boolean a() {
        return this.a;
    }

    public void b(boolean $$0) {
        this.a = $$0;
    }

    @Override
    public void b(eox $$0, int $$1, int $$2, float $$3) {
        a $$6;
        if (!this.r) {
            a $$4 = this.a ? epw$a.c : epw$a.f;
        } else if (this.n()) {
            a $$5 = this.a ? epw$a.b : epw$a.e;
        } else {
            $$6 = this.a ? epw$a.a : epw$a.d;
        }
        $$0.a(epi.m, this.p(), this.r(), $$6.a(), $$6.b(), this.o, this.p);
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(0, 146);
        public static final /* enum */ a b = new a(0, 166);
        public static final /* enum */ a c = new a(0, 186);
        public static final /* enum */ a d = new a(20, 146);
        public static final /* enum */ a e = new a(20, 166);
        public static final /* enum */ a f = new a(20, 186);
        private final int g;
        private final int h;
        private static final /* synthetic */ a[] i;

        public static a[] values() {
            return (a[])i.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0, int $$1) {
            this.g = $$0;
            this.h = $$1;
        }

        public int a() {
            return this.g;
        }

        public int b() {
            return this.h;
        }

        private static /* synthetic */ a[] c() {
            return new a[]{a, b, c, d, e, f};
        }

        static {
            i = epw$a.c();
        }
    }
}

