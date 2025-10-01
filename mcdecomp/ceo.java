/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public class ceo
extends cfu
implements cgy {
    private static final Map<cen, ceo> a = Maps.newEnumMap(cen.class);
    private final cen b;

    public ceo(cen $$0, cfu.a $$1) {
        super($$1);
        this.b = $$0;
        a.put($$0, this);
    }

    @Override
    public bdx a(cfz $$0, byo $$1, bfz $$2, bdw $$3) {
        bsh $$4;
        if ($$2 instanceof bsh && ($$4 = (bsh)$$2).bs() && !$$4.w() && $$4.r() != this.b) {
            $$4.dI().a($$1, $$4, amh.gF, ami.h, 1.0f, 1.0f);
            if (!$$1.dI().B) {
                $$4.b(this.b);
                $$0.h(1);
            }
            return bdx.a($$1.dI().B);
        }
        return bdx.d;
    }

    public cen d() {
        return this.b;
    }

    public static ceo a(cen $$0) {
        return a.get($$0);
    }

    @Override
    public boolean a(cmm $$02, dav $$1, boolean $$2, byo $$3) {
        if ($$1.a($$0 -> $$0.a(this.d()), $$2)) {
            $$02.a(null, $$1.p(), amh.gF, ami.e, 1.0f, 1.0f);
            return true;
        }
        return false;
    }
}

