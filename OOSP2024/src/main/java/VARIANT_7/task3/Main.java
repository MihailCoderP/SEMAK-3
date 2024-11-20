public class MusicManager {
    public static void main(String[] args) {
        Device headphones = new Headphones();
        Feature basicFeature = new BasicFeature(headphones);
        basicFeature.enableFeature();

        Device speaker = new Speaker();
        Feature advancedFeature = new AdvancedFeature(speaker);
        advancedFeature.enableFeature();
    }
}
