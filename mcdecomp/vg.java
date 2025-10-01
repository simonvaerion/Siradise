/*
 * Decompiled with CFR 0.152.
 */
public class vg
implements uo<ur> {
    private final boolean a;

    public vg(boolean $$0) {
        this.a = $$0;
    }

    public vg(sf $$0) {
        this.a = $$0.readBoolean();
    }

    @Override
    public void a(sf $$0) {
        $$0.writeBoolean(this.a);
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    public boolean a() {
        return this.a;
    }
}

