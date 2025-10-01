/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.joml.Vector3f
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;
import org.joml.Vector3f;

public class io
extends iq {
    public static final Vector3f a = eei.a(3790560).j();
    public static final io b = new io(a, ip.a, 1.0f);
    public static final Codec<io> c = RecordCodecBuilder.create($$02 -> $$02.group((App)aoi.d.fieldOf("fromColor").forGetter($$0 -> $$0.g), (App)aoi.d.fieldOf("toColor").forGetter($$0 -> $$0.i), (App)Codec.FLOAT.fieldOf("scale").forGetter($$0 -> Float.valueOf($$0.h))).apply((Applicative)$$02, io::new));
    public static final it.a<io> d = new it.a<io>(){

        public io a(iu<io> $$0, StringReader $$1) throws CommandSyntaxException {
            Vector3f $$2 = iq.a($$1);
            $$1.expect(' ');
            float $$3 = $$1.readFloat();
            Vector3f $$4 = iq.a($$1);
            return new io($$2, $$4, $$3);
        }

        public io a(iu<io> $$0, sf $$1) {
            Vector3f $$2 = iq.b($$1);
            float $$3 = $$1.readFloat();
            Vector3f $$4 = iq.b($$1);
            return new io($$2, $$4, $$3);
        }

        @Override
        public /* synthetic */ it b(iu iu2, sf sf2) {
            return this.a((iu<io>)iu2, sf2);
        }

        @Override
        public /* synthetic */ it b(iu iu2, StringReader stringReader) throws CommandSyntaxException {
            return this.a((iu<io>)iu2, stringReader);
        }
    };
    private final Vector3f i;

    public io(Vector3f $$0, Vector3f $$1, float $$2) {
        super($$0, $$2);
        this.i = $$1;
    }

    public Vector3f c() {
        return this.g;
    }

    public Vector3f d() {
        return this.i;
    }

    @Override
    public void a(sf $$0) {
        super.a($$0);
        $$0.writeFloat(this.i.x());
        $$0.writeFloat(this.i.y());
        $$0.writeFloat(this.i.z());
    }

    @Override
    public String a() {
        return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %.2f %.2f %.2f %.2f", jb.k.b(this.b()), Float.valueOf(this.g.x()), Float.valueOf(this.g.y()), Float.valueOf(this.g.z()), Float.valueOf(this.h), Float.valueOf(this.i.x()), Float.valueOf(this.i.y()), Float.valueOf(this.i.z()));
    }

    public iu<io> b() {
        return iv.p;
    }
}

