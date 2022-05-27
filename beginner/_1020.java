package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1020 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        int years = value / 365;
        value = value % 365;

        int months = value / 30;
        value = value % 30;

        int days = value;

        System.out.printf("%d ano(s)\n", years);
        System.out.printf("%d mes(es)\n", months);
        System.out.printf("%d dia(s)\n", days);

        scanner.close();
    }
}
