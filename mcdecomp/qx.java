/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class qx
extends qq<rk> {
    private static final int b = 37;
    public static final rm<qx> a = new rm.b<qx>(){

        public qx a(DataInput $$0, int $$1, ra $$2) throws IOException {
            $$2.a(37L);
            if ($$1 > 512) {
                throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
            }
            byte $$3 = $$0.readByte();
            int $$4 = $$0.readInt();
            if ($$3 == 0 && $$4 > 0) {
                throw new RuntimeException("Missing type on ListTag");
            }
            $$2.a(4L * (long)$$4);
            rm<?> $$5 = rn.a($$3);
            ArrayList $$6 = Lists.newArrayListWithCapacity((int)$$4);
            for (int $$7 = 0; $$7 < $$4; ++$$7) {
                $$6.add($$5.b($$0, $$1 + 1, $$2));
            }
            return new qx($$6, $$3);
        }

        /*
         * Exception decompiling
         */
        @Override
        public rh.b a(DataInput $$0, rh $$1) throws IOException {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[SWITCH], 8[CASE]], but top level block is 9[SWITCH]
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }

        @Override
        public void a(DataInput $$0) throws IOException {
            rm<?> $$1 = rn.a($$0.readByte());
            int $$2 = $$0.readInt();
            $$1.a($$0, $$2);
        }

        @Override
        public String a() {
            return "LIST";
        }

        @Override
        public String b() {
            return "TAG_List";
        }

        @Override
        public /* synthetic */ rk b(DataInput dataInput, int n2, ra ra2) throws IOException {
            return this.a(dataInput, n2, ra2);
        }
    };
    private final List<rk> c;
    private byte w;

    qx(List<rk> $$0, byte $$1) {
        this.c = $$0;
        this.w = $$1;
    }

    public qx() {
        this(Lists.newArrayList(), 0);
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
        this.w = this.c.isEmpty() ? (byte)0 : this.c.get(0).b();
        $$0.writeByte(this.w);
        $$0.writeInt(this.c.size());
        for (rk $$1 : this.c) {
            $$1.a($$0);
        }
    }

    @Override
    public int a() {
        int $$0 = 37;
        $$0 += 4 * this.c.size();
        for (rk $$1 : this.c) {
            $$0 += $$1.a();
        }
        return $$0;
    }

    @Override
    public byte b() {
        return 9;
    }

    public rm<qx> c() {
        return a;
    }

    @Override
    public String toString() {
        return this.m_();
    }

    private void g() {
        if (this.c.isEmpty()) {
            this.w = 0;
        }
    }

    @Override
    public rk c(int $$0) {
        rk $$1 = this.c.remove($$0);
        this.g();
        return $$1;
    }

    @Override
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    public qr a(int $$0) {
        rk $$1;
        if ($$0 >= 0 && $$0 < this.c.size() && ($$1 = this.c.get($$0)).b() == 10) {
            return (qr)$$1;
        }
        return new qr();
    }

    public qx b(int $$0) {
        rk $$1;
        if ($$0 >= 0 && $$0 < this.c.size() && ($$1 = this.c.get($$0)).b() == 9) {
            return (qx)$$1;
        }
        return new qx();
    }

    public short d(int $$0) {
        rk $$1;
        if ($$0 >= 0 && $$0 < this.c.size() && ($$1 = this.c.get($$0)).b() == 2) {
            return ((rf)$$1).h();
        }
        return 0;
    }

    public int e(int $$0) {
        rk $$1;
        if ($$0 >= 0 && $$0 < this.c.size() && ($$1 = this.c.get($$0)).b() == 3) {
            return ((qw)$$1).g();
        }
        return 0;
    }

    public int[] f(int $$0) {
        rk $$1;
        if ($$0 >= 0 && $$0 < this.c.size() && ($$1 = this.c.get($$0)).b() == 11) {
            return ((qv)$$1).g();
        }
        return new int[0];
    }

    public long[] g(int $$0) {
        rk $$1;
        if ($$0 >= 0 && $$0 < this.c.size() && ($$1 = this.c.get($$0)).b() == 12) {
            return ((qy)$$1).g();
        }
        return new long[0];
    }

    public double h(int $$0) {
        rk $$1;
        if ($$0 >= 0 && $$0 < this.c.size() && ($$1 = this.c.get($$0)).b() == 6) {
            return ((qs)$$1).j();
        }
        return 0.0;
    }

    public float i(int $$0) {
        rk $$1;
        if ($$0 >= 0 && $$0 < this.c.size() && ($$1 = this.c.get($$0)).b() == 5) {
            return ((qu)$$1).k();
        }
        return 0.0f;
    }

    public String j(int $$0) {
        if ($$0 < 0 || $$0 >= this.c.size()) {
            return "";
        }
        rk $$1 = this.c.get($$0);
        if ($$1.b() == 8) {
            return $$1.m_();
        }
        return $$1.toString();
    }

    @Override
    public int size() {
        return this.c.size();
    }

    public rk k(int $$0) {
        return this.c.get($$0);
    }

    @Override
    public rk d(int $$0, rk $$1) {
        rk $$2 = this.k($$0);
        if (!this.a($$0, $$1)) {
            throw new UnsupportedOperationException(String.format(Locale.ROOT, "Trying to add tag of type %d to list of %d", $$1.b(), this.w));
        }
        return $$2;
    }

    @Override
    public void c(int $$0, rk $$1) {
        if (!this.b($$0, $$1)) {
            throw new UnsupportedOperationException(String.format(Locale.ROOT, "Trying to add tag of type %d to list of %d", $$1.b(), this.w));
        }
    }

    @Override
    public boolean a(int $$0, rk $$1) {
        if (this.a($$1)) {
            this.c.set($$0, $$1);
            return true;
        }
        return false;
    }

    @Override
    public boolean b(int $$0, rk $$1) {
        if (this.a($$1)) {
            this.c.add($$0, $$1);
            return true;
        }
        return false;
    }

    private boolean a(rk $$0) {
        if ($$0.b() == 0) {
            return false;
        }
        if (this.w == 0) {
            this.w = $$0.b();
            return true;
        }
        return this.w == $$0.b();
    }

    public qx e() {
        List<rk> $$0 = rn.a(this.w).d() ? this.c : Iterables.transform(this.c, rk::d);
        ArrayList $$1 = Lists.newArrayList($$0);
        return new qx($$1, this.w);
    }

    @Override
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        return $$0 instanceof qx && Objects.equals(this.c, ((qx)$$0).c);
    }

    @Override
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override
    public void a(ro $$0) {
        $$0.a(this);
    }

    @Override
    public byte f() {
        return this.w;
    }

    @Override
    public void clear() {
        this.c.clear();
        this.w = 0;
    }

    @Override
    public rh.b a(rh $$0) {
        switch ($$0.a(rn.a(this.w), this.c.size())) {
            case c: {
                return rh.b.c;
            }
            case b: {
                return $$0.b();
            }
        }
        block13: for (int $$1 = 0; $$1 < this.c.size(); ++$$1) {
            rk $$2 = this.c.get($$1);
            switch ($$0.b($$2.c(), $$1)) {
                case d: {
                    return rh.b.c;
                }
                case b: {
                    continue block13;
                }
                case c: {
                    return $$0.b();
                }
                default: {
                    switch ($$2.a($$0)) {
                        case c: {
                            return rh.b.c;
                        }
                        case b: {
                            return $$0.b();
                        }
                    }
                }
            }
        }
        return $$0.b();
    }

    @Override
    public /* synthetic */ rk d() {
        return this.e();
    }

    @Override
    public /* synthetic */ Object remove(int n2) {
        return this.c(n2);
    }

    @Override
    public /* synthetic */ void add(int n2, Object object) {
        this.c(n2, (rk)object);
    }

    @Override
    public /* synthetic */ Object set(int n2, Object object) {
        return this.d(n2, (rk)object);
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.k(n2);
    }
}

