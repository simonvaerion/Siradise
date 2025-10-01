/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface akx
extends ala {
    public Set<String> a();

    public List<akv> a(acq var1);

    public Map<acq, akv> b(String var1, Predicate<acq> var2);

    public Map<acq, List<akv>> c(String var1, Predicate<acq> var2);

    public Stream<ajl> b();

    public static final class a
    extends Enum<a>
    implements akx {
        public static final /* enum */ a a = new a();
        private static final /* synthetic */ a[] b;

        public static a[] values() {
            return (a[])b.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        @Override
        public Set<String> a() {
            return Set.of();
        }

        @Override
        public Optional<akv> getResource(acq $$0) {
            return Optional.empty();
        }

        @Override
        public List<akv> a(acq $$0) {
            return List.of();
        }

        @Override
        public Map<acq, akv> b(String $$0, Predicate<acq> $$1) {
            return Map.of();
        }

        @Override
        public Map<acq, List<akv>> c(String $$0, Predicate<acq> $$1) {
            return Map.of();
        }

        @Override
        public Stream<ajl> b() {
            return Stream.of(new ajl[0]);
        }

        private static /* synthetic */ a[] c() {
            return new a[]{a};
        }

        static {
            b = akx$a.c();
        }
    }
}

