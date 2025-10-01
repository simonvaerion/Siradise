/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import javax.annotation.Nullable;

public class dgl {
    public static final dgl a = dgl.a("block_activate");
    public static final dgl b = dgl.a("block_attach");
    public static final dgl c = dgl.a("block_change");
    public static final dgl d = dgl.a("block_close");
    public static final dgl e = dgl.a("block_deactivate");
    public static final dgl f = dgl.a("block_destroy");
    public static final dgl g = dgl.a("block_detach");
    public static final dgl h = dgl.a("block_open");
    public static final dgl i = dgl.a("block_place");
    public static final dgl j = dgl.a("container_close");
    public static final dgl k = dgl.a("container_open");
    public static final dgl l = dgl.a("drink");
    public static final dgl m = dgl.a("eat");
    public static final dgl n = dgl.a("elytra_glide");
    public static final dgl o = dgl.a("entity_damage");
    public static final dgl p = dgl.a("entity_die");
    public static final dgl q = dgl.a("entity_dismount");
    public static final dgl r = dgl.a("entity_interact");
    public static final dgl s = dgl.a("entity_mount");
    public static final dgl t = dgl.a("entity_place");
    public static final dgl u = dgl.a("entity_roar");
    public static final dgl v = dgl.a("entity_shake");
    public static final dgl w = dgl.a("equip");
    public static final dgl x = dgl.a("explode");
    public static final dgl y = dgl.a("flap");
    public static final dgl z = dgl.a("fluid_pickup");
    public static final dgl A = dgl.a("fluid_place");
    public static final dgl B = dgl.a("hit_ground");
    public static final dgl C = dgl.a("instrument_play");
    public static final dgl D = dgl.a("item_interact_finish");
    public static final dgl E = dgl.a("item_interact_start");
    public static final dgl F = dgl.a("jukebox_play", 10);
    public static final dgl G = dgl.a("jukebox_stop_play", 10);
    public static final dgl H = dgl.a("lightning_strike");
    public static final dgl I = dgl.a("note_block_play");
    public static final dgl J = dgl.a("prime_fuse");
    public static final dgl K = dgl.a("projectile_land");
    public static final dgl L = dgl.a("projectile_shoot");
    public static final dgl M = dgl.a("sculk_sensor_tendrils_clicking");
    public static final dgl N = dgl.a("shear");
    public static final dgl O = dgl.a("shriek", 32);
    public static final dgl P = dgl.a("splash");
    public static final dgl Q = dgl.a("step");
    public static final dgl R = dgl.a("swim");
    public static final dgl S = dgl.a("teleport");
    public static final dgl T = dgl.a("resonate_1");
    public static final dgl U = dgl.a("resonate_2");
    public static final dgl V = dgl.a("resonate_3");
    public static final dgl W = dgl.a("resonate_4");
    public static final dgl X = dgl.a("resonate_5");
    public static final dgl Y = dgl.a("resonate_6");
    public static final dgl Z = dgl.a("resonate_7");
    public static final dgl aa = dgl.a("resonate_8");
    public static final dgl ab = dgl.a("resonate_9");
    public static final dgl ac = dgl.a("resonate_10");
    public static final dgl ad = dgl.a("resonate_11");
    public static final dgl ae = dgl.a("resonate_12");
    public static final dgl af = dgl.a("resonate_13");
    public static final dgl ag = dgl.a("resonate_14");
    public static final dgl ah = dgl.a("resonate_15");
    public static final int ai = 16;
    private final String aj;
    private final int ak;
    private final he.c<dgl> al = jb.b.f(this);

    public dgl(String $$0, int $$1) {
        this.aj = $$0;
        this.ak = $$1;
    }

    public String a() {
        return this.aj;
    }

    public int b() {
        return this.ak;
    }

    private static dgl a(String $$0) {
        return dgl.a($$0, 16);
    }

    private static dgl a(String $$0, int $$1) {
        return hr.a(jb.b, $$0, new dgl($$0, $$1));
    }

    public String toString() {
        return "Game Event{ " + this.aj + " , " + this.ak + "}";
    }

    @Deprecated
    public he.c<dgl> c() {
        return this.al;
    }

    public boolean a(anl<dgl> $$0) {
        return this.al.a($$0);
    }

    public static final class b
    implements Comparable<b> {
        private final dgl a;
        private final eei b;
        private final a c;
        private final dgn d;
        private final double e;

        public b(dgl $$0, eei $$1, a $$2, dgn $$3, eei $$4) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$1.g($$4);
        }

        public int a(b $$0) {
            return Double.compare(this.e, $$0.e);
        }

        public dgl a() {
            return this.a;
        }

        public eei b() {
            return this.b;
        }

        public a c() {
            return this.c;
        }

        public dgn d() {
            return this.d;
        }

        @Override
        public /* synthetic */ int compareTo(Object object) {
            return this.a((b)object);
        }
    }

    public record a(@Nullable bfj a, @Nullable dcb b) {
        public static a a(@Nullable bfj $$0) {
            return new a($$0, null);
        }

        public static a a(@Nullable dcb $$0) {
            return new a(null, $$0);
        }

        public static a a(@Nullable bfj $$0, @Nullable dcb $$1) {
            return new a($$0, $$1);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "sourceEntity;affectedState", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "sourceEntity;affectedState", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "sourceEntity;affectedState", "a", "b"}, this, $$0);
        }
    }
}

