/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.ArrayList;
import javax.annotation.Nullable;

public class cll
extends ArrayList<clk> {
    public cll() {
    }

    private cll(int $$0) {
        super($$0);
    }

    public cll(qr $$0) {
        qx $$1 = $$0.c("Recipes", 10);
        for (int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            this.add(new clk($$1.a($$2)));
        }
    }

    @Nullable
    public clk a(cfz $$0, cfz $$1, int $$2) {
        if ($$2 > 0 && $$2 < this.size()) {
            clk $$3 = (clk)this.get($$2);
            if ($$3.a($$0, $$1)) {
                return $$3;
            }
            return null;
        }
        for (int $$4 = 0; $$4 < this.size(); ++$$4) {
            clk $$5 = (clk)this.get($$4);
            if (!$$5.a($$0, $$1)) continue;
            return $$5;
        }
        return null;
    }

    public void a(sf $$02) {
        $$02.a(this, ($$0, $$1) -> {
            $$0.a($$1.a());
            $$0.a($$1.d());
            $$0.a($$1.c());
            $$0.writeBoolean($$1.p());
            $$0.writeInt($$1.g());
            $$0.writeInt($$1.i());
            $$0.writeInt($$1.o());
            $$0.writeInt($$1.m());
            $$0.writeFloat($$1.n());
            $$0.writeInt($$1.k());
        });
    }

    public static cll b(sf $$02) {
        return $$02.a(cll::new, $$0 -> {
            cfz $$1 = $$0.r();
            cfz $$2 = $$0.r();
            cfz $$3 = $$0.r();
            boolean $$4 = $$0.readBoolean();
            int $$5 = $$0.readInt();
            int $$6 = $$0.readInt();
            int $$7 = $$0.readInt();
            int $$8 = $$0.readInt();
            float $$9 = $$0.readFloat();
            int $$10 = $$0.readInt();
            clk $$11 = new clk($$1, $$3, $$2, $$5, $$6, $$7, $$9, $$10);
            if ($$4) {
                $$11.q();
            }
            $$11.b($$8);
            return $$11;
        });
    }

    public qr a() {
        qr $$0 = new qr();
        qx $$1 = new qx();
        for (int $$2 = 0; $$2 < this.size(); ++$$2) {
            clk $$3 = (clk)this.get($$2);
            $$1.add($$3.t());
        }
        $$0.a("Recipes", $$1);
        return $$0;
    }
}

