package decorator.decorators;

import decorator.PrinterInterface;

public abstract class Decorator implements PrinterInterface {
    PrinterInterface component;

    public Decorator(PrinterInterface component) {
        this.component = component;
    }
}
