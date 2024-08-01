abstract class User {
    ChatMediator mediator;
    String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    abstract void send(String msg);

    abstract void receive(String msg);
}