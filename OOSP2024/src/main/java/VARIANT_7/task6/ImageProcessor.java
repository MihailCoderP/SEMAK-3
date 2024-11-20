public abstract class ImageProcessor {
    public final void processImage() {
        load();
        applyFilter();
        save();
    }

    protected void load() {
        System.out.println("Изображение загружено.");
    }

    protected abstract void applyFilter();

    protected void save() {
        System.out.println("Изображение сохранено.");
    }
}
