package beginner;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class _1064 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        int count = 0;
        double average = 0, number;

        for (int i = 0; i < 6; i++) {
            number = scanner.nextDouble();
            if (number >= 0) {
                count++;
                average += number;
            }
        }

        System.out.println(count + " valores positivos");
        System.out.println(df.format(average / count));

        scanner.close();
    }
}
