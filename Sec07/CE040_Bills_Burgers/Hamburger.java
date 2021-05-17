package CE040_Bills_Burgers;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " +
                meat + ", price is " + price);
    }

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public void addHamburgerAddition1(String add1Name, double add1Price){
        System.out.println("Added " + add1Name + " for an extra " + add1Price);
        addition1Name = add1Name;
        addition1Price = add1Price;
    }

    public void addHamburgerAddition2(String add2Name, double add2Price){
        System.out.println("Added " + add2Name + " for an extra " + add2Price);
        addition2Name = add2Name;
        addition2Price = add2Price;
    }

    public void addHamburgerAddition3(String add3Name, double add3Price){
        System.out.println("Added " + add3Name + " for an extra " + add3Price);
        addition3Name = add3Name;
        addition3Price = add3Price;
    }

    public void addHamburgerAddition4(String add4Name, double add4Price){
        System.out.println("Added " + add4Name + " for an extra " + add4Price);
        addition4Name = add4Name;
        addition4Price = add4Price;
    }

    public double itemizeHamburger() {
        return (price + addition1Price + addition2Price + addition3Price + addition4Price);
    }
}
