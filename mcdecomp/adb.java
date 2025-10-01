/*
 * Decompiled with CFR 0.152.
 */
public final class adb
extends RuntimeException {
    public static final adb a = new adb();

    private adb() {
        this.setStackTrace(new StackTraceElement[0]);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

