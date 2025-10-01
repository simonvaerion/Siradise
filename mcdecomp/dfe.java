/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap
 *  javax.annotation.Nullable
 */
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dfe
implements AutoCloseable {
    public static final String a = ".mca";
    private static final int b = 256;
    private final Long2ObjectLinkedOpenHashMap<dfd> c = new Long2ObjectLinkedOpenHashMap();
    private final Path d;
    private final boolean e;

    dfe(Path $$0, boolean $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    private dfd b(clt $$0) throws IOException {
        long $$1 = clt.c($$0.h(), $$0.i());
        dfd $$2 = (dfd)this.c.getAndMoveToFirst($$1);
        if ($$2 != null) {
            return $$2;
        }
        if (this.c.size() >= 256) {
            ((dfd)this.c.removeLast()).close();
        }
        v.c(this.d);
        Path $$3 = this.d.resolve("r." + $$0.h() + "." + $$0.i() + a);
        dfd $$4 = new dfd($$3, this.d, this.e);
        this.c.putAndMoveToFirst($$1, (Object)$$4);
        return $$4;
    }

    @Nullable
    public qr a(clt $$0) throws IOException {
        dfd $$1 = this.b($$0);
        try (DataInputStream $$2 = $$1.a($$0);){
            if ($$2 == null) {
                qr qr2 = null;
                return qr2;
            }
            qr qr3 = rb.a($$2);
            return qr3;
        }
    }

    public void a(clt $$0, rh $$1) throws IOException {
        dfd $$2 = this.b($$0);
        try (DataInputStream $$3 = $$2.a($$0);){
            if ($$3 != null) {
                rb.a((DataInput)$$3, $$1);
            }
        }
    }

    protected void a(clt $$0, @Nullable qr $$1) throws IOException {
        dfd $$2 = this.b($$0);
        if ($$1 == null) {
            $$2.d($$0);
        } else {
            try (DataOutputStream $$3 = $$2.c($$0);){
                rb.a($$1, (DataOutput)$$3);
            }
        }
    }

    @Override
    public void close() throws IOException {
        aoh<IOException> $$0 = new aoh<IOException>();
        for (dfd $$1 : this.c.values()) {
            try {
                $$1.close();
            }
            catch (IOException $$2) {
                $$0.a($$2);
            }
        }
        $$0.a();
    }

    public void a() throws IOException {
        for (dfd $$0 : this.c.values()) {
            $$0.a();
        }
    }
}

