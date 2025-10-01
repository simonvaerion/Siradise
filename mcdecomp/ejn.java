/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

public class ejn
extends ekf
implements ejz {
    @SerializedName(value="name")
    public String a;
    @SerializedName(value="description")
    public String b;

    public ejn(String $$0, String $$1) {
        this.a = $$0;
        this.b = $$1;
    }
}

