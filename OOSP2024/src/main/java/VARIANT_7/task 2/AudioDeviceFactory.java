public interface AudioDeviceFactory {
    AudioDevice createHeadphones();
    AudioDevice createSpeaker();
    AudioDevice createMicrophone();
}
