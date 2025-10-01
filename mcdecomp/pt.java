/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class pt {
    private static final Collection<qi> a = Lists.newArrayList();
    private static final Set<String> b = Sets.newHashSet();
    private static final Map<String, Consumer<aif>> c = Maps.newHashMap();
    private static final Map<String, Consumer<aif>> d = Maps.newHashMap();
    private static final Collection<qi> e = Sets.newHashSet();

    public static void a(Class<?> $$0) {
        Arrays.stream($$0.getDeclaredMethods()).forEach(pt::a);
    }

    public static void a(Method $$0) {
        pp $$3;
        String $$1 = $$0.getDeclaringClass().getSimpleName();
        pj $$2 = $$0.getAnnotation(pj.class);
        if ($$2 != null) {
            a.add(pt.c($$0));
            b.add($$1);
        }
        if (($$3 = $$0.getAnnotation(pp.class)) != null) {
            a.addAll(pt.b($$0));
            b.add($$1);
        }
        pt.a($$0, ph.class, ph::a, c);
        pt.a($$0, pg.class, pg::a, d);
    }

    private static <T extends Annotation> void a(Method $$0, Class<T> $$1, Function<T, String> $$2, Map<String, Consumer<aif>> $$3) {
        String $$5;
        Consumer<?> $$6;
        T $$4 = $$0.getAnnotation($$1);
        if ($$4 != null && ($$6 = $$3.putIfAbsent($$5 = $$2.apply($$4), pt.d($$0))) != null) {
            throw new RuntimeException("Hey, there should only be one " + $$1 + " method per batch. Batch '" + $$5 + "' has more than one!");
        }
    }

    public static Collection<qi> a(String $$0) {
        return a.stream().filter($$1 -> pt.a($$1, $$0)).collect(Collectors.toList());
    }

    public static Collection<qi> a() {
        return a;
    }

    public static Collection<String> b() {
        return b;
    }

    public static boolean b(String $$0) {
        return b.contains($$0);
    }

    @Nullable
    public static Consumer<aif> c(String $$0) {
        return c.get($$0);
    }

    @Nullable
    public static Consumer<aif> d(String $$0) {
        return d.get($$0);
    }

    public static Optional<qi> e(String $$0) {
        return pt.a().stream().filter($$1 -> $$1.a().equalsIgnoreCase($$0)).findFirst();
    }

    public static qi f(String $$0) {
        Optional<qi> $$1 = pt.e($$0);
        if (!$$1.isPresent()) {
            throw new IllegalArgumentException("Can't find the test function for " + $$0);
        }
        return $$1.get();
    }

    private static Collection<qi> b(Method $$0) {
        try {
            Object $$1 = $$0.getDeclaringClass().newInstance();
            return (Collection)$$0.invoke($$1, new Object[0]);
        }
        catch (ReflectiveOperationException $$2) {
            throw new RuntimeException($$2);
        }
    }

    private static qi c(Method $$0) {
        pj $$1 = $$0.getAnnotation(pj.class);
        String $$2 = $$0.getDeclaringClass().getSimpleName();
        String $$3 = $$2.toLowerCase();
        String $$4 = $$3 + "." + $$0.getName().toLowerCase();
        String $$5 = $$1.e().isEmpty() ? $$4 : $$3 + "." + $$1.e();
        String $$6 = $$1.b();
        cvz $$7 = qe.a($$1.c());
        return new qi($$6, $$4, $$5, $$7, $$1.a(), $$1.f(), $$1.d(), $$1.h(), $$1.g(), pt.d($$0));
    }

    private static Consumer<?> d(Method $$0) {
        return $$1 -> {
            try {
                Object $$2 = $$0.getDeclaringClass().newInstance();
                $$0.invoke($$2, $$1);
            }
            catch (InvocationTargetException $$3) {
                if ($$3.getCause() instanceof RuntimeException) {
                    throw (RuntimeException)$$3.getCause();
                }
                throw new RuntimeException($$3.getCause());
            }
            catch (ReflectiveOperationException $$4) {
                throw new RuntimeException($$4);
            }
        };
    }

    private static boolean a(qi $$0, String $$1) {
        return $$0.a().toLowerCase().startsWith($$1.toLowerCase() + ".");
    }

    public static Collection<qi> c() {
        return e;
    }

    public static void a(qi $$0) {
        e.add($$0);
    }

    public static void d() {
        e.clear();
    }
}

