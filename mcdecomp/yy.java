/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public class yy
implements uo<ur> {
    private final Map<acp<? extends hr<?>>, ano.a> a;

    public yy(Map<acp<? extends hr<?>>, ano.a> $$0) {
        this.a = $$0;
    }

    public yy(sf $$02) {
        this.a = $$02.a($$0 -> acp.a($$0.t()), ano.a::b);
    }

    @Override
    public void a(sf $$02) {
        $$02.a(this.a, ($$0, $$1) -> $$0.a($$1.a()), ($$0, $$1) -> $$1.a((sf)((Object)$$0)));
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    public Map<acp<? extends hr<?>>, ano.a> a() {
        return this.a;
    }
}

