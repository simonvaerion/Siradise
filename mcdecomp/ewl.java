/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 */
import org.joml.Vector3f;

public class ewl
extends evr {
    public static final float b = 4.5f;
    private static final Vector3f c = new Vector3f(1.0f, 1.0f, 1.0f);
    private static final int k = 16;
    private static final int l = 16;
    private final acq m;

    public ewl(dav $$0, boolean $$1, boolean $$2) {
        super($$0, $$1, $$2, sw.c("hanging_sign.edit"));
        this.m = new acq("textures/gui/hanging_signs/" + this.a.b() + ".png");
    }

    @Override
    protected void b(eox $$0, dcb $$1) {
        $$0.c().a((float)this.g / 2.0f, 125.0f, 50.0f);
    }

    @Override
    protected void a(eox $$0, dcb $$1) {
        $$0.c().a(0.0f, -13.0f, 0.0f);
        $$0.c().b(4.5f, 4.5f, 1.0f);
        $$0.a(this.m, -8, -8, 0.0f, 0.0f, 16, 16, 16, 16);
    }

    @Override
    protected Vector3f l() {
        return c;
    }
}

