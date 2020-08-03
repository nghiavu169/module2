import java.util.Arrays;
import java.util.Scanner;

public class MergingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size of array1: ");
        int a1 = scanner.nextInt();
        System.out.print("Size of array2: ");
        int a2 = scanner.nextInt();

        int a = a1 + a2;
        System.out.println("Size of array: " + a);


        int[] array1 = new int[a1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 9);
        }


        int[] array2 = new int[a2];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 9);
        }

        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            if (i < array1.length){
                array[i] = array1[i];
            } else
            array[i] = array2[i - array1.length];
        }

        System.out.println("Two array that to be merged: " + Arrays.toString(array1) + " and " + Arrays.toString(array2));
        System.out.println("Your merging array is: " + Arrays.toString(array));
    }
}
