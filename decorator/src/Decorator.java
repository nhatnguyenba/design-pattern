class Decorator implements Beverage {
    protected Beverage beverage;

    public Decorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription();
    }
}