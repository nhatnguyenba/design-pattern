/**
 * Main entry point for the audio system application.
 */
public class App {
    public static void main(String[] args) {
        AudioSystem audioSystem = new AudioSystem();
        audioSystem.setSource("CD");
        audioSystem.setVolume(20);
        audioSystem.play();
        audioSystem.pause();
    }
}