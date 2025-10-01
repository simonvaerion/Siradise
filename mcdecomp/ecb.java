/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public abstract class ecb
implements eck {
    final eck[] a;
    private final Predicate<dzk> b;

    protected ecb(eck[] $$0, Predicate<dzk> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public final boolean a(dzk $$0) {
        return this.b.test($$0);
    }

    @Override
    public void a(dzv $$0) {
        eck.super.a($$0);
        for (int $$1 = 0; $$1 < this.a.length; ++$$1) {
            this.a[$$1].a($$0.b(".term[" + $$1 + "]"));
        }
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((dzk)object);
    }

    public static abstract class b<T extends ecb>
    implements dzt<T> {
        @Override
        public void a(JsonObject $$0, ecb $$1, JsonSerializationContext $$2) {
            $$0.add("terms", $$2.serialize((Object)$$1.a));
        }

        public T b(JsonObject $$0, JsonDeserializationContext $$1) {
            eck[] $$2 = aor.a($$0, "terms", $$1, eck[].class);
            return this.b($$2);
        }

        protected abstract T b(eck[] var1);

        @Override
        public /* synthetic */ Object a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return this.b(jsonObject, jsonDeserializationContext);
        }
    }

    public static abstract class a
    implements eck.a {
        private final List<eck> a = new ArrayList<eck>();

        public a(eck.a ... $$0) {
            for (eck.a $$1 : $$0) {
                this.a.add($$1.build());
            }
        }

        public void a(eck.a $$0) {
            this.a.add($$0.build());
        }

        @Override
        public eck build() {
            eck[] $$0 = (eck[])this.a.toArray(eck[]::new);
            return this.a($$0);
        }

        protected abstract eck a(eck[] var1);
    }
}

