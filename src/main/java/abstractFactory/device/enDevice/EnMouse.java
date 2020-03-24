package abstractFactory.device.enDevice;

import abstractFactory.device.Mouse;

public class EnMouse implements Mouse {
    public void click() {
        System.out.println("click");
    }

    public void doubleClick() {
        System.out.println("double click");
    }

    public void scroll(int direction) {
        if (direction > 0)
            System.out.println("scroll up");
        else if (direction < 0)
            System.out.println("scroll down");
        else
            System.out.println("no scrolling");
    }
}
