public class SumOfColumn {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        int sum0 = 0, sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum0 += arr[i][0];
            sum1 += arr[i][1];
            sum2 += arr[i][2];
        }
        System.out.println(sum0 + ", " + sum1 + ", " + sum2);
    }
}
