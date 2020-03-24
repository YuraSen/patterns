package abstractFactory.device.ruDevice;

import abstractFactory.device.Mouse;

public class RuMouse implements Mouse {
    public void click() {
        System.out.println("Клик мышью");
    }

    public void doubleClick() {
        System.out.println("Дабл клик мышью");
    }

    public void scroll(int direction) {
        if (direction > 0)
            System.out.println("Скролл вверх");
        else if (direction < 0)
            System.out.println("Скролл вниз");
        else
            System.out.println("не скролим");
    }
}
