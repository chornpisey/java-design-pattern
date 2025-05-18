package decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee(); // Basic Coffee.
        coffee = new MilkDecorator(coffee); // Add milk
        coffee = new SugarDecorator(coffee); // Add Sugar

        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Cost: $" + coffee.cost());
    }
}
