package DefiningClasses;

public class Display {
    private int size;
    private int numColor;

    public Display(int size, int numColor){
        this.size = size;
        this.numColor = numColor;
    }

    public int getSize() { return size; }
    public void setSize() { this.size = size; }
    public int getNumColor() { return numColor; }
    public void setNumColor() { this.numColor = numColor; }

    @Override
    public String toString() {
        return "Display{" +
                "size=" + size +
                ", numColor=" + numColor +
                '}';
    }
}
