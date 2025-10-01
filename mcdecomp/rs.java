/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class rs
implements rh {
    private String a = "";
    @Nullable
    private rk b;
    private final Deque<Consumer<rk>> c = new ArrayDeque<Consumer<rk>>();

    @Nullable
    public rk d() {
        return this.b;
    }

    protected int e() {
        return this.c.size();
    }

    private void a(rk $$0) {
        this.c.getLast().accept($$0);
    }

    @Override
    public rh.b a() {
        this.a(qt.b);
        return rh.b.a;
    }

    @Override
    public rh.b a(String $$0) {
        this.a(ri.a($$0));
        return rh.b.a;
    }

    @Override
    public rh.b a(byte $$0) {
        this.a(qp.a($$0));
        return rh.b.a;
    }

    @Override
    public rh.b a(short $$0) {
        this.a(rf.a($$0));
        return rh.b.a;
    }

    @Override
    public rh.b a(int $$0) {
        this.a(qw.a($$0));
        return rh.b.a;
    }

    @Override
    public rh.b a(long $$0) {
        this.a(qz.a($$0));
        return rh.b.a;
    }

    @Override
    public rh.b a(float $$0) {
        this.a(qu.a($$0));
        return rh.b.a;
    }

    @Override
    public rh.b a(double $$0) {
        this.a(qs.a($$0));
        return rh.b.a;
    }

    @Override
    public rh.b a(byte[] $$0) {
        this.a(new qo($$0));
        return rh.b.a;
    }

    @Override
    public rh.b a(int[] $$0) {
        this.a(new qv($$0));
        return rh.b.a;
    }

    @Override
    public rh.b a(long[] $$0) {
        this.a(new qy($$0));
        return rh.b.a;
    }

    @Override
    public rh.b a(rm<?> $$0, int $$1) {
        return rh.b.a;
    }

    @Override
    public rh.a b(rm<?> $$0, int $$1) {
        this.c($$0);
        return rh.a.a;
    }

    @Override
    public rh.a a(rm<?> $$0) {
        return rh.a.a;
    }

    @Override
    public rh.a a(rm<?> $$0, String $$1) {
        this.a = $$1;
        this.c($$0);
        return rh.a.a;
    }

    private void c(rm<?> $$0) {
        if ($$0 == qx.a) {
            qx $$12 = new qx();
            this.a($$12);
            this.c.addLast($$12::add);
        } else if ($$0 == qr.b) {
            qr $$2 = new qr();
            this.a($$2);
            this.c.addLast($$1 -> $$2.a(this.a, (rk)$$1));
        }
    }

    @Override
    public rh.b b() {
        this.c.removeLast();
        return rh.b.a;
    }

    @Override
    public rh.b b(rm<?> $$02) {
        if ($$02 == qx.a) {
            qx $$12 = new qx();
            this.b = $$12;
            this.c.addLast($$12::add);
        } else if ($$02 == qr.b) {
            qr $$2 = new qr();
            this.b = $$2;
            this.c.addLast($$1 -> $$2.a(this.a, (rk)$$1));
        } else {
            this.c.addLast($$0 -> {
                this.b = $$0;
            });
        }
        return rh.b.a;
    }
}

