/**
 * <p>Thread-safe Singleton class. The instance is lazily initialized and thus needs synchronization
 * mechanism.</p>
 *
 */
public final class MyDatabase {

    /**
     * Singleton instance of the class, declared as volatile to ensure atomic access by multiple threads.
     */
    private static volatile MyDatabase instance;

    /**
     * Private constructor to prevent instantiation from outside the class.
     */
    private MyDatabase() {
        System.out.println("Database initialized!");
    }

    /**
     * The instance doesn't get created until the method is called for the first time.
     *
     * @return an instance of the class.
     */
    public static synchronized MyDatabase getInstance() {
        if (instance == null) {
            instance = new MyDatabase();
        }
        return instance;
    }
}