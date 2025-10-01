/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 */
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dsd
extends dyj {
    private static final String a = "Remaining";
    private static final String b = "All";
    private final LongSet c;
    private final LongSet d;

    private dsd(LongSet $$0, LongSet $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public dsd() {
        this((LongSet)new LongOpenHashSet(), (LongSet)new LongOpenHashSet());
    }

    public static dsd b(qr $$0) {
        return new dsd((LongSet)new LongOpenHashSet($$0.o(b)), (LongSet)new LongOpenHashSet($$0.o(a)));
    }

    @Override
    public qr a(qr $$0) {
        $$0.a(b, this.c.toLongArray());
        $$0.a(a, this.d.toLongArray());
        return $$0;
    }

    public void a(long $$0) {
        this.c.add($$0);
        this.d.add($$0);
    }

    public boolean b(long $$0) {
        return this.c.contains($$0);
    }

    public boolean c(long $$0) {
        return this.d.contains($$0);
    }

    public void d(long $$0) {
        this.d.remove($$0);
    }

    public LongSet a() {
        return this.c;
    }
}

