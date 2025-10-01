/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ajd {
    public static final ajd a = new ajd(){

        @Override
        public void a() {
        }

        @Override
        public void b() {
        }

        @Override
        public CompletableFuture<aiu> a(String $$0) {
            return CompletableFuture.completedFuture(aiu.a($$0));
        }

        @Override
        public CompletableFuture<List<aiu>> a(List<String> $$0) {
            return CompletableFuture.completedFuture((List)$$0.stream().map(aiu::a).collect(ImmutableList.toImmutableList()));
        }
    };

    public void a();

    public void b();

    public CompletableFuture<aiu> a(String var1);

    public CompletableFuture<List<aiu>> a(List<String> var1);
}

