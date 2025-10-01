/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bbg(Duration a, clt b, ahv c, dec d, String e) implements bbo
{
    public static bbg a(RecordedEvent $$0) {
        return new bbg($$0.getDuration(), new clt($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")), new ahv($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")), dec.a($$0.getString("status")), $$0.getString("level"));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bbg.class, "duration;chunkPos;worldPos;status;level", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bbg.class, "duration;chunkPos;worldPos;status;level", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bbg.class, "duration;chunkPos;worldPos;status;level", "a", "b", "c", "d", "e"}, this, $$0);
    }
}

