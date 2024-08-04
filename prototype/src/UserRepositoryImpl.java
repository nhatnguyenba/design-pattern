public class UserRepositoryImpl implements UserRepository {
    @Override
    public User findUserById(String id) {
        // Suppose creating the user object here is expensives
        Geo geo = new Geo(37.3159, 81.1496);
        Address address = new Address("Napier Lane", "California", geo);
        return new User(id, "James Williams", "james.williams@gmail.com", address);
    }
}
