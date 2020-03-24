package abstractFactory;

import abstractFactory.device.Keyboard;
import abstractFactory.device.Mouse;
import abstractFactory.device.Touchpad;
import abstractFactory.factory.EnDeviceFactory;
import abstractFactory.factory.RuDeviceFactory;

public class Main {
    public static void main(String[] args) {
        DeviceFactory factory = getFactoryByCountryCode("EN");
        Mouse m = factory.getMouse();
        Keyboard k = factory.getKeyboard();
        Touchpad t = factory.getTouchpad();

        m.click();
        k.print();
        t.track(50,45);
    }

    public static DeviceFactory getFactoryByCountryCode(String lang) {
        if ("RU".equals(lang)) {
            return new RuDeviceFactory();
        } else if ("EN".equals(lang)) {
            return new EnDeviceFactory();
        }
        throw new RuntimeException("Unsupported county");
    }
}
