package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1067 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }

        scanner.close();
    }
}
