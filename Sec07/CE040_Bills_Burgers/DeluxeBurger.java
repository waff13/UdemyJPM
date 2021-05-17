package CE040_Bills_Burgers;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String add1Name, double add1Price){
        System.out.println("Cannot add additional items to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition2(String add2Name, double add2Price){
        System.out.println("Cannot add additional items to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition3(String add3Name, double add3Price){
        System.out.println("Cannot add additional items to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition4(String add4Name, double add4Price){
        System.out.println("Cannot add additional items to a deluxe burger.");
    }
}
