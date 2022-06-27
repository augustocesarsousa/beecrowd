package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1021 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double bills[] = { 100, 50, 20, 10, 5, 2 };
        double coins[] = { 1, 0.5, 0.25, 0.1, 0.05, 0.01 };
        double amount = scanner.nextDouble();
        int result;

        System.out.println("NOTAS:");

        for (double bill : bills) {
            result = (int) (amount / bill);
            amount %= bill;
            System.out.printf("%d notas(s) de R$ %.2f\n", result, bill);
        }

        System.out.println("MOEDAS:");

        for (double coin : coins) {
            result = (int) (amount / coin);
            amount %= coin;
            System.out.printf("%d moeda(s) de R$ %.2f\n", result, coin);
        }

        scanner.close();
    }
}
