/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.joml.Matrix4f
 */
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.List;
import java.util.function.IntSupplier;
import org.joml.Matrix4f;

public class fkb
implements AutoCloseable {
    private final fjn c;
    public final egv a;
    public final egv b;
    private final List<IntSupplier> d = Lists.newArrayList();
    private final List<String> e = Lists.newArrayList();
    private final List<Integer> f = Lists.newArrayList();
    private final List<Integer> g = Lists.newArrayList();
    private Matrix4f h;

    public fkb(akx $$0, String $$1, egv $$2, egv $$3) throws IOException {
        this.c = new fjn($$0, $$1);
        this.a = $$2;
        this.b = $$3;
    }

    @Override
    public void close() {
        this.c.close();
    }

    public final String a() {
        return this.c.h();
    }

    public void a(String $$0, IntSupplier $$1, int $$2, int $$3) {
        this.e.add(this.e.size(), $$0);
        this.d.add(this.d.size(), $$1);
        this.f.add(this.f.size(), $$2);
        this.g.add(this.g.size(), $$3);
    }

    public void a(Matrix4f $$0) {
        this.h = $$0;
    }

    public void a(float $$0) {
        this.a.e();
        float $$1 = this.b.c;
        float $$2 = this.b.d;
        RenderSystem.viewport(0, 0, (int)$$1, (int)$$2);
        this.c.a("DiffuseSampler", this.a::f);
        for (int $$3 = 0; $$3 < this.d.size(); ++$$3) {
            this.c.a(this.e.get($$3), this.d.get($$3));
            this.c.b("AuxSize" + $$3).a((float)this.f.get($$3).intValue(), (float)this.g.get($$3).intValue());
        }
        this.c.b("ProjMat").a(this.h);
        this.c.b("InSize").a((float)this.a.c, (float)this.a.d);
        this.c.b("OutSize").a($$1, $$2);
        this.c.b("Time").a($$0);
        enn $$4 = enn.N();
        this.c.b("ScreenSize").a((float)$$4.aM().k(), (float)$$4.aM().l());
        this.c.g();
        this.b.b(enn.a);
        this.b.a(false);
        RenderSystem.depthFunc(519);
        eie $$5 = eil.a().c();
        $$5.a(eio.b.h, eih.m);
        $$5.a(0.0, 0.0, 500.0).e();
        $$5.a((double)$$1, 0.0, 500.0).e();
        $$5.a((double)$$1, (double)$$2, 500.0).e();
        $$5.a(0.0, (double)$$2, 500.0).e();
        eif.b($$5.d());
        RenderSystem.depthFunc(515);
        this.c.f();
        this.b.e();
        this.a.d();
        for (IntSupplier $$6 : this.d) {
            if (!($$6 instanceof egv)) continue;
            ((egv)((Object)$$6)).d();
        }
    }

    public fjn b() {
        return this.c;
    }
}

