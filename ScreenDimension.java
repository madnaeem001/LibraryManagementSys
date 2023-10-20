public class ScreenDimension {

    private int length;
    private int width;

    public ScreenDimension(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String toString(){
        return String.format("%d/%d inches" ,length,width);
    }
}
