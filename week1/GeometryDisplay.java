import java.util.Scanner;

public class GeometryDisplay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 2:
                    for (int i = 0; i < 5; i++) {
                        System.out.print("\n");
                        for (int j = 0; j < 5; j++) {
                            System.out.print(" * ");
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 5; i++) {
                        System.out.print("\n");
                        for (int j = 0; j < i + 1; j++) {
                            System.out.print(" * ");
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 3; i++) {
                        System.out.print("\n");
                        for (int j = 0; j < 5; j++) {
                            System.out.print(" * ");
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
