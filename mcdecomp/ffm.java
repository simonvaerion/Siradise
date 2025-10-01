/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.exceptions.MinecraftClientException
 *  com.mojang.authlib.exceptions.MinecraftClientException$ErrorType
 *  com.mojang.authlib.exceptions.MinecraftClientHttpException
 *  com.mojang.authlib.minecraft.UserApiService
 *  com.mojang.authlib.minecraft.report.AbuseReport
 *  com.mojang.authlib.minecraft.report.AbuseReportLimits
 *  com.mojang.authlib.yggdrasil.request.AbuseReportRequest
 *  com.mojang.datafixers.util.Unit
 */
import com.mojang.authlib.exceptions.MinecraftClientException;
import com.mojang.authlib.exceptions.MinecraftClientHttpException;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest;
import com.mojang.datafixers.util.Unit;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public interface ffm {
    public static ffm a(ffq $$0, UserApiService $$1) {
        return new b($$0, $$1);
    }

    public CompletableFuture<Unit> a(UUID var1, AbuseReport var2);

    public boolean a();

    default public AbuseReportLimits b() {
        return AbuseReportLimits.DEFAULTS;
    }

    public record b(ffq a, UserApiService b) implements ffm
    {
        private final ffq a;
        private final UserApiService b;
        private static final sw c = sw.c("gui.abuseReport.send.service_unavailable");
        private static final sw d = sw.c("gui.abuseReport.send.http_error");
        private static final sw e = sw.c("gui.abuseReport.send.json_error");

        @Override
        public CompletableFuture<Unit> a(UUID $$0, AbuseReport $$1) {
            return CompletableFuture.supplyAsync(() -> {
                AbuseReportRequest $$2 = new AbuseReportRequest(1, $$0, $$1, this.a.b(), this.a.c(), this.a.d());
                try {
                    this.b.reportAbuse($$2);
                    return Unit.INSTANCE;
                }
                catch (MinecraftClientHttpException $$3) {
                    sw $$4 = this.a($$3);
                    throw new CompletionException(new a($$4, (Throwable)$$3));
                }
                catch (MinecraftClientException $$5) {
                    sw $$6 = this.a($$5);
                    throw new CompletionException(new a($$6, (Throwable)$$5));
                }
            }, ac.g());
        }

        @Override
        public boolean a() {
            return this.b.canSendReports();
        }

        private sw a(MinecraftClientHttpException $$0) {
            return sw.a("gui.abuseReport.send.error_message", new Object[]{$$0.getMessage()});
        }

        private sw a(MinecraftClientException $$0) {
            return switch ($$0.getType()) {
                default -> throw new IncompatibleClassChangeError();
                case MinecraftClientException.ErrorType.SERVICE_UNAVAILABLE -> c;
                case MinecraftClientException.ErrorType.HTTP_ERROR -> d;
                case MinecraftClientException.ErrorType.JSON_ERROR -> e;
            };
        }

        @Override
        public AbuseReportLimits b() {
            return this.b.getAbuseReportLimits();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "environment;userApiService", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "environment;userApiService", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "environment;userApiService", "a", "b"}, this, $$0);
        }

        public ffq c() {
            return this.a;
        }

        public UserApiService d() {
            return this.b;
        }
    }

    public static class a
    extends tv {
        public a(sw $$0, Throwable $$1) {
            super($$0, $$1);
        }
    }
}

