public class FindMin {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int n = minValue(arr);
        System.out.println("The smallest element in the array is: " + n);
    }

    public static int minValue (int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}
