/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class cib {
    public static final Codec<cib> a = RecordCodecBuilder.create($$0 -> $$0.group((App)cic.b.fieldOf("material").forGetter(cib::b), (App)cie.b.fieldOf("pattern").forGetter(cib::a)).apply((Applicative)$$0, cib::new));
    private static final Logger c = LogUtils.getLogger();
    public static final String b = "Trim";
    private static final sw d = sw.c(ac.a("item", new acq("smithing_template.upgrade"))).a(n.h);
    private final he<cic> e;
    private final he<cie> f;
    private final Function<cdk, acq> g;
    private final Function<cdk, acq> h;

    public cib(he<cic> $$0, he<cie> $$1) {
        this.e = $$0;
        this.f = $$1;
        this.g = ac.b($$12 -> {
            acq $$2 = ((cie)$$1.a()).a();
            String $$3 = this.c((cdk)$$12);
            return $$2.a($$1 -> "trims/models/armor/" + $$1 + "_leggings_" + $$3);
        });
        this.h = ac.b($$12 -> {
            acq $$2 = ((cie)$$1.a()).a();
            String $$3 = this.c((cdk)$$12);
            return $$2.a($$1 -> "trims/models/armor/" + $$1 + "_" + $$3);
        });
    }

    private String c(cdk $$0) {
        Map<cdl, String> $$1 = this.e.a().d();
        if ($$0 instanceof cdl && $$1.containsKey($$0)) {
            return $$1.get($$0);
        }
        return this.e.a().a();
    }

    public boolean a(he<cie> $$0, he<cic> $$1) {
        return $$0 == this.f && $$1 == this.e;
    }

    public he<cie> a() {
        return this.f;
    }

    public he<cic> b() {
        return this.e;
    }

    public acq a(cdk $$0) {
        return this.g.apply($$0);
    }

    public acq b(cdk $$0) {
        return this.h.apply($$0);
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object $$0) {
        void $$2;
        if (!($$0 instanceof cib)) {
            return false;
        }
        cib $$1 = (cib)$$0;
        return $$2.f == this.f && $$2.e == this.e;
    }

    public static boolean a(hs $$0, cfz $$1, cib $$2) {
        if ($$1.a(ane.aH)) {
            $$1.w().a(b, (rk)a.encodeStart(aco.a(rc.a, $$0), (Object)$$2).result().orElseThrow());
            return true;
        }
        return false;
    }

    public static Optional<cib> a(hs $$0, cfz $$1) {
        if ($$1.a(ane.aH) && $$1.v() != null && $$1.v().e(b)) {
            qr $$2 = $$1.b(b);
            cib $$3 = a.parse(aco.a(rc.a, $$0), (Object)$$2).resultOrPartial(arg_0 -> ((Logger)c).error(arg_0)).orElse(null);
            return Optional.ofNullable($$3);
        }
        return Optional.empty();
    }

    public static void a(cfz $$0, hs $$1, List<sw> $$2) {
        Optional<cib> $$3 = cib.a($$1, $$0);
        if ($$3.isPresent()) {
            cib $$4 = $$3.get();
            $$2.add(d);
            $$2.add(sv.a().b($$4.a().a().a($$4.b())));
            $$2.add(sv.a().b($$4.b().a().e()));
        }
    }
}

