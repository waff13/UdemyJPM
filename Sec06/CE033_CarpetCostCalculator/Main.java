package CE033_CarpetCostCalculator;

public class Main {

    public static void main(String[] args) {
        Floor floorOne = new Floor(-5, 5);
        Floor floorTwo = new Floor(3, 4);
        System.out.println("one = " + floorOne.getArea());
        System.out.println("two = " + floorTwo.getArea());

        Carpet carpetOne = new Carpet(15);
        System.out.println("carpetOne = " + carpetOne.getCost());
        System.out.println("~~~~~~~~~~~~~~~~~~~");

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(4.5, 5.4);
        calculator = new Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());

    }
}
