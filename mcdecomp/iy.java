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

public class iy
extends iu<iy>
implements it {
    private static final it.a<iy> a = new it.a<iy>(){

        public iy a(iu<iy> $$0, StringReader $$1) {
            return (iy)$$0;
        }

        public iy a(iu<iy> $$0, sf $$1) {
            return (iy)$$0;
        }

        @Override
        public /* synthetic */ it b(iu iu2, sf sf2) {
            return this.a((iu<iy>)iu2, sf2);
        }

        @Override
        public /* synthetic */ it b(iu iu2, StringReader stringReader) throws CommandSyntaxException {
            return this.a((iu<iy>)iu2, stringReader);
        }
    };
    private final Codec<iy> b = Codec.unit(this::f);

    protected iy(boolean $$0) {
        super($$0, a);
    }

    public iy f() {
        return this;
    }

    @Override
    public Codec<iy> e() {
        return this.b;
    }

    @Override
    public void a(sf $$0) {
    }

    @Override
    public String a() {
        return jb.k.b(this).toString();
    }

    public /* synthetic */ iu b() {
        return this.f();
    }
}

