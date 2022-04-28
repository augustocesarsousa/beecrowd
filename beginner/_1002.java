package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * _1002
 */
public class _1002 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;
        double raio, area;

        raio = scanner.nextDouble();
        area = PI * Math.pow(raio, 2);

        System.out.printf("A=%.4f\n", area);
        scanner.close();
    }
}