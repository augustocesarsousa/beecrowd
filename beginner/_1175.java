package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro
 * elemento com o último, o segundo elemento com o penúltimo, etc., até trocar o
 * 10º com o 11º. Mostre o vetor modificado.
 * 
 * Entrada
 * A entrada contém 20 valores inteiros, positivos ou negativos.
 * 
 * Saída
 * Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor
 * e Y é o valor armazenado naquela posição.
 */

public class _1175 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int[] vector = new int[20];
    int temp;

    for (int i = 0; i < vector.length; i++) {
      vector[i] = scanner.nextInt();
    }

    for (int i = 0; i < (vector.length / 2); i++) {
      temp = vector[i];
      vector[i] = vector[vector.length - 1 - i];
      vector[vector.length - 1 - i] = temp;
    }

    for (int i = 0; i < vector.length; i++) {
      System.out.printf("N[%d] = %d%n", i, vector[i]);
    }

    scanner.close();
  }
}
