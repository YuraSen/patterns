package adapter.composition;

public class AdapterGraphics2 implements GraphicsInterface2 {
    RasterGraphics2 rg = new RasterGraphics2();

    public void printLine() {
        rg.drawLine();
    }

    public void printSquare() {
        rg.drawSquare();
    }
}
