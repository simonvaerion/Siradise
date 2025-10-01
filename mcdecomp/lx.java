/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class lx {
    private final lq a;
    private final ciz b;
    private final ciz c;
    private final ciz d;
    private final ae.a e = ae.a.b();
    private final cje<?> f;

    public lx(cje<?> $$0, lq $$1, ciz $$2, ciz $$3, ciz $$4) {
        this.a = $$1;
        this.f = $$0;
        this.b = $$2;
        this.c = $$3;
        this.d = $$4;
    }

    public static lx a(ciz $$0, ciz $$1, ciz $$2, lq $$3) {
        return new lx(cje.v, $$3, $$0, $$1, $$2);
    }

    public lx a(String $$0, am $$1) {
        this.e.a($$0, $$1);
        return this;
    }

    public void a(Consumer<lo> $$0, acq $$1) {
        this.a($$1);
        this.e.a(lp.a).a("has_the_recipe", cs.a($$1)).a(ah.a.c($$1)).a(ap.b);
        $$0.accept(new a($$1, this.f, this.b, this.c, this.d, this.e, $$1.d("recipes/" + this.a.a() + "/")));
    }

    private void a(acq $$0) {
        if (this.e.d().isEmpty()) {
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
        private final ae.a f;
        private final acq g;

        public a(acq $$0, cje<?> $$1, ciz $$2, ciz $$3, ciz $$4, ae.a $$5, acq $$6) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
        }

        @Override
        public void a(JsonObject $$0) {
            $$0.add("template", this.c.c());
            $$0.add("base", this.d.c());
            $$0.add("addition", this.e.c());
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
            return this.f.c();
        }

        @Override
        @Nullable
        public acq e() {
            return this.g;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "id;type;template;base;addition;advancement;advancementId", "a", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id;type;template;base;addition;advancement;advancementId", "a", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id;type;template;base;addition;advancement;advancementId", "a", "b", "c", "d", "e", "f", "g"}, this, $$0);
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

        public ae.a k() {
            return this.f;
        }

        public acq l() {
            return this.g;
        }
    }
}

