/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectList
 *  javax.annotation.Nullable
 */
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class te {
    private final int a;
    private final ObjectList<tf> b = new ObjectArrayList();
    @Nullable
    private th c;

    public te(int $$0) {
        this.a = $$0;
        for (int $$1 = 0; $$1 < $$0; ++$$1) {
            this.b.add(null);
        }
    }

    public void a(th $$0) {
        if (!$$0.equals(this.c)) {
            this.b.add((Object)new tf($$0, true));
            this.c = $$0;
        }
    }

    public int a() {
        return this.b.size();
    }

    public boolean a(int $$0) {
        int $$1 = this.b.size() - this.a;
        if ($$0 >= 0 && $$0 <= $$1) {
            this.b.removeElements(0, $$0);
            return true;
        }
        return false;
    }

    public Optional<tc> a(tc.b $$0) {
        if (!this.a($$0.a())) {
            return Optional.empty();
        }
        ObjectArrayList $$1 = new ObjectArrayList($$0.b().cardinality());
        if ($$0.b().length() > this.a) {
            return Optional.empty();
        }
        for (int $$2 = 0; $$2 < this.a; ++$$2) {
            boolean $$3 = $$0.b().get($$2);
            tf $$4 = (tf)this.b.get($$2);
            if ($$3) {
                if ($$4 == null) {
                    return Optional.empty();
                }
                this.b.set($$2, (Object)$$4.a());
                $$1.add((Object)$$4.b());
                continue;
            }
            if ($$4 != null && !$$4.c()) {
                return Optional.empty();
            }
            this.b.set($$2, null);
        }
        return Optional.of(new tc((List<th>)$$1));
    }
}

