package adapter.inheritance;

public class AdapterGraphics extends RasterGraphics implements IGraphicsInterface {
    public void printLine() {
        drawLine();
    }

    public void printSquare() {
        drawSquare();
    }
}
