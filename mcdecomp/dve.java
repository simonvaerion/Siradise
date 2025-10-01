/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dve
extends dvq {
    public static final Codec<dve> a = Codec.unit(() -> b);
    public static final dve b = new dve();

    private dve() {
    }

    @Override
    protected dvs<?> a() {
        return dvs.j;
    }
}

