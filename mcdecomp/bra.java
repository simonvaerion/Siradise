/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class bra {
    private final gu a;
    private final he<brc> b;
    private int c;
    private final Runnable d;

    public static Codec<bra> a(Runnable $$0) {
        return RecordCodecBuilder.create($$1 -> $$1.group((App)gu.a.fieldOf("pos").forGetter($$0 -> $$0.a), (App)acn.a(jc.S).fieldOf("type").forGetter($$0 -> $$0.b), (App)Codec.INT.fieldOf("free_tickets").orElse((Object)0).forGetter($$0 -> $$0.c), (App)RecordCodecBuilder.point((Object)$$0)).apply((Applicative)$$1, bra::new));
    }

    private bra(gu $$0, he<brc> $$1, int $$2, Runnable $$3) {
        this.a = $$0.i();
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
    }

    public bra(gu $$0, he<brc> $$1, Runnable $$2) {
        this($$0, $$1, $$1.a().b(), $$2);
    }

    @Deprecated
    @aqa
    public int a() {
        return this.c;
    }

    protected boolean b() {
        if (this.c <= 0) {
            return false;
        }
        --this.c;
        this.d.run();
        return true;
    }

    protected boolean c() {
        if (this.c >= this.b.a().b()) {
            return false;
        }
        ++this.c;
        this.d.run();
        return true;
    }

    public boolean d() {
        return this.c > 0;
    }

    public boolean e() {
        return this.c != this.b.a().b();
    }

    public gu f() {
        return this.a;
    }

    public he<brc> g() {
        return this.b;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((bra)$$0).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

