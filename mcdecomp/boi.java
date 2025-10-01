/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class boi
extends bns {
    public static final float i = 0.001f;
    protected final float j;

    public boi(bgi $$0, double $$1) {
        this($$0, $$1, 0.001f);
    }

    public boi(bgi $$0, double $$1, float $$2) {
        super($$0, $$1);
        this.j = $$2;
    }

    @Override
    @Nullable
    protected eei h() {
        if (this.b.aY()) {
            eei $$0 = bqt.a(this.b, 15, 7);
            return $$0 == null ? super.h() : $$0;
        }
        if (this.b.ec().i() >= this.j) {
            return bqt.a(this.b, 10, 7);
        }
        return super.h();
    }
}

