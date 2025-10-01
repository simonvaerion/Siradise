/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.apache.commons.io.IOUtils
 *  org.slf4j.Logger
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class ajk
extends ajh {
    private static final Logger d = LogUtils.getLogger();
    public static final Splitter a = Splitter.on((char)'/').omitEmptyStrings().limit(3);
    private final File e;
    @Nullable
    private ZipFile f;
    private boolean g;

    public ajk(String $$0, File $$1, boolean $$2) {
        super($$0, $$2);
        this.e = $$1;
    }

    @Nullable
    private ZipFile c() {
        if (this.g) {
            return null;
        }
        if (this.f == null) {
            try {
                this.f = new ZipFile(this.e);
            }
            catch (IOException $$0) {
                d.error("Failed to open pack {}", (Object)this.e, (Object)$$0);
                this.g = true;
                return null;
            }
        }
        return this.f;
    }

    private static String b(ajm $$0, acq $$1) {
        return String.format(Locale.ROOT, "%s/%s/%s", $$0.a(), $$1.b(), $$1.a());
    }

    @Override
    @Nullable
    public akp<InputStream> a(String ... $$0) {
        return this.a(String.join((CharSequence)"/", $$0));
    }

    @Override
    public akp<InputStream> a(ajm $$0, acq $$1) {
        return this.a(ajk.b($$0, $$1));
    }

    @Nullable
    private akp<InputStream> a(String $$0) {
        ZipFile $$1 = this.c();
        if ($$1 == null) {
            return null;
        }
        ZipEntry $$2 = $$1.getEntry($$0);
        if ($$2 == null) {
            return null;
        }
        return akp.create($$1, $$2);
    }

    @Override
    public Set<String> a(ajm $$0) {
        ZipFile $$1 = this.c();
        if ($$1 == null) {
            return Set.of();
        }
        Enumeration<? extends ZipEntry> $$2 = $$1.entries();
        HashSet $$3 = Sets.newHashSet();
        while ($$2.hasMoreElements()) {
            ArrayList $$6;
            ZipEntry $$4 = $$2.nextElement();
            String $$5 = $$4.getName();
            if (!$$5.startsWith($$0.a() + "/") || ($$6 = Lists.newArrayList((Iterable)a.split((CharSequence)$$5))).size() <= 1) continue;
            String $$7 = (String)$$6.get(1);
            if ($$7.equals($$7.toLowerCase(Locale.ROOT))) {
                $$3.add($$7);
                continue;
            }
            d.warn("Ignored non-lowercase namespace: {} in {}", (Object)$$7, (Object)this.e);
        }
        return $$3;
    }

    protected void finalize() throws Throwable {
        this.close();
        super.finalize();
    }

    @Override
    public void close() {
        if (this.f != null) {
            IOUtils.closeQuietly((Closeable)this.f);
            this.f = null;
        }
    }

    @Override
    public void a(ajm $$0, String $$1, String $$2, ajl.a $$3) {
        ZipFile $$4 = this.c();
        if ($$4 == null) {
            return;
        }
        Enumeration<? extends ZipEntry> $$5 = $$4.entries();
        String $$6 = $$0.a() + "/" + $$1 + "/";
        String $$7 = $$6 + $$2 + "/";
        while ($$5.hasMoreElements()) {
            String $$9;
            ZipEntry $$8 = $$5.nextElement();
            if ($$8.isDirectory() || !($$9 = $$8.getName()).startsWith($$7)) continue;
            String $$10 = $$9.substring($$6.length());
            acq $$11 = acq.a($$1, $$10);
            if ($$11 != null) {
                $$3.accept($$11, akp.create($$4, $$8));
                continue;
            }
            d.warn("Invalid path in datapack: {}:{}, ignoring", (Object)$$1, (Object)$$10);
        }
    }
}

