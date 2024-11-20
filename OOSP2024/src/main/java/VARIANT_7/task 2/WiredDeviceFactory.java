public class WiredDeviceFactory implements AudioDeviceFactory {
    @Override
    public AudioDevice createHeadphones() {
        return new Headphones();
    }

    @Override
    public AudioDevice createSpeaker() {
        return new Speaker();
    }

    @Override
    public AudioDevice createMicrophone() {
        return new Microphone();
    }
}
