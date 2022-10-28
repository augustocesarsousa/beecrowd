package beginner;

import java.util.Scanner;

public class _1116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x, y;
        double result;

        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                result = (double) x / y;
                System.out.println(String.format("%.1f", result));
            }
        }

        scanner.close();
    }
}
