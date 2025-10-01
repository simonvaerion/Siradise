/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dyu {
    private static final Logger a = LogUtils.getLogger();
    private final Map<String, dyj> b = Maps.newHashMap();
    private final DataFixer c;
    private final File d;

    public dyu(File $$0, DataFixer $$1) {
        this.c = $$1;
        this.d = $$0;
    }

    private File a(String $$0) {
        return new File(this.d, $$0 + ".dat");
    }

    public <T extends dyj> T a(Function<qr, T> $$0, Supplier<T> $$1, String $$2) {
        T $$3 = this.a($$0, $$2);
        if ($$3 != null) {
            return $$3;
        }
        dyj $$4 = (dyj)$$1.get();
        this.a($$2, $$4);
        return (T)$$4;
    }

    @Nullable
    public <T extends dyj> T a(Function<qr, T> $$0, String $$1) {
        dyj $$2 = this.b.get($$1);
        if ($$2 == null && !this.b.containsKey($$1)) {
            $$2 = this.b($$0, $$1);
            this.b.put($$1, $$2);
        }
        return (T)$$2;
    }

    @Nullable
    private <T extends dyj> T b(Function<qr, T> $$0, String $$1) {
        try {
            File $$2 = this.a($$1);
            if ($$2.exists()) {
                qr $$3 = this.a($$1, aa.b().d().c());
                return (T)((dyj)$$0.apply($$3.p("data")));
            }
        }
        catch (Exception $$4) {
            a.error("Error loading saved data: {}", (Object)$$1, (Object)$$4);
        }
        return null;
    }

    public void a(String $$0, dyj $$1) {
        this.b.put($$0, $$1);
    }

    /*
     * WARNING - void declaration
     */
    public qr a(String $$0, int $$1) throws IOException {
        File $$2 = this.a($$0);
        try (FileInputStream $$3 = new FileInputStream($$2);){
            qr qr2;
            try (PushbackInputStream $$4 = new PushbackInputStream($$3, 2);){
                void $$8;
                if (this.a($$4)) {
                    qr $$5 = rb.a($$4);
                } else {
                    try (DataInputStream $$6 = new DataInputStream($$4);){
                        qr $$7 = rb.a($$6);
                    }
                }
                int $$9 = rd.b((qr)$$8, 1343);
                qr2 = aqc.h.a(this.c, (qr)$$8, $$9, $$1);
            }
            return qr2;
        }
    }

    private boolean a(PushbackInputStream $$0) throws IOException {
        int $$4;
        byte[] $$1 = new byte[2];
        boolean $$2 = false;
        int $$3 = $$0.read($$1, 0, 2);
        if ($$3 == 2 && ($$4 = ($$1[1] & 0xFF) << 8 | $$1[0] & 0xFF) == 35615) {
            $$2 = true;
        }
        if ($$3 != 0) {
            $$0.unread($$1, 0, $$3);
        }
        return $$2;
    }

    public void a() {
        this.b.forEach(($$0, $$1) -> {
            if ($$1 != null) {
                $$1.a(this.a((String)$$0));
            }
        });
    }
}

