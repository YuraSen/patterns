package decorator;

import decorator.decorators.LeftBracketDecorator;
import decorator.decorators.QuotesDecorator;
import decorator.decorators.RightBracketDecorator;

public class Main {
    public static void main(String[] args) {
//        PrinterInterface printerInterface = new Printer("Hiloy");
        PrinterInterface printerInterface = new QuotesDecorator(new RightBracketDecorator(new LeftBracketDecorator(new Printer("Hiloy"))));
        printerInterface.print();
    }
}