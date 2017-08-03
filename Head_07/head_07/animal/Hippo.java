package head_07.animal;

public class Hippo extends Animal{
    @Override
    protected void makeNoise() {
        System.out.println("Hippo - makeNoise");
    }

    @Override
    protected void eat() {
        System.out.println("Hippo - eat");
    }
}
