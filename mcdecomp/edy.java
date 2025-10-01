/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class edy {
    private final eea a;

    public edy(eea $$0) {
        this.a = $$0;
    }

    public void a(Path $$0, List<edz> $$1) throws IOException {
        Path $$2 = Files.readSymbolicLink($$0);
        if (!this.a.matches($$2)) {
            $$1.add(new edz($$0, $$2));
        }
    }

    /*
     * WARNING - void declaration
     */
    public List<edz> a(Path $$0, boolean $$1) throws IOException {
        void $$5;
        final ArrayList<edz> $$2 = new ArrayList<edz>();
        try {
            BasicFileAttributes $$3 = Files.readAttributes($$0, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
        }
        catch (NoSuchFileException $$4) {
            return $$2;
        }
        if ($$5.isRegularFile() || $$5.isOther()) {
            throw new IOException("Path " + $$0 + " is not a directory");
        }
        if ($$5.isSymbolicLink()) {
            if ($$1) {
                $$0 = Files.readSymbolicLink($$0);
            } else {
                this.a($$0, $$2);
                return $$2;
            }
        }
        Files.walkFileTree($$0, (FileVisitor<? super Path>)new SimpleFileVisitor<Path>(){

            private void c(Path $$0, BasicFileAttributes $$1) throws IOException {
                if ($$1.isSymbolicLink()) {
                    edy.this.a($$0, $$2);
                }
            }

            public FileVisitResult a(Path $$0, BasicFileAttributes $$1) throws IOException {
                this.c($$0, $$1);
                return super.preVisitDirectory($$0, $$1);
            }

            public FileVisitResult b(Path $$0, BasicFileAttributes $$1) throws IOException {
                this.c($$0, $$1);
                return super.visitFile($$0, $$1);
            }

            @Override
            public /* synthetic */ FileVisitResult visitFile(Object object, BasicFileAttributes basicFileAttributes) throws IOException {
                return this.b((Path)object, basicFileAttributes);
            }

            @Override
            public /* synthetic */ FileVisitResult preVisitDirectory(Object object, BasicFileAttributes basicFileAttributes) throws IOException {
                return this.a((Path)object, basicFileAttributes);
            }
        });
        return $$2;
    }
}

