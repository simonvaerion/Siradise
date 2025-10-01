/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public final class ehd
extends Enum<ehd> {
    public static final /* enum */ ehd a = new ehd("icons");
    public static final /* enum */ ehd b = new ehd("icons", "snapshot");
    private final String[] c;
    private static final /* synthetic */ ehd[] d;

    public static ehd[] values() {
        return (ehd[])d.clone();
    }

    public static ehd valueOf(String $$0) {
        return Enum.valueOf(ehd.class, $$0);
    }

    private ehd(String ... $$0) {
        this.c = $$0;
    }

    public List<akp<InputStream>> a(ajl $$0) throws IOException {
        return List.of(this.a($$0, "icon_16x16.png"), this.a($$0, "icon_32x32.png"), this.a($$0, "icon_48x48.png"), this.a($$0, "icon_128x128.png"), this.a($$0, "icon_256x256.png"));
    }

    public akp<InputStream> b(ajl $$0) throws IOException {
        return this.a($$0, "minecraft.icns");
    }

    private akp<InputStream> a(ajl $$0, String $$1) throws IOException {
        CharSequence[] $$2 = (String[])ArrayUtils.add((Object[])this.c, (Object)$$1);
        akp<InputStream> $$3 = $$0.a((String[])$$2);
        if ($$3 == null) {
            throw new FileNotFoundException(String.join((CharSequence)"/", $$2));
        }
        return $$3;
    }

    private static /* synthetic */ ehd[] a() {
        return new ehd[]{a, b};
    }

    static {
        d = ehd.a();
    }
}

