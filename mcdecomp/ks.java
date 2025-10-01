/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonElement
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ks
implements ji {
    private final jk.a d;
    private final jk.a e;

    public ks(jk $$0) {
        this.d = $$0.a(jk.b.b, "blockstates");
        this.e = $$0.a(jk.b.b, "models");
    }

    @Override
    public CompletableFuture<?> a(jg $$02) {
        HashMap $$12 = Maps.newHashMap();
        Consumer<kt> $$22 = $$1 -> {
            cpn $$2 = $$1.a();
            kt $$3 = $$12.put($$2, $$1);
            if ($$3 != null) {
                throw new IllegalStateException("Duplicate blockstate definition for " + $$2);
            }
        };
        HashMap $$3 = Maps.newHashMap();
        HashSet $$4 = Sets.newHashSet();
        BiConsumer<acq, Supplier<JsonElement>> $$5 = ($$1, $$2) -> {
            Supplier $$3 = $$3.put($$1, $$2);
            if ($$3 != null) {
                throw new IllegalStateException("Duplicate model definition for " + $$1);
            }
        };
        Consumer<cfu> $$6 = $$4::add;
        new kq($$22, $$5, $$6).a();
        new kr($$5).a();
        List<cpn> $$7 = jb.f.s().filter($$1 -> !$$12.containsKey($$1)).toList();
        if (!$$7.isEmpty()) {
            throw new IllegalStateException("Missing blockstate definitions for: " + $$7);
        }
        jb.f.forEach($$2 -> {
            cfu $$3 = cfu.l.get($$2);
            if ($$3 != null) {
                if ($$4.contains($$3)) {
                    return;
                }
                acq $$4 = le.a($$3);
                if (!$$3.containsKey($$4)) {
                    $$3.put($$4, new ld(le.a($$2)));
                }
            }
        });
        CompletableFuture[] completableFutureArray = new CompletableFuture[2];
        completableFutureArray[0] = this.a($$02, $$12, $$0 -> this.d.a($$0.q().g().a()));
        completableFutureArray[1] = this.a($$02, $$3, this.e::a);
        return CompletableFuture.allOf(completableFutureArray);
    }

    private <T> CompletableFuture<?> a(jg $$0, Map<T, ? extends Supplier<JsonElement>> $$1, Function<T, Path> $$22) {
        return CompletableFuture.allOf((CompletableFuture[])$$1.entrySet().stream().map($$2 -> {
            Path $$3 = (Path)$$22.apply($$2.getKey());
            JsonElement $$4 = (JsonElement)((Supplier)$$2.getValue()).get();
            return ji.a($$0, $$4, $$3);
        }).toArray(CompletableFuture[]::new));
    }

    @Override
    public final String a() {
        return "Model Definitions";
    }
}

