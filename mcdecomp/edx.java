/*
 * Decompiled with CFR 0.152.
 */
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class edx
extends Exception {
    private final Path a;
    private final List<edz> b;

    public edx(Path $$0, List<edz> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public String getMessage() {
        return edx.a(this.a, this.b);
    }

    public static String a(Path $$02, List<edz> $$1) {
        return "Failed to validate '" + $$02 + "'. Found forbidden symlinks: " + $$1.stream().map($$0 -> $$0.a() + "->" + $$0.b()).collect(Collectors.joining(", "));
    }
}

