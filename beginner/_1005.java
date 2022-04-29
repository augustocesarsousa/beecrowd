package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * _1005
 */
public class _1005 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        final double p1 = 3.5;
        final double p2 = 7.5;
        double a, b, avg;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        avg = (a * p1 + b * p2) / (p1 + p2);

        System.out.println("MEDIA = " + String.format("%.5f", avg));

        scanner.close();
    }

}