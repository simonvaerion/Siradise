/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.joml.Vector3f
 */
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ewy
extends evr {
    public static final float b = 62.500004f;
    public static final float c = 0.9765628f;
    private static final Vector3f k = new Vector3f(0.9765628f, 0.9765628f, 0.9765628f);
    @Nullable
    private fmi.a l;

    public ewy(dav $$0, boolean $$1, boolean $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected void b() {
        super.b();
        this.l = fmi.a(this.f.aO(), this.a);
    }

    @Override
    protected void b(eox $$0, dcb $$1) {
        super.b($$0, $$1);
        boolean $$2 = $$1.b() instanceof cxi;
        if (!$$2) {
            $$0.c().a(0.0f, 35.0f, 0.0f);
        }
    }

    @Override
    protected void a(eox $$0, dcb $$1) {
        if (this.l == null) {
            return;
        }
        boolean $$2 = $$1.b() instanceof cxi;
        $$0.c().a(0.0f, 31.0f, 0.0f);
        $$0.c().b(62.500004f, 62.500004f, -62.500004f);
        fwu $$3 = fkj.a(this.a);
        ein $$4 = $$3.a($$0.d(), this.l::a);
        this.l.b.k = $$2;
        this.l.a.a($$0.c(), $$4, 0xF000F0, fum.d);
    }

    @Override
    protected Vector3f l() {
        return k;
    }
}

