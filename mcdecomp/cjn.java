/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public abstract class cjn
implements cjc<bdq> {
    protected final ciz a;
    protected final cfz b;
    private final cjf<?> e;
    private final cje<?> f;
    protected final acq c;
    protected final String d;

    public cjn(cjf<?> $$0, cje<?> $$1, acq $$2, String $$3, ciz $$4, cfz $$5) {
        this.e = $$0;
        this.f = $$1;
        this.c = $$2;
        this.d = $$3;
        this.a = $$4;
        this.b = $$5;
    }

    @Override
    public cjf<?> f() {
        return this.e;
    }

    @Override
    public cje<?> aj_() {
        return this.f;
    }

    @Override
    public acq e() {
        return this.c;
    }

    @Override
    public String c() {
        return this.d;
    }

    @Override
    public cfz a(hs $$0) {
        return this.b;
    }

    @Override
    public hn<ciz> a() {
        hn<ciz> $$0 = hn.a();
        $$0.add(this.a);
        return $$0;
    }

    @Override
    public boolean a(int $$0, int $$1) {
        return true;
    }

    @Override
    public cfz a(bdq $$0, hs $$1) {
        return this.b.p();
    }

    public static class cjn$a<T extends cjn>
    implements cje<T> {
        final a<T> x;

        protected cjn$a(a<T> $$0) {
            this.x = $$0;
        }

        public T b(acq $$0, JsonObject $$1) {
            ciz $$4;
            String $$2 = aor.a($$1, "group", "");
            if (aor.d($$1, "ingredient")) {
                ciz $$3 = ciz.a((JsonElement)aor.v($$1, "ingredient"), false);
            } else {
                $$4 = ciz.a((JsonElement)aor.u($$1, "ingredient"), false);
            }
            String $$5 = aor.i($$1, "result");
            int $$6 = aor.o($$1, "count");
            cfz $$7 = new cfz(jb.i.a(new acq($$5)), $$6);
            return this.x.create($$0, $$2, $$4, $$7);
        }

        public T b(acq $$0, sf $$1) {
            String $$2 = $$1.s();
            ciz $$3 = ciz.b($$1);
            cfz $$4 = $$1.r();
            return this.x.create($$0, $$2, $$3, $$4);
        }

        @Override
        public void a(sf $$0, T $$1) {
            $$0.a(((cjn)$$1).d);
            ((cjn)$$1).a.a($$0);
            $$0.a(((cjn)$$1).b);
        }

        @Override
        public /* synthetic */ cjc a(acq acq2, sf sf2) {
            return this.b(acq2, sf2);
        }

        @Override
        public /* synthetic */ cjc a(acq acq2, JsonObject jsonObject) {
            return this.b(acq2, jsonObject);
        }

        static interface a<T extends cjn> {
            public T create(acq var1, String var2, ciz var3, cfz var4);
        }
    }
}

