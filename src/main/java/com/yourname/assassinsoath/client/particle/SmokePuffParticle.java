package com.yourname.assassinsoath.client.particle;

import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.Mth;

public class SmokePuffParticle extends TextureSheetParticle {
    private final SpriteSet sprites;

    protected SmokePuffParticle(ClientLevel level, double x, double y, double z, double xd, double yd, double zd,
                                 SpriteSet sprites) {
        super(level, x, y, z, xd, yd, zd);
        this.sprites = sprites;
        this.friction = 0.92F;
        this.gravity = -0.0025F;
        this.quadSize = 0.45F + this.random.nextFloat() * 0.3F;
        this.lifetime = 40 + this.random.nextInt(20);
        this.alpha = 0.0F;
        this.setColor(1.0F, 1.0F, 1.0F);
        this.pickSprite(sprites);
        this.xd += xd;
        this.yd += yd;
        this.zd += zd;
    }

    @Override
    public void tick() {
        super.tick();
        if (!this.removed) {
            float ageProgress = (float) this.age / (float) this.lifetime;
            this.alpha = 0.1F + 0.9F * (1.0F - ageProgress);
            this.quadSize *= 1.0025F;
            this.pickSprite(this.sprites);
        }
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    @Override
    public void render(VertexConsumer buffer, Camera camera, float partialTicks) {
        this.alpha = Mth.clamp(this.alpha, 0.0F, 1.0F);
        super.render(buffer, camera, partialTicks);
    }

    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprites;

        public Provider(SpriteSet sprites) {
            this.sprites = sprites;
        }

        @Override
        public Particle createParticle(SimpleParticleType type, ClientLevel level, double x, double y, double z,
                                       double xd, double yd, double zd) {
            return new SmokePuffParticle(level, x, y, z, xd, yd, zd, this.sprites);
        }
    }
}
