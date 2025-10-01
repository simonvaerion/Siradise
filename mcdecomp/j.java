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
 *  org.apache.commons.lang3.tuple.Triple
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Triple;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public final class j {
    private final Matrix4f c;
    public static final Codec<j> a = RecordCodecBuilder.create($$02 -> $$02.group((App)aoi.d.fieldOf("translation").forGetter($$0 -> $$0.e), (App)aoi.g.fieldOf("left_rotation").forGetter($$0 -> $$0.f), (App)aoi.d.fieldOf("scale").forGetter($$0 -> $$0.g), (App)aoi.g.fieldOf("right_rotation").forGetter($$0 -> $$0.h)).apply((Applicative)$$02, j::new));
    public static final Codec<j> b = Codec.either(a, (Codec)aoi.h.xmap(j::new, j::c)).xmap($$02 -> (j)$$02.map($$0 -> $$0, $$0 -> $$0), Either::left);
    private boolean d;
    @Nullable
    private Vector3f e;
    @Nullable
    private Quaternionf f;
    @Nullable
    private Vector3f g;
    @Nullable
    private Quaternionf h;
    private static final j i = ac.a(() -> {
        j $$0 = new j(new Matrix4f());
        $$0.e = new Vector3f();
        $$0.f = new Quaternionf();
        $$0.g = new Vector3f(1.0f, 1.0f, 1.0f);
        $$0.h = new Quaternionf();
        $$0.d = true;
        return $$0;
    });

    public j(@Nullable Matrix4f $$0) {
        this.c = $$0 == null ? new Matrix4f() : $$0;
    }

    public j(@Nullable Vector3f $$0, @Nullable Quaternionf $$1, @Nullable Vector3f $$2, @Nullable Quaternionf $$3) {
        this.c = j.a($$0, $$1, $$2, $$3);
        this.e = $$0 != null ? $$0 : new Vector3f();
        this.f = $$1 != null ? $$1 : new Quaternionf();
        this.g = $$2 != null ? $$2 : new Vector3f(1.0f, 1.0f, 1.0f);
        this.h = $$3 != null ? $$3 : new Quaternionf();
        this.d = true;
    }

    public static j a() {
        return i;
    }

    public j a(j $$0) {
        Matrix4f $$1 = this.c();
        $$1.mul((Matrix4fc)$$0.c());
        return new j($$1);
    }

    @Nullable
    public j b() {
        if (this == i) {
            return this;
        }
        Matrix4f $$0 = this.c().invert();
        if ($$0.isFinite()) {
            return new j($$0);
        }
        return null;
    }

    private void h() {
        if (!this.d) {
            float $$0 = 1.0f / this.c.m33();
            Triple<Quaternionf, Vector3f, Quaternionf> $$1 = f.a(new Matrix3f((Matrix4fc)this.c).scale($$0));
            this.e = this.c.getTranslation(new Vector3f()).mul($$0);
            this.f = new Quaternionf((Quaternionfc)$$1.getLeft());
            this.g = new Vector3f((Vector3fc)$$1.getMiddle());
            this.h = new Quaternionf((Quaternionfc)$$1.getRight());
            this.d = true;
        }
    }

    private static Matrix4f a(@Nullable Vector3f $$0, @Nullable Quaternionf $$1, @Nullable Vector3f $$2, @Nullable Quaternionf $$3) {
        Matrix4f $$4 = new Matrix4f();
        if ($$0 != null) {
            $$4.translation((Vector3fc)$$0);
        }
        if ($$1 != null) {
            $$4.rotate((Quaternionfc)$$1);
        }
        if ($$2 != null) {
            $$4.scale((Vector3fc)$$2);
        }
        if ($$3 != null) {
            $$4.rotate((Quaternionfc)$$3);
        }
        return $$4;
    }

    public Matrix4f c() {
        return new Matrix4f((Matrix4fc)this.c);
    }

    public Vector3f d() {
        this.h();
        return new Vector3f((Vector3fc)this.e);
    }

    public Quaternionf e() {
        this.h();
        return new Quaternionf((Quaternionfc)this.f);
    }

    public Vector3f f() {
        this.h();
        return new Vector3f((Vector3fc)this.g);
    }

    public Quaternionf g() {
        this.h();
        return new Quaternionf((Quaternionfc)this.h);
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        j $$1 = (j)$$0;
        return Objects.equals(this.c, $$1.c);
    }

    public int hashCode() {
        return Objects.hash(this.c);
    }

    public j a(j $$0, float $$1) {
        Vector3f $$2 = this.d();
        Quaternionf $$3 = this.e();
        Vector3f $$4 = this.f();
        Quaternionf $$5 = this.g();
        $$2.lerp((Vector3fc)$$0.d(), $$1);
        $$3.slerp((Quaternionfc)$$0.e(), $$1);
        $$4.lerp((Vector3fc)$$0.f(), $$1);
        $$5.slerp((Quaternionfc)$$0.g(), $$1);
        return new j($$2, $$3, $$4, $$5);
    }
}

