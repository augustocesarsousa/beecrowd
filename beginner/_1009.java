package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1009 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        final double COMMISSION = 0.15;
        String employeeName;
        double baseSalary, totalSalary, totalSales;

        employeeName = scanner.nextLine();
        baseSalary = scanner.nextDouble();
        totalSales = scanner.nextDouble();
        totalSalary = baseSalary + totalSales * COMMISSION;

        System.out.println("TOTAL = R$ " + String.format("%.2f", totalSalary));

        scanner.close();
    }
}
