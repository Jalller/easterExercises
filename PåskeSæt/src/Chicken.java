public class Chicken extends Animal implements Edible {


    public Chicken(double weight) {
        super(weight);
    }

    @Override
    public String sound() {
        return "kykylikye";
    }

    @Override
    public String howToEat() {
        return "use knife and fork";
    }
}
