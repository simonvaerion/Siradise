/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.util.Locale;

public class eka
extends ekf
implements ejz {
    @SerializedName(value="regionName")
    private final String a;
    @SerializedName(value="ping")
    private final int b;

    public eka(String $$0, int $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public int a() {
        return this.b;
    }

    @Override
    public String toString() {
        return String.format(Locale.ROOT, "%s --> %.2f ms", this.a, Float.valueOf(this.b));
    }
}

