package com.yourname.assassinsoath.client.model;

import com.yourname.assassinsoath.AssassinsOath;
import com.yourname.assassinsoath.item.RoninHatItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class RoninHatModel extends GeoModel<RoninHatItem> {
    private static final ResourceLocation MODEL = new ResourceLocation(AssassinsOath.MODID, "geo/ronin_hat.geo.json");
    private static final ResourceLocation TEXTURE = new ResourceLocation(AssassinsOath.MODID, "textures/models/armor/ronin_hat.png");
    private static final ResourceLocation ANIMATION = new ResourceLocation(AssassinsOath.MODID, "animations/ronin_hat.animation.json");

    @Override
    public ResourceLocation getModelResource(RoninHatItem animatable) {
        return MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(RoninHatItem animatable) {
        return TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(RoninHatItem animatable) {
        return ANIMATION;
    }
}
