public class App {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage milkEspresso = new Milk(new Espresso());
        System.out.println(milkEspresso.getDescription() + " $" + milkEspresso.cost());

        Beverage mochaMilkEspresso = new Mocha(new Milk(new Espresso()));
        System.out.println(mochaMilkEspresso.getDescription() + " $" + mochaMilkEspresso.cost());
    }
}
