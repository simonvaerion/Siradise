/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.minecraft.report.AbuseReport
 *  com.mojang.authlib.minecraft.report.AbuseReportLimits
 *  com.mojang.authlib.minecraft.report.ReportChatMessage
 *  com.mojang.authlib.minecraft.report.ReportEvidence
 *  com.mojang.authlib.minecraft.report.ReportedEntity
 *  com.mojang.datafixers.util.Either
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.StringUtils
 */
import com.google.common.collect.Lists;
import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportChatMessage;
import com.mojang.authlib.minecraft.report.ReportEvidence;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class ffo {
    private final b a;
    private final AbuseReportLimits b;

    public ffo(b $$0, AbuseReportLimits $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public ffo(UUID $$0, AbuseReportLimits $$1) {
        this.a = new b(UUID.randomUUID(), Instant.now(), $$0);
        this.b = $$1;
    }

    public b a() {
        return this.a;
    }

    public UUID b() {
        return this.a.d;
    }

    public IntSet c() {
        return this.a.e;
    }

    public String d() {
        return this.a.f;
    }

    public void a(String $$0) {
        this.a.f = $$0;
    }

    @Nullable
    public ffr e() {
        return this.a.g;
    }

    public void a(ffr $$0) {
        this.a.g = $$0;
    }

    public void a(int $$0) {
        this.a.a($$0, this.b);
    }

    public boolean b(int $$0) {
        return this.a.e.contains($$0);
    }

    public boolean f() {
        return StringUtils.isNotEmpty((CharSequence)this.d()) || !this.c().isEmpty() || this.e() != null;
    }

    @Nullable
    public a g() {
        if (this.a.e.isEmpty()) {
            return ffo$a.b;
        }
        if (this.a.e.size() > this.b.maxReportedMessageCount()) {
            return ffo$a.c;
        }
        if (this.a.g == null) {
            return ffo$a.a;
        }
        if (this.a.f.length() > this.b.maxOpinionCommentsLength()) {
            return ffo$a.d;
        }
        return null;
    }

    public Either<c, a> a(ffs $$0) {
        a $$1 = this.g();
        if ($$1 != null) {
            return Either.right((Object)$$1);
        }
        String $$2 = Objects.requireNonNull(this.a.g).a();
        ReportEvidence $$3 = this.a($$0.b());
        ReportedEntity $$4 = new ReportedEntity(this.a.d);
        AbuseReport $$5 = new AbuseReport(this.a.f, $$2, $$3, $$4, this.a.c);
        return Either.left((Object)new c(this.a.b, $$5));
    }

    private ReportEvidence a(ffh $$0) {
        ArrayList $$12 = new ArrayList();
        ffp $$22 = new ffp(this.b.leadingContextMessageCount());
        $$22.a($$0, (IntCollection)this.a.e, (int $$1, ffk.a $$2) -> $$12.add(this.a($$2, this.b($$1))));
        return new ReportEvidence(Lists.reverse($$12));
    }

    private ReportChatMessage a(ffk.a $$0, boolean $$1) {
        tq $$2 = $$0.g().j();
        to $$3 = $$0.g().l();
        List<ByteBuffer> $$4 = $$3.d().a().stream().map(th::a).toList();
        ByteBuffer $$5 = x.a($$0.g().k(), th::a);
        return new ReportChatMessage($$2.b(), $$2.c(), $$2.d(), $$3.b(), $$3.c(), $$4, $$3.a(), $$5, $$1);
    }

    public ffo h() {
        return new ffo(this.a.a(), this.b);
    }

    public class b {
        final UUID b;
        final Instant c;
        final UUID d;
        final IntSet e = new IntOpenHashSet();
        String f = "";
        @Nullable
        ffr g;

        b(UUID $$1, Instant $$2, UUID $$3) {
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        public void a(int $$0, AbuseReportLimits $$1) {
            if (this.e.contains($$0)) {
                this.e.remove($$0);
            } else if (this.e.size() < $$1.maxReportedMessageCount()) {
                this.e.add($$0);
            }
        }

        public b a() {
            b $$0 = new b(this.b, this.c, this.d);
            $$0.e.addAll((IntCollection)this.e);
            $$0.f = this.f;
            $$0.g = this.g;
            return $$0;
        }

        public boolean a(UUID $$0) {
            return $$0.equals(this.d);
        }
    }

    public static final class a
    extends Record {
        private final sw e;
        public static final a a = new a(sw.c("gui.chatReport.send.no_reason"));
        public static final a b = new a(sw.c("gui.chatReport.send.no_reported_messages"));
        public static final a c = new a(sw.c("gui.chatReport.send.too_many_messages"));
        public static final a d = new a(sw.c("gui.chatReport.send.comments_too_long"));

        public a(sw $$0) {
            this.e = $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "message", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "message", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "message", "e"}, this, $$0);
        }

        public sw a() {
            return this.e;
        }
    }

    public record c(UUID a, AbuseReport b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "id;report", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "id;report", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "id;report", "a", "b"}, this, $$0);
        }
    }
}

