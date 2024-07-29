import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    /**
     * Program main entry point.
     */
    public static void main(String[] args) {
        LOGGER.info("The alchemist begins his work.");
        var coin1 = CoinFactory.getCoin(CoinType.COPPER);
        var coin2 = CoinFactory.getCoin(CoinType.GOLD);
        LOGGER.info(coin1.getDescription());
        LOGGER.info(coin2.getDescription());
    }
}