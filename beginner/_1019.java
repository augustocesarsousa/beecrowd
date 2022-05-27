package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1019 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        int hours = value / (60 * 60);
        value = value % (60 * 60);

        int minutes = value / 60;
        value = value % 60;

        int seconds = value;

        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);

        scanner.close();
    }
}