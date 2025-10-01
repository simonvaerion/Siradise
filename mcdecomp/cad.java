/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap;
import java.util.Collection;
import java.util.List;

public class cad {
    private final List<caa> a = Lists.newArrayList();
    private int b;

    public ImmutableList<caa> a() {
        return ImmutableList.copyOf(this.a);
    }

    public cad a(int $$0, float $$1) {
        this.a.add(new caa($$0, $$1));
        this.b();
        return this;
    }

    public cad a(Collection<caa> $$0) {
        this.a.addAll($$0);
        this.b();
        return this;
    }

    private void b() {
        Int2ObjectAVLTreeMap $$0 = new Int2ObjectAVLTreeMap();
        this.a.forEach(arg_0 -> cad.a((Int2ObjectSortedMap)$$0, arg_0));
        this.a.clear();
        this.a.addAll((Collection<caa>)$$0.values());
        this.b = 0;
    }

    public float a(int $$0) {
        caa $$7;
        if (this.a.size() <= 0) {
            return 0.0f;
        }
        caa $$1 = this.a.get(this.b);
        caa $$2 = this.a.get(this.a.size() - 1);
        boolean $$3 = $$0 < $$1.a();
        int $$4 = $$3 ? 0 : this.b;
        float $$5 = $$3 ? $$2.b() : $$1.b();
        int $$6 = $$4;
        while ($$6 < this.a.size() && ($$7 = this.a.get($$6)).a() <= $$0) {
            this.b = $$6++;
            $$5 = $$7.b();
        }
        return $$5;
    }

    private static /* synthetic */ void a(Int2ObjectSortedMap $$0, caa $$1) {
        $$0.put($$1.a(), (Object)$$1);
    }
}

