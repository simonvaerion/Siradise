/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  javax.annotation.Nullable
 */
import com.google.common.primitives.Ints;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.security.SignatureException;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record tl(tq d, @Nullable th e, to f, @Nullable sw g, sz h) {
    private final tq d;
    @Nullable
    private final th e;
    private final to f;
    @Nullable
    private final sw g;
    private final sz h;
    public static final MapCodec<tl> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)tq.a.fieldOf("link").forGetter(tl::j), (App)th.a.optionalFieldOf("signature").forGetter($$0 -> Optional.ofNullable($$0.e)), (App)to.a.forGetter(tl::l), (App)aoi.b.optionalFieldOf("unsigned_content").forGetter($$0 -> Optional.ofNullable($$0.g)), (App)sz.a.optionalFieldOf("filter_mask", (Object)sz.c).forGetter(tl::n)).apply((Applicative)$$02, ($$0, $$1, $$2, $$3, $$4) -> new tl((tq)$$0, $$1.orElse(null), (to)$$2, $$3.orElse(null), (sz)$$4)));
    private static final UUID i = ac.c;
    public static final Duration b = Duration.ofMinutes(5L);
    public static final Duration c = b.plus(Duration.ofMinutes(2L));

    public static tl a(String $$0) {
        return tl.a(i, $$0);
    }

    public static tl a(UUID $$0, String $$1) {
        to $$2 = to.a($$1);
        tq $$3 = tq.a($$0);
        return new tl($$3, null, $$2, null, sz.c);
    }

    public tl a(sw $$0) {
        sw $$1 = !$$0.equals(sw.b(this.b())) ? $$0 : null;
        return new tl(this.d, this.e, this.f, $$1, this.h);
    }

    public tl a() {
        if (this.g != null) {
            return new tl(this.d, this.e, this.f, null, this.h);
        }
        return this;
    }

    public tl a(sz $$0) {
        if (this.h.equals($$0)) {
            return this;
        }
        return new tl(this.d, this.e, this.f, this.g, $$0);
    }

    public tl a(boolean $$0) {
        return this.a($$0 ? this.h : sz.c);
    }

    public static void a(api.a $$0, tq $$1, to $$2) throws SignatureException {
        $$0.update(Ints.toByteArray((int)1));
        $$1.a($$0);
        $$2.a($$0);
    }

    public boolean a(apj $$02) {
        return this.e != null && this.e.a($$02, $$0 -> tl.a($$0, this.d, this.f));
    }

    public String b() {
        return this.f.a();
    }

    public sw c() {
        return Objects.requireNonNullElseGet(this.g, () -> sw.b(this.b()));
    }

    public Instant d() {
        return this.f.b();
    }

    public long e() {
        return this.f.c();
    }

    public boolean a(Instant $$0) {
        return $$0.isAfter(this.d().plus(b));
    }

    public boolean b(Instant $$0) {
        return $$0.isAfter(this.d().plus(c));
    }

    public UUID f() {
        return this.d.c();
    }

    public boolean g() {
        return this.f().equals(i);
    }

    public boolean h() {
        return this.e != null;
    }

    public boolean a(UUID $$0) {
        return this.h() && this.d.c().equals($$0);
    }

    public boolean i() {
        return this.h.b();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{tl.class, "link;signature;signedBody;unsignedContent;filterMask", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{tl.class, "link;signature;signedBody;unsignedContent;filterMask", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{tl.class, "link;signature;signedBody;unsignedContent;filterMask", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public tq j() {
        return this.d;
    }

    @Nullable
    public th k() {
        return this.e;
    }

    public to l() {
        return this.f;
    }

    @Nullable
    public sw m() {
        return this.g;
    }

    public sz n() {
        return this.h;
    }
}

