/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

public class rj
implements ro {
    private static final Pattern a = Pattern.compile("[A-Za-z0-9._+-]+");
    private final StringBuilder b = new StringBuilder();

    public String a(rk $$0) {
        $$0.a(this);
        return this.b.toString();
    }

    @Override
    public void a(ri $$0) {
        this.b.append(ri.b($$0.m_()));
    }

    @Override
    public void a(qp $$0) {
        this.b.append($$0.l()).append('b');
    }

    @Override
    public void a(rf $$0) {
        this.b.append($$0.l()).append('s');
    }

    @Override
    public void a(qw $$0) {
        this.b.append($$0.l());
    }

    @Override
    public void a(qz $$0) {
        this.b.append($$0.l()).append('L');
    }

    @Override
    public void a(qu $$0) {
        this.b.append($$0.k()).append('f');
    }

    @Override
    public void a(qs $$0) {
        this.b.append($$0.j()).append('d');
    }

    @Override
    public void a(qo $$0) {
        this.b.append("[B;");
        byte[] $$1 = $$0.e();
        for (int $$2 = 0; $$2 < $$1.length; ++$$2) {
            if ($$2 != 0) {
                this.b.append(',');
            }
            this.b.append($$1[$$2]).append('B');
        }
        this.b.append(']');
    }

    @Override
    public void a(qv $$0) {
        this.b.append("[I;");
        int[] $$1 = $$0.g();
        for (int $$2 = 0; $$2 < $$1.length; ++$$2) {
            if ($$2 != 0) {
                this.b.append(',');
            }
            this.b.append($$1[$$2]);
        }
        this.b.append(']');
    }

    @Override
    public void a(qy $$0) {
        this.b.append("[L;");
        long[] $$1 = $$0.g();
        for (int $$2 = 0; $$2 < $$1.length; ++$$2) {
            if ($$2 != 0) {
                this.b.append(',');
            }
            this.b.append($$1[$$2]).append('L');
        }
        this.b.append(']');
    }

    @Override
    public void a(qx $$0) {
        this.b.append('[');
        for (int $$1 = 0; $$1 < $$0.size(); ++$$1) {
            if ($$1 != 0) {
                this.b.append(',');
            }
            this.b.append(new rj().a($$0.k($$1)));
        }
        this.b.append(']');
    }

    @Override
    public void a(qr $$0) {
        this.b.append('{');
        ArrayList $$1 = Lists.newArrayList($$0.e());
        Collections.sort($$1);
        for (String $$2 : $$1) {
            if (this.b.length() != 1) {
                this.b.append(',');
            }
            this.b.append(rj.a($$2)).append(':').append(new rj().a($$0.c($$2)));
        }
        this.b.append('}');
    }

    protected static String a(String $$0) {
        if (a.matcher($$0).matches()) {
            return $$0;
        }
        return ri.b($$0);
    }

    @Override
    public void a(qt $$0) {
        this.b.append("END");
    }
}

