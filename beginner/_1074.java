package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1074 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        String text;

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            if (number == 0) {
                System.out.println("NULL");
            } else if (number % 2 == 0) {
                text = "EVEN";
                if (number > 0) {
                    text += " POSITIVE";
                } else {
                    text += " NEGATIVE";
                }
                System.out.println(text);
            } else {
                text = "ODD";
                if (number > 0) {
                    text += " POSITIVE";
                } else {
                    text += " NEGATIVE";
                }
                System.out.println(text);
            }
        }

        scanner.close();
    }
}
