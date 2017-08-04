package head_08.animal_interface.canine;

import head_08.animal_interface.Animal;

public abstract class Canine extends Animal {
    @Override
    protected void roam() {
        System.out.println("Canine - roam");
    }
}
