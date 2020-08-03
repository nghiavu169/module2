import java.util.Scanner;

public class LoanInterest {
    public static void main(String[] args) {
        double money;
        int month;
        double interest_rate;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số tiền gửi:");
        money = scanner.nextDouble();
        System.out.println("Nhập số tháng gửi:");
        month = scanner.nextInt();
        System.out.println("Nhập lãi suất:");
        interest_rate = scanner.nextDouble();

        double total_interest = 0;
        for (int i = 0; i < month; i++) {
            total_interest += money * (interest_rate / 100 / 12) * month;
        }

        System.out.println("Số tiền lãi: " + total_interest);
    }
}
