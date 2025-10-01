/*
 * Decompiled with CFR 0.152.
 */
public interface egn {
    public int a();

    public int b();

    public void a(int var1, int var2);

    public boolean c();

    public float d();

    default public float e() {
        return this.i();
    }

    default public float f() {
        return this.e() + (float)this.a() / this.d();
    }

    default public float g() {
        return this.j();
    }

    default public float h() {
        return this.g() + (float)this.b() / this.d();
    }

    default public float i() {
        return 0.0f;
    }

    default public float j() {
        return 3.0f;
    }
}

