/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class das
extends czn
implements dgn.b<dgu.b>,
dgu {
    private static final Logger b = LogUtils.getLogger();
    private dgu.a c;
    private final dgu.b d;
    private final dgu.d e = this.c();
    private int g;

    protected das(czp<?> $$0, gu $$1, dcb $$2) {
        super($$0, $$1, $$2);
        this.c = new dgu.a();
        this.d = new dgu.b(this);
    }

    public das(gu $$0, dcb $$1) {
        this(czp.I, $$0, $$1);
    }

    public dgu.d c() {
        return new a(this.p());
    }

    @Override
    public void a(qr $$02) {
        super.a($$02);
        this.g = $$02.h("last_vibration_frequency");
        if ($$02.b("listener", 10)) {
            dgu.a.a.parse(new Dynamic((DynamicOps)rc.a, (Object)$$02.p("listener"))).resultOrPartial(arg_0 -> ((Logger)b).error(arg_0)).ifPresent($$0 -> {
                this.c = $$0;
            });
        }
    }

    @Override
    protected void b(qr $$0) {
        super.b($$0);
        $$0.a("last_vibration_frequency", this.g);
        dgu.a.a.encodeStart((DynamicOps)rc.a, (Object)this.c).resultOrPartial(arg_0 -> ((Logger)b).error(arg_0)).ifPresent($$1 -> $$0.a("listener", (rk)$$1));
    }

    @Override
    public dgu.a gb() {
        return this.c;
    }

    @Override
    public dgu.d gc() {
        return this.e;
    }

    public int f() {
        return this.g;
    }

    public void a(int $$0) {
        this.g = $$0;
    }

    public dgu.b g() {
        return this.d;
    }

    @Override
    public /* synthetic */ dgn d() {
        return this.g();
    }

    protected class a
    implements dgu.d {
        public static final int b = 8;
        protected final gu c;
        private final dgp a;

        public a(gu $$1) {
            this.c = $$1;
            this.a = new dgh($$1);
        }

        @Override
        public int a() {
            return 8;
        }

        @Override
        public dgp b() {
            return this.a;
        }

        @Override
        public boolean d() {
            return true;
        }

        @Override
        public boolean a(aif $$0, gu $$1, dgl $$2, @Nullable dgl.a $$3) {
            if ($$1.equals(this.c) && ($$2 == dgl.f || $$2 == dgl.i)) {
                return false;
            }
            return cwg.n(das.this.q());
        }

        @Override
        public void a(aif $$0, gu $$1, dgl $$2, @Nullable bfj $$3, @Nullable bfj $$4, float $$5) {
            dcb $$6 = das.this.q();
            if (cwg.n($$6)) {
                das.this.a(dgu.a_($$2));
                int $$7 = dgu.a_($$5, this.a());
                cpn cpn2 = $$6.b();
                if (cpn2 instanceof cwg) {
                    cwg $$8 = (cwg)cpn2;
                    $$8.a($$3, (cmm)$$0, this.c, $$6, $$7, das.this.f());
                }
            }
        }

        @Override
        public void e() {
            das.this.e();
        }

        @Override
        public boolean f() {
            return true;
        }
    }
}

