/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Map;
import javax.annotation.Nullable;

public class chi
extends cds {
    protected final cpn d;
    private final ha c;

    public chi(cpn $$0, cpn $$1, cfu.a $$2, ha $$3) {
        super($$0, $$2);
        this.d = $$1;
        this.c = $$3;
    }

    protected boolean a(cmp $$0, dcb $$1, gu $$2) {
        return $$1.a($$0, $$2);
    }

    @Override
    @Nullable
    protected dcb c(cih $$0) {
        dcb $$1 = this.d.a($$0);
        dcb $$2 = null;
        cmm $$3 = $$0.q();
        gu $$4 = $$0.a();
        for (ha $$5 : $$0.f()) {
            dcb $$6;
            if ($$5 == this.c.g()) continue;
            dcb dcb2 = $$6 = $$5 == this.c ? this.e().a($$0) : $$1;
            if ($$6 == null || !this.a((cmp)$$3, $$6, $$4)) continue;
            $$2 = $$6;
            break;
        }
        return $$2 != null && $$3.a($$2, $$4, een.a()) ? $$2 : null;
    }

    @Override
    public void a(Map<cpn, cfu> $$0, cfu $$1) {
        super.a($$0, $$1);
        $$0.put(this.d, $$1);
    }
}

