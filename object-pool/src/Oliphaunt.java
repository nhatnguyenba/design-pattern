import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Oliphaunts are expensive to create.
 */
public class Oliphaunt {

    private static final AtomicInteger counter = new AtomicInteger(0);

    private static final Logger LOGGER = LoggerFactory.getLogger(Oliphaunt.class);

    private final int id;

    /**
     * Constructor.
     */
    public Oliphaunt() {
        id = counter.incrementAndGet();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            LOGGER.error("Error occurred: ", e);
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Oliphaunt id=%d", id);
    }
}