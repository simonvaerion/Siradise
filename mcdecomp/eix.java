/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.apache.http.HttpEntity
 *  org.apache.http.HttpResponse
 *  org.apache.http.NameValuePair
 *  org.apache.http.client.config.RequestConfig
 *  org.apache.http.client.methods.CloseableHttpResponse
 *  org.apache.http.client.methods.HttpPost
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.entity.InputStreamEntity
 *  org.apache.http.impl.client.CloseableHttpClient
 *  org.apache.http.impl.client.HttpClientBuilder
 *  org.apache.http.util.Args
 *  org.apache.http.util.EntityUtils
 *  org.slf4j.Logger
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;

public class eix {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 5;
    private static final String c = "/upload";
    private final File d;
    private final long e;
    private final int f;
    private final eke g;
    private final String h;
    private final String i;
    private final String j;
    private final ejd k;
    private final AtomicBoolean l = new AtomicBoolean(false);
    @Nullable
    private CompletableFuture<elv> m;
    private final RequestConfig n = RequestConfig.custom().setSocketTimeout((int)TimeUnit.MINUTES.toMillis(10L)).setConnectTimeout((int)TimeUnit.SECONDS.toMillis(15L)).build();

    public eix(File $$0, long $$1, int $$2, eke $$3, eoc $$4, String $$5, ejd $$6) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4.a();
        this.i = $$4.c();
        this.j = $$5;
        this.k = $$6;
    }

    public void a(Consumer<elv> $$0) {
        if (this.m != null) {
            return;
        }
        this.m = CompletableFuture.supplyAsync(() -> this.a(0));
        this.m.thenAccept((Consumer)$$0);
    }

    public void a() {
        this.l.set(true);
        if (this.m != null) {
            this.m.cancel(false);
            this.m = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private elv a(int $$0) {
        elv.a $$1 = new elv.a();
        if (this.l.get()) {
            return $$1.a();
        }
        this.k.b = this.d.length();
        HttpPost $$2 = new HttpPost(this.g.b().resolve("/upload/" + this.e + "/" + this.f));
        CloseableHttpClient $$3 = HttpClientBuilder.create().setDefaultRequestConfig(this.n).build();
        try {
            this.a($$2);
            CloseableHttpResponse $$4 = $$3.execute((HttpUriRequest)$$2);
            long $$5 = this.a((HttpResponse)$$4);
            if (this.a($$5, $$0)) {
                elv elv2 = this.b($$5, $$0);
                return elv2;
            }
            this.a((HttpResponse)$$4, $$1);
        }
        catch (Exception $$6) {
            if (!this.l.get()) {
                a.error("Caught exception while uploading: ", (Throwable)$$6);
            }
        }
        finally {
            this.a($$2, $$3);
        }
        return $$1.a();
    }

    private void a(HttpPost $$0, @Nullable CloseableHttpClient $$1) {
        $$0.releaseConnection();
        if ($$1 != null) {
            try {
                $$1.close();
            }
            catch (IOException $$2) {
                a.error("Failed to close Realms upload client");
            }
        }
    }

    private void a(HttpPost $$0) throws FileNotFoundException {
        $$0.setHeader("Cookie", "sid=" + this.h + ";token=" + this.g.a() + ";user=" + this.i + ";version=" + this.j);
        a $$1 = new a(new FileInputStream(this.d), this.d.length(), this.k);
        $$1.setContentType("application/octet-stream");
        $$0.setEntity((HttpEntity)$$1);
    }

    private void a(HttpResponse $$0, elv.a $$1) throws IOException {
        String $$3;
        int $$2 = $$0.getStatusLine().getStatusCode();
        if ($$2 == 401) {
            a.debug("Realms server returned 401: {}", (Object)$$0.getFirstHeader("WWW-Authenticate"));
        }
        $$1.a($$2);
        if ($$0.getEntity() != null && ($$3 = EntityUtils.toString((HttpEntity)$$0.getEntity(), (String)"UTF-8")) != null) {
            try {
                JsonParser $$4 = new JsonParser();
                JsonElement $$5 = $$4.parse($$3).getAsJsonObject().get("errorMsg");
                Optional<String> $$6 = Optional.ofNullable($$5).map(JsonElement::getAsString);
                $$1.a($$6.orElse(null));
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private boolean a(long $$0, int $$1) {
        return $$0 > 0L && $$1 + 1 < 5;
    }

    private elv b(long $$0, int $$1) throws InterruptedException {
        Thread.sleep(Duration.ofSeconds($$0).toMillis());
        return this.a($$1 + 1);
    }

    private long a(HttpResponse $$0) {
        return Optional.ofNullable($$0.getFirstHeader("Retry-After")).map(NameValuePair::getValue).map(Long::valueOf).orElse(0L);
    }

    public boolean b() {
        return this.m.isDone() || this.m.isCancelled();
    }

    static class a
    extends InputStreamEntity {
        private final long a;
        private final InputStream b;
        private final ejd c;

        public a(InputStream $$0, long $$1, ejd $$2) {
            super($$0);
            this.b = $$0;
            this.a = $$1;
            this.c = $$2;
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public void writeTo(OutputStream $$0) throws IOException {
            block7: {
                Args.notNull((Object)$$0, (String)"Output stream");
                try (InputStream $$1 = this.b;){
                    int $$5;
                    byte[] $$2 = new byte[4096];
                    if (this.a < 0L) {
                        int $$3;
                        while (($$3 = $$1.read($$2)) != -1) {
                            $$0.write($$2, 0, $$3);
                            this.c.a += (long)$$3;
                        }
                        break block7;
                    }
                    for (long $$4 = this.a; $$4 > 0L; $$4 -= (long)$$5) {
                        $$5 = $$1.read($$2, 0, (int)Math.min(4096L, $$4));
                        if ($$5 == -1) {
                            break;
                        }
                        $$0.write($$2, 0, $$5);
                        this.c.a += (long)$$5;
                        $$0.flush();
                    }
                }
            }
        }
    }
}

