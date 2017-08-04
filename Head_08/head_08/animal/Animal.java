package head_08.animal;

public abstract class Animal {
    String picture;
    boolean food;
    int hunger;
    String boundaries;
    String location;

    protected abstract void makeNoise();

    protected abstract void eat();

    public void sleep(){
        System.out.println("Animal - sleep");
    }

    protected abstract void roam();


}
