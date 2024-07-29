/**
 * Amplifier is one of the audio subsystems
 */
public class Amplifier {
    /**
     * Turns on the amplifier.
     */
    public void turnOn() {
        System.out.println("Amplifier turned on");
    }

    /**
     * Turns off the amplifier.
     */
    public void turnOff() {
        System.out.println("Amplifier turned off");
    }

    /**
     * Sets the volume level of the amplifier.
     *
     * @param volume The desired volume level.
     */
    public void setVolume(int volume) {
        System.out.println("Amplifier volume set to " + volume);
    }
}