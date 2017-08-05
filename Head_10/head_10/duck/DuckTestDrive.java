package head_10.duck;

public class DuckTestDrive {
    public static void main(String[] args) {
        new Duck();
        new Duck();
        new Duck();
        System.out.println(Duck.duckCount);
        new Duck();
        new Duck();
        new Duck();
        System.out.println(Duck.duckCount);
    }
}
