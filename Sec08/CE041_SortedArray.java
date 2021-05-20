import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {

        int[] array = getIntegers(5);
        sortIntegers(array);
        printArray(array);
    }

    public static int[] getIntegers(int size){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Please input " + size + " numbers");
        int input;

        for (int i = 0; i < array.length; i++) {
            input = scanner.nextInt();
            array[i] = input;
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int temp;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < (array.length - 1); i++) {
                if (array[i] < array [i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}
