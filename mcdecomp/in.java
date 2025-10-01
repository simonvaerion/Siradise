/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.Codec
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class in
implements it {
    public static final it.a<in> a = new it.a<in>(){

        public in a(iu<in> $$0, StringReader $$1) throws CommandSyntaxException {
            $$1.expect(' ');
            return new in($$0, fg.a(jb.f.p(), $$1, false).a());
        }

        public in a(iu<in> $$0, sf $$1) {
            return new in($$0, $$1.a(cpn.o));
        }

        @Override
        public /* synthetic */ it b(iu iu2, sf sf2) {
            return this.a((iu<in>)iu2, sf2);
        }

        @Override
        public /* synthetic */ it b(iu iu2, StringReader stringReader) throws CommandSyntaxException {
            return this.a((iu<in>)iu2, stringReader);
        }
    };
    private final iu<in> b;
    private final dcb c;

    public static Codec<in> a(iu<in> $$02) {
        return dcb.b.xmap($$1 -> new in($$02, (dcb)$$1), $$0 -> $$0.c);
    }

    public in(iu<in> $$0, dcb $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public void a(sf $$0) {
        $$0.a(cpn.o, this.c);
    }

    @Override
    public String a() {
        return jb.k.b(this.b()) + " " + fg.a(this.c);
    }

    public iu<in> b() {
        return this.b;
    }

    public dcb c() {
        return this.c;
    }
}

