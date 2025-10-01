/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class abl
implements uo<abk> {
    private static final int a = 0x100000;
    private final int b;
    @Nullable
    private final sf c;

    public abl(int $$0, @Nullable sf $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public abl(sf $$02) {
        this.b = $$02.m();
        this.c = (sf)((Object)$$02.c($$0 -> {
            int $$1 = $$0.readableBytes();
            if ($$1 < 0 || $$1 > 0x100000) {
                throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
            }
            return new sf($$0.readBytes($$1));
        }));
    }

    @Override
    public void a(sf $$02) {
        $$02.d(this.b);
        $$02.a(this.c, ($$0, $$1) -> $$0.writeBytes($$1.slice()));
    }

    @Override
    public void a(abk $$0) {
        $$0.a(this);
    }

    public int a() {
        return this.b;
    }

    @Nullable
    public sf c() {
        return this.c;
    }
}

