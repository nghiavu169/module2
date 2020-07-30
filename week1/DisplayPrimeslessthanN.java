import java.util.Scanner;

public class DisplayPrimeslessthanN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("display primes less than N: ");
        int N = scanner.nextInt();
        int num = 0;
        while (num < N){
            num ++;
            if (isPrimes(num)){
                System.out.println(num);
            }
        }
    }
    public static boolean isPrimes (int num) {
        if (num < 2) return false;
        else {
            for (int i = 2; i < Math.sqrt(num); i++){
                if (num % i == 0){
                    return false;
                }
            }return true;
        }
    }
}
