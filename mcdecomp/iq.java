/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  org.joml.Vector3f
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Locale;
import org.joml.Vector3f;

public abstract class iq
implements it {
    public static final float e = 0.01f;
    public static final float f = 4.0f;
    protected final Vector3f g;
    protected final float h;

    public iq(Vector3f $$0, float $$1) {
        this.g = $$0;
        this.h = apa.a($$1, 0.01f, 4.0f);
    }

    public static Vector3f a(StringReader $$0) throws CommandSyntaxException {
        $$0.expect(' ');
        float $$1 = $$0.readFloat();
        $$0.expect(' ');
        float $$2 = $$0.readFloat();
        $$0.expect(' ');
        float $$3 = $$0.readFloat();
        return new Vector3f($$1, $$2, $$3);
    }

    public static Vector3f b(sf $$0) {
        return new Vector3f($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
    }

    @Override
    public void a(sf $$0) {
        $$0.writeFloat(this.g.x());
        $$0.writeFloat(this.g.y());
        $$0.writeFloat(this.g.z());
        $$0.writeFloat(this.h);
    }

    @Override
    public String a() {
        return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %.2f", jb.k.b(this.b()), Float.valueOf(this.g.x()), Float.valueOf(this.g.y()), Float.valueOf(this.g.z()), Float.valueOf(this.h));
    }

    public Vector3f e() {
        return this.g;
    }

    public float f() {
        return this.h;
    }
}

