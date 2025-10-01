/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonObject
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class cb
extends cv<a> {
    static final acq a = new acq("killed_by_crossbow");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        ba[] $$3 = bo.b($$0, "victims", $$2);
        cj.d $$4 = cj.d.a($$0.get("unique_entity_types"));
        return new a($$1, $$3, $$4);
    }

    @Override
    public void a(aig $$0, Collection<bfj> $$1) {
        ArrayList $$22 = Lists.newArrayList();
        HashSet $$3 = Sets.newHashSet();
        for (bfj $$4 : $$1) {
            $$3.add($$4.ae());
            $$22.add(bo.b($$0, $$4));
        }
        this.a($$0, (T $$2) -> $$2.a($$22, $$3.size()));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final ba[] a;
        private final cj.d b;

        public a(ba $$0, ba[] $$1, cj.d $$2) {
            super(a, $$0);
            this.a = $$1;
            this.b = $$2;
        }

        public static a a(bo.a ... $$0) {
            ba[] $$1 = new ba[$$0.length];
            for (int $$2 = 0; $$2 < $$0.length; ++$$2) {
                bo.a $$3 = $$0[$$2];
                $$1[$$2] = bo.a($$3.b());
            }
            return new a(ba.a, $$1, cj.d.e);
        }

        public static a a(cj.d $$0) {
            ba[] $$1 = new ba[]{};
            return new a(ba.a, $$1, $$0);
        }

        public boolean a(Collection<dzk> $$0, int $$1) {
            if (this.a.length > 0) {
                ArrayList $$2 = Lists.newArrayList($$0);
                for (ba $$3 : this.a) {
                    boolean $$4 = false;
                    Iterator $$5 = $$2.iterator();
                    while ($$5.hasNext()) {
                        dzk $$6 = (dzk)$$5.next();
                        if (!$$3.a($$6)) continue;
                        $$5.remove();
                        $$4 = true;
                        break;
                    }
                    if ($$4) continue;
                    return false;
                }
            }
            return this.b.d($$1);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("victims", ba.a(this.a, $$0));
            $$1.add("unique_entity_types", this.b.d());
            return $$1;
        }
    }
}

