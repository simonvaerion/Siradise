/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ik
extends ii {
    private static final Logger c = LogUtils.getLogger();

    @Override
    protected cfz a(gv $$0, cfz $$1) {
        this.a(false);
        cfu $$2 = $$1.d();
        if ($$2 instanceof cds) {
            ha $$3 = $$0.e().c(cro.a);
            gu $$4 = $$0.d().a($$3);
            ha $$5 = $$0.g().t($$4.d()) ? $$3 : ha.b;
            try {
                this.a(((cds)$$2).a(new cii((cmm)$$0.g(), $$4, $$3, $$1, $$5)).a());
            }
            catch (Exception $$6) {
                c.error("Error trying to place shulker box at {}", (Object)$$4, (Object)$$6);
            }
        }
        return $$1;
    }
}

