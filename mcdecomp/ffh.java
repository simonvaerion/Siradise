/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  javax.annotation.Nullable
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class ffh {
    private final ffj[] a;
    private int b;

    public static Codec<ffh> a(int $$0) {
        return Codec.list(ffj.a).comapFlatMap($$1 -> {
            int $$2 = $$1.size();
            if ($$2 > $$0) {
                return DataResult.error(() -> "Expected: a buffer of size less than or equal to " + $$0 + " but: " + $$2 + " is greater than " + $$0);
            }
            return DataResult.success((Object)new ffh($$0, (List<ffj>)$$1));
        }, ffh::c);
    }

    public ffh(int $$0) {
        this.a = new ffj[$$0];
    }

    private ffh(int $$0, List<ffj> $$12) {
        this.a = (ffj[])$$12.toArray($$1 -> new ffj[$$0]);
        this.b = $$12.size();
    }

    private List<ffj> c() {
        ArrayList<ffj> $$0 = new ArrayList<ffj>(this.d());
        for (int $$1 = this.a(); $$1 <= this.b(); ++$$1) {
            $$0.add(this.b($$1));
        }
        return $$0;
    }

    public void a(ffj $$0) {
        this.a[this.c((int)this.b++)] = $$0;
    }

    @Nullable
    public ffj b(int $$0) {
        return $$0 >= this.a() && $$0 <= this.b() ? this.a[this.c($$0)] : null;
    }

    private int c(int $$0) {
        return $$0 % this.a.length;
    }

    public int a() {
        return Math.max(this.b - this.a.length, 0);
    }

    public int b() {
        return this.b - 1;
    }

    private int d() {
        return this.b() - this.a() + 1;
    }
}

