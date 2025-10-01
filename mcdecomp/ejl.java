/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.annotations.SerializedName
 */
import com.google.common.collect.Lists;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ejl
extends ekf
implements ejz {
    @SerializedName(value="pingResults")
    public List<eka> a = Lists.newArrayList();
    @SerializedName(value="worldIds")
    public List<Long> b = Lists.newArrayList();
}

