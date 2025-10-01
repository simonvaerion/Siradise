/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class kb
implements kd {
    protected static final bo.a a = bo.a.a().a(bm.a.a().a(true).b());
    private static final Set<bfn<?>> b = ImmutableSet.of(bfn.bt, bfn.d, bfn.ac, bfn.aO, bfn.bf);
    private final caw c;
    private final caw d;
    private final Map<bfn<?>, Map<acq, dzs.a>> e = Maps.newHashMap();

    protected kb(caw $$0) {
        this($$0, $$0);
    }

    protected kb(caw $$0, caw $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    protected static dzs.a a(cml $$0) {
        return dzs.b().a(dzr.a().a(edd.a(1.0f)).a(eac.a($$0))).a(dzr.a().a(edd.a(1.0f)).a(eai.a(bfn.aF.j())));
    }

    public abstract void a();

    @Override
    public void generate(BiConsumer<acq, dzs.a> $$0) {
        this.a();
        HashSet $$1 = Sets.newHashSet();
        jb.h.h().forEach($$2 -> {
            bfn $$32 = (bfn)$$2.a();
            if (!$$32.a(this.c)) {
                return;
            }
            if (kb.a($$32)) {
                Map<acq, dzs.a> $$42 = this.e.remove($$32);
                acq $$5 = $$32.j();
                if (!($$5.equals(dzg.a) || !$$32.a(this.d) || $$42 != null && $$42.containsKey($$5))) {
                    throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$5, $$2.g().a()));
                }
                if ($$42 != null) {
                    $$42.forEach(($$3, $$4) -> {
                        if (!$$1.add($$3)) {
                            throw new IllegalStateException(String.format(Locale.ROOT, "Duplicate loottable '%s' for '%s'", $$3, $$2.g().a()));
                        }
                        $$0.accept((acq)$$3, (dzs.a)$$4);
                    });
                }
            } else {
                Map<acq, dzs.a> $$6 = this.e.remove($$32);
                if ($$6 != null) {
                    throw new IllegalStateException(String.format(Locale.ROOT, "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot", $$6.keySet().stream().map(acq::toString).collect(Collectors.joining(",")), $$2.g().a()));
                }
            }
        });
        if (!this.e.isEmpty()) {
            throw new IllegalStateException("Created loot tables for entities not supported by datapack: " + this.e.keySet());
        }
    }

    private static boolean a(bfn<?> $$0) {
        return b.contains($$0) || $$0.f() != bgc.h;
    }

    protected eck.a b() {
        return ece.a(bd.a.a().b(bo.a.a().a(bfn.O)));
    }

    protected eck.a a(brw $$0) {
        return ece.a(bd.a.a().b(bo.a.a().a(bfn.O).a(bp.a($$0))));
    }

    protected void a(bfn<?> $$0, dzs.a $$1) {
        this.a($$0, $$0.j(), $$1);
    }

    protected void a(bfn<?> $$02, acq $$1, dzs.a $$2) {
        this.e.computeIfAbsent($$02, $$0 -> new HashMap()).put($$1, $$2);
    }
}

