/**
 * <p>
 * <strong>Example: Chat Application</strong>
 * </p>
 *
 * <p>
 * Imagine a simple chat application with multiple users. Without a mediator, each user would need to know about every other user to send and receive messages.
 * This would create tight coupling and make the system complex to manage.
 * </p>
 *
 * <p><strong>Using the Mediator Pattern:</strong></p>
 * <ul>
 * <li><strong>Mediator:</strong> A ChatMediator class handles message routing and broadcasting.</li>
 * <li><strong>Colleagues:</strong> User objects interact with the mediator to send and receive messages.</li>
 * </ul>
 */
public class App {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "John");
        User user2 = new UserImpl(mediator, "Bill");
        User user3 = new UserImpl(mediator, "Fill");
        User user4 = new UserImpl(mediator, "Stew");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hello guys!");
    }
}