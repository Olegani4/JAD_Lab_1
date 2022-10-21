package lv.tsi.animals;

public class Animals {
    public void main() {

        Cat myCat = new Cat("Tiger");
        myCat.sound();
        myCat.printName();

        Dog myDog = new Dog("Charlie");
        myDog.sound();
        myDog.printName();

        Fox myFox = new Fox("Pikachu", false);
        myFox.sound();
        myFox.printName();
        myFox.canAttackHuman();
    }
}