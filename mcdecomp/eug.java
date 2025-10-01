/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Unit
 *  com.mojang.serialization.Codec
 *  javax.annotation.Nullable
 *  org.apache.commons.compress.utils.Lists
 */
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class eug
extends eus {
    @Nullable
    private final enq<Unit> l;

    public static eug a(enn $$0, euq $$1, enr $$2) {
        ArrayList $$3 = Lists.newArrayList();
        $$3.add($$2.O());
        $$3.add($$2.P());
        enq $$4 = x.a($$0.s, (T $$02) -> {
            bdu $$12 = $$02.ai();
            return new enq<Unit>("options.difficulty.online", enq.a(), ($$1, $$2) -> $$12.b(), new enq.e<Unit>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()), Unit.INSTANCE, $$0 -> {});
        });
        if ($$4 != null) {
            $$3.add($$4);
        }
        return new eug($$1, $$2, $$3.toArray(new enq[0]), $$4);
    }

    private eug(euq $$0, enr $$1, enq<?>[] $$2, @Nullable enq<Unit> $$3) {
        super($$0, $$1, sw.c("options.online.title"), $$2);
        this.l = $$3;
    }

    @Override
    protected void b() {
        epf $$1;
        epf $$0;
        super.b();
        if (this.l != null && ($$0 = this.k.b(this.l)) != null) {
            $$0.r = false;
        }
        if (($$1 = this.k.b(this.b.ad())) != null) {
            $$1.r = this.f.A();
        }
    }
}

