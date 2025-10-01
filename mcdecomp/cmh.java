/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 */
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class cmh
extends dyj {
    public static final String a = "chunks";
    private static final String b = "Forced";
    private final LongSet c;

    private cmh(LongSet $$0) {
        this.c = $$0;
    }

    public cmh() {
        this((LongSet)new LongOpenHashSet());
    }

    public static cmh b(qr $$0) {
        return new cmh((LongSet)new LongOpenHashSet($$0.o(b)));
    }

    @Override
    public qr a(qr $$0) {
        $$0.a(b, this.c.toLongArray());
        return $$0;
    }

    public LongSet a() {
        return this.c;
    }
}

