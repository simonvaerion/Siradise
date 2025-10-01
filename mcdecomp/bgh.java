/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.UUID;
import javax.annotation.Nullable;

public interface bgh {
    @Nullable
    public UUID U_();

    public cmd e();

    @Nullable
    default public bfz I_() {
        UUID $$0 = this.U_();
        if ($$0 == null) {
            return null;
        }
        return this.e().b($$0);
    }
}

