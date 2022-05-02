package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1011 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;
        double radius, volume;

        radius = scanner.nextDouble();
        volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);

        System.out.println("VOLUME = " + String.format("%.3f", volume));

        scanner.close();
    }
}
