import java.util.Scanner;

public class CE042b_MinimumElement {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the size of array? \r");
        int size = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        return size;
    }

    private static int[] readElements(int size) {
        System.out.println("Please input " + size + "integers: \r");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        return array;
    }
    
    private static int findMin(int[] array) {
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }
}
