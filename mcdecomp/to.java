/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  com.google.common.primitives.Longs
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public final class to
extends Record {
    private final String b;
    private final Instant c;
    private final long d;
    private final tc e;
    public static final MapCodec<to> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.STRING.fieldOf("content").forGetter(to::a), (App)aoi.m.fieldOf("time_stamp").forGetter(to::b), (App)Codec.LONG.fieldOf("salt").forGetter(to::c), (App)tc.a.optionalFieldOf("last_seen", (Object)tc.b).forGetter(to::d)).apply((Applicative)$$0, to::new));

    public to(String $$0, Instant $$1, long $$2, tc $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public static to a(String $$0) {
        return new to($$0, Instant.now(), 0L, tc.b);
    }

    public void a(api.a $$0) throws SignatureException {
        $$0.update(Longs.toByteArray((long)this.d));
        $$0.update(Longs.toByteArray((long)this.c.getEpochSecond()));
        byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
        $$0.update(Ints.toByteArray((int)$$1.length));
        $$0.update($$1);
        this.e.a($$0);
    }

    public a a(ti $$0) {
        return new a(this.b, this.c, this.d, this.e.a($$0));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{to.class, "content;timeStamp;salt;lastSeen", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{to.class, "content;timeStamp;salt;lastSeen", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{to.class, "content;timeStamp;salt;lastSeen", "b", "c", "d", "e"}, this, $$0);
    }

    public String a() {
        return this.b;
    }

    public Instant b() {
        return this.c;
    }

    public long c() {
        return this.d;
    }

    public tc d() {
        return this.e;
    }

    public record a(String a, Instant b, long c, tc.a d) {
        public a(sf $$0) {
            this($$0.e(256), $$0.v(), $$0.readLong(), new tc.a($$0));
        }

        public void a(sf $$0) {
            $$0.a(this.a, 256);
            $$0.a(this.b);
            $$0.writeLong(this.c);
            this.d.a($$0);
        }

        public Optional<to> a(ti $$02) {
            return this.d.a($$02).map($$0 -> new to(this.a, this.b, this.c, (tc)$$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "content;timeStamp;salt;lastSeen", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "content;timeStamp;salt;lastSeen", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "content;timeStamp;salt;lastSeen", "a", "b", "c", "d"}, this, $$0);
        }
    }
}

