/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  javax.annotation.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import java.util.Locale;
import javax.annotation.Nullable;

public class fwy
extends acq {
    @VisibleForTesting
    static final char e = '#';
    private final String f;

    private fwy(String $$0, String $$1, String $$2, @Nullable acq.a $$3) {
        super($$0, $$1, $$3);
        this.f = $$2;
    }

    public fwy(String $$0, String $$1, String $$2) {
        super($$0, $$1);
        this.f = fwy.h($$2);
    }

    public fwy(acq $$0, String $$1) {
        this($$0.b(), $$0.a(), fwy.h($$1), null);
    }

    public static fwy c(String $$0, String $$1) {
        return new fwy("minecraft", $$0, $$1);
    }

    private static String h(String $$0) {
        return $$0.toLowerCase(Locale.ROOT);
    }

    public String f() {
        return this.f;
    }

    @Override
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof fwy && super.equals($$0)) {
            fwy $$1 = (fwy)$$0;
            return this.f.equals($$1.f);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + this.f.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + "#" + this.f;
    }
}

