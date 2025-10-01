/*
 * Decompiled with CFR 0.152.
 */
public class ftq
extends ftg<bsl, fax<bsl>> {
    private static final acq a = new acq("textures/entity/fish/tropical_a_pattern_1.png");
    private static final acq b = new acq("textures/entity/fish/tropical_a_pattern_2.png");
    private static final acq c = new acq("textures/entity/fish/tropical_a_pattern_3.png");
    private static final acq d = new acq("textures/entity/fish/tropical_a_pattern_4.png");
    private static final acq e = new acq("textures/entity/fish/tropical_a_pattern_5.png");
    private static final acq f = new acq("textures/entity/fish/tropical_a_pattern_6.png");
    private static final acq g = new acq("textures/entity/fish/tropical_b_pattern_1.png");
    private static final acq h = new acq("textures/entity/fish/tropical_b_pattern_2.png");
    private static final acq i = new acq("textures/entity/fish/tropical_b_pattern_3.png");
    private static final acq j = new acq("textures/entity/fish/tropical_b_pattern_4.png");
    private static final acq k = new acq("textures/entity/fish/tropical_b_pattern_5.png");
    private static final acq l = new acq("textures/entity/fish/tropical_b_pattern_6.png");
    private final fdl<bsl> m;
    private final fdm<bsl> n;

    public ftq(fqt<bsl, fax<bsl>> $$0, fea $$1) {
        super($$0);
        this.m = new fdl($$1.a(fed.bG));
        this.n = new fdm($$1.a(fed.bE));
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, bsl $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        bsl.b $$10 = $$3.gj();
        fax $$11 = switch ($$10.a()) {
            default -> throw new IncompatibleClassChangeError();
            case bsl.a.a -> this.m;
            case bsl.a.b -> this.n;
        };
        acq $$12 = switch ($$10) {
            default -> throw new IncompatibleClassChangeError();
            case bsl.b.a -> a;
            case bsl.b.b -> b;
            case bsl.b.c -> c;
            case bsl.b.d -> d;
            case bsl.b.e -> e;
            case bsl.b.f -> f;
            case bsl.b.g -> g;
            case bsl.b.h -> h;
            case bsl.b.i -> i;
            case bsl.b.j -> j;
            case bsl.b.k -> k;
            case bsl.b.l -> l;
        };
        float[] $$13 = $$3.gi().d();
        ftq.a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13[0], $$13[1], $$13[2]);
    }
}

