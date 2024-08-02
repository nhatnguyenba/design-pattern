import java.io.IOException;

class FileProtectionProxy implements FileAccess {
    private FileAccess file;
    private User user;

    public FileProtectionProxy(String filePath, User user) {
        this.file = new RealFile(filePath);
        this.user = user;
    }

    private boolean authenticate(User user) {
        // Replace with actual authentication logic
        return user.getUsername().equals("user") && user.getPassword().equals("password");
    }

    @Override
    public String read() throws IOException {
        if (authenticate(this.user)) {
            return file.read();
        } else {
            throw new SecurityException("Unauthorized access");
        }
    }

    @Override
    public void write(String content) throws IOException {
        if (authenticate(this.user)) {
            file.write(content);
        } else {
            throw new SecurityException("Unauthorized access");
        }
    }
}