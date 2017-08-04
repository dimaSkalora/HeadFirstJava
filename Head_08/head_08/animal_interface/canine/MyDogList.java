package head_08.animal_interface.canine;

public class MyDogList {
    private Dog[] dogs = new Dog[5];
    private int nextIndex = 0;

    public void add(Dog dog){
        if(nextIndex<dogs.length){
            dogs[nextIndex] = dog;
            System.out.println("Dog добавлен в ячейку "+nextIndex);
            nextIndex++;
        }
    }
}
