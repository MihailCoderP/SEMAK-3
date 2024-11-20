public class ImageManager {
    public static void main(String[] args) {
        ImageProcessor bwFilter = new BlackAndWhiteFilter();
        bwFilter.processImage();

        ImageProcessor sepiaFilter = new SepiaFilter();
        sepiaFilter.processImage();

        ImageProcessor sharpnessFilter = new SharpnessFilter();
        sharpnessFilter.processImage();
    }
}
