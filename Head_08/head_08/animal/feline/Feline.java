package head_08.animal.feline;

import head_08.animal.Animal;

public abstract class Feline extends Animal {
    @Override
    protected void roam() {
        System.out.println("Feline - roam");
    }
}
