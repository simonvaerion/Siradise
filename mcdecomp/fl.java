/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;

public class fl
implements fk {
    public static final char a = '^';
    private final double b;
    private final double c;
    private final double d;

    public fl(double $$0, double $$1, double $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    @Override
    public eei a(ds $$0) {
        eeh $$1 = $$0.k();
        eei $$2 = $$0.m().a($$0);
        float $$3 = apa.b(($$1.j + 90.0f) * ((float)Math.PI / 180));
        float $$4 = apa.a(($$1.j + 90.0f) * ((float)Math.PI / 180));
        float $$5 = apa.b(-$$1.i * ((float)Math.PI / 180));
        float $$6 = apa.a(-$$1.i * ((float)Math.PI / 180));
        float $$7 = apa.b((-$$1.i + 90.0f) * ((float)Math.PI / 180));
        float $$8 = apa.a((-$$1.i + 90.0f) * ((float)Math.PI / 180));
        eei $$9 = new eei($$3 * $$5, $$6, $$4 * $$5);
        eei $$10 = new eei($$3 * $$7, $$8, $$4 * $$7);
        eei $$11 = $$9.c($$10).a(-1.0);
        double $$12 = $$9.c * this.d + $$10.c * this.c + $$11.c * this.b;
        double $$13 = $$9.d * this.d + $$10.d * this.c + $$11.d * this.b;
        double $$14 = $$9.e * this.d + $$10.e * this.c + $$11.e * this.b;
        return new eei($$2.c + $$12, $$2.d + $$13, $$2.e + $$14);
    }

    @Override
    public eeh b(ds $$0) {
        return eeh.a;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public boolean c() {
        return true;
    }

    public static fl a(StringReader $$0) throws CommandSyntaxException {
        int $$1 = $$0.getCursor();
        double $$2 = fl.a($$0, $$1);
        if (!$$0.canRead() || $$0.peek() != ' ') {
            $$0.setCursor($$1);
            throw fp.a.createWithContext((ImmutableStringReader)$$0);
        }
        $$0.skip();
        double $$3 = fl.a($$0, $$1);
        if (!$$0.canRead() || $$0.peek() != ' ') {
            $$0.setCursor($$1);
            throw fp.a.createWithContext((ImmutableStringReader)$$0);
        }
        $$0.skip();
        double $$4 = fl.a($$0, $$1);
        return new fl($$2, $$3, $$4);
    }

    private static double a(StringReader $$0, int $$1) throws CommandSyntaxException {
        if (!$$0.canRead()) {
            throw fq.a.createWithContext((ImmutableStringReader)$$0);
        }
        if ($$0.peek() != '^') {
            $$0.setCursor($$1);
            throw fp.b.createWithContext((ImmutableStringReader)$$0);
        }
        $$0.skip();
        return $$0.canRead() && $$0.peek() != ' ' ? $$0.readDouble() : 0.0;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof fl)) {
            return false;
        }
        fl $$1 = (fl)$$0;
        return this.b == $$1.b && this.c == $$1.c && this.d == $$1.d;
    }

    public int hashCode() {
        return Objects.hash(this.b, this.c, this.d);
    }
}

