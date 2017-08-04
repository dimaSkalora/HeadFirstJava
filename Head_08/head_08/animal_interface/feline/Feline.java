package head_08.animal_interface.feline;

import head_08.animal_interface.Animal;

public abstract class Feline extends Animal {
    @Override
    protected void roam() {
        System.out.println("Feline - roam");
    }
}
