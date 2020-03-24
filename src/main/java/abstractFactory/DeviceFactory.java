package abstractFactory;

import abstractFactory.device.Keyboard;
import abstractFactory.device.Mouse;
import abstractFactory.device.Touchpad;

public interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}
