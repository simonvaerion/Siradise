/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 */
import com.google.common.annotations.VisibleForTesting;

public interface dhx {
    default public apf a(gu $$0) {
        return this.a($$0.u(), $$0.v(), $$0.w());
    }

    default public apf a(acq $$0) {
        return this.a($$0.toString());
    }

    public apf a(String var1);

    public apf a(int var1, int var2, int var3);

    @VisibleForTesting
    public void a(StringBuilder var1);
}

