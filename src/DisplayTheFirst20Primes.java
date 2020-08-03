import java.util.Scanner;

public class DisplayTheFirst20Primes {
    public static void main(String[] args) {
        /*int n;
        int status = 1;
        int num = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n số nguyên tố đầu tiên:");
        n = scanner.nextInt();
        if (n > 0) {
            System.out.println(n+" Số nguyên tố đầu tiên là:");
            System.out.println(2);
        }
        for ( int i = 2 ; i <=n ;  ) {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ ) {
                if ( num % j == 0 ) {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 ) {
                System.out.println(num);
                i ++;
            }
            status = 1;
            num ++;
        }*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your num of primes:");
        int n = scanner.nextInt();
        int count = 0;
        int num = 0;
        while (count < n) {
            num ++;
            if (isPrime(num)){
                count ++;
                System.out.println(num);
            }
        }

    }
    public static boolean isPrime (int number){
        if (number < 2) return false;
        else {
            for (int i = 2; i < Math.sqrt(number); i++){
                if (number % i == 0){
                    return false;
                }
            }return true;
        }
    }
}
