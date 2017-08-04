package head_08.animal;

import head_08.animal.canine.Dog;
import head_08.animal.feline.Cat;

public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog dog = new Dog();
        Cat cat = new Cat();
        list.add(dog);
        list.add(cat);
    }
}
