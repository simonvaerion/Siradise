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
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;

public record iw(float c) implements it
{
    public static final Codec<iw> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.FLOAT.fieldOf("roll").forGetter($$0 -> Float.valueOf($$0.c))).apply((Applicative)$$02, iw::new));
    public static final it.a<iw> b = new it.a<iw>(){

        public iw a(iu<iw> $$0, StringReader $$1) throws CommandSyntaxException {
            $$1.expect(' ');
            float $$2 = $$1.readFloat();
            return new iw($$2);
        }

        public iw a(iu<iw> $$0, sf $$1) {
            return new iw($$1.readFloat());
        }

        @Override
        public /* synthetic */ it b(iu iu2, sf sf2) {
            return this.a((iu<iw>)iu2, sf2);
        }

        @Override
        public /* synthetic */ it b(iu iu2, StringReader stringReader) throws CommandSyntaxException {
            return this.a((iu<iw>)iu2, stringReader);
        }
    };

    public iu<iw> b() {
        return iv.F;
    }

    @Override
    public void a(sf $$0) {
        $$0.writeFloat(this.c);
    }

    @Override
    public String a() {
        return String.format(Locale.ROOT, "%s %.2f", jb.k.b(this.b()), Float.valueOf(this.c));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{iw.class, "roll", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{iw.class, "roll", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{iw.class, "roll", "c"}, this, $$0);
    }
}

