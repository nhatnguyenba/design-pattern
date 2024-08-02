import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

class RealFile implements FileAccess {
    private File file;

    public RealFile(String filePath) {
        this.file = new File(filePath);
    }

    @Override
    public String read() throws IOException {
        return Files.readString(Paths.get(file.getAbsolutePath()));
    }

    @Override
    public void write(String content) throws IOException {
        try (PrintWriter out = new PrintWriter(file.getAbsolutePath())) {
            out.println(content);
        }
    }
}