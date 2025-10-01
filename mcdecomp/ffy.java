/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Streams
 *  com.mojang.blocklist.BlockListSupplier
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.mojang.blocklist.BlockListSupplier;
import java.util.Objects;
import java.util.ServiceLoader;

public interface ffy {
    public boolean a(ffz var1);

    public boolean a(fga var1);

    public static ffy a() {
        final ImmutableList $$0 = (ImmutableList)Streams.stream(ServiceLoader.load(BlockListSupplier.class)).map(BlockListSupplier::createBlockList).filter(Objects::nonNull).collect(ImmutableList.toImmutableList());
        return new ffy(){

            @Override
            public boolean a(ffz $$02) {
                String $$1 = $$02.a();
                String $$22 = $$02.b();
                return $$0.stream().noneMatch($$2 -> $$2.test($$1) || $$2.test($$22));
            }

            @Override
            public boolean a(fga $$02) {
                String $$12 = $$02.a();
                return $$0.stream().noneMatch($$1 -> $$1.test($$12));
            }
        };
    }
}

