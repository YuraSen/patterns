package abstractFactory.device.enDevice;

import abstractFactory.device.Keyboard;

public class EnKeyboard implements Keyboard {
    public void print(){
        System.out.println("print");
    }
    public void println(){
        System.out.println("print line");
    }
}
