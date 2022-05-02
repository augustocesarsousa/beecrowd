package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1010 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int numProd1, qtProd1, numProd2, qtProd2;
        double priceProd1, priceProd2, totalPayment;

        numProd1 = scanner.nextInt();
        qtProd1 = scanner.nextInt();
        priceProd1 = scanner.nextDouble();

        numProd2 = scanner.nextInt();
        qtProd2 = scanner.nextInt();
        priceProd2 = scanner.nextDouble();

        totalPayment = qtProd1 * priceProd1 + qtProd2 * priceProd2;

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", totalPayment));

        scanner.close();
    }
}
