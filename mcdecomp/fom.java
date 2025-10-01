/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.joml.Matrix4f
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 */
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;

public abstract class fom<T extends bfi, S>
extends fox<T> {
    private final fow a;

    protected fom(foy.a $$0) {
        super($$0);
        this.a = $$0.a();
    }

    @Override
    public acq a(T $$0) {
        return fuu.e;
    }

    @Override
    public void a(T $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        bfi.j $$6 = ((bfi)$$0).k();
        if ($$6 == null) {
            return;
        }
        S $$7 = this.b($$0);
        if ($$7 == null) {
            return;
        }
        float $$8 = ((bfi)$$0).a($$2);
        this.d = $$6.d().get($$8);
        this.e = $$6.e().get($$8);
        int $$9 = $$6.c();
        int $$10 = $$9 != -1 ? $$9 : $$5;
        super.a($$0, $$1, $$2, $$3, $$4, $$10);
        $$3.a();
        $$3.a(this.a($$6, $$0));
        j $$11 = $$6.a().get($$8);
        $$3.a($$11.c());
        $$3.c().b().rotate((Quaternionfc)$$11.e()).rotate((Quaternionfc)$$11.g());
        this.a($$0, $$7, $$3, $$4, $$10, $$8);
        $$3.b();
    }

    private Quaternionf a(bfi.j $$0, T $$1) {
        emz $$2 = this.a.b;
        return switch ($$0.b()) {
            default -> throw new IncompatibleClassChangeError();
            case bfi.a.a -> ((bfi)$$1).j();
            case bfi.a.c -> new Quaternionf().rotationYXZ((float)(-Math.PI) / 180 * ((bfj)$$1).dy(), (float)(-Math.PI) / 180 * $$2.d(), 0.0f);
            case bfi.a.b -> new Quaternionf().rotationYXZ((float)Math.PI - (float)Math.PI / 180 * $$2.e(), (float)Math.PI / 180 * ((bfj)$$1).dA(), 0.0f);
            case bfi.a.d -> new Quaternionf().rotationYXZ((float)Math.PI - (float)Math.PI / 180 * $$2.e(), (float)(-Math.PI) / 180 * $$2.d(), 0.0f);
        };
    }

    @Nullable
    protected abstract S b(T var1);

    protected abstract void a(T var1, S var2, eij var3, fjx var4, int var5, float var6);

    public static class c
    extends fom<bfi.k, bfi.k.e> {
        private final eov a;

        protected c(foy.a $$0) {
            super($$0);
            this.a = $$0.h();
        }

        private bfi.k.b a(sw $$0, int $$1) {
            List<aom> $$2 = this.a.c($$0, $$1);
            ArrayList<bfi.k.c> $$3 = new ArrayList<bfi.k.c>($$2.size());
            int $$4 = 0;
            for (aom $$5 : $$2) {
                int $$6 = this.a.a($$5);
                $$4 = Math.max($$4, $$6);
                $$3.add(new bfi.k.c($$5, $$6));
            }
            return new bfi.k.b($$3, $$4);
        }

        @Nullable
        protected bfi.k.e a(bfi.k $$0) {
            return $$0.o();
        }

        @Override
        public void a(bfi.k $$0, bfi.k.e $$1, eij $$2, fjx $$3, int $$4, float $$5) {
            int $$14;
            byte $$6 = $$1.e();
            boolean $$7 = ($$6 & 2) != 0;
            boolean $$8 = ($$6 & 4) != 0;
            boolean $$9 = ($$6 & 1) != 0;
            bfi.k.a $$10 = bfi.k.a($$6);
            byte $$11 = (byte)$$1.c().get($$5);
            if ($$8) {
                float $$12 = enn.N().m.a(0.25f);
                int $$13 = (int)($$12 * 255.0f) << 24;
            } else {
                $$14 = $$1.d().get($$5);
            }
            float $$15 = 0.0f;
            Matrix4f $$16 = $$2.c().a();
            $$16.rotate((float)Math.PI, 0.0f, 1.0f, 0.0f);
            $$16.scale(-0.025f, -0.025f, -0.025f);
            bfi.k.b $$17 = $$0.a(this::a);
            int $$18 = this.a.b + 1;
            int $$19 = $$17.b();
            int $$20 = $$17.a().size() * $$18;
            $$16.translate(1.0f - (float)$$19 / 2.0f, (float)(-$$20), 0.0f);
            if ($$14 != 0) {
                ein $$21 = $$3.getBuffer($$7 ? fkf.s() : fkf.r());
                $$21.a($$16, -1.0f, -1.0f, 0.0f).a($$14).b($$4).e();
                $$21.a($$16, -1.0f, (float)$$20, 0.0f).a($$14).b($$4).e();
                $$21.a($$16, (float)$$19, (float)$$20, 0.0f).a($$14).b($$4).e();
                $$21.a($$16, (float)$$19, -1.0f, 0.0f).a($$14).b($$4).e();
            }
            for (bfi.k.c $$22 : $$17.a()) {
                float $$23 = switch ($$10) {
                    default -> throw new IncompatibleClassChangeError();
                    case bfi.k.a.b -> 0.0f;
                    case bfi.k.a.c -> $$19 - $$22.b();
                    case bfi.k.a.a -> (float)$$19 / 2.0f - (float)$$22.b() / 2.0f;
                };
                this.a.a($$22.a(), $$23, $$15, $$11 << 24 | 0xFFFFFF, $$9, $$16, $$3, $$7 ? eov.a.b : eov.a.c, 0, $$4);
                $$15 += (float)$$18;
            }
        }

        @Override
        @Nullable
        protected /* synthetic */ Object b(bfi bfi2) {
            return this.a((bfi.k)bfi2);
        }
    }

    public static class b
    extends fom<bfi.g, bfi.g.a> {
        private final fpw a;

        protected b(foy.a $$0) {
            super($$0);
            this.a = $$0.b();
        }

        @Nullable
        protected bfi.g.a a(bfi.g $$0) {
            return $$0.o();
        }

        @Override
        public void a(bfi.g $$0, bfi.g.a $$1, eij $$2, fjx $$3, int $$4, float $$5) {
            $$2.a(a.d.rotation((float)Math.PI));
            this.a.a($$1.a(), $$1.b(), $$4, fum.d, $$2, $$3, $$0.dI(), $$0.af());
        }

        @Override
        @Nullable
        protected /* synthetic */ Object b(bfi bfi2) {
            return this.a((bfi.g)bfi2);
        }
    }

    public static class a
    extends fom<bfi.b, bfi.b.a> {
        private final fko a;

        protected a(foy.a $$0) {
            super($$0);
            this.a = $$0.c();
        }

        @Nullable
        protected bfi.b.a a(bfi.b $$0) {
            return $$0.o();
        }

        @Override
        public void a(bfi.b $$0, bfi.b.a $$1, eij $$2, fjx $$3, int $$4, float $$5) {
            this.a.a($$1.a(), $$2, $$3, $$4, fum.d);
        }

        @Override
        @Nullable
        protected /* synthetic */ Object b(bfi bfi2) {
            return this.a((bfi.b)bfi2);
        }
    }
}

