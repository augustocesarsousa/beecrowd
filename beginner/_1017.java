package beginner;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _1017 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "US"));
        Scanner scanner = new Scanner(System.in);

        final int LITERS_PER_KM = 12;

        int hours = scanner.nextInt();
        int kilometers = scanner.nextInt();
        double distance = hours * kilometers;
        double averageConsumption = distance / LITERS_PER_KM;

        System.out.println(String.format("%.3f", averageConsumption));
        
        scanner.close();
    }
}
