package head_08.animal_interface.feline;

public class Lion extends Feline {

    @Override
    protected void makeNoise() {
        System.out.println("Lion - makeNoise");
    }

    @Override
    protected void eat() {
        System.out.println("Lion - eat");
    }
}
