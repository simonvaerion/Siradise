/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.lwjgl.openal.AL
 *  org.lwjgl.openal.AL10
 *  org.lwjgl.openal.ALC
 *  org.lwjgl.openal.ALC10
 *  org.lwjgl.openal.ALC11
 *  org.lwjgl.openal.ALCCapabilities
 *  org.lwjgl.openal.ALCapabilities
 *  org.lwjgl.openal.ALUtil
 *  org.lwjgl.openal.SOFTHRTF
 *  org.lwjgl.system.MemoryStack
 *  org.slf4j.Logger
 */
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.nio.IntBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.OptionalLong;
import java.util.Set;
import javax.annotation.Nullable;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALC11;
import org.lwjgl.openal.ALCCapabilities;
import org.lwjgl.openal.ALCapabilities;
import org.lwjgl.openal.ALUtil;
import org.lwjgl.openal.SOFTHRTF;
import org.lwjgl.system.MemoryStack;
import org.slf4j.Logger;

public class egf {
    static final Logger a = LogUtils.getLogger();
    private static final int b = 0;
    private static final int c = 30;
    private long d;
    private long e;
    private boolean f;
    @Nullable
    private String g;
    private static final a h = new a(){

        @Override
        @Nullable
        public ege a() {
            return null;
        }

        @Override
        public boolean a(ege $$0) {
            return false;
        }

        @Override
        public void b() {
        }

        @Override
        public int c() {
            return 0;
        }

        @Override
        public int d() {
            return 0;
        }
    };
    private a i = h;
    private a j = h;
    private final egg k = new egg();

    public egf() {
        this.g = egf.a();
    }

    public void a(@Nullable String $$0, boolean $$1) {
        this.d = egf.a($$0);
        this.f = ALC10.alcIsExtensionPresent((long)this.d, (CharSequence)"ALC_EXT_disconnect");
        ALCCapabilities $$2 = ALC.createCapabilities((long)this.d);
        if (egi.a(this.d, "Get capabilities")) {
            throw new IllegalStateException("Failed to get OpenAL capabilities");
        }
        if (!$$2.OpenALC11) {
            throw new IllegalStateException("OpenAL 1.1 not supported");
        }
        this.a($$2.ALC_SOFT_HRTF && $$1);
        this.e = ALC10.alcCreateContext((long)this.d, (IntBuffer)null);
        ALC10.alcMakeContextCurrent((long)this.e);
        int $$3 = this.i();
        int $$4 = apa.a((int)apa.c((float)$$3), 2, 8);
        int $$5 = apa.a($$3 - $$4, 8, 255);
        this.i = new b($$5);
        this.j = new b($$4);
        ALCapabilities $$6 = AL.createCapabilities((ALCCapabilities)$$2);
        egi.a("Initialization");
        if (!$$6.AL_EXT_source_distance_model) {
            throw new IllegalStateException("AL_EXT_source_distance_model is not supported");
        }
        AL10.alEnable((int)512);
        if (!$$6.AL_EXT_LINEAR_DISTANCE) {
            throw new IllegalStateException("AL_EXT_LINEAR_DISTANCE is not supported");
        }
        egi.a("Enable per-source distance models");
        a.info("OpenAL initialized on device {}", (Object)this.b());
    }

    private void a(boolean $$0) {
        int $$1 = ALC10.alcGetInteger((long)this.d, (int)6548);
        if ($$1 > 0) {
            try (MemoryStack $$2 = MemoryStack.stackPush();){
                IntBuffer $$3 = $$2.callocInt(10).put(6546).put($$0 ? 1 : 0).put(6550).put(0).put(0).flip();
                if (!SOFTHRTF.alcResetDeviceSOFT((long)this.d, (IntBuffer)$$3)) {
                    a.warn("Failed to reset device: {}", (Object)ALC10.alcGetString((long)this.d, (int)ALC10.alcGetError((long)this.d)));
                }
            }
        }
    }

    private int i() {
        try (MemoryStack $$0 = MemoryStack.stackPush();){
            int $$1 = ALC10.alcGetInteger((long)this.d, (int)4098);
            if (egi.a(this.d, "Get attributes size")) {
                throw new IllegalStateException("Failed to get OpenAL attributes");
            }
            IntBuffer $$2 = $$0.mallocInt($$1);
            ALC10.alcGetIntegerv((long)this.d, (int)4099, (IntBuffer)$$2);
            if (egi.a(this.d, "Get attributes")) {
                throw new IllegalStateException("Failed to get OpenAL attributes");
            }
            int $$3 = 0;
            while ($$3 < $$1) {
                int $$4;
                if (($$4 = $$2.get($$3++)) == 0) {
                    break;
                }
                int $$5 = $$2.get($$3++);
                if ($$4 != 4112) continue;
                int n2 = $$5;
                return n2;
            }
        }
        return 30;
    }

    @Nullable
    public static String a() {
        if (!ALC10.alcIsExtensionPresent((long)0L, (CharSequence)"ALC_ENUMERATE_ALL_EXT")) {
            return null;
        }
        ALUtil.getStringList((long)0L, (int)4115);
        return ALC10.alcGetString((long)0L, (int)4114);
    }

    public String b() {
        String $$0 = ALC10.alcGetString((long)this.d, (int)4115);
        if ($$0 == null) {
            $$0 = ALC10.alcGetString((long)this.d, (int)4101);
        }
        if ($$0 == null) {
            $$0 = "Unknown";
        }
        return $$0;
    }

    public synchronized boolean c() {
        String $$0 = egf.a();
        if (Objects.equals(this.g, $$0)) {
            return false;
        }
        this.g = $$0;
        return true;
    }

    private static long a(@Nullable String $$0) {
        OptionalLong $$1 = OptionalLong.empty();
        if ($$0 != null) {
            $$1 = egf.b($$0);
        }
        if ($$1.isEmpty()) {
            $$1 = egf.b(egf.a());
        }
        if ($$1.isEmpty()) {
            $$1 = egf.b(null);
        }
        if ($$1.isEmpty()) {
            throw new IllegalStateException("Failed to open OpenAL device");
        }
        return $$1.getAsLong();
    }

    private static OptionalLong b(@Nullable String $$0) {
        long $$1 = ALC10.alcOpenDevice((CharSequence)$$0);
        if ($$1 != 0L && !egi.a($$1, "Open device")) {
            return OptionalLong.of($$1);
        }
        return OptionalLong.empty();
    }

    public void d() {
        this.i.b();
        this.j.b();
        ALC10.alcDestroyContext((long)this.e);
        if (this.d != 0L) {
            ALC10.alcCloseDevice((long)this.d);
        }
    }

    public egg e() {
        return this.k;
    }

    @Nullable
    public ege a(c $$0) {
        return ($$0 == egf$c.b ? this.j : this.i).a();
    }

    public void a(ege $$0) {
        if (!this.i.a($$0) && !this.j.a($$0)) {
            throw new IllegalStateException("Tried to release unknown channel");
        }
    }

    public String f() {
        return String.format(Locale.ROOT, "Sounds: %d/%d + %d/%d", this.i.d(), this.i.c(), this.j.d(), this.j.c());
    }

    public List<String> g() {
        List $$0 = ALUtil.getStringList((long)0L, (int)4115);
        if ($$0 == null) {
            return Collections.emptyList();
        }
        return $$0;
    }

    public boolean h() {
        return this.f && ALC11.alcGetInteger((long)this.d, (int)787) == 0;
    }

    static interface a {
        @Nullable
        public ege a();

        public boolean a(ege var1);

        public void b();

        public int c();

        public int d();
    }

    static class b
    implements a {
        private final int a;
        private final Set<ege> b = Sets.newIdentityHashSet();

        public b(int $$0) {
            this.a = $$0;
        }

        @Override
        @Nullable
        public ege a() {
            if (this.b.size() >= this.a) {
                if (aa.aS) {
                    a.warn("Maximum sound pool size {} reached", (Object)this.a);
                }
                return null;
            }
            ege $$0 = ege.a();
            if ($$0 != null) {
                this.b.add($$0);
            }
            return $$0;
        }

        @Override
        public boolean a(ege $$0) {
            if (!this.b.remove($$0)) {
                return false;
            }
            $$0.b();
            return true;
        }

        @Override
        public void b() {
            this.b.forEach(ege::b);
            this.b.clear();
        }

        @Override
        public int c() {
            return this.a;
        }

        @Override
        public int d() {
            return this.b.size();
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c();
        public static final /* enum */ c b = new c();
        private static final /* synthetic */ c[] c;

        public static c[] values() {
            return (c[])c.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b};
        }

        static {
            c = egf$c.a();
        }
    }
}

