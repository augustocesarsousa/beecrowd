package beginner;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _1037 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "US"));
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        if (number < 0.0 | number > 100.0) {
            System.out.println("Fora de intervalo");
        } else if (number <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (number <= 50.0) {
            System.out.println("Intervalo (25,50]");
        } else if (number <= 75.0) {
            System.out.println("Intervalo (50,75]");
        } else if (number <= 100.0) {
            System.out.println("Intervalo (75,100]");
        }
        scanner.close();
    }
}
