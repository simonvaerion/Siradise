/*
 * Decompiled with CFR 0.152.
 */
public interface beq {
    public static final acp<bep> a = acp.a(jc.p, new acq("in_fire"));
    public static final acp<bep> b = acp.a(jc.p, new acq("lightning_bolt"));
    public static final acp<bep> c = acp.a(jc.p, new acq("on_fire"));
    public static final acp<bep> d = acp.a(jc.p, new acq("lava"));
    public static final acp<bep> e = acp.a(jc.p, new acq("hot_floor"));
    public static final acp<bep> f = acp.a(jc.p, new acq("in_wall"));
    public static final acp<bep> g = acp.a(jc.p, new acq("cramming"));
    public static final acp<bep> h = acp.a(jc.p, new acq("drown"));
    public static final acp<bep> i = acp.a(jc.p, new acq("starve"));
    public static final acp<bep> j = acp.a(jc.p, new acq("cactus"));
    public static final acp<bep> k = acp.a(jc.p, new acq("fall"));
    public static final acp<bep> l = acp.a(jc.p, new acq("fly_into_wall"));
    public static final acp<bep> m = acp.a(jc.p, new acq("out_of_world"));
    public static final acp<bep> n = acp.a(jc.p, new acq("generic"));
    public static final acp<bep> o = acp.a(jc.p, new acq("magic"));
    public static final acp<bep> p = acp.a(jc.p, new acq("wither"));
    public static final acp<bep> q = acp.a(jc.p, new acq("dragon_breath"));
    public static final acp<bep> r = acp.a(jc.p, new acq("dry_out"));
    public static final acp<bep> s = acp.a(jc.p, new acq("sweet_berry_bush"));
    public static final acp<bep> t = acp.a(jc.p, new acq("freeze"));
    public static final acp<bep> u = acp.a(jc.p, new acq("stalagmite"));
    public static final acp<bep> v = acp.a(jc.p, new acq("falling_block"));
    public static final acp<bep> w = acp.a(jc.p, new acq("falling_anvil"));
    public static final acp<bep> x = acp.a(jc.p, new acq("falling_stalactite"));
    public static final acp<bep> y = acp.a(jc.p, new acq("sting"));
    public static final acp<bep> z = acp.a(jc.p, new acq("mob_attack"));
    public static final acp<bep> A = acp.a(jc.p, new acq("mob_attack_no_aggro"));
    public static final acp<bep> B = acp.a(jc.p, new acq("player_attack"));
    public static final acp<bep> C = acp.a(jc.p, new acq("arrow"));
    public static final acp<bep> D = acp.a(jc.p, new acq("trident"));
    public static final acp<bep> E = acp.a(jc.p, new acq("mob_projectile"));
    public static final acp<bep> F = acp.a(jc.p, new acq("fireworks"));
    public static final acp<bep> G = acp.a(jc.p, new acq("fireball"));
    public static final acp<bep> H = acp.a(jc.p, new acq("unattributed_fireball"));
    public static final acp<bep> I = acp.a(jc.p, new acq("wither_skull"));
    public static final acp<bep> J = acp.a(jc.p, new acq("thrown"));
    public static final acp<bep> K = acp.a(jc.p, new acq("indirect_magic"));
    public static final acp<bep> L = acp.a(jc.p, new acq("thorns"));
    public static final acp<bep> M = acp.a(jc.p, new acq("explosion"));
    public static final acp<bep> N = acp.a(jc.p, new acq("player_explosion"));
    public static final acp<bep> O = acp.a(jc.p, new acq("sonic_boom"));
    public static final acp<bep> P = acp.a(jc.p, new acq("bad_respawn_point"));
    public static final acp<bep> Q = acp.a(jc.p, new acq("outside_border"));
    public static final acp<bep> R = acp.a(jc.p, new acq("generic_kill"));

    public static void a(nm<bep> $$0) {
        $$0.a(a, new bep("inFire", 0.1f, bel.d));
        $$0.a(b, new bep("lightningBolt", 0.1f));
        $$0.a(c, new bep("onFire", 0.0f, bel.d));
        $$0.a(d, new bep("lava", 0.1f, bel.d));
        $$0.a(e, new bep("hotFloor", 0.1f, bel.d));
        $$0.a(f, new bep("inWall", 0.0f));
        $$0.a(g, new bep("cramming", 0.0f));
        $$0.a(h, new bep("drown", 0.0f, bel.c));
        $$0.a(i, new bep("starve", 0.0f));
        $$0.a(j, new bep("cactus", 0.1f));
        $$0.a(k, new bep("fall", bem.b, 0.0f, bel.a, ber.b));
        $$0.a(l, new bep("flyIntoWall", 0.0f));
        $$0.a(m, new bep("outOfWorld", 0.0f));
        $$0.a(n, new bep("generic", 0.0f));
        $$0.a(o, new bep("magic", 0.0f));
        $$0.a(p, new bep("wither", 0.0f));
        $$0.a(q, new bep("dragonBreath", 0.0f));
        $$0.a(r, new bep("dryout", 0.1f));
        $$0.a(s, new bep("sweetBerryBush", 0.1f, bel.e));
        $$0.a(t, new bep("freeze", 0.0f, bel.f));
        $$0.a(u, new bep("stalagmite", 0.0f));
        $$0.a(v, new bep("fallingBlock", 0.1f));
        $$0.a(w, new bep("anvil", 0.1f));
        $$0.a(x, new bep("fallingStalactite", 0.1f));
        $$0.a(y, new bep("sting", 0.1f));
        $$0.a(z, new bep("mob", 0.1f));
        $$0.a(A, new bep("mob", 0.1f));
        $$0.a(B, new bep("player", 0.1f));
        $$0.a(C, new bep("arrow", 0.1f));
        $$0.a(D, new bep("trident", 0.1f));
        $$0.a(E, new bep("mob", 0.1f));
        $$0.a(F, new bep("fireworks", 0.1f));
        $$0.a(H, new bep("onFire", 0.1f, bel.d));
        $$0.a(G, new bep("fireball", 0.1f, bel.d));
        $$0.a(I, new bep("witherSkull", 0.1f));
        $$0.a(J, new bep("thrown", 0.1f));
        $$0.a(K, new bep("indirectMagic", 0.0f));
        $$0.a(L, new bep("thorns", 0.1f, bel.b));
        $$0.a(M, new bep("explosion", bem.c, 0.1f));
        $$0.a(N, new bep("explosion.player", bem.c, 0.1f));
        $$0.a(O, new bep("sonic_boom", bem.c, 0.0f));
        $$0.a(P, new bep("badRespawnPoint", bem.c, 0.1f, bel.a, ber.c));
        $$0.a(Q, new bep("outsideBorder", 0.0f));
        $$0.a(R, new bep("genericKill", 0.0f));
    }
}

