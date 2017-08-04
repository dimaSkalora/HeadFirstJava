package head_08.animal.canine;

import head_08.animal.Animal;

public abstract class Canine extends Animal {
    @Override
    protected void roam() {
        System.out.println("Canine - roam");
    }
}
