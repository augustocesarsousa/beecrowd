package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1060 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < 6; i++) {
            if (scanner.nextDouble() >= 0) {
                count++;
            }
        }

        System.out.println(count + " valores positivos");

        scanner.close();
    }
}
