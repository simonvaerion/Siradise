/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cds
extends cfu {
    public static final String a = "BlockEntityTag";
    public static final String b = "BlockStateTag";
    @Deprecated
    private final cpn c;

    public cds(cpn $$0, cfu.a $$1) {
        super($$1);
        this.c = $$0;
    }

    @Override
    public bdx a(cij $$0) {
        bdx $$1 = this.a(new cih($$0));
        if (!$$1.a() && this.u()) {
            bdx $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
            return $$2 == bdx.b ? bdx.c : $$2;
        }
        return $$1;
    }

    public bdx a(cih $$0) {
        if (!this.e().a($$0.q().G())) {
            return bdx.e;
        }
        if (!$$0.b()) {
            return bdx.e;
        }
        cih $$1 = this.b($$0);
        if ($$1 == null) {
            return bdx.e;
        }
        dcb $$2 = this.c($$1);
        if ($$2 == null) {
            return bdx.e;
        }
        if (!this.a($$1, $$2)) {
            return bdx.e;
        }
        gu $$3 = $$1.a();
        cmm $$4 = $$1.q();
        byo $$5 = $$1.o();
        cfz $$6 = $$1.n();
        dcb $$7 = $$4.a_($$3);
        if ($$7.a($$2.b())) {
            $$7 = this.a($$3, $$4, $$6, $$7);
            this.a($$3, $$4, $$5, $$6, $$7);
            $$7.b().a($$4, $$3, $$7, $$5, $$6);
            if ($$5 instanceof aig) {
                ai.y.a((aig)$$5, $$3, $$6);
            }
        }
        cxa $$8 = $$7.w();
        $$4.a($$5, $$3, this.a($$7), ami.e, ($$8.a() + 1.0f) / 2.0f, $$8.b() * 0.8f);
        $$4.a(dgl.i, $$3, dgl.a.a($$5, $$7));
        if ($$5 == null || !$$5.fO().d) {
            $$6.h(1);
        }
        return bdx.a($$4.B);
    }

    protected amg a(dcb $$0) {
        return $$0.w().e();
    }

    @Nullable
    public cih b(cih $$0) {
        return $$0;
    }

    protected boolean a(gu $$0, cmm $$1, @Nullable byo $$2, cfz $$3, dcb $$4) {
        return cds.a($$1, $$2, $$0, $$3);
    }

    @Nullable
    protected dcb c(cih $$0) {
        dcb $$1 = this.e().a($$0);
        return $$1 != null && this.b($$0, $$1) ? $$1 : null;
    }

    private dcb a(gu $$0, cmm $$1, cfz $$2, dcb $$3) {
        dcb $$4 = $$3;
        qr $$5 = $$2.v();
        if ($$5 != null) {
            qr $$6 = $$5.p(b);
            dcc<cpn, dcb> $$7 = $$4.b().l();
            for (String $$8 : $$6.e()) {
                dde<?> $$9 = $$7.a($$8);
                if ($$9 == null) continue;
                String $$10 = $$6.c($$8).m_();
                $$4 = cds.a($$4, $$9, $$10);
            }
        }
        if ($$4 != $$3) {
            $$1.a($$0, $$4, 2);
        }
        return $$4;
    }

    private static <T extends Comparable<T>> dcb a(dcb $$0, dde<T> $$1, String $$22) {
        return $$1.b($$22).map($$2 -> (dcb)$$0.a($$1, $$2)).orElse($$0);
    }

    protected boolean b(cih $$0, dcb $$1) {
        byo $$2 = $$0.o();
        een $$3 = $$2 == null ? een.a() : een.a($$2);
        return (!this.d() || $$1.a((cmp)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
    }

    protected boolean d() {
        return true;
    }

    protected boolean a(cih $$0, dcb $$1) {
        return $$0.q().a($$0.a(), $$1, 11);
    }

    public static boolean a(cmm $$0, @Nullable byo $$1, gu $$2, cfz $$3) {
        czn $$6;
        MinecraftServer $$4 = $$0.n();
        if ($$4 == null) {
            return false;
        }
        qr $$5 = cds.a($$3);
        if ($$5 != null && ($$6 = $$0.c_($$2)) != null) {
            if (!($$0.B || !$$6.t() || $$1 != null && $$1.gk())) {
                return false;
            }
            qr $$7 = $$6.o();
            qr $$8 = $$7.h();
            $$7.a($$5);
            if (!$$7.equals($$8)) {
                $$6.a($$7);
                $$6.e();
                return true;
            }
        }
        return false;
    }

    @Override
    public String a() {
        return this.e().f();
    }

    @Override
    public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.e().a($$0, (cls)$$1, $$2, $$3);
    }

    public cpn e() {
        return this.c;
    }

    public void a(Map<cpn, cfu> $$0, cfu $$1) {
        $$0.put(this.e(), $$1);
    }

    @Override
    public boolean ah_() {
        return !(this.c instanceof cwm);
    }

    @Override
    public void a(bvh $$0) {
        cfz $$1;
        qr $$2;
        if (this.c instanceof cwm && ($$2 = cds.a($$1 = $$0.j())) != null && $$2.b("Items", 9)) {
            qx $$3 = $$2.c("Items", 10);
            cgb.a($$0, $$3.stream().map(qr.class::cast).map(cfz::a));
        }
    }

    @Nullable
    public static qr a(cfz $$0) {
        return $$0.b(a);
    }

    public static void a(cfz $$0, czp<?> $$1, qr $$2) {
        if ($$2.g()) {
            $$0.c(a);
        } else {
            czn.a($$2, $$1);
            $$0.a(a, $$2);
        }
    }

    @Override
    public caw m() {
        return this.e().m();
    }
}

