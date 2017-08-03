package head_07.exercise.boat;

public class TestBoats {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        RowBoat b3 = new RowBoat();
        b2.setLenght(32);
        b1.move();
        b3.move();
        b2.move();
    }
}
