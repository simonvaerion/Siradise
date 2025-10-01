/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record dsp(List<dse> a) {
    private final List<dse> a;
    private static final Logger b = LogUtils.getLogger();
    private static final acq c = new acq("jigsaw");
    private static final Map<acq, acq> d = ImmutableMap.builder().put((Object)new acq("nvi"), (Object)c).put((Object)new acq("pcp"), (Object)c).put((Object)new acq("bastionremnant"), (Object)c).put((Object)new acq("runtime"), (Object)c).build();

    public dsp(List<dse> $$0) {
        this.a = List.copyOf($$0);
    }

    public boolean a() {
        return this.a.isEmpty();
    }

    public boolean a(gu $$0) {
        for (dse $$1 : this.a) {
            if (!$$1.f().b($$0)) continue;
            return true;
        }
        return false;
    }

    public rk a(dsq $$0) {
        qx $$1 = new qx();
        for (dse $$2 : this.a) {
            $$1.add($$2.a($$0));
        }
        return $$1;
    }

    public static dsp a(qx $$0, dsq $$1) {
        ArrayList $$2 = Lists.newArrayList();
        for (int $$3 = 0; $$3 < $$0.size(); ++$$3) {
            qr $$4 = $$0.a($$3);
            String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
            acq $$6 = new acq($$5);
            acq $$7 = d.getOrDefault($$6, $$6);
            dsr $$8 = jb.T.a($$7);
            if ($$8 == null) {
                b.error("Unknown structure piece id: {}", (Object)$$7);
                continue;
            }
            try {
                dse $$9 = $$8.load($$1, $$4);
                $$2.add($$9);
                continue;
            }
            catch (Exception $$10) {
                b.error("Exception loading structure piece with id {}", (Object)$$7, (Object)$$10);
            }
        }
        return new dsp($$2);
    }

    public drs b() {
        return dse.a(this.a.stream());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dsp.class, "pieces", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dsp.class, "pieces", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dsp.class, "pieces", "a"}, this, $$0);
    }

    public List<dse> c() {
        return this.a;
    }
}

