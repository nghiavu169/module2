
import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        System.out.println("Add position:");
        int index = scanner.nextInt();
        System.out.println("Enter Element to be added:");
        int a = scanner.nextInt();

        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i-1];
        }
        array[index] = a;
        System.out.println(Arrays.toString(array));
    }
}
