/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.lwjgl.openal.AL10
 */
import org.joml.Vector3f;
import org.lwjgl.openal.AL10;

public class egg {
    private float a = 1.0f;
    private eei b = eei.b;

    public void a(eei $$0) {
        this.b = $$0;
        AL10.alListener3f((int)4100, (float)((float)$$0.c), (float)((float)$$0.d), (float)((float)$$0.e));
    }

    public eei a() {
        return this.b;
    }

    public void a(Vector3f $$0, Vector3f $$1) {
        AL10.alListenerfv((int)4111, (float[])new float[]{$$0.x(), $$0.y(), $$0.z(), $$1.x(), $$1.y(), $$1.z()});
    }

    public void a(float $$0) {
        AL10.alListenerf((int)4106, (float)$$0);
        this.a = $$0;
    }

    public float b() {
        return this.a;
    }

    public void c() {
        this.a(eei.b);
        this.a(new Vector3f(0.0f, 0.0f, -1.0f), new Vector3f(0.0f, 1.0f, 0.0f));
    }
}

