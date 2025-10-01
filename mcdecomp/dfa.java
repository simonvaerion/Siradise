/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class dfa
implements dfv<bfj> {
    private static final Logger b = LogUtils.getLogger();
    private static final String c = "Entities";
    private static final String d = "Position";
    private final aif e;
    private final dfb f;
    private final LongSet g = new LongOpenHashSet();
    private final bcq<Runnable> h;
    protected final DataFixer a;

    public dfa(aif $$0, Path $$1, DataFixer $$2, boolean $$3, Executor $$4) {
        this.e = $$0;
        this.a = $$2;
        this.h = bcq.a($$4, "entity-deserializer");
        this.f = new dfb($$1, $$3, "entities");
    }

    @Override
    public CompletableFuture<dfq<bfj>> a(clt $$0) {
        if (this.g.contains($$0.a())) {
            return CompletableFuture.completedFuture(dfa.b($$0));
        }
        return this.f.a($$0).thenApplyAsync($$1 -> {
            if ($$1.isEmpty()) {
                this.g.add($$0.a());
                return dfa.b($$0);
            }
            try {
                clt $$2 = dfa.a((qr)$$1.get());
                if (!Objects.equals($$0, $$2)) {
                    b.error("Chunk file at {} is in the wrong location. (Expected {}, got {})", new Object[]{$$0, $$0, $$2});
                }
            }
            catch (Exception $$3) {
                b.warn("Failed to parse chunk {} position info", (Object)$$0, (Object)$$3);
            }
            qr $$4 = this.b((qr)$$1.get());
            qx $$5 = $$4.c(c, 10);
            List $$6 = (List)bfn.a($$5, (cmm)this.e).collect(ImmutableList.toImmutableList());
            return new dfq($$0, $$6);
        }, this.h::a);
    }

    private static clt a(qr $$0) {
        int[] $$1 = $$0.n(d);
        return new clt($$1[0], $$1[1]);
    }

    private static void a(qr $$0, clt $$1) {
        $$0.a(d, new qv(new int[]{$$1.e, $$1.f}));
    }

    private static dfq<bfj> b(clt $$0) {
        return new dfq<bfj>($$0, (List<bfj>)ImmutableList.of());
    }

    @Override
    public void a(dfq<bfj> $$0) {
        clt $$12 = $$0.a();
        if ($$0.c()) {
            if (this.g.add($$12.a())) {
                this.f.a($$12, (qr)null);
            }
            return;
        }
        qx $$2 = new qx();
        $$0.b().forEach($$1 -> {
            qr $$2 = new qr();
            if ($$1.e($$2)) {
                $$2.add($$2);
            }
        });
        qr $$3 = rd.g(new qr());
        $$3.a(c, $$2);
        dfa.a($$3, $$12);
        this.f.a($$12, $$3).exceptionally($$1 -> {
            b.error("Failed to store chunk {}", (Object)$$12, $$1);
            return null;
        });
        this.g.remove($$12.a());
    }

    @Override
    public void a(boolean $$0) {
        this.f.a($$0).join();
        this.h.a();
    }

    private qr b(qr $$0) {
        int $$1 = rd.b($$0, -1);
        return aqc.l.a(this.a, $$0, $$1);
    }

    @Override
    public void close() throws IOException {
        this.f.close();
    }
}

