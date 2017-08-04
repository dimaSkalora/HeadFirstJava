package head_08.animal_interface;

public class Hippo extends Animal {
    @Override
    protected void makeNoise() {
        System.out.println("Hippo - makeNoise");
    }

    @Override
    protected void eat() {
        System.out.println("Hippo - eat");
    }

    @Override
    protected void roam() {
        System.out.println("Hippo - rom");
    }
}
