/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class evm
extends euq {
    static final acq a = new acq("textures/gui/container/gamemode_switcher.png");
    private static final int b = 128;
    private static final int c = 128;
    private static final int k = 26;
    private static final int l = 5;
    private static final int m = 31;
    private static final int n = 5;
    private static final int o = evm$a.values().length * 31 - 5;
    private static final sw p = sw.a("debug.gamemodes.select_next", sw.c("debug.gamemodes.press_f4").a(n.l));
    private final a q;
    private a r;
    private int s;
    private int t;
    private boolean u;
    private final List<b> v = Lists.newArrayList();

    public evm() {
        super(enf.a);
        this.r = this.q = evm$a.a(this.l());
    }

    private cmj l() {
        ffa $$0 = enn.N().r;
        cmj $$1 = $$0.k();
        if ($$1 != null) {
            return $$1;
        }
        return $$0.l() == cmj.b ? cmj.a : cmj.b;
    }

    @Override
    protected void b() {
        super.b();
        this.r = this.q;
        for (int $$0 = 0; $$0 < evm$a.e.length; ++$$0) {
            a $$1 = evm$a.e[$$0];
            this.v.add(new b($$1, this.g / 2 - o / 2 + $$0 * 31, this.h / 2 - 31));
        }
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        if (this.C()) {
            return;
        }
        $$0.c().a();
        RenderSystem.enableBlend();
        int $$4 = this.g / 2 - 62;
        int $$5 = this.h / 2 - 31 - 27;
        $$0.a(a, $$4, $$5, 0.0f, 0.0f, 125, 75, 128, 128);
        $$0.c().b();
        super.a($$0, $$1, $$2, $$3);
        $$0.a(this.i, this.r.a(), this.g / 2, this.h / 2 - 31 - 20, -1);
        $$0.a(this.i, p, this.g / 2, this.h / 2 + 5, 0xFFFFFF);
        if (!this.u) {
            this.s = $$1;
            this.t = $$2;
            this.u = true;
        }
        boolean $$6 = this.s == $$1 && this.t == $$2;
        for (b $$7 : this.v) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.r == $$7.b);
            if ($$6 || !$$7.n()) continue;
            this.r = $$7.b;
        }
    }

    private void B() {
        evm.a(this.f, this.r);
    }

    private static void a(enn $$0, a $$1) {
        if ($$0.r == null || $$0.t == null) {
            return;
        }
        a $$2 = evm$a.a($$0.r.l());
        a $$3 = $$1;
        if ($$0.t.l(2) && $$3 != $$2) {
            $$0.t.cl.d($$3.b());
        }
    }

    private boolean C() {
        if (!ehe.a(this.f.aM().i(), 292)) {
            this.B();
            this.f.a((euq)null);
            return true;
        }
        return false;
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if ($$0 == 293) {
            this.u = false;
            this.r = this.r.c();
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public boolean az_() {
        return false;
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(sw.c("gameMode.creative"), "gamemode creative", new cfz(cpo.i));
        public static final /* enum */ a b = new a(sw.c("gameMode.survival"), "gamemode survival", new cfz(cgc.om));
        public static final /* enum */ a c = new a(sw.c("gameMode.adventure"), "gamemode adventure", new cfz(cgc.tp));
        public static final /* enum */ a d = new a(sw.c("gameMode.spectator"), "gamemode spectator", new cfz(cgc.rD));
        protected static final a[] e;
        private static final int j = 16;
        protected static final int f = 5;
        final sw g;
        final String h;
        final cfz i;
        private static final /* synthetic */ a[] k;

        public static a[] values() {
            return (a[])k.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(sw $$0, String $$1, cfz $$2) {
            this.g = $$0;
            this.h = $$1;
            this.i = $$2;
        }

        void a(eox $$0, int $$1, int $$2) {
            $$0.a(this.i, $$1, $$2);
        }

        sw a() {
            return this.g;
        }

        String b() {
            return this.h;
        }

        a c() {
            return switch (this) {
                default -> throw new IncompatibleClassChangeError();
                case a -> b;
                case b -> c;
                case c -> d;
                case d -> a;
            };
        }

        static a a(cmj $$0) {
            return switch ($$0) {
                default -> throw new IncompatibleClassChangeError();
                case cmj.d -> d;
                case cmj.a -> b;
                case cmj.b -> a;
                case cmj.c -> c;
            };
        }

        private static /* synthetic */ a[] d() {
            return new a[]{a, b, c, d};
        }

        static {
            k = evm$a.d();
            e = evm$a.values();
        }
    }

    public class b
    extends epf {
        final a b;
        private boolean c;

        public b(a $$1, int $$2, int $$3) {
            super($$2, $$3, 26, 26, $$1.a());
            this.b = $$1;
        }

        @Override
        public void b(eox $$0, int $$1, int $$2, float $$3) {
            this.a($$0);
            this.b.a($$0, this.p() + 5, this.r() + 5);
            if (this.c) {
                this.b($$0);
            }
        }

        @Override
        public void a(esp $$0) {
            this.c($$0);
        }

        @Override
        public boolean n() {
            return super.n() || this.c;
        }

        public void b(boolean $$0) {
            this.c = $$0;
        }

        private void a(eox $$0) {
            $$0.a(a, this.p(), this.r(), 0.0f, 75.0f, 26, 26, 128, 128);
        }

        private void b(eox $$0) {
            $$0.a(a, this.p(), this.r(), 26.0f, 75.0f, 26, 26, 128, 128);
        }
    }
}

