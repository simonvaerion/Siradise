/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public class fuu
extends fug
implements fuh,
fux {
    private static final Logger g = LogUtils.getLogger();
    @Deprecated
    public static final acq e = cce.v;
    @Deprecated
    public static final acq f = new acq("textures/atlas/particles.png");
    private List<fup> h = List.of();
    private List<fuv.a> i = List.of();
    private Map<acq, fuv> j = Map.of();
    private final acq k;
    private final int l;
    private int m;
    private int n;
    private int o;

    public fuu(acq $$0) {
        this.k = $$0;
        this.l = RenderSystem.maxSupportedTextureSize();
    }

    @Override
    public void a(akx $$0) {
    }

    public void a(fuq.a $$0) {
        g.info("Created: {}x{}x{} {}-atlas", new Object[]{$$0.b(), $$0.c(), $$0.d(), this.k});
        TextureUtil.prepareImage(this.a(), $$0.d(), $$0.b(), $$0.c());
        this.m = $$0.b();
        this.n = $$0.c();
        this.o = $$0.d();
        this.f();
        this.j = Map.copyOf($$0.f());
        ArrayList<fup> $$1 = new ArrayList<fup>();
        ArrayList<fuv.a> $$2 = new ArrayList<fuv.a>();
        for (fuv $$3 : $$0.f().values()) {
            $$1.add($$3.e());
            try {
                $$3.j();
            }
            catch (Throwable $$4) {
                o $$5 = o.a($$4, "Stitching texture atlas");
                p $$6 = $$5.a("Texture being stitched together");
                $$6.a("Atlas path", this.k);
                $$6.a("Sprite", $$3);
                throw new y($$5);
            }
            fuv.a $$7 = $$3.f();
            if ($$7 == null) continue;
            $$2.add($$7);
        }
        this.h = List.copyOf($$1);
        this.i = List.copyOf($$2);
    }

    @Override
    public void a(acq $$0, Path $$1) throws IOException {
        String $$2 = $$0.c();
        TextureUtil.writeAsPNG($$1, $$2, this.a(), this.o, this.m, this.n);
        fuu.a($$1, $$2, this.j);
    }

    private static void a(Path $$0, String $$1, Map<acq, fuv> $$2) {
        Path $$3 = $$0.resolve($$1 + ".txt");
        try (BufferedWriter $$4 = Files.newBufferedWriter($$3, new OpenOption[0]);){
            for (Map.Entry $$5 : $$2.entrySet().stream().sorted(Map.Entry.comparingByKey()).toList()) {
                fuv $$6 = (fuv)$$5.getValue();
                $$4.write(String.format(Locale.ROOT, "%s\tx=%d\ty=%d\tw=%d\th=%d%n", $$5.getKey(), $$6.a(), $$6.b(), $$6.e().a(), $$6.e().b()));
            }
        }
        catch (IOException $$7) {
            g.warn("Failed to write file {}", (Object)$$3, (Object)$$7);
        }
    }

    public void d() {
        this.c();
        for (fuv.a $$0 : this.i) {
            $$0.a();
        }
    }

    @Override
    public void e() {
        if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(this::d);
        } else {
            this.d();
        }
    }

    public fuv a(acq $$0) {
        fuv $$1 = this.j.get($$0);
        if ($$1 == null) {
            return this.j.get(ful.b());
        }
        return $$1;
    }

    public void f() {
        this.h.forEach(fup::close);
        this.i.forEach(fuv.a::close);
        this.h = List.of();
        this.i = List.of();
        this.j = Map.of();
    }

    public acq g() {
        return this.k;
    }

    public int h() {
        return this.l;
    }

    int i() {
        return this.m;
    }

    int j() {
        return this.n;
    }

    public void b(fuq.a $$0) {
        this.a(false, $$0.d() > 0);
    }
}

