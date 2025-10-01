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
import org.joml.Vector3f;

public class ip
extends iq {
    public static final Vector3f a = eei.a(0xFF0000).j();
    public static final ip b = new ip(a, 1.0f);
    public static final Codec<ip> c = RecordCodecBuilder.create($$02 -> $$02.group((App)aoi.d.fieldOf("color").forGetter($$0 -> $$0.g), (App)Codec.FLOAT.fieldOf("scale").forGetter($$0 -> Float.valueOf($$0.h))).apply((Applicative)$$02, ip::new));
    public static final it.a<ip> d = new it.a<ip>(){

        public ip a(iu<ip> $$0, StringReader $$1) throws CommandSyntaxException {
            Vector3f $$2 = iq.a($$1);
            $$1.expect(' ');
            float $$3 = $$1.readFloat();
            return new ip($$2, $$3);
        }

        public ip a(iu<ip> $$0, sf $$1) {
            return new ip(iq.b($$1), $$1.readFloat());
        }

        @Override
        public /* synthetic */ it b(iu iu2, sf sf2) {
            return this.a((iu<ip>)iu2, sf2);
        }

        @Override
        public /* synthetic */ it b(iu iu2, StringReader stringReader) throws CommandSyntaxException {
            return this.a((iu<ip>)iu2, stringReader);
        }
    };

    public ip(Vector3f $$0, float $$1) {
        super($$0, $$1);
    }

    public iu<ip> b() {
        return iv.o;
    }
}

