public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;
    int quantity=1;

    public abstract String getDescription();
}
