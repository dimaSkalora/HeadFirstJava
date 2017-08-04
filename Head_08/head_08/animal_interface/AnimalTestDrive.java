package head_08.animal_interface;

import head_08.animal_interface.canine.Dog;
import head_08.animal_interface.feline.Cat;

public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog dog = new Dog();
        Cat cat = new Cat();
        list.add(dog);
        list.add(cat);
    }
}
