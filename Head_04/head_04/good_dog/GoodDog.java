package head_04.good_dog;

class GoodDog {
    int size;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    void bark(){
        if(size>60)
            System.out.println("Гав Гав!");
        else  if(size>14)
            System.out.println("Вуф Вуф!");
        else
            System.out.println("Тяф Тяф!");
    }
}
