package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1117 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double grade = 0d;
        double sum = 0d;

        while (count < 2) {
            grade = scanner.nextDouble();
            if (grade >= 0 && grade <= 10) {
                sum += grade;
                count++;
            } else {
                System.out.println("nota invalida");
            }
        }

        System.out.println("media = " + String.format("%.2f", sum / 2));

        scanner.close();
    }
}
