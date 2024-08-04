public class App {

    public static void main(String[] args) {
        var repo = new UserRepositoryImpl();
        var user = repo.findUserById("12345");
        System.out.println(user);

        // Faster because there is no need to recreate the user object from scratch
        var user1 = user.clone();
        System.out.println(user1);
    }
}
