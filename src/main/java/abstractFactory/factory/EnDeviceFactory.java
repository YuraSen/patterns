package abstractFactory.factory;

import abstractFactory.DeviceFactory;
import abstractFactory.device.Keyboard;
import abstractFactory.device.Mouse;
import abstractFactory.device.Touchpad;
import abstractFactory.device.enDevice.EnKeyboard;
import abstractFactory.device.enDevice.EnMouse;
import abstractFactory.device.enDevice.EnTouchpad;

public class EnDeviceFactory implements DeviceFactory {
    public Mouse getMouse() {
        return new EnMouse();
    }

    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    public Touchpad getTouchpad() {
        return new EnTouchpad();
    }
}
