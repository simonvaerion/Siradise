/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface cxq {
    public bey a();

    public int b();

    public static List<cxq> c() {
        return jb.i.s().map(cxq::a).filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Nullable
    public static cxq a(cml $$0) {
        cds $$1;
        cml cml2 = $$0.k();
        if (cml2 instanceof cds && (cml2 = ($$1 = (cds)cml2).e()) instanceof cxq) {
            cxq $$2 = (cxq)((Object)cml2);
            return $$2;
        }
        cfu cfu2 = $$0.k();
        if (cfu2 instanceof cxq) {
            cxq $$3 = (cxq)((Object)cfu2);
            return $$3;
        }
        return null;
    }
}

