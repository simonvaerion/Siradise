/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class fen {
    private final List<feh> a;
    private final feg b;
    private final Map<String, fen> c = Maps.newHashMap();

    fen(List<feh> $$0, feg $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public fen a(String $$0, fej $$1, feg $$2) {
        fen $$3 = new fen($$1.b(), $$2);
        fen $$4 = this.c.put($$0, $$3);
        if ($$4 != null) {
            $$3.c.putAll($$4.c);
        }
        return $$3;
    }

    public fee a(int $$02, int $$12) {
        Object2ObjectArrayMap $$22 = this.c.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, $$2 -> ((fen)$$2.getValue()).a($$02, $$12), ($$0, $$1) -> $$0, Object2ObjectArrayMap::new));
        List $$3 = (List)this.a.stream().map($$2 -> $$2.a($$02, $$12)).collect(ImmutableList.toImmutableList());
        fee $$4 = new fee($$3, (Map<String, fee>)$$22);
        $$4.a(this.b);
        $$4.b(this.b);
        return $$4;
    }

    public fen a(String $$0) {
        return this.c.get($$0);
    }
}

