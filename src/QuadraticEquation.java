import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c, delta, root1, root2;

    public QuadraticEquation(){

    }

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDelta (){
        return this.delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1 (){
        return this.root1 = (-this.b + Math.sqrt(this.delta)) / 2 * this.a;
    }

    public double getRoot2 (){
        return this.root2 = (-this.b - Math.sqrt(this.delta)) / 2 * this.a;
    }

    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a, b, c:");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
            double delta = quadraticEquation.getDelta();
            System.out.println("Delta = " + delta);
            double x1 = quadraticEquation.getRoot1();
            double x2 = quadraticEquation.getRoot2();
            if (delta > 0) {
                System.out.println("PT có 2 nghiệm: " + x1 + " , " + x2);
            }
            else if (delta == 0) {
                System.out.println("PT có 1 nghiệm kép: " + x1);
            }
            else {
                System.out.println("PT vô nghiệm");
            }

        }
    }
}
