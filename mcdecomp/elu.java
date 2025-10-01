/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.RateLimiter
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.apache.commons.compress.archivers.ArchiveEntry
 *  org.apache.commons.compress.archivers.tar.TarArchiveEntry
 *  org.apache.commons.compress.archivers.tar.TarArchiveOutputStream
 *  org.apache.commons.compress.utils.IOUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.GZIPOutputStream;
import javax.annotation.Nullable;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.utils.IOUtils;
import org.slf4j.Logger;

public class elu
extends gan {
    private static final Logger a = LogUtils.getLogger();
    private static final ReentrantLock b = new ReentrantLock();
    private static final int c = 200;
    private static final int G = 80;
    private static final int H = 95;
    private static final int I = 1;
    private static final String[] J = new String[]{"", ".", ". .", ". . ."};
    private static final sw K = sw.c("mco.upload.verifying");
    private final eln L;
    private final dyz M;
    private final long N;
    private final int O;
    private final ejd P;
    private final RateLimiter Q;
    @Nullable
    private volatile sw[] R;
    private volatile sw S = sw.c("mco.upload.preparing");
    private volatile String T;
    private volatile boolean U;
    private volatile boolean V;
    private volatile boolean W = true;
    private volatile boolean X;
    private epi Y;
    private epi Z;
    private int aa;
    @Nullable
    private Long ab;
    @Nullable
    private Long ac;
    private long ad;
    private final Runnable ae;

    public elu(long $$0, int $$1, eln $$2, dyz $$3, Runnable $$4) {
        super(enf.a);
        this.N = $$0;
        this.O = $$1;
        this.L = $$2;
        this.M = $$3;
        this.P = new ejd();
        this.Q = RateLimiter.create((double)0.1f);
        this.ae = $$4;
    }

    @Override
    public void b() {
        this.Y = this.d(epi.a(sv.k, (epi $$0) -> this.B()).a((this.g - 200) / 2, this.h - 42, 200, 20).a());
        this.Y.s = false;
        this.Z = this.d(epi.a(sv.e, (epi $$0) -> this.C()).a((this.g - 200) / 2, this.h - 42, 200, 20).a());
        if (!this.X) {
            if (this.L.a == -1) {
                this.E();
            } else {
                this.L.a(() -> {
                    if (!this.X) {
                        this.X = true;
                        this.f.a(this);
                        this.E();
                    }
                });
            }
        }
    }

    private void B() {
        this.ae.run();
    }

    private void C() {
        this.U = true;
        this.f.a(this.L);
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if ($$0 == 256) {
            if (this.W) {
                this.C();
            } else {
                this.B();
            }
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        if (!this.V && this.P.a != 0L && this.P.a == this.P.b) {
            this.S = K;
            this.Z.r = false;
        }
        $$0.a(this.i, this.S, this.g / 2, 50, 0xFFFFFF);
        if (this.W) {
            this.c($$0);
        }
        if (this.P.a != 0L && !this.U) {
            this.d($$0);
            this.e($$0);
        }
        if (this.R != null) {
            for (int $$4 = 0; $$4 < this.R.length; ++$$4) {
                $$0.a(this.i, this.R[$$4], this.g / 2, 110 + 12 * $$4, 0xFF0000);
            }
        }
        super.a($$0, $$1, $$2, $$3);
    }

    private void c(eox $$0) {
        int $$1 = this.i.a(this.S);
        $$0.a(this.i, J[this.aa / 10 % J.length], this.g / 2 + $$1 / 2 + 5, 50, 0xFFFFFF, false);
    }

    private void d(eox $$0) {
        double $$1 = Math.min((double)this.P.a / (double)this.P.b, 1.0);
        this.T = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
        int $$2 = (this.g - 200) / 2;
        int $$3 = $$2 + (int)Math.round(200.0 * $$1);
        $$0.a($$2 - 1, 79, $$3 + 1, 96, -2501934);
        $$0.a($$2, 80, $$3, 95, -8355712);
        $$0.a(this.i, this.T + " %", this.g / 2, 84, 0xFFFFFF);
    }

    private void e(eox $$0) {
        if (this.aa % 20 == 0) {
            if (this.ab != null) {
                long $$1 = ac.b() - this.ac;
                if ($$1 == 0L) {
                    $$1 = 1L;
                }
                this.ad = 1000L * (this.P.a - this.ab) / $$1;
                this.a($$0, this.ad);
            }
            this.ab = this.P.a;
            this.ac = ac.b();
        } else {
            this.a($$0, this.ad);
        }
    }

    private void a(eox $$0, long $$1) {
        if ($$1 > 0L) {
            int $$2 = this.i.b(this.T);
            String $$3 = "(" + eiv.b($$1) + "/s)";
            $$0.a(this.i, $$3, this.g / 2 + $$2 / 2 + 15, 84, 0xFFFFFF, false);
        }
    }

    @Override
    public void f() {
        super.f();
        ++this.aa;
        if (this.S != null && this.Q.tryAcquire(1)) {
            sw $$0 = this.D();
            this.f.aU().c($$0);
        }
    }

    private sw D() {
        ArrayList $$0 = Lists.newArrayList();
        $$0.add(this.S);
        if (this.T != null) {
            $$0.add(sw.b(this.T + "%"));
        }
        if (this.R != null) {
            $$0.addAll(Arrays.asList(this.R));
        }
        return sv.a($$0);
    }

    private void E() {
        this.X = true;
        new Thread(() -> {
            File $$0 = null;
            eiz $$12 = eiz.a();
            long $$2 = this.N;
            try {
                if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                    this.S = sw.c("mco.upload.close.failure");
                    return;
                }
                eke $$3 = null;
                for (int $$4 = 0; $$4 < 20; ++$$4) {
                    block35: {
                        if (!this.U) break block35;
                        this.F();
                        return;
                    }
                    try {
                        $$3 = $$12.h($$2, emh.a($$2));
                        if ($$3 == null) continue;
                        break;
                    }
                    catch (ekn $$5) {
                        Thread.sleep($$5.e * 1000);
                    }
                }
                if ($$3 == null) {
                    this.S = sw.c("mco.upload.close.failure");
                    return;
                }
                emh.a($$2, $$3.a());
                if (!$$3.c()) {
                    this.S = sw.c("mco.upload.close.failure");
                    return;
                }
                if (this.U) {
                    this.F();
                    return;
                }
                File $$6 = new File(this.f.p.getAbsolutePath(), "saves");
                $$0 = this.b(new File($$6, this.M.a()));
                if (this.U) {
                    this.F();
                    return;
                }
                if (!this.a($$0)) {
                    long $$7 = $$0.length();
                    eiv $$8 = eiv.a($$7);
                    eiv $$9 = eiv.a(0x140000000L);
                    if (eiv.b($$7, $$8).equals(eiv.b(0x140000000L, $$9)) && $$8 != eiv.a) {
                        eiv $$10 = eiv.values()[$$8.ordinal() - 1];
                        this.a(sw.a("mco.upload.size.failure.line1", new Object[]{this.M.b()}), sw.a("mco.upload.size.failure.line2", new Object[]{eiv.b($$7, $$10), eiv.b(0x140000000L, $$10)}));
                        return;
                    }
                    this.a(sw.a("mco.upload.size.failure.line1", new Object[]{this.M.b()}), sw.a("mco.upload.size.failure.line2", new Object[]{eiv.b($$7, $$8), eiv.b(0x140000000L, $$9)}));
                    return;
                }
                this.S = sw.a("mco.upload.uploading", new Object[]{this.M.b()});
                eix $$11 = new eix($$0, this.N, this.O, $$3, this.f.U(), aa.b().c(), this.P);
                $$11.a((elv $$1) -> {
                    if ($$1.a >= 200 && $$1.a < 300) {
                        this.V = true;
                        this.S = sw.c("mco.upload.done");
                        this.Y.b(sv.d);
                        emh.b($$2);
                    } else if ($$1.a == 400 && $$1.b != null) {
                        this.a(sw.a("mco.upload.failed", new Object[]{$$1.b}));
                    } else {
                        this.a(sw.a("mco.upload.failed", $$1.a));
                    }
                });
                while (!$$11.b()) {
                    if (this.U) {
                        $$11.a();
                        this.F();
                        return;
                    }
                    try {
                        Thread.sleep(500L);
                    }
                    catch (InterruptedException $$122) {
                        a.error("Failed to check Realms file upload status");
                    }
                }
            }
            catch (IOException $$13) {
                this.a(sw.a("mco.upload.failed", new Object[]{$$13.getMessage()}));
            }
            catch (ekm $$14) {
                this.a(sw.a("mco.upload.failed", new Object[]{$$14.toString()}));
            }
            catch (InterruptedException $$15) {
                a.error("Could not acquire upload lock");
            }
            finally {
                this.V = true;
                if (!b.isHeldByCurrentThread()) {
                    return;
                }
                b.unlock();
                this.W = false;
                this.Y.s = true;
                this.Z.s = false;
                if ($$0 != null) {
                    a.debug("Deleting file {}", (Object)$$0.getAbsolutePath());
                    $$0.delete();
                }
            }
        }).start();
    }

    private void a(sw ... $$0) {
        this.R = $$0;
    }

    private void F() {
        this.S = sw.c("mco.upload.cancelled");
        a.debug("Upload was cancelled");
    }

    private boolean a(File $$0) {
        return $$0.length() < 0x140000000L;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private File b(File $$0) throws IOException {
        try (TarArchiveOutputStream $$1 = null;){
            File $$2 = File.createTempFile("realms-upload-file", ".tar.gz");
            $$1 = new TarArchiveOutputStream((OutputStream)new GZIPOutputStream(new FileOutputStream($$2)));
            $$1.setLongFileMode(3);
            this.a($$1, $$0.getAbsolutePath(), "world", true);
            $$1.finish();
            File file = $$2;
            return file;
        }
    }

    private void a(TarArchiveOutputStream $$0, String $$1, String $$2, boolean $$3) throws IOException {
        if (this.U) {
            return;
        }
        File $$4 = new File($$1);
        String $$5 = $$3 ? $$2 : $$2 + $$4.getName();
        TarArchiveEntry $$6 = new TarArchiveEntry($$4, $$5);
        $$0.putArchiveEntry((ArchiveEntry)$$6);
        if ($$4.isFile()) {
            IOUtils.copy((InputStream)new FileInputStream($$4), (OutputStream)$$0);
            $$0.closeArchiveEntry();
        } else {
            $$0.closeArchiveEntry();
            File[] $$7 = $$4.listFiles();
            if ($$7 != null) {
                for (File $$8 : $$7) {
                    this.a($$0, $$8.getAbsolutePath(), $$5 + "/", false);
                }
            }
        }
    }
}

