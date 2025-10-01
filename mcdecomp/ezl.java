/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.StringUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class ezl
extends eqc<a> {
    static final Logger a = LogUtils.getLogger();
    static final DateFormat l = new SimpleDateFormat();
    private static final acq m = new acq("textures/misc/unknown_server.png");
    static final acq n = new acq("textures/gui/world_selection.png");
    static final sw o = sw.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
    static final sw p = sw.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
    static final sw q = sw.c("selectWorld.tooltip.snapshot1").a(n.g);
    static final sw r = sw.c("selectWorld.tooltip.snapshot2").a(n.g);
    static final sw s = sw.c("selectWorld.locked").a(n.m);
    static final sw t = sw.c("selectWorld.conversion.tooltip").a(n.m);
    private final ezg u;
    private CompletableFuture<List<dyz>> v;
    @Nullable
    private List<dyz> w;
    private String x;
    private final b y;

    public ezl(ezg $$0, enn $$1, int $$2, int $$3, int $$4, int $$5, int $$6, String $$7, @Nullable ezl $$8) {
        super($$1, $$2, $$3, $$4, $$5, $$6);
        this.u = $$0;
        this.y = new b($$1);
        this.x = $$7;
        this.v = $$8 != null ? $$8.v : this.x();
        this.a(this.v());
    }

    @Override
    protected void j() {
        this.i().forEach(a::close);
        super.j();
    }

    @Nullable
    private List<dyz> v() {
        try {
            return this.v.getNow(null);
        }
        catch (CancellationException | CompletionException $$0) {
            return null;
        }
    }

    void w() {
        this.v = this.x();
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        Optional<c> $$3;
        if (esu.a($$0) && ($$3 = this.d()).isPresent()) {
            $$3.get().d();
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        List<dyz> $$4 = this.v();
        if ($$4 != this.w) {
            this.a($$4);
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    private void a(@Nullable List<dyz> $$0) {
        if ($$0 == null) {
            this.y();
        } else {
            this.a(this.x, $$0);
        }
        this.w = $$0;
    }

    @Override
    public void a(String $$0) {
        if (this.w != null && !$$0.equals(this.x)) {
            this.a($$0, this.w);
        }
        this.x = $$0;
    }

    /*
     * WARNING - void declaration
     */
    private CompletableFuture<List<dyz>> x() {
        void $$2;
        try {
            dyy.a $$02 = this.b.k().b();
        }
        catch (dyx $$1) {
            a.error("Couldn't load level list", (Throwable)$$1);
            this.a($$1.a());
            return CompletableFuture.completedFuture(List.of());
        }
        if ($$2.a()) {
            eza.a(this.b, null);
            return CompletableFuture.completedFuture(List.of());
        }
        return this.b.k().a((dyy.a)$$2).exceptionally($$0 -> {
            this.b.a(o.a($$0, "Couldn't load level list"));
            return List.of();
        });
    }

    private void a(String $$0, List<dyz> $$1) {
        this.j();
        $$0 = $$0.toLowerCase(Locale.ROOT);
        for (dyz $$2 : $$1) {
            if (!this.a($$0, $$2)) continue;
            this.b(new c(this, $$2));
        }
        this.z();
    }

    private boolean a(String $$0, dyz $$1) {
        return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
    }

    private void y() {
        this.j();
        this.b(this.y);
        this.z();
    }

    private void z() {
        this.u.d(true);
    }

    @Override
    private void a(sw $$0) {
        this.b.a(new etv(sw.c("selectWorld.unable_to_load"), $$0));
    }

    @Override
    protected int c() {
        return super.c() + 20;
    }

    @Override
    public int b() {
        return super.b() + 50;
    }

    @Override
    public void a(@Nullable a $$0) {
        super.a($$0);
        this.u.a($$0 != null && $$0.b(), $$0 != null);
    }

    public Optional<c> d() {
        a $$0 = (a)this.f();
        if ($$0 instanceof c) {
            c $$1 = (c)$$0;
            return Optional.of($$1);
        }
        return Optional.empty();
    }

    public ezg e() {
        return this.u;
    }

    @Override
    public void b(esp $$0) {
        if (this.i().contains(this.y)) {
            this.y.b($$0);
            return;
        }
        super.b($$0);
    }

    public static class b
    extends a {
        private static final sw a = sw.c("selectWorld.loading_list");
        private final enn b;

        public b(enn $$0) {
            this.b = $$0;
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = (this.b.z.g - this.b.h.a(a)) / 2;
            int $$11 = $$2 + ($$5 - this.b.h.b) / 2;
            $$0.a(this.b.h, a, $$10, $$11, 0xFFFFFF, false);
            String $$12 = euc.a(ac.b());
            int $$13 = (this.b.z.g - this.b.h.b($$12)) / 2;
            int $$14 = $$11 + this.b.h.b;
            $$0.a(this.b.h, $$12, $$13, $$14, 0x808080, false);
        }

        @Override
        public sw a() {
            return a;
        }

        @Override
        public boolean b() {
            return false;
        }
    }

    public final class c
    extends a
    implements AutoCloseable {
        private static final int b = 32;
        private static final int c = 32;
        private static final int d = 0;
        private static final int e = 32;
        private static final int f = 64;
        private static final int g = 96;
        private static final int h = 0;
        private static final int i = 32;
        private final enn j;
        private final ezg k;
        private final dyz l;
        private final etw m;
        @Nullable
        private Path n;
        private long o;

        public c(ezl $$1, dyz $$2) {
            this.j = $$1.b;
            this.k = $$1.e();
            this.l = $$2;
            this.m = etw.a(this.j.X(), $$2.a());
            this.n = $$2.c();
            this.j();
            this.m();
        }

        private void j() {
            if (this.n == null) {
                return;
            }
            try {
                BasicFileAttributes $$0 = Files.readAttributes(this.n, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
                if ($$0.isSymbolicLink()) {
                    ArrayList<edz> $$1 = new ArrayList<edz>();
                    this.j.k().e().a(this.n, $$1);
                    if (!$$1.isEmpty()) {
                        a.warn(edx.a(this.n, $$1));
                        this.n = null;
                    } else {
                        $$0 = Files.readAttributes(this.n, BasicFileAttributes.class, new LinkOption[0]);
                    }
                }
                if (!$$0.isRegularFile()) {
                    this.n = null;
                }
            }
            catch (NoSuchFileException $$2) {
                this.n = null;
            }
            catch (IOException $$3) {
                a.error("could not validate symlink", (Throwable)$$3);
                this.n = null;
            }
        }

        @Override
        public sw a() {
            tj $$2;
            tj $$0 = sw.a("narrator.select.world_info", new Object[]{this.l.b(), new Date(this.l.f()), this.l.s()});
            if (this.l.p()) {
                tj $$1 = sv.a(new sw[]{$$0, s});
            } else {
                $$2 = $$0;
            }
            return sw.a("narrator.select", $$2);
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            Object $$10 = this.l.b();
            Object $$11 = this.l.a();
            long $$12 = this.l.f();
            if ($$12 != -1L) {
                $$11 = (String)$$11 + " (" + l.format(new Date($$12)) + ")";
            }
            if (StringUtils.isEmpty((CharSequence)$$10)) {
                $$10 = fvz.a("selectWorld.world", new Object[0]) + " " + ($$1 + 1);
            }
            sw $$13 = this.l.s();
            $$0.a(this.j.h, (String)$$10, $$3 + 32 + 3, $$2 + 1, 0xFFFFFF, false);
            $$0.a(this.j.h, (String)$$11, $$3 + 32 + 3, $$2 + this.j.h.b + 3, 0x808080, false);
            $$0.a(this.j.h, $$13, $$3 + 32 + 3, $$2 + this.j.h.b + this.j.h.b + 3, 0x808080, false);
            RenderSystem.enableBlend();
            $$0.a(this.m.b(), $$3, $$2, 0.0f, 0.0f, 32, 32, 32, 32);
            RenderSystem.disableBlend();
            if (this.j.m.U().c().booleanValue() || $$8) {
                int $$16;
                $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
                int $$14 = $$6 - $$3;
                boolean $$15 = $$14 < 32;
                int n2 = $$16 = $$15 ? 32 : 0;
                if (this.l instanceof dyz.b) {
                    $$0.a(n, $$3, $$2, 96.0f, (float)$$16, 32, 32, 256, 256);
                    $$0.a(n, $$3, $$2, 32.0f, (float)$$16, 32, 32, 256, 256);
                    return;
                }
                if (this.l.p()) {
                    $$0.a(n, $$3, $$2, 96.0f, (float)$$16, 32, 32, 256, 256);
                    if ($$15) {
                        this.k.b(this.j.h.c(s, 175));
                    }
                } else if (this.l.d()) {
                    $$0.a(n, $$3, $$2, 96.0f, (float)$$16, 32, 32, 256, 256);
                    if ($$15) {
                        this.k.b(this.j.h.c(t, 175));
                    }
                } else if (this.l.m()) {
                    $$0.a(n, $$3, $$2, 32.0f, (float)$$16, 32, 32, 256, 256);
                    if (this.l.n()) {
                        $$0.a(n, $$3, $$2, 96.0f, (float)$$16, 32, 32, 256, 256);
                        if ($$15) {
                            this.k.b((List<aom>)ImmutableList.of((Object)o.f(), (Object)p.f()));
                        }
                    } else if (!aa.b().g()) {
                        $$0.a(n, $$3, $$2, 64.0f, (float)$$16, 32, 32, 256, 256);
                        if ($$15) {
                            this.k.b((List<aom>)ImmutableList.of((Object)q.f(), (Object)r.f()));
                        }
                    }
                } else {
                    $$0.a(n, $$3, $$2, 0.0f, (float)$$16, 32, 32, 256, 256);
                }
            }
        }

        @Override
        public boolean a(double $$0, double $$1, int $$2) {
            if (this.l.q()) {
                return true;
            }
            ezl.this.a(this);
            if ($$0 - (double)ezl.this.o() <= 32.0) {
                this.d();
                return true;
            }
            if (ac.b() - this.o < 250L) {
                this.d();
                return true;
            }
            this.o = ac.b();
            return true;
        }

        public void d() {
            if (this.l.q()) {
                return;
            }
            if (this.l instanceof dyz.b) {
                this.j.a(new euv(this.k));
                return;
            }
            dyz.a $$02 = this.l.o();
            if ($$02.a()) {
                String $$12 = "selectWorld.backupQuestion." + $$02.c();
                String $$2 = "selectWorld.backupWarning." + $$02.c();
                tj $$3 = sw.c($$12);
                if ($$02.b()) {
                    $$3.a(n.r, n.m);
                }
                tj $$4 = sw.a($$2, this.l.k(), aa.b().c());
                this.j.a(new etf(this.k, ($$0, $$1) -> {
                    if ($$0) {
                        String $$2 = this.l.a();
                        try (dyy.c $$3 = this.j.k().c($$2);){
                            ezc.a($$3);
                        }
                        catch (IOException $$4) {
                            erf.a(this.j, $$2);
                            a.error("Failed to backup level {}", (Object)$$2, (Object)$$4);
                        }
                        catch (edx $$5) {
                            a.warn("{}", (Object)$$5.getMessage());
                            this.j.a(new euv(this.k));
                        }
                    }
                    this.k();
                }, $$3, $$4, false));
            } else if (this.l.n()) {
                this.j.a(new etk($$0 -> {
                    if ($$0) {
                        try {
                            this.k();
                        }
                        catch (Exception $$1) {
                            a.error("Failure to open 'future world'", (Throwable)$$1);
                            this.j.a(new ete(() -> this.j.a(this.k), sw.c("selectWorld.futureworld.error.title"), sw.c("selectWorld.futureworld.error.text")));
                        }
                    } else {
                        this.j.a(this.k);
                    }
                }, sw.c("selectWorld.versionQuestion"), sw.a("selectWorld.versionWarning", this.l.k()), sw.c("selectWorld.versionJoinButton"), sv.e));
            } else {
                this.k();
            }
        }

        public void e() {
            this.j.a(new etk($$0 -> {
                if ($$0) {
                    this.j.a(new euo(true));
                    this.f();
                }
                this.j.a(this.k);
            }, sw.c("selectWorld.deleteQuestion"), sw.a("selectWorld.deleteWarning", new Object[]{this.l.b()}), sw.c("selectWorld.deleteButton"), sv.e));
        }

        public void f() {
            dyy $$0 = this.j.k();
            String $$1 = this.l.a();
            try (dyy.c $$2 = $$0.d($$1);){
                $$2.f();
            }
            catch (IOException $$3) {
                erf.b(this.j, $$1);
                a.error("Failed to delete world {}", (Object)$$1, (Object)$$3);
            }
            ezl.this.w();
        }

        public void g() {
            if (this.l instanceof dyz.b) {
                this.j.a(new euv(this.k));
                return;
            }
            this.l();
            String $$0 = this.l.a();
            try {
                dyy.c $$1 = this.j.k().c($$0);
                this.j.a(new ezc($$2 -> {
                    try {
                        $$1.close();
                    }
                    catch (IOException $$3) {
                        a.error("Failed to unlock level {}", (Object)$$0, (Object)$$3);
                    }
                    if ($$2) {
                        ezl.this.w();
                    }
                    this.j.a(this.k);
                }, $$1));
            }
            catch (IOException $$22) {
                erf.a(this.j, $$0);
                a.error("Failed to access level {}", (Object)$$0, (Object)$$22);
                ezl.this.w();
            }
            catch (edx $$3) {
                a.warn("{}", (Object)$$3.getMessage());
                this.j.a(new euv(this.k));
            }
        }

        public void h() {
            if (this.l instanceof dyz.b) {
                this.j.a(new euv(this.k));
                return;
            }
            this.l();
            try (dyy.c $$0 = this.j.k().c(this.l.a());){
                Pair<cmq, ezi> $$1 = this.j.w().a($$0);
                cmq $$2 = (cmq)$$1.getFirst();
                ezi $$32 = (ezi)$$1.getSecond();
                Path $$4 = eza.a($$0.a(dyw.j), this.j);
                if ($$32.b().e()) {
                    this.j.a(new etk($$3 -> this.j.a($$3 ? eza.a(this.j, this.k, $$2, $$32, $$4) : this.k), sw.c("selectWorld.recreate.customized.title"), sw.c("selectWorld.recreate.customized.text"), sv.i, sv.e));
                } else {
                    this.j.a(eza.a(this.j, this.k, $$2, $$32, $$4));
                }
            }
            catch (edx $$5) {
                a.warn("{}", (Object)$$5.getMessage());
                this.j.a(new euv(this.k));
            }
            catch (Exception $$6) {
                a.error("Unable to recreate world", (Throwable)$$6);
                this.j.a(new ete(() -> this.j.a(this.k), sw.c("selectWorld.recreate.error.title"), sw.c("selectWorld.recreate.error.text")));
            }
        }

        private void k() {
            this.j.ah().a(fxt.a(amh.yo, 1.0f));
            if (this.j.k().b(this.l.a())) {
                this.l();
                this.j.w().a(this.k, this.l.a());
            }
        }

        private void l() {
            this.j.c(new etx(sw.c("selectWorld.data_read")));
        }

        private void m() {
            boolean $$0;
            boolean bl2 = $$0 = this.n != null && Files.isRegularFile(this.n, new LinkOption[0]);
            if ($$0) {
                try (InputStream $$1 = Files.newInputStream(this.n, new OpenOption[0]);){
                    this.m.a(ehk.a($$1));
                }
                catch (Throwable $$2) {
                    a.error("Invalid icon for world {}", (Object)this.l.a(), (Object)$$2);
                    this.n = null;
                }
            } else {
                this.m.a();
            }
        }

        @Override
        public void close() {
            this.m.close();
        }

        public String i() {
            return this.l.b();
        }

        @Override
        public boolean b() {
            return !this.l.q();
        }
    }

    public static abstract class a
    extends eqc.a<a>
    implements AutoCloseable {
        public abstract boolean b();

        @Override
        public void close() {
        }
    }
}

