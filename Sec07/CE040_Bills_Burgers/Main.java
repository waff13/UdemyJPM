package CE040_Bills_Burgers;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
//        System.out.println(hamburger.getName() + " hamburger on a " + hamburger.getBreadRollType() + " roll with " +
//                hamburger.getMeat() + ", price is " + hamburger.getPrice());
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total hamburger price is " + hamburger.itemizeHamburger());
        System.out.println("");
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthyAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition2("Lentils", 3.41);
        System.out.println("Total Healthy burger price is " + healthyBurger.itemizeHamburger());
        System.out.println("");
        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition1("Something special", 50.50);
        System.out.println("Total Deluxe burger price is " + db.itemizeHamburger());
    }
}
