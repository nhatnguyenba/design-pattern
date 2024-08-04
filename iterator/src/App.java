import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Iterator pattern is a design pattern in which an iterator is used to traverse a container and
 * access the container's elements. The Iterator pattern decouples algorithms from containers.
 *
 * <p>In this example the Iterator ({@link ItemIterator}) adds abstraction layer on top of a collection
 * ({@link TreasureChest}). This way the collection can change its internal implementation without
 * affecting its clients.
 */
public class App {

    private static final TreasureChest TREASURE_CHEST = new TreasureChest();

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    private static void demonstrateTreasureChestIteratorForType(ItemType itemType) {
        LOGGER.info("------------------------");
        LOGGER.info("Item Iterator for ItemType " + itemType + ": ");
        var itemIterator = TREASURE_CHEST.iterator(itemType);
        while (itemIterator.hasNext()) {
            LOGGER.info(itemIterator.next().toString());
        }
    }

    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        demonstrateTreasureChestIteratorForType(ItemType.RING);
        demonstrateTreasureChestIteratorForType(ItemType.POTION);
        demonstrateTreasureChestIteratorForType(ItemType.WEAPON);
        demonstrateTreasureChestIteratorForType(ItemType.ANY);
    }
}