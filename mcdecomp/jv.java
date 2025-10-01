/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Encoder
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.MapCodec
 *  org.slf4j.Logger
 */
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;

public class jv
implements ji {
    private static final Logger d = LogUtils.getLogger();
    private final Path e;
    private final CompletableFuture<hg.b> f;
    private static final MapCodec<acp<cnk>> g = acp.a(jc.ap).fieldOf("biome");
    private static final Codec<cnt.c<acp<cnk>>> h = cnt.c.a(g).fieldOf("biomes").codec();

    public jv(jk $$0, CompletableFuture<hg.b> $$1) {
        this.e = $$0.a(jk.b.c).resolve("biome_parameters");
        this.f = $$1;
    }

    @Override
    public CompletableFuture<?> a(jg $$0) {
        return this.f.thenCompose($$1 -> {
            aco $$2 = aco.a(JsonOps.INSTANCE, $$1);
            ArrayList $$32 = new ArrayList();
            cny.b().forEach(($$3, $$4) -> $$32.add(jv.a(this.a($$3.b()), $$0, $$2, h, $$4)));
            return CompletableFuture.allOf((CompletableFuture[])$$32.toArray(CompletableFuture[]::new));
        });
    }

    private static <E> CompletableFuture<?> a(Path $$0, jg $$12, DynamicOps<JsonElement> $$2, Encoder<E> $$3, E $$4) {
        Optional $$5 = $$3.encodeStart($$2, $$4).resultOrPartial($$1 -> d.error("Couldn't serialize element {}: {}", (Object)$$0, $$1));
        if ($$5.isPresent()) {
            return ji.a($$12, (JsonElement)$$5.get(), $$0);
        }
        return CompletableFuture.completedFuture(null);
    }

    private Path a(acq $$0) {
        return this.e.resolve($$0.b()).resolve($$0.a() + ".json");
    }

    @Override
    public final String a() {
        return "Biome Parameters";
    }
}

