package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1036 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input[] = scanner.nextLine().split(" ");
        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);
        double c = Double.parseDouble(input[2]);
        double delta = (b * b) - (4 * a * c);
        double r1, r2;

        if (delta < 0 || a == 0) {
            System.out.println("Impossivel calcular");
            scanner.close();
            return;
        } else {
            r1 = (-b + Math.sqrt(delta)) / (2 * a);
            r2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }

        scanner.close();
    }
}