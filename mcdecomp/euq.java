/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class euq
extends eqr
implements eqh {
    private static final Logger a = LogUtils.getLogger();
    private static final Set<String> b = Sets.newHashSet((Object[])new String[]{"http", "https"});
    private static final sw c = sw.c("narrator.screen.usage");
    public static final acq d = new acq("textures/gui/options_background.png");
    protected final sw e;
    private final List<eqt> k = Lists.newArrayList();
    private final List<esn> l = Lists.newArrayList();
    @Nullable
    protected enn f;
    private boolean m;
    public int g;
    public int h;
    private final List<eqh> n = Lists.newArrayList();
    protected eov i;
    @Nullable
    private URI o;
    private static final long p;
    private static final long q;
    private static final long r = 750L;
    private static final long s = 200L;
    private static final long t = 200L;
    private final ess u = new ess();
    private long v = Long.MIN_VALUE;
    private long w = Long.MAX_VALUE;
    @Nullable
    private esn x;
    @Nullable
    private a y;
    protected final Executor j = $$0 -> this.f.execute(() -> {
        if (this.f.z == this) {
            $$0.run();
        }
    });

    protected euq(sw $$02) {
        this.e = $$02;
    }

    public sw m() {
        return this.e;
    }

    public sw au_() {
        return this.m();
    }

    public final void b(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0, $$1, $$2, $$3);
        if (this.y != null) {
            $$0.a(this.i, this.y.a(), this.y.b(), $$1, $$2);
            this.y = null;
        }
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        for (eqh $$4 : this.n) {
            $$4.a($$0, $$1, $$2, $$3);
        }
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        esv.c $$3;
        if ($$0 == 256 && this.av_()) {
            this.aw_();
            return true;
        }
        if (super.a($$0, $$1, $$2)) {
            return true;
        }
        switch ($$0) {
            case 263: {
                Record record = this.a(esx.c);
                break;
            }
            case 262: {
                Record record = this.a(esx.d);
                break;
            }
            case 265: {
                Record record = this.a(esx.a);
                break;
            }
            case 264: {
                Record record = this.a(esx.b);
                break;
            }
            case 258: {
                Record record = this.l();
                break;
            }
            default: {
                Record record = $$3 = null;
            }
        }
        if ($$3 != null) {
            eou $$4 = super.a((esv)$$3);
            if ($$4 == null && $$3 instanceof esv.c) {
                this.B();
                $$4 = super.a((esv)$$3);
            }
            if ($$4 != null) {
                this.a($$4);
            }
        }
        return false;
    }

    private esv.c l() {
        boolean $$0 = !euq.q();
        return new esv.c($$0);
    }

    private esv.a a(esx $$0) {
        return new esv.a($$0);
    }

    protected void c(eqt $$0) {
        eou $$1 = eou.a(this, $$0.a(new esv.b()));
        if ($$1 != null) {
            this.a($$1);
        }
    }

    private void B() {
        eou $$0 = this.aF_();
        if ($$0 != null) {
            $$0.a(false);
        }
    }

    @VisibleForTesting
    protected void a(eou $$0) {
        this.B();
        $$0.a(true);
    }

    public boolean av_() {
        return true;
    }

    public void aw_() {
        this.f.a((euq)null);
    }

    protected <T extends eqt & eqh> T d(T $$0) {
        this.n.add($$0);
        return this.e($$0);
    }

    protected <T extends eqh> T a(T $$0) {
        this.n.add($$0);
        return $$0;
    }

    protected <T extends eqt & esn> T e(T $$0) {
        this.k.add($$0);
        this.l.add($$0);
        return $$0;
    }

    protected void f(eqt $$0) {
        if ($$0 instanceof eqh) {
            this.n.remove((eqh)((Object)$$0));
        }
        if ($$0 instanceof esn) {
            this.l.remove((esn)((Object)$$0));
        }
        this.k.remove($$0);
    }

    protected void n() {
        this.n.clear();
        this.k.clear();
        this.l.clear();
    }

    public static List<sw> a(enn $$0, cfz $$1) {
        return $$1.a($$0.t, $$0.m.m ? chq.a.b : chq.a.a);
    }

    protected void a(String $$0, boolean $$1) {
    }

    public boolean a(@Nullable ts $$0) {
        if ($$0 == null) {
            return false;
        }
        su $$1 = $$0.h();
        if (euq.q()) {
            if ($$0.j() != null) {
                this.a($$0.j(), false);
            }
        } else if ($$1 != null) {
            block24: {
                if ($$1.a() == su.a.a) {
                    if (!this.f.m.H().c().booleanValue()) {
                        return false;
                    }
                    try {
                        URI $$2 = new URI($$1.b());
                        String $$3 = $$2.getScheme();
                        if ($$3 == null) {
                            throw new URISyntaxException($$1.b(), "Missing protocol");
                        }
                        if (!b.contains($$3.toLowerCase(Locale.ROOT))) {
                            throw new URISyntaxException($$1.b(), "Unsupported protocol: " + $$3.toLowerCase(Locale.ROOT));
                        }
                        if (this.f.m.I().c().booleanValue()) {
                            this.o = $$2;
                            this.f.a(new etj(this::c, $$1.b(), false));
                            break block24;
                        }
                        this.a($$2);
                    }
                    catch (URISyntaxException $$4) {
                        a.error("Can't open url for {}", (Object)$$1, (Object)$$4);
                    }
                } else if ($$1.a() == su.a.b) {
                    URI $$5 = new File($$1.b()).toURI();
                    this.a($$5);
                } else if ($$1.a() == su.a.d) {
                    this.a(aa.a($$1.b()), true);
                } else if ($$1.a() == su.a.c) {
                    String $$6 = aa.a($$1.b());
                    if ($$6.startsWith("/")) {
                        if (!this.f.t.cl.d($$6.substring(1))) {
                            a.error("Not allowed to run command with signed argument from click event: '{}'", (Object)$$6);
                        }
                    } else {
                        a.error("Failed to run command without '/' prefix from click event: '{}'", (Object)$$6);
                    }
                } else if ($$1.a() == su.a.f) {
                    this.f.o.a($$1.b());
                } else {
                    a.error("Don't know how to handle {}", (Object)$$1);
                }
            }
            return true;
        }
        return false;
    }

    public final void b(enn $$0, int $$1, int $$2) {
        this.f = $$0;
        this.i = $$0.h;
        this.g = $$1;
        this.h = $$2;
        if (!this.m) {
            this.b();
        } else {
            this.aG_();
        }
        this.m = true;
        this.d(false);
        this.a(p);
    }

    protected void o() {
        this.n();
        this.B();
        this.b();
    }

    @Override
    public List<? extends eqt> i() {
        return this.k;
    }

    protected void b() {
    }

    public void f() {
    }

    public void ax_() {
    }

    public void ay_() {
    }

    public void a(eox $$0) {
        if (this.f.s != null) {
            $$0.b(0, 0, this.g, this.h, -1072689136, -804253680);
        } else {
            this.b($$0);
        }
    }

    public void b(eox $$0) {
        $$0.a(0.25f, 0.25f, 0.25f, 1.0f);
        int $$1 = 32;
        $$0.a(d, 0, 0, 0, 0.0f, 0.0f, this.g, this.h, 32, 32);
        $$0.a(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public boolean az_() {
        return true;
    }

    private void c(boolean $$0) {
        if ($$0) {
            this.a(this.o);
        }
        this.o = null;
        this.f.a(this);
    }

    private void a(URI $$0) {
        ac.i().a($$0);
    }

    public static boolean p() {
        if (enn.a) {
            return ehe.a(enn.N().aM().i(), 343) || ehe.a(enn.N().aM().i(), 347);
        }
        return ehe.a(enn.N().aM().i(), 341) || ehe.a(enn.N().aM().i(), 345);
    }

    public static boolean q() {
        return ehe.a(enn.N().aM().i(), 340) || ehe.a(enn.N().aM().i(), 344);
    }

    public static boolean r() {
        return ehe.a(enn.N().aM().i(), 342) || ehe.a(enn.N().aM().i(), 346);
    }

    public static boolean d(int $$0) {
        return $$0 == 88 && euq.p() && !euq.q() && !euq.r();
    }

    public static boolean e(int $$0) {
        return $$0 == 86 && euq.p() && !euq.q() && !euq.r();
    }

    public static boolean f(int $$0) {
        return $$0 == 67 && euq.p() && !euq.q() && !euq.r();
    }

    public static boolean g(int $$0) {
        return $$0 == 65 && euq.p() && !euq.q() && !euq.r();
    }

    protected void aG_() {
        this.o();
    }

    public void a(enn $$0, int $$1, int $$2) {
        this.g = $$1;
        this.h = $$2;
        this.aG_();
    }

    public static void a(Runnable $$0, String $$1, String $$2) {
        try {
            $$0.run();
        }
        catch (Throwable $$3) {
            o $$4 = o.a($$3, $$1);
            p $$5 = $$4.a("Affected screen");
            $$5.a("Screen name", () -> $$2);
            throw new y($$4);
        }
    }

    protected boolean a(String $$0, char $$1, int $$2) {
        int $$3 = $$0.indexOf(58);
        int $$4 = $$0.indexOf(47);
        if ($$1 == ':') {
            return ($$4 == -1 || $$2 <= $$4) && $$3 == -1;
        }
        if ($$1 == '/') {
            return $$2 > $$3;
        }
        return $$1 == '_' || $$1 == '-' || $$1 >= 'a' && $$1 <= 'z' || $$1 >= '0' && $$1 <= '9' || $$1 == '.';
    }

    @Override
    public boolean a_(double $$0, double $$1) {
        return true;
    }

    public void a(List<Path> $$0) {
    }

    private void a(long $$0, boolean $$1) {
        this.w = ac.b() + $$0;
        if ($$1) {
            this.v = Long.MIN_VALUE;
        }
    }

    private void a(long $$0) {
        this.v = ac.b() + $$0;
    }

    public void v() {
        this.a(750L, false);
    }

    public void w() {
        this.a(200L, true);
    }

    public void x() {
        this.a(200L, true);
    }

    private boolean F() {
        return this.f.aU().a();
    }

    public void y() {
        long $$0;
        if (this.F() && ($$0 = ac.b()) > this.w && $$0 > this.v) {
            this.e(true);
            this.w = Long.MAX_VALUE;
        }
    }

    public void d(boolean $$0) {
        if (this.F()) {
            this.e($$0);
        }
    }

    private void e(boolean $$0) {
        this.u.a(this::a);
        String $$1 = this.u.a(!$$0);
        if (!$$1.isEmpty()) {
            this.f.aU().a($$1);
        }
    }

    protected boolean aH_() {
        return true;
    }

    protected void a(esp $$0) {
        $$0.a(eso.a, this.au_());
        if (this.aH_()) {
            $$0.a(eso.d, c);
        }
        this.b($$0);
    }

    protected void b(esp $$0) {
        List $$1 = this.l.stream().filter(esn::aD_).collect(Collectors.toList());
        Collections.sort($$1, Comparator.comparingInt(eqn::aC_));
        b $$2 = euq.a($$1, this.x);
        if ($$2 != null) {
            if ($$2.c.a()) {
                this.x = $$2.a;
            }
            if ($$1.size() > 1) {
                $$0.a(eso.b, (sw)sw.a("narrator.position.screen", $$2.b + 1, $$1.size()));
                if ($$2.c == esn.a.c) {
                    $$0.a(eso.d, (sw)sw.c("narration.component_list.usage"));
                }
            }
            $$2.a.b($$0.a());
        }
    }

    @Nullable
    public static b a(List<? extends esn> $$0, @Nullable esn $$1) {
        b $$2 = null;
        b $$3 = null;
        int $$5 = $$0.size();
        for (int $$4 = 0; $$4 < $$5; ++$$4) {
            esn $$6 = $$0.get($$4);
            esn.a $$7 = $$6.q();
            if ($$7.a()) {
                if ($$6 == $$1) {
                    $$3 = new b($$6, $$4, $$7);
                    continue;
                }
                return new b($$6, $$4, $$7);
            }
            if ($$7.compareTo($$2 != null ? $$2.c : esn.a.a) <= 0) continue;
            $$2 = new b($$6, $$4, $$7);
        }
        return $$2 != null ? $$2 : $$3;
    }

    public void z() {
        this.a(q, false);
    }

    public void b(List<aom> $$0) {
        this.a($$0, exj.a, true);
    }

    public void a(List<aom> $$0, exi $$1, boolean $$2) {
        if (this.y == null || $$2) {
            this.y = new a($$0, $$1);
        }
    }

    protected void d(sw $$0) {
        this.b(eqp.a(this.f, $$0));
    }

    public void a(eqp $$0, exi $$1, boolean $$2) {
        this.a($$0.a(this.f), $$1, $$2);
    }

    protected static void a(epf ... $$0) {
        for (epf $$1 : $$0) {
            $$1.s = false;
        }
    }

    @Override
    public esz s() {
        return new esz(0, 0, this.g, this.h);
    }

    @Nullable
    public ame A() {
        return null;
    }

    static {
        q = p = TimeUnit.SECONDS.toMillis(2L);
    }

    record a(List<aom> a, exi b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "tooltip;positioner", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "tooltip;positioner", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "tooltip;positioner", "a", "b"}, this, $$0);
        }
    }

    public static class b {
        public final esn a;
        public final int b;
        public final esn.a c;

        public b(esn $$0, int $$1, esn.a $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }
    }
}

