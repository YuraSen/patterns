package adapter.composition;

public class AdapterGraphics2 implements IGraphicsInterface2 {
    RasterGraphics rg = new RasterGraphics();

    public void printLine() {
        rg.drawLine();
    }

    public void printSquare() {
        rg.drawSquare();
    }
}
