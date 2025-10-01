/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Either
 *  org.joml.Vector3f
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import org.joml.Vector3f;

public class fkz {
    public static final List<String> a = Lists.newArrayList((Object[])new String[]{"layer0", "layer1", "layer2", "layer3", "layer4"});
    private static final float b = 7.5f;
    private static final float c = 8.5f;

    public fkw a(Function<fwu, fuv> $$0, fkw $$1) {
        String $$5;
        HashMap $$2 = Maps.newHashMap();
        ArrayList $$3 = Lists.newArrayList();
        for (int $$4 = 0; $$4 < a.size() && $$1.b($$5 = a.get($$4)); ++$$4) {
            fwu $$6 = $$1.c($$5);
            $$2.put($$5, Either.left((Object)$$6));
            fup $$7 = $$0.apply($$6).e();
            $$3.addAll(this.a($$4, $$5, $$7));
        }
        $$2.put("particle", $$1.b("particle") ? Either.left((Object)$$1.c("particle")) : (Either)$$2.get("layer0"));
        fkw $$8 = new fkw(null, $$3, $$2, false, $$1.c(), $$1.h(), $$1.e());
        $$8.c = $$1.c;
        return $$8;
    }

    private List<fks> a(int $$0, String $$1, fup $$2) {
        HashMap $$3 = Maps.newHashMap();
        $$3.put(ha.d, new fkt(null, $$0, $$1, new fkv(new float[]{0.0f, 0.0f, 16.0f, 16.0f}, 0)));
        $$3.put(ha.c, new fkt(null, $$0, $$1, new fkv(new float[]{16.0f, 0.0f, 0.0f, 16.0f}, 0)));
        ArrayList $$4 = Lists.newArrayList();
        $$4.add(new fks(new Vector3f(0.0f, 0.0f, 7.5f), new Vector3f(16.0f, 16.0f, 8.5f), $$3, null, true));
        $$4.addAll(this.a($$2, $$1, $$0));
        return $$4;
    }

    private List<fks> a(fup $$0, String $$1, int $$2) {
        float $$3 = $$0.a();
        float $$4 = $$0.b();
        ArrayList $$5 = Lists.newArrayList();
        for (a $$6 : this.a($$0)) {
            float $$7 = 0.0f;
            float $$8 = 0.0f;
            float $$9 = 0.0f;
            float $$10 = 0.0f;
            float $$11 = 0.0f;
            float $$12 = 0.0f;
            float $$13 = 0.0f;
            float $$14 = 0.0f;
            float $$15 = 16.0f / $$3;
            float $$16 = 16.0f / $$4;
            float $$17 = $$6.b();
            float $$18 = $$6.c();
            float $$19 = $$6.d();
            b $$20 = $$6.a();
            switch ($$20) {
                case a: {
                    $$7 = $$11 = $$17;
                    $$9 = $$12 = $$18 + 1.0f;
                    $$8 = $$13 = $$19;
                    $$10 = $$19;
                    $$14 = $$19 + 1.0f;
                    break;
                }
                case b: {
                    $$13 = $$19;
                    $$14 = $$19 + 1.0f;
                    $$7 = $$11 = $$17;
                    $$9 = $$12 = $$18 + 1.0f;
                    $$8 = $$19 + 1.0f;
                    $$10 = $$19 + 1.0f;
                    break;
                }
                case c: {
                    $$7 = $$11 = $$19;
                    $$9 = $$19;
                    $$12 = $$19 + 1.0f;
                    $$8 = $$14 = $$17;
                    $$10 = $$13 = $$18 + 1.0f;
                    break;
                }
                case d: {
                    $$11 = $$19;
                    $$12 = $$19 + 1.0f;
                    $$7 = $$19 + 1.0f;
                    $$9 = $$19 + 1.0f;
                    $$8 = $$14 = $$17;
                    $$10 = $$13 = $$18 + 1.0f;
                }
            }
            $$7 *= $$15;
            $$9 *= $$15;
            $$8 *= $$16;
            $$10 *= $$16;
            $$8 = 16.0f - $$8;
            $$10 = 16.0f - $$10;
            HashMap $$21 = Maps.newHashMap();
            $$21.put($$20.a(), new fkt(null, $$2, $$1, new fkv(new float[]{$$11 *= $$15, $$13 *= $$16, $$12 *= $$15, $$14 *= $$16}, 0)));
            switch ($$20) {
                case a: {
                    $$5.add(new fks(new Vector3f($$7, $$8, 7.5f), new Vector3f($$9, $$8, 8.5f), $$21, null, true));
                    break;
                }
                case b: {
                    $$5.add(new fks(new Vector3f($$7, $$10, 7.5f), new Vector3f($$9, $$10, 8.5f), $$21, null, true));
                    break;
                }
                case c: {
                    $$5.add(new fks(new Vector3f($$7, $$8, 7.5f), new Vector3f($$7, $$10, 8.5f), $$21, null, true));
                    break;
                }
                case d: {
                    $$5.add(new fks(new Vector3f($$9, $$8, 7.5f), new Vector3f($$9, $$10, 8.5f), $$21, null, true));
                }
            }
        }
        return $$5;
    }

    private List<a> a(fup $$0) {
        int $$1 = $$0.a();
        int $$2 = $$0.b();
        ArrayList $$3 = Lists.newArrayList();
        $$0.d().forEach($$4 -> {
            for (int $$5 = 0; $$5 < $$2; ++$$5) {
                for (int $$6 = 0; $$6 < $$1; ++$$6) {
                    boolean $$7 = !this.a($$0, $$4, $$6, $$5, $$1, $$2);
                    this.a(fkz$b.a, $$3, $$0, $$4, $$6, $$5, $$1, $$2, $$7);
                    this.a(fkz$b.b, $$3, $$0, $$4, $$6, $$5, $$1, $$2, $$7);
                    this.a(fkz$b.c, $$3, $$0, $$4, $$6, $$5, $$1, $$2, $$7);
                    this.a(fkz$b.d, $$3, $$0, $$4, $$6, $$5, $$1, $$2, $$7);
                }
            }
        });
        return $$3;
    }

    private void a(b $$0, List<a> $$1, fup $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8) {
        boolean $$9;
        boolean bl2 = $$9 = this.a($$2, $$3, $$4 + $$0.b(), $$5 + $$0.c(), $$6, $$7) && $$8;
        if ($$9) {
            this.a($$1, $$0, $$4, $$5);
        }
    }

    private void a(List<a> $$0, b $$1, int $$2, int $$3) {
        int $$8;
        a $$4 = null;
        for (a $$5 : $$0) {
            int $$6;
            if ($$5.a() != $$1) continue;
            int n2 = $$6 = $$1.d() ? $$3 : $$2;
            if ($$5.d() != $$6) continue;
            $$4 = $$5;
            break;
        }
        int $$7 = $$1.d() ? $$3 : $$2;
        int n3 = $$8 = $$1.d() ? $$2 : $$3;
        if ($$4 == null) {
            $$0.add(new a($$1, $$8, $$7));
        } else {
            $$4.a($$8);
        }
    }

    private boolean a(fup $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        if ($$2 < 0 || $$3 < 0 || $$2 >= $$4 || $$3 >= $$5) {
            return true;
        }
        return $$0.a($$1, $$2, $$3);
    }

    static class a {
        private final b a;
        private int b;
        private int c;
        private final int d;

        public a(b $$0, int $$1, int $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$1;
            this.d = $$2;
        }

        public void a(int $$0) {
            if ($$0 < this.b) {
                this.b = $$0;
            } else if ($$0 > this.c) {
                this.c = $$0;
            }
        }

        public b a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public int d() {
            return this.d;
        }
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(ha.b, 0, -1);
        public static final /* enum */ b b = new b(ha.a, 0, 1);
        public static final /* enum */ b c = new b(ha.f, -1, 0);
        public static final /* enum */ b d = new b(ha.e, 1, 0);
        private final ha e;
        private final int f;
        private final int g;
        private static final /* synthetic */ b[] h;

        public static b[] values() {
            return (b[])h.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(ha $$0, int $$1, int $$2) {
            this.e = $$0;
            this.f = $$1;
            this.g = $$2;
        }

        public ha a() {
            return this.e;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.g;
        }

        boolean d() {
            return this == b || this == a;
        }

        private static /* synthetic */ b[] e() {
            return new b[]{a, b, c, d};
        }

        static {
            h = fkz$b.e();
        }
    }
}

