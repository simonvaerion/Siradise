/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dat
extends czn
implements dgn.b<dgu.b>,
dgu {
    private static final Logger b = LogUtils.getLogger();
    private static final int c = 10;
    private static final int d = 20;
    private static final int e = 5;
    private static final int g = 6;
    private static final int h = 40;
    private static final int i = 90;
    private static final Int2ObjectMap<amg> j = (Int2ObjectMap)ac.a(new Int2ObjectOpenHashMap(), (T $$0) -> {
        $$0.put(1, (Object)amh.zA);
        $$0.put(2, (Object)amh.zB);
        $$0.put(3, (Object)amh.zC);
        $$0.put(4, (Object)amh.zz);
    });
    private int k;
    private final dgu.d l = new a();
    private dgu.a m = new dgu.a();
    private final dgu.b n = new dgu.b(this);

    public dat(gu $$0, dcb $$1) {
        super(czp.L, $$0, $$1);
    }

    @Override
    public dgu.a gb() {
        return this.m;
    }

    @Override
    public dgu.d gc() {
        return this.l;
    }

    @Override
    public void a(qr $$02) {
        super.a($$02);
        if ($$02.b("warning_level", 99)) {
            this.k = $$02.h("warning_level");
        }
        if ($$02.b("listener", 10)) {
            dgu.a.a.parse(new Dynamic((DynamicOps)rc.a, (Object)$$02.p("listener"))).resultOrPartial(arg_0 -> ((Logger)b).error(arg_0)).ifPresent($$0 -> {
                this.m = $$0;
            });
        }
    }

    @Override
    protected void b(qr $$0) {
        super.b($$0);
        $$0.a("warning_level", this.k);
        dgu.a.a.encodeStart((DynamicOps)rc.a, (Object)this.m).resultOrPartial(arg_0 -> ((Logger)b).error(arg_0)).ifPresent($$1 -> $$0.a("listener", (rk)$$1));
    }

    @Nullable
    public static aig a(@Nullable bfj $$0) {
        bvh $$5;
        bzg $$3;
        bfj bfj2;
        bfz bfz2;
        if ($$0 instanceof aig) {
            aig $$1 = (aig)$$0;
            return $$1;
        }
        if ($$0 != null && (bfz2 = $$0.cL()) instanceof aig) {
            aig $$2 = (aig)bfz2;
            return $$2;
        }
        if ($$0 instanceof bzg && (bfj2 = ($$3 = (bzg)$$0).v()) instanceof aig) {
            aig $$4 = (aig)bfj2;
            return $$4;
        }
        if ($$0 instanceof bvh && (bfj2 = ($$5 = (bvh)$$0).v()) instanceof aig) {
            aig $$6 = (aig)bfj2;
            return $$6;
        }
        return null;
    }

    public void a(aif $$0, @Nullable aig $$1) {
        if ($$1 == null) {
            return;
        }
        dcb $$2 = this.q();
        if ($$2.c(cwh.a).booleanValue()) {
            return;
        }
        this.k = 0;
        if (this.b($$0) && !this.b($$0, $$1)) {
            return;
        }
        this.a($$0, (bfj)$$1);
    }

    private boolean b(aif $$02, aig $$1) {
        OptionalInt $$2 = bxu.a($$02, this.p(), $$1);
        $$2.ifPresent($$0 -> {
            this.k = $$0;
        });
        return $$2.isPresent();
    }

    private void a(aif $$0, @Nullable bfj $$1) {
        gu $$2 = this.p();
        dcb $$3 = this.q();
        $$0.a($$2, (dcb)$$3.a(cwh.a, true), 2);
        $$0.a($$2, $$3.b(), 90);
        $$0.c(3007, $$2, 0);
        $$0.a(dgl.O, $$2, dgl.a.a($$1));
    }

    private boolean b(aif $$0) {
        return this.q().c(cwh.c) != false && $$0.ai() != bdu.a && $$0.X().b(cmi.I);
    }

    public void a(aif $$0) {
        if (this.b($$0) && this.k > 0) {
            if (!this.c($$0)) {
                this.b((cmm)$$0);
            }
            bxs.a($$0, eei.b(this.p()), null, 40);
        }
    }

    private void b(cmm $$0) {
        amg $$1 = (amg)j.get(this.k);
        if ($$1 != null) {
            gu $$2 = this.p();
            int $$3 = $$2.u() + apa.b($$0.z, -10, 10);
            int $$4 = $$2.v() + apa.b($$0.z, -10, 10);
            int $$5 = $$2.w() + apa.b($$0.z, -10, 10);
            $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, ami.f, 5.0f, 1.0f);
        }
    }

    private boolean c(aif $$0) {
        if (this.k < 4) {
            return false;
        }
        return app.a(bfn.bi, bgd.k, $$0, this.p(), 20, 5, 6, app.a.b).isPresent();
    }

    public dgu.b c() {
        return this.n;
    }

    @Override
    public /* synthetic */ dgn d() {
        return this.c();
    }

    class a
    implements dgu.d {
        private static final int b = 8;
        private final dgp c;

        public a() {
            this.c = new dgh(dat.this.p);
        }

        @Override
        public int a() {
            return 8;
        }

        @Override
        public dgp b() {
            return this.c;
        }

        @Override
        public anl<dgl> c() {
            return anc.c;
        }

        @Override
        public boolean a(aif $$0, gu $$1, dgl $$2, dgl.a $$3) {
            return dat.this.q().c(cwh.a) == false && dat.a($$3.a()) != null;
        }

        @Override
        public void a(aif $$0, gu $$1, dgl $$2, @Nullable bfj $$3, @Nullable bfj $$4, float $$5) {
            dat.this.a($$0, dat.a($$4 != null ? $$4 : $$3));
        }

        @Override
        public void e() {
            dat.this.e();
        }

        @Override
        public boolean f() {
            return true;
        }
    }
}

