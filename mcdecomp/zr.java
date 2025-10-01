/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class zr
implements uo<zb> {
    public static final int a = 4;
    private static final int b = 128;
    private static final int c = 8192;
    private static final int d = 200;
    private final int e;
    private final List<String> f;
    private final Optional<String> g;

    public zr(int $$0, List<String> $$1, Optional<String> $$2) {
        this.e = $$0;
        this.f = ImmutableList.copyOf($$1);
        this.g = $$2;
    }

    public zr(sf $$02) {
        this.e = $$02.m();
        this.f = $$02.a(sf.a(Lists::newArrayListWithCapacity, 200), $$0 -> $$0.e(8192));
        this.g = $$02.b($$0 -> $$0.e(128));
    }

    @Override
    public void a(sf $$02) {
        $$02.d(this.e);
        $$02.a(this.f, ($$0, $$1) -> $$0.a((String)$$1, 8192));
        $$02.a(this.g, ($$0, $$1) -> $$0.a((String)$$1, 128));
    }

    @Override
    public void a(zb $$0) {
        $$0.a(this);
    }

    public List<String> a() {
        return this.f;
    }

    public Optional<String> c() {
        return this.g;
    }

    public int d() {
        return this.e;
    }
}

