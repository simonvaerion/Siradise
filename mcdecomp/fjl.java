/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.joml.Matrix4f;

public class fjl {
    private static final int a = 6;
    private final acq[] b = new acq[6];

    public fjl(acq $$0) {
        for (int $$1 = 0; $$1 < 6; ++$$1) {
            this.b[$$1] = $$0.c($$0.a() + "_" + $$1 + ".png");
        }
    }

    public void a(enn $$0, float $$1, float $$2, float $$3) {
        eil $$4 = eil.a();
        eie $$5 = $$4.c();
        Matrix4f $$6 = new Matrix4f().setPerspective(1.4835298f, (float)$$0.aM().k() / (float)$$0.aM().l(), 0.05f, 10.0f);
        RenderSystem.backupProjectionMatrix();
        RenderSystem.setProjectionMatrix($$6, eir.a);
        eij $$7 = RenderSystem.getModelViewStack();
        $$7.a();
        $$7.e();
        $$7.a(a.b.rotationDegrees(180.0f));
        RenderSystem.applyModelViewMatrix();
        RenderSystem.setShader(fjq::t);
        RenderSystem.enableBlend();
        RenderSystem.disableCull();
        RenderSystem.depthMask(false);
        int $$8 = 2;
        for (int $$9 = 0; $$9 < 4; ++$$9) {
            $$7.a();
            float $$10 = ((float)($$9 % 2) / 2.0f - 0.5f) / 256.0f;
            float $$11 = ((float)($$9 / 2) / 2.0f - 0.5f) / 256.0f;
            float $$12 = 0.0f;
            $$7.a($$10, $$11, 0.0f);
            $$7.a(a.b.rotationDegrees($$1));
            $$7.a(a.d.rotationDegrees($$2));
            RenderSystem.applyModelViewMatrix();
            for (int $$13 = 0; $$13 < 6; ++$$13) {
                RenderSystem.setShaderTexture(0, this.b[$$13]);
                $$5.a(eio.b.h, eih.s);
                int $$14 = Math.round(255.0f * $$3) / ($$9 + 1);
                if ($$13 == 0) {
                    $$5.a(-1.0, -1.0, 1.0).a(0.0f, 0.0f).a(255, 255, 255, $$14).e();
                    $$5.a(-1.0, 1.0, 1.0).a(0.0f, 1.0f).a(255, 255, 255, $$14).e();
                    $$5.a(1.0, 1.0, 1.0).a(1.0f, 1.0f).a(255, 255, 255, $$14).e();
                    $$5.a(1.0, -1.0, 1.0).a(1.0f, 0.0f).a(255, 255, 255, $$14).e();
                }
                if ($$13 == 1) {
                    $$5.a(1.0, -1.0, 1.0).a(0.0f, 0.0f).a(255, 255, 255, $$14).e();
                    $$5.a(1.0, 1.0, 1.0).a(0.0f, 1.0f).a(255, 255, 255, $$14).e();
                    $$5.a(1.0, 1.0, -1.0).a(1.0f, 1.0f).a(255, 255, 255, $$14).e();
                    $$5.a(1.0, -1.0, -1.0).a(1.0f, 0.0f).a(255, 255, 255, $$14).e();
                }
                if ($$13 == 2) {
                    $$5.a(1.0, -1.0, -1.0).a(0.0f, 0.0f).a(255, 255, 255, $$14).e();
                    $$5.a(1.0, 1.0, -1.0).a(0.0f, 1.0f).a(255, 255, 255, $$14).e();
                    $$5.a(-1.0, 1.0, -1.0).a(1.0f, 1.0f).a(255, 255, 255, $$14).e();
                    $$5.a(-1.0, -1.0, -1.0).a(1.0f, 0.0f).a(255, 255, 255, $$14).e();
                }
                if ($$13 == 3) {
                    $$5.a(-1.0, -1.0, -1.0).a(0.0f, 0.0f).a(255, 255, 255, $$14).e();
                    $$5.a(-1.0, 1.0, -1.0).a(0.0f, 1.0f).a(255, 255, 255, $$14).e();
                    $$5.a(-1.0, 1.0, 1.0).a(1.0f, 1.0f).a(255, 255, 255, $$14).e();
                    $$5.a(-1.0, -1.0, 1.0).a(1.0f, 0.0f).a(255, 255, 255, $$14).e();
                }
                if ($$13 == 4) {
                    $$5.a(-1.0, -1.0, -1.0).a(0.0f, 0.0f).a(255, 255, 255, $$14).e();
                    $$5.a(-1.0, -1.0, 1.0).a(0.0f, 1.0f).a(255, 255, 255, $$14).e();
                    $$5.a(1.0, -1.0, 1.0).a(1.0f, 1.0f).a(255, 255, 255, $$14).e();
                    $$5.a(1.0, -1.0, -1.0).a(1.0f, 0.0f).a(255, 255, 255, $$14).e();
                }
                if ($$13 == 5) {
                    $$5.a(-1.0, 1.0, 1.0).a(0.0f, 0.0f).a(255, 255, 255, $$14).e();
                    $$5.a(-1.0, 1.0, -1.0).a(0.0f, 1.0f).a(255, 255, 255, $$14).e();
                    $$5.a(1.0, 1.0, -1.0).a(1.0f, 1.0f).a(255, 255, 255, $$14).e();
                    $$5.a(1.0, 1.0, 1.0).a(1.0f, 0.0f).a(255, 255, 255, $$14).e();
                }
                $$4.b();
            }
            $$7.b();
            RenderSystem.applyModelViewMatrix();
            RenderSystem.colorMask(true, true, true, false);
        }
        RenderSystem.colorMask(true, true, true, true);
        RenderSystem.restoreProjectionMatrix();
        $$7.b();
        RenderSystem.applyModelViewMatrix();
        RenderSystem.depthMask(true);
        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
    }

    public CompletableFuture<Void> a(fuw $$0, Executor $$1) {
        CompletableFuture[] $$2 = new CompletableFuture[6];
        for (int $$3 = 0; $$3 < $$2.length; ++$$3) {
            $$2[$$3] = $$0.a(this.b[$$3], $$1);
        }
        return CompletableFuture.allOf($$2);
    }
}

