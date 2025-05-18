package decorator;

// ConcreteComponent
public class BasicCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Basic coffee";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
