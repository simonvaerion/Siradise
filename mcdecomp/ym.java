/*
 * Decompiled with CFR 0.152.
 */
public class ym
implements uo<ur> {
    public static final float a = 8.0f;
    private final he<amg> b;
    private final ami c;
    private final int d;
    private final int e;
    private final int f;
    private final float g;
    private final float h;
    private final long i;

    public ym(he<amg> $$0, ami $$1, double $$2, double $$3, double $$4, float $$5, float $$6, long $$7) {
        this.b = $$0;
        this.c = $$1;
        this.d = (int)($$2 * 8.0);
        this.e = (int)($$3 * 8.0);
        this.f = (int)($$4 * 8.0);
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
    }

    public ym(sf $$0) {
        this.b = $$0.a(jb.c.t(), amg::b);
        this.c = $$0.b(ami.class);
        this.d = $$0.readInt();
        this.e = $$0.readInt();
        this.f = $$0.readInt();
        this.g = $$0.readFloat();
        this.h = $$0.readFloat();
        this.i = $$0.readLong();
    }

    @Override
    public void a(sf $$02) {
        $$02.a(jb.c.t(), this.b, ($$0, $$1) -> $$1.a((sf)((Object)$$0)));
        $$02.a(this.c);
        $$02.writeInt(this.d);
        $$02.writeInt(this.e);
        $$02.writeInt(this.f);
        $$02.writeFloat(this.g);
        $$02.writeFloat(this.h);
        $$02.writeLong(this.i);
    }

    public he<amg> a() {
        return this.b;
    }

    public ami c() {
        return this.c;
    }

    public double d() {
        return (float)this.d / 8.0f;
    }

    public double e() {
        return (float)this.e / 8.0f;
    }

    public double f() {
        return (float)this.f / 8.0f;
    }

    public float g() {
        return this.g;
    }

    public float h() {
        return this.h;
    }

    public long i() {
        return this.i;
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }
}

