/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class rg
implements ro {
    private static final Map<String, List<String>> a = ac.a(Maps.newHashMap(), $$0 -> {
        $$0.put("{}", Lists.newArrayList((Object[])new String[]{"DataVersion", "author", "size", "data", "entities", "palette", "palettes"}));
        $$0.put("{}.data.[].{}", Lists.newArrayList((Object[])new String[]{"pos", "state", "nbt"}));
        $$0.put("{}.entities.[].{}", Lists.newArrayList((Object[])new String[]{"blockPos", "pos"}));
    });
    private static final Set<String> b = Sets.newHashSet((Object[])new String[]{"{}.size.[]", "{}.data.[].{}", "{}.palette.[].{}", "{}.entities.[].{}"});
    private static final Pattern c = Pattern.compile("[A-Za-z0-9._+-]+");
    private static final String d = String.valueOf(':');
    private static final String e = String.valueOf(',');
    private static final String f = "[";
    private static final String g = "]";
    private static final String h = ";";
    private static final String i = " ";
    private static final String j = "{";
    private static final String k = "}";
    private static final String l = "\n";
    private final String m;
    private final int n;
    private final List<String> o;
    private String p = "";

    public rg() {
        this("    ", 0, Lists.newArrayList());
    }

    public rg(String $$0, int $$1, List<String> $$2) {
        this.m = $$0;
        this.n = $$1;
        this.o = $$2;
    }

    public String a(rk $$0) {
        $$0.a(this);
        return this.p;
    }

    @Override
    public void a(ri $$0) {
        this.p = ri.b($$0.m_());
    }

    @Override
    public void a(qp $$0) {
        this.p = $$0.l() + "b";
    }

    @Override
    public void a(rf $$0) {
        this.p = $$0.l() + "s";
    }

    @Override
    public void a(qw $$0) {
        this.p = String.valueOf($$0.l());
    }

    @Override
    public void a(qz $$0) {
        this.p = $$0.l() + "L";
    }

    @Override
    public void a(qu $$0) {
        this.p = $$0.k() + "f";
    }

    @Override
    public void a(qs $$0) {
        this.p = $$0.j() + "d";
    }

    @Override
    public void a(qo $$0) {
        StringBuilder $$1 = new StringBuilder(f).append("B").append(h);
        byte[] $$2 = $$0.e();
        for (int $$3 = 0; $$3 < $$2.length; ++$$3) {
            $$1.append(i).append($$2[$$3]).append("B");
            if ($$3 == $$2.length - 1) continue;
            $$1.append(e);
        }
        $$1.append(g);
        this.p = $$1.toString();
    }

    @Override
    public void a(qv $$0) {
        StringBuilder $$1 = new StringBuilder(f).append("I").append(h);
        int[] $$2 = $$0.g();
        for (int $$3 = 0; $$3 < $$2.length; ++$$3) {
            $$1.append(i).append($$2[$$3]);
            if ($$3 == $$2.length - 1) continue;
            $$1.append(e);
        }
        $$1.append(g);
        this.p = $$1.toString();
    }

    @Override
    public void a(qy $$0) {
        String $$1 = "L";
        StringBuilder $$2 = new StringBuilder(f).append("L").append(h);
        long[] $$3 = $$0.g();
        for (int $$4 = 0; $$4 < $$3.length; ++$$4) {
            $$2.append(i).append($$3[$$4]).append("L");
            if ($$4 == $$3.length - 1) continue;
            $$2.append(e);
        }
        $$2.append(g);
        this.p = $$2.toString();
    }

    @Override
    public void a(qx $$0) {
        String $$2;
        if ($$0.isEmpty()) {
            this.p = "[]";
            return;
        }
        StringBuilder $$1 = new StringBuilder(f);
        this.b("[]");
        String string = $$2 = b.contains(this.a()) ? "" : this.m;
        if (!$$2.isEmpty()) {
            $$1.append(l);
        }
        for (int $$3 = 0; $$3 < $$0.size(); ++$$3) {
            $$1.append(Strings.repeat((String)$$2, (int)(this.n + 1)));
            $$1.append(new rg($$2, this.n + 1, this.o).a($$0.k($$3)));
            if ($$3 == $$0.size() - 1) continue;
            $$1.append(e).append($$2.isEmpty() ? i : l);
        }
        if (!$$2.isEmpty()) {
            $$1.append(l).append(Strings.repeat((String)$$2, (int)this.n));
        }
        $$1.append(g);
        this.p = $$1.toString();
        this.b();
    }

    @Override
    public void a(qr $$0) {
        String $$2;
        if ($$0.g()) {
            this.p = "{}";
            return;
        }
        StringBuilder $$1 = new StringBuilder(j);
        this.b("{}");
        String string = $$2 = b.contains(this.a()) ? "" : this.m;
        if (!$$2.isEmpty()) {
            $$1.append(l);
        }
        List<String> $$3 = this.b($$0);
        Iterator $$4 = $$3.iterator();
        while ($$4.hasNext()) {
            String $$5 = (String)$$4.next();
            rk $$6 = $$0.c($$5);
            this.b($$5);
            $$1.append(Strings.repeat((String)$$2, (int)(this.n + 1))).append(rg.a($$5)).append(d).append(i).append(new rg($$2, this.n + 1, this.o).a($$6));
            this.b();
            if (!$$4.hasNext()) continue;
            $$1.append(e).append($$2.isEmpty() ? i : l);
        }
        if (!$$2.isEmpty()) {
            $$1.append(l).append(Strings.repeat((String)$$2, (int)this.n));
        }
        $$1.append(k);
        this.p = $$1.toString();
        this.b();
    }

    private void b() {
        this.o.remove(this.o.size() - 1);
    }

    private void b(String $$0) {
        this.o.add($$0);
    }

    protected List<String> b(qr $$0) {
        HashSet $$1 = Sets.newHashSet($$0.e());
        ArrayList $$2 = Lists.newArrayList();
        List<String> $$3 = a.get(this.a());
        if ($$3 != null) {
            for (String $$4 : $$3) {
                if (!$$1.remove($$4)) continue;
                $$2.add($$4);
            }
            if (!$$1.isEmpty()) {
                $$1.stream().sorted().forEach($$2::add);
            }
        } else {
            $$2.addAll($$1);
            Collections.sort($$2);
        }
        return $$2;
    }

    public String a() {
        return String.join((CharSequence)".", this.o);
    }

    protected static String a(String $$0) {
        if (c.matcher($$0).matches()) {
            return $$0;
        }
        return ri.b($$0);
    }

    @Override
    public void a(qt $$0) {
    }
}

