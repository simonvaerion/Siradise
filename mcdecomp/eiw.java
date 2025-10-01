/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.Hashing
 *  com.google.common.io.Files
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.apache.commons.compress.archivers.tar.TarArchiveEntry
 *  org.apache.commons.compress.archivers.tar.TarArchiveInputStream
 *  org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream
 *  org.apache.commons.io.FileUtils
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.io.output.CountingOutputStream
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.http.client.config.RequestConfig
 *  org.apache.http.client.methods.CloseableHttpResponse
 *  org.apache.http.client.methods.HttpGet
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.impl.client.CloseableHttpClient
 *  org.apache.http.impl.client.HttpClientBuilder
 *  org.slf4j.Logger
 */
import com.google.common.hash.Hashing;
import com.google.common.io.Files;
import com.mojang.logging.LogUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.CountingOutputStream;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;

public class eiw {
    static final Logger a = LogUtils.getLogger();
    volatile boolean b;
    volatile boolean c;
    volatile boolean d;
    volatile boolean e;
    @Nullable
    private volatile File f;
    volatile File g;
    @Nullable
    private volatile HttpGet h;
    @Nullable
    private Thread i;
    private final RequestConfig j = RequestConfig.custom().setSocketTimeout(120000).setConnectTimeout(120000).build();
    private static final String[] k = new String[]{"CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9"};

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public long a(String $$0) {
        CloseableHttpClient $$1 = null;
        HttpGet $$2 = null;
        try {
            $$2 = new HttpGet($$0);
            $$1 = HttpClientBuilder.create().setDefaultRequestConfig(this.j).build();
            CloseableHttpResponse $$3 = $$1.execute((HttpUriRequest)$$2);
            long l2 = Long.parseLong($$3.getFirstHeader("Content-Length").getValue());
            return l2;
        }
        catch (Throwable $$5) {
            a.error("Unable to get content length for download");
            long l3 = 0L;
            return l3;
        }
        finally {
            if ($$2 != null) {
                $$2.releaseConnection();
            }
            if ($$1 != null) {
                try {
                    $$1.close();
                }
                catch (IOException $$4) {
                    a.error("Could not close http client", (Throwable)$$4);
                }
            }
        }
    }

    public void a(ekg $$0, String $$1, eld.a $$2, dyy $$3) {
        if (this.i != null) {
            return;
        }
        this.i = new Thread(() -> {
            CloseableHttpClient $$4 = null;
            try {
                this.f = File.createTempFile("backup", ".tar.gz");
                this.h = new HttpGet($$0.a);
                $$4 = HttpClientBuilder.create().setDefaultRequestConfig(this.j).build();
                CloseableHttpResponse $$5 = $$4.execute((HttpUriRequest)this.h);
                $$1.b = Long.parseLong($$5.getFirstHeader("Content-Length").getValue());
                if ($$5.getStatusLine().getStatusCode() != 200) {
                    this.d = true;
                    this.h.abort();
                    return;
                }
                FileOutputStream $$12 = new FileOutputStream(this.f);
                b $$13 = new b($$1.trim(), this.f, $$3, $$2);
                a $$14 = new a($$12);
                $$14.a($$13);
                IOUtils.copy((InputStream)$$5.getEntity().getContent(), (OutputStream)((Object)$$14));
                return;
            }
            catch (Exception $$21) {
                a.error("Caught exception while downloading: {}", (Object)$$21.getMessage());
                this.d = true;
                return;
            }
            finally {
                block40: {
                    block41: {
                        CloseableHttpResponse $$22;
                        this.h.releaseConnection();
                        if (this.f != null) {
                            this.f.delete();
                        }
                        if (this.d) break block40;
                        if ($$0.b.isEmpty() || $$0.c.isEmpty()) break block41;
                        try {
                            this.f = File.createTempFile("resources", ".tar.gz");
                            this.h = new HttpGet($$0.b);
                            $$22 = $$4.execute((HttpUriRequest)this.h);
                            $$1.b = Long.parseLong($$22.getFirstHeader("Content-Length").getValue());
                            if ($$22.getStatusLine().getStatusCode() != 200) {
                                this.d = true;
                                this.h.abort();
                                return;
                            }
                        }
                        catch (Exception $$26) {
                            a.error("Caught exception while downloading: {}", (Object)$$26.getMessage());
                            this.d = true;
                        }
                        FileOutputStream $$23 = new FileOutputStream(this.f);
                        c $$24 = new c(this.f, $$2, $$0);
                        a $$25 = new a($$23);
                        $$25.a($$24);
                        IOUtils.copy((InputStream)$$22.getEntity().getContent(), (OutputStream)((Object)$$25));
                        break block40;
                        finally {
                            this.h.releaseConnection();
                            if (this.f != null) {
                                this.f.delete();
                            }
                        }
                    }
                    this.c = true;
                }
                if ($$4 != null) {
                    try {
                        $$4.close();
                    }
                    catch (IOException $$27) {
                        a.error("Failed to close Realms download client");
                    }
                }
            }
        });
        this.i.setUncaughtExceptionHandler(new ekk(a));
        this.i.start();
    }

    public void a() {
        if (this.h != null) {
            this.h.abort();
        }
        if (this.f != null) {
            this.f.delete();
        }
        this.b = true;
    }

    public boolean b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public static String b(String $$0) {
        $$0 = ((String)$$0).replaceAll("[\\./\"]", "_");
        for (String $$1 : k) {
            if (!((String)$$0).equalsIgnoreCase($$1)) continue;
            $$0 = "_" + (String)$$0 + "_";
        }
        return $$0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(String $$0, @Nullable File $$1, dyy $$2) throws IOException {
        String $$13;
        Pattern $$3 = Pattern.compile(".*-([0-9]+)$");
        int $$4 = 1;
        for (char $$5 : aa.aZ) {
            $$0 = $$0.replace($$5, '_');
        }
        if (StringUtils.isEmpty((CharSequence)$$0)) {
            $$0 = "Realm";
        }
        $$0 = eiw.b($$0);
        try {
            Object object = $$2.b().iterator();
            while (object.hasNext()) {
                dyy.b $$6 = (dyy.b)object.next();
                String $$7 = $$6.a();
                if (!$$7.toLowerCase(Locale.ROOT).startsWith($$0.toLowerCase(Locale.ROOT))) continue;
                Matcher $$8 = $$3.matcher($$7);
                if ($$8.matches()) {
                    int $$9 = Integer.parseInt($$8.group(1));
                    if ($$9 <= $$4) continue;
                    $$4 = $$9;
                    continue;
                }
                ++$$4;
            }
        }
        catch (Exception $$10) {
            a.error("Error getting level list", (Throwable)$$10);
            this.d = true;
            return;
        }
        if (!$$2.a($$0) || $$4 > 1) {
            String $$11 = $$0 + (String)($$4 == 1 ? "" : "-" + $$4);
            if (!$$2.a($$11)) {
                boolean $$12 = false;
                while (!$$12) {
                    if (!$$2.a($$11 = $$0 + (String)(++$$4 == 1 ? "" : "-" + $$4))) continue;
                    $$12 = true;
                }
            }
        } else {
            $$13 = $$0;
        }
        TarArchiveInputStream $$14 = null;
        File $$15 = new File(enn.N().p.getAbsolutePath(), "saves");
        try {
            $$15.mkdir();
            $$14 = new TarArchiveInputStream((InputStream)new GzipCompressorInputStream((InputStream)new BufferedInputStream(new FileInputStream($$1))));
            TarArchiveEntry $$16 = $$14.getNextTarEntry();
            while ($$16 != null) {
                File $$17 = new File($$15, $$16.getName().replace("world", $$13));
                if ($$16.isDirectory()) {
                    $$17.mkdirs();
                } else {
                    $$17.createNewFile();
                    try (FileOutputStream $$18 = new FileOutputStream($$17);){
                        IOUtils.copy((InputStream)$$14, (OutputStream)$$18);
                    }
                }
                $$16 = $$14.getNextTarEntry();
            }
        }
        catch (Exception $$23) {
            a.error("Error extracting world", (Throwable)$$23);
            this.d = true;
        }
        finally {
            if ($$14 != null) {
                $$14.close();
            }
            if ($$1 != null) {
                $$1.delete();
            }
            try (dyy.c $$24 = $$2.c($$13);){
                $$24.a($$13.trim());
                Path $$25 = $$24.a(dyw.e);
                eiw.a($$25.toFile());
            }
            catch (IOException $$26) {
                a.error("Failed to rename unpacked realms level {}", (Object)$$13, (Object)$$26);
            }
            catch (edx $$27) {
                a.warn("{}", (Object)$$27.getMessage());
            }
            this.g = new File($$15, $$13 + File.separator + "resources.zip");
        }
    }

    private static void a(File $$0) {
        if ($$0.exists()) {
            try {
                qr $$1 = rb.a($$0);
                qr $$2 = $$1.p("Data");
                $$2.r("Player");
                rb.a($$1, $$0);
            }
            catch (Exception $$3) {
                $$3.printStackTrace();
            }
        }
    }

    class c
    implements ActionListener {
        private final File b;
        private final eld.a c;
        private final ekg d;

        c(File $$0, eld.a $$1, ekg $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public void actionPerformed(ActionEvent $$0) {
            this.c.a = ((a)((Object)$$0.getSource())).getByteCount();
            if (this.c.a >= this.c.b && !eiw.this.b) {
                try {
                    String $$1 = Hashing.sha1().hashBytes(Files.toByteArray((File)this.b)).toString();
                    if ($$1.equals(this.d.c)) {
                        FileUtils.copyFile((File)this.b, (File)eiw.this.g);
                        eiw.this.c = true;
                    } else {
                        a.error("Resourcepack had wrong hash (expected {}, found {}). Deleting it.", (Object)this.d.c, (Object)$$1);
                        FileUtils.deleteQuietly((File)this.b);
                        eiw.this.d = true;
                    }
                }
                catch (IOException $$2) {
                    a.error("Error copying resourcepack file: {}", (Object)$$2.getMessage());
                    eiw.this.d = true;
                }
            }
        }
    }

    static class a
    extends CountingOutputStream {
        @Nullable
        private ActionListener a;

        public a(OutputStream $$0) {
            super($$0);
        }

        public void a(ActionListener $$0) {
            this.a = $$0;
        }

        protected void afterWrite(int $$0) throws IOException {
            super.afterWrite($$0);
            if (this.a != null) {
                this.a.actionPerformed(new ActionEvent((Object)this, 0, null));
            }
        }
    }

    class b
    implements ActionListener {
        private final String b;
        private final File c;
        private final dyy d;
        private final eld.a e;

        b(String $$0, File $$1, dyy $$2, eld.a $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        @Override
        public void actionPerformed(ActionEvent $$0) {
            this.e.a = ((a)((Object)$$0.getSource())).getByteCount();
            if (this.e.a >= this.e.b && !eiw.this.b && !eiw.this.d) {
                try {
                    eiw.this.e = true;
                    eiw.this.a(this.b, this.c, this.d);
                }
                catch (IOException $$1) {
                    a.error("Error extracting archive", (Throwable)$$1);
                    eiw.this.d = true;
                }
            }
        }
    }
}

