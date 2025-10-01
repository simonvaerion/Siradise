/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.concurrent.Immutable
 */
import javax.annotation.concurrent.Immutable;

@Immutable
public class bdz {
    public static final bdz a = new bdz("");
    public static final String b = "Lock";
    private final String c;

    public bdz(String $$0) {
        this.c = $$0;
    }

    public boolean a(cfz $$0) {
        return this.c.isEmpty() || !$$0.b() && $$0.A() && this.c.equals($$0.y().getString());
    }

    public void a(qr $$0) {
        if (!this.c.isEmpty()) {
            $$0.a(b, this.c);
        }
    }

    public static bdz b(qr $$0) {
        if ($$0.b(b, 8)) {
            return new bdz($$0.l(b));
        }
        return a;
    }
}

