package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o
 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
 * o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
 * 
 * Entrada
 * O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3
 * valores, respectivamente dois inteiros e um valor com 2 casas decimais.
 * 
 * Saída
 * A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
 * lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O
 * valor deverá ser apresentado com 2 casas após o ponto.
 */

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
