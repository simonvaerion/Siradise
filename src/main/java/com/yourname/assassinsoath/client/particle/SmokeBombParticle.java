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

public class SmokeBombParticle extends TextureSheetParticle {
    private final SpriteSet sprites;

    protected SmokeBombParticle(ClientLevel level, double x, double y, double z, double xd, double yd, double zd,
                                SpriteSet spriteSet) {
        super(level, x, y, z, xd, yd, zd);
        this.sprites = spriteSet;
        this.setSprite(spriteSet.get(this.random));
        this.friction = 0.92F;
        this.gravity = -0.0025F;
        this.quadSize = 0.6F + this.random.nextFloat() * 0.4F;
        this.lifetime = 60 + this.random.nextInt(30);
        this.alpha = 0.0F;
        this.rCol = 0.9F;
        this.gCol = 0.9F;
        this.bCol = 0.9F;
        this.hasPhysics = false;
        this.xd *= 0.4F;
        this.yd = Math.abs(this.yd) * 0.1F + 0.02F;
        this.zd *= 0.4F;
    }

    @Override
    public void tick() {
        super.tick();
        if (!this.removed) {
            float progress = (float) this.age / (float) this.lifetime;
            float fadeIn = Math.min(progress * 2.0F, 1.0F);
            float fadeOut = 1.0F - Math.max((progress - 0.5F) * 2.0F, 0.0F);
            this.alpha = Mth.clamp(fadeIn * fadeOut, 0.0F, 1.0F);
            this.quadSize *= 1.01F;
        }
    }

    @Override
    public void render(VertexConsumer buffer, Camera camera, float partialTick) {
        this.alpha = Mth.clamp(this.alpha, 0.0F, 1.0F);
        super.render(buffer, camera, partialTick);
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprites;

        public Provider(SpriteSet sprites) {
            this.sprites = sprites;
        }

        @Override
        public Particle createParticle(SimpleParticleType type, ClientLevel level, double x, double y, double z,
                                       double xd, double yd, double zd) {
            return new SmokeBombParticle(level, x, y, z, xd, yd, zd, this.sprites);
        }
    }
}
