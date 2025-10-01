/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class cjl<T extends cil>
implements cje<T> {
    private final int x;
    private final a<T> y;

    public cjl(a<T> $$0, int $$1) {
        this.x = $$1;
        this.y = $$0;
    }

    public T b(acq $$0, JsonObject $$1) {
        String $$2 = aor.a($$1, "group", "");
        cir $$3 = cir.d.a(aor.a($$1, "category", null), cir.c);
        JsonArray $$4 = aor.d($$1, "ingredient") ? aor.v($$1, "ingredient") : aor.u($$1, "ingredient");
        ciz $$5 = ciz.a((JsonElement)$$4, false);
        String $$6 = aor.i($$1, "result");
        acq $$7 = new acq($$6);
        cfz $$8 = new cfz((cml)jb.i.b($$7).orElseThrow(() -> new IllegalStateException("Item: " + $$6 + " does not exist")));
        float $$9 = aor.a($$1, "experience", 0.0f);
        int $$10 = aor.a($$1, "cookingtime", this.x);
        return this.y.create($$0, $$2, $$3, $$5, $$8, $$9, $$10);
    }

    public T b(acq $$0, sf $$1) {
        String $$2 = $$1.s();
        cir $$3 = $$1.b(cir.class);
        ciz $$4 = ciz.b($$1);
        cfz $$5 = $$1.r();
        float $$6 = $$1.readFloat();
        int $$7 = $$1.m();
        return this.y.create($$0, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public void a(sf $$0, T $$1) {
        $$0.a(((cil)$$1).c);
        $$0.a(((cil)$$1).g());
        ((cil)$$1).d.a($$0);
        $$0.a(((cil)$$1).e);
        $$0.writeFloat(((cil)$$1).f);
        $$0.d(((cil)$$1).g);
    }

    @Override
    public /* synthetic */ cjc a(acq acq2, sf sf2) {
        return this.b(acq2, sf2);
    }

    @Override
    public /* synthetic */ cjc a(acq acq2, JsonObject jsonObject) {
        return this.b(acq2, jsonObject);
    }

    static interface a<T extends cil> {
        public T create(acq var1, String var2, cir var3, ciz var4, cfz var5, float var6, int var7);
    }
}

