/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicLike
 */
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicLike;

public final class cmq {
    private final String a;
    private final cmj b;
    private final boolean c;
    private final bdu d;
    private final boolean e;
    private final cmi f;
    private final cnf g;

    public cmq(String $$0, cmj $$1, boolean $$2, bdu $$3, boolean $$4, cmi $$5, cnf $$6) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
        this.f = $$5;
        this.g = $$6;
    }

    public static cmq a(Dynamic<?> $$02, cnf $$1) {
        cmj $$2 = cmj.a($$02.get("GameType").asInt(0));
        return new cmq($$02.get("LevelName").asString(""), $$2, $$02.get("hardcore").asBoolean(false), $$02.get("Difficulty").asNumber().map($$0 -> bdu.a($$0.byteValue())).result().orElse(bdu.c), $$02.get("allowCommands").asBoolean($$2 == cmj.b), new cmi((DynamicLike<?>)$$02.get("GameRules")), $$1);
    }

    public String a() {
        return this.a;
    }

    public cmj b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public bdu d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public cmi f() {
        return this.f;
    }

    public cnf g() {
        return this.g;
    }

    public cmq a(cmj $$0) {
        return new cmq(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
    }

    public cmq a(bdu $$0) {
        return new cmq(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
    }

    public cmq a(cnf $$0) {
        return new cmq(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
    }

    public cmq h() {
        return new cmq(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
    }
}

