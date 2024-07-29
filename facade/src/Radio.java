/**
 * Radio is one of the audio subsystems.
 */
public class Radio {
    /**
     * Tunes the radio to a specific frequency.
     *
     * @param frequency The desired frequency.
     */
    public void tune(String frequency) {
        System.out.println("Tuning to " + frequency);
    }

    /**
     * Starts playing the radio.
     */
    public void play() {
        System.out.println("Playing Radio");
    }

    /**
     * Pauses the radio playback.
     */
    public void pause() {
        System.out.println("Pausing Radio");
    }
}