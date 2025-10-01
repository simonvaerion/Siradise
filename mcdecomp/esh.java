/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public interface esh
extends esi {
    public void b(Consumer<esi> var1);

    @Override
    default public void a(Consumer<epf> $$0) {
        this.b($$1 -> $$1.a($$0));
    }

    default public void c() {
        this.b($$0 -> {
            if ($$0 instanceof esh) {
                esh $$1 = (esh)$$0;
                $$1.c();
            }
        });
    }
}

