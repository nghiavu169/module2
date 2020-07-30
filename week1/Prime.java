import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        boolean a = false;
        Scanner scanner = new Scanner(System.in);

        while (!a) {
            System.out.print("Enter a number:");
            int number = scanner.nextInt();

            if (number < 2)
                System.out.println(number + " is not a prime");
            else {
                int i = 2;
                boolean check = true;
                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check)
                    System.out.println(number + " is a prime");
                else
                    System.out.println(number + " is not a prime");

                System.out.println("Do you wanna end program?");
                a = scanner.nextBoolean();
            }
        }
    }
}
