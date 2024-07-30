import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hobbits.
 */
public class Hobbits implements WeatherObserver {

    private static final Logger LOGGER = LoggerFactory.getLogger(Hobbits.class);

    @Override
    public void update(WeatherType currentWeather) {
        LOGGER.info("The hobbits are facing {} weather now", currentWeather.getDescription());
    }
}