package com.yourname.assassinsoath.client.renderer;

import com.yourname.assassinsoath.client.model.RoninHatModel;
import com.yourname.assassinsoath.item.RoninHatItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RoninHatRenderer extends GeoArmorRenderer<RoninHatItem> {
    public RoninHatRenderer() {
        super(new RoninHatModel());
    }
}
