package com.yourname.assassinsoath.entity;

import com.yourname.assassinsoath.item.SmokeBombItem;
import com.yourname.assassinsoath.registry.ModEntityTypes;
import com.yourname.assassinsoath.registry.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class SmokeBombProjectile extends ThrowableItemProjectile {
    public SmokeBombProjectile(EntityType<? extends SmokeBombProjectile> type, Level level) {
        super(type, level);
    }

    public SmokeBombProjectile(Level level, LivingEntity owner) {
        super(ModEntityTypes.SMOKE_BOMB.get(), owner, level);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.SMOKE_BOMB.get();
    }

    @Override
    protected void onHitEntity(EntityHitResult result) {
        super.onHitEntity(result);
        explode(result.getLocation());
    }

    @Override
    protected void onHit(HitResult result) {
        super.onHit(result);
        explode(result.getLocation());
    }

    private void explode(Vec3 hitPos) {
        if (!level().isClientSide) {
            LivingEntity owner = getOwner() instanceof LivingEntity living ? living : null;
            SmokeBombItem.explode(level(), owner, hitPos);
            discard();
        }
    }
}