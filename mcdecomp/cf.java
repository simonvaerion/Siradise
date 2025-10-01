/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class cf
implements bp {
    private static final String b = "blocks_set_on_fire";
    private static final String c = "entity_struck";
    private final cj.d d;
    private final bo e;

    private cf(cj.d $$0, bo $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public static cf a(cj.d $$0) {
        return new cf($$0, bo.a);
    }

    public static cf a(JsonObject $$0) {
        return new cf(cj.d.a($$0.get(b)), bo.a($$0.get(c)));
    }

    @Override
    public JsonObject a() {
        JsonObject $$0 = new JsonObject();
        $$0.add(b, this.d.d());
        $$0.add(c, this.e.a());
        return $$0;
    }

    @Override
    public bp.a c() {
        return bp.b.b;
    }

    @Override
    public boolean a(bfj $$0, aif $$1, @Nullable eei $$22) {
        if (!($$0 instanceof bfy)) {
            return false;
        }
        bfy $$3 = (bfy)$$0;
        return this.d.d($$3.k()) && (this.e == bo.a || $$3.o().anyMatch($$2 -> this.e.a($$1, $$22, (bfj)$$2)));
    }
}

