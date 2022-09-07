package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1066 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int negative = 0, odd = 0, pair = 0, positive = 0, number;

        for (int i = 0; i < 5; i++) {
            number = scanner.nextInt();
            if (number % 2 == 0) {
                pair++;
            }
            if (number % 2 != 0) {
                odd++;
            }
            if (number > 0) {
                positive++;
            }
            if (number < 0) {
                negative++;
            }
        }

        System.out.println(pair + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(positive + " valor(es) positivo(s)");
        System.out.println(negative + " valor(es) negativo(s)");

        scanner.close();
    }
}
