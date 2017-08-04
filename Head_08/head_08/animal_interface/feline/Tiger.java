package head_08.animal_interface.feline;

public class Tiger extends Feline {
    @Override
    protected void makeNoise() {
        System.out.println("Tiger - makeNoise");
    }

    @Override
    protected void eat() {
        System.out.println("Tiger - eat");
    }
}
