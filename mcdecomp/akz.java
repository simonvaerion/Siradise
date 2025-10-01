/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

public interface akz {
    public static final akz a = new akz(){

        @Override
        public <T> Optional<T> a(ajx<T> $$0) {
            return Optional.empty();
        }
    };
    public static final akp<akz> b = () -> a;

    public static akz a(InputStream $$0) throws IOException {
        try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8));){
            final JsonObject $$2 = aor.a($$1);
            akz akz2 = new akz(){

                @Override
                public <T> Optional<T> a(ajx<T> $$0) {
                    String $$1 = $$0.a();
                    return $$2.has($$1) ? Optional.of($$0.a(aor.u($$2, $$1))) : Optional.empty();
                }
            };
            return akz2;
        }
    }

    public <T> Optional<T> a(ajx<T> var1);
}

