/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.server.MinecraftServer;

public class edr
implements edt<MinecraftServer> {
    final acq a;

    public edr(acq $$0) {
        this.a = $$0;
    }

    public void a(MinecraftServer $$0, edv<MinecraftServer> $$12, long $$2) {
        ade $$3 = $$0.aA();
        $$3.a(this.a).ifPresent($$1 -> $$3.a((dn)$$1, $$3.d()));
    }

    @Override
    public /* synthetic */ void handle(Object object, edv edv2, long l2) {
        this.a((MinecraftServer)object, edv2, l2);
    }

    public static class a
    extends edt.a<MinecraftServer, edr> {
        public a() {
            super(new acq("function"), edr.class);
        }

        @Override
        public void a(qr $$0, edr $$1) {
            $$0.a("Name", $$1.a.toString());
        }

        public edr a(qr $$0) {
            acq $$1 = new acq($$0.l("Name"));
            return new edr($$1);
        }

        @Override
        public /* synthetic */ edt b(qr qr2) {
            return this.a(qr2);
        }
    }
}

