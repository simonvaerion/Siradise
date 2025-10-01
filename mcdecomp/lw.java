/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class lw {
    private final ciz a;
    private final ciz b;
    private final ciz c;
    private final lq d;
    private final cfu e;
    private final ae.a f = ae.a.b();
    private final cje<?> g;

    public lw(cje<?> $$0, ciz $$1, ciz $$2, ciz $$3, lq $$4, cfu $$5) {
        this.d = $$4;
        this.g = $$0;
        this.a = $$1;
        this.b = $$2;
        this.c = $$3;
        this.e = $$5;
    }

    public static lw a(ciz $$0, ciz $$1, ciz $$2, lq $$3, cfu $$4) {
        return new lw(cje.u, $$0, $$1, $$2, $$3, $$4);
    }

    public lw a(String $$0, am $$1) {
        this.f.a($$0, $$1);
        return this;
    }

    public void a(Consumer<lo> $$0, String $$1) {
        this.a($$0, new acq($$1));
    }

    public void a(Consumer<lo> $$0, acq $$1) {
        this.a($$1);
        this.f.a(lp.a).a("has_the_recipe", cs.a($$1)).a(ah.a.c($$1)).a(ap.b);
        $$0.accept(new a($$1, this.g, this.a, this.b, this.c, this.e, this.f, $$1.d("recipes/" + this.d.a() + "/")));
    }

    private void a(acq $$0) {
        if (this.f.d().isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + $$0);
        }
    }

    public static final class a
    extends Record
    implements lo {
        private final acq a;
        private final cje<?> b;
        private final ciz c;
        private final ciz d;
        private final ciz e;
        private final cfu f;
        private final ae.a g;
        private final acq h;

        public a(acq $$0, cje<?> $$1, ciz $$2, ciz $$3, ciz $$4, cfu $$5, ae.a $$6, acq $$7) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
            this.h = $$7;
        }

        @Override
        public void a(JsonObject $$0) {
            $$0.add("template", this.c.c());
            $$0.add("base", this.d.c());
            $$0.add("addition", this.e.c());
            JsonObject $$1 = new JsonObject();
            $$1.addProperty("item", jb.i.b(this.f).toString());
            $$0.add("result", (JsonElement)$$1);
        }

        @Override
        public acq b() {
            return this.a;
        }

        @Override
        public cje<?> c() {
            return this.b;
        }

        @Override
        @Nullable
        public JsonObject d() {
            return this.g.c();
        }

        @Override
        @Nullable
        public acq e() {
            return this.h;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "id;type;template;base;addition;result;advancement;advancementId", "a", "b", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id;type;template;base;addition;result;advancement;advancementId", "a", "b", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id;type;template;base;addition;result;advancement;advancementId", "a", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
        }

        public acq f() {
            return this.a;
        }

        public cje<?> g() {
            return this.b;
        }

        public ciz h() {
            return this.c;
        }

        public ciz i() {
            return this.d;
        }

        public ciz j() {
            return this.e;
        }

        public cfu k() {
            return this.f;
        }

        public ae.a l() {
            return this.g;
        }

        public acq m() {
            return this.h;
        }
    }
}

