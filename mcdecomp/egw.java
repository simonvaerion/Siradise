/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.systems.RenderSystem;

public class egw
extends egv {
    public egw(int $$0, int $$1, boolean $$2, boolean $$3) {
        super($$2);
        RenderSystem.assertOnRenderThreadOrInit();
        this.a($$0, $$1, $$3);
    }
}

