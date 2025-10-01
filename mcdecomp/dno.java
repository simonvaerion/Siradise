/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dno
implements dms {
    public static final Codec<dno> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dot.a.fieldOf("trunk_provider").forGetter($$0 -> $$0.b), (App)dpw.c.fieldOf("trunk_placer").forGetter($$0 -> $$0.d), (App)dot.a.fieldOf("foliage_provider").forGetter($$0 -> $$0.e), (App)doe.d.fieldOf("foliage_placer").forGetter($$0 -> $$0.f), (App)doq.d.optionalFieldOf("root_placer").forGetter($$0 -> $$0.g), (App)dot.a.fieldOf("dirt_provider").forGetter($$0 -> $$0.c), (App)dnt.a.fieldOf("minimum_size").forGetter($$0 -> $$0.h), (App)dpk.h.listOf().fieldOf("decorators").forGetter($$0 -> $$0.i), (App)Codec.BOOL.fieldOf("ignore_vines").orElse((Object)false).forGetter($$0 -> $$0.j), (App)Codec.BOOL.fieldOf("force_dirt").orElse((Object)false).forGetter($$0 -> $$0.k)).apply((Applicative)$$02, dno::new));
    public final dot b;
    public final dot c;
    public final dpw d;
    public final dot e;
    public final doe f;
    public final Optional<doq> g;
    public final dnt h;
    public final List<dpk> i;
    public final boolean j;
    public final boolean k;

    protected dno(dot $$0, dpw $$1, dot $$2, doe $$3, Optional<doq> $$4, dot $$5, dnt $$6, List<dpk> $$7, boolean $$8, boolean $$9) {
        this.b = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.c = $$5;
        this.h = $$6;
        this.i = $$7;
        this.j = $$8;
        this.k = $$9;
    }

    public static class a {
        public final dot a;
        private final dpw c;
        public final dot b;
        private final doe d;
        private final Optional<doq> e;
        private dot f;
        private final dnt g;
        private List<dpk> h = ImmutableList.of();
        private boolean i;
        private boolean j;

        public a(dot $$0, dpw $$1, dot $$2, doe $$3, Optional<doq> $$4, dnt $$5) {
            this.a = $$0;
            this.c = $$1;
            this.b = $$2;
            this.f = dot.a(cpo.j);
            this.d = $$3;
            this.e = $$4;
            this.g = $$5;
        }

        public a(dot $$0, dpw $$1, dot $$2, doe $$3, dnt $$4) {
            this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
        }

        public a a(dot $$0) {
            this.f = $$0;
            return this;
        }

        public a a(List<dpk> $$0) {
            this.h = $$0;
            return this;
        }

        public a a() {
            this.i = true;
            return this;
        }

        public a b() {
            this.j = true;
            return this;
        }

        public dno c() {
            return new dno(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }
    }
}

