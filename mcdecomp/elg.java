/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 */
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class elg
extends gan {
    static final sw b = sw.c("mco.warning");
    static final sw c = sw.c("mco.info");
    private final a G;
    private final sw H;
    private final sw I;
    protected final BooleanConsumer a;
    private final boolean J;

    public elg(BooleanConsumer $$0, a $$1, sw $$2, sw $$3, boolean $$4) {
        super(enf.a);
        this.a = $$0;
        this.G = $$1;
        this.H = $$2;
        this.I = $$3;
        this.J = $$4;
    }

    @Override
    public void b() {
        if (this.J) {
            this.d(epi.a(sv.f, (epi $$0) -> this.a.accept(true)).a(this.g / 2 - 105, elg.h(8), 100, 20).a());
            this.d(epi.a(sv.g, (epi $$0) -> this.a.accept(false)).a(this.g / 2 + 5, elg.h(8), 100, 20).a());
        } else {
            this.d(epi.a(sv.h, (epi $$0) -> this.a.accept(true)).a(this.g / 2 - 50, elg.h(8), 100, 20).a());
        }
    }

    @Override
    public sw au_() {
        return sv.b(this.G.d, this.H, this.I);
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if ($$0 == 256) {
            this.a.accept(false);
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(this.i, this.G.d, this.g / 2, elg.h(2), this.G.c);
        $$0.a(this.i, this.H, this.g / 2, elg.h(4), 0xFFFFFF);
        $$0.a(this.i, this.I, this.g / 2, elg.h(6), 0xFFFFFF);
        super.a($$0, $$1, $$2, $$3);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(b, 0xFF0000);
        public static final /* enum */ a b = new a(c, 8226750);
        public final int c;
        public final sw d;
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(sw $$0, int $$1) {
            this.d = $$0;
            this.c = $$1;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            e = elg$a.a();
        }
    }
}

