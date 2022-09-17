package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1070 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int x = scanner.nextInt();

        while (i < 6) {
            if (x % 2 != 0) {
                System.out.println(x);
                i++;
            }
            x++;
        }

        scanner.close();
    }
}
