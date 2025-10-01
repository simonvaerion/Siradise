/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class anj {
    private static final Codec<anj> b = RecordCodecBuilder.create($$02 -> $$02.group((App)aoi.o.fieldOf("id").forGetter(anj::a), (App)Codec.BOOL.optionalFieldOf("required", (Object)true).forGetter($$0 -> $$0.e)).apply((Applicative)$$02, anj::new));
    public static final Codec<anj> a = Codec.either(aoi.o, b).xmap($$02 -> (anj)$$02.map($$0 -> new anj((aoi.d)$$0, true), $$0 -> $$0), $$0 -> $$0.e ? Either.left((Object)$$0.a()) : Either.right((Object)$$0));
    private final acq c;
    private final boolean d;
    private final boolean e;

    private anj(acq $$0, boolean $$1, boolean $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    private anj(aoi.d $$0, boolean $$1) {
        this.c = $$0.a();
        this.d = $$0.b();
        this.e = $$1;
    }

    private aoi.d a() {
        return new aoi.d(this.c, this.d);
    }

    public static anj a(acq $$0) {
        return new anj($$0, false, true);
    }

    public static anj b(acq $$0) {
        return new anj($$0, false, false);
    }

    public static anj c(acq $$0) {
        return new anj($$0, true, true);
    }

    public static anj d(acq $$0) {
        return new anj($$0, true, false);
    }

    public <T> boolean a(a<T> $$0, Consumer<T> $$1) {
        if (this.d) {
            Collection<T> $$2 = $$0.b(this.c);
            if ($$2 == null) {
                return !this.e;
            }
            $$2.forEach($$1);
        } else {
            T $$3 = $$0.a(this.c);
            if ($$3 == null) {
                return !this.e;
            }
            $$1.accept($$3);
        }
        return true;
    }

    public void a(Consumer<acq> $$0) {
        if (this.d && this.e) {
            $$0.accept(this.c);
        }
    }

    public void b(Consumer<acq> $$0) {
        if (this.d && !this.e) {
            $$0.accept(this.c);
        }
    }

    public boolean a(Predicate<acq> $$0, Predicate<acq> $$1) {
        return !this.e || (this.d ? $$1 : $$0).test(this.c);
    }

    public String toString() {
        StringBuilder $$0 = new StringBuilder();
        if (this.d) {
            $$0.append('#');
        }
        $$0.append(this.c);
        if (!this.e) {
            $$0.append('?');
        }
        return $$0.toString();
    }

    public static interface a<T> {
        @Nullable
        public T a(acq var1);

        @Nullable
        public Collection<T> b(acq var1);
    }
}

