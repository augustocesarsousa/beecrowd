package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * Leia um valor X. Coloque este valor na primeira posição de um vetor N[100].
 * Em cada posição subsequente de N (1 até 99), coloque a metade do valor
 * armazenado na posição anterior, conforme o exemplo abaixo. Imprima o vetor N.
 * 
 * Entrada
 * A entrada contem um valor de dupla precisão com 4 casas decimais.
 * 
 * Saída
 * Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor
 * e Y é o valor armazenado naquela posição. Cada valor do vetor deve ser
 * apresentado com 4 casas decimais.
 */

public class _1178 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    double[] N = new double[100];
    double T = scanner.nextDouble();

    N[0] = T;
    System.out.printf("N[%d] = %.4f%n", 0, N[0]);

    for (int i = 1; i < N.length; i++) {
      N[i] = N[i - 1] / 2;
      System.out.printf("N[%d] = %.4f%n", i, N[i]);
    }

    scanner.close();
  }
}
