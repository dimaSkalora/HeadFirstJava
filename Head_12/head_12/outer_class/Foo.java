package head_12.outer_class;

public class Foo {
    public static void main(String[] args) {
        MyOuter outer = new MyOuter();
        MyOuter.MyInner inner = outer.new MyInner();
    }
}
