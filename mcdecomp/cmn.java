/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cmn
extends cly,
cmt {
    @Override
    default public long ah() {
        return this.u_().f();
    }

    public long A_();

    public efp<cpn> L();

    private <T> eft<T> a(gu $$0, T $$1, int $$2, efx $$3) {
        return new eft<T>($$1, $$0, this.u_().e() + (long)$$2, $$3, this.A_());
    }

    private <T> eft<T> a(gu $$0, T $$1, int $$2) {
        return new eft<T>($$1, $$0, this.u_().e() + (long)$$2, this.A_());
    }

    default public void a(gu $$0, cpn $$1, int $$2, efx $$3) {
        this.L().a(this.a($$0, (Object)$$1, $$2, $$3));
    }

    default public void a(gu $$0, cpn $$1, int $$2) {
        this.L().a(this.a($$0, (Object)$$1, $$2));
    }

    public efp<dxd> K();

    default public void a(gu $$0, dxd $$1, int $$2, efx $$3) {
        this.K().a(this.a($$0, (Object)$$1, $$2, $$3));
    }

    default public void a(gu $$0, dxd $$1, int $$2) {
        this.K().a(this.a($$0, (Object)$$1, $$2));
    }

    public dyv u_();

    public bdv d_(gu var1);

    @Nullable
    public MinecraftServer n();

    default public bdu ai() {
        return this.u_().s();
    }

    public deb J();

    @Override
    default public boolean b(int $$0, int $$1) {
        return this.J().b($$0, $$1);
    }

    public apf y_();

    default public void b(gu $$0, cpn $$1) {
    }

    default public void a(ha $$0, dcb $$1, gu $$2, gu $$3, int $$4, int $$5) {
        dyg.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
    }

    default public void a(@Nullable byo $$0, gu $$1, amg $$2, ami $$3) {
        this.a($$0, $$1, $$2, $$3, 1.0f, 1.0f);
    }

    public void a(@Nullable byo var1, gu var2, amg var3, ami var4, float var5, float var6);

    public void a(it var1, double var2, double var4, double var6, double var8, double var10, double var12);

    public void a(@Nullable byo var1, int var2, gu var3, int var4);

    default public void c(int $$0, gu $$1, int $$2) {
        this.a(null, $$0, $$1, $$2);
    }

    public void a(dgl var1, eei var2, dgl.a var3);

    default public void a(@Nullable bfj $$0, dgl $$1, eei $$2) {
        this.a($$1, $$2, new dgl.a($$0, null));
    }

    default public void a(@Nullable bfj $$0, dgl $$1, gu $$2) {
        this.a($$1, $$2, new dgl.a($$0, null));
    }

    default public void a(dgl $$0, gu $$1, dgl.a $$2) {
        this.a($$0, eei.b($$1), $$2);
    }
}

