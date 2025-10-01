/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.lwjgl.stb.STBTTFontinfo
 *  org.lwjgl.stb.STBTruetype
 *  org.lwjgl.system.MemoryUtil
 */
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import java.util.List;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTruetype;
import org.lwjgl.system.MemoryUtil;

public record esa(acq c, float d, float e, a f, String g) implements erx
{
    private static final Codec<String> h = Codec.either((Codec)Codec.STRING, (Codec)Codec.STRING.listOf()).xmap($$02 -> (String)$$02.map($$0 -> $$0, $$0 -> String.join((CharSequence)"", $$0)), Either::left);
    public static final MapCodec<esa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)acq.a.fieldOf("file").forGetter(esa::c), (App)Codec.FLOAT.optionalFieldOf("size", (Object)Float.valueOf(11.0f)).forGetter(esa::d), (App)Codec.FLOAT.optionalFieldOf("oversample", (Object)Float.valueOf(1.0f)).forGetter(esa::e), (App)esa$a.b.optionalFieldOf("shift", (Object)esa$a.a).forGetter(esa::f), (App)h.optionalFieldOf("skip", (Object)"").forGetter(esa::g)).apply((Applicative)$$0, esa::new));

    @Override
    public ery a() {
        return ery.b;
    }

    @Override
    public Either<erx.a, erx.b> b() {
        return Either.left(this::a);
    }

    private egm a(akx $$0) throws IOException {
        egp egp2;
        block10: {
            STBTTFontinfo $$1 = null;
            ByteBuffer $$2 = null;
            InputStream $$3 = $$0.open(this.c.d("font/"));
            try {
                $$1 = STBTTFontinfo.malloc();
                $$2 = TextureUtil.readResource($$3);
                $$2.flip();
                if (!STBTruetype.stbtt_InitFont((STBTTFontinfo)$$1, (ByteBuffer)$$2)) {
                    throw new IOException("Invalid ttf");
                }
                egp2 = new egp($$2, $$1, this.d, this.e, this.f.c, this.f.d, this.g);
                if ($$3 == null) break block10;
            }
            catch (Throwable throwable) {
                try {
                    if ($$3 != null) {
                        try {
                            $$3.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception $$4) {
                    if ($$1 != null) {
                        $$1.free();
                    }
                    MemoryUtil.memFree($$2);
                    throw $$4;
                }
            }
            $$3.close();
        }
        return egp2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{esa.class, "location;size;oversample;shift;skip", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{esa.class, "location;size;oversample;shift;skip", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{esa.class, "location;size;oversample;shift;skip", "c", "d", "e", "f", "g"}, this, $$0);
    }

    public static final class a
    extends Record {
        final float c;
        final float d;
        public static final a a = new a(0.0f, 0.0f);
        public static final Codec<a> b = Codec.FLOAT.listOf().comapFlatMap($$02 -> ac.a($$02, 2).map($$0 -> new a(((Float)$$0.get(0)).floatValue(), ((Float)$$0.get(1)).floatValue())), $$0 -> List.of(Float.valueOf($$0.c), Float.valueOf($$0.d)));

        public a(float $$0, float $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "x;y", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "x;y", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "x;y", "c", "d"}, this, $$0);
        }

        public float a() {
            return this.c;
        }

        public float b() {
            return this.d;
        }
    }
}

