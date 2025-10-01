/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cfs
extends cfu {
    private static final String a = "instrument";
    private final anl<cfr> b;

    public cfs(cfu.a $$0, anl<cfr> $$1) {
        super($$0);
        this.b = $$1;
    }

    @Override
    public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
        super.a($$0, $$1, $$2, $$3);
        Optional $$4 = this.d($$0).flatMap(he::e);
        if ($$4.isPresent()) {
            tj $$5 = sw.c(ac.a(a, ((acp)$$4.get()).a()));
            $$2.add($$5.a(n.h));
        }
    }

    public static cfz a(cfu $$0, he<cfr> $$1) {
        cfz $$2 = new cfz($$0);
        cfs.a($$2, $$1);
        return $$2;
    }

    public static void a(cfz $$0, anl<cfr> $$12, apf $$2) {
        Optional $$3 = jb.am.b($$12).flatMap($$1 -> $$1.a($$2));
        $$3.ifPresent($$1 -> cfs.a($$0, (he<cfr>)$$1));
    }

    private static void a(cfz $$0, he<cfr> $$1) {
        qr $$2 = $$0.w();
        $$2.a(a, $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
    }

    @Override
    public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
        cfz $$3 = $$1.b($$2);
        Optional<? extends he<cfr>> $$4 = this.d($$3);
        if ($$4.isPresent()) {
            cfr $$5 = $$4.get().a();
            $$1.c($$2);
            cfs.a($$0, $$1, $$5);
            $$1.gi().a((cfu)this, $$5.b());
            $$1.b(amr.c.b(this));
            return bdy.b($$3);
        }
        return bdy.d($$3);
    }

    @Override
    public int b(cfz $$02) {
        Optional<? extends he<cfr>> $$1 = this.d($$02);
        return $$1.map($$0 -> ((cfr)$$0.a()).b()).orElse(0);
    }

    private Optional<? extends he<cfr>> d(cfz $$0) {
        acq $$2;
        qr $$1 = $$0.v();
        if ($$1 != null && $$1.b(a, 8) && ($$2 = acq.a($$1.l(a))) != null) {
            return jb.am.b(acp.a(jc.B, $$2));
        }
        Iterator<he<cfr>> $$3 = jb.am.c(this.b).iterator();
        if ($$3.hasNext()) {
            return Optional.of($$3.next());
        }
        return Optional.empty();
    }

    @Override
    public chs c(cfz $$0) {
        return chs.i;
    }

    private static void a(cmm $$0, byo $$1, cfr $$2) {
        amg $$3 = $$2.a().a();
        float $$4 = $$2.c() / 16.0f;
        $$0.a($$1, $$1, $$3, ami.c, $$4, 1.0f);
        $$0.a(dgl.C, $$1.dg(), dgl.a.a($$1));
    }
}

