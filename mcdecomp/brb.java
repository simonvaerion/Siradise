/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.shorts.Short2ObjectMap
 *  it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class brb {
    private static final Logger a = LogUtils.getLogger();
    private final Short2ObjectMap<bra> b = new Short2ObjectOpenHashMap();
    private final Map<he<brc>, Set<bra>> c = Maps.newHashMap();
    private final Runnable d;
    private boolean e;

    public static Codec<brb> a(Runnable $$0) {
        return RecordCodecBuilder.create($$1 -> $$1.group((App)RecordCodecBuilder.point((Object)$$0), (App)Codec.BOOL.optionalFieldOf("Valid", (Object)false).forGetter($$0 -> $$0.e), (App)bra.a($$0).listOf().fieldOf("Records").forGetter($$0 -> ImmutableList.copyOf((Collection)$$0.b.values()))).apply((Applicative)$$1, brb::new)).orElseGet(ac.a("Failed to read POI section: ", arg_0 -> ((Logger)a).error(arg_0)), () -> new brb($$0, false, (List<bra>)ImmutableList.of()));
    }

    public brb(Runnable $$0) {
        this($$0, true, (List<bra>)ImmutableList.of());
    }

    private brb(Runnable $$0, boolean $$1, List<bra> $$2) {
        this.d = $$0;
        this.e = $$1;
        $$2.forEach(this::a);
    }

    public Stream<bra> a(Predicate<he<brc>> $$02, bqz.b $$12) {
        return this.c.entrySet().stream().filter($$1 -> $$02.test((he)$$1.getKey())).flatMap($$0 -> ((Set)$$0.getValue()).stream()).filter($$12.a());
    }

    public void a(gu $$02, he<brc> $$1) {
        if (this.a(new bra($$02, $$1, this.d))) {
            a.debug("Added POI of type {} @ {}", (Object)$$1.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]"), (Object)$$02);
            this.d.run();
        }
    }

    private boolean a(bra $$02) {
        gu $$1 = $$02.f();
        he<brc> $$2 = $$02.g();
        short $$3 = hx.b($$1);
        bra $$4 = (bra)this.b.get($$3);
        if ($$4 != null) {
            if ($$2.equals($$4.g())) {
                return false;
            }
            ac.a("POI data mismatch: already registered at " + $$1);
        }
        this.b.put($$3, (Object)$$02);
        this.c.computeIfAbsent($$2, $$0 -> Sets.newHashSet()).add($$02);
        return true;
    }

    public void a(gu $$0) {
        bra $$1 = (bra)this.b.remove(hx.b($$0));
        if ($$1 == null) {
            a.error("POI data mismatch: never registered at {}", (Object)$$0);
            return;
        }
        this.c.get($$1.g()).remove($$1);
        a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::g), LogUtils.defer($$1::f));
        this.d.run();
    }

    @Deprecated
    @aqa
    public int b(gu $$0) {
        return this.e($$0).map(bra::a).orElse(0);
    }

    public boolean c(gu $$0) {
        bra $$1 = (bra)this.b.get(hx.b($$0));
        if ($$1 == null) {
            throw ac.b(new IllegalStateException("POI never registered at " + $$0));
        }
        boolean $$2 = $$1.c();
        this.d.run();
        return $$2;
    }

    public boolean a(gu $$0, Predicate<he<brc>> $$1) {
        return this.d($$0).filter($$1).isPresent();
    }

    public Optional<he<brc>> d(gu $$0) {
        return this.e($$0).map(bra::g);
    }

    private Optional<bra> e(gu $$0) {
        return Optional.ofNullable((bra)this.b.get(hx.b($$0)));
    }

    public void a(Consumer<BiConsumer<gu, he<brc>>> $$0) {
        if (!this.e) {
            Short2ObjectOpenHashMap $$1 = new Short2ObjectOpenHashMap(this.b);
            this.b();
            $$0.accept((arg_0, arg_1) -> this.a((Short2ObjectMap)$$1, arg_0, arg_1));
            this.e = true;
            this.d.run();
        }
    }

    private void b() {
        this.b.clear();
        this.c.clear();
    }

    boolean a() {
        return this.e;
    }

    private /* synthetic */ void a(Short2ObjectMap $$0, gu $$1, he $$22) {
        short $$3 = hx.b($$1);
        bra $$4 = (bra)$$0.computeIfAbsent($$3, $$2 -> new bra($$1, $$22, this.d));
        this.a($$4);
    }
}

