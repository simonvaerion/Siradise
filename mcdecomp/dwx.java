/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.jetbrains.annotations.VisibleForTesting
 */
import java.util.Objects;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public final class dwx
extends dwv<dwy.a, dwy> {
    private static final long g = dwv.a.a(15);
    private static final long h = dwv.a.a(15, ha.b);
    private static final long i = dwv.a.a(15, false, ha.b);
    private final gu.a j = new gu.a();
    private final dwo k;

    public dwx(del $$0) {
        this($$0, new dwy($$0));
    }

    @VisibleForTesting
    protected dwx(del $$0, dwy $$1) {
        super($$0, $$1);
        this.k = new dwo($$0.q());
    }

    private static boolean a(int $$0) {
        return $$0 == 15;
    }

    private int a(int $$0, int $$1, int $$2) {
        dwo $$3 = this.b(hx.a($$0), hx.a($$1));
        if ($$3 == null) {
            return $$2;
        }
        return $$3.a(hx.b($$0), hx.b($$1));
    }

    @Nullable
    private dwo b(int $$0, int $$1) {
        dek $$2 = this.e.c($$0, $$1);
        return $$2 != null ? $$2.B() : null;
    }

    @Override
    protected void a(long $$0) {
        boolean $$6;
        int $$5;
        int $$1 = gu.a($$0);
        int $$2 = gu.b($$0);
        int $$3 = gu.c($$0);
        long $$4 = hx.e($$0);
        int n2 = $$5 = ((dwy)this.f).j($$4) ? this.a($$1, $$3, Integer.MAX_VALUE) : Integer.MAX_VALUE;
        if ($$5 != Integer.MAX_VALUE) {
            this.b($$1, $$3, $$5);
        }
        if (!((dwy)this.f).b($$4)) {
            return;
        }
        boolean bl2 = $$6 = $$2 >= $$5;
        if ($$6) {
            this.b($$0, h);
            this.c($$0, i);
        } else {
            int $$7 = ((dwy)this.f).e($$0);
            if ($$7 > 0) {
                ((dwy)this.f).a($$0, 0);
                this.b($$0, dwv.a.a($$7));
            } else {
                this.b($$0, c);
            }
        }
    }

    private void b(int $$0, int $$1, int $$2) {
        int $$3 = hx.c(((dwy)this.f).c());
        this.a($$0, $$1, $$2, $$3);
        this.b($$0, $$1, $$2, $$3);
    }

    private void a(int $$0, int $$1, int $$2, int $$3) {
        if ($$2 <= $$3) {
            return;
        }
        int $$4 = hx.a($$0);
        int $$5 = hx.a($$1);
        int $$6 = $$2 - 1;
        int $$7 = hx.a($$6);
        while (((dwy)this.f).a($$7)) {
            if (((dwy)this.f).b(hx.b($$4, $$7, $$5))) {
                int $$8 = hx.c($$7);
                int $$9 = $$8 + 15;
                for (int $$10 = Math.min($$9, $$6); $$10 >= $$8; --$$10) {
                    long $$11 = gu.a($$0, $$10, $$1);
                    if (!dwx.a(((dwy)this.f).e($$11))) {
                        return;
                    }
                    ((dwy)this.f).a($$11, 0);
                    this.b($$11, $$10 == $$2 - 1 ? g : h);
                }
            }
            --$$7;
        }
    }

    private void b(int $$0, int $$1, int $$2, int $$3) {
        int $$4 = hx.a($$0);
        int $$5 = hx.a($$1);
        int $$6 = Math.max(Math.max(this.a($$0 - 1, $$1, Integer.MIN_VALUE), this.a($$0 + 1, $$1, Integer.MIN_VALUE)), Math.max(this.a($$0, $$1 - 1, Integer.MIN_VALUE), this.a($$0, $$1 + 1, Integer.MIN_VALUE)));
        int $$7 = Math.max($$2, $$3);
        long $$8 = hx.b($$4, hx.a($$7), $$5);
        while (!((dwy)this.f).l($$8)) {
            if (((dwy)this.f).b($$8)) {
                int $$9 = hx.c(hx.c($$8));
                int $$10 = $$9 + 15;
                for (int $$11 = Math.max($$9, $$7); $$11 <= $$10; ++$$11) {
                    long $$12 = gu.a($$0, $$11, $$1);
                    if (dwx.a(((dwy)this.f).e($$12))) {
                        return;
                    }
                    ((dwy)this.f).a($$12, 15);
                    if ($$11 >= $$6 && $$11 != $$2) continue;
                    this.c($$12, i);
                }
            }
            $$8 = hx.a($$8, ha.b);
        }
    }

    @Override
    protected void a(long $$0, long $$1, int $$2) {
        dcb $$3 = null;
        int $$4 = this.d($$0);
        for (ha $$5 : d) {
            int $$7;
            int $$8;
            long $$6;
            if (!dwv.a.a($$1, $$5) || !((dwy)this.f).b(hx.e($$6 = gu.a($$0, $$5))) || ($$8 = $$2 - 1) <= ($$7 = ((dwy)this.f).e($$6))) continue;
            this.j.f($$6);
            dcb $$9 = this.c(this.j);
            int $$10 = $$2 - this.a($$9, this.j);
            if ($$10 <= $$7) continue;
            if ($$3 == null) {
                dcb dcb2 = $$3 = dwv.a.b($$1) ? cpo.a.n() : this.c(this.j.f($$0));
            }
            if (this.a($$0, $$3, $$6, $$9, $$5)) continue;
            ((dwy)this.f).a($$6, $$10);
            if ($$10 > 1) {
                this.c($$6, dwv.a.a($$10, dwx.a($$9), $$5.g()));
            }
            this.a($$6, $$5, $$10, true, $$4);
        }
    }

    @Override
    protected void a(long $$0, long $$1) {
        int $$2 = this.d($$0);
        int $$3 = dwv.a.a($$1);
        for (ha $$4 : d) {
            int $$6;
            long $$5;
            if (!dwv.a.a($$1, $$4) || !((dwy)this.f).b(hx.e($$5 = gu.a($$0, $$4))) || ($$6 = ((dwy)this.f).e($$5)) == 0) continue;
            if ($$6 <= $$3 - 1) {
                ((dwy)this.f).a($$5, 0);
                this.b($$5, dwv.a.a($$6, $$4.g()));
                this.a($$5, $$4, $$6, false, $$2);
                continue;
            }
            this.c($$5, dwv.a.b($$6, false, $$4.g()));
        }
    }

    private int d(long $$0) {
        int $$1 = gu.b($$0);
        int $$2 = hx.b($$1);
        if ($$2 != 0) {
            return 0;
        }
        int $$3 = gu.a($$0);
        int $$4 = gu.c($$0);
        int $$5 = hx.b($$3);
        int $$6 = hx.b($$4);
        if ($$5 == 0 || $$5 == 15 || $$6 == 0 || $$6 == 15) {
            int $$7 = hx.a($$3);
            int $$8 = hx.a($$1);
            int $$9 = hx.a($$4);
            int $$10 = 0;
            while (!((dwy)this.f).b(hx.b($$7, $$8 - $$10 - 1, $$9)) && ((dwy)this.f).a($$8 - $$10 - 1)) {
                ++$$10;
            }
            return $$10;
        }
        return 0;
    }

    private void a(long $$0, ha $$1, int $$2, boolean $$3, int $$4) {
        if ($$4 == 0) {
            return;
        }
        int $$5 = gu.a($$0);
        int $$6 = gu.c($$0);
        if (!dwx.a($$1, hx.b($$5), hx.b($$6))) {
            return;
        }
        int $$7 = gu.b($$0);
        int $$8 = hx.a($$5);
        int $$9 = hx.a($$6);
        int $$10 = hx.a($$7) - 1;
        int $$11 = $$10 - $$4 + 1;
        while ($$10 >= $$11) {
            if (!((dwy)this.f).b(hx.b($$8, $$10, $$9))) {
                --$$10;
                continue;
            }
            int $$12 = hx.c($$10);
            for (int $$13 = 15; $$13 >= 0; --$$13) {
                long $$14 = gu.a($$5, $$12 + $$13, $$6);
                if ($$3) {
                    ((dwy)this.f).a($$14, $$2);
                    if ($$2 <= 1) continue;
                    this.c($$14, dwv.a.a($$2, true, $$1.g()));
                    continue;
                }
                ((dwy)this.f).a($$14, 0);
                this.b($$14, dwv.a.a($$2, $$1.g()));
            }
            --$$10;
        }
    }

    private static boolean a(ha $$0, int $$1, int $$2) {
        return switch ($$0) {
            case ha.c -> {
                if ($$2 == 15) {
                    yield true;
                }
                yield false;
            }
            case ha.d -> {
                if ($$2 == 0) {
                    yield true;
                }
                yield false;
            }
            case ha.e -> {
                if ($$1 == 15) {
                    yield true;
                }
                yield false;
            }
            case ha.f -> {
                if ($$1 == 0) {
                    yield true;
                }
                yield false;
            }
            default -> false;
        };
    }

    @Override
    public void a(clt $$0, boolean $$1) {
        super.a($$0, $$1);
        if ($$1) {
            dwo $$2 = Objects.requireNonNullElse(this.b($$0.e, $$0.f), this.k);
            int $$3 = $$2.a() - 1;
            int $$4 = hx.a($$3) + 1;
            long $$5 = hx.b($$0.e, $$0.f);
            int $$6 = ((dwy)this.f).m($$5);
            int $$7 = Math.max(((dwy)this.f).c(), $$4);
            for (int $$8 = $$6 - 1; $$8 >= $$7; --$$8) {
                ded $$9 = ((dwy)this.f).c(hx.b($$0.e, $$8, $$0.f));
                if ($$9 == null || !$$9.d()) continue;
                $$9.a(15);
            }
        }
    }

    @Override
    public void b(clt $$0) {
        long $$1 = hx.b($$0.e, $$0.f);
        ((dwy)this.f).b($$1, true);
        dwo $$2 = Objects.requireNonNullElse(this.b($$0.e, $$0.f), this.k);
        dwo $$3 = Objects.requireNonNullElse(this.b($$0.e, $$0.f - 1), this.k);
        dwo $$4 = Objects.requireNonNullElse(this.b($$0.e, $$0.f + 1), this.k);
        dwo $$5 = Objects.requireNonNullElse(this.b($$0.e - 1, $$0.f), this.k);
        dwo $$6 = Objects.requireNonNullElse(this.b($$0.e + 1, $$0.f), this.k);
        int $$7 = ((dwy)this.f).m($$1);
        int $$8 = ((dwy)this.f).c();
        int $$9 = hx.c($$0.e);
        int $$10 = hx.c($$0.f);
        for (int $$11 = $$7 - 1; $$11 >= $$8; --$$11) {
            long $$12 = hx.b($$0.e, $$11, $$0.f);
            ded $$13 = ((dwy)this.f).c($$12);
            if ($$13 == null) continue;
            int $$14 = hx.c($$11);
            int $$15 = $$14 + 15;
            boolean $$16 = false;
            for (int $$17 = 0; $$17 < 16; ++$$17) {
                for (int $$18 = 0; $$18 < 16; ++$$18) {
                    int $$19 = $$2.a($$18, $$17);
                    if ($$19 > $$15) continue;
                    int $$20 = $$17 == 0 ? $$3.a($$18, 15) : $$2.a($$18, $$17 - 1);
                    int $$21 = $$17 == 15 ? $$4.a($$18, 0) : $$2.a($$18, $$17 + 1);
                    int $$22 = $$18 == 0 ? $$5.a(15, $$17) : $$2.a($$18 - 1, $$17);
                    int $$23 = $$18 == 15 ? $$6.a(0, $$17) : $$2.a($$18 + 1, $$17);
                    int $$24 = Math.max(Math.max($$20, $$21), Math.max($$22, $$23));
                    for (int $$25 = $$15; $$25 >= Math.max($$14, $$19); --$$25) {
                        $$13.a($$18, hx.b($$25), $$17, 15);
                        if ($$25 != $$19 && $$25 >= $$24) continue;
                        long $$26 = gu.a($$9 + $$18, $$25, $$10 + $$17);
                        this.c($$26, dwv.a.a($$25 == $$19, $$25 < $$20, $$25 < $$21, $$25 < $$22, $$25 < $$23));
                    }
                    if ($$19 >= $$14) continue;
                    $$16 = true;
                }
            }
            if (!$$16) break;
        }
    }
}

