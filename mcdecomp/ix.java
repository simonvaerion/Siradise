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
import java.util.Locale;

public class ix
implements it {
    public static final Codec<ix> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.INT.fieldOf("delay").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, ix::new));
    public static final it.a<ix> b = new it.a<ix>(){

        public ix a(iu<ix> $$0, StringReader $$1) throws CommandSyntaxException {
            $$1.expect(' ');
            int $$2 = $$1.readInt();
            return new ix($$2);
        }

        public ix a(iu<ix> $$0, sf $$1) {
            return new ix($$1.m());
        }

        @Override
        public /* synthetic */ it b(iu iu2, sf sf2) {
            return this.a((iu<ix>)iu2, sf2);
        }

        @Override
        public /* synthetic */ it b(iu iu2, StringReader stringReader) throws CommandSyntaxException {
            return this.a((iu<ix>)iu2, stringReader);
        }
    };
    private final int c;

    public ix(int $$0) {
        this.c = $$0;
    }

    @Override
    public void a(sf $$0) {
        $$0.d(this.c);
    }

    @Override
    public String a() {
        return String.format(Locale.ROOT, "%s %d", jb.k.b(this.b()), this.c);
    }

    public iu<ix> b() {
        return iv.aP;
    }

    public int c() {
        return this.c;
    }
}

