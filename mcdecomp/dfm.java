/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;

/*
 * Uses 'sealed' constructs - enablewith --sealed true
 */
public abstract class dfm
extends Enum<dfm> {
    public static final /* enum */ dfm a = new dfm(){

        @Override
        public void a(aif $$0, dfn $$1, List<bua> $$2, int $$3, gu $$4) {
            gu $$5 = new gu(0, 128, 0);
            for (bua $$6 : $$2) {
                $$6.a($$5);
            }
            $$1.a(b);
        }
    };
    public static final /* enum */ dfm b = new dfm(){

        @Override
        public void a(aif $$0, dfn $$1, List<bua> $$2, int $$3, gu $$4) {
            if ($$3 < 100) {
                if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
                    $$0.c(3001, new gu(0, 128, 0), 0);
                }
            } else {
                $$1.a(c);
            }
        }
    };
    public static final /* enum */ dfm c = new dfm(){

        @Override
        public void a(aif $$0, dfn $$1, List<bua> $$2, int $$3, gu $$4) {
            boolean $$7;
            int $$5 = 40;
            boolean $$6 = $$3 % 40 == 0;
            boolean bl2 = $$7 = $$3 % 40 == 39;
            if ($$6 || $$7) {
                int $$9 = $$3 / 40;
                List<dly.a> $$8 = dly.a($$0);
                if ($$9 < $$8.size()) {
                    dly.a $$10 = $$8.get($$9);
                    if ($$6) {
                        for (bua $$11 : $$2) {
                            $$11.a(new gu($$10.a(), $$10.d() + 1, $$10.b()));
                        }
                    } else {
                        int $$12 = 10;
                        for (gu $$13 : gu.a(new gu($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new gu($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                            $$0.a($$13, false);
                        }
                        $$0.a(null, (float)$$10.a() + 0.5f, (double)$$10.d(), (double)((float)$$10.b() + 0.5f), 5.0f, cmm.a.b);
                        dnm $$14 = new dnm(true, (List<dly.a>)ImmutableList.of((Object)$$10), new gu(0, 128, 0));
                        dko.J.a($$14, $$0, $$0.k().g(), apf.a(), new gu($$10.a(), 45, $$10.b()));
                    }
                } else if ($$6) {
                    $$1.a(d);
                }
            }
        }
    };
    public static final /* enum */ dfm d = new dfm(){

        @Override
        public void a(aif $$0, dfn $$1, List<bua> $$2, int $$3, gu $$4) {
            if ($$3 >= 100) {
                $$1.a(e);
                $$1.h();
                for (bua $$5 : $$2) {
                    $$5.a((gu)null);
                    $$0.a((bfj)$$5, $$5.dn(), $$5.dp(), $$5.dt(), 6.0f, cmm.a.a);
                    $$5.ai();
                }
            } else if ($$3 >= 80) {
                $$0.c(3001, new gu(0, 128, 0), 0);
            } else if ($$3 == 0) {
                for (bua $$6 : $$2) {
                    $$6.a(new gu(0, 128, 0));
                }
            } else if ($$3 < 5) {
                $$0.c(3001, new gu(0, 128, 0), 0);
            }
        }
    };
    public static final /* enum */ dfm e = new dfm(){

        @Override
        public void a(aif $$0, dfn $$1, List<bua> $$2, int $$3, gu $$4) {
        }
    };
    private static final /* synthetic */ dfm[] f;

    public static dfm[] values() {
        return (dfm[])f.clone();
    }

    public static dfm valueOf(String $$0) {
        return Enum.valueOf(dfm.class, $$0);
    }

    public abstract void a(aif var1, dfn var2, List<bua> var3, int var4, gu var5);

    private static /* synthetic */ dfm[] a() {
        return new dfm[]{a, b, c, d, e};
    }

    static {
        f = dfm.a();
    }
}

