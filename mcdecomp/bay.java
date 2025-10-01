/*
 * Decompiled with CFR 0.152.
 */
import java.net.SocketAddress;
import jdk.jfr.Category;
import jdk.jfr.DataAmount;
import jdk.jfr.Enabled;
import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.StackTrace;

@Category(value={"Minecraft", "Network"})
@StackTrace(value=false)
@Enabled(value=false)
public abstract class bay
extends Event {
    @Name(value="protocolId")
    @Label(value="Protocol Id")
    public final int protocolId;
    @Name(value="packetId")
    @Label(value="Packet Id")
    public final int packetId;
    @Name(value="remoteAddress")
    @Label(value="Remote Address")
    public final String remoteAddress;
    @Name(value="bytes")
    @Label(value="Bytes")
    @DataAmount
    public final int bytes;

    public bay(int $$0, int $$1, SocketAddress $$2, int $$3) {
        this.protocolId = $$0;
        this.packetId = $$1;
        this.remoteAddress = $$2.toString();
        this.bytes = $$3;
    }

    public static final class a {
        public static final String a = "remoteAddress";
        public static final String b = "protocolId";
        public static final String c = "packetId";
        public static final String d = "bytes";

        private a() {
        }
    }
}

