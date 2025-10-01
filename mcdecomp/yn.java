/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class yn
implements uo<ur> {
    private static final int a = 1;
    private static final int b = 2;
    @Nullable
    private final acq c;
    @Nullable
    private final ami d;

    public yn(@Nullable acq $$0, @Nullable ami $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public yn(sf $$0) {
        byte $$1 = $$0.readByte();
        this.d = ($$1 & 1) > 0 ? $$0.b(ami.class) : null;
        this.c = ($$1 & 2) > 0 ? $$0.t() : null;
    }

    @Override
    public void a(sf $$0) {
        if (this.d != null) {
            if (this.c != null) {
                $$0.writeByte(3);
                $$0.a(this.d);
                $$0.a(this.c);
            } else {
                $$0.writeByte(1);
                $$0.a(this.d);
            }
        } else if (this.c != null) {
            $$0.writeByte(2);
            $$0.a(this.c);
        } else {
            $$0.writeByte(0);
        }
    }

    @Nullable
    public acq a() {
        return this.c;
    }

    @Nullable
    public ami c() {
        return this.d;
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }
}

