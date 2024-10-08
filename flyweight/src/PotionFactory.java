import java.util.EnumMap;
import java.util.Map;

/**
 * PotionFactory is the Flyweight in this example. It minimizes memory use by sharing object
 * instances. It holds a map of potion instances and new potions are created only when none of the
 * type already exists.
 */
public class PotionFactory {

    private final Map<PotionType, Potion> potions;

    public PotionFactory() {
        potions = new EnumMap<>(PotionType.class);
    }

    Potion createPotion(PotionType type) {
        var potion = potions.get(type);
        if (potion == null) {
            switch (type) {
                case HEALING -> potion = new HealingPotion();
                case HOLY_WATER -> potion = new HolyWaterPotion();
                case INVISIBILITY -> potion = new InvisibilityPotion();
                case POISON -> potion = new PoisonPotion();
                case STRENGTH -> potion = new StrengthPotion();
                default -> {
                }
            }
            if (potion != null) {
                potions.put(type, potion);
            }
        }
        return potion;
    }
}