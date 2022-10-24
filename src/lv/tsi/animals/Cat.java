package lv.tsi.animals;

public class Cat implements Animal, Domestic {

    @Override
    public void sound() {
        System.out.println("Meow");
    }
    private String name;

    Cat(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("Cat's name is " + name);
    }
}
