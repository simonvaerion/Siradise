/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class fzt {
    private boolean a;
    @Nullable
    private fzn.b b;
    @Nullable
    private String c;
    @Nullable
    private final String d;

    public fzt(@Nullable String $$0) {
        this.d = $$0;
    }

    public void a(fzo.a $$0) {
        if (this.c != null) {
            $$0.a(fzn.j, !this.c.equals("vanilla"));
        }
        $$0.a(fzn.k, this.a());
    }

    private fzn.c a() {
        if (enn.N().ar()) {
            return fzn.c.a;
        }
        if (enn.N().R()) {
            return fzn.c.b;
        }
        return fzn.c.c;
    }

    public boolean a(fzk $$02) {
        if (this.a || this.b == null || this.c == null) {
            return false;
        }
        this.a = true;
        $$02.send(fzl.b, $$0 -> {
            $$0.a(fzn.n, this.b);
            if (this.d != null) {
                $$0.a(fzn.o, this.d);
            }
        });
        return true;
    }

    public void a(cmj $$0, boolean $$1) {
        this.b = switch ($$0) {
            default -> throw new IncompatibleClassChangeError();
            case cmj.a -> {
                if ($$1) {
                    yield fzn.b.e;
                }
                yield fzn.b.a;
            }
            case cmj.b -> fzn.b.b;
            case cmj.c -> fzn.b.c;
            case cmj.d -> fzn.b.d;
        };
    }

    public void a(String $$0) {
        this.c = $$0;
    }
}

