/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  javax.annotation.Nullable
 */
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ekt
extends epi {
    public static final acq a = new acq("realms", "textures/gui/realms/slot_frame.png");
    public static final acq b = new acq("realms", "textures/gui/realms/empty_frame.png");
    public static final acq c = new acq("minecraft", "textures/gui/checkmark.png");
    public static final acq d = new acq("minecraft", "textures/gui/title/background/panorama_0.png");
    public static final acq e = new acq("minecraft", "textures/gui/title/background/panorama_2.png");
    public static final acq f = new acq("minecraft", "textures/gui/title/background/panorama_3.png");
    private static final sw A = sw.c("mco.configure.world.slot.tooltip.active");
    private static final sw C = sw.c("mco.configure.world.slot.tooltip.minigame");
    private static final sw D = sw.c("mco.configure.world.slot.tooltip");
    private static final sw E = sw.c("mco.worldSlot.minigame");
    private final Supplier<ejq> F;
    private final Consumer<sw> G;
    private final int H;
    @Nullable
    private b I;

    public ekt(int $$0, int $$1, int $$2, int $$3, Supplier<ejq> $$4, Consumer<sw> $$5, int $$6, epi.c $$7) {
        super($$0, $$1, $$2, $$3, sv.a, $$7, x);
        this.F = $$4;
        this.H = $$6;
        this.G = $$5;
    }

    @Nullable
    public b a() {
        return this.I;
    }

    public void b() {
        boolean $$12;
        String $$11;
        long $$10;
        String $$9;
        boolean $$8;
        boolean $$2;
        ejq $$0 = this.F.get();
        if ($$0 == null) {
            return;
        }
        ejx $$1 = $$0.i.get(this.H);
        boolean bl2 = $$2 = this.H == 4;
        if ($$2) {
            boolean $$3 = $$0.m == ejq.c.b;
            String $$4 = E.getString();
            long $$5 = $$0.p;
            String $$6 = $$0.q;
            boolean $$7 = $$0.p == -1;
        } else {
            $$8 = $$0.n == this.H && $$0.m != ejq.c.b;
            $$9 = $$1.a(this.H);
            $$10 = $$1.j;
            $$11 = $$1.k;
            $$12 = $$1.l;
        }
        a $$13 = ekt.a($$0, $$8, $$2);
        Pair<sw, sw> $$14 = this.a($$0, $$9, $$12, $$2, $$13);
        this.I = new b($$8, $$9, $$10, $$11, $$12, $$2, $$13, (sw)$$14.getFirst());
        this.b((sw)$$14.getSecond());
    }

    private static a a(ejq $$0, boolean $$1, boolean $$2) {
        if ($$1) {
            if (!$$0.j && $$0.e != ejq.b.c) {
                return ekt$a.c;
            }
        } else if ($$2) {
            if (!$$0.j) {
                return ekt$a.b;
            }
        } else {
            return ekt$a.b;
        }
        return ekt$a.a;
    }

    private Pair<sw, sw> a(ejq $$0, String $$1, boolean $$2, boolean $$3, a $$4) {
        sw $$9;
        tj $$7;
        if ($$4 == ekt$a.a) {
            return Pair.of(null, (Object)sw.b($$1));
        }
        if ($$3) {
            if ($$2) {
                sw $$5 = sv.a;
            } else {
                tj $$6 = sv.a().f($$1).b(sv.t).f($$0.o);
            }
        } else {
            $$7 = sv.a().f($$1);
        }
        if ($$4 == ekt$a.c) {
            sw $$8 = A;
        } else {
            $$9 = $$3 ? C : D;
        }
        tj $$10 = $$9.e().b($$7);
        return Pair.of((Object)$$9, (Object)$$10);
    }

    @Override
    public void b(eox $$0, int $$1, int $$2, float $$3) {
        if (this.I == null) {
            return;
        }
        this.a($$0, this.p(), this.r(), $$1, $$2, this.I.d, this.I.e, this.H, this.I.f, this.I.g, this.I.a, this.I.b, this.I.c, this.I.h);
    }

    private void a(eox $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10, boolean $$11, a $$12, @Nullable sw $$13) {
        boolean $$23;
        acq $$22;
        boolean $$14 = this.n();
        if (this.a_($$3, $$4) && $$13 != null) {
            this.G.accept($$13);
        }
        enn $$15 = enn.N();
        if ($$11) {
            acq $$16 = eme.a(String.valueOf($$8), $$9);
        } else if ($$10) {
            acq $$17 = b;
        } else if ($$9 != null && $$8 != -1L) {
            acq $$18 = eme.a(String.valueOf($$8), $$9);
        } else if ($$7 == 1) {
            acq $$19 = d;
        } else if ($$7 == 2) {
            acq $$20 = e;
        } else if ($$7 == 3) {
            acq $$21 = f;
        } else {
            $$22 = b;
        }
        if ($$5) {
            $$0.a(0.56f, 0.56f, 0.56f, 1.0f);
        }
        $$0.a($$22, $$1 + 3, $$2 + 3, 0.0f, 0.0f, 74, 74, 74, 74);
        boolean bl2 = $$23 = $$14 && $$12 != ekt$a.a;
        if ($$23) {
            $$0.a(1.0f, 1.0f, 1.0f, 1.0f);
        } else if ($$5) {
            $$0.a(0.8f, 0.8f, 0.8f, 1.0f);
        } else {
            $$0.a(0.56f, 0.56f, 0.56f, 1.0f);
        }
        $$0.a(a, $$1, $$2, 0.0f, 0.0f, 80, 80, 80, 80);
        $$0.a(1.0f, 1.0f, 1.0f, 1.0f);
        if ($$5) {
            this.a($$0, $$1, $$2);
        }
        $$0.a($$15.h, $$6, $$1 + 40, $$2 + 66, 0xFFFFFF);
    }

    private void a(eox $$0, int $$1, int $$2) {
        RenderSystem.enableBlend();
        $$0.a(c, $$1 + 67, $$2 + 4, 0.0f, 0.0f, 9, 8, 9, 8);
        RenderSystem.disableBlend();
    }

    public static class b {
        final boolean d;
        final String e;
        final long f;
        @Nullable
        final String g;
        public final boolean a;
        public final boolean b;
        public final a c;
        @Nullable
        final sw h;

        b(boolean $$0, String $$1, long $$2, @Nullable String $$3, boolean $$4, boolean $$5, a $$6, @Nullable sw $$7) {
            this.d = $$0;
            this.e = $$1;
            this.f = $$2;
            this.g = $$3;
            this.a = $$4;
            this.b = $$5;
            this.c = $$6;
            this.h = $$7;
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = ekt$a.a();
        }
    }
}

