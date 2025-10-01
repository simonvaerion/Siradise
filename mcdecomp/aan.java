/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class aan
implements uo<zb> {
    private final Optional<bey> a;
    private final Optional<bey> b;

    public aan(Optional<bey> $$0, Optional<bey> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public aan(sf $$02) {
        this.a = $$02.b($$0 -> $$0.a(jb.e));
        this.b = $$02.b($$0 -> $$0.a(jb.e));
    }

    @Override
    public void a(sf $$02) {
        $$02.a(this.a, ($$0, $$1) -> $$0.a(jb.e, $$1));
        $$02.a(this.b, ($$0, $$1) -> $$0.a(jb.e, $$1));
    }

    @Override
    public void a(zb $$0) {
        $$0.a(this);
    }

    public Optional<bey> a() {
        return this.a;
    }

    public Optional<bey> c() {
        return this.b;
    }
}

