import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        final double converter = 23181;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền cần chuyển đổi:\n$" );
        double Usd = scanner.nextInt();
        double Vnd = converter * Usd;
        System.out.println(Vnd + " Đồng");
    }
}
