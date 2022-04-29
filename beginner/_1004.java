package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * _1004
 */
public class _1004 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a, b, prod;

        a = scanner.nextInt();
        b = scanner.nextInt();
        prod = a * b;

        System.out.println("PROD = " + prod);

        scanner.close();
    }
}