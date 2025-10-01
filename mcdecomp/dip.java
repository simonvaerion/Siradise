/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;

class dip
extends dit {
    public static final Codec<dip> a = dip.a(dip::new);

    public dip(List<dir> $$0) {
        super($$0);
    }

    public boolean a(cng $$0, gu $$1) {
        for (dir $$2 : this.e) {
            if ($$2.test($$0, $$1)) continue;
            return false;
        }
        return true;
    }

    @Override
    public dis<?> a() {
        return dis.j;
    }

    @Override
    public /* synthetic */ boolean test(Object object, Object object2) {
        return this.a((cng)object, (gu)object2);
    }
}

