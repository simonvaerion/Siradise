/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.systems.RenderSystem;

public interface fhq {
    public static final fhq a = new fhq(){

        @Override
        public void a(eie $$0, fuw $$1) {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.depthMask(true);
            RenderSystem.setShaderTexture(0, fuu.e);
            $$0.a(eio.b.h, eih.l);
        }

        @Override
        public void a(eil $$0) {
            $$0.b();
        }

        public String toString() {
            return "TERRAIN_SHEET";
        }
    };
    public static final fhq b = new fhq(){

        @Override
        public void a(eie $$0, fuw $$1) {
            RenderSystem.disableBlend();
            RenderSystem.depthMask(true);
            RenderSystem.setShader(fjq::u);
            RenderSystem.setShaderTexture(0, fuu.f);
            $$0.a(eio.b.h, eih.l);
        }

        @Override
        public void a(eil $$0) {
            $$0.b();
        }

        public String toString() {
            return "PARTICLE_SHEET_OPAQUE";
        }
    };
    public static final fhq c = new fhq(){

        @Override
        public void a(eie $$0, fuw $$1) {
            RenderSystem.depthMask(true);
            RenderSystem.setShaderTexture(0, fuu.f);
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            $$0.a(eio.b.h, eih.l);
        }

        @Override
        public void a(eil $$0) {
            $$0.b();
        }

        public String toString() {
            return "PARTICLE_SHEET_TRANSLUCENT";
        }
    };
    public static final fhq d = new fhq(){

        @Override
        public void a(eie $$0, fuw $$1) {
            RenderSystem.disableBlend();
            RenderSystem.depthMask(true);
            RenderSystem.setShaderTexture(0, fuu.f);
            $$0.a(eio.b.h, eih.l);
        }

        @Override
        public void a(eil $$0) {
            $$0.b();
        }

        public String toString() {
            return "PARTICLE_SHEET_LIT";
        }
    };
    public static final fhq e = new fhq(){

        @Override
        public void a(eie $$0, fuw $$1) {
            RenderSystem.depthMask(true);
            RenderSystem.disableBlend();
        }

        @Override
        public void a(eil $$0) {
        }

        public String toString() {
            return "CUSTOM";
        }
    };
    public static final fhq f = new fhq(){

        @Override
        public void a(eie $$0, fuw $$1) {
        }

        @Override
        public void a(eil $$0) {
        }

        public String toString() {
            return "NO_RENDER";
        }
    };

    public void a(eie var1, fuw var2);

    public void a(eil var1);
}

