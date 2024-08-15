import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * AlchemistShop holds potions on its shelves. It uses PotionFactory to provide the potions.
 */
public class AlchemistShop {

    private final List<Potion> topShelf;
    private final List<Potion> bottomShelf;

    private static final Logger LOGGER = LoggerFactory.getLogger(AlchemistShop.class);

    /**
     * Constructor.
     */
    public AlchemistShop() {
        var factory = new PotionFactory();
        topShelf = List.of(
                factory.createPotion(PotionType.INVISIBILITY),
                factory.createPotion(PotionType.INVISIBILITY),
                factory.createPotion(PotionType.STRENGTH),
                factory.createPotion(PotionType.HEALING),
                factory.createPotion(PotionType.INVISIBILITY),
                factory.createPotion(PotionType.STRENGTH),
                factory.createPotion(PotionType.HEALING),
                factory.createPotion(PotionType.HEALING)
        );
        bottomShelf = List.of(
                factory.createPotion(PotionType.POISON),
                factory.createPotion(PotionType.POISON),
                factory.createPotion(PotionType.POISON),
                factory.createPotion(PotionType.HOLY_WATER),
                factory.createPotion(PotionType.HOLY_WATER)
        );
    }

    /**
     * Get a read-only list of all the items on the top shelf.
     *
     * @return The top shelf potions
     */
    public final List<Potion> getTopShelf() {
        return List.copyOf(this.topShelf);
    }

    /**
     * Get a read-only list of all the items on the bottom shelf.
     *
     * @return The bottom shelf potions
     */
    public final List<Potion> getBottomShelf() {
        return List.copyOf(this.bottomShelf);
    }

    /**
     * Drink all the potions.
     */
    public void drinkPotions() {
        LOGGER.info("Drinking top shelf potions");
        topShelf.forEach(Potion::drink);
        LOGGER.info("Drinking bottom shelf potions");
        bottomShelf.forEach(Potion::drink);
    }
}