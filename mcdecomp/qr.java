/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class qr
implements rk {
    public static final Codec<qr> a = Codec.PASSTHROUGH.comapFlatMap($$0 -> {
        rk $$1 = (rk)$$0.convert((DynamicOps)rc.a).getValue();
        if ($$1 instanceof qr) {
            return DataResult.success((Object)((qr)$$1));
        }
        return DataResult.error(() -> "Not a compound tag: " + $$1);
    }, $$0 -> new Dynamic((DynamicOps)rc.a, $$0));
    private static final int c = 48;
    private static final int w = 32;
    public static final rm<qr> b = new rm.b<qr>(){

        public qr a(DataInput $$0, int $$1, ra $$2) throws IOException {
            byte $$4;
            $$2.a(48L);
            if ($$1 > 512) {
                throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
            }
            HashMap $$3 = Maps.newHashMap();
            while (($$4 = qr.a($$0, $$2)) != 0) {
                String $$5 = qr.b($$0, $$2);
                $$2.a(28 + 2 * $$5.length());
                rk $$6 = qr.a(rn.a($$4), $$5, $$0, $$1 + 1, $$2);
                if ($$3.put($$5, $$6) != null) continue;
                $$2.a(36L);
            }
            return new qr($$3);
        }

        @Override
        public rh.b a(DataInput $$0, rh $$1) throws IOException {
            byte $$2;
            block13: while (($$2 = $$0.readByte()) != 0) {
                rm<?> $$3 = rn.a($$2);
                switch ($$1.a($$3)) {
                    case d: {
                        return rh.b.c;
                    }
                    case c: {
                        ri.a($$0);
                        $$3.a($$0);
                        break block13;
                    }
                    case b: {
                        ri.a($$0);
                        $$3.a($$0);
                        continue block13;
                    }
                    default: {
                        String $$4 = $$0.readUTF();
                        switch ($$1.a($$3, $$4)) {
                            case d: {
                                return rh.b.c;
                            }
                            case c: {
                                $$3.a($$0);
                                break block13;
                            }
                            case b: {
                                $$3.a($$0);
                                continue block13;
                            }
                        }
                        switch ($$3.a($$0, $$1)) {
                            case c: {
                                return rh.b.c;
                            }
                        }
                        continue block13;
                    }
                }
            }
            if ($$2 != 0) {
                while (($$2 = $$0.readByte()) != 0) {
                    ri.a($$0);
                    rn.a($$2).a($$0);
                }
            }
            return $$1.b();
        }

        @Override
        public void a(DataInput $$0) throws IOException {
            byte $$1;
            while (($$1 = $$0.readByte()) != 0) {
                ri.a($$0);
                rn.a($$1).a($$0);
            }
        }

        @Override
        public String a() {
            return "COMPOUND";
        }

        @Override
        public String b() {
            return "TAG_Compound";
        }

        @Override
        public /* synthetic */ rk b(DataInput dataInput, int n2, ra ra2) throws IOException {
            return this.a(dataInput, n2, ra2);
        }
    };
    private final Map<String, rk> x;

    protected qr(Map<String, rk> $$0) {
        this.x = $$0;
    }

    public qr() {
        this(Maps.newHashMap());
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
        for (String $$1 : this.x.keySet()) {
            rk $$2 = this.x.get($$1);
            qr.a($$1, $$2, $$0);
        }
        $$0.writeByte(0);
    }

    @Override
    public int a() {
        int $$0 = 48;
        for (Map.Entry<String, rk> $$1 : this.x.entrySet()) {
            $$0 += 28 + 2 * $$1.getKey().length();
            $$0 += 36;
            $$0 += $$1.getValue().a();
        }
        return $$0;
    }

    public Set<String> e() {
        return this.x.keySet();
    }

    @Override
    public byte b() {
        return 10;
    }

    public rm<qr> c() {
        return b;
    }

    public int f() {
        return this.x.size();
    }

    @Nullable
    public rk a(String $$0, rk $$1) {
        return this.x.put($$0, $$1);
    }

    public void a(String $$0, byte $$1) {
        this.x.put($$0, qp.a($$1));
    }

    public void a(String $$0, short $$1) {
        this.x.put($$0, rf.a($$1));
    }

    public void a(String $$0, int $$1) {
        this.x.put($$0, qw.a($$1));
    }

    public void a(String $$0, long $$1) {
        this.x.put($$0, qz.a($$1));
    }

    public void a(String $$0, UUID $$1) {
        this.x.put($$0, rd.a($$1));
    }

    public UUID a(String $$0) {
        return rd.a(this.c($$0));
    }

    public boolean b(String $$0) {
        rk $$1 = this.c($$0);
        return $$1 != null && $$1.c() == qv.a && ((qv)$$1).g().length == 4;
    }

    public void a(String $$0, float $$1) {
        this.x.put($$0, qu.a($$1));
    }

    public void a(String $$0, double $$1) {
        this.x.put($$0, qs.a($$1));
    }

    public void a(String $$0, String $$1) {
        this.x.put($$0, ri.a($$1));
    }

    public void a(String $$0, byte[] $$1) {
        this.x.put($$0, new qo($$1));
    }

    public void a(String $$0, List<Byte> $$1) {
        this.x.put($$0, new qo($$1));
    }

    public void a(String $$0, int[] $$1) {
        this.x.put($$0, new qv($$1));
    }

    public void b(String $$0, List<Integer> $$1) {
        this.x.put($$0, new qv($$1));
    }

    public void a(String $$0, long[] $$1) {
        this.x.put($$0, new qy($$1));
    }

    public void c(String $$0, List<Long> $$1) {
        this.x.put($$0, new qy($$1));
    }

    public void a(String $$0, boolean $$1) {
        this.x.put($$0, qp.a($$1));
    }

    @Nullable
    public rk c(String $$0) {
        return this.x.get($$0);
    }

    public byte d(String $$0) {
        rk $$1 = this.x.get($$0);
        if ($$1 == null) {
            return 0;
        }
        return $$1.b();
    }

    public boolean e(String $$0) {
        return this.x.containsKey($$0);
    }

    public boolean b(String $$0, int $$1) {
        byte $$2 = this.d($$0);
        if ($$2 == $$1) {
            return true;
        }
        if ($$1 == 99) {
            return $$2 == 1 || $$2 == 2 || $$2 == 3 || $$2 == 4 || $$2 == 5 || $$2 == 6;
        }
        return false;
    }

    public byte f(String $$0) {
        try {
            if (this.b($$0, 99)) {
                return ((re)this.x.get($$0)).i();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return 0;
    }

    public short g(String $$0) {
        try {
            if (this.b($$0, 99)) {
                return ((re)this.x.get($$0)).h();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return 0;
    }

    public int h(String $$0) {
        try {
            if (this.b($$0, 99)) {
                return ((re)this.x.get($$0)).g();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return 0;
    }

    public long i(String $$0) {
        try {
            if (this.b($$0, 99)) {
                return ((re)this.x.get($$0)).f();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return 0L;
    }

    public float j(String $$0) {
        try {
            if (this.b($$0, 99)) {
                return ((re)this.x.get($$0)).k();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return 0.0f;
    }

    public double k(String $$0) {
        try {
            if (this.b($$0, 99)) {
                return ((re)this.x.get($$0)).j();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return 0.0;
    }

    public String l(String $$0) {
        try {
            if (this.b($$0, 8)) {
                return this.x.get($$0).m_();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return "";
    }

    public byte[] m(String $$0) {
        try {
            if (this.b($$0, 7)) {
                return ((qo)this.x.get($$0)).e();
            }
        }
        catch (ClassCastException $$1) {
            throw new y(this.a($$0, qo.a, $$1));
        }
        return new byte[0];
    }

    public int[] n(String $$0) {
        try {
            if (this.b($$0, 11)) {
                return ((qv)this.x.get($$0)).g();
            }
        }
        catch (ClassCastException $$1) {
            throw new y(this.a($$0, qv.a, $$1));
        }
        return new int[0];
    }

    public long[] o(String $$0) {
        try {
            if (this.b($$0, 12)) {
                return ((qy)this.x.get($$0)).g();
            }
        }
        catch (ClassCastException $$1) {
            throw new y(this.a($$0, qy.a, $$1));
        }
        return new long[0];
    }

    public qr p(String $$0) {
        try {
            if (this.b($$0, 10)) {
                return (qr)this.x.get($$0);
            }
        }
        catch (ClassCastException $$1) {
            throw new y(this.a($$0, b, $$1));
        }
        return new qr();
    }

    public qx c(String $$0, int $$1) {
        try {
            if (this.d($$0) == 9) {
                qx $$2 = (qx)this.x.get($$0);
                if ($$2.isEmpty() || $$2.f() == $$1) {
                    return $$2;
                }
                return new qx();
            }
        }
        catch (ClassCastException $$3) {
            throw new y(this.a($$0, qx.a, $$3));
        }
        return new qx();
    }

    public boolean q(String $$0) {
        return this.f($$0) != 0;
    }

    public void r(String $$0) {
        this.x.remove($$0);
    }

    @Override
    public String toString() {
        return this.m_();
    }

    public boolean g() {
        return this.x.isEmpty();
    }

    private o a(String $$0, rm<?> $$1, ClassCastException $$2) {
        o $$3 = o.a($$2, "Reading NBT data");
        p $$4 = $$3.a("Corrupt NBT tag", 1);
        $$4.a("Tag type found", () -> this.x.get($$0).c().a());
        $$4.a("Tag type expected", $$1::a);
        $$4.a("Tag name", $$0);
        return $$3;
    }

    public qr h() {
        HashMap $$0 = Maps.newHashMap((Map)Maps.transformValues(this.x, rk::d));
        return new qr($$0);
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        return $$0 instanceof qr && Objects.equals(this.x, ((qr)$$0).x);
    }

    public int hashCode() {
        return this.x.hashCode();
    }

    private static void a(String $$0, rk $$1, DataOutput $$2) throws IOException {
        $$2.writeByte($$1.b());
        if ($$1.b() == 0) {
            return;
        }
        $$2.writeUTF($$0);
        $$1.a($$2);
    }

    static byte a(DataInput $$0, ra $$1) throws IOException {
        return $$0.readByte();
    }

    static String b(DataInput $$0, ra $$1) throws IOException {
        return $$0.readUTF();
    }

    static rk a(rm<?> $$0, String $$1, DataInput $$2, int $$3, ra $$4) {
        try {
            return $$0.b($$2, $$3, $$4);
        }
        catch (IOException $$5) {
            o $$6 = o.a($$5, "Loading NBT data");
            p $$7 = $$6.a("NBT Tag");
            $$7.a("Tag name", $$1);
            $$7.a("Tag type", $$0.a());
            throw new y($$6);
        }
    }

    public qr a(qr $$0) {
        for (String $$1 : $$0.x.keySet()) {
            rk $$2 = $$0.x.get($$1);
            if ($$2.b() == 10) {
                if (this.b($$1, 10)) {
                    qr $$3 = this.p($$1);
                    $$3.a((qr)$$2);
                    continue;
                }
                this.a($$1, $$2.d());
                continue;
            }
            this.a($$1, $$2.d());
        }
        return this;
    }

    @Override
    public void a(ro $$0) {
        $$0.a(this);
    }

    protected Map<String, rk> i() {
        return Collections.unmodifiableMap(this.x);
    }

    @Override
    public rh.b a(rh $$0) {
        block14: for (Map.Entry<String, rk> $$1 : this.x.entrySet()) {
            rk $$2 = $$1.getValue();
            rm<?> $$3 = $$2.c();
            rh.a $$4 = $$0.a($$3);
            switch ($$4) {
                case d: {
                    return rh.b.c;
                }
                case c: {
                    return $$0.b();
                }
                case b: {
                    continue block14;
                }
            }
            $$4 = $$0.a($$3, $$1.getKey());
            switch ($$4) {
                case d: {
                    return rh.b.c;
                }
                case c: {
                    return $$0.b();
                }
                case b: {
                    continue block14;
                }
            }
            rh.b $$5 = $$2.a($$0);
            switch ($$5) {
                case c: {
                    return rh.b.c;
                }
                case b: {
                    return $$0.b();
                }
            }
        }
        return $$0.b();
    }

    @Override
    public /* synthetic */ rk d() {
        return this.h();
    }
}

