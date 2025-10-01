/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class bui
extends bud {
    @Nullable
    private eei b;

    public bui(bub $$0) {
        super($$0);
    }

    @Override
    public void c() {
        if (this.b == null) {
            this.b = this.a.dg();
        }
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void d() {
        this.b = null;
    }

    @Override
    public float f() {
        return 1.0f;
    }

    @Override
    @Nullable
    public eei g() {
        return this.b;
    }

    public bur<bui> i() {
        return bur.k;
    }
}

