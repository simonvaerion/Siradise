/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.StringUtils
 */
import com.google.common.collect.Maps;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

public class ehx {
    private static final int a = 32768;
    private final a b;
    private final String c;
    private int d;

    protected ehx(a $$0, int $$1, String $$2) {
        this.b = $$0;
        this.d = $$1;
        this.c = $$2;
    }

    public void a(ehz $$0) {
        RenderSystem.assertOnRenderThread();
        GlStateManager.glAttachShader($$0.a(), this.c());
    }

    public void a() {
        if (this.d == -1) {
            return;
        }
        RenderSystem.assertOnRenderThread();
        GlStateManager.glDeleteShader(this.d);
        this.d = -1;
        this.b.c().remove(this.c);
    }

    public String b() {
        return this.c;
    }

    public static ehx a(a $$0, String $$1, InputStream $$2, String $$3, ehq $$4) throws IOException {
        RenderSystem.assertOnRenderThread();
        int $$5 = ehx.b($$0, $$1, $$2, $$3, $$4);
        ehx $$6 = new ehx($$0, $$5, $$1);
        $$0.c().put($$1, $$6);
        return $$6;
    }

    protected static int b(a $$0, String $$1, InputStream $$2, String $$3, ehq $$4) throws IOException {
        String $$5 = IOUtils.toString((InputStream)$$2, (Charset)StandardCharsets.UTF_8);
        if ($$5 == null) {
            throw new IOException("Could not load program " + $$0.a());
        }
        int $$6 = GlStateManager.glCreateShader($$0.d());
        GlStateManager.glShaderSource($$6, $$4.a($$5));
        GlStateManager.glCompileShader($$6);
        if (GlStateManager.glGetShaderi($$6, 35713) == 0) {
            String $$7 = StringUtils.trim((String)GlStateManager.glGetShaderInfoLog($$6, 32768));
            throw new IOException("Couldn't compile " + $$0.a() + " program (" + $$3 + ", " + $$1 + ") : " + $$7);
        }
        return $$6;
    }

    protected int c() {
        return this.d;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("vertex", ".vsh", 35633);
        public static final /* enum */ a b = new a("fragment", ".fsh", 35632);
        private final String c;
        private final String d;
        private final int e;
        private final Map<String, ehx> f = Maps.newHashMap();
        private static final /* synthetic */ a[] g;

        public static a[] values() {
            return (a[])g.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, String $$1, int $$2) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
        }

        public String a() {
            return this.c;
        }

        public String b() {
            return this.d;
        }

        int d() {
            return this.e;
        }

        public Map<String, ehx> c() {
            return this.f;
        }

        private static /* synthetic */ a[] e() {
            return new a[]{a, b};
        }

        static {
            g = ehx$a.e();
        }
    }
}

