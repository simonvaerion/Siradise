/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class emp
extends emo {
    private static final Logger c = LogUtils.getLogger();
    private final ejq d;
    private final euq e;
    private final boolean f;
    private final eiu g;
    private final enn h;

    public emp(ejq $$0, euq $$1, eiu $$2, boolean $$3, enn $$4) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$3;
        this.g = $$2;
        this.h = $$4;
    }

    @Override
    public void run() {
        this.b(sw.c("mco.configure.world.opening"));
        eiz $$0 = eiz.a();
        for (int $$1 = 0; $$1 < 25; ++$$1) {
            if (this.c()) {
                return;
            }
            try {
                boolean $$2 = $$0.f(this.d.a);
                if (!$$2) continue;
                this.h.execute(() -> {
                    if (this.e instanceof ela) {
                        ((ela)this.e).c();
                    }
                    this.d.e = ejq.b.b;
                    if (this.f) {
                        this.g.a(this.d, this.e);
                    } else {
                        this.h.a(this.e);
                    }
                });
                break;
            }
            catch (ekn $$3) {
                if (this.c()) {
                    return;
                }
                emp.a($$3.e);
                continue;
            }
            catch (Exception $$4) {
                if (this.c()) {
                    return;
                }
                c.error("Failed to open server", (Throwable)$$4);
                this.a("Failed to open the server");
            }
        }
    }
}

