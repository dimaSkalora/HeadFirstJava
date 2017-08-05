package head_10.duck;

public class Duck {
    private int size;
    static int duckCount=0;

    public Duck() {
       duckCount++;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
