/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.bytes.ByteCollection
 *  it.unimi.dsi.fastutil.bytes.ByteOpenHashSet
 *  org.slf4j.Logger
 */
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.bytes.ByteCollection;
import it.unimi.dsi.fastutil.bytes.ByteOpenHashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.slf4j.Logger;

public class rp
implements ro {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 8;
    private static final ByteCollection c = new ByteOpenHashSet(Arrays.asList((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6));
    private static final n d = n.l;
    private static final n e = n.k;
    private static final n f = n.g;
    private static final n g = n.m;
    private static final Pattern h = Pattern.compile("[A-Za-z0-9._+-]+");
    private static final String i = String.valueOf(':');
    private static final String j = String.valueOf(',');
    private static final String k = "[";
    private static final String l = "]";
    private static final String m = ";";
    private static final String n = " ";
    private static final String o = "{";
    private static final String p = "}";
    private static final String q = "\n";
    private final String r;
    private final int s;
    private sw t = sv.a;

    public rp(String $$0, int $$1) {
        this.r = $$0;
        this.s = $$1;
    }

    public sw a(rk $$0) {
        $$0.a(this);
        return this.t;
    }

    @Override
    public void a(ri $$0) {
        String $$1 = ri.b($$0.m_());
        String $$2 = $$1.substring(0, 1);
        tj $$3 = sw.b($$1.substring(1, $$1.length() - 1)).a(e);
        this.t = sw.b($$2).b($$3).f($$2);
    }

    @Override
    public void a(qp $$0) {
        tj $$1 = sw.b("b").a(g);
        this.t = sw.b(String.valueOf($$0.l())).b($$1).a(f);
    }

    @Override
    public void a(rf $$0) {
        tj $$1 = sw.b("s").a(g);
        this.t = sw.b(String.valueOf($$0.l())).b($$1).a(f);
    }

    @Override
    public void a(qw $$0) {
        this.t = sw.b(String.valueOf($$0.l())).a(f);
    }

    @Override
    public void a(qz $$0) {
        tj $$1 = sw.b("L").a(g);
        this.t = sw.b(String.valueOf($$0.l())).b($$1).a(f);
    }

    @Override
    public void a(qu $$0) {
        tj $$1 = sw.b("f").a(g);
        this.t = sw.b(String.valueOf($$0.k())).b($$1).a(f);
    }

    @Override
    public void a(qs $$0) {
        tj $$1 = sw.b("d").a(g);
        this.t = sw.b(String.valueOf($$0.j())).b($$1).a(f);
    }

    @Override
    public void a(qo $$0) {
        tj $$1 = sw.b("B").a(g);
        tj $$2 = sw.b(k).b($$1).f(m);
        byte[] $$3 = $$0.e();
        for (int $$4 = 0; $$4 < $$3.length; ++$$4) {
            tj $$5 = sw.b(String.valueOf($$3[$$4])).a(f);
            $$2.f(n).b($$5).b($$1);
            if ($$4 == $$3.length - 1) continue;
            $$2.f(j);
        }
        $$2.f(l);
        this.t = $$2;
    }

    @Override
    public void a(qv $$0) {
        tj $$1 = sw.b("I").a(g);
        tj $$2 = sw.b(k).b($$1).f(m);
        int[] $$3 = $$0.g();
        for (int $$4 = 0; $$4 < $$3.length; ++$$4) {
            $$2.f(n).b(sw.b(String.valueOf($$3[$$4])).a(f));
            if ($$4 == $$3.length - 1) continue;
            $$2.f(j);
        }
        $$2.f(l);
        this.t = $$2;
    }

    @Override
    public void a(qy $$0) {
        tj $$1 = sw.b("L").a(g);
        tj $$2 = sw.b(k).b($$1).f(m);
        long[] $$3 = $$0.g();
        for (int $$4 = 0; $$4 < $$3.length; ++$$4) {
            tj $$5 = sw.b(String.valueOf($$3[$$4])).a(f);
            $$2.f(n).b($$5).b($$1);
            if ($$4 == $$3.length - 1) continue;
            $$2.f(j);
        }
        $$2.f(l);
        this.t = $$2;
    }

    @Override
    public void a(qx $$0) {
        if ($$0.isEmpty()) {
            this.t = sw.b("[]");
            return;
        }
        if (c.contains($$0.f()) && $$0.size() <= 8) {
            String $$1 = j + n;
            tj $$2 = sw.b(k);
            for (int $$3 = 0; $$3 < $$0.size(); ++$$3) {
                if ($$3 != 0) {
                    $$2.f($$1);
                }
                $$2.b(new rp(this.r, this.s).a($$0.k($$3)));
            }
            $$2.f(l);
            this.t = $$2;
            return;
        }
        tj $$4 = sw.b(k);
        if (!this.r.isEmpty()) {
            $$4.f(q);
        }
        for (int $$5 = 0; $$5 < $$0.size(); ++$$5) {
            tj $$6 = sw.b(Strings.repeat((String)this.r, (int)(this.s + 1)));
            $$6.b(new rp(this.r, this.s + 1).a($$0.k($$5)));
            if ($$5 != $$0.size() - 1) {
                $$6.f(j).f(this.r.isEmpty() ? n : q);
            }
            $$4.b($$6);
        }
        if (!this.r.isEmpty()) {
            $$4.f(q).f(Strings.repeat((String)this.r, (int)this.s));
        }
        $$4.f(l);
        this.t = $$4;
    }

    @Override
    public void a(qr $$0) {
        if ($$0.g()) {
            this.t = sw.b("{}");
            return;
        }
        tj $$1 = sw.b(o);
        Collection<String> $$2 = $$0.e();
        if (a.isDebugEnabled()) {
            ArrayList $$3 = Lists.newArrayList($$0.e());
            Collections.sort($$3);
            $$2 = $$3;
        }
        if (!this.r.isEmpty()) {
            $$1.f(q);
        }
        Iterator $$4 = $$2.iterator();
        while ($$4.hasNext()) {
            String $$5 = (String)$$4.next();
            tj $$6 = sw.b(Strings.repeat((String)this.r, (int)(this.s + 1))).b(rp.a($$5)).f(i).f(n).b(new rp(this.r, this.s + 1).a($$0.c($$5)));
            if ($$4.hasNext()) {
                $$6.f(j).f(this.r.isEmpty() ? n : q);
            }
            $$1.b($$6);
        }
        if (!this.r.isEmpty()) {
            $$1.f(q).f(Strings.repeat((String)this.r, (int)this.s));
        }
        $$1.f(p);
        this.t = $$1;
    }

    protected static sw a(String $$0) {
        if (h.matcher($$0).matches()) {
            return sw.b($$0).a(d);
        }
        String $$1 = ri.b($$0);
        String $$2 = $$1.substring(0, 1);
        tj $$3 = sw.b($$1.substring(1, $$1.length() - 1)).a(d);
        return sw.b($$2).b($$3).f($$2);
    }

    @Override
    public void a(qt $$0) {
        this.t = sv.a;
    }
}

