/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Locale;

public class fut
extends RuntimeException {
    private final Collection<fus.a> a;

    public fut(fus.a $$0, Collection<fus.a> $$1) {
        super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
        this.a = $$1;
    }

    public Collection<fus.a> a() {
        return this.a;
    }
}

