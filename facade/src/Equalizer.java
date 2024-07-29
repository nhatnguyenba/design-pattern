/**
 * Equalizer is one of the audio subsystems.
 */
public class Equalizer {
    /**
     * Sets the bass level of the equalizer.
     *
     * @param bass The desired bass level.
     */
    public void setBass(int bass) {
        System.out.println("Bass set to " + bass);
    }

    /**
     * Sets the treble level of the equalizer.
     *
     * @param treble The desired treble level.
     */
    public void setTreble(int treble) {
        System.out.println("Treble set to " + treble);
    }
}