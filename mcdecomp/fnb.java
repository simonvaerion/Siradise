/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class fnb
implements fnd.a {
    final enn a;
    private double b = Double.MIN_VALUE;
    private final int c = 12;
    @Nullable
    private a d;

    public fnb(enn $$0) {
        this.a = $$0;
    }

    @Override
    public void a(eij $$0, fjx $$1, double $$2, double $$3, double $$4) {
        double $$5 = ac.c();
        if ($$5 - this.b > 3.0E9) {
            this.b = $$5;
            fyp $$6 = this.a.S();
            this.d = $$6 != null ? new a($$6, $$2, $$4) : null;
        }
        if (this.d != null) {
            Map $$7 = this.d.c.getNow(null);
            double $$8 = this.a.j.m().b().d * 0.85;
            for (Map.Entry<clt, String> $$9 : this.d.b.entrySet()) {
                clt $$10 = $$9.getKey();
                Object $$11 = $$9.getValue();
                if ($$7 != null) {
                    $$11 = (String)$$11 + (String)$$7.get($$10);
                }
                String[] $$12 = ((String)$$11).split("\n");
                int $$13 = 0;
                for (String $$14 : $$12) {
                    fnd.a($$0, $$1, $$14, hx.a($$10.e, 8), $$8 + (double)$$13, hx.a($$10.f, 8), -1, 0.15f, true, 0.0f, true);
                    $$13 -= 2;
                }
            }
        }
    }

    final class a {
        final Map<clt, String> b;
        final CompletableFuture<Map<clt, String>> c;

        a(fyp $$0, double $$1, double $$2) {
            few $$3 = fnb.this.a.s;
            acp<cmm> $$4 = $$3.ac();
            int $$5 = hx.a($$1);
            int $$6 = hx.a($$2);
            ImmutableMap.Builder $$7 = ImmutableMap.builder();
            feu $$8 = $$3.i();
            for (int $$9 = $$5 - 12; $$9 <= $$5 + 12; ++$$9) {
                for (int $$10 = $$6 - 12; $$10 <= $$6 + 12; ++$$10) {
                    clt $$11 = new clt($$9, $$10);
                    Object $$12 = "";
                    dei $$13 = $$8.a($$9, $$10, false);
                    $$12 = (String)$$12 + "Client: ";
                    if ($$13 == null) {
                        $$12 = (String)$$12 + "0n/a\n";
                    } else {
                        $$12 = (String)$$12 + ($$13.C() ? " E" : "");
                        $$12 = (String)$$12 + "\n";
                    }
                    $$7.put((Object)$$11, $$12);
                }
            }
            this.b = $$7.build();
            this.c = $$0.a(() -> {
                aif $$4 = $$0.a($$4);
                if ($$4 == null) {
                    return ImmutableMap.of();
                }
                ImmutableMap.Builder $$5 = ImmutableMap.builder();
                aid $$6 = $$4.k();
                for (int $$7 = $$5 - 12; $$7 <= $$5 + 12; ++$$7) {
                    for (int $$8 = $$6 - 12; $$8 <= $$6 + 12; ++$$8) {
                        clt $$9 = new clt($$7, $$8);
                        $$5.put((Object)$$9, (Object)("Server: " + $$6.a($$9)));
                    }
                }
                return $$5.build();
            });
        }
    }
}

