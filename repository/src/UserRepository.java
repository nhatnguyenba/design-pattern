import java.util.List;

public interface UserRepository {

    public void addUser(User user);

    public void deleteUser(String email);

    public List<User> getAllUsers();
}
