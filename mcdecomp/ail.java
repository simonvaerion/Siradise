/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 */
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.ArrayList;

public class ail
extends ahu {
    public static final int a = 33;
    private static final int c = 4;
    protected final Long2ByteMap b = new Long2ByteOpenHashMap();
    private final Long2ObjectOpenHashMap<apo<aij<?>>> d = new Long2ObjectOpenHashMap();

    public ail() {
        super(34, 16, 256);
        this.b.defaultReturnValue((byte)33);
    }

    private apo<aij<?>> g(long $$02) {
        return (apo)this.d.computeIfAbsent($$02, $$0 -> apo.a(4));
    }

    private int a(apo<aij<?>> $$0) {
        return $$0.isEmpty() ? 34 : $$0.b().b();
    }

    public void a(long $$0, aij<?> $$1) {
        apo<aij<?>> $$2 = this.g($$0);
        int $$3 = this.a($$2);
        $$2.add($$1);
        if ($$1.b() < $$3) {
            this.b($$0, $$1.b(), true);
        }
    }

    public void b(long $$0, aij<?> $$1) {
        apo<aij<?>> $$2 = this.g($$0);
        $$2.remove($$1);
        if ($$2.isEmpty()) {
            this.d.remove($$0);
        }
        this.b($$0, this.a($$2), false);
    }

    public <T> void a(aik<T> $$0, clt $$1, int $$2, T $$3) {
        this.a($$1.a(), new aij<T>($$0, $$2, $$3));
    }

    public <T> void b(aik<T> $$0, clt $$1, int $$2, T $$3) {
        aij<T> $$4 = new aij<T>($$0, $$2, $$3);
        this.b($$1.a(), $$4);
    }

    public void a(int $$0) {
        ArrayList<Pair> $$1 = new ArrayList<Pair>();
        for (Long2ObjectMap.Entry $$2 : this.d.long2ObjectEntrySet()) {
            for (aij $$3 : (apo)$$2.getValue()) {
                if ($$3.a() != aik.c) continue;
                $$1.add(Pair.of((Object)$$3, (Object)$$2.getLongKey()));
            }
        }
        for (Pair $$4 : $$1) {
            Long $$5 = (Long)$$4.getSecond();
            aij $$6 = (aij)$$4.getFirst();
            this.b($$5, $$6);
            clt $$7 = new clt($$5);
            aik $$8 = $$6.a();
            this.a($$8, $$7, $$0, $$7);
        }
    }

    @Override
    protected int b(long $$0) {
        apo $$1 = (apo)this.d.get($$0);
        if ($$1 == null || $$1.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        return ((aij)$$1.b()).b();
    }

    public int a(clt $$0) {
        return this.c($$0.a());
    }

    @Override
    protected int c(long $$0) {
        return this.b.get($$0);
    }

    @Override
    protected void a(long $$0, int $$1) {
        if ($$1 > 33) {
            this.b.remove($$0);
        } else {
            this.b.put($$0, (byte)$$1);
        }
    }

    public void a() {
        this.b(Integer.MAX_VALUE);
    }

    public String d(long $$0) {
        apo $$1 = (apo)this.d.get($$0);
        if ($$1 == null || $$1.isEmpty()) {
            return "no_ticket";
        }
        return ((aij)$$1.b()).toString();
    }
}

