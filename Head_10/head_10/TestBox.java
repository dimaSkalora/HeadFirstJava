package head_10;

public class TestBox {
    Integer i = new Integer(2);
    int j;

    public static void main(String[] args) {
        new TestBox().go();
    }

    void go(){
        j=i;
        System.out.println(j);
        System.out.println(i);
    }
}
