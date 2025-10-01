/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class emt
extends emo {
    private static final Logger c = LogUtils.getLogger();
    private final ejf d;
    private final long e;
    private final ela f;

    public emt(ejf $$0, long $$1, ela $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    @Override
    public void run() {
        this.b(sw.c("mco.backup.restoring"));
        eiz $$0 = eiz.a();
        for (int $$1 = 0; $$1 < 25; ++$$1) {
            try {
                if (this.c()) {
                    return;
                }
                $$0.c(this.e, this.d.a);
                emt.a(1L);
                if (this.c()) {
                    return;
                }
                emt.a(this.f.d());
                return;
            }
            catch (ekn $$2) {
                if (this.c()) {
                    return;
                }
                emt.a($$2.e);
                continue;
            }
            catch (ekm $$3) {
                if (this.c()) {
                    return;
                }
                c.error("Couldn't restore backup", (Throwable)$$3);
                emt.a(new ele($$3, (euq)this.f));
                return;
            }
            catch (Exception $$4) {
                if (this.c()) {
                    return;
                }
                c.error("Couldn't restore backup", (Throwable)$$4);
                this.a($$4.getLocalizedMessage());
                return;
            }
        }
    }
}

