package abstractFactory.device.ruDevice;

import abstractFactory.device.Touchpad;

public class RuTouchpad implements Touchpad {
    public void track(int deltaX, int deltaY){
        int s = (int)Math.sqrt(Math.pow(deltaX,2) + Math.pow(deltaY,2));
        System.out.println("Передвинулись на " + s + " пикселей");
    }
}
