import java.io.IOException;
import java.nio.file.Paths;

/**
 * <p>
 * <strong>Protection Proxy Example: Secure File Access</strong>
 * </p>
 *
 * <p>
 * <strong>Problem:</strong><br>
 * We want to protect a sensitive file from unauthorized access.
 * Only authenticated users with specific permissions should be allowed to read or write to the file.
 * </p>
 *
 * <p>
 * <strong>Solution:</strong><br>
 * We can implement a protection proxy to control access to the file.
 * </p>
 */
public class App {

    public static void main(String[] args) {
        User invalidUser = new User("none", "none");

        var path = Paths.get("files/", "user_file.txt");
        FileAccess file = new FileProtectionProxy(path.toString(), invalidUser);
        try {
            file.write("Hello guys!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
