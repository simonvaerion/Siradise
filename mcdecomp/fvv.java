/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fvv
extends alc<List<String>> {
    private static final acq a = new acq("texts/splashes.txt");
    private static final apf b = apf.a();
    private final List<String> c = Lists.newArrayList();
    private final eoc d;

    public fvv(eoc $$0) {
        this.d = $$0;
    }

    protected List<String> a(akx $$02, ban $$1) {
        List<String> list;
        block8: {
            BufferedReader $$2 = enn.N().Y().openAsReader(a);
            try {
                list = $$2.lines().map(String::trim).filter($$0 -> $$0.hashCode() != 125780783).collect(Collectors.toList());
                if ($$2 == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if ($$2 != null) {
                        try {
                            $$2.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException $$3) {
                    return Collections.emptyList();
                }
            }
            $$2.close();
        }
        return list;
    }

    @Override
    protected void a(List<String> $$0, akx $$1, ban $$2) {
        this.c.clear();
        this.c.addAll($$0);
    }

    @Nullable
    public eqi a() {
        Calendar $$0 = Calendar.getInstance();
        $$0.setTime(new Date());
        if ($$0.get(2) + 1 == 12 && $$0.get(5) == 24) {
            return eqi.a;
        }
        if ($$0.get(2) + 1 == 1 && $$0.get(5) == 1) {
            return eqi.b;
        }
        if ($$0.get(2) + 1 == 10 && $$0.get(5) == 31) {
            return eqi.c;
        }
        if (this.c.isEmpty()) {
            return null;
        }
        if (this.d != null && b.a(this.c.size()) == 42) {
            return new eqi(this.d.c().toUpperCase(Locale.ROOT) + " IS YOU");
        }
        return new eqi(this.c.get(b.a(this.c.size())));
    }

    @Override
    protected /* synthetic */ Object b(akx akx2, ban ban2) {
        return this.a(akx2, ban2);
    }
}

