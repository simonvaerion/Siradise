/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

public class uh
extends IllegalArgumentException {
    public uh(ug $$0, String $$1) {
        super(String.format(Locale.ROOT, "Error parsing: %s: %s", $$0, $$1));
    }

    public uh(ug $$0, int $$1) {
        super(String.format(Locale.ROOT, "Invalid index %d requested for %s", $$1, $$0));
    }

    public uh(ug $$0, Throwable $$1) {
        super(String.format(Locale.ROOT, "Error while parsing: %s", $$0), $$1);
    }
}

