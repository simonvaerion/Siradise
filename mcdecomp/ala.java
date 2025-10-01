/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface ala {
    public Optional<akv> getResource(acq var1);

    default public akv getResourceOrThrow(acq $$0) throws FileNotFoundException {
        return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
    }

    default public InputStream open(acq $$0) throws IOException {
        return this.getResourceOrThrow($$0).d();
    }

    default public BufferedReader openAsReader(acq $$0) throws IOException {
        return this.getResourceOrThrow($$0).e();
    }

    public static ala fromMap(Map<acq, akv> $$0) {
        return $$1 -> Optional.ofNullable((akv)$$0.get($$1));
    }
}

