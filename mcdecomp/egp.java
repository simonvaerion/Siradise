/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArraySet
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  javax.annotation.Nullable
 *  org.lwjgl.stb.STBTTFontinfo
 *  org.lwjgl.stb.STBTruetype
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 */
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.function.Function;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTruetype;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class egp
implements egm {
    @Nullable
    private ByteBuffer a;
    @Nullable
    private STBTTFontinfo b;
    final float c;
    private final IntSet d = new IntArraySet();
    final float e;
    final float f;
    final float g;
    final float h;

    public egp(ByteBuffer $$0, STBTTFontinfo $$1, float $$2, float $$3, float $$4, float $$5, String $$6) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$3;
        $$6.codePoints().forEach(arg_0 -> ((IntSet)this.d).add(arg_0));
        this.e = $$4 * $$3;
        this.f = $$5 * $$3;
        this.g = STBTruetype.stbtt_ScaleForPixelHeight((STBTTFontinfo)$$1, (float)($$2 * $$3));
        try (MemoryStack $$7 = MemoryStack.stackPush();){
            IntBuffer $$8 = $$7.mallocInt(1);
            IntBuffer $$9 = $$7.mallocInt(1);
            IntBuffer $$10 = $$7.mallocInt(1);
            STBTruetype.stbtt_GetFontVMetrics((STBTTFontinfo)$$1, (IntBuffer)$$8, (IntBuffer)$$9, (IntBuffer)$$10);
            this.h = (float)$$8.get(0) * this.g;
        }
    }

    @Override
    @Nullable
    public egl a(int $$0) {
        STBTTFontinfo $$1 = this.b();
        if (this.d.contains($$0)) {
            return null;
        }
        try (MemoryStack $$2 = MemoryStack.stackPush();){
            int $$3 = STBTruetype.stbtt_FindGlyphIndex((STBTTFontinfo)$$1, (int)$$0);
            if ($$3 == 0) {
                egl egl2 = null;
                return egl2;
            }
            IntBuffer $$4 = $$2.mallocInt(1);
            IntBuffer $$5 = $$2.mallocInt(1);
            IntBuffer $$6 = $$2.mallocInt(1);
            IntBuffer $$7 = $$2.mallocInt(1);
            IntBuffer $$8 = $$2.mallocInt(1);
            IntBuffer $$9 = $$2.mallocInt(1);
            STBTruetype.stbtt_GetGlyphHMetrics((STBTTFontinfo)$$1, (int)$$3, (IntBuffer)$$8, (IntBuffer)$$9);
            STBTruetype.stbtt_GetGlyphBitmapBoxSubpixel((STBTTFontinfo)$$1, (int)$$3, (float)this.g, (float)this.g, (float)this.e, (float)this.f, (IntBuffer)$$4, (IntBuffer)$$5, (IntBuffer)$$6, (IntBuffer)$$7);
            float $$10 = (float)$$8.get(0) * this.g;
            int $$11 = $$6.get(0) - $$4.get(0);
            int $$12 = $$7.get(0) - $$5.get(0);
            if ($$11 <= 0 || $$12 <= 0) {
                egl.a a2 = () -> $$10 / this.c;
                return a2;
            }
            a a3 = new a($$4.get(0), $$6.get(0), -$$5.get(0), -$$7.get(0), $$10, (float)$$9.get(0) * this.g, $$3);
            return a3;
        }
    }

    STBTTFontinfo b() {
        if (this.a == null || this.b == null) {
            throw new IllegalArgumentException("Provider already closed");
        }
        return this.b;
    }

    @Override
    public void close() {
        if (this.b != null) {
            this.b.free();
            this.b = null;
        }
        MemoryUtil.memFree((Buffer)this.a);
        this.a = null;
    }

    @Override
    public IntSet a() {
        return (IntSet)IntStream.range(0, 65535).filter($$0 -> !this.d.contains($$0)).collect(IntOpenHashSet::new, IntCollection::add, IntCollection::addAll);
    }

    class a
    implements egl {
        final int b;
        final int c;
        final float d;
        final float e;
        private final float f;
        final int g;

        a(int $$0, int $$1, int $$2, int $$3, float $$4, float $$5, int $$6) {
            this.b = $$1 - $$0;
            this.c = $$2 - $$3;
            this.f = $$4 / egp.this.c;
            this.d = ($$5 + (float)$$0 + egp.this.e) / egp.this.c;
            this.e = (egp.this.h - (float)$$2 + egp.this.f) / egp.this.c;
            this.g = $$6;
        }

        @Override
        public float getAdvance() {
            return this.f;
        }

        @Override
        public err bake(Function<egn, err> $$0) {
            return $$0.apply(new egn(){

                @Override
                public int a() {
                    return a.this.b;
                }

                @Override
                public int b() {
                    return a.this.c;
                }

                @Override
                public float d() {
                    return egp.this.c;
                }

                @Override
                public float i() {
                    return a.this.d;
                }

                @Override
                public float j() {
                    return a.this.e;
                }

                @Override
                public void a(int $$0, int $$1) {
                    STBTTFontinfo $$2 = egp.this.b();
                    ehk $$3 = new ehk(ehk.a.d, a.this.b, a.this.c, false);
                    $$3.a($$2, a.this.g, a.this.b, a.this.c, egp.this.g, egp.this.g, egp.this.e, egp.this.f, 0, 0);
                    $$3.a(0, $$0, $$1, 0, 0, a.this.b, a.this.c, false, true);
                }

                @Override
                public boolean c() {
                    return false;
                }
            });
        }
    }
}

