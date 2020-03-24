package abstractFactory.factory;

import abstractFactory.DeviceFactory;
import abstractFactory.device.Keyboard;
import abstractFactory.device.Mouse;
import abstractFactory.device.Touchpad;
import abstractFactory.device.ruDevice.RuKeyboard;
import abstractFactory.device.ruDevice.RuMouse;
import abstractFactory.device.ruDevice.RuTouchpad;

public class RuDeviceFactory implements DeviceFactory {
    public Mouse getMouse() {
        return new RuMouse();
    }

    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    public Touchpad getTouchpad() {
        return new RuTouchpad();
    }
}
