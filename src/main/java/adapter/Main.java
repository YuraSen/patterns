package adapter;

import adapter.composition.AdapterGraphics2;
import adapter.composition.IGraphicsInterface2;
import adapter.inheritance.AdapterGraphics;
import adapter.inheritance.IGraphicsInterface;
import adapter.inheritance.RasterGraphics;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        IGraphicsInterface ex1 = new AdapterGraphics();
        System.out.println("Adapter with inheritance");
        ex1.printLine();
        ex1.printSquare();

        System.out.println("Adapter with composition");
        IGraphicsInterface2 ex2 = new AdapterGraphics2();
        ex2.printLine();
        ex2.printSquare();
    }
}
