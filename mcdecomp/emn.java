/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URL;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import org.slf4j.Logger;

public class emn
extends emo {
    private static final Logger c = LogUtils.getLogger();
    private final ejq d;
    private final euq e;
    private final eiu f;
    private final ReentrantLock g;

    public emn(eiu $$0, euq $$1, ejq $$2, ReentrantLock $$3) {
        this.e = $$1;
        this.f = $$0;
        this.d = $$2;
        this.g = $$3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void run() {
        void $$6;
        this.b(sw.c("mco.connect.connecting"));
        try {
            ejr $$0 = this.e();
        }
        catch (CancellationException $$1) {
            c.info("User aborted connecting to realms");
            return;
        }
        catch (ekm $$2) {
            switch ($$2.a(-1)) {
                case 6002: {
                    emn.a(new elt(this.e, this.f, this.d));
                    return;
                }
                case 6006: {
                    boolean $$3 = this.d.g.equals(enn.N().U().b());
                    emn.a($$3 ? new eky(this.e, this.f, this.d.a, this.d.m == ejq.c.b) : new ele(sw.c("mco.brokenworld.nonowner.title"), sw.c("mco.brokenworld.nonowner.error"), this.e));
                    return;
                }
            }
            this.a($$2.toString());
            c.error("Couldn't connect to world", (Throwable)$$2);
            return;
        }
        catch (TimeoutException $$4) {
            this.a(sw.c("mco.errorMessage.connectionFailure"));
            return;
        }
        catch (Exception $$5) {
            c.error("Couldn't connect to world", (Throwable)$$5);
            this.a($$5.getLocalizedMessage());
            return;
        }
        boolean $$7 = $$6.b != null && $$6.c != null;
        elh $$8 = $$7 ? this.a((ejr)$$6, this::a) : this.a((ejr)$$6);
        emn.a($$8);
    }

    private ejr e() throws ekm, TimeoutException, CancellationException {
        eiz $$0 = eiz.a();
        for (int $$1 = 0; $$1 < 40; ++$$1) {
            if (this.c()) {
                throw new CancellationException();
            }
            try {
                return $$0.c(this.d.a);
            }
            catch (ekn $$2) {
                emn.a($$2.e);
                continue;
            }
        }
        throw new TimeoutException();
    }

    public elh a(ejr $$0) {
        return new elh(this.e, new eml(this.e, this.d, $$0));
    }

    private elg a(ejr $$0, Function<ejr, euq> $$1) {
        BooleanConsumer $$22 = $$2 -> {
            try {
                if (!$$2) {
                    emn.a(this.e);
                    return;
                }
                ((CompletableFuture)this.b($$0).thenRun(() -> emn.a((euq)$$1.apply($$0)))).exceptionally($$1 -> {
                    enn.N().ab().a();
                    c.error("Failed to download resource pack from {}", (Object)$$0, $$1);
                    emn.a(new ele(sw.c("mco.download.resourcePack.fail"), this.e));
                    return null;
                });
            }
            finally {
                if (this.g.isHeldByCurrentThread()) {
                    this.g.unlock();
                }
            }
        };
        return new elg($$22, elg.a.b, sw.c("mco.configure.world.resourcepack.question.line1"), sw.c("mco.configure.world.resourcepack.question.line2"), true);
    }

    private CompletableFuture<?> b(ejr $$0) {
        try {
            return enn.N().ab().a(new URL($$0.b), $$0.c, false);
        }
        catch (Exception $$1) {
            CompletableFuture $$2 = new CompletableFuture();
            $$2.completeExceptionally($$1);
            return $$2;
        }
    }
}

