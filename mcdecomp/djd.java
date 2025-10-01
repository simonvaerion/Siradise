/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

class djd
implements dir {
    public static djd a = new djd();
    public static final Codec<djd> e = Codec.unit(() -> a);

    private djd() {
    }

    public boolean a(cng $$0, gu $$1) {
        return true;
    }

    @Override
    public dis<?> a() {
        return dis.l;
    }

    @Override
    public /* synthetic */ boolean test(Object object, Object object2) {
        return this.a((cng)object, (gu)object2);
    }
}

