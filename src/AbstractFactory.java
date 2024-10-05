
interface Button {
    void paint();
}

interface Window {
    void display();
}

class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in Windows style.");
    }
}

class WindowsWindow implements Window {
    @Override
    public void display() {
        System.out.println("Displaying a window in Windows style.");
    }
}

class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in Mac style.");
    }
}

class MacWindow implements Window {
    @Override
    public void display() {
        System.out.println("Displaying a window in Mac style.");
    }
}

interface GUIFactory {
    Button createButton();
    Window createWindow();
}

class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}

class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Window createWindow() {
        return new MacWindow();
    }
}

public class AbstractFactory {
    public static void main(String[] args) {
        GUIFactory factory;

        factory = new WindowsFactory();
        Button windowsButton = factory.createButton();
        Window windowsWindow = factory.createWindow();
        windowsButton.paint();
        windowsWindow.display();


        factory = new MacFactory();
        Button macButton = factory.createButton();
        Window macWindow = factory.createWindow();
        macButton.paint();
        macWindow.display();
    }
}
