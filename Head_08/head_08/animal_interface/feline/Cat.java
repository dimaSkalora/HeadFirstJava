package head_08.animal_interface.feline;

import head_08.animal_interface.Pet;

public class Cat extends Feline implements Pet{
    @Override
    protected void makeNoise() {
        System.out.println("Cat - makeNoise");
    }

    @Override
    protected void eat() {
        System.out.println("Cat - eat");
    }

    @Override
    public void beFriendly() {

    }

    @Override
    public void play() {

    }
}
