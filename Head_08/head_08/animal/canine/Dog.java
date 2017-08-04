package head_08.animal.canine;

public class Dog extends Canine {
    @Override
    protected void makeNoise() {
        System.out.println("Dog - makeNoise");
    }

    @Override
    protected void eat() {
        System.out.println("Dog - eat");
    }
}
