package decorator.decorators;

import decorator.PrinterInterface;

public class LeftBracketDecorator extends Decorator {
    public LeftBracketDecorator(PrinterInterface component) {
        super(component);
    }

    public void print() {
        System.out.print("[");
        component.print();
    }
}
