class Milk extends Decorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    public double cost() {
        return beverage.cost() + 0.20;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}