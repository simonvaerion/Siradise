/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;

public class cfv {
    private final Map<cfu, a> a = Maps.newHashMap();
    private int b;

    public boolean a(cfu $$0) {
        return this.a($$0, 0.0f) > 0.0f;
    }

    public float a(cfu $$0, float $$1) {
        a $$2 = this.a.get($$0);
        if ($$2 != null) {
            float $$3 = $$2.b - $$2.a;
            float $$4 = (float)$$2.b - ((float)this.b + $$1);
            return apa.a($$4 / $$3, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    public void a() {
        ++this.b;
        if (!this.a.isEmpty()) {
            Iterator<Map.Entry<cfu, a>> $$0 = this.a.entrySet().iterator();
            while ($$0.hasNext()) {
                Map.Entry<cfu, a> $$1 = $$0.next();
                if ($$1.getValue().b > this.b) continue;
                $$0.remove();
                this.c($$1.getKey());
            }
        }
    }

    public void a(cfu $$0, int $$1) {
        this.a.put($$0, new a(this.b, this.b + $$1));
        this.b($$0, $$1);
    }

    public void b(cfu $$0) {
        this.a.remove($$0);
        this.c($$0);
    }

    protected void b(cfu $$0, int $$1) {
    }

    protected void c(cfu $$0) {
    }

    static class a {
        final int a;
        final int b;

        a(int $$0, int $$1) {
            this.a = $$0;
            this.b = $$1;
        }
    }
}

