/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface cqi {
    public static final efb r_ = cpn.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
    public static final dcs s_ = dcr.D;

    public static bdx a(@Nullable bfj $$0, dcb $$1, cmm $$2, gu $$3) {
        if ($$1.c(s_).booleanValue()) {
            cpn.a($$2, $$3, new cfz(cgc.vw, 1));
            float $$4 = apa.b($$2.z, 0.8f, 1.2f);
            $$2.a(null, $$3, amh.dx, ami.e, 1.0f, $$4);
            dcb $$5 = (dcb)$$1.a(s_, false);
            $$2.a($$3, $$5, 2);
            $$2.a(dgl.c, $$3, dgl.a.a($$0, $$5));
            return bdx.a($$2.B);
        }
        return bdx.d;
    }

    public static boolean h_(dcb $$0) {
        return $$0.b(s_) && $$0.c(s_) != false;
    }

    public static ToIntFunction<dcb> h_(int $$0) {
        return $$1 -> $$1.c(dcr.D) != false ? $$0 : 0;
    }
}

