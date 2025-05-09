// We need to be interchangeable with a Beverage, so we extend the Beverage class.
public abstract class CondimentDecorator extends Beverage {
    // Here's the Beverage that each Decorator will be wrapping.
    // Notice we are using the Beverage supertype to refer to the Beverage so the Decorator can wrap any beverage.
    Beverage beverage;

    public abstract String getDescription();
}
