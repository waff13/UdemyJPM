package CE040_Bills_Burgers;

public class HealthyBurger extends Hamburger{
    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public void addHealthyAddition1(String extra1Name, double extra1Price) {
        System.out.println("Added " + extra1Name + " for an extra " + extra1Price);
        healthyExtra1Name = extra1Name;
        healthyExtra1Price = extra1Price;
    }

    public void addHealthyAddition2(String extra2Name, double extra2Price) {
        System.out.println("Added " + extra2Name + " for an extra " + extra2Price);
        healthyExtra2Name = extra2Name;
        healthyExtra2Price = extra2Price;
    }

    @Override
    public double itemizeHamburger() {
        return (super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price);
    }
}
