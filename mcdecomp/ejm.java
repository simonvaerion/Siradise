/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

public class ejm
extends ekf
implements ejz {
    @SerializedName(value="name")
    private String a;
    @SerializedName(value="uuid")
    private String b;
    @SerializedName(value="operator")
    private boolean c;
    @SerializedName(value="accepted")
    private boolean d;
    @SerializedName(value="online")
    private boolean e;

    public String a() {
        return this.a;
    }

    public void a(String $$0) {
        this.a = $$0;
    }

    public String b() {
        return this.b;
    }

    public void b(String $$0) {
        this.b = $$0;
    }

    public boolean c() {
        return this.c;
    }

    public void a(boolean $$0) {
        this.c = $$0;
    }

    public boolean d() {
        return this.d;
    }

    public void b(boolean $$0) {
        this.d = $$0;
    }

    public boolean e() {
        return this.e;
    }

    public void c(boolean $$0) {
        this.e = $$0;
    }
}

