public class TextBox implements UIElement {
    private String placeholder;

    public TextBox(String placeholder) {
        this.placeholder = placeholder;
    }

    @Override
    public UIElement cloneElement() {
        return new TextBox(this.placeholder);
    }

    @Override
    public void render() {
        System.out.println("Текстовое поле с подсказкой: " + placeholder);
    }
}
