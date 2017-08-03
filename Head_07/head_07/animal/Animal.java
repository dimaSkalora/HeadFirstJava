package head_07.animal;

public class Animal {
    String picture;
    boolean food;
    int hunger;
    String boundaries;
    String location;

    protected void makeNoise(){
        System.out.println("Anumal - makeNoise");
    }

    protected void eat(){
        System.out.println("Animal - eat");
    }

    public void sleep(){
        System.out.println("Animal - sleep");
    }

    protected void roam(){
        System.out.println("Animal - roam");
    }
}
