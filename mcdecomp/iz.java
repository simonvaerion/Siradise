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

public class iz
implements it {
    public static final Codec<iz> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dgp.b.fieldOf("destination").forGetter($$0 -> $$0.c), (App)Codec.INT.fieldOf("arrival_in_ticks").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, iz::new));
    public static final it.a<iz> b = new it.a<iz>(){

        public iz a(iu<iz> $$0, StringReader $$1) throws CommandSyntaxException {
            $$1.expect(' ');
            float $$2 = (float)$$1.readDouble();
            $$1.expect(' ');
            float $$3 = (float)$$1.readDouble();
            $$1.expect(' ');
            float $$4 = (float)$$1.readDouble();
            $$1.expect(' ');
            int $$5 = $$1.readInt();
            gu $$6 = gu.a($$2, $$3, $$4);
            return new iz(new dgh($$6), $$5);
        }

        public iz a(iu<iz> $$0, sf $$1) {
            dgp $$2 = dgq.c($$1);
            int $$3 = $$1.m();
            return new iz($$2, $$3);
        }

        @Override
        public /* synthetic */ it b(iu iu2, sf sf2) {
            return this.a((iu<iz>)iu2, sf2);
        }

        @Override
        public /* synthetic */ it b(iu iu2, StringReader stringReader) throws CommandSyntaxException {
            return this.a((iu<iz>)iu2, stringReader);
        }
    };
    private final dgp c;
    private final int d;

    public iz(dgp $$0, int $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public void a(sf $$0) {
        dgq.a(this.c, $$0);
        $$0.d(this.d);
    }

    @Override
    public String a() {
        eei $$0 = this.c.a(null).get();
        double $$1 = $$0.a();
        double $$2 = $$0.b();
        double $$3 = $$0.c();
        return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %d", jb.k.b(this.b()), $$1, $$2, $$3, this.d);
    }

    public iu<iz> b() {
        return iv.P;
    }

    public dgp c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }
}

