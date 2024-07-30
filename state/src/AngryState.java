import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Angry state.
 */
public class AngryState implements State {

    private final Mammoth mammoth;

    private static final Logger LOGGER = LoggerFactory.getLogger(AngryState.class);

    public AngryState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void observe() {
        LOGGER.info("{} is furious!", mammoth);
    }

    @Override
    public void onEnterState() {
        LOGGER.info("{} gets angry!", mammoth);
    }

}