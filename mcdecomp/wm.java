/*
 * Decompiled with CFR 0.152.
 */
public class wm
implements uo<ur> {
    private final double a;
    private final double b;
    private final double c;
    private final float d;
    private final float e;

    public wm(bfj $$0) {
        this.a = $$0.dn();
        this.b = $$0.dp();
        this.c = $$0.dt();
        this.d = $$0.dy();
        this.e = $$0.dA();
    }

    public wm(sf $$0) {
        this.a = $$0.readDouble();
        this.b = $$0.readDouble();
        this.c = $$0.readDouble();
        this.d = $$0.readFloat();
        this.e = $$0.readFloat();
    }

    @Override
    public void a(sf $$0) {
        $$0.writeDouble(this.a);
        $$0.writeDouble(this.b);
        $$0.writeDouble(this.c);
        $$0.writeFloat(this.d);
        $$0.writeFloat(this.e);
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    public double a() {
        return this.a;
    }

    public double c() {
        return this.b;
    }

    public double d() {
        return this.c;
    }

    public float e() {
        return this.d;
    }

    public float f() {
        return this.e;
    }
}

