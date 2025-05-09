public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        // We're going to instantiate Mocha with a reference to a Beverage.
        // This class inherits the Beverage instance variable to hold the beverage we are wrapping.
        // We set this instance variable to the object we are wrapping.
        // Here, we're passing the beverage we're wrapping to the decorator's constructor.
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        // Now we need to compute the cost of our beverage with Mocha.
        // First, we delegate the call to the object we're decorating so that it can compute the cost;
        // then, we add the cost of Mocha to the result.
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
