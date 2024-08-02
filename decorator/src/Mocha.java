class Mocha extends Decorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    public double cost() {
        return beverage.cost() + 0.30;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}