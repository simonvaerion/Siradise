/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  org.apache.commons.lang3.ArrayUtils
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.lang3.ArrayUtils;

public abstract class eaf
implements dzx {
    protected final eck[] d;
    private final Predicate<dzk> c;

    protected eaf(eck[] $$0) {
        this.d = $$0;
        this.c = ecm.a($$0);
    }

    public void a(dzv $$0) {
        for (int $$1 = 0; $$1 < this.d.length; ++$$1) {
            this.d[$$1].a($$0.b(".condition[" + $$1 + "]"));
        }
    }

    protected final boolean a(dzk $$0) {
        return this.c.test($$0);
    }

    public abstract eag a();

    public static abstract class b<T extends eaf>
    implements dzt<T> {
        public final void b(JsonObject $$0, T $$1, JsonSerializationContext $$2) {
            if (!ArrayUtils.isEmpty((Object[])((eaf)$$1).d)) {
                $$0.add("conditions", $$2.serialize((Object)((eaf)$$1).d));
            }
            this.a($$0, $$1, $$2);
        }

        public final T b(JsonObject $$0, JsonDeserializationContext $$1) {
            eck[] $$2 = aor.a($$0, "conditions", new eck[0], $$1, eck[].class);
            return this.b($$0, $$1, $$2);
        }

        @Override
        public abstract void a(JsonObject var1, T var2, JsonSerializationContext var3);

        public abstract T b(JsonObject var1, JsonDeserializationContext var2, eck[] var3);

        @Override
        public /* synthetic */ Object a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return this.b(jsonObject, jsonDeserializationContext);
        }

        @Override
        public /* synthetic */ void a(JsonObject jsonObject, Object object, JsonSerializationContext jsonSerializationContext) {
            this.b(jsonObject, (eaf)object, jsonSerializationContext);
        }
    }

    public static abstract class a<T extends a<T>>
    implements ecd<T> {
        private final List<eck> a = Lists.newArrayList();

        protected abstract T at_();

        public T a(eck.a $$0) {
            this.a.add($$0.build());
            return this.at_();
        }

        public final T e() {
            return this.at_();
        }

        protected eck[] f() {
            return this.a.toArray(new eck[0]);
        }

        public dzw.a a(a<?> $$0) {
            return new dzw.a(this, $$0);
        }

        public eab.a b(a<?> $$0) {
            return new eab.a(this, $$0);
        }

        public eaj.a c(a<?> $$0) {
            return new eaj.a(this, $$0);
        }

        public abstract eaf b();

        @Override
        public /* synthetic */ ecd d() {
            return this.e();
        }

        @Override
        public /* synthetic */ ecd b(eck.a a2) {
            return this.a(a2);
        }
    }
}

