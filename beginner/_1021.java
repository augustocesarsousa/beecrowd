package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1021 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int[] bills = new int[] { 100, 50, 20, 10, 5, 2 };
        double[] coins = new double[] { 1.00, 0.50, 0.25, 0.10, 0.05, 0.01 };

        double amount = scanner.nextDouble();

        System.out.println("NOTAS:");

        for (int bill : bills) {
            double value = amount / bill;
            amount = amount % bill;
            System.out.println((int) value + " nota(s) de R$ " + bill + ".00");
        }

        System.out.println("MOEDAS:");

        for (double coin : coins) {
            double value = amount / coin;
            amount = amount % coin;
            System.out.println((int) value + " moeda(s) de R$ " + String.format("%.2f", coin));
        }

        scanner.close();
    }
}
