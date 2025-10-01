/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.apache.commons.lang3.tuple.Pair
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.apache.commons.lang3.tuple.Pair;

public class dgt {
    public static final Codec<dgt> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dgs.a.optionalFieldOf("event").forGetter($$0 -> $$0.b.map(Pair::getLeft)), (App)Codec.LONG.fieldOf("tick").forGetter($$0 -> $$0.b.map(Pair::getRight).orElse(-1L))).apply((Applicative)$$02, dgt::new));
    private Optional<Pair<dgs, Long>> b;

    public dgt(Optional<dgs> $$0, long $$12) {
        this.b = $$0.map($$1 -> Pair.of((Object)$$1, (Object)$$12));
    }

    public dgt() {
        this.b = Optional.empty();
    }

    public void a(dgs $$0, long $$1) {
        if (this.b($$0, $$1)) {
            this.b = Optional.of(Pair.of((Object)$$0, (Object)$$1));
        }
    }

    private boolean b(dgs $$0, long $$1) {
        if (this.b.isEmpty()) {
            return true;
        }
        Pair<dgs, Long> $$2 = this.b.get();
        long $$3 = (Long)$$2.getRight();
        if ($$1 != $$3) {
            return false;
        }
        dgs $$4 = (dgs)$$2.getLeft();
        if ($$0.b() < $$4.b()) {
            return true;
        }
        if ($$0.b() > $$4.b()) {
            return false;
        }
        return dgu.a_($$0.a()) > dgu.a_($$4.a());
    }

    public Optional<dgs> a(long $$0) {
        if (this.b.isEmpty()) {
            return Optional.empty();
        }
        if ((Long)this.b.get().getRight() < $$0) {
            return Optional.of((dgs)this.b.get().getLeft());
        }
        return Optional.empty();
    }

    public void a() {
        this.b = Optional.empty();
    }
}

