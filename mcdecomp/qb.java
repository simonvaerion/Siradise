/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class qb
implements qk {
    private static final Logger a = LogUtils.getLogger();

    @Override
    public void a(pr $$0) {
        if ($$0.r()) {
            a.error("{} failed! {}", (Object)$$0.c(), (Object)ac.c($$0.n()));
        } else {
            a.warn("(optional) {} failed. {}", (Object)$$0.c(), (Object)ac.c($$0.n()));
        }
    }

    @Override
    public void b(pr $$0) {
    }
}

