/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface ccr {
    public void a(@Nullable cjc<?> var1);

    @Nullable
    public cjc<?> d();

    default public void a(byo $$0, List<cfz> $$1) {
        cjc<?> $$2 = this.d();
        if ($$2 != null) {
            $$0.a($$2, $$1);
            if (!$$2.ai_()) {
                $$0.a(Collections.singleton($$2));
                this.a(null);
            }
        }
    }

    default public boolean a(cmm $$0, aig $$1, cjc<?> $$2) {
        if ($$2.ai_() || !$$0.X().b(cmi.v) || $$1.E().b($$2)) {
            this.a($$2);
            return true;
        }
        return false;
    }
}

