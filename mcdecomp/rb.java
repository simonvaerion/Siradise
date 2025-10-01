/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.annotation.Nullable;

public class rb {
    public static qr a(File $$0) throws IOException {
        try (FileInputStream $$1 = new FileInputStream($$0);){
            qr qr2 = rb.a($$1);
            return qr2;
        }
    }

    private static DataInputStream b(InputStream $$0) throws IOException {
        return new DataInputStream(new aoj(new GZIPInputStream($$0)));
    }

    public static qr a(InputStream $$0) throws IOException {
        try (DataInputStream $$1 = rb.b($$0);){
            qr qr2 = rb.a((DataInput)$$1, ra.a);
            return qr2;
        }
    }

    public static void a(File $$0, rh $$1) throws IOException {
        try (FileInputStream $$2 = new FileInputStream($$0);){
            rb.a($$2, $$1);
        }
    }

    public static void a(InputStream $$0, rh $$1) throws IOException {
        try (DataInputStream $$2 = rb.b($$0);){
            rb.a((DataInput)$$2, $$1);
        }
    }

    public static void a(qr $$0, File $$1) throws IOException {
        try (FileOutputStream $$2 = new FileOutputStream($$1);){
            rb.a($$0, $$2);
        }
    }

    public static void a(qr $$0, OutputStream $$1) throws IOException {
        try (DataOutputStream $$2 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream($$1)));){
            rb.a($$0, (DataOutput)$$2);
        }
    }

    public static void b(qr $$0, File $$1) throws IOException {
        try (FileOutputStream $$2 = new FileOutputStream($$1);
             DataOutputStream $$3 = new DataOutputStream($$2);){
            rb.a($$0, (DataOutput)$$3);
        }
    }

    @Nullable
    public static qr b(File $$0) throws IOException {
        if (!$$0.exists()) {
            return null;
        }
        try (FileInputStream $$1 = new FileInputStream($$0);){
            qr qr2;
            try (DataInputStream $$2 = new DataInputStream($$1);){
                qr2 = rb.a((DataInput)$$2, ra.a);
            }
            return qr2;
        }
    }

    public static qr a(DataInput $$0) throws IOException {
        return rb.a($$0, ra.a);
    }

    public static qr a(DataInput $$0, ra $$1) throws IOException {
        rk $$2 = rb.a($$0, 0, $$1);
        if ($$2 instanceof qr) {
            return (qr)$$2;
        }
        throw new IOException("Root tag must be a named compound tag");
    }

    public static void a(qr $$0, DataOutput $$1) throws IOException {
        rb.a((rk)$$0, $$1);
    }

    public static void a(DataInput $$0, rh $$1) throws IOException {
        rm<?> $$2 = rn.a($$0.readByte());
        if ($$2 == qt.a) {
            if ($$1.b(qt.a) == rh.b.a) {
                $$1.a();
            }
            return;
        }
        switch ($$1.b($$2)) {
            case c: {
                break;
            }
            case b: {
                ri.a($$0);
                $$2.a($$0);
                break;
            }
            case a: {
                ri.a($$0);
                $$2.a($$0, $$1);
            }
        }
    }

    public static void a(rk $$0, DataOutput $$1) throws IOException {
        $$1.writeByte($$0.b());
        if ($$0.b() == 0) {
            return;
        }
        $$1.writeUTF("");
        $$0.a($$1);
    }

    private static rk a(DataInput $$0, int $$1, ra $$2) throws IOException {
        byte $$3 = $$0.readByte();
        if ($$3 == 0) {
            return qt.b;
        }
        ri.a($$0);
        try {
            return rn.a($$3).b($$0, $$1, $$2);
        }
        catch (IOException $$4) {
            o $$5 = o.a($$4, "Loading NBT data");
            p $$6 = $$5.a("NBT Tag");
            $$6.a("Tag type", $$3);
            throw new y($$5);
        }
    }
}

