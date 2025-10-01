/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  org.apache.commons.io.FileUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class ezc
extends euq {
    private static final Logger a = LogUtils.getLogger();
    private static final sw b = sw.c("selectWorld.enterName");
    private epi c;
    private final BooleanConsumer k;
    private epr l;
    private final dyy.c m;

    public ezc(BooleanConsumer $$0, dyy.c $$1) {
        super(sw.c("selectWorld.edit.title"));
        this.k = $$0;
        this.m = $$1;
    }

    @Override
    public void f() {
        this.l.a();
    }

    @Override
    protected void b() {
        this.c = epi.a(sw.c("selectWorld.edit.save"), (epi $$0) -> this.l()).a(this.g / 2 - 100, this.h / 4 + 144 + 5, 98, 20).a();
        this.l = new epr(this.i, this.g / 2 - 100, 38, 200, 20, sw.c("selectWorld.enterName"));
        dyz $$03 = this.m.c();
        String $$1 = $$03 == null ? "" : $$03.b();
        this.l.a($$1);
        this.l.b((String $$0) -> {
            this.c.r = !$$0.trim().isEmpty();
        });
        this.e(this.l);
        epi $$2 = this.d(epi.a(sw.c("selectWorld.edit.resetIcon"), (epi $$02) -> {
            this.m.e().ifPresent($$0 -> FileUtils.deleteQuietly((File)$$0.toFile()));
            $$02.r = false;
        }).a(this.g / 2 - 100, this.h / 4 + 0 + 5, 200, 20).a());
        this.d(epi.a(sw.c("selectWorld.edit.openFolder"), (epi $$0) -> ac.i().a(this.m.a(dyw.l).toFile())).a(this.g / 2 - 100, this.h / 4 + 24 + 5, 200, 20).a());
        this.d(epi.a(sw.c("selectWorld.edit.backup"), (epi $$0) -> {
            boolean $$1 = ezc.a(this.m);
            this.k.accept(!$$1);
        }).a(this.g / 2 - 100, this.h / 4 + 48 + 5, 200, 20).a());
        this.d(epi.a(sw.c("selectWorld.edit.backupFolder"), (epi $$0) -> {
            dyy $$1 = this.f.k();
            Path $$2 = $$1.d();
            try {
                v.c($$2);
            }
            catch (IOException $$3) {
                throw new RuntimeException($$3);
            }
            ac.i().a($$2.toFile());
        }).a(this.g / 2 - 100, this.h / 4 + 72 + 5, 200, 20).a());
        this.d(epi.a(sw.c("selectWorld.edit.optimize"), (epi $$02) -> this.f.a(new etf(this, ($$0, $$1) -> {
            if ($$0) {
                ezc.a(this.m);
            }
            this.f.a(eze.a(this.f, this.k, this.f.as(), this.m, $$1));
        }, sw.c("optimizeWorld.confirm.title"), sw.c("optimizeWorld.confirm.description"), true))).a(this.g / 2 - 100, this.h / 4 + 96 + 5, 200, 20).a());
        this.d(this.c);
        this.d(epi.a(sv.e, (epi $$0) -> this.k.accept(false)).a(this.g / 2 + 2, this.h / 4 + 144 + 5, 98, 20).a());
        $$2.r = this.m.e().filter($$0 -> Files.isRegularFile($$0, new LinkOption[0])).isPresent();
        this.c(this.l);
    }

    @Override
    public void a(enn $$0, int $$1, int $$2) {
        String $$3 = this.l.b();
        this.b($$0, $$1, $$2);
        this.l.a($$3);
    }

    @Override
    public void aw_() {
        this.k.accept(false);
    }

    private void l() {
        try {
            this.m.a(this.l.b().trim());
            this.k.accept(true);
        }
        catch (IOException $$0) {
            a.error("Failed to access world '{}'", (Object)this.m.a(), (Object)$$0);
            erf.a(this.f, this.m.a());
            this.k.accept(true);
        }
    }

    public static void a(dyy $$0, String $$1) {
        boolean $$2 = false;
        try (dyy.c $$3 = $$0.c($$1);){
            $$2 = true;
            ezc.a($$3);
        }
        catch (IOException $$4) {
            if (!$$2) {
                erf.a(enn.N(), $$1);
            }
            a.warn("Failed to create backup of level {}", (Object)$$1, (Object)$$4);
        }
        catch (edx $$5) {
            a.warn("{}", (Object)$$5.getMessage());
            erf.a(enn.N(), $$1);
        }
    }

    public static boolean a(dyy.c $$0) {
        long $$1 = 0L;
        IOException $$2 = null;
        try {
            $$1 = $$0.g();
        }
        catch (IOException $$3) {
            $$2 = $$3;
        }
        if ($$2 != null) {
            tj $$4 = sw.c("selectWorld.edit.backupFailed");
            tj $$5 = sw.b($$2.getMessage());
            enn.N().az().a(new erf(erf.a.c, $$4, $$5));
            return false;
        }
        tj $$6 = sw.a("selectWorld.edit.backupCreated", new Object[]{$$0.a()});
        tj $$7 = sw.a("selectWorld.edit.backupSize", apa.c((double)$$1 / 1048576.0));
        enn.N().az().a(new erf(erf.a.c, $$6, $$7));
        return true;
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(this.i, this.e, this.g / 2, 15, 0xFFFFFF);
        $$0.b(this.i, b, this.g / 2 - 100, 24, 0xA0A0A0);
        this.l.a($$0, $$1, $$2, $$3);
        super.a($$0, $$1, $$2, $$3);
    }
}

