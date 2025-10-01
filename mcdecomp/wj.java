/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class wj
implements uo<ur> {
    private final int a;
    private final byte b;
    private final boolean c;
    @Nullable
    private final List<dyl> d;
    @Nullable
    private final dyo.b e;

    public wj(int $$0, byte $$1, boolean $$2, @Nullable Collection<dyl> $$3, @Nullable dyo.b $$4) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3 != null ? Lists.newArrayList($$3) : null;
        this.e = $$4;
    }

    public wj(sf $$0) {
        this.a = $$0.m();
        this.b = $$0.readByte();
        this.c = $$0.readBoolean();
        this.d = (List)$$0.c($$02 -> $$02.a($$0 -> {
            dyl.a $$1 = $$0.b(dyl.a.class);
            byte $$2 = $$0.readByte();
            byte $$3 = $$0.readByte();
            byte $$4 = (byte)($$0.readByte() & 0xF);
            sw $$5 = (sw)$$0.c(sf::l);
            return new dyl($$1, $$2, $$3, $$4, $$5);
        }));
        short $$1 = $$0.readUnsignedByte();
        if ($$1 > 0) {
            short $$2 = $$0.readUnsignedByte();
            short $$3 = $$0.readUnsignedByte();
            short $$4 = $$0.readUnsignedByte();
            byte[] $$5 = $$0.b();
            this.e = new dyo.b($$3, $$4, $$1, $$2, $$5);
        } else {
            this.e = null;
        }
    }

    @Override
    public void a(sf $$0) {
        $$0.d(this.a);
        $$0.writeByte(this.b);
        $$0.writeBoolean(this.c);
        $$0.a(this.d, ($$02, $$12) -> $$02.a($$12, ($$0, $$1) -> {
            $$0.a($$1.b());
            $$0.writeByte($$1.c());
            $$0.writeByte($$1.d());
            $$0.writeByte($$1.e() & 0xF);
            $$0.a($$1.g(), sf::a);
        }));
        if (this.e != null) {
            $$0.writeByte(this.e.c);
            $$0.writeByte(this.e.d);
            $$0.writeByte(this.e.a);
            $$0.writeByte(this.e.b);
            $$0.a(this.e.e);
        } else {
            $$0.writeByte(0);
        }
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    public int a() {
        return this.a;
    }

    @Override
    public void a(dyo $$0) {
        if (this.d != null) {
            $$0.a(this.d);
        }
        if (this.e != null) {
            this.e.a($$0);
        }
    }

    public byte c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }
}

