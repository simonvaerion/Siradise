/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 */
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class etj
extends etk {
    private static final sw k = sw.c("chat.copy");
    private static final sw l = sw.c("chat.link.warning");
    private final String m;
    private final boolean n;

    public etj(BooleanConsumer $$0, String $$1, boolean $$2) {
        this($$0, etj.c($$2), sw.b($$1), $$1, $$2 ? sv.e : sv.g, $$2);
    }

    public etj(BooleanConsumer $$0, sw $$1, String $$2, boolean $$3) {
        this($$0, $$1, $$2, $$3 ? sv.e : sv.g, $$3);
    }

    public etj(BooleanConsumer $$0, sw $$1, String $$2, sw $$3, boolean $$4) {
        this($$0, $$1, etj.a($$4, $$2), $$2, $$3, $$4);
    }

    public etj(BooleanConsumer $$0, sw $$1, sw $$2, String $$3, sw $$4, boolean $$5) {
        super($$0, $$1, $$2);
        this.a = $$5 ? sw.c("chat.link.open") : sv.f;
        this.b = $$4;
        this.n = !$$5;
        this.m = $$3;
    }

    protected static tj a(boolean $$0, String $$1) {
        return etj.c($$0).b(sv.t).b(sw.b($$1));
    }

    protected static tj c(boolean $$0) {
        return sw.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
    }

    @Override
    protected void a(int $$02) {
        this.d(epi.a(this.a, (epi $$0) -> this.c.accept(true)).a(this.g / 2 - 50 - 105, $$02, 100, 20).a());
        this.d(epi.a(k, (epi $$0) -> {
            this.j();
            this.c.accept(false);
        }).a(this.g / 2 - 50, $$02, 100, 20).a());
        this.d(epi.a(this.b, (epi $$0) -> this.c.accept(false)).a(this.g / 2 - 50 + 105, $$02, 100, 20).a());
    }

    public void j() {
        this.f.o.a(this.m);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        if (this.n) {
            $$0.a(this.i, l, this.g / 2, 110, 0xFFCCCC);
        }
    }

    public static void a(String $$0, euq $$1, boolean $$2) {
        enn $$32 = enn.N();
        $$32.a(new etj($$3 -> {
            if ($$3) {
                ac.i().a($$0);
            }
            $$32.a($$1);
        }, $$0, $$2));
    }

    public static epi.c b(String $$0, euq $$1, boolean $$2) {
        return $$3 -> etj.a($$0, $$1, $$2);
    }
}

