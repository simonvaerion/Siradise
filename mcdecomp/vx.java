/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class vx
implements uo<ur> {
    public static final a a = new a(0);
    public static final a b = new a(1);
    public static final a c = new a(2);
    public static final a d = new a(3);
    public static final a e = new a(4);
    public static final a f = new a(5);
    public static final a g = new a(6);
    public static final a h = new a(7);
    public static final a i = new a(8);
    public static final a j = new a(9);
    public static final a k = new a(10);
    public static final a l = new a(11);
    public static final int m = 0;
    public static final int n = 101;
    public static final int o = 102;
    public static final int p = 103;
    public static final int q = 104;
    private final a r;
    private final float s;

    public vx(a $$0, float $$1) {
        this.r = $$0;
        this.s = $$1;
    }

    public vx(sf $$0) {
        this.r = (a)vx$a.a.get((int)$$0.readUnsignedByte());
        this.s = $$0.readFloat();
    }

    @Override
    public void a(sf $$0) {
        $$0.writeByte(this.r.b);
        $$0.writeFloat(this.s);
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    public a a() {
        return this.r;
    }

    public float c() {
        return this.s;
    }

    public static class a {
        static final Int2ObjectMap<a> a = new Int2ObjectOpenHashMap();
        final int b;

        public a(int $$0) {
            this.b = $$0;
            a.put($$0, (Object)this);
        }
    }
}

