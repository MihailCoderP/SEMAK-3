public class Button implements UIElement {
    private String label;

    public Button(String label) {
        this.label = label;
    }

    @Override
    public UIElement cloneElement() {
        return new Button(this.label);
    }

    @Override
    public void render() {
        System.out.println("Кнопка с текстом: " + label);
    }
}
