/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 */
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class xc
implements uo<ur> {
    private final IntList a;

    public xc(IntList $$0) {
        this.a = new IntArrayList($$0);
    }

    public xc(int ... $$0) {
        this.a = new IntArrayList($$0);
    }

    public xc(sf $$0) {
        this.a = $$0.a();
    }

    @Override
    public void a(sf $$0) {
        $$0.a(this.a);
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    public IntList a() {
        return this.a;
    }
}

