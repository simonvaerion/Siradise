/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dmk
implements dms {
    public static final Codec<dmk> a = dot.a.fieldOf("state_provider").xmap(dmk::new, $$0 -> $$0.b).codec();
    public final dot b;

    public dmk(dot $$0) {
        this.b = $$0;
    }
}

