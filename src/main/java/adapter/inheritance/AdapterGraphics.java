package adapter.inheritance;

public class AdapterGraphics extends RasterGraphics implements GraphicsInterface {
    public void printLine() {
        drawLine();
    }

    public void printSquare() {
        drawSquare();
    }
}
