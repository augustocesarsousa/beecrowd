package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1073 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i + "^2 = " + (int) Math.pow(i, 2));
        }

        scanner.close();
    }
}
