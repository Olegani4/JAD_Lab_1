package lv.tsi.animals;

public class Dog implements Animal, Domestic {

    @Override
    public void sound() {
        System.out.println("Bark");
    }
    private String name;

    Dog(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("Dog's name is " + name);
    }
}