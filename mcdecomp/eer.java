/*
 * Decompiled with CFR 0.152.
 */
public abstract class eer {
    private static final ha.a[] d = ha.a.values();
    protected final int a;
    protected final int b;
    protected final int c;

    protected eer(int $$0, int $$1, int $$2) {
        if ($$0 < 0 || $$1 < 0 || $$2 < 0) {
            throw new IllegalArgumentException("Need all positive sizes: x: " + $$0 + ", y: " + $$1 + ", z: " + $$2);
        }
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public boolean a(gs $$0, int $$1, int $$2, int $$3) {
        return this.d($$0.a($$1, $$2, $$3, ha.a.a), $$0.a($$1, $$2, $$3, ha.a.b), $$0.a($$1, $$2, $$3, ha.a.c));
    }

    public boolean d(int $$0, int $$1, int $$2) {
        if ($$0 < 0 || $$1 < 0 || $$2 < 0) {
            return false;
        }
        if ($$0 >= this.a || $$1 >= this.b || $$2 >= this.c) {
            return false;
        }
        return this.b($$0, $$1, $$2);
    }

    public boolean b(gs $$0, int $$1, int $$2, int $$3) {
        return this.b($$0.a($$1, $$2, $$3, ha.a.a), $$0.a($$1, $$2, $$3, ha.a.b), $$0.a($$1, $$2, $$3, ha.a.c));
    }

    public abstract boolean b(int var1, int var2, int var3);

    public abstract void c(int var1, int var2, int var3);

    public boolean a() {
        for (ha.a $$0 : d) {
            if (this.a($$0) < this.b($$0)) continue;
            return true;
        }
        return false;
    }

    public abstract int a(ha.a var1);

    public abstract int b(ha.a var1);

    public int a(ha.a $$0, int $$1, int $$2) {
        int $$3 = this.c($$0);
        if ($$1 < 0 || $$2 < 0) {
            return $$3;
        }
        ha.a $$4 = gs.b.a($$0);
        ha.a $$5 = gs.c.a($$0);
        if ($$1 >= this.c($$4) || $$2 >= this.c($$5)) {
            return $$3;
        }
        gs $$6 = gs.a(ha.a.a, $$0);
        for (int $$7 = 0; $$7 < $$3; ++$$7) {
            if (!this.b($$6, $$7, $$1, $$2)) continue;
            return $$7;
        }
        return $$3;
    }

    public int b(ha.a $$0, int $$1, int $$2) {
        if ($$1 < 0 || $$2 < 0) {
            return 0;
        }
        ha.a $$3 = gs.b.a($$0);
        ha.a $$4 = gs.c.a($$0);
        if ($$1 >= this.c($$3) || $$2 >= this.c($$4)) {
            return 0;
        }
        int $$5 = this.c($$0);
        gs $$6 = gs.a(ha.a.a, $$0);
        for (int $$7 = $$5 - 1; $$7 >= 0; --$$7) {
            if (!this.b($$6, $$7, $$1, $$2)) continue;
            return $$7 + 1;
        }
        return 0;
    }

    public int c(ha.a $$0) {
        return $$0.a(this.a, this.b, this.c);
    }

    public int b() {
        return this.c(ha.a.a);
    }

    public int c() {
        return this.c(ha.a.b);
    }

    public int d() {
        return this.c(ha.a.c);
    }

    public void a(b $$0, boolean $$1) {
        this.a($$0, gs.a, $$1);
        this.a($$0, gs.b, $$1);
        this.a($$0, gs.c, $$1);
    }

    private void a(b $$0, gs $$1, boolean $$2) {
        gs $$3 = $$1.a();
        int $$4 = this.c($$3.a(ha.a.a));
        int $$5 = this.c($$3.a(ha.a.b));
        int $$6 = this.c($$3.a(ha.a.c));
        for (int $$7 = 0; $$7 <= $$4; ++$$7) {
            for (int $$8 = 0; $$8 <= $$5; ++$$8) {
                int $$9 = -1;
                for (int $$10 = 0; $$10 <= $$6; ++$$10) {
                    int $$11 = 0;
                    int $$12 = 0;
                    for (int $$13 = 0; $$13 <= 1; ++$$13) {
                        for (int $$14 = 0; $$14 <= 1; ++$$14) {
                            if (!this.a($$3, $$7 + $$13 - 1, $$8 + $$14 - 1, $$10)) continue;
                            ++$$11;
                            $$12 ^= $$13 ^ $$14;
                        }
                    }
                    if ($$11 == 1 || $$11 == 3 || $$11 == 2 && !($$12 & true)) {
                        if ($$2) {
                            if ($$9 != -1) continue;
                            $$9 = $$10;
                            continue;
                        }
                        $$0.consume($$3.a($$7, $$8, $$10, ha.a.a), $$3.a($$7, $$8, $$10, ha.a.b), $$3.a($$7, $$8, $$10, ha.a.c), $$3.a($$7, $$8, $$10 + 1, ha.a.a), $$3.a($$7, $$8, $$10 + 1, ha.a.b), $$3.a($$7, $$8, $$10 + 1, ha.a.c));
                        continue;
                    }
                    if ($$9 == -1) continue;
                    $$0.consume($$3.a($$7, $$8, $$9, ha.a.a), $$3.a($$7, $$8, $$9, ha.a.b), $$3.a($$7, $$8, $$9, ha.a.c), $$3.a($$7, $$8, $$10, ha.a.a), $$3.a($$7, $$8, $$10, ha.a.b), $$3.a($$7, $$8, $$10, ha.a.c));
                    $$9 = -1;
                }
            }
        }
    }

    public void b(b $$0, boolean $$1) {
        eel.a(this, $$0, $$1);
    }

    public void a(a $$0) {
        this.a($$0, gs.a);
        this.a($$0, gs.b);
        this.a($$0, gs.c);
    }

    private void a(a $$0, gs $$1) {
        gs $$2 = $$1.a();
        ha.a $$3 = $$2.a(ha.a.c);
        int $$4 = this.c($$2.a(ha.a.a));
        int $$5 = this.c($$2.a(ha.a.b));
        int $$6 = this.c($$3);
        ha $$7 = ha.a($$3, ha.b.b);
        ha $$8 = ha.a($$3, ha.b.a);
        for (int $$9 = 0; $$9 < $$4; ++$$9) {
            for (int $$10 = 0; $$10 < $$5; ++$$10) {
                boolean $$11 = false;
                for (int $$12 = 0; $$12 <= $$6; ++$$12) {
                    boolean $$13;
                    boolean bl2 = $$13 = $$12 != $$6 && this.b($$2, $$9, $$10, $$12);
                    if (!$$11 && $$13) {
                        $$0.consume($$7, $$2.a($$9, $$10, $$12, ha.a.a), $$2.a($$9, $$10, $$12, ha.a.b), $$2.a($$9, $$10, $$12, ha.a.c));
                    }
                    if ($$11 && !$$13) {
                        $$0.consume($$8, $$2.a($$9, $$10, $$12 - 1, ha.a.a), $$2.a($$9, $$10, $$12 - 1, ha.a.b), $$2.a($$9, $$10, $$12 - 1, ha.a.c));
                    }
                    $$11 = $$13;
                }
            }
        }
    }

    public static interface b {
        public void consume(int var1, int var2, int var3, int var4, int var5, int var6);
    }

    public static interface a {
        public void consume(ha var1, int var2, int var3, int var4);
    }
}

