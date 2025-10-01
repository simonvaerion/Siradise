/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.Optional;

public interface ezf {
    public static final Map<Optional<acp<drp>>, ezf> a = Map.of(Optional.of(drq.b), ($$0, $$12) -> {
        ddy $$2 = $$12.d().a();
        hs.b $$3 = $$12.a();
        hg.c<cnk> $$4 = $$3.b(jc.ap);
        hg.c<dsg> $$5 = $$3.b(jc.aB);
        hg.c<dre> $$6 = $$3.b(jc.ay);
        return new etn($$0, $$1 -> $$0.l().a(ezf.a($$1)), $$2 instanceof dhf ? ((dhf)$$2).g() : dqd.a($$4, $$5, $$6));
    }, Optional.of(drq.e), ($$0, $$12) -> new etm($$0, $$12, $$1 -> $$0.l().a(ezf.a($$1))));

    public euq createEditScreen(eza var1, ezi var2);

    private static ezi.a a(dqd $$0) {
        return ($$1, $$2) -> {
            dhf $$3 = new dhf($$0);
            return $$2.a((hs)$$1, $$3);
        };
    }

    private static ezi.a a(he<cnk> $$0) {
        return ($$1, $$2) -> {
            hr<dhp> $$3 = $$1.d(jc.aw);
            he.c<dhp> $$4 = $$3.f(dhp.c);
            cnv $$5 = new cnv($$0);
            dhn $$6 = new dhn((cno)$$5, $$4);
            return $$2.a((hs)$$1, $$6);
        };
    }
}

