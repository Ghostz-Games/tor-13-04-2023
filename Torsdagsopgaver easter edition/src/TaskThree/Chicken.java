package TaskThree;

public class Chicken extends Animal implements Edible {

    @Override
    public String sound() {
        return "Bawk bawk";
    }

    @Override
    public String howToEat() {
        return "Kill and cook";
    }
}
