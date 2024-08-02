import java.io.IOException;

interface FileAccess {
    String read() throws IOException;

    void write(String content) throws IOException;
}