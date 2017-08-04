package head_08.animal.feline;

public class Cat extends Feline {
    @Override
    protected void makeNoise() {
        System.out.println("Cat - makeNoise");
    }

    @Override
    protected void eat() {
        System.out.println("Cat - eat");
    }
}
