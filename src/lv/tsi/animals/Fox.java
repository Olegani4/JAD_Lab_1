package lv.tsi.animals;

//public class Fox implements Animal {
public class Fox implements Animal, Wild {

    @Override
    public void sound() {
        System.out.println("Wa-pow");
    }
    private String name;
    private boolean attacksHuman;

    Fox(String name, boolean attacksHuman) {
        this.name = name;
        this.attacksHuman = attacksHuman;
    }

    @Override
    public void printName() {
        System.out.println("Fox's name is " + name);
    }

    @Override
    public void canAttackHuman() {
        if (attacksHuman) {
            System.out.println(name + " is very dangerous for you! Be careful!");
        } else {
            System.out.println("Don't be afraid, " + name + " won't hurt you!");
        }
    }
}