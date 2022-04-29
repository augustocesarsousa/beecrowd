package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * _1003
 */
public class _1003 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a, b, sum;

        a = scanner.nextInt();
        b = scanner.nextInt();
        sum = a + b;

        System.out.println("SOMA = " + sum);

        scanner.close();
    }
}