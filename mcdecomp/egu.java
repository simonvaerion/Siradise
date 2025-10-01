/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class egu {
    private final List<ConcurrentLinkedQueue<egt>> a = ImmutableList.of(new ConcurrentLinkedQueue(), new ConcurrentLinkedQueue(), new ConcurrentLinkedQueue(), new ConcurrentLinkedQueue());
    private volatile boolean b;
    private volatile int c = this.e = this.f + 1;
    private volatile boolean d;
    private volatile int e;
    private volatile int f;

    public boolean a() {
        return !this.b && this.c == this.e;
    }

    public boolean b() {
        if (this.b) {
            throw new RuntimeException("ALREADY RECORDING !!!");
        }
        if (this.a()) {
            this.c = (this.e + 1) % this.a.size();
            this.b = true;
            return true;
        }
        return false;
    }

    public void a(egt $$0) {
        if (!this.b) {
            throw new RuntimeException("NOT RECORDING !!!");
        }
        ConcurrentLinkedQueue<egt> $$1 = this.i();
        $$1.add($$0);
    }

    public void c() {
        if (!this.b) {
            throw new RuntimeException("NOT RECORDING !!!");
        }
        this.b = false;
    }

    public boolean d() {
        return !this.d && this.c != this.e;
    }

    public boolean e() {
        if (this.d) {
            throw new RuntimeException("ALREADY PROCESSING !!!");
        }
        if (this.d()) {
            this.d = true;
            return true;
        }
        return false;
    }

    public void f() {
        if (!this.d) {
            throw new RuntimeException("NOT PROCESSING !!!");
        }
    }

    public void g() {
        if (!this.d) {
            throw new RuntimeException("NOT PROCESSING !!!");
        }
        this.d = false;
        this.f = this.e;
        this.e = this.c;
    }

    public ConcurrentLinkedQueue<egt> h() {
        return this.a.get(this.f);
    }

    public ConcurrentLinkedQueue<egt> i() {
        return this.a.get(this.c);
    }

    public ConcurrentLinkedQueue<egt> j() {
        return this.a.get(this.e);
    }
}

