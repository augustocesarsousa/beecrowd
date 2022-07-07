package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1038 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();
        double total;
        switch (codigo) {
            case 1:
                total = quantidade * 4.0;
                break;
            case 2:
                total = quantidade * 4.5;
                break;
            case 3:
                total = quantidade * 5.0;
                break;
            case 4:
                total = quantidade * 2.0;
                break;
            case 5:
                total = quantidade * 1.5;
                break;
            default:
                total = 0;
                break;
        }
        System.err.printf("Total: R$ %.2f\n", total);
        scanner.close();
    }
}
