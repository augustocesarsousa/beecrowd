package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1071 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int min, max;
        int sum = 0;

        if (x > y) {
            min = y;
            max = x;
        } else {
            min = x;
            max = y;
        }

        for (int i = min + 1; i < max; i++) {
            if (i % 2 != 0)
                sum += i;
        }

        System.out.println(sum);
        scanner.close();
    }
}
