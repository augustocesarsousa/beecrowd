package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * Leia um valor e faça um programa que coloque o valor lido na primeira posição
 * de um vetor N[10]. Em cada posição subsequente, coloque o dobro do valor da
 * posição anterior. Por exemplo, se o valor lido for 1, os valores do vetor
 * devem ser 1,2,4,8 e assim sucessivamente. Mostre o vetor em seguida.
 * 
 * Entrada
 * A entrada contém um valor inteiro (V<=50).
 * 
 * Saída
 * Para cada posição do vetor, escreva "N[i] = X", onde i é a posição do vetor e
 * X é o valor armazenado na posição i. O primeiro número do vetor N (N[0]) irá
 * receber o valor de V.
 */

public class _1173 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int[] vector = new int[10];
    int n = scanner.nextInt();

    vector[0] = n;

    for (int i = 1; i < vector.length; i++) {
      vector[i] = vector[i - 1] * 2;
    }

    for (int i = 0; i < vector.length; i++) {
      System.out.println("N[" + i + "] = " + vector[i]);
    }
    scanner.close();
  }
}
