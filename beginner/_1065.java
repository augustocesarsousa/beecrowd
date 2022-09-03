package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1065 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < 5; i++) {
            if (scanner.nextDouble() % 2 == 0) {
                count++;
            }
        }

        System.out.println(count + " valores pares");

        scanner.close();
    }
}
