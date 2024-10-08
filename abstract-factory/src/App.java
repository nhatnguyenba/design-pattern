import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Abstract Factory pattern provides a way to encapsulate a group of individual factories that
 * have a common theme without specifying their concrete classes. In normal usage, the client
 * software creates a concrete implementation of the abstract factory and then uses the generic
 * interface of the factory to create the concrete objects that are part of the theme. The client
 * does not know (or care) which concrete objects it gets from each of these internal factories,
 * since it uses only the generic interfaces of their products. This pattern separates the details
 * of implementation of a set of objects from their general usage and relies on object composition,
 * as object creation is implemented in methods exposed in the factory interface.
 *
 * <p>The essence of the Abstract Factory pattern is a factory interface ({@link KingdomFactory})
 * and its implementations ( {@link ElfKingdomFactory}, {@link OrcKingdomFactory}). The example uses
 * both concrete implementations to create a king, a castle, and an army.
 */
public class App implements Runnable {

    private final Kingdom kingdom = new Kingdom();

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        var app = new App();
        app.run();
    }

    @Override
    public void run() {
        LOGGER.info("elf kingdom");
        createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        LOGGER.info(kingdom.getArmy().getDescription());
        LOGGER.info(kingdom.getCastle().getDescription());
        LOGGER.info(kingdom.getKing().getDescription());

        LOGGER.info("orc kingdom");
        createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        LOGGER.info(kingdom.getArmy().getDescription());
        LOGGER.info(kingdom.getCastle().getDescription());
        LOGGER.info(kingdom.getKing().getDescription());
    }

    /**
     * Creates kingdom.
     *
     * @param kingdomType type of Kingdom
     */
    public void createKingdom(final Kingdom.FactoryMaker.KingdomType kingdomType) {
        final KingdomFactory kingdomFactory = Kingdom.FactoryMaker.makeFactory(kingdomType);
        kingdom.setKing(kingdomFactory.createKing());
        kingdom.setCastle(kingdomFactory.createCastle());
        kingdom.setArmy(kingdomFactory.createArmy());
    }
}