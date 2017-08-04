package head_08.animal.canine;

public class Wolf extends Canine {
    @Override
    protected void makeNoise() {
        System.out.println("Wolf - makeNoise");
    }

    @Override
    protected void eat() {
        System.out.println("Wolf - eat");
    }
}
