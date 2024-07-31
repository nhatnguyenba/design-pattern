/**
 * Repository pattern help to promote separation of concerns, enhancing maintainability by isolating data access logic.
 *
 * <p>Offers flexibility to change underlying data storage technology without impacting application code.
 */
public class App {

    public static void main(String[] args) {
        var userRepository = new UserRepositoryImpl();
        var user1 = new User("Ethan Miller", "ethan.miller@gmail.com", "12345");
        var user2 = new User("Sophia Brown", "sophia.brown@gmail.com", "54321");
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        System.out.println("List of all users: " + userRepository.getAllUsers());
        userRepository.deleteUser("ethan.miller@gmail.com");
        System.out.println("List of all users: " + userRepository.getAllUsers());
    }
}
