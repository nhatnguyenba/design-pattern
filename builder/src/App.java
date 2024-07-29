import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args) {

        var mage = new Hero.Builder(Profession.MAGE, "James")
                .withHairColor(HairColor.BLACK)
                .withWeapon(Weapon.DAGGER)
                .build();
        LOGGER.info(mage.toString());

        var warrior = new Hero.Builder(Profession.WARRIOR, "Oliver")
                .withHairColor(HairColor.BLOND)
                .withHairType(HairType.LONG_CURLY).withArmor(Armor.CHAIN_MAIL).withWeapon(Weapon.SWORD)
                .build();
        LOGGER.info(warrior.toString());

        var thief = new Hero.Builder(Profession.THIEF, "Theodore")
                .withHairType(HairType.BALD)
                .withWeapon(Weapon.BOW)
                .build();
        LOGGER.info(thief.toString());
    }
}