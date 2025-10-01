/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

public class ejy
extends ekf
implements ejz {
    @SerializedName(value="seed")
    private final String a;
    @SerializedName(value="worldTemplateId")
    private final long b;
    @SerializedName(value="levelType")
    private final int c;
    @SerializedName(value="generateStructures")
    private final boolean d;

    public ejy(String $$0, long $$1, int $$2, boolean $$3) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
    }
}

