package head_12.outer_class;

public class MyOuter {
    private int x;

    MyInner inner = new MyInner();

    public void doStuff(){
        inner.go();
    }

    class MyInner{
        void go(){
            x=42;
        }
    }
}
