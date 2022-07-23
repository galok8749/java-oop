package interfaces;

public class Cat extends Mammal implements Herbivore{
    @Override
    public void eatPlant() {
        System.out.println("Cat is eating Animal");
    }
}
