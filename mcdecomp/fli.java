/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.base.Splitter
 */
import com.google.common.base.MoreObjects;
import com.google.common.base.Splitter;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class fli
implements flh {
    private static final Splitter a = Splitter.on((char)'|').omitEmptyStrings();
    private final String d;
    private final String e;

    public fli(String $$0, String $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    @Override
    public Predicate<dcb> getPredicate(dcc<cpn, dcb> $$0) {
        Predicate<dcb> $$7;
        List $$4;
        boolean $$3;
        dde<?> $$1 = $$0.a(this.d);
        if ($$1 == null) {
            throw new RuntimeException(String.format(Locale.ROOT, "Unknown property '%s' on '%s'", this.d, $$0.c()));
        }
        String $$22 = this.e;
        boolean bl2 = $$3 = !$$22.isEmpty() && $$22.charAt(0) == '!';
        if ($$3) {
            $$22 = $$22.substring(1);
        }
        if (($$4 = a.splitToList((CharSequence)$$22)).isEmpty()) {
            throw new RuntimeException(String.format(Locale.ROOT, "Empty value '%s' for property '%s' on '%s'", this.e, this.d, $$0.c()));
        }
        if ($$4.size() == 1) {
            Predicate<dcb> $$5 = this.a($$0, $$1, $$22);
        } else {
            List $$6 = $$4.stream().map($$2 -> this.a($$0, $$1, (String)$$2)).collect(Collectors.toList());
            $$7 = $$12 -> $$6.stream().anyMatch($$1 -> $$1.test($$12));
        }
        return $$3 ? $$7.negate() : $$7;
    }

    private Predicate<dcb> a(dcc<cpn, dcb> $$0, dde<?> $$1, String $$22) {
        Optional<?> $$3 = $$1.b($$22);
        if (!$$3.isPresent()) {
            throw new RuntimeException(String.format(Locale.ROOT, "Unknown value '%s' for property '%s' on '%s' in '%s'", $$22, this.d, $$0.c(), this.e));
        }
        return $$2 -> $$2.c($$1).equals($$3.get());
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("key", (Object)this.d).add("value", (Object)this.e).toString();
    }
}

