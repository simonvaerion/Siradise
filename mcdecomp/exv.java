/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.hash.Hashing
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public class exv
extends euq {
    static final Logger a = LogUtils.getLogger();
    private static final int b = 200;
    private static final sw c = sw.c("pack.dropInfo").a(n.h);
    private static final sw k = sw.c("pack.folderInfo");
    private static final int l = 20;
    private static final acq m = new acq("textures/misc/unknown_pack.png");
    private final exu n;
    @Nullable
    private a o;
    private long p;
    private exw q;
    private exw r;
    private final Path s;
    private epi t;
    private final Map<String, acq> u = Maps.newHashMap();

    public exv(aki $$0, Consumer<aki> $$1, Path $$2, sw $$3) {
        super($$3);
        this.n = new exu(this::C, this::a, $$0, $$1);
        this.s = $$2;
        this.o = exv$a.a($$2);
    }

    @Override
    public void aw_() {
        this.n.c();
        this.B();
    }

    private void B() {
        if (this.o != null) {
            try {
                this.o.close();
                this.o = null;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    @Override
    protected void b() {
        this.q = new exw(this.f, this, 200, this.h, sw.c("pack.available.title"));
        this.q.f(this.g / 2 - 4 - 200);
        this.e(this.q);
        this.r = new exw(this.f, this, 200, this.h, sw.c("pack.selected.title"));
        this.r.f(this.g / 2 + 4);
        this.e(this.r);
        this.d(epi.a(sw.c("pack.openFolder"), (epi $$0) -> ac.i().a(this.s.toUri())).a(this.g / 2 - 154, this.h - 48, 150, 20).a(eqp.a(k)).a());
        this.t = this.d(epi.a(sv.d, (epi $$0) -> this.aw_()).a(this.g / 2 + 4, this.h - 48, 150, 20).a());
        this.D();
    }

    @Override
    public void f() {
        if (this.o != null) {
            try {
                if (this.o.a()) {
                    this.p = 20L;
                }
            }
            catch (IOException $$0) {
                a.warn("Failed to poll for directory {} changes, stopping", (Object)this.s);
                this.B();
            }
        }
        if (this.p > 0L && --this.p == 0L) {
            this.D();
        }
    }

    private void C() {
        this.a(this.r, this.n.b());
        this.a(this.q, this.n.a());
        this.t.r = !this.r.i().isEmpty();
    }

    private void a(exw $$0, Stream<exu.a> $$1) {
        $$0.i().clear();
        exw.a $$22 = (exw.a)$$0.f();
        String $$3 = $$22 == null ? "" : $$22.b();
        $$0.a(null);
        $$1.forEach($$2 -> {
            exw.a $$3 = new exw.a(this.f, $$0, (exu.a)$$2);
            $$0.i().add($$3);
            if ($$2.c().equals($$3)) {
                $$0.a($$3);
            }
        });
    }

    public void a(exw $$0) {
        exw $$1 = this.r == $$0 ? this.q : this.r;
        this.a(eou.a($$1.g(), new eqs[]{$$1, this}));
    }

    public void l() {
        this.r.a(null);
        this.q.a(null);
    }

    private void D() {
        this.n.d();
        this.C();
        this.p = 0L;
        this.u.clear();
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.b($$0);
        this.q.a($$0, $$1, $$2, $$3);
        this.r.a($$0, $$1, $$2, $$3);
        $$0.a(this.i, this.e, this.g / 2, 8, 0xFFFFFF);
        $$0.a(this.i, c, this.g / 2, 20, 0xFFFFFF);
        super.a($$0, $$1, $$2, $$3);
    }

    protected static void a(enn $$0, List<Path> $$1, Path $$22) {
        MutableBoolean $$3 = new MutableBoolean();
        $$1.forEach($$2 -> {
            try (Stream<Path> $$32 = Files.walk($$2, new FileVisitOption[0]);){
                $$32.forEach($$3 -> {
                    try {
                        ac.b($$2.getParent(), $$22, $$3);
                    }
                    catch (IOException $$4) {
                        a.warn("Failed to copy datapack file  from {} to {}", new Object[]{$$3, $$22, $$4});
                        $$3.setTrue();
                    }
                });
            }
            catch (IOException $$4) {
                a.warn("Failed to copy datapack file from {} to {}", $$2, (Object)$$22);
                $$3.setTrue();
            }
        });
        if ($$3.isTrue()) {
            erf.c($$0, $$22.toString());
        }
    }

    @Override
    public void a(List<Path> $$0) {
        String $$12 = $$0.stream().map(Path::getFileName).map(Path::toString).collect(Collectors.joining(", "));
        this.f.a(new etk($$1 -> {
            if ($$1) {
                exv.a(this.f, $$0, this.s);
                this.D();
            }
            this.f.a(this);
        }, sw.c("pack.dropConfirm"), sw.b($$12)));
    }

    /*
     * Enabled aggressive exception aggregation
     */
    private acq a(fuw $$0, akg $$1) {
        try (ajl $$2 = $$1.e();){
            acq acq2;
            block16: {
                akp<InputStream> $$3 = $$2.a("pack.png");
                if ($$3 == null) {
                    acq acq3 = m;
                    return acq3;
                }
                String $$4 = $$1.f();
                acq $$5 = new acq("minecraft", "pack/" + ac.a($$4, acq::b) + "/" + Hashing.sha1().hashUnencodedChars((CharSequence)$$4) + "/icon");
                InputStream $$6 = $$3.get();
                try {
                    ehk $$7 = ehk.a($$6);
                    $$0.a($$5, (fug)new fui($$7));
                    acq2 = $$5;
                    if ($$6 == null) break block16;
                }
                catch (Throwable throwable) {
                    if ($$6 != null) {
                        try {
                            $$6.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                $$6.close();
            }
            return acq2;
        }
        catch (Exception $$8) {
            a.warn("Failed to load icon from pack {}", (Object)$$1.f(), (Object)$$8);
            return m;
        }
    }

    private acq a(akg $$0) {
        return this.u.computeIfAbsent($$0.f(), $$1 -> this.a(this.f.X(), $$0));
    }

    static class a
    implements AutoCloseable {
        private final WatchService a;
        private final Path b;

        public a(Path $$0) throws IOException {
            this.b = $$0;
            this.a = $$0.getFileSystem().newWatchService();
            try {
                this.b($$0);
                try (DirectoryStream<Path> $$1 = Files.newDirectoryStream($$0);){
                    for (Path $$2 : $$1) {
                        if (!Files.isDirectory($$2, LinkOption.NOFOLLOW_LINKS)) continue;
                        this.b($$2);
                    }
                }
            }
            catch (Exception $$3) {
                this.a.close();
                throw $$3;
            }
        }

        @Nullable
        public static a a(Path $$0) {
            try {
                return new a($$0);
            }
            catch (IOException $$1) {
                a.warn("Failed to initialize pack directory {} monitoring", (Object)$$0, (Object)$$1);
                return null;
            }
        }

        private void b(Path $$0) throws IOException {
            $$0.register(this.a, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
        }

        public boolean a() throws IOException {
            WatchKey $$1;
            boolean $$0 = false;
            while (($$1 = this.a.poll()) != null) {
                List<WatchEvent<?>> $$2 = $$1.pollEvents();
                for (WatchEvent<?> $$3 : $$2) {
                    Path $$4;
                    $$0 = true;
                    if ($$1.watchable() != this.b || $$3.kind() != StandardWatchEventKinds.ENTRY_CREATE || !Files.isDirectory($$4 = this.b.resolve((Path)$$3.context()), LinkOption.NOFOLLOW_LINKS)) continue;
                    this.b($$4);
                }
                $$1.reset();
            }
            return $$0;
        }

        @Override
        public void close() throws IOException {
            this.a.close();
        }
    }
}

