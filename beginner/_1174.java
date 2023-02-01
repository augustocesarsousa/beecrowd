package beginner;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia um vetor A[100]. No final, mostre todas as posições
 * do vetor que armazenam um valor menor ou igual a 10 e o valor armazenado em
 * cada uma das posições.
 * 
 * Entrada
 * A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou
 * negativos.
 * 
 * Saída
 * Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i é a
 * posição do vetor e x é o valor armazenado na posição, com uma casa após o
 * ponto decimal.
 */

public class _1174 {

  public static void main(String[] args) throws IOException {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    double[] vector = new double[100];

    for (int i = 0; i < vector.length; i++) {
      vector[i] = scanner.nextDouble();

      if (vector[i] <= 10) {
        System.out.printf("A[%d] = %.1f%n", i, vector[i]);
      }
    }

    scanner.close();
  }
}
