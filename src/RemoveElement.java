
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 2};

        System.out.print("Enter Element to be deleted: ");
        int element = in.nextInt();

        for(int i = 0; i < array.length; i++){
            if(array[i] == element){
                System.arraycopy(array, i + 1, array, i, array.length - 1 - i);
                array[array.length-1]=0;
            }
        }

        System.out.println("Array elements after deletion:");
        for (int j : array) {
            System.out.print(" " + j);
        }
    }
}
