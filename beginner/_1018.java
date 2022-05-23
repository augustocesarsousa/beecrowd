package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1018 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int[] bills = new int[] { 100, 50, 20, 10, 5, 2, 1 };

        int amount = scanner.nextInt();

        System.out.println(amount);

        for (int bill : bills) {
            int value = amount / bill;
            amount = amount % bill;
            System.out.println(value + " nota(s) de R$ " + bill + ",00");
        }

        scanner.close();
    }

}