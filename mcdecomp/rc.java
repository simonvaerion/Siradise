/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 *  com.mojang.serialization.RecordBuilder$AbstractStringBuilder
 *  it.unimi.dsi.fastutil.bytes.ByteArrayList
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class rc
implements DynamicOps<rk> {
    public static final rc a = new rc();
    private static final String b = "";

    protected rc() {
    }

    public rk a() {
        return qt.b;
    }

    public <U> U a(DynamicOps<U> $$0, rk $$1) {
        switch ($$1.b()) {
            case 0: {
                return (U)$$0.empty();
            }
            case 1: {
                return (U)$$0.createByte(((re)$$1).i());
            }
            case 2: {
                return (U)$$0.createShort(((re)$$1).h());
            }
            case 3: {
                return (U)$$0.createInt(((re)$$1).g());
            }
            case 4: {
                return (U)$$0.createLong(((re)$$1).f());
            }
            case 5: {
                return (U)$$0.createFloat(((re)$$1).k());
            }
            case 6: {
                return (U)$$0.createDouble(((re)$$1).j());
            }
            case 7: {
                return (U)$$0.createByteList(ByteBuffer.wrap(((qo)$$1).e()));
            }
            case 8: {
                return (U)$$0.createString($$1.m_());
            }
            case 9: {
                return (U)this.convertList($$0, $$1);
            }
            case 10: {
                return (U)this.convertMap($$0, $$1);
            }
            case 11: {
                return (U)$$0.createIntList(Arrays.stream(((qv)$$1).g()));
            }
            case 12: {
                return (U)$$0.createLongList(Arrays.stream(((qy)$$1).g()));
            }
        }
        throw new IllegalStateException("Unknown tag type: " + $$1);
    }

    public DataResult<Number> a(rk $$0) {
        if ($$0 instanceof re) {
            re $$1 = (re)$$0;
            return DataResult.success((Object)$$1.l());
        }
        return DataResult.error(() -> "Not a number");
    }

    public rk a(Number $$0) {
        return qs.a($$0.doubleValue());
    }

    public rk a(byte $$0) {
        return qp.a($$0);
    }

    public rk a(short $$0) {
        return rf.a($$0);
    }

    public rk a(int $$0) {
        return qw.a($$0);
    }

    public rk a(long $$0) {
        return qz.a($$0);
    }

    public rk a(float $$0) {
        return qu.a($$0);
    }

    public rk a(double $$0) {
        return qs.a($$0);
    }

    public rk a(boolean $$0) {
        return qp.a($$0);
    }

    public DataResult<String> b(rk $$0) {
        if ($$0 instanceof ri) {
            ri $$1 = (ri)$$0;
            return DataResult.success((Object)$$1.m_());
        }
        return DataResult.error(() -> "Not a string");
    }

    public rk a(String $$0) {
        return ri.a($$0);
    }

    public DataResult<rk> a(rk $$0, rk $$12) {
        return rc.k($$0).map($$1 -> DataResult.success((Object)$$1.a($$12).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, (Object)$$0));
    }

    public DataResult<rk> a(rk $$0, List<rk> $$12) {
        return rc.k($$0).map($$1 -> DataResult.success((Object)$$1.a($$12).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, (Object)$$0));
    }

    public DataResult<rk> a(rk $$0, rk $$1, rk $$22) {
        if (!($$0 instanceof qr) && !($$0 instanceof qt)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, (Object)$$0);
        }
        if (!($$1 instanceof ri)) {
            return DataResult.error(() -> "key is not a string: " + $$1, (Object)$$0);
        }
        qr $$3 = new qr();
        if ($$0 instanceof qr) {
            qr $$4 = (qr)$$0;
            $$4.e().forEach($$2 -> $$3.a((String)$$2, $$4.c((String)$$2)));
        }
        $$3.a($$1.m_(), $$22);
        return DataResult.success((Object)$$3);
    }

    public DataResult<rk> a(rk $$0, MapLike<rk> $$1) {
        if (!($$0 instanceof qr) && !($$0 instanceof qt)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, (Object)$$0);
        }
        qr $$22 = new qr();
        if ($$0 instanceof qr) {
            qr $$3 = (qr)$$0;
            $$3.e().forEach($$2 -> $$22.a((String)$$2, $$3.c((String)$$2)));
        }
        ArrayList $$4 = Lists.newArrayList();
        $$1.entries().forEach($$2 -> {
            rk $$3 = (rk)$$2.getFirst();
            if (!($$3 instanceof ri)) {
                $$4.add($$3);
                return;
            }
            $$22.a($$3.m_(), (rk)$$2.getSecond());
        });
        if (!$$4.isEmpty()) {
            return DataResult.error(() -> "some keys are not strings: " + $$4, (Object)$$22);
        }
        return DataResult.success((Object)$$22);
    }

    public DataResult<Stream<Pair<rk, rk>>> c(rk $$0) {
        if ($$0 instanceof qr) {
            qr $$12 = (qr)$$0;
            return DataResult.success($$12.e().stream().map($$1 -> Pair.of((Object)this.a((String)$$1), (Object)$$12.c((String)$$1))));
        }
        return DataResult.error(() -> "Not a map: " + $$0);
    }

    public DataResult<Consumer<BiConsumer<rk, rk>>> d(rk $$0) {
        if ($$0 instanceof qr) {
            qr $$12 = (qr)$$0;
            return DataResult.success($$1 -> $$12.e().forEach($$2 -> $$1.accept(this.a((String)$$2), $$12.c((String)$$2))));
        }
        return DataResult.error(() -> "Not a map: " + $$0);
    }

    public DataResult<MapLike<rk>> e(rk $$0) {
        if ($$0 instanceof qr) {
            final qr $$1 = (qr)$$0;
            return DataResult.success((Object)new MapLike<rk>(){

                @Nullable
                public rk a(rk $$0) {
                    return $$1.c($$0.m_());
                }

                @Nullable
                public rk a(String $$0) {
                    return $$1.c($$0);
                }

                public Stream<Pair<rk, rk>> entries() {
                    return $$1.e().stream().map($$1 -> Pair.of((Object)rc.this.a((String)$$1), (Object)$$1.c((String)$$1)));
                }

                public String toString() {
                    return "MapLike[" + $$1 + "]";
                }

                @Nullable
                public /* synthetic */ Object get(String string) {
                    return this.a(string);
                }

                @Nullable
                public /* synthetic */ Object get(Object object) {
                    return this.a((rk)object);
                }
            });
        }
        return DataResult.error(() -> "Not a map: " + $$0);
    }

    public rk a(Stream<Pair<rk, rk>> $$0) {
        qr $$12 = new qr();
        $$0.forEach($$1 -> $$12.a(((rk)$$1.getFirst()).m_(), (rk)$$1.getSecond()));
        return $$12;
    }

    private static rk a(qr $$0) {
        rk $$1;
        if ($$0.f() == 1 && ($$1 = $$0.c(b)) != null) {
            return $$1;
        }
        return $$0;
    }

    public DataResult<Stream<rk>> f(rk $$02) {
        if ($$02 instanceof qx) {
            qx $$1 = (qx)$$02;
            if ($$1.f() == 10) {
                return DataResult.success($$1.stream().map($$0 -> rc.a((qr)$$0)));
            }
            return DataResult.success($$1.stream());
        }
        if ($$02 instanceof qq) {
            qq $$2 = (qq)$$02;
            return DataResult.success($$2.stream().map($$0 -> $$0));
        }
        return DataResult.error(() -> "Not a list");
    }

    public DataResult<Consumer<Consumer<rk>>> g(rk $$0) {
        if ($$0 instanceof qx) {
            qx $$1 = (qx)$$0;
            if ($$1.f() == 10) {
                return DataResult.success($$12 -> $$1.forEach($$1 -> $$12.accept(rc.a((qr)$$1))));
            }
            return DataResult.success($$1::forEach);
        }
        if ($$0 instanceof qq) {
            qq $$2 = (qq)$$0;
            return DataResult.success($$2::forEach);
        }
        return DataResult.error(() -> "Not a list: " + $$0);
    }

    public DataResult<ByteBuffer> h(rk $$0) {
        if ($$0 instanceof qo) {
            qo $$1 = (qo)$$0;
            return DataResult.success((Object)ByteBuffer.wrap($$1.e()));
        }
        return super.getByteBuffer((Object)$$0);
    }

    public rk a(ByteBuffer $$0) {
        return new qo(DataFixUtils.toArray((ByteBuffer)$$0));
    }

    public DataResult<IntStream> i(rk $$0) {
        if ($$0 instanceof qv) {
            qv $$1 = (qv)$$0;
            return DataResult.success((Object)Arrays.stream($$1.g()));
        }
        return super.getIntStream((Object)$$0);
    }

    public rk a(IntStream $$0) {
        return new qv($$0.toArray());
    }

    public DataResult<LongStream> j(rk $$0) {
        if ($$0 instanceof qy) {
            qy $$1 = (qy)$$0;
            return DataResult.success((Object)Arrays.stream($$1.g()));
        }
        return super.getLongStream((Object)$$0);
    }

    public rk a(LongStream $$0) {
        return new qy($$0.toArray());
    }

    public rk b(Stream<rk> $$0) {
        return d.a.a($$0).a();
    }

    public rk a(rk $$0, String $$12) {
        if ($$0 instanceof qr) {
            qr $$22 = (qr)$$0;
            qr $$3 = new qr();
            $$22.e().stream().filter($$1 -> !Objects.equals($$1, $$12)).forEach($$2 -> $$3.a((String)$$2, $$22.c((String)$$2)));
            return $$3;
        }
        return $$0;
    }

    public String toString() {
        return "NBT";
    }

    public RecordBuilder<rk> mapBuilder() {
        return new h();
    }

    private static Optional<f> k(rk $$0) {
        if ($$0 instanceof qt) {
            return Optional.of(d.a);
        }
        if ($$0 instanceof qq) {
            qq $$1 = (qq)$$0;
            if ($$1.isEmpty()) {
                return Optional.of(d.a);
            }
            if ($$1 instanceof qx) {
                qx $$2 = (qx)$$1;
                return switch ($$2.f()) {
                    case 0 -> Optional.of(d.a);
                    case 10 -> Optional.of(new b($$2));
                    default -> Optional.of(new c($$2));
                };
            }
            if ($$1 instanceof qo) {
                qo $$3 = (qo)$$1;
                return Optional.of(new a($$3.e()));
            }
            if ($$1 instanceof qv) {
                qv $$4 = (qv)$$1;
                return Optional.of(new e($$4.g()));
            }
            if ($$1 instanceof qy) {
                qy $$5 = (qy)$$1;
                return Optional.of(new g($$5.g()));
            }
        }
        return Optional.empty();
    }

    public /* synthetic */ Object remove(Object object, String string) {
        return this.a((rk)object, string);
    }

    public /* synthetic */ Object createLongList(LongStream longStream) {
        return this.a(longStream);
    }

    public /* synthetic */ DataResult getLongStream(Object object) {
        return this.j((rk)object);
    }

    public /* synthetic */ Object createIntList(IntStream intStream) {
        return this.a(intStream);
    }

    public /* synthetic */ DataResult getIntStream(Object object) {
        return this.i((rk)object);
    }

    public /* synthetic */ Object createByteList(ByteBuffer byteBuffer) {
        return this.a(byteBuffer);
    }

    public /* synthetic */ DataResult getByteBuffer(Object object) {
        return this.h((rk)object);
    }

    public /* synthetic */ Object createList(Stream stream) {
        return this.b(stream);
    }

    public /* synthetic */ DataResult getList(Object object) {
        return this.g((rk)object);
    }

    public /* synthetic */ DataResult getStream(Object object) {
        return this.f((rk)object);
    }

    public /* synthetic */ DataResult getMap(Object object) {
        return this.e((rk)object);
    }

    public /* synthetic */ Object createMap(Stream stream) {
        return this.a(stream);
    }

    public /* synthetic */ DataResult getMapEntries(Object object) {
        return this.d((rk)object);
    }

    public /* synthetic */ DataResult getMapValues(Object object) {
        return this.c((rk)object);
    }

    public /* synthetic */ DataResult mergeToMap(Object object, MapLike mapLike) {
        return this.a((rk)object, (MapLike<rk>)mapLike);
    }

    public /* synthetic */ DataResult mergeToMap(Object object, Object object2, Object object3) {
        return this.a((rk)object, (rk)object2, (rk)object3);
    }

    public /* synthetic */ DataResult mergeToList(Object object, List list) {
        return this.a((rk)object, list);
    }

    public /* synthetic */ DataResult mergeToList(Object object, Object object2) {
        return this.a((rk)object, (rk)object2);
    }

    public /* synthetic */ Object createString(String string) {
        return this.a(string);
    }

    public /* synthetic */ DataResult getStringValue(Object object) {
        return this.b((rk)object);
    }

    public /* synthetic */ Object createBoolean(boolean bl2) {
        return this.a(bl2);
    }

    public /* synthetic */ Object createDouble(double d2) {
        return this.a(d2);
    }

    public /* synthetic */ Object createFloat(float f2) {
        return this.a(f2);
    }

    public /* synthetic */ Object createLong(long l2) {
        return this.a(l2);
    }

    public /* synthetic */ Object createInt(int n2) {
        return this.a(n2);
    }

    public /* synthetic */ Object createShort(short s2) {
        return this.a(s2);
    }

    public /* synthetic */ Object createByte(byte by2) {
        return this.a(by2);
    }

    public /* synthetic */ Object createNumeric(Number number) {
        return this.a(number);
    }

    public /* synthetic */ DataResult getNumberValue(Object object) {
        return this.a((rk)object);
    }

    public /* synthetic */ Object convertTo(DynamicOps dynamicOps, Object object) {
        return this.a(dynamicOps, (rk)object);
    }

    public /* synthetic */ Object empty() {
        return this.a();
    }

    static class d
    implements f {
        public static final d a = new d();

        private d() {
        }

        @Override
        public f a(rk $$0) {
            if ($$0 instanceof qr) {
                qr $$1 = (qr)$$0;
                return new b().a($$1);
            }
            if ($$0 instanceof qp) {
                qp $$2 = (qp)$$0;
                return new a($$2.i());
            }
            if ($$0 instanceof qw) {
                qw $$3 = (qw)$$0;
                return new e($$3.g());
            }
            if ($$0 instanceof qz) {
                qz $$4 = (qz)$$0;
                return new g($$4.f());
            }
            return new c($$0);
        }

        @Override
        public rk a() {
            return new qx();
        }
    }

    static interface f {
        public f a(rk var1);

        default public f a(Iterable<rk> $$0) {
            f $$1 = this;
            for (rk $$2 : $$0) {
                $$1 = $$1.a($$2);
            }
            return $$1;
        }

        default public f a(Stream<rk> $$0) {
            return this.a($$0::iterator);
        }

        public rk a();
    }

    class h
    extends RecordBuilder.AbstractStringBuilder<rk, qr> {
        protected h() {
            super((DynamicOps)rc.this);
        }

        protected qr a() {
            return new qr();
        }

        protected qr a(String $$0, rk $$1, qr $$2) {
            $$2.a($$0, $$1);
            return $$2;
        }

        protected DataResult<rk> a(qr $$0, rk $$1) {
            if ($$1 == null || $$1 == qt.b) {
                return DataResult.success((Object)$$0);
            }
            if ($$1 instanceof qr) {
                qr $$2 = (qr)$$1;
                qr $$3 = new qr(Maps.newHashMap($$2.i()));
                for (Map.Entry<String, rk> $$4 : $$0.i().entrySet()) {
                    $$3.a($$4.getKey(), $$4.getValue());
                }
                return DataResult.success((Object)$$3);
            }
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, (Object)$$1);
        }

        protected /* synthetic */ Object append(String string, Object object, Object object2) {
            return this.a(string, (rk)object, (qr)object2);
        }

        protected /* synthetic */ DataResult build(Object object, Object object2) {
            return this.a((qr)object, (rk)object2);
        }

        protected /* synthetic */ Object initBuilder() {
            return this.a();
        }
    }

    static class b
    implements f {
        private final qx a = new qx();

        public b() {
        }

        public b(Collection<rk> $$0) {
            this.a.addAll($$0);
        }

        public b(IntArrayList $$02) {
            $$02.forEach($$0 -> this.a.add(rc$b.c(qw.a($$0))));
        }

        public b(ByteArrayList $$02) {
            $$02.forEach($$0 -> this.a.add(rc$b.c(qp.a($$0))));
        }

        public b(LongArrayList $$02) {
            $$02.forEach($$0 -> this.a.add(rc$b.c(qz.a($$0))));
        }

        private static boolean a(qr $$0) {
            return $$0.f() == 1 && $$0.e(rc.b);
        }

        private static rk b(rk $$0) {
            qr $$1;
            if ($$0 instanceof qr && !rc$b.a($$1 = (qr)$$0)) {
                return $$1;
            }
            return rc$b.c($$0);
        }

        private static qr c(rk $$0) {
            qr $$1 = new qr();
            $$1.a(rc.b, $$0);
            return $$1;
        }

        @Override
        public f a(rk $$0) {
            this.a.add(rc$b.b($$0));
            return this;
        }

        @Override
        public rk a() {
            return this.a;
        }
    }

    static class c
    implements f {
        private final qx a = new qx();

        c(rk $$0) {
            this.a.add($$0);
        }

        c(qx $$0) {
            this.a.addAll($$0);
        }

        @Override
        public f a(rk $$0) {
            if ($$0.b() != this.a.f()) {
                return new b().a(this.a).a($$0);
            }
            this.a.add($$0);
            return this;
        }

        @Override
        public rk a() {
            return this.a;
        }
    }

    static class a
    implements f {
        private final ByteArrayList a = new ByteArrayList();

        public a(byte $$0) {
            this.a.add($$0);
        }

        public a(byte[] $$0) {
            this.a.addElements(0, $$0);
        }

        @Override
        public f a(rk $$0) {
            if ($$0 instanceof qp) {
                qp $$1 = (qp)$$0;
                this.a.add($$1.i());
                return this;
            }
            return new b(this.a).a($$0);
        }

        @Override
        public rk a() {
            return new qo(this.a.toByteArray());
        }
    }

    static class e
    implements f {
        private final IntArrayList a = new IntArrayList();

        public e(int $$0) {
            this.a.add($$0);
        }

        public e(int[] $$0) {
            this.a.addElements(0, $$0);
        }

        @Override
        public f a(rk $$0) {
            if ($$0 instanceof qw) {
                qw $$1 = (qw)$$0;
                this.a.add($$1.g());
                return this;
            }
            return new b(this.a).a($$0);
        }

        @Override
        public rk a() {
            return new qv(this.a.toIntArray());
        }
    }

    static class g
    implements f {
        private final LongArrayList a = new LongArrayList();

        public g(long $$0) {
            this.a.add($$0);
        }

        public g(long[] $$0) {
            this.a.addElements(0, $$0);
        }

        @Override
        public f a(rk $$0) {
            if ($$0 instanceof qz) {
                qz $$1 = (qz)$$0;
                this.a.add($$1.f());
                return this;
            }
            return new b(this.a).a($$0);
        }

        @Override
        public rk a() {
            return new qy(this.a.toLongArray());
        }
    }
}

