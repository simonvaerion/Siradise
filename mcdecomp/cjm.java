/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class cjm<T extends cit>
implements cje<T> {
    private final a<T> x;

    public cjm(a<T> $$0) {
        this.x = $$0;
    }

    public T b(acq $$0, JsonObject $$1) {
        cis $$2 = cis.e.a(aor.a($$1, "category", null), cis.d);
        return this.x.create($$0, $$2);
    }

    public T b(acq $$0, sf $$1) {
        cis $$2 = $$1.b(cis.class);
        return this.x.create($$0, $$2);
    }

    @Override
    public void a(sf $$0, T $$1) {
        $$0.a($$1.d());
    }

    @Override
    public /* synthetic */ cjc a(acq acq2, sf sf2) {
        return this.b(acq2, sf2);
    }

    @Override
    public /* synthetic */ cjc a(acq acq2, JsonObject jsonObject) {
        return this.b(acq2, jsonObject);
    }

    @FunctionalInterface
    public static interface a<T extends cit> {
        public T create(acq var1, cis var2);
    }
}

