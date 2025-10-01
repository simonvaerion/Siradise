/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class lu
implements lp {
    private final lq b;
    private final cir c;
    private final cfu d;
    private final ciz e;
    private final float f;
    private final int g;
    private final ae.a h = ae.a.b();
    @Nullable
    private String i;
    private final cje<? extends cil> j;

    private lu(lq $$0, cir $$1, cml $$2, ciz $$3, float $$4, int $$5, cje<? extends cil> $$6) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2.k();
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.j = $$6;
    }

    public static lu a(ciz $$0, lq $$1, cml $$2, float $$3, int $$4, cje<? extends cil> $$5) {
        return new lu($$1, lu.a($$5, $$2), $$2, $$0, $$3, $$4, $$5);
    }

    public static lu a(ciz $$0, lq $$1, cml $$2, float $$3, int $$4) {
        return new lu($$1, cir.a, $$2, $$0, $$3, $$4, cje.s);
    }

    public static lu b(ciz $$0, lq $$1, cml $$2, float $$3, int $$4) {
        return new lu($$1, lu.c($$2), $$2, $$0, $$3, $$4, cje.q);
    }

    public static lu c(ciz $$0, lq $$1, cml $$2, float $$3, int $$4) {
        return new lu($$1, lu.b($$2), $$2, $$0, $$3, $$4, cje.p);
    }

    public static lu d(ciz $$0, lq $$1, cml $$2, float $$3, int $$4) {
        return new lu($$1, cir.a, $$2, $$0, $$3, $$4, cje.r);
    }

    public lu b(String $$0, am $$1) {
        this.h.a($$0, $$1);
        return this;
    }

    public lu b(@Nullable String $$0) {
        this.i = $$0;
        return this;
    }

    @Override
    public cfu a() {
        return this.d;
    }

    @Override
    public void a(Consumer<lo> $$0, acq $$1) {
        this.a($$1);
        this.h.a(a).a("has_the_recipe", cs.a($$1)).a(ah.a.c($$1)).a(ap.b);
        $$0.accept(new a($$1, this.i == null ? "" : this.i, this.c, this.e, this.d, this.f, this.g, this.h, $$1.d("recipes/" + this.b.a() + "/"), this.j));
    }

    private static cir b(cml $$0) {
        if ($$0.k().u()) {
            return cir.a;
        }
        if ($$0.k() instanceof cds) {
            return cir.b;
        }
        return cir.c;
    }

    private static cir c(cml $$0) {
        if ($$0.k() instanceof cds) {
            return cir.b;
        }
        return cir.c;
    }

    private static cir a(cje<? extends cil> $$0, cml $$1) {
        if ($$0 == cje.p) {
            return lu.b($$1);
        }
        if ($$0 == cje.q) {
            return lu.c($$1);
        }
        if ($$0 == cje.r || $$0 == cje.s) {
            return cir.a;
        }
        throw new IllegalStateException("Unknown cooking recipe type");
    }

    private void a(acq $$0) {
        if (this.h.d().isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + $$0);
        }
    }

    @Override
    public /* synthetic */ lp a(@Nullable String string) {
        return this.b(string);
    }

    @Override
    public /* synthetic */ lp a(String string, am am2) {
        return this.b(string, am2);
    }

    static class a
    implements lo {
        private final acq a;
        private final String b;
        private final cir c;
        private final ciz d;
        private final cfu e;
        private final float f;
        private final int g;
        private final ae.a h;
        private final acq i;
        private final cje<? extends cil> j;

        public a(acq $$0, String $$1, cir $$2, ciz $$3, cfu $$4, float $$5, int $$6, ae.a $$7, acq $$8, cje<? extends cil> $$9) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
            this.h = $$7;
            this.i = $$8;
            this.j = $$9;
        }

        @Override
        public void a(JsonObject $$0) {
            if (!this.b.isEmpty()) {
                $$0.addProperty("group", this.b);
            }
            $$0.addProperty("category", this.c.c());
            $$0.add("ingredient", this.d.c());
            $$0.addProperty("result", jb.i.b(this.e).toString());
            $$0.addProperty("experience", (Number)Float.valueOf(this.f));
            $$0.addProperty("cookingtime", (Number)this.g);
        }

        @Override
        public cje<?> c() {
            return this.j;
        }

        @Override
        public acq b() {
            return this.a;
        }

        @Override
        @Nullable
        public JsonObject d() {
            return this.h.c();
        }

        @Override
        @Nullable
        public acq e() {
            return this.i;
        }
    }
}

