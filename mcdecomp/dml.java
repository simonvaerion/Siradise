/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dml
implements dms {
    public static final Codec<dml> a = dcb.b.fieldOf("state").xmap(dml::new, $$0 -> $$0.b).codec();
    public final dcb b;

    public dml(dcb $$0) {
        this.b = $$0;
    }
}

