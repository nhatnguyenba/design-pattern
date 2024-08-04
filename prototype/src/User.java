public class User implements Prototype<User> {

    private String id;
    private String name;
    private String email;

    private Address address;

    public User(String id, String name, String email, Address address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    private User(User user) {
        this.id = user.id;
        this.name = user.name;
        this.email = user.email;
        this.address = user.address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public User clone() {
        return new User(this);
    }
}