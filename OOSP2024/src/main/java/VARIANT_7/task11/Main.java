public class PrototypeApp {
    public static void main(String[] args) {
        UIElement button = new Button("Отправить");
        UIElement textBox = new TextBox("Введите текст");

        UIElement clonedButton = button.cloneElement();
        UIElement clonedTextBox = textBox.cloneElement();

        button.render();
        textBox.render();
        clonedButton.render();
        clonedTextBox.render();
    }
}
