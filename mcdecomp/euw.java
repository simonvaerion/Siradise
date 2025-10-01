/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.BanDetails
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class euw
extends euq {
    private static final Logger c = LogUtils.getLogger();
    private static final String k = "Demo_World";
    public static final sw a = sw.b("Copyright Mojang AB. Do not distribute!");
    public static final fjl b = new fjl(new acq("textures/gui/title/background/panorama"));
    private static final acq l = new acq("textures/gui/title/background/panorama_overlay.png");
    @Nullable
    private eqi m;
    private epi n;
    @Nullable
    private eli o;
    private final fjz p = new fjz(b);
    private final boolean q;
    private long r;
    @Nullable
    private a s;
    private final epx t;

    public euw() {
        this(false);
    }

    public euw(boolean $$0) {
        this($$0, null);
    }

    public euw(boolean $$0, @Nullable epx $$1) {
        super(sw.c("narrator.screen.title"));
        this.q = $$0;
        this.t = Objects.requireNonNullElseGet($$1, () -> new epx(false));
    }

    private boolean l() {
        return this.o != null;
    }

    @Override
    public void f() {
        if (this.l()) {
            this.o.f();
        }
        this.f.aR().a(this);
    }

    public static CompletableFuture<Void> a(fuw $$0, Executor $$1) {
        return CompletableFuture.allOf($$0.a(epx.a, $$1), $$0.a(epx.c, $$1), $$0.a(l, $$1), b.a($$0, $$1));
    }

    @Override
    public boolean az_() {
        return false;
    }

    @Override
    public boolean av_() {
        return false;
    }

    @Override
    protected void b() {
        if (this.m == null) {
            this.m = this.f.aI().a();
        }
        int $$02 = this.i.a(a);
        int $$1 = this.g - $$02 - 2;
        int $$2 = 24;
        int $$3 = this.h / 4 + 48;
        if (this.f.H()) {
            this.b($$3, 24);
        } else {
            this.a($$3, 24);
        }
        this.d(new ept(this.g / 2 - 124, $$3 + 72 + 12, 20, 20, 0, 106, 20, epi.m, 256, 256, $$0 -> this.f.a(new eua((euq)this, this.f.m, this.f.ad())), sw.c("narrator.button.language")));
        this.d(epi.a(sw.c("menu.options"), (epi $$0) -> this.f.a(new euh(this, this.f.m))).a(this.g / 2 - 100, $$3 + 72 + 12, 98, 20).a());
        this.d(epi.a(sw.c("menu.quit"), (epi $$0) -> this.f.p()).a(this.g / 2 + 2, $$3 + 72 + 12, 98, 20).a());
        this.d(new ept(this.g / 2 + 104, $$3 + 72 + 12, 20, 20, 0, 0, 20, epi.n, 32, 64, $$0 -> this.f.a(new etd(this, this.f.m)), sw.c("narrator.button.accessibility")));
        this.d(new eqe($$1, this.h - 10, $$02, 10, a, $$0 -> this.f.a(new eto(this)), this.i));
        this.f.d(false);
        if (this.o == null) {
            this.o = new eli();
        }
        if (this.l()) {
            this.o.b(this.f, this.g, this.h);
        }
        if (!this.f.ae()) {
            this.s = new a(this.i, epz.a(this.i, (ta)sw.c("title.32bit.deprecation"), 350, 2), this.g / 2, $$3 - 24);
        }
    }

    private void a(int $$02, int $$1) {
        this.d(epi.a(sw.c("menu.singleplayer"), (epi $$0) -> this.f.a(new ezg(this))).a(this.g / 2 - 100, $$02, 200, 20).a());
        sw $$2 = this.B();
        boolean $$3 = $$2 == null;
        eqp $$4 = $$2 != null ? eqp.a($$2) : null;
        this.d(epi.a((sw)sw.c((String)"menu.multiplayer"), (epi.c)(epi.c)LambdaMetafactory.metafactory(null, null, null, (Lepi;)V, c(epi ), (Lepi;)V)((euw)this)).a((int)(this.g / 2 - 100), (int)($$02 + $$1 * 1), (int)200, (int)20).a((eqp)$$4).a()).r = $$3;
        this.d(epi.a((sw)sw.c((String)"menu.online"), (epi.c)(epi.c)LambdaMetafactory.metafactory(null, null, null, (Lepi;)V, b(epi ), (Lepi;)V)((euw)this)).a((int)(this.g / 2 - 100), (int)($$02 + $$1 * 2), (int)200, (int)20).a((eqp)$$4).a()).r = $$3;
    }

    @Nullable
    private sw B() {
        if (this.f.C()) {
            return null;
        }
        BanDetails $$0 = this.f.F();
        if ($$0 != null) {
            if ($$0.expires() != null) {
                return sw.c("title.multiplayer.disabled.banned.temporary");
            }
            return sw.c("title.multiplayer.disabled.banned.permanent");
        }
        return sw.c("title.multiplayer.disabled");
    }

    private void b(int $$02, int $$12) {
        boolean $$2 = this.C();
        this.d(epi.a(sw.c("menu.playdemo"), (epi $$1) -> {
            if ($$2) {
                this.f.w().a(this, k);
            } else {
                this.f.w().a(k, MinecraftServer.f, dii.b, drq::a);
            }
        }).a(this.g / 2 - 100, $$02, 200, 20).a());
        this.n = this.d(epi.a(sw.c("menu.resetdemo"), (epi $$0) -> {
            dyy $$1 = this.f.k();
            try (dyy.c $$2 = $$1.d(k);){
                dyz $$3 = $$2.c();
                if ($$3 != null) {
                    this.f.a(new etk(this::c, sw.c("selectWorld.deleteQuestion"), sw.a("selectWorld.deleteWarning", new Object[]{$$3.b()}), sw.c("selectWorld.deleteButton"), sv.e));
                }
            }
            catch (IOException $$4) {
                erf.a(this.f, k);
                c.warn("Failed to access demo world", (Throwable)$$4);
            }
        }).a(this.g / 2 - 100, $$02 + $$12 * 1, 200, 20).a());
        this.n.r = $$2;
    }

    private boolean C() {
        boolean bl2;
        block8: {
            dyy.c $$0 = this.f.k().d(k);
            try {
                boolean bl3 = bl2 = $$0.c() != null;
                if ($$0 == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if ($$0 != null) {
                        try {
                            $$0.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException $$1) {
                    erf.a(this.f, k);
                    c.warn("Failed to read demo world data", (Throwable)$$1);
                    return false;
                }
            }
            $$0.close();
        }
        return bl2;
    }

    private void D() {
        this.f.a(new eiu(this));
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        if (this.r == 0L && this.q) {
            this.r = ac.b();
        }
        float $$4 = this.q ? (float)(ac.b() - this.r) / 1000.0f : 1.0f;
        this.p.a($$3, apa.a($$4, 0.0f, 1.0f));
        RenderSystem.enableBlend();
        $$0.a(1.0f, 1.0f, 1.0f, this.q ? (float)apa.f(apa.a($$4, 0.0f, 1.0f)) : 1.0f);
        $$0.a(l, 0, 0, this.g, this.h, 0.0f, 0.0f, 16, 128, 16, 128);
        $$0.a(1.0f, 1.0f, 1.0f, 1.0f);
        float $$5 = this.q ? apa.a($$4 - 1.0f, 0.0f, 1.0f) : 1.0f;
        this.t.a($$0, this.g, $$5);
        int $$6 = apa.f($$5 * 255.0f) << 24;
        if (($$6 & 0xFC000000) == 0) {
            return;
        }
        if (this.s != null) {
            this.s.a($$0, $$6);
        }
        if (this.m != null) {
            this.m.a($$0, this.g, this.i, $$6);
        }
        String $$7 = "Minecraft " + aa.b().c();
        $$7 = this.f.H() ? $$7 + " Demo" : $$7 + (String)("release".equalsIgnoreCase(this.f.h()) ? "" : "/" + this.f.h());
        if (enn.d().a()) {
            $$7 = $$7 + fvz.a("menu.modded", new Object[0]);
        }
        $$0.b(this.i, $$7, 2, this.h - 10, 0xFFFFFF | $$6);
        for (eqt eqt2 : this.i()) {
            if (!(eqt2 instanceof epf)) continue;
            ((epf)eqt2).a($$5);
        }
        super.a($$0, $$1, $$2, $$3);
        if (this.l() && $$5 >= 1.0f) {
            RenderSystem.enableDepthTest();
            this.o.a($$0, $$1, $$2, $$3);
        }
    }

    @Override
    public boolean a(double $$0, double $$1, int $$2) {
        if (super.a($$0, $$1, $$2)) {
            return true;
        }
        return this.l() && this.o.a($$0, $$1, $$2);
    }

    @Override
    public void ax_() {
        if (this.o != null) {
            this.o.ax_();
        }
    }

    @Override
    public void ay_() {
        super.ay_();
        if (this.o != null) {
            this.o.ay_();
        }
    }

    private void c(boolean $$0) {
        if ($$0) {
            try (dyy.c $$1 = this.f.k().d(k);){
                $$1.f();
            }
            catch (IOException $$2) {
                erf.b(this.f, k);
                c.warn("Failed to delete demo world", (Throwable)$$2);
            }
        }
        this.f.a(this);
    }

    private /* synthetic */ void b(epi $$0) {
        this.D();
    }

    private /* synthetic */ void c(epi $$0) {
        euq $$1 = this.f.m.v ? new exn(this) : new exp(this);
        this.f.a($$1);
    }

    record a(eov a, epz b, int c, int d) {
        public void a(eox $$0, int $$1) {
            this.b.a($$0, this.c, this.d, this.a.b, 2, 0x200000 | Math.min($$1, 0x55000000));
            this.b.a($$0, this.c, this.d, this.a.b, 0xFFFFFF | $$1);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "font;label;x;y", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "font;label;x;y", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "font;label;x;y", "a", "b", "c", "d"}, this, $$0);
        }
    }
}

