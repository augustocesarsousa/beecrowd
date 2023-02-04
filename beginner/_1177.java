package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * Faça um programa que leia um valor T e preencha um vetor N[1000] com a
 * sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo.
 * Imprima o vetor N.
 * 
 * Entrada
 * A entrada contém um valor inteiro T (2 ≤ T ≤ 50).
 * 
 * Saída
 * Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do vetor e
 * x é o valor armazenado naquela posição.
 */

public class _1177 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int[] N = new int[1000];
    int T = scanner.nextInt();

    for (int i = 0, j = 0; i < N.length; i++, j++) {
      N[i] = j == T ? j = 0 : j;
      System.out.printf("N[%d] = %d%n", i, N[i]);
    }

    scanner.close();
  }
}
