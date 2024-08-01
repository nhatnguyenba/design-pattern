class UserImpl extends User {

    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    void send(String msg) {
        System.out.println(this.name + " sent a message: " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    void receive(String msg) {
        System.out.println(this.name + " receive a message: " + msg);
    }
}