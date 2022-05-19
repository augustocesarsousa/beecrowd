package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1016 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        final int KM_PER_MINUTE = 2;
        int km = scanner.nextInt();
        int minutes = km * KM_PER_MINUTE;

        System.out.println(minutes + " minutos");
        scanner.close();
    }
}
