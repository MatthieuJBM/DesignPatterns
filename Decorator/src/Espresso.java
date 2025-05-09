public class Espresso extends Beverage {
    public Espresso() {
        // To take care of the description, we set this in the constructor for the class.
        // The description instance variable is inherited from Beverage.
        description = "Espresso";
    }

    @Override
    public double cost() {
        // We need to compute the cost of an Espresso.
        // We don't need to worry about adding in condiments in this class, we just need to return the price of an Espresso.
        return 1.99;
    }
}
