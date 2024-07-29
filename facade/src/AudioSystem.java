/**
 * Provides a simplified interface for controlling the audio system.
 */
public class AudioSystem {
    private Amplifier amplifier;
    private Subwoofer subwoofer;
    private Equalizer equalizer;
    private CDPlayer cdPlayer;
    private Radio radio;

    private int volume = 10;
    private String currentSource;

    public AudioSystem() {
        amplifier = new Amplifier();
        subwoofer = new Subwoofer();
        equalizer = new Equalizer();
        cdPlayer = new CDPlayer();
        radio = new Radio();
    }

    public void play() {
        if (currentSource == null) {
            System.out.println("Please select a source first.");
            return;
        }

        amplifier.turnOn();
        amplifier.setVolume(volume);
        if (currentSource.equals("CD")) {
            cdPlayer.play();
        } else if (currentSource.equals("Radio")) {
            radio.play();
        }
    }

    public void pause() {
        if (currentSource == null) {
            System.out.println("Please select a source first.");
            return;
        }

        if (currentSource.equals("CD")) {
            cdPlayer.pause();
        } else if (currentSource.equals("Radio")) {
            radio.pause();
        }
    }

    public void setVolume(int volume) {
        this.volume = volume;
        amplifier.setVolume(volume);
        subwoofer.setVolume(volume);
    }

    public void setSource(String source) {
        if (source.equals("CD") || source.equals("Radio")) {
            currentSource = source;
        } else {
            System.out.println("Invalid source. Please select 'CD' or 'Radio'.");
        }
    }
}