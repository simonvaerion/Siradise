/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.BooleanSupplier;

public class eob
extends enl {
    private final BooleanSupplier h;

    public eob(String $$0, int $$1, String $$2, BooleanSupplier $$3) {
        super($$0, ehe.b.a, $$1, $$2);
        this.h = $$3;
    }

    @Override
    public void a(boolean $$0) {
        if (this.h.getAsBoolean()) {
            if ($$0) {
                super.a(!this.e());
            }
        } else {
            super.a($$0);
        }
    }

    protected void n() {
        super.a(false);
    }
}

