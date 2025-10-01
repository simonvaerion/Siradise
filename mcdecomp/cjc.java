/*
 * Decompiled with CFR 0.152.
 */
public interface cjc<C extends bdq> {
    public boolean a(C var1, cmm var2);

    public cfz a(C var1, hs var2);

    public boolean a(int var1, int var2);

    public cfz a(hs var1);

    default public hn<cfz> a(C $$0) {
        hn<cfz> $$1 = hn.a($$0.b(), cfz.b);
        for (int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            cfu $$3 = $$0.a($$2).d();
            if (!$$3.t()) continue;
            $$1.set($$2, new cfz($$3.s()));
        }
        return $$1;
    }

    default public hn<ciz> a() {
        return hn.a();
    }

    default public boolean ai_() {
        return false;
    }

    default public boolean i() {
        return true;
    }

    default public String c() {
        return "";
    }

    default public cfz h() {
        return new cfz(cpo.cA);
    }

    public acq e();

    public cje<?> aj_();

    public cjf<?> f();

    default public boolean j() {
        hn<ciz> $$02 = this.a();
        return $$02.isEmpty() || $$02.stream().anyMatch($$0 -> $$0.a().length == 0);
    }
}

