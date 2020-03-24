package abstractFactory.device.ruDevice;

import abstractFactory.device.Keyboard;

public class RuKeyboard implements Keyboard {
    public void print(){
        System.out.println("Печать в строку");
    }
    public void println(){
        System.out.println("Печать строку с переводом в строки");
    }
}
