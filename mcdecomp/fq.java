/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class fq {
    private static final char c = '~';
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("argument.pos.missing.double"));
    public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("argument.pos.missing.int"));
    private final boolean d;
    private final double e;

    public fq(boolean $$0, double $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public double a(double $$0) {
        if (this.d) {
            return this.e + $$0;
        }
        return this.e;
    }

    public static fq a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
        if ($$0.canRead() && $$0.peek() == '^') {
            throw fp.b.createWithContext((ImmutableStringReader)$$0);
        }
        if (!$$0.canRead()) {
            throw a.createWithContext((ImmutableStringReader)$$0);
        }
        boolean $$2 = fq.b($$0);
        int $$3 = $$0.getCursor();
        double $$4 = $$0.canRead() && $$0.peek() != ' ' ? $$0.readDouble() : 0.0;
        String $$5 = $$0.getString().substring($$3, $$0.getCursor());
        if ($$2 && $$5.isEmpty()) {
            return new fq(true, 0.0);
        }
        if (!$$5.contains(".") && !$$2 && $$1) {
            $$4 += 0.5;
        }
        return new fq($$2, $$4);
    }

    public static fq a(StringReader $$0) throws CommandSyntaxException {
        double $$3;
        if ($$0.canRead() && $$0.peek() == '^') {
            throw fp.b.createWithContext((ImmutableStringReader)$$0);
        }
        if (!$$0.canRead()) {
            throw b.createWithContext((ImmutableStringReader)$$0);
        }
        boolean $$1 = fq.b($$0);
        if ($$0.canRead() && $$0.peek() != ' ') {
            double $$2 = $$1 ? $$0.readDouble() : (double)$$0.readInt();
        } else {
            $$3 = 0.0;
        }
        return new fq($$1, $$3);
    }

    public static boolean b(StringReader $$0) {
        boolean $$2;
        if ($$0.peek() == '~') {
            boolean $$1 = true;
            $$0.skip();
        } else {
            $$2 = false;
        }
        return $$2;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof fq)) {
            return false;
        }
        fq $$1 = (fq)$$0;
        if (this.d != $$1.d) {
            return false;
        }
        return Double.compare($$1.e, this.e) == 0;
    }

    public int hashCode() {
        int $$0 = this.d ? 1 : 0;
        long $$1 = Double.doubleToLongBits(this.e);
        $$0 = 31 * $$0 + (int)($$1 ^ $$1 >>> 32);
        return $$0;
    }

    public boolean a() {
        return this.d;
    }
}

