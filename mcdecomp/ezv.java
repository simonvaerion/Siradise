/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ezv
implements ezq,
ezr {
    private static final sw a = sw.c("spectatorMenu.team_teleport");
    private static final sw b = sw.c("spectatorMenu.team_teleport.prompt");
    private final List<ezr> c;

    public ezv() {
        enn $$0 = enn.N();
        this.c = ezv.a($$0, $$0.s.I());
    }

    private static List<ezr> a(enn $$0, efg $$12) {
        return $$12.g().stream().flatMap($$1 -> ezv$a.a($$0, $$1).stream()).toList();
    }

    @Override
    public List<ezr> a() {
        return this.c;
    }

    @Override
    public sw b() {
        return b;
    }

    @Override
    public void a(ezp $$0) {
        $$0.a(this);
    }

    @Override
    public sw aI_() {
        return a;
    }

    @Override
    public void a(eox $$0, float $$1, int $$2) {
        $$0.a(eqw.a, 0, 0, 16.0f, 0.0f, 16, 16, 256, 256);
    }

    @Override
    public boolean aJ_() {
        return !this.c.isEmpty();
    }

    static class a
    implements ezr {
        private final efe a;
        private final acq b;
        private final List<ffb> c;

        private a(efe $$0, List<ffb> $$1, acq $$2) {
            this.a = $$0;
            this.c = $$1;
            this.b = $$2;
        }

        public static Optional<ezr> a(enn $$0, efe $$1) {
            ArrayList<ffb> $$2 = new ArrayList<ffb>();
            for (String $$3 : $$1.g()) {
                ffb $$4 = $$0.I().a($$3);
                if ($$4 == null || $$4.e() == cmj.d) continue;
                $$2.add($$4);
            }
            if ($$2.isEmpty()) {
                return Optional.empty();
            }
            GameProfile $$5 = ((ffb)$$2.get(apf.a().a($$2.size()))).a();
            acq $$6 = $$0.ak().b($$5);
            return Optional.of(new a($$1, $$2, $$6));
        }

        @Override
        public void a(ezp $$0) {
            $$0.a(new ezu(this.c));
        }

        @Override
        public sw aI_() {
            return this.a.c();
        }

        @Override
        public void a(eox $$0, float $$1, int $$2) {
            Integer $$3 = this.a.n().f();
            if ($$3 != null) {
                float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0f;
                float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0f;
                float $$6 = (float)($$3 & 0xFF) / 255.0f;
                $$0.a(1, 1, 15, 15, apa.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
            }
            $$0.a($$1, $$1, $$1, (float)$$2 / 255.0f);
            eqf.a($$0, this.b, 2, 2, 12);
            $$0.a(1.0f, 1.0f, 1.0f, 1.0f);
        }

        @Override
        public boolean aJ_() {
            return true;
        }
    }
}

