import java.util.HashMap;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private final HashMap<String, User> users;

    public UserRepositoryImpl() {
        this.users = new HashMap<>();
    }

    @Override
    public void addUser(User user) {
        this.users.put(user.getEmail(), user);
    }

    @Override
    public void deleteUser(String email) {
        this.users.remove(email);
    }

    @Override
    public List<User> getAllUsers() {
        return users.values().stream().toList();
    }
}
