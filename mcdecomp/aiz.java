/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.server.MinecraftServer;

public class aiz
implements abc {
    private static final sw a = sw.c("disconnect.ignoring_status_request");
    private final MinecraftServer b;
    private final sd c;

    public aiz(MinecraftServer $$0, sd $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public void a(abb $$0) {
        switch ($$0.a()) {
            case d: {
                this.c.a(se.d);
                if ($$0.c() != aa.b().e()) {
                    tj $$2;
                    if ($$0.c() < 754) {
                        tj $$1 = sw.a("multiplayer.disconnect.outdated_client", new Object[]{aa.b().c()});
                    } else {
                        $$2 = sw.a("multiplayer.disconnect.incompatible", new Object[]{aa.b().c()});
                    }
                    this.c.a(new abj($$2));
                    this.c.a($$2);
                    break;
                }
                this.c.a(new aja(this.b, this.c));
                break;
            }
            case c: {
                abt $$3 = this.b.aq();
                if (this.b.ai() && $$3 != null) {
                    this.c.a(se.c);
                    this.c.a(new ajc($$3, this.c));
                    break;
                }
                this.c.a(a);
                break;
            }
            default: {
                throw new UnsupportedOperationException("Invalid intention " + $$0.a());
            }
        }
    }

    @Override
    public void a(sw $$0) {
    }

    @Override
    public boolean a() {
        return this.c.h();
    }
}

